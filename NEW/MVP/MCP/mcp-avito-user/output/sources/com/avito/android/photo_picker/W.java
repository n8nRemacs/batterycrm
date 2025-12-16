package com.avito.android.photo_picker;

import java.util.Map;
import javax.inject.Provider;
import n80.InterfaceC44212a;

/* compiled from: UploadInteractorProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Map<String, InterfaceC44212a>> f218878a;

    public W(Provider<Map<String, InterfaceC44212a>> provider) {
        this.f218878a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new V(this.f218878a.get());
    }
}
