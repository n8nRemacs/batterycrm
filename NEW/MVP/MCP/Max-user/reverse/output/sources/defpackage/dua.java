package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class dua implements fp5 {
    public jp5 a;
    public ulf b;
    public boolean c;

    public final boolean a(hp5 hp5Var) {
        boolean zG;
        hua huaVar = new hua(0);
        if (huaVar.a(hp5Var, true) && (huaVar.a & 2) == 2) {
            int iMin = Math.min(huaVar.e, 8);
            qyg qygVar = new qyg(iMin);
            hp5Var.i(0, qygVar.a, iMin);
            qygVar.E(0);
            if (qygVar.c() >= 5 && qygVar.s() == 127 && qygVar.t() == 1179402563) {
                this.b = new u16(0);
                return true;
            }
            qygVar.E(0);
            try {
                zG = eri.g(1, qygVar, true);
            } catch (ParserException unused) {
                zG = false;
            }
            if (zG) {
                this.b = new ijh(0);
            } else {
                qygVar.E(0);
                if (gjb.g(qygVar, gjb.o)) {
                    this.b = new gjb(0);
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.fp5
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
            ((qyg) guaVar.f).B(0);
            guaVar.b = -1;
            guaVar.d = false;
            if (j == 0) {
                ulfVar.f(!ulfVar.h);
                return;
            }
            if (ulfVar.e != 0) {
                long j3 = (ulfVar.f * j2) / 1000000;
                ulfVar.b = j3;
                iua iuaVar = (iua) ulfVar.m;
                int i = xxg.a;
                iuaVar.b(j3);
                ulfVar.e = 2;
            }
        }
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.a = jp5Var;
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        try {
            return a(hp5Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r21, defpackage.n7 r22) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dua.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
