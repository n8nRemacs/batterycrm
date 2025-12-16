package com.avito.android.messenger.di;

import com.avito.android.remote.model.messenger.geo.GeoMarker;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: ChannelFragmentModule_ProvideGeoBubbleSnippetDefaultLocation$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32512x implements dagger.internal.h<GeoMarker> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196309a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f196310b;

    public C32512x(C32431e c32431e, Provider<InterfaceC49101b> provider) {
        this.f196309a = c32431e;
        this.f196310b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49101b interfaceC49101b = this.f196310b.get();
        this.f196309a.getClass();
        return interfaceC49101b.d() ? new GeoMarker(61.385303d, 98.44411d, null, null) : new GeoMarker(0.0d, 0.0d, null, null);
    }
}
