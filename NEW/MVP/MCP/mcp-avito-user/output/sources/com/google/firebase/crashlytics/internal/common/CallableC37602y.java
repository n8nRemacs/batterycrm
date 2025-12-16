package com.google.firebase.crashlytics.internal.common;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class CallableC37602y implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f361028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37598u f361029c;

    public CallableC37602y(C37598u c37598u, long j12) {
        this.f361029c = c37598u;
        this.f361028b = j12;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundleE = AK.c.e(1, "fatal");
        bundleE.putLong("timestamp", this.f361028b);
        this.f361029c.f361010k.c(bundleE);
        return null;
    }
}
