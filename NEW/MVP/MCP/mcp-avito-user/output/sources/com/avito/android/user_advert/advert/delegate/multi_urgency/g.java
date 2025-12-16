package com.avito.android.user_advert.advert.delegate.multi_urgency;

import com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.i;
import com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.l;
import com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.p;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nH0.C44258c;
import nH0.InterfaceC44256a;

/* compiled from: MultiUrgencyPresenterDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final p f308701a;

    /* renamed from: b, reason: collision with root package name */
    public final i f308702b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308703c;

    /* renamed from: d, reason: collision with root package name */
    public final C44258c f308704d;

    /* renamed from: e, reason: collision with root package name */
    public final u f308705e;

    public g(p pVar, i iVar, u uVar, C44258c c44258c, u uVar2) {
        this.f308701a = pVar;
        this.f308702b = iVar;
        this.f308703c = uVar;
        this.f308704d = c44258c;
        this.f308705e = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((l) this.f308701a.get(), (com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.e) this.f308702b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f308703c.get(), (InterfaceC44256a) this.f308704d.get(), (R0) this.f308705e.get());
    }
}
