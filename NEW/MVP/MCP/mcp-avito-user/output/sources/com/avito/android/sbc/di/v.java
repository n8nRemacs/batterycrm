package com.avito.android.sbc.di;

import dagger.internal.y;
import java.util.Locale;

/* compiled from: SbcUtilsModule_ProvideDateUtilsFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<com.avito.android.sbc.utils.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f260029a;

    public v(dagger.internal.u uVar) {
        this.f260029a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = (Locale) this.f260029a.get();
        u.f260028a.getClass();
        return new com.avito.android.sbc.utils.g(locale);
    }
}
