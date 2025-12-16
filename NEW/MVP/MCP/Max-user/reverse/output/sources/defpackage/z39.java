package defpackage;

/* loaded from: classes2.dex */
public final class z39 implements j7a {
    public final /* synthetic */ h49 a;

    public z39(h49 h49Var) {
        this.a = h49Var;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.j7a
    public final void u(long j) {
        h49 h49Var = this.a;
        k7a k7aVarL = ((b8a) h49Var.a).l();
        Object obj = k7aVarL != null ? k7aVarL.c.get("MediaMetadata.Extra.MESSAGE_ID") : null;
        h49.a(h49Var, obj instanceof Long ? (Long) obj : null);
    }
}
