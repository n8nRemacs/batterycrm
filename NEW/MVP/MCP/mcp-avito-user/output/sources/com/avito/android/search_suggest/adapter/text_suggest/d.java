package com.avito.android.search_suggest.adapter.text_suggest;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TextSuggestItemPresenter_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f264172a;

    /* renamed from: b, reason: collision with root package name */
    public final l f264173b;

    public d(l lVar, l lVar2) {
        this.f264172a = lVar;
        this.f264173b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Y41.l) this.f264172a.f393949a, ((Boolean) this.f264173b.f393949a).booleanValue());
    }
}
