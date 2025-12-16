package com.avito.android.sbc.di;

import dagger.internal.y;
import java.util.Locale;

/* compiled from: SbcUtilsModule_ProvideSbcNumberFormatterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class x implements dagger.internal.h<com.avito.android.sbc.utils.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f260031a;

    public x(dagger.internal.u uVar) {
        this.f260031a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = (Locale) this.f260031a.get();
        u.f260028a.getClass();
        return new com.avito.android.sbc.utils.h(locale);
    }
}
