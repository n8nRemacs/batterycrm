package defpackage;

/* loaded from: classes2.dex */
public final class si8 {
    public static final /* synthetic */ yy7[] e;
    public final f84 a;
    public final qi8 b;
    public final dtf c;
    public final t9f d = c7j.c();

    static {
        z8a z8aVar = new z8a(si8.class, "subscribeJob", "getSubscribeJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        e = new yy7[]{z8aVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public si8(nxg nxgVar, qi8 qi8Var, em6 em6Var) {
        this.a = nxgVar;
        this.b = qi8Var;
        this.c = (dtf) em6Var;
    }

    public final void a() {
        x9f x9fVarE = svi.e(this.a, null, null, new ri8(this, null), 3);
        x9fVarE.invokeOnCompletion(new wu7(8, this));
        this.d.O(this, e[0], x9fVarE);
    }
}
