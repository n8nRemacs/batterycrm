package com.avito.android.advert.item.properties;

import com.avito.android.util.Kundle;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PropertiesDialogPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<PropertiesDialogPresenterImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final c f78287a;

    /* renamed from: b, reason: collision with root package name */
    public final l f78288b;

    public h(c cVar, l lVar) {
        this.f78287a = cVar;
        this.f78288b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new PropertiesDialogPresenterImpl(dagger.internal.g.b(this.f78287a), (Kundle) this.f78288b.f393949a);
    }
}
