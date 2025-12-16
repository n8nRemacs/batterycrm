package defpackage;

/* loaded from: classes.dex */
public final class xi5 implements a84 {
    public final /* synthetic */ wi5 a = wi5.a;

    public final boolean equals(Object obj) {
        return (obj instanceof xi5) || (obj instanceof wi5);
    }

    @Override // defpackage.x74
    public final Object fold(Object obj, sm6 sm6Var) {
        return this.a.fold(obj, sm6Var);
    }

    @Override // defpackage.x74
    public final v74 get(w74 w74Var) {
        return this.a.get(w74Var);
    }

    @Override // defpackage.v74
    public final w74 getKey() {
        return this.a.getKey();
    }

    public final int hashCode() {
        return wi5.a.hashCode();
    }

    @Override // defpackage.a84
    public final void i(x74 x74Var, Throwable th) {
        this.a.getClass();
        synchronized (wi5.b) {
        }
    }

    @Override // defpackage.x74
    public final x74 minusKey(w74 w74Var) {
        return this.a.minusKey(w74Var);
    }

    @Override // defpackage.x74
    public final x74 plus(x74 x74Var) {
        return this.a.plus(x74Var);
    }
}
