package com.avito.android.item_map.amenity;

import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenityButtonsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f173308a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AvitoMarkerIconFactory> f173309b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f173310c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f173311d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f173312e;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f173308a = provider;
        this.f173309b = provider2;
        this.f173310c = lVar;
        this.f173311d = lVar2;
        this.f173312e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f173308a.get(), this.f173309b.get(), (ItemMapState) this.f173310c.f393949a, (Kundle) this.f173311d.f393949a, this.f173312e.get());
    }
}
