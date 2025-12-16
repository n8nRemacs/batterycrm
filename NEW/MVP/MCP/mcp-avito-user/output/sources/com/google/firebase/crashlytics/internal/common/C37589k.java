package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C37589k implements InterfaceC37020c<Void, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f360981b;

    public C37589k(Callable callable) {
        this.f360981b = callable;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public final Object then(@j.N Task<Void> task) {
        return this.f360981b.call();
    }
}
