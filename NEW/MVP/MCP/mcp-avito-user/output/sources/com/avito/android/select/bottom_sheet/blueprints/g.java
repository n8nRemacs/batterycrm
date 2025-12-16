package com.avito.android.select.bottom_sheet.blueprints;

import com.avito.android.select.InterfaceC34610a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckableItemIconLeftBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f265087a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34610a> f265088b;

    public g(Provider<m> provider, Provider<InterfaceC34610a> provider2) {
        this.f265087a = provider;
        this.f265088b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f265087a.get(), this.f265088b.get());
    }
}
