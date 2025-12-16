package com.avito.android.serp.adapter.snippet;

import com.avito.android.serp.adapter.snippet.g;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SnippetPresenter_Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f272366a;

    /* renamed from: b, reason: collision with root package name */
    public final l f272367b;

    /* renamed from: c, reason: collision with root package name */
    public final l f272368c;

    public h(l lVar, l lVar2, l lVar3) {
        this.f272366a = lVar;
        this.f272367b = lVar2;
        this.f272368c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g.a((com.jakewharton.rxrelay3.d) this.f272366a.f393949a, (com.jakewharton.rxrelay3.d) this.f272367b.f393949a, (com.jakewharton.rxrelay3.d) this.f272368c.f393949a);
    }
}
