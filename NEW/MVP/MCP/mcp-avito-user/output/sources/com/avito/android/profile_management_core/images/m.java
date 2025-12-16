package com.avito.android.profile_management_core.images;

import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileManagementImageInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f226762a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.f> f226763b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f226764c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<SharedPhotosStorage> f226765d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f226766e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f226767f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Gson> f226768g;

    /* renamed from: h, reason: collision with root package name */
    public final u f226769h;

    public m(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f226762a = provider;
        this.f226763b = provider2;
        this.f226764c = provider3;
        this.f226765d = provider4;
        this.f226766e = provider5;
        this.f226767f = provider6;
        this.f226768g = provider7;
        this.f226769h = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.b(this.f226762a), this.f226763b.get(), this.f226764c.get(), this.f226765d.get(), this.f226766e.get(), this.f226767f.get(), dagger.internal.g.b(this.f226768g), (String) this.f226769h.get());
    }
}
