package com.avito.android.settings;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f280819a;

    /* renamed from: b, reason: collision with root package name */
    public final O f280820b;

    public d(dagger.internal.l lVar, O o12) {
        this.f280819a = lVar;
        this.f280820b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Application) this.f280819a.f393949a, (L) this.f280820b.get());
    }
}
