package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes4.dex */
class N extends AbstractRunnableC37581c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f360927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f360928c;

    public N(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f360927b = executorService;
        this.f360928c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC37581c
    public final void a() {
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        ExecutorService executorService = this.f360927b;
        try {
            dVar.a(3);
            executorService.shutdown();
            if (executorService.awaitTermination(2L, this.f360928c)) {
                return;
            }
            dVar.a(3);
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            dVar.a(3);
            executorService.shutdownNow();
        }
    }
}
