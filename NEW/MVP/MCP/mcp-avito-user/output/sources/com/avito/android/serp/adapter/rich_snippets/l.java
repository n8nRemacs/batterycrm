package com.avito.android.serp.adapter.rich_snippets;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: RichSnippetStateProviderProxy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final A f270884a;

    public l(A a12) {
        this.f270884a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Set) this.f270884a.get());
    }
}
