package com.avito.android.select.bottom_sheet.blueprints;

import com.avito.android.select.InterfaceC34610a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckableItemIconRightBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f265156a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34610a> f265157b;

    public k(Provider<m> provider, Provider<InterfaceC34610a> provider2) {
        this.f265156a = provider;
        this.f265157b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f265156a.get(), this.f265157b.get());
    }
}
