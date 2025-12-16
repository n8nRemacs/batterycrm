package com.avito.android.evidence_request.details.di;

import com.avito.android.account.G;
import com.avito.android.evidence_request.AppealId;
import com.avito.android.evidence_request.details.di.C30376a;
import com.avito.android.remote.K;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideRequestUploadInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<com.avito.android.evidence_request.details.y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AppealId> f148419a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<K> f148420b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G> f148421c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f148422d;

    public t(Provider<AppealId> provider, Provider<K> provider2, Provider<G> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f148419a = provider;
        this.f148420b = provider2;
        this.f148421c = provider3;
        this.f148422d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AppealId appealId = (AppealId) ((C30376a.b.c) this.f148419a).get();
        K k12 = (K) ((C30376a.b.j) this.f148420b).get();
        G g12 = (G) ((C30376a.b.C4345a) this.f148421c).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C30376a.b.u) this.f148422d).get();
        s.f148418a.getClass();
        return new com.avito.android.evidence_request.details.z(appealId, k12, g12, interfaceC35745a5);
    }
}
