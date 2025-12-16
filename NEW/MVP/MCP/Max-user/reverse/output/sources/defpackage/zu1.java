package defpackage;

import ru.ok.android.externcalls.sdk.audio.Logger;

/* loaded from: classes.dex */
public final class zu1 implements Logger {
    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void d(String str, String str2) {
        wqi.c(str, str2, new Object[0]);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void e(String str, String str2, Throwable th) {
        wqi.e(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void i(String str, String str2) {
        wqi.h(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void v(String str, String str2) {
        wqi.m(str, str2, new Object[0]);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, String str2) {
        wqi.q(str, str2, new Object[0]);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void d(String str, String str2, Throwable th) {
        wqi.b(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void e(String str, String str2) {
        wqi.e(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void i(String str, String str2, Throwable th) {
        wqi.h(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void v(String str, String str2, Throwable th) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            l6b.f(l6bVar, lg8.c, str, str2, null, th, 8);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, String str2, Throwable th) {
        wqi.p(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, Throwable th) {
        wqi.q(str, th.getMessage(), new Object[0]);
    }
}
