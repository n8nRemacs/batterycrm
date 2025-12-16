package defpackage;

/* loaded from: classes.dex */
public final class xbf implements h9e {
    public final /* synthetic */ h9e a;
    public final /* synthetic */ v32 b;

    public xbf(v32 v32Var, h9e h9eVar) {
        this.b = v32Var;
        this.a = h9eVar;
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        f9e f9eVarE = this.a.e(j);
        l9e l9eVar = f9eVarE.a;
        long j2 = l9eVar.a;
        long j3 = l9eVar.b;
        long j4 = this.b.b;
        l9e l9eVar2 = new l9e(j2, j3 + j4);
        l9e l9eVar3 = f9eVarE.b;
        return new f9e(l9eVar2, new l9e(l9eVar3.a, l9eVar3.b + j4));
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.a.f();
    }
}
