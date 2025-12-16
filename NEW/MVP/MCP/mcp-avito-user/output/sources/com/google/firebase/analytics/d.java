package com.google.firebase.analytics;

import j.P;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes13.dex */
final class d implements Callable<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f360723b;

    public d(FirebaseAnalytics firebaseAnalytics) {
        this.f360723b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final /* synthetic */ String call() {
        return this.f360723b.f360704a.zze();
    }
}
