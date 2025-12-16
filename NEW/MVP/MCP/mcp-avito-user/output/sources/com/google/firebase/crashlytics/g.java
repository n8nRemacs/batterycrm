package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.common.E;
import java.util.concurrent.Callable;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes4.dex */
class g implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f360868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f360869c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.g f360870d;

    public g(boolean z12, E e12, com.google.firebase.crashlytics.internal.settings.g gVar) {
        this.f360868b = z12;
        this.f360869c = e12;
        this.f360870d = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        if (!this.f360868b) {
            return null;
        }
        this.f360869c.d(this.f360870d);
        return null;
    }
}
