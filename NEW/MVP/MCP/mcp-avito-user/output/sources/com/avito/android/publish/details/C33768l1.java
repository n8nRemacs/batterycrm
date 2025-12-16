package com.avito.android.publish.details;

import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublishDetailsPhotoSyncInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.l1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33768l1 implements dagger.internal.h<C33765k1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f234825a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.j> f234826b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.b0> f234827c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f234828d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f234829e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<PhotoUploadObserver> f234830f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f234831g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<S0> f234832h;

    public C33768l1(dagger.internal.u uVar, Provider provider, Provider provider2, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider3, Provider provider4, Provider provider5) {
        this.f234825a = uVar;
        this.f234826b = provider;
        this.f234827c = provider2;
        this.f234828d = uVar2;
        this.f234829e = uVar3;
        this.f234830f = provider3;
        this.f234831g = provider4;
        this.f234832h = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33765k1((com.avito.android.connection_quality.connectivity.a) this.f234825a.get(), this.f234826b.get(), this.f234827c.get(), (com.avito.android.publish.C0) this.f234828d.get(), (InterfaceC35745a5) this.f234829e.get(), this.f234830f.get(), this.f234831g.get(), this.f234832h.get());
    }
}
