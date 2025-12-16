package com.avito.android.search_suggest.intent;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSuggestIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f264237a;

    /* renamed from: b, reason: collision with root package name */
    public final O f264238b;

    public e(l lVar, O o12) {
        this.f264237a = lVar;
        this.f264238b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Application) this.f264237a.f393949a, (L) this.f264238b.get());
    }
}
