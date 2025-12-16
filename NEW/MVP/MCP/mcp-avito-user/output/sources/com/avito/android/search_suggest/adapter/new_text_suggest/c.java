package com.avito.android.search_suggest.adapter.new_text_suggest;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NewTextSuggestItemPresenterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f264164a;

    /* renamed from: b, reason: collision with root package name */
    public final l f264165b;

    public c(l lVar, l lVar2) {
        this.f264164a = lVar;
        this.f264165b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Y41.l) this.f264164a.f393949a, ((Boolean) this.f264165b.f393949a).booleanValue());
    }
}
