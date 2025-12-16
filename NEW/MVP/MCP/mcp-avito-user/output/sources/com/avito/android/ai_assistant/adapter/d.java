package com.avito.android.ai_assistant.adapter;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AiAssistantItemsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f88804a;

    /* renamed from: b, reason: collision with root package name */
    public final u f88805b;

    public d(u uVar, Provider provider) {
        this.f88804a = provider;
        this.f88805b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f88804a.get(), (e) this.f88805b.get());
    }
}
