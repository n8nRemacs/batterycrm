package com.avito.android.stories;

import com.avito.android.util.Kundle;

/* compiled from: StoriesSessionViewedInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f285299a;

    public v(dagger.internal.l lVar) {
        this.f285299a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Kundle kundle = (Kundle) this.f285299a.f393949a;
        u uVar = new u();
        if (kundle == null) {
            kundle = new Kundle();
        }
        uVar.f285298a = kundle;
        return uVar;
    }
}
