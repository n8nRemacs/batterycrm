package com.avito.android.profile_vk_linking.common;

import android.app.Application;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkLinkingIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f230999a;

    public e(l lVar) {
        this.f230999a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Application) this.f230999a.f393949a);
    }
}
