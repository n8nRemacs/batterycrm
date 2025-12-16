package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;

/* loaded from: classes2.dex */
public final class wc5 implements lb5 {
    public final Context a;
    public final ac5 b;
    public final a84 c;
    public final bwf d;
    public final dc5 e;
    public final bwf f;
    public final bwf g;

    public wc5(a84 a84Var, ac5 ac5Var, k18 k18Var, Context context) {
        this.a = context;
        this.b = ac5Var;
        this.c = a84Var;
        final int i = 0;
        this.d = new bwf(new cm6(this) { // from class: vc5
            public final /* synthetic */ wc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                mc5 mc5Var;
                switch (i) {
                    case 0:
                        try {
                            mc5Var = new mc5(this.b.a.getResources());
                        } catch (Exception unused) {
                            mc5Var = null;
                        }
                        return new rb5(mc5Var);
                    default:
                        wc5 wc5Var = this.b;
                        return new xb5((rb5) wc5Var.d.getValue(), wc5Var.b, wc5Var.e, wc5Var.f);
                }
            }
        });
        this.e = new dc5(context);
        this.f = new bwf(new qn2(this, 9, k18Var));
        final int i2 = 1;
        this.g = new bwf(new cm6(this) { // from class: vc5
            public final /* synthetic */ wc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                mc5 mc5Var;
                switch (i2) {
                    case 0:
                        try {
                            mc5Var = new mc5(this.b.a.getResources());
                        } catch (Exception unused) {
                            mc5Var = null;
                        }
                        return new rb5(mc5Var);
                    default:
                        wc5 wc5Var = this.b;
                        return new xb5((rb5) wc5Var.d.getValue(), wc5Var.b, wc5Var.e, wc5Var.f);
                }
            }
        });
    }

    @Override // defpackage.lb5
    public final x26 a() {
        return ((cc5) this.f.getValue()).e;
    }

    @Override // defpackage.lb5
    public final void b(Activity activity) {
        ((cc5) this.f.getValue()).b(activity);
    }

    public final o8f c(String str) {
        nc5 nc5VarA = ((rb5) this.d.getValue()).a(str, 0, str.length());
        if (nc5VarA == null) {
            return null;
        }
        dc5 dc5Var = this.e;
        dc5Var.getClass();
        return new o8f(nc5VarA, kti.d(28 * vw4.d().getDisplayMetrics().density), new ka5(this.b, dc5Var, (cc5) this.f.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.lang.CharSequence r17) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc5.d(java.lang.CharSequence):java.util.List");
    }

    public final Spannable e(int i, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        xb5 xb5Var = (xb5) this.g.getValue();
        xb5Var.getClass();
        Spannable spannableNewSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        zkb zkbVar = new zkb(spannableNewSpannable);
        i7f[] i7fVarArr = (i7f[]) zkbVar.b;
        rb5 rb5Var = xb5Var.a;
        int iB = 0;
        while (iB < length) {
            int iM = zkbVar.m(iB);
            i7f i7fVar = iM < 0 ? null : i7fVarArr[iM];
            if (i7fVar == null) {
                int iM2 = zkbVar.m(iB);
                int i2 = (iM2 < 0 || iM2 > i7fVarArr.length + (-1)) ? -1 : i7fVarArr[iM2 + 1].a;
                if (i2 == -1) {
                    i2 = length;
                }
                nc5 nc5VarA = rb5Var.a(spannableNewSpannable, iB, i2);
                if (nc5VarA != null) {
                    ac5 ac5Var = xb5Var.b;
                    ka5 ka5Var = new ka5(ac5Var, xb5Var.c, (cc5) xb5Var.d.getValue());
                    yk8 yk8Var = ac5Var.c;
                    r7f r7fVar = (r7f) yk8Var.c(nc5VarA);
                    if (r7fVar == null) {
                        r7fVar = new r7f(0);
                        yk8Var.d(nc5VarA, r7fVar);
                    }
                    o8f o8fVar = (o8f) r7fVar.b(i);
                    if (o8fVar == null) {
                        o8fVar = new o8f(nc5VarA, i, ka5Var);
                        r7fVar.c(i, o8fVar);
                    }
                    spannableNewSpannable.setSpan(new yb5(o8fVar), iB, nc5VarA.b() + iB, 33);
                    iB += nc5VarA.b();
                } else {
                    iB++;
                }
            } else {
                iB = i7fVar.b;
            }
        }
        return spannableNewSpannable;
    }
}
