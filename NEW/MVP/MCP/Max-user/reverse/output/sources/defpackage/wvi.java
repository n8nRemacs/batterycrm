package defpackage;

import android.text.Editable;

/* loaded from: classes.dex */
public abstract class wvi {
    public static void a(Editable editable) {
        int i;
        int iC;
        for (luc lucVar : (luc[]) editable.getSpans(0, editable.length(), luc.class)) {
            int spanStart = editable.getSpanStart(lucVar);
            int spanEnd = editable.getSpanEnd(lucVar);
            if (spanStart <= 0 || editable.charAt(spanStart - 1) == '\n') {
                i = spanStart;
            } else {
                int iG = vmf.G(editable, '\n', spanStart, 4);
                i = iG == -1 ? 0 : iG + 1;
            }
            if (spanEnd < 0 || spanEnd >= editable.length() || editable.charAt(spanEnd) == '\n') {
                iC = spanEnd;
            } else {
                iC = vmf.C(editable, '\n', spanEnd, 4);
                if (iC == -1) {
                    iC = editable.length();
                }
            }
            if (i <= iC && (spanStart != i || spanEnd != iC)) {
                int spanFlags = editable.getSpanFlags(lucVar);
                editable.removeSpan(lucVar);
                editable.setSpan(lucVar, i, iC, spanFlags);
            }
        }
    }

    public static final zy7 b(zy7 zy7Var) {
        return zy7Var.d().c() ? zy7Var : new cqa(zy7Var);
    }

    public static void c(Editable editable) {
        luc[] lucVarArr = (luc[]) editable.getSpans(0, editable.length(), luc.class);
        for (int length = lucVarArr.length - 1; length > 0; length--) {
            luc lucVar = lucVarArr[length];
            int spanStart = editable.getSpanStart(lucVar);
            int spanEnd = editable.getSpanEnd(lucVar);
            int i = length - 1;
            while (true) {
                if (-1 < i) {
                    luc lucVar2 = lucVarArr[i];
                    int spanStart2 = editable.getSpanStart(lucVar2);
                    int spanEnd2 = editable.getSpanEnd(lucVar2);
                    if (Math.max(spanStart, spanStart2) <= Math.min(spanEnd, spanEnd2)) {
                        int spanFlags = editable.getSpanFlags(lucVar);
                        editable.removeSpan(lucVar);
                        editable.removeSpan(lucVar2);
                        editable.setSpan(lucVar2, Math.min(spanStart, spanStart2), Math.max(spanEnd, spanEnd2), spanFlags);
                        break;
                    }
                    i--;
                }
            }
        }
    }

    public static void d(Editable editable) {
        try {
            luc[] lucVarArr = (luc[]) editable.getSpans(0, editable.length(), luc.class);
            for (int length = lucVarArr.length - 1; -1 < length; length--) {
                luc lucVar = lucVarArr[length];
                if (editable.getSpanStart(lucVar) == editable.getSpanEnd(lucVar)) {
                    editable.removeSpan(lucVar);
                }
            }
            a(editable);
            c(editable);
        } catch (Throwable unused) {
        }
    }
}
