package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xh6 extends u9g {
    public u9g e;

    public xh6(u9g u9gVar) {
        this.e = u9gVar;
    }

    @Override // defpackage.u9g
    public final u9g a() {
        return this.e.a();
    }

    @Override // defpackage.u9g
    public final u9g b() {
        return this.e.b();
    }

    @Override // defpackage.u9g
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.u9g
    public final u9g d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.u9g
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.u9g
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.u9g
    public final u9g g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.u9g
    public final long h() {
        return this.e.h();
    }
}
