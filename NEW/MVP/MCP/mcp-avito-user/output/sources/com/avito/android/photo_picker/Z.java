package com.avito.android.photo_picker;

import java.util.Map;
import javax.inject.Provider;

/* compiled from: UploadListenerProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class Z implements dagger.internal.h<Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Map<String, n80.b>> f218880a;

    public Z(Provider<Map<String, n80.b>> provider) {
        this.f218880a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y(this.f218880a.get());
    }
}
