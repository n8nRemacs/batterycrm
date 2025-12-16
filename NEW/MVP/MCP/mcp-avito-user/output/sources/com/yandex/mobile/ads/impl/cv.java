package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final na0 f384463a;

    public cv(@Y61.k na0 na0Var) {
        this.f384463a = na0Var;
    }

    public final void a(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f384463a.a(new androidx.media3.exoplayer.audio.f(SystemClock.elapsedRealtime(), aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(long j12, Y41.a aVar) {
        if (SystemClock.elapsedRealtime() - j12 <= 5000) {
            aVar.invoke();
        }
    }
}
