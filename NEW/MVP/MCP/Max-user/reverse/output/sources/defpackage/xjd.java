package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class xjd implements nce, mr3 {
    public static final /* synthetic */ yy7[] y0;
    public final bwf X;
    public final k18 Y;
    public final k18 Z;
    public final /* synthetic */ agh a;
    public njd b;
    public final f84 c;
    public final fga d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final t9f u0 = c7j.c();
    public final jve v0;
    public final gbd w0;
    public final hbd x0;

    static {
        z8a z8aVar = new z8a(xjd.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        y0 = new yy7[]{z8aVar};
    }

    public xjd(njd njdVar, ContextScope contextScope, fga fgaVar, k18 k18Var, k18 k18Var2, bwf bwfVar, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = new agh(k18Var2, new llc(8));
        this.b = njdVar;
        this.c = contextScope;
        this.d = fgaVar;
        this.o = k18Var3;
        this.X = bwfVar;
        this.Y = k18Var;
        this.Z = k18Var4;
        this.s0 = k18Var5;
        this.t0 = k18Var6;
        jve jveVarA = kve.a(1, 1, 2);
        this.v0 = jveVarA;
        this.w0 = new gbd(jveVarA);
        this.x0 = new hbd(ucf.a(f2c.a));
    }

    @Override // defpackage.nce
    public final void a(vbe vbeVar) {
        this.v0.h(vbeVar);
    }

    @Override // defpackage.nce
    public final void b(xbe xbeVar) {
        qt7 qt7VarA = this.a.a(this.c, ((q2b) ((lzf) this.o.getValue())).b(), i84.b, new wjd(xbeVar, this, null));
        this.u0.O(this, y0[0], qt7VarA);
    }

    @Override // defpackage.nce
    public final hbd c() {
        return this.x0;
    }

    @Override // defpackage.nce
    public final void d(zea zeaVar) {
        this.v0.h(new vbe(zeaVar.a, zeaVar.b, zeaVar.c));
    }

    @Override // defpackage.nce
    public final gbd e() {
        return this.w0;
    }

    @Override // defpackage.nce
    public final o6g f() {
        return new o6g(t3d.oneme_login_neuro_avatars_title, t3d.oneme_login_neuro_avatars_description, t3d.oneme_login_neuro_avatars_continue_button);
    }

    @Override // defpackage.mr3
    public final gbd i() {
        return this.a.d;
    }
}
