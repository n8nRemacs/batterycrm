package defpackage;

/* loaded from: classes.dex */
public abstract class p0 implements v74 {
    private final w74 key;

    public p0(w74 w74Var) {
        this.key = w74Var;
    }

    @Override // defpackage.x74
    public <R> R fold(R r, sm6 sm6Var) {
        return (R) sm6Var.invoke(r, this);
    }

    @Override // defpackage.x74
    public v74 get(w74 w74Var) {
        return y6j.a(this, w74Var);
    }

    @Override // defpackage.v74
    public w74 getKey() {
        return this.key;
    }

    @Override // defpackage.x74
    public x74 minusKey(w74 w74Var) {
        return y6j.b(this, w74Var);
    }

    @Override // defpackage.x74
    public x74 plus(x74 x74Var) {
        return x6j.b(this, x74Var);
    }
}
