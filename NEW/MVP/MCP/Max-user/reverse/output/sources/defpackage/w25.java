package defpackage;

/* loaded from: classes.dex */
public final class w25 implements x74 {
    public final /* synthetic */ x74 a;
    public final Throwable b;

    public w25(x74 x74Var, Throwable th) {
        this.a = x74Var;
        this.b = th;
    }

    @Override // defpackage.x74
    public final Object fold(Object obj, sm6 sm6Var) {
        return this.a.fold(obj, sm6Var);
    }

    @Override // defpackage.x74
    public final v74 get(w74 w74Var) {
        return this.a.get(w74Var);
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
