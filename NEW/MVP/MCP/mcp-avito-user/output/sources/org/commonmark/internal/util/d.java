package org.commonmark.internal.util;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Parsing.java */
/* loaded from: classes7.dex */
public class d {
    public static boolean a(int i12, CharSequence charSequence) {
        if (i12 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i12);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c12, int i12, int i13, CharSequence charSequence) {
        while (i12 < i13) {
            if (charSequence.charAt(i12) != c12) {
                return i12;
            }
            i12++;
        }
        return i13;
    }

    public static int c(int i12, int i13, CharSequence charSequence) {
        while (i12 < i13) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i12;
            }
            i12++;
        }
        return i13;
    }
}
