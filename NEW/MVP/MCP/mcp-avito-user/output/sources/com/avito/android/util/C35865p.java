package com.avito.android.util;

import java.util.Locale;

/* compiled from: AdvertPriceFormatter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.util.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35865p implements dagger.internal.h<C35858o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f318943a;

    public C35865p(dagger.internal.u uVar) {
        this.f318943a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35858o((Locale) this.f318943a.get());
    }
}
