package com.avito.android.serp.adapter.rich_snippets;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RichSnippetsResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f270886a;

    public o(dagger.internal.l lVar) {
        this.f270886a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Resources) this.f270886a.f393949a);
    }
}
