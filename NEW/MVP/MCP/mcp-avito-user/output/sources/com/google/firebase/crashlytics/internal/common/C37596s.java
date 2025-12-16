package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37027j;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.C37598u;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C37596s implements InterfaceC37027j<com.google.firebase.crashlytics.internal.settings.d, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f360995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CallableC37597t f360996b;

    public C37596s(CallableC37597t callableC37597t, ExecutorService executorService) {
        this.f360996b = callableC37597t;
        this.f360995a = executorService;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37027j
    @j.N
    public final Task<Void> a(@j.P com.google.firebase.crashlytics.internal.settings.d dVar) throws NumberFormatException, ClassNotFoundException {
        if (dVar == null) {
            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
            return C37030m.f(null);
        }
        C37598u.a aVar = this.f360996b.f360998c;
        C37598u.b(C37598u.this);
        C37598u.this.f361011l.d(this.f360995a, null);
        C37598u.this.f361015p.d(null);
        return C37030m.f(null);
    }
}
