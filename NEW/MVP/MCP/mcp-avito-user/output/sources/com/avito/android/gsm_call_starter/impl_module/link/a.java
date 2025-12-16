package com.avito.android.gsm_call_starter.impl_module.link;

import Ju.AbstractC14250d;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import com.avito.android.permissions.u;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import zL.InterfaceC50481a;

/* compiled from: GsmCallStartLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gsm_call_starter/impl_module/link/a;", "Lev/a;", "Lcom/avito/android/gsm_call_starter/public_module/link/GsmCallStartLink;", "a", "_avito_gsm-call-starter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<GsmCallStartLink> {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f161219q = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f161220f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final u f161221g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f161222h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f161223i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final UH.a f161224j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.gsm_call_starter.impl_module.intent_factory.a f161225k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f161226l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final a.h f161227m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final a.i f161228n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final InterfaceC50481a f161229o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f161230p = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: GsmCallStartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/gsm_call_starter/impl_module/link/a$a;", "", "<init>", "()V", "", "CALLS_COUNT_TO_SKIP_PERMISSION_REQUEST", "I", "", "TAG", "Ljava/lang/String;", "_avito_gsm-call-starter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.gsm_call_starter.impl_module.link.a$a, reason: collision with other inner class name */
    public static final class C4718a {
        public /* synthetic */ C4718a(C42822w c42822w) {
            this();
        }

        public C4718a() {
        }
    }

    static {
        new C4718a(null);
    }

    @Inject
    public a(@k Context context, @k u uVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC28373a interfaceC28373a, @k UH.a aVar2, @k com.avito.android.gsm_call_starter.impl_module.intent_factory.a aVar3, @k a.InterfaceC4053a interfaceC4053a, @k a.h hVar, @k a.i iVar, @k InterfaceC50481a interfaceC50481a) {
        this.f161220f = context;
        this.f161221g = uVar;
        this.f161222h = aVar;
        this.f161223i = interfaceC28373a;
        this.f161224j = aVar2;
        this.f161225k = aVar3;
        this.f161226l = interfaceC4053a;
        this.f161227m = hVar;
        this.f161228n = iVar;
        this.f161229o = interfaceC50481a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        GsmCallStartLink gsmCallStartLink = (GsmCallStartLink) deepLink;
        boolean zBooleanValue = this.f161229o.a().getValue().booleanValue();
        InterfaceC28373a interfaceC28373a = this.f161223i;
        boolean z12 = false;
        if (zBooleanValue) {
            a.i.C4057a.d(this.f161228n, com.avito.android.printable_text.b.c(R.string.gsm_call_starter_impl___cant_call_during_active_call, new Serializable[0]), null, null, new f.c(new IllegalStateException(this.f161220f.getString(R.string.gsm_call_starter_impl___cant_call_during_active_call))), 0, null, null, null, 2030);
            ParametrizedEvent parametrizedEvent = gsmCallStartLink.f161255f;
            if (parametrizedEvent != null) {
                interfaceC28373a.c(a0.a(parametrizedEvent));
            }
            DeepLink deepLink2 = gsmCallStartLink.f161256g;
            if (deepLink2 != null) {
                i(GsmCallStartLink.b.a.f161257b, this.f161222h, deepLink2);
                return;
            }
            return;
        }
        if (this.f161221g.b("android.permission.CALL_PHONE")) {
            V2.f318762a.c("GsmCallStartLink", "CALL_PHONE permission is already granted early -> startCallInDialerIfPossible()", null);
            l(gsmCallStartLink);
            return;
        }
        UH.a aVar = this.f161224j;
        if (aVar.a() < 2) {
            aVar.b(aVar.a() + 1);
            z12 = true;
        }
        if (aVar.d() || z12) {
            V2.f318762a.c("GsmCallStartLink", "CALL_PHONE permission was already denied early or skipped -> openDialerIfPossible()", null);
            k(gsmCallStartLink);
            return;
        }
        V2.f318762a.c("GsmCallStartLink", "CALL_PHONE permission was never requested -> requestPermission()", null);
        aVar.c();
        interfaceC28373a.c(new SH.b());
        a.h hVar = this.f161227m;
        hVar.o0("android.permission.CALL_PHONE");
        this.f161230p.b(hVar.W1().N(b.f161231b).d0(c.f161232b).I(d.f161233b).t0(new e(this, gsmCallStartLink)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f161230p.e();
    }

    public final void k(GsmCallStartLink gsmCallStartLink) {
        String str = gsmCallStartLink.f161251b;
        com.avito.android.gsm_call_starter.impl_module.intent_factory.a aVar = this.f161225k;
        Intent intentC = aVar.c(str);
        boolean zB2 = aVar.b(intentC);
        InterfaceC28373a interfaceC28373a = this.f161223i;
        if (zB2) {
            this.f161226l.R(intentC, com.avito.android.deeplink_handler.view.b.f134588l);
            ParametrizedEvent parametrizedEvent = gsmCallStartLink.f161252c;
            if (parametrizedEvent != null) {
                interfaceC28373a.c(a0.a(parametrizedEvent));
            }
            j(AbstractC14250d.c.f9171c);
            return;
        }
        ParametrizedEvent parametrizedEvent2 = gsmCallStartLink.f161253d;
        if (parametrizedEvent2 != null) {
            interfaceC28373a.c(a0.a(parametrizedEvent2));
        }
        DeepLink deepLink = gsmCallStartLink.f161254e;
        if (deepLink != null) {
            i(GsmCallStartLink.b.C4719b.f161258b, this.f161222h, deepLink);
        }
    }

    public final void l(GsmCallStartLink gsmCallStartLink) {
        String str = gsmCallStartLink.f161251b;
        com.avito.android.gsm_call_starter.impl_module.intent_factory.a aVar = this.f161225k;
        Intent intentA = aVar.a(str);
        boolean zB2 = aVar.b(intentA);
        InterfaceC28373a interfaceC28373a = this.f161223i;
        if (zB2) {
            this.f161226l.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
            ParametrizedEvent parametrizedEvent = gsmCallStartLink.f161252c;
            if (parametrizedEvent != null) {
                interfaceC28373a.c(a0.a(parametrizedEvent));
            }
            j(AbstractC14250d.c.f9171c);
            return;
        }
        ParametrizedEvent parametrizedEvent2 = gsmCallStartLink.f161253d;
        if (parametrizedEvent2 != null) {
            interfaceC28373a.c(a0.a(parametrizedEvent2));
        }
        DeepLink deepLink = gsmCallStartLink.f161254e;
        if (deepLink != null) {
            i(GsmCallStartLink.b.C4719b.f161258b, this.f161222h, deepLink);
        }
    }
}
