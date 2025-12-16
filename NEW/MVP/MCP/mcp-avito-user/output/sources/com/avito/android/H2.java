package com.avito.android;

import kotlin.Metadata;

/* compiled from: TypedLazy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/H2;", "T", "Lh31/e;", "_common_dagger-scopes_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H2<T> implements h31.e<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Class<? extends T> f67276a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<T> f67277b;

    public H2(@Y61.k Class<? extends T> cls, @Y61.k h31.e<T> eVar) {
        this.f67276a = cls;
        this.f67277b = eVar;
    }

    @Override // h31.e
    public final T get() {
        return this.f67277b.get();
    }
}
