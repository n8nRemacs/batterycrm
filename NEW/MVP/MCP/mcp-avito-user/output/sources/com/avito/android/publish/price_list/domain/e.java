package com.avito.android.publish.price_list.domain;

import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListDataProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f238539a;

    public e(u uVar) {
        this.f238539a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((ObjectsParameter) this.f238539a.get());
    }
}
