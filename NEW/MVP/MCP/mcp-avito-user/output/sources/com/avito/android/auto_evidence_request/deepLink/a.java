package com.avito.android.auto_evidence_request.deepLink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.auto_evidence_request.AutoEvidenceRequestActivity;
import com.avito.android.auto_evidence_request.AutoEvidenceRequestOpenParams;
import com.avito.android.auto_evidence_request_public.AutoEvidenceRequestDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35961v3;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AutoEvidenceRequestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_evidence_request/deepLink/a;", "Lev/a;", "Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40161a<AutoEvidenceRequestDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Application f95042f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f95043g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f95044h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f95045i;

    /* compiled from: AutoEvidenceRequestDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.auto_evidence_request.deepLink.a$a, reason: collision with other inner class name */
    public static final class C2822a<T> implements r {
        public C2822a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: AutoEvidenceRequestDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "activityResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b c2825b;
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437155a == 0) {
                c2825b = AutoEvidenceRequestDeepLink.b.a.f95289b;
            } else {
                Intent intent = c47918a.f437157c;
                c2825b = new AutoEvidenceRequestDeepLink.b.C2825b(intent != null ? intent.getStringExtra("status_message") : null);
            }
            a.this.j(c2825b);
        }
    }

    @Inject
    public a(@k Application application, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f95042f = application;
        this.f95043g = interfaceC4053a;
        this.f95044h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutoEvidenceRequestDeepLink autoEvidenceRequestDeepLink = (AutoEvidenceRequestDeepLink) deepLink;
        AutoEvidenceRequestOpenParams autoEvidenceRequestOpenParams = new AutoEvidenceRequestOpenParams(autoEvidenceRequestDeepLink.f95287d, autoEvidenceRequestDeepLink.f95285b, autoEvidenceRequestDeepLink.f95288e, autoEvidenceRequestDeepLink.f95286c);
        AutoEvidenceRequestActivity.f95005n.getClass();
        Intent intent = new Intent(this.f95042f, (Class<?>) AutoEvidenceRequestActivity.class);
        C35961v3.b(intent, autoEvidenceRequestOpenParams);
        this.f95043g.J(intent, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f95045i = (y) this.f95044h.Q().N(new C2822a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f95045i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
