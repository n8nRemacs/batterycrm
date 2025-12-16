package defpackage;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ssi {
    public static final void a(Spannable spannable) {
        Object[] spans;
        int spanStart;
        int spanEnd;
        int length;
        try {
            spans = spannable.getSpans(0, spannable.length(), Object.class);
        } catch (Throwable unused) {
            spans = null;
        }
        if (spans != null) {
            for (Object obj : spans) {
                if (obj == null || (obj instanceof NoCopySpan) || (spanStart = spannable.getSpanStart(obj)) < 0 || (spanEnd = spannable.getSpanEnd(obj)) < 0 || spanEnd < spanStart || spanStart > (length = spannable.length()) || spanEnd > length) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static boolean b(String str, String str2) {
        return (l8g.c(str) || l8g.c(str2) || !l8g.a(str, str2)) ? false : true;
    }

    public static w10 c(si9 si9Var, String str) {
        if (si9Var == null) {
            return null;
        }
        jdc jdcVar = si9Var.x0;
        if (!si9Var.t()) {
            return null;
        }
        for (int i = 0; i < jdcVar.p(); i++) {
            w10 w10VarO = jdcVar.o(i);
            if (l8g.a(w10VarO.r, str)) {
                return w10VarO;
            }
        }
        return null;
    }

    public static byte[] d(w10 w10Var) {
        k10 k10Var;
        boolean zF = w10Var.f();
        o10 o10Var = w10Var.g;
        f10 f10Var = w10Var.j;
        if (zF) {
            return w10Var.b.X;
        }
        if (w10Var.h()) {
            return w10Var.d.k;
        }
        if (g(w10Var)) {
            return f10Var.d.b.X;
        }
        if (h(w10Var)) {
            return f10Var.d.d.k;
        }
        if (!w10Var.g() || (k10Var = o10Var.f) == null) {
            return null;
        }
        return k10Var.X;
    }

    public static String e(f10 f10Var) {
        int iLastIndexOf;
        if (f10Var == null) {
            return null;
        }
        String str = f10Var.c;
        if (l8g.c(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1 || iLastIndexOf >= str.length()) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static boolean f(si9 si9Var) {
        boolean zT = si9Var.t();
        jdc jdcVar = si9Var.x0;
        return zT && jdcVar.o(0).b() && l8g.d(jdcVar.o(0).e.f);
    }

    public static boolean g(w10 w10Var) {
        w10 w10Var2;
        if (w10Var != null) {
            f10 f10Var = w10Var.j;
            if (w10Var.a == s10.t0 && f10Var != null && (w10Var2 = f10Var.d) != null && w10Var2.f() && !f10Var.d.b.o) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(w10 w10Var) {
        f10 f10Var;
        w10 w10Var2;
        return (w10Var == null || w10Var.a != s10.t0 || (f10Var = w10Var.j) == null || (w10Var2 = f10Var.d) == null || !w10Var2.h()) ? false : true;
    }

    public static final boolean i(char c) {
        return c == ' ' || c == '\t' || c == 160;
    }

    public static void j(Spannable spannable, String str, int i, int i2, int i3, i62 i62Var, int i4) {
        boolean z = (i4 & 16) != 0;
        if ((i4 & 32) != 0) {
            i62Var = null;
        }
        b88 b88Var = new b88(str, i3, z);
        b88Var.d = i62Var;
        usi.e(spannable, b88Var, i, i2, 33);
    }

    public static final void k(Spannable spannable, int i, int i2) {
        ep8[] ep8VarArr = (ep8[]) spannable.getSpans(i, i2, ep8.class);
        if (ep8VarArr.length == 0) {
            return;
        }
        for (ep8 ep8Var : ep8VarArr) {
            n(spannable, ep8Var, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(defpackage.w10 r3, defpackage.eh9 r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L5
        L3:
            r3 = r0
            goto L21
        L5:
            f10 r1 = r3.j
            boolean r2 = r3.f()
            if (r2 == 0) goto Le
            goto L21
        Le:
            s10 r3 = r3.a
            s10 r2 = defpackage.s10.t0
            if (r3 == r2) goto L15
            goto L3
        L15:
            if (r1 == 0) goto L3
            w10 r3 = r1.d
            if (r3 == 0) goto L3
            boolean r1 = r3.f()
            if (r1 == 0) goto L3
        L21:
            if (r3 == 0) goto L39
            boolean r0 = r3.f()
            if (r0 == 0) goto L39
            boolean r0 = r3.z
            if (r0 == 0) goto L39
            boolean r3 = r3.y
            if (r3 != 0) goto L39
            ku3 r3 = r4.b
            boolean r3 = r3.X
            if (r3 != 0) goto L39
            r3 = 1
            return r3
        L39:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssi.l(w10, eh9):boolean");
    }

    public static final void m(Editable editable, int i, int i2, boolean z, ep8 ep8Var) {
        Class<?> cls = ep8Var.getClass();
        String string = editable.toString();
        List<ep8> listD = ys.D(editable.getSpans(i, i2, cls));
        for (ep8 ep8Var2 : listD) {
            if (editable.getSpanStart(ep8Var2) <= i && editable.getSpanEnd(ep8Var2) >= i2) {
                n(editable, ep8Var2, i, i2);
                return;
            }
        }
        if (!z) {
            for (int i3 = i; i3 < i2; i3++) {
                if (!ozi.c(string.charAt(i3))) {
                    for (Object obj : listD) {
                        int spanStart = editable.getSpanStart(obj);
                        if (i3 > editable.getSpanEnd(obj) || spanStart > i3) {
                        }
                    }
                }
            }
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                n(editable, (ep8) it.next(), i, i2);
            }
            return;
        }
        usi.e(editable, ep8Var, i, i2, 33);
    }

    public static final void n(Spannable spannable, ep8 ep8Var, int i, int i2) {
        int spanStart = spannable.getSpanStart(ep8Var);
        if (spanStart == -1) {
            return;
        }
        int spanEnd = spannable.getSpanEnd(ep8Var);
        if (spanStart >= i && spanEnd <= i2) {
            spannable.removeSpan(ep8Var);
            return;
        }
        int spanFlags = spannable.getSpanFlags(ep8Var);
        spannable.removeSpan(ep8Var);
        if (spanStart < i) {
            spannable.setSpan(ep8Var.copy(), spanStart, i, spanFlags);
        }
        if (spanEnd > i2) {
            spannable.setSpan(ep8Var.copy(), i2, spanEnd, spanFlags);
        }
    }

    public static final void o(Spannable spannable, Class cls, int i, int i2) {
        try {
            Object[] spans = spannable.getSpans(i, i2, cls);
            for (Object obj : spans) {
                spannable.removeSpan(obj);
            }
        } catch (Throwable unused) {
        }
    }

    public static CharSequence p(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            if (charSequence instanceof m7f) {
                return (SpannableString) charSequence;
            }
            int i = m7f.a;
            return uha.z(charSequence);
        } catch (Throwable th) {
            wqi.e("Markdown", "fail to make safeCopy of " + ((Object) charSequence), th);
            return charSequence;
        }
    }

    public static final void q(jac jacVar, WorkDatabase workDatabase, qo3 qo3Var, List list, r5i r5iVar, Set set) throws Throwable {
        String str = r5iVar.a;
        r5i r5iVarP = workDatabase.x().p(str);
        if (r5iVarP == null) {
            throw new IllegalArgumentException(ho7.i("Worker with ", str, " doesn't exist"));
        }
        if (r5iVarP.b.a()) {
            return;
        }
        if (r5iVarP.d() ^ r5iVar.d()) {
            StringBuilder sb = new StringBuilder("Can't update ");
            sb.append(r5iVarP.d() ? "Periodic" : "OneTime");
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(ho7.l(sb, r5iVar.d() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
        }
        boolean zD = jacVar.d(str);
        if (!zD) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((k0e) it.next()).c(str);
            }
        }
        workDatabase.p(new j99(workDatabase, r5iVar, r5iVarP, list, str, set, zD));
        if (zD) {
            return;
        }
        v0e.a(qo3Var, workDatabase, list);
    }
}
