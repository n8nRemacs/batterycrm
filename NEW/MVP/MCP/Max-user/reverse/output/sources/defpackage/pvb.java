package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class pvb implements jzb {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final tcf d;
    public final hbd e;

    public pvb() {
        paf pafVar = paf.a;
        bwf bwfVarD = pafVar.getAccessor().d(123);
        bwf bwfVarD2 = pafVar.getAccessor().d(8);
        bwf bwfVarD3 = pafVar.getAccessor().d(10);
        this.a = bwfVarD;
        this.b = bwfVarD2;
        this.c = bwfVarD3;
        tcf tcfVarA = ucf.a(Boolean.FALSE);
        this.d = tcfVarA;
        this.e = new hbd(tcfVarA);
    }

    @Override // defpackage.jzb
    public final void a() {
    }

    @Override // defpackage.jzb
    public final void b(yyb yybVar) {
    }

    @Override // defpackage.jzb
    public final void d(long j) {
    }

    @Override // defpackage.jzb
    public final void e(ContextScope contextScope) {
        if (((qsb) this.c.getValue()).c(qsb.f)) {
            return;
        }
        svi.e(contextScope, ((q2b) ((lzf) this.b.getValue())).b(), null, new ovb(this, null), 2);
    }
}
