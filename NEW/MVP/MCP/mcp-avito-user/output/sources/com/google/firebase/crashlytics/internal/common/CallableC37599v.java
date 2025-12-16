package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class CallableC37599v implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f361019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f361020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37598u f361021d;

    public CallableC37599v(C37598u c37598u, long j12, String str) {
        this.f361021d = c37598u;
        this.f361019b = j12;
        this.f361020c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        C37598u c37598u = this.f361021d;
        J j12 = c37598u.f361012m;
        if (j12 != null && j12.f360916e.get()) {
            return null;
        }
        c37598u.f361008i.e(this.f361019b, this.f361020c);
        return null;
    }
}
