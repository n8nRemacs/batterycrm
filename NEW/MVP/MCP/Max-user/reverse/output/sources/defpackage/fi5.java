package defpackage;

/* loaded from: classes.dex */
public final class fi5 extends hi5 {
    public final k42 c;
    public final /* synthetic */ ji5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi5(ji5 ji5Var, long j, k42 k42Var) {
        super(j);
        this.d = ji5Var;
        this.c = k42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d(this.d);
    }

    @Override // defpackage.hi5
    public final String toString() {
        return super.toString() + this.c;
    }
}
