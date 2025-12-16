package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class mfe implements en6 {
    public final /* synthetic */ r77 a;

    public mfe(r77 r77Var) {
        this.a = r77Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mfe) || obj == null) {
            return false;
        }
        return getFunctionDelegate().equals(((en6) obj).getFunctionDelegate());
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        return new y8(1, 8, r77.class, this.a, "onNewHost", "onNewHost(Ljava/lang/String;)Lkotlinx/coroutines/Job;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
