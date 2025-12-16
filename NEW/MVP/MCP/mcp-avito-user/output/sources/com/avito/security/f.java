package com.avito.security;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class f extends e {
    public static char a(char[] cArr) {
        y0.b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final <T extends Comparable<? super T>> T[] b(T[] tArr) {
        y0.b(tArr, "$this$sortedArray");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        y0.a((Object) objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        if (tArr2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        e.b(tArr2);
        return tArr2;
    }

    public static <T> T c(T[] tArr) {
        y0.b(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <A extends Appendable> A a(byte[] bArr, A a12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0<? super Byte, ? extends CharSequence> r0Var) throws IOException {
        y0.b(bArr, "$this$joinTo");
        y0.b(a12, "buffer");
        y0.b(charSequence, "separator");
        y0.b(charSequence2, "prefix");
        y0.b(charSequence3, "postfix");
        y0.b(charSequence4, "truncated");
        a12.append(charSequence2);
        int i13 = 0;
        for (byte b12 : bArr) {
            i13++;
            if (i13 > 1) {
                a12.append(charSequence);
            }
            if (i12 >= 0 && i13 > i12) {
                break;
            }
            a12.append(r0Var != null ? r0Var.a(Byte.valueOf(b12)) : String.valueOf((int) b12));
        }
        if (i12 >= 0 && i13 > i12) {
            a12.append(charSequence4);
        }
        a12.append(charSequence3);
        return a12;
    }

    public static final <T> T[] b(T[] tArr, Comparator<? super T> comparator) {
        y0.b(tArr, "$this$sortedArrayWith");
        y0.b(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        y0.a((Object) tArr2, "java.util.Arrays.copyOf(this, size)");
        e.a(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> c(T[] tArr, Comparator<? super T> comparator) {
        y0.b(tArr, "$this$sortedWith");
        y0.b(comparator, "comparator");
        return e.a(b(tArr, comparator));
    }

    public static final <A extends Appendable> A a(int[] iArr, A a12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0<? super Integer, ? extends CharSequence> r0Var) throws IOException {
        y0.b(iArr, "$this$joinTo");
        y0.b(a12, "buffer");
        y0.b(charSequence, "separator");
        y0.b(charSequence2, "prefix");
        y0.b(charSequence3, "postfix");
        y0.b(charSequence4, "truncated");
        a12.append(charSequence2);
        int i13 = 0;
        for (int i14 : iArr) {
            i13++;
            if (i13 > 1) {
                a12.append(charSequence);
            }
            if (i12 >= 0 && i13 > i12) {
                break;
            }
            a12.append(r0Var != null ? r0Var.a(Integer.valueOf(i14)) : String.valueOf(i14));
        }
        if (i12 >= 0 && i13 > i12) {
            a12.append(charSequence4);
        }
        a12.append(charSequence3);
        return a12;
    }

    public static final String a(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0<? super Byte, ? extends CharSequence> r0Var) {
        y0.b(bArr, "$this$joinToString");
        y0.b(charSequence, "separator");
        y0.b(charSequence2, "prefix");
        y0.b(charSequence3, "postfix");
        y0.b(charSequence4, "truncated");
        String string = ((StringBuilder) a(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i12, charSequence4, r0Var)).toString();
        y0.a((Object) string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String a(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0 r0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i13 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i13 & 4) == 0 ? charSequence3 : "";
        if ((i13 & 8) != 0) {
            i12 = -1;
        }
        int i14 = i12;
        if ((i13 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i13 & 32) != 0) {
            r0Var = null;
        }
        return a(bArr, charSequence, charSequence5, charSequence6, i14, charSequence7, (r0<? super Byte, ? extends CharSequence>) r0Var);
    }

    public static final String a(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0<? super Integer, ? extends CharSequence> r0Var) {
        y0.b(iArr, "$this$joinToString");
        y0.b(charSequence, "separator");
        y0.b(charSequence2, "prefix");
        y0.b(charSequence3, "postfix");
        y0.b(charSequence4, "truncated");
        String string = ((StringBuilder) a(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i12, charSequence4, r0Var)).toString();
        y0.a((Object) string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String a(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, CharSequence charSequence4, r0 r0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i13 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i13 & 4) == 0 ? charSequence3 : "";
        if ((i13 & 8) != 0) {
            i12 = -1;
        }
        int i14 = i12;
        if ((i13 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i13 & 32) != 0) {
            r0Var = null;
        }
        return a(iArr, charSequence, charSequence5, charSequence6, i14, charSequence7, (r0<? super Integer, ? extends CharSequence>) r0Var);
    }

    public static <T extends Comparable<? super T>> List<T> a(T[] tArr) {
        y0.b(tArr, "$this$sorted");
        return e.a(b((Comparable[]) tArr));
    }
}
