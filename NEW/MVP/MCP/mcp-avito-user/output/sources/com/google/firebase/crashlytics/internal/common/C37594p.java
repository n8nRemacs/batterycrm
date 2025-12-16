package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37027j;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C37594p implements InterfaceC37027j<com.google.firebase.crashlytics.internal.settings.d, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f360988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CallableC37595q f360989b;

    public C37594p(CallableC37595q callableC37595q, ExecutorService executorService, String str) {
        this.f360989b = callableC37595q;
        this.f360988a = executorService;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37027j
    @j.N
    public final Task<Void> a(@j.P com.google.firebase.crashlytics.internal.settings.d dVar) {
        if (dVar == null) {
            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
            return C37030m.f(null);
        }
        C37598u c37598u = this.f360989b.f360994f;
        return C37030m.g(Arrays.asList(C37598u.b(c37598u), c37598u.f361011l.d(this.f360988a, null)));
    }
}
