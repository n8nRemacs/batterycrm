package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class qd4 implements bc8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qd4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(ec8 ec8Var, long j, long j2, boolean z) {
    }

    @Override // defpackage.bc8
    public final y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        switch (this.a) {
            case 0:
                zmb zmbVar = (zmb) ec8Var;
                sd4 sd4Var = (sd4) this.b;
                lk6 lk6Var = sd4Var.q;
                long j3 = zmbVar.a;
                ze4 ze4Var = zmbVar.b;
                zdf zdfVar = zmbVar.d;
                Uri uri = zdfVar.c;
                lk6Var.P(new ub8(ze4Var, j2, zdfVar.b), zmbVar.c, iOException, true);
                sd4Var.m.getClass();
                sd4Var.x(iOException);
                break;
            default:
                ((sd4) ((ao6) this.b).b).x(iOException);
                break;
        }
        return te8.o;
    }

    @Override // defpackage.bc8
    public final void q(ec8 ec8Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 0:
                ((sd4) this.b).w((zmb) ec8Var, j2);
                break;
        }
    }

    @Override // defpackage.bc8
    public final void x(ec8 ec8Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 0:
                zmb zmbVar = (zmb) ec8Var;
                sd4 sd4Var = (sd4) this.b;
                long j3 = zmbVar.a;
                ze4 ze4Var = zmbVar.b;
                zdf zdfVar = zmbVar.d;
                Uri uri = zdfVar.c;
                ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
                sd4Var.m.getClass();
                sd4Var.q.N(ub8Var, zmbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                sd4Var.L = ((Long) zmbVar.X).longValue() - j;
                sd4Var.y(true);
                return;
            default:
                ao6 ao6Var = (ao6) this.b;
                synchronized (vmi.b) {
                    z = vmi.c;
                }
                if (z) {
                    ao6Var.o();
                    return;
                } else {
                    ((sd4) ao6Var.b).x(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }
}
