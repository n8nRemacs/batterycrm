package com.avito.android.details_sheet;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DetailsSheetIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f135956a;

    public k(dagger.internal.l lVar) {
        this.f135956a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Application) this.f135956a.f393949a);
    }
}
