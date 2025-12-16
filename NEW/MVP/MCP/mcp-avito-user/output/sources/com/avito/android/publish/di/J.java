package com.avito.android.publish.di;

import com.avito.android.Q1;
import com.avito.android.publish.C33883n0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.T0;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishParametersModule_ProvidePublishParametersInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class J implements dagger.internal.h<PublishParametersInteractor> {

    /* renamed from: a, reason: collision with root package name */
    public final I f235143a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f235144b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f235145c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f235146d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f235147e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f235148f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f235149g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Q1> f235150h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f235151i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f235152j;

    public J(I i12, dagger.internal.u uVar, Provider provider, dagger.internal.u uVar2, Provider provider2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider3, dagger.internal.u uVar5, dagger.internal.u uVar6) {
        this.f235143a = i12;
        this.f235144b = uVar;
        this.f235145c = provider;
        this.f235146d = uVar2;
        this.f235147e = provider2;
        this.f235148f = uVar3;
        this.f235149g = uVar4;
        this.f235150h = provider3;
        this.f235151i = uVar5;
        this.f235152j = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        H0 h02 = (H0) this.f235144b.get();
        C50213a c50213a = this.f235145c.get();
        PublishDraftRepository publishDraftRepository = (PublishDraftRepository) this.f235146d.get();
        CategoryParametersConverter categoryParametersConverter = this.f235147e.get();
        AttributesTreeConverter attributesTreeConverter = (AttributesTreeConverter) this.f235148f.get();
        com.avito.android.publish.drafts.E e12 = (com.avito.android.publish.drafts.E) this.f235149g.get();
        Q1 q12 = this.f235150h.get();
        InterfaceC41196a interfaceC41196a = (InterfaceC41196a) this.f235151i.get();
        T0 t02 = (T0) this.f235152j.get();
        this.f235143a.getClass();
        return new C33883n0(h02, publishDraftRepository, new H(c50213a, C50213a.class, "sessionId", "getSessionId()Ljava/lang/String;", 0), categoryParametersConverter, e12, attributesTreeConverter, q12, interfaceC41196a, t02);
    }
}
