package com.avito.android.user_advert.advert.faq;

import Tl0.InterfaceC15374a;
import com.avito.android.user_advert.advert.faq.data.m;
import com.avito.android.user_advert.advert.faq.data.n;
import com.avito.android.user_advert.advert.faq.data.q;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertFaqSurveyInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final q f308923a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15374a> f308924b;

    /* renamed from: c, reason: collision with root package name */
    public final m f308925c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.faq.data.d f308926d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f308927e;

    public h(q qVar, Provider provider, m mVar, com.avito.android.user_advert.advert.faq.data.d dVar, Provider provider2) {
        this.f308923a = qVar;
        this.f308924b = provider;
        this.f308925c = mVar;
        this.f308926d = dVar;
        this.f308927e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f308923a.get();
        InterfaceC15374a interfaceC15374a = this.f308924b.get();
        com.avito.android.user_advert.advert.faq.data.e eVar = (com.avito.android.user_advert.advert.faq.data.e) this.f308925c.get();
        this.f308926d.getClass();
        return new f(nVar, interfaceC15374a, eVar, new com.avito.android.user_advert.advert.faq.data.b(), this.f308927e.get());
    }
}
