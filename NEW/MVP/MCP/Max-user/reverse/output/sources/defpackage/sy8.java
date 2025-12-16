package defpackage;

import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class sy8 implements uy8, n79 {
    public final /* synthetic */ o3c a;

    public /* synthetic */ sy8(o3c o3cVar) {
        this.a = o3cVar;
    }

    @Override // defpackage.n79
    public void a(t69 t69Var, int i) {
        t69Var.f(i, this.a);
    }

    @Override // defpackage.uy8
    public void c(ly8 ly8Var) {
        boolean z;
        boolean z2;
        px8 px8Var = ly8Var.a;
        if (ly8Var.isConnected()) {
            o3c o3cVar = ly8Var.w;
            o3c o3cVar2 = this.a;
            if (Objects.equals(o3cVar, o3cVar2)) {
                return;
            }
            ly8Var.w = o3cVar2;
            o3c o3cVar3 = ly8Var.x;
            o3c o3cVarM = ly8.m(ly8Var.v, o3cVar2);
            ly8Var.x = o3cVarM;
            if (o3cVarM.equals(o3cVar3)) {
                z = false;
                z2 = false;
            } else {
                zjd zjdVar = ly8Var.s;
                zjd zjdVar2 = ly8Var.t;
                zjd zjdVarX = ly8.X(ly8Var.r, ly8Var.q, ly8Var.u, ly8Var.x, ly8Var.D);
                ly8Var.s = zjdVarX;
                ly8Var.t = ly8.W(zjdVarX, ly8Var.q, ly8Var.D, ly8Var.u, ly8Var.x);
                z = !ly8Var.s.equals(zjdVar);
                z2 = !ly8Var.t.equals(zjdVar2);
                ly8Var.h.f(13, new zx8(ly8Var, 4));
            }
            if (z2) {
                px8Var.getClass();
                hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                px8Var.d.getClass();
            }
            if (z) {
                px8Var.getClass();
                hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                px8Var.d.z();
            }
        }
    }
}
