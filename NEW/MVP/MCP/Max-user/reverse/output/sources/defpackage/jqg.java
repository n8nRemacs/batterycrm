package defpackage;

/* loaded from: classes.dex */
public final class jqg extends z74 {
    public static final jqg a = new jqg();

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        h7i h7iVar = (h7i) x74Var.get(h7i.b);
        if (h7iVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        h7iVar.a = true;
    }

    @Override // defpackage.z74
    public final boolean isDispatchNeeded(x74 x74Var) {
        return false;
    }

    @Override // defpackage.z74
    public final z74 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.z74
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
