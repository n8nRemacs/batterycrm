package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes2.dex */
public final class tte implements jzb {
    public final ShareData a;
    public final kue b;
    public final fde c;
    public final s5g d;
    public final boolean e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final tcf i;
    public final hbd j;
    public final jve k;
    public final gbd l;
    public final s7c m;
    public f84 n;
    public boolean o;

    public tte(ShareData shareData, kue kueVar, fde fdeVar, k18 k18Var, k18 k18Var2, k18 k18Var3, r5g r5gVar, boolean z) {
        this.a = shareData;
        this.b = kueVar;
        this.c = fdeVar;
        this.d = r5gVar;
        this.e = z;
        this.f = k18Var;
        this.g = k18Var2;
        this.h = k18Var3;
        tcf tcfVarA = ucf.a(null);
        this.i = tcfVarA;
        this.j = new hbd(tcfVarA);
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.k = jveVarB;
        this.l = new gbd(jveVarB);
        this.m = new s7c(17);
        if (shareData == null) {
            throw new IllegalStateException("ShareData is null");
        }
    }

    @Override // defpackage.jzb
    public final void a() {
        this.n = null;
    }

    @Override // defpackage.jzb
    public final void b(yyb yybVar) {
        this.k.h(yte.a);
        this.c.F(yybVar);
    }

    @Override // defpackage.jzb
    public final void d(long j) {
        this.c.E(j);
    }

    @Override // defpackage.jzb
    public final void e(ContextScope contextScope) {
        this.n = contextScope;
        svi.e(contextScope, ((q2b) ((lzf) this.f.getValue())).b(), null, new rte(this, null), 2);
    }
}
