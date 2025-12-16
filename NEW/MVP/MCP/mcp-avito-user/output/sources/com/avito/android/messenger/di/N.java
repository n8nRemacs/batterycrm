package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_ProvideQuickRepliesAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class N implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195673a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f195674b;

    public N(C32431e c32431e, dagger.internal.u uVar) {
        this.f195673a = c32431e;
        this.f195674b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f195674b.get();
        this.f195673a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
