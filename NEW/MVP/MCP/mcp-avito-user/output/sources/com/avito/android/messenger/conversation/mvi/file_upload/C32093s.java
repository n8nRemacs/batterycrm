package com.avito.android.messenger.conversation.mvi.file_upload;

import android.app.Application;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.di.C32502t1;
import javax.inject.Provider;

/* compiled from: FileUploadInitializerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32093s implements dagger.internal.h<C32062c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f191213a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f191214b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f191215c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f191216d;

    /* renamed from: e, reason: collision with root package name */
    public final C32502t1 f191217e;

    public C32093s(dagger.internal.l lVar, Provider provider, dagger.internal.f fVar, Provider provider2, C32502t1 c32502t1) {
        this.f191213a = lVar;
        this.f191214b = provider;
        this.f191215c = fVar;
        this.f191216d = provider2;
        this.f191217e = c32502t1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C32062c((Application) this.f191213a.f393949a, this.f191214b.get(), (com.avito.android.notification.m) this.f191215c.get(), this.f191216d.get(), (C31667x) this.f191217e.get());
    }
}
