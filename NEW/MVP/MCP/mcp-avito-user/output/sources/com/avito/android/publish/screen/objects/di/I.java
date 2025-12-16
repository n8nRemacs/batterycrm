package com.avito.android.publish.screen.objects.di;

import com.avito.android.publish.objects.P0;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import javax.inject.Provider;

/* compiled from: ObjectSupportModule_ProvideObjectParametersFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class I implements dagger.internal.h<ObjectsParameter> {

    /* renamed from: a, reason: collision with root package name */
    public final y f239559a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<String> f239560b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f239561c;

    public I(y yVar, Provider provider, dagger.internal.u uVar) {
        this.f239559a = yVar;
        this.f239560b = provider;
        this.f239561c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String str = this.f239560b.get();
        P0 p02 = (P0) this.f239561c.get();
        this.f239559a.getClass();
        ObjectsParameter objectsParameterB = p02.b(str);
        dagger.internal.t.d(objectsParameterB);
        return objectsParameterB;
    }
}
