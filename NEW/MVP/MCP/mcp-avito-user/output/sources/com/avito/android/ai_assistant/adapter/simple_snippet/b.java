package com.avito.android.ai_assistant.adapter.simple_snippet;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimpleSnippetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f88876a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f88877b;

    public b(l lVar, Provider provider) {
        this.f88876a = lVar;
        this.f88877b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f88876a.f393949a, this.f88877b.get());
    }
}
