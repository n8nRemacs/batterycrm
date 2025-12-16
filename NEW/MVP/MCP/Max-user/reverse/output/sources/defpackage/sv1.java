package defpackage;

/* loaded from: classes.dex */
public final class sv1 implements f84 {
    public final bwf a;

    public sv1(k18 k18Var, k18 k18Var2) {
        this.a = new bwf(new rv1(k18Var, k18Var2, 0));
    }

    @Override // defpackage.f84
    public final x74 getCoroutineContext() {
        return (x74) this.a.getValue();
    }
}
