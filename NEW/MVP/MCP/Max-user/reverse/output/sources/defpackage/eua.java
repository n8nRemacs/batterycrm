package defpackage;

import androidx.media3.common.ParserException;

/* loaded from: classes.dex */
public final class eua implements gp5 {
    public kp5 a;
    public ulf b;
    public boolean c;

    public final boolean a(ip5 ip5Var) {
        boolean zH;
        hua huaVar = new hua(1);
        if (huaVar.b(ip5Var, true) && (huaVar.a & 2) == 2) {
            int iMin = Math.min(huaVar.e, 8);
            umb umbVar = new umb(iMin);
            ip5Var.i(0, umbVar.a, iMin);
            umbVar.J(0);
            if (umbVar.a() >= 5 && umbVar.x() == 127 && umbVar.z() == 1179402563) {
                this.b = new v16(1);
                return true;
            }
            umbVar.J(0);
            try {
                zH = gri.h(1, umbVar, true);
            } catch (ParserException unused) {
                zH = false;
            }
            if (zH) {
                this.b = new jjh(1);
            } else {
                umbVar.J(0);
                if (hjb.g(umbVar, hjb.p)) {
                    this.b = new hjb(1);
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        ulf ulfVar = this.b;
        if (ulfVar != null) {
            gua guaVar = (gua) ulfVar.j;
            hua huaVar = (hua) guaVar.e;
            huaVar.a = 0;
            huaVar.b = 0L;
            huaVar.c = 0;
            huaVar.d = 0;
            huaVar.e = 0;
            ((umb) guaVar.f).G(0);
            guaVar.b = -1;
            guaVar.d = false;
            if (j == 0) {
                ulfVar.f(!ulfVar.h);
                return;
            }
            if (ulfVar.e != 0) {
                long j3 = (ulfVar.f * j2) / 1000000;
                ulfVar.b = j3;
                jua juaVar = (jua) ulfVar.m;
                String str = zxg.a;
                juaVar.b(j3);
                ulfVar.e = 2;
            }
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        try {
            return a(ip5Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.a = kp5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r21, defpackage.n7 r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eua.y(ip5, n7):int");
    }
}
