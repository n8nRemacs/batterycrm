package com.avito.android.evidence_request.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import cA.InterfaceC26995a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.evidence_request_public.EvidenceRequestLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: EvidenceRequestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/deeplink/a;", "Lev/a;", "Lcom/avito/android/evidence_request_public/EvidenceRequestLink;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<EvidenceRequestLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f148216f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC26995a f148217g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f148218h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f148219i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: EvidenceRequestDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.evidence_request.deeplink.a$a, reason: collision with other inner class name */
    public static final class C4342a<T> implements r {
        public C4342a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: EvidenceRequestDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b c4379b;
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437156b == 0) {
                c4379b = EvidenceRequestLink.b.a.f149214b;
            } else {
                Intent intent = c47918a.f437157c;
                c4379b = new EvidenceRequestLink.b.C4379b(intent != null ? intent.getStringExtra("status_message") : null);
            }
            a.this.j(c4379b);
        }
    }

    @Inject
    public a(@k a.b bVar, @k InterfaceC26995a interfaceC26995a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f148216f = bVar;
        this.f148217g = interfaceC26995a;
        this.f148218h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        EvidenceRequestLink evidenceRequestLink = (EvidenceRequestLink) deepLink;
        this.f148218h.J(this.f148217g.a(evidenceRequestLink.f149211b, evidenceRequestLink.f149212c, evidenceRequestLink.f149213d), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f148219i.b(this.f148216f.Q().N(new C4342a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f148219i.e();
    }
}
