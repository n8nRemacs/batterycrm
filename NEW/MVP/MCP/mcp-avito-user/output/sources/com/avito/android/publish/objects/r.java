package com.avito.android.publish.objects;

import android.os.Bundle;
import com.avito.android.Q1;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.u1;
import com.avito.android.validation.d1;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ObjectFillFormInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<C33967q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u1> f238074a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f238075b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PublishParametersInteractor> f238076c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<d1> f238077d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Q1> f238078e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<CategoryParameters> f238079f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<ObjectsParameter> f238080g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f238081h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f238082i;

    public r(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f238074a = provider;
        this.f238075b = provider2;
        this.f238076c = provider3;
        this.f238077d = provider4;
        this.f238078e = provider5;
        this.f238079f = provider6;
        this.f238080g = provider7;
        this.f238081h = lVar;
        this.f238082i = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33967q(this.f238074a.get(), this.f238075b.get(), this.f238076c.get(), this.f238077d.get(), this.f238078e.get(), dagger.internal.g.b(this.f238079f), dagger.internal.g.b(this.f238080g), (Integer) this.f238081h.f393949a, (Bundle) this.f238082i.f393949a);
    }
}
