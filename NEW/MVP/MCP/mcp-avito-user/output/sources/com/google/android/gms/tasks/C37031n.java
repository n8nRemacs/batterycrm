package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* renamed from: com.google.android.gms.tasks.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37031n implements InterfaceC37024g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC37025h f355675b;

    public C37031n(InterfaceC37025h interfaceC37025h) {
        this.f355675b = interfaceC37025h;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f355675b.onCanceled();
    }
}
