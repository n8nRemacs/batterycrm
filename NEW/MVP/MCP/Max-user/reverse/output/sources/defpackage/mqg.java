package defpackage;

/* loaded from: classes.dex */
public final class mqg implements v74, w74 {
    public static final mqg a = new mqg();

    @Override // defpackage.x74
    public final Object fold(Object obj, sm6 sm6Var) {
        return sm6Var.invoke(obj, this);
    }

    @Override // defpackage.x74
    public final v74 get(w74 w74Var) {
        return y6j.a(this, w74Var);
    }

    @Override // defpackage.v74
    public final w74 getKey() {
        return this;
    }

    @Override // defpackage.x74
    public final x74 minusKey(w74 w74Var) {
        return y6j.b(this, w74Var);
    }

    @Override // defpackage.x74
    public final x74 plus(x74 x74Var) {
        return x6j.b(this, x74Var);
    }
}
