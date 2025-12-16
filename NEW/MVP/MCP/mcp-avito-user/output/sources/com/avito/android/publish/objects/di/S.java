package com.avito.android.publish.objects.di;

import com.avito.android.publish.objects.P0;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;

/* compiled from: ObjectFillFormModule_ProvideObjectParametersFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class S implements dagger.internal.h<ObjectsParameter> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f237667a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f237668b;

    public S(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f237667a = lVar;
        this.f237668b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f237667a.f393949a;
        P0 p02 = (P0) this.f237668b.get();
        C33939w.f238031a.getClass();
        ObjectsParameter objectsParameterB = p02.b(str);
        dagger.internal.t.d(objectsParameterB);
        return objectsParameterB;
    }
}
