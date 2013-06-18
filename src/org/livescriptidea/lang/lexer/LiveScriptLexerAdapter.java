package org.livescriptidea.lang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Adapter for the LiveScript flex lexer
 *
 * @author Rack Lin
 * @since 0.1.0
 */
public class LiveScriptLexerAdapter extends FlexAdapter {

  public LiveScriptLexerAdapter() {
    super(new LiveScriptLexer((Reader) null));
  }

  /**
   * This start implementation first advances the lexer from the start of the file to the start offset, so
   * that the complex state stack is reconstructed.
   *
   * @param buffer The content to lex
   * @param startOffset The start offset
   * @param endOffset The end offset
   * @param initialState The state to start with
   */
  public void start(final CharSequence buffer, int startOffset, int endOffset, final int initialState) {
    if (startOffset != 0) {
      super.start(buffer, 0, startOffset, initialState);

      while (getTokenType() != null) {
        advance();
      }
    }

    super.start(buffer, startOffset, endOffset, getState());
  }

}
