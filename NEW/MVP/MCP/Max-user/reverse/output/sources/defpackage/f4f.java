package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class f4f implements h4f {
    public static String b;
    public final /* synthetic */ int a;

    public static dn5 c(x8 x8Var, kgg kggVar, long j, long j2) {
        jgg jggVar;
        t76 t76VarListIterator = kggVar.a.listIterator(0);
        while (true) {
            if (!t76VarListIterator.hasNext()) {
                jggVar = null;
                break;
            }
            jggVar = (jgg) t76VarListIterator.next();
            if (jggVar.b.c == x8Var.b && jggVar.a()) {
                break;
            }
        }
        if (jggVar != null) {
            lfg lfgVar = jggVar.b;
            for (ymd ymdVar : x8Var.c) {
                hf6 hf6Var = ymdVar.a;
                int i = lfgVar.a;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        i2 = -1;
                        break;
                    }
                    if (fni.a(hf6Var, lfgVar.d[i2])) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2 && jggVar.e[i2]) {
                    long jU = zxg.U(j2);
                    if (!(ymdVar instanceof umd)) {
                        return ymdVar instanceof wmd ? ((wmd) ymdVar).Y != null ? new dn5(0L, jU) : new dn5(1L, jU) : new dn5();
                    }
                    y9e y9eVar = ((umd) ymdVar).X;
                    long jG = y9eVar.g(zxg.U(j), jU);
                    return new dn5(jG, y9eVar.f(jG, jU));
                }
            }
        }
        return new dn5();
    }

    @Override // defpackage.h4f
    public final float a(View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
            case 2:
                break;
            default:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
        }
        return view.getTranslationX() + viewGroup.getWidth();
    }

    @Override // defpackage.h4f
    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
