package com.avito.android.publish.price_list.di;

import com.avito.android.publish.objects.P0;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListModule_ProvideObjectParametersFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<ObjectsParameter> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f238523a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238524b;

    public s(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f238523a = lVar;
        this.f238524b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f238523a.f393949a;
        P0 p02 = (P0) this.f238524b.get();
        n.f238518a.getClass();
        ObjectsParameter objectsParameterB = p02.b(str);
        dagger.internal.t.d(objectsParameterB);
        return objectsParameterB;
    }
}
