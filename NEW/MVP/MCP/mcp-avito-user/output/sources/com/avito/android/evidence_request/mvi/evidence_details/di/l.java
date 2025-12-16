package com.avito.android.evidence_request.mvi.evidence_details.di;

import android.app.Application;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.evidence_request.mvi.evidence_details.di.a;
import com.avito.android.photo_list_view.C33217k;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.InterfaceC33220n;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideImageListInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<InterfaceC33214h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148941a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148942b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f148943c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Application> f148944d;

    public l(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f148941a = provider;
        this.f148942b = provider2;
        this.f148943c = uVar;
        this.f148944d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = (AppealId) ((a.b.c) this.f148941a).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.b.u) this.f148942b).get();
        InterfaceC33220n interfaceC33220n = (InterfaceC33220n) this.f148943c.get();
        Application application = (Application) ((a.b.d) this.f148944d).get();
        d.f148929a.getClass();
        return new C33217k(appealId.f148723b, interfaceC35745a5, interfaceC33220n, application.getContentResolver(), true);
    }
}
