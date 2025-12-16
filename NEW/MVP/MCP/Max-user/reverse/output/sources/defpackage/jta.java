package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jta extends k3 {
    public final long b;
    public final TimeUnit c;
    public final j0e d;

    public jta(vqa vqaVar, long j, TimeUnit timeUnit, j0e j0eVar) {
        super(vqaVar);
        this.b = j;
        this.c = timeUnit;
        this.d = j0eVar;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        this.a.a(new ita(new yee(vtaVar), this.b, this.c, this.d));
    }
}
