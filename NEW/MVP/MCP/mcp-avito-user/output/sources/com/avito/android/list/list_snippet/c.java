package com.avito.android.list.list_snippet;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ListSnippetBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f181599a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f181600b;

    public c(u uVar, Provider provider) {
        this.f181599a = uVar;
        this.f181600b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f181599a.get(), this.f181600b.get());
    }
}
