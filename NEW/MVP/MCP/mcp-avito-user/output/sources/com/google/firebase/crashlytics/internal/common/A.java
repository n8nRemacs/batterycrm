package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes4.dex */
class A implements Callable<Task<Void>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.k f360878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f360879c;

    public A(E e12, com.google.firebase.crashlytics.internal.settings.k kVar) {
        this.f360879c = e12;
        this.f360878b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        return E.a(this.f360879c, this.f360878b);
    }
}
