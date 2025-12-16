package com.avito.android.llm.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import hW.InterfaceC40887a;

/* compiled from: LlmDescriptionModule_ProvideLlmDescriptionRepositoryFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<com.avito.android.llm.data.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f181676a;

    public c(u uVar) {
        this.f181676a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40887a interfaceC40887a = (InterfaceC40887a) this.f181676a.get();
        a.f181675a.getClass();
        return new com.avito.android.llm.data.c(interfaceC40887a);
    }
}
