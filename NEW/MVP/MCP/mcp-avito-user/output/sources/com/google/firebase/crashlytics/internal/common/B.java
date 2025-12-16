package com.google.firebase.crashlytics.internal.common;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes4.dex */
class B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.g f360880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f360881c;

    public B(E e12, com.google.firebase.crashlytics.internal.settings.g gVar) {
        this.f360881c = e12;
        this.f360880b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E.a(this.f360881c, this.f360880b);
    }
}
