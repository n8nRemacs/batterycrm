package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class d5i extends cei {
    @Override // defpackage.cei
    public final void c(String str, String str2) {
        wqi.c(str, str2, new Object[0]);
    }

    @Override // defpackage.cei
    public final void d(String str, String str2, Throwable th) {
        wqi.b(str, str2, th);
    }

    @Override // defpackage.cei
    public final void e(String str, String str2) {
        wqi.e(str, str2, null);
    }

    @Override // defpackage.cei
    public final void f(String str, String str2, Throwable th) {
        wqi.e(str, str2, th);
    }

    @Override // defpackage.cei
    public final void i(String str, String str2) {
        wqi.h(str, str2, null);
    }

    @Override // defpackage.cei
    public final void j(String str, String str2, CancellationException cancellationException) {
        wqi.h(str, str2, cancellationException);
    }

    @Override // defpackage.cei
    public final void n(String str) {
        wqi.m(str, "Rescheduling alarm that keeps track of force-stops.", new Object[0]);
    }

    @Override // defpackage.cei
    public final void o(String str, String str2) {
        wqi.q(str, str2, new Object[0]);
    }

    @Override // defpackage.cei
    public final void p(String str, String str2, RuntimeException runtimeException) {
        wqi.p(str, str2, runtimeException);
    }
}
