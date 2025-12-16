package com.avito.android.search_suggest.mvi;

import com.avito.android.search_suggest.SearchSuggestArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSuggestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f264346a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.search_suggest.l f264347b;

    public g(dagger.internal.l lVar, com.avito.android.search_suggest.l lVar2) {
        this.f264346a = lVar;
        this.f264347b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((SearchSuggestArguments) this.f264346a.f393949a, (com.avito.android.search_suggest.g) this.f264347b.get());
    }
}
