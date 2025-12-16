package defpackage;

/* loaded from: classes2.dex */
public final class sih implements vn4 {
    public final /* synthetic */ tih a;

    public sih(tih tihVar) {
        this.a = tihVar;
    }

    @Override // defpackage.vn4
    public final void onResume(j48 j48Var) {
        wqi.c("tih", "onResume, owner=" + j48Var + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
    }

    @Override // defpackage.vn4
    public final void onStart(j48 j48Var) {
        wqi.c("tih", "onStart, owner=" + j48Var + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
        if (this.a.k) {
            return;
        }
        this.a.k = true;
        if (this.a.l) {
            this.a.b();
        }
    }

    @Override // defpackage.vn4
    public final void onStop(j48 j48Var) {
        wqi.c("tih", "onStop, owner=" + j48Var + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
        if (this.a.k) {
            this.a.k = false;
            this.a.a();
        }
    }
}
