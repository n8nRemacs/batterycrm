package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class CallableC37601x implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f361026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37598u f361027c;

    public CallableC37601x(C37598u c37598u, String str) {
        this.f361027c = c37598u;
        this.f361026b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        C37598u.a(this.f361027c, this.f361026b);
        return null;
    }
}
