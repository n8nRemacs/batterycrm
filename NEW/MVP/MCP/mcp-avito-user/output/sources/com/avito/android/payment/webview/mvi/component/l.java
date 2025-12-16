package com.avito.android.payment.webview.mvi.component;

import com.avito.android.payment.webview.mvi.entity.WebPaymentMviState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WebPaymentMviFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f214906a;

    /* renamed from: b, reason: collision with root package name */
    public final g f214907b;

    /* renamed from: c, reason: collision with root package name */
    public final n f214908c;

    /* renamed from: d, reason: collision with root package name */
    public final p f214909d;

    public l(i iVar, g gVar, n nVar, p pVar) {
        this.f214906a = iVar;
        this.f214907b = gVar;
        this.f214908c = nVar;
        this.f214909d = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f214906a.getClass();
        h hVar = new h();
        a aVar = (a) this.f214907b.get();
        m mVar = (m) this.f214908c.get();
        this.f214909d.getClass();
        o oVar = new o();
        WebPaymentMviState.f214919b.getClass();
        return new k("WebPaymentMvi", WebPaymentMviState.f214920c, new j(hVar, aVar, oVar, mVar));
    }
}
