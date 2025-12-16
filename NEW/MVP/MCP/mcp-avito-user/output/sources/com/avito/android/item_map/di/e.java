package com.avito.android.item_map.di;

import android.app.Application;
import com.avito.android.advert_core.contactbar.C28263b;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemMapModule_ProvideAdvertActionIconFactory$_avito_item_map_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<InterfaceC28262a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f173319a;

    public e(dagger.internal.l lVar) {
        this.f173319a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f173319a.f393949a;
        d.f173318a.getClass();
        return new C28263b(application, false, 2, null);
    }
}
