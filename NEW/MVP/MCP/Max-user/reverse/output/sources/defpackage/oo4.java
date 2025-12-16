package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class oo4 implements h9e {
    public final /* synthetic */ qo4 a;

    public oo4(qo4 qo4Var) {
        this.a = qo4Var;
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        qo4 qo4Var = this.a;
        long j2 = qo4Var.b;
        long j3 = qo4Var.c;
        l9e l9eVar = new l9e(j, xxg.j(((((j3 - j2) * ((((ulf) qo4Var.w0).f * j) / 1000000)) / qo4Var.o) + j2) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, j2, j3 - 1));
        return new f9e(l9eVar, l9eVar);
    }

    @Override // defpackage.h9e
    public final long f() {
        return (this.a.o * 1000000) / ((ulf) r0.w0).f;
    }
}
