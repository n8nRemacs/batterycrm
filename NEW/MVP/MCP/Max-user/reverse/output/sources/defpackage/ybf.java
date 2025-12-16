package defpackage;

/* loaded from: classes.dex */
public final class ybf extends uh6 {
    public final /* synthetic */ i9e b;
    public final /* synthetic */ v32 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybf(v32 v32Var, i9e i9eVar, i9e i9eVar2) {
        super(i9eVar);
        this.c = v32Var;
        this.b = i9eVar2;
    }

    @Override // defpackage.uh6, defpackage.i9e
    public final g9e e(long j) {
        g9e g9eVarE = this.b.e(j);
        m9e m9eVar = g9eVarE.a;
        long j2 = m9eVar.a;
        long j3 = m9eVar.b;
        long j4 = this.c.b;
        m9e m9eVar2 = new m9e(j2, j3 + j4);
        m9e m9eVar3 = g9eVarE.b;
        return new g9e(m9eVar2, new m9e(m9eVar3.a, m9eVar3.b + j4));
    }
}
