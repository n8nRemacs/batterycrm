package com.avito.android.evidence_request.details.di;

import android.app.Application;
import com.avito.android.evidence_request.AppealId;
import com.avito.android.evidence_request.details.di.C30376a;
import com.avito.android.photo_list_view.C33217k;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.InterfaceC33220n;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EvidenceFilesUploadModule_ProvideImageListInteractor$_avito_evidence_request_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class z implements dagger.internal.h<InterfaceC33214h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148434a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148435b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.photo_list_view.r f148436c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Application> f148437d;

    public z(Provider provider, Provider provider2, com.avito.android.photo_list_view.r rVar, Provider provider3) {
        this.f148434a = provider;
        this.f148435b = provider2;
        this.f148436c = rVar;
        this.f148437d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = (AppealId) ((C30376a.b.c) this.f148434a).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C30376a.b.u) this.f148435b).get();
        InterfaceC33220n interfaceC33220n = (InterfaceC33220n) this.f148436c.get();
        Application application = (Application) ((C30376a.b.d) this.f148437d).get();
        w.f148426a.getClass();
        return new C33217k(appealId.f148206b, interfaceC35745a5, interfaceC33220n, application.getContentResolver(), true);
    }
}
