package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.permissions.G;
import com.avito.android.permissions.u;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CameraActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f219237a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SharedPhotosStorage> f219238b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<N70.b> f219239c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f219240d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f219241e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<u> f219242f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<G> f219243g;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f219237a = lVar;
        this.f219238b = provider;
        this.f219239c = provider2;
        this.f219240d = provider3;
        this.f219241e = provider4;
        this.f219242f = provider5;
        this.f219243g = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(((Integer) this.f219237a.f393949a).intValue(), this.f219238b.get(), this.f219239c.get(), this.f219240d.get(), this.f219241e.get(), this.f219242f.get(), this.f219243g.get());
    }
}
