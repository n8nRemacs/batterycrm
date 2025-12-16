package com.avito.android.developments_advice.deeplink;

import Ju.AbstractC14250d;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.developments_advice.l;
import com.avito.android.developments_advice.remote.model.ConsultationFormLink;
import com.avito.android.gsm_realty_trx_flow.public_module.link.GsmRealtyTrxFlowLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ConsultationFormLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/a;", "Lev/a;", "Lcom/avito/android/developments_advice/remote/model/ConsultationFormLink;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<ConsultationFormLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f136007f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f136008g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final l f136009h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final L f136010i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f136011j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f136012k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f136013l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ConsultationFormLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.developments_advice.deeplink.a$a, reason: collision with other inner class name */
    public static final class C4113a<T> implements r {
        public C4113a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: ConsultationFormLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String stringExtra;
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            a aVar = a.this;
            if (i12 != -1) {
                aVar.j(AbstractC14250d.b.f9170c);
                return;
            }
            Intent intent = c47918a.f437157c;
            if (intent != null && (stringExtra = intent.getStringExtra("extra_message")) != null) {
                a.i.C4057a.e(aVar.f136011j, stringExtra, null, 2750, ToastBarPosition.f181047e, 926);
            }
            if (intent != null && intent.getBooleanExtra("extra_success_result", false)) {
                b.a.a(aVar.f136012k, new GsmRealtyTrxFlowLink(), null, null, 6);
            }
            aVar.j(AbstractC14250d.c.f9171c);
        }
    }

    @Inject
    public a(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k l lVar, @k L l12, @k a.i iVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f136007f = bVar;
        this.f136008g = interfaceC4053a;
        this.f136009h = lVar;
        this.f136010i = l12;
        this.f136011j = iVar;
        this.f136012k = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ConsultationFormLink consultationFormLink = (ConsultationFormLink) deepLink;
        String str2 = consultationFormLink.f136195c;
        String str3 = consultationFormLink.f136199g;
        Boolean bool = consultationFormLink.f136200h;
        this.f136008g.J(this.f136009h.a(consultationFormLink.f136194b, bool, str2, consultationFormLink.f136196d, consultationFormLink.f136197e, consultationFormLink.f136198f, str3, consultationFormLink.f136201i, consultationFormLink.f136202j).putExtra("up_intent", L.a.a(this.f136010i, null, 3)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f136013l.b(this.f136007f.Q().N(new C4113a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f136013l.e();
    }
}
