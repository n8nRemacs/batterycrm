package com.avito.android.messenger.channels.mvi.list_feature;

import android.content.Context;

/* compiled from: LocalMessagePreviewProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class s1 implements dagger.internal.h<r1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f188202a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f188203b;

    public s1(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f188202a = uVar;
        this.f188203b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r1((Context) this.f188202a.get(), (com.avito.android.util.text.a) this.f188203b.get());
    }
}
