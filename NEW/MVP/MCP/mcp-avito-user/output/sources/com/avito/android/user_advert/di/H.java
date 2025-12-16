package com.avito.android.user_advert.di;

/* compiled from: MyAdvertItemsModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class H implements dagger.internal.h<androidx.recyclerview.widget.C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f310882a;

    public H(dagger.internal.u uVar) {
        this.f310882a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f310882a.get();
        B.f310787a.getClass();
        return jVar;
    }
}
