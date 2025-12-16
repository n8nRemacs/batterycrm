package Qz;

import com.avito.android.evidence_request.deeplink.c;
import com.avito.android.evidence_request.deeplink.d;
import com.avito.android.evidence_request_public.EvidenceRequestLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EvidenceDeepLinkHandlerModule_MakeEvidenceDeepLinkMappingFactory.java */
@e
@y
@x
/* renamed from: Qz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14952b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14951a f14043a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.evidence_request.deeplink.b f14044b;

    /* renamed from: c, reason: collision with root package name */
    public final d f14045c;

    public C14952b(C14951a c14951a, com.avito.android.evidence_request.deeplink.b bVar, d dVar) {
        this.f14043a = c14951a;
        this.f14044b = bVar;
        this.f14045c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f14045c.getClass();
        c cVar = new c();
        com.avito.android.evidence_request.deeplink.b bVar = this.f14044b;
        this.f14043a.getClass();
        return new C43834a(EvidenceRequestLink.class, cVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(EvidenceRequestLink.class), bVar));
    }
}
