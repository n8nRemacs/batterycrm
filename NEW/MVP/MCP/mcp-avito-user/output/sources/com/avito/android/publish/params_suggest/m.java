package com.avito.android.publish.params_suggest;

import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import dl0.InterfaceC39749a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ParamsSuggestionsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f238228a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f238229b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f238230c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f238231d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<AttributesTreeConverter> f238232e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f238233f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C50213a> f238234g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f238235h;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f238228a = provider;
        this.f238229b = provider2;
        this.f238230c = provider3;
        this.f238231d = provider4;
        this.f238232e = provider5;
        this.f238233f = provider6;
        this.f238234g = provider7;
        this.f238235h = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f238228a.get(), this.f238229b.get(), this.f238230c.get(), this.f238231d.get(), this.f238232e.get(), this.f238233f.get(), this.f238234g.get(), (com.avito.android.publish.params_suggest.converter.a) this.f238235h.get());
    }
}
