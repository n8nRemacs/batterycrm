package com.avito.android.publish.input_imei.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.input_imei.di.a;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputImeiModule_ProvideCurrentStepFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<CategoryPublishStep> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f236331a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f236332b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f236331a = provider;
        this.f236332b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = (C0) ((a.c.p) this.f236331a).get();
        Integer num = (Integer) this.f236332b.f393949a;
        num.getClass();
        d.f236322a.getClass();
        return c02.re(num);
    }
}
