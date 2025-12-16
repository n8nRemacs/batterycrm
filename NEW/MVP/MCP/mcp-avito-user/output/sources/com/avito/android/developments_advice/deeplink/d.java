package com.avito.android.developments_advice.deeplink;

import Fc1.E0;
import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.ConsultationStartLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.gsm_realty_trx_flow.public_module.link.GsmRealtyTrxFlowLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.phone_confirmation.P;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.g;
import l41.r;
import lw.InterfaceC43836a;
import ow.InterfaceC44946a;
import qw.AbstractC47454a;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ConsultationStartLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ConsultationStartLink;", "a", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC40161a<ConsultationStartLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f136022f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f136023g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final P f136024h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC44946a f136025i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f136026j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.i f136027k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.g f136028l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC43836a f136029m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f136030n;

    /* renamed from: r, reason: collision with root package name */
    @l
    public CallInterval f136034r;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f136031o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @k
    public String f136032p = "";

    /* renamed from: q, reason: collision with root package name */
    @k
    public String f136033q = "";

    /* renamed from: s, reason: collision with root package name */
    @k
    public String f136035s = "";

    /* compiled from: ConsultationStartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/d$a;", "LJu/c$b;", "<init>", "()V", "a", "b", "c", "d", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements InterfaceC14249c.b {

        /* compiled from: ConsultationStartLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/d$a$a;", "LJu/a$a;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_advice.deeplink.d$a$a, reason: collision with other inner class name */
        public static final class C4114a implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4114a f136036b = new C4114a();
        }

        /* compiled from: ConsultationStartLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/d$a$b;", "LJu/a$b;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f136037b = new b();
        }

        /* compiled from: ConsultationStartLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/d$a$c;", "LJu/a$b;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f136038b = new c();
        }

        /* compiled from: ConsultationStartLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_advice/deeplink/d$a$d;", "LJu/a$a;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_advice.deeplink.d$a$d, reason: collision with other inner class name */
        public static final class C4115d implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4115d f136039b = new C4115d();
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConsultationStartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(d.this);
        }
    }

    /* compiled from: ConsultationStartLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = ((C47918a) obj).f437156b;
            d dVar = d.this;
            if (i12 != -1) {
                dVar.j(a.b.f136037b);
                return;
            }
            ConsultationStartLink consultationStartLinkC = dVar.c();
            if (consultationStartLinkC != null) {
                dVar.k(consultationStartLinkC, dVar.f136032p, dVar.f136033q, dVar.f136034r, dVar.f136035s, "", "");
            }
        }
    }

    /* compiled from: ConsultationStartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.developments_advice.deeplink.d$d, reason: collision with other inner class name */
    public static final class C4116d<T> implements g {
        public C4116d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d dVar = d.this;
            dVar.f136028l.g(dVar.d(), true);
        }
    }

    /* compiled from: ConsultationStartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lqw/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f136044c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f136045d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f136046e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ConsultationStartLink f136047f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f136048g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f136049h;

        public e(String str, String str2, String str3, ConsultationStartLink consultationStartLink, String str4, String str5) {
            this.f136044c = str;
            this.f136045d = str2;
            this.f136046e = str3;
            this.f136047f = consultationStartLink;
            this.f136048g = str4;
            this.f136049h = str5;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            d dVar = d.this;
            if (!z12) {
                if (typedResult instanceof TypedResult.Error) {
                    TypedResult.Error error = (TypedResult.Error) typedResult;
                    a.i.C4057a.e(dVar.f136027k, error.getError().getF244063c(), new f.c(error.getError()), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                    dVar.j(a.C4114a.f136036b);
                    return;
                }
                return;
            }
            AbstractC47454a abstractC47454a = (AbstractC47454a) ((TypedResult.Success) typedResult).getResult();
            if (!(abstractC47454a instanceof AbstractC47454a.b)) {
                if (abstractC47454a instanceof AbstractC47454a.C12345a) {
                    a.i.C4057a.e(dVar.f136027k, ((AbstractC47454a.C12345a) abstractC47454a).getMessage(), f.a.f125253a, 0, ToastBarPosition.f181047e, 942);
                    dVar.j(a.C4114a.f136036b);
                    return;
                } else {
                    if (abstractC47454a instanceof AbstractC47454a.c) {
                        dVar.f136022f.J(dVar.f136024h.a("+" + this.f136049h, null, false, true), C48421d.a(dVar), com.avito.android.deeplink_handler.view.c.f134589l);
                        return;
                    }
                    return;
                }
            }
            AbstractC47454a.b bVar = (AbstractC47454a.b) abstractC47454a;
            String successToastMessage = bVar.getSuccessToastMessage();
            if (successToastMessage == null) {
                successToastMessage = "Мы получили заявку. Консультант перезвонит вам в течение двух рабочих дней";
            }
            a.i.C4057a.e(dVar.f136027k, successToastMessage, f.a.f125253a, 0, ToastBarPosition.f181047e, 942);
            String phoneHash = bVar.getPhoneHash();
            ConsultationStartLink consultationStartLink = this.f136047f;
            AnalyticsData analyticsData = consultationStartLink.f133120g;
            String locationId = analyticsData != null ? analyticsData.getLocationId() : null;
            AnalyticsData analyticsData2 = consultationStartLink.f133120g;
            dVar.f136029m.a(this.f136044c, this.f136045d, this.f136046e, locationId, analyticsData2 != null ? analyticsData2.getFromPage() : null, analyticsData2 != null ? analyticsData2.getNodeType() : null, phoneHash, consultationStartLink.f133119f, analyticsData2 != null ? analyticsData2.getMarketingParams() : null, consultationStartLink.f133123j, this.f136048g, consultationStartLink.f133127n);
            b.a.a(dVar.f136030n, new GsmRealtyTrxFlowLink(), null, null, 6);
            dVar.j(a.c.f136038b);
        }
    }

    /* compiled from: ConsultationStartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Can't request consultation", (Throwable) obj);
            d.this.j(a.C4114a.f136036b);
        }
    }

    @Inject
    public d(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k P p12, @k InterfaceC44946a interfaceC44946a, @k InterfaceC35745a5 interfaceC35745a5, @k a.i iVar, @k a.g gVar, @k InterfaceC43836a interfaceC43836a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f136022f = interfaceC4053a;
        this.f136023g = bVar;
        this.f136024h = p12;
        this.f136025i = interfaceC44946a;
        this.f136026j = interfaceC35745a5;
        this.f136027k = iVar;
        this.f136028l = gVar;
        this.f136029m = interfaceC43836a;
        this.f136030n = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String string;
        String string2;
        String string3;
        ConsultationStartLink consultationStartLink = (ConsultationStartLink) deepLink;
        String string4 = consultationStartLink.f133121h;
        if (string4 == null) {
            string4 = bundle != null ? bundle.getString("consultation_start_link_argument_name") : null;
            if (string4 == null) {
                string4 = "";
            }
        }
        this.f136032p = string4;
        String string5 = consultationStartLink.f133122i;
        if (string5 == null) {
            string5 = bundle != null ? bundle.getString("consultation_start_link_argument_phone") : null;
            if (string5 == null) {
                string5 = "";
            }
        }
        this.f136033q = string5;
        if (bundle == null || (string = bundle.getString("consultation_start_link_argument_question")) == null) {
            string = consultationStartLink.f133124k;
        }
        if (string == null) {
            string = "";
        }
        this.f136035s = string;
        this.f136034r = bundle != null ? (CallInterval) bundle.getParcelable("consultation_start_link_argument_time_interval") : null;
        String str2 = ((bundle == null || (string2 = bundle.getString("consultation_start_link_argument_form_title")) == null) && (string2 = consultationStartLink.f133125l) == null) ? "" : string2;
        String str3 = ((bundle == null || (string3 = bundle.getString("consultation_start_link_argument_form_subtitle")) == null) && (string3 = consultationStartLink.f133126m) == null) ? "" : string3;
        boolean z12 = bundle != null ? bundle.getBoolean("consultation_start_link_track_submit_event") : false;
        if (this.f136033q.length() == 0) {
            j(a.C4115d.f136039b);
            return;
        }
        if (z12) {
            this.f136029m.b(consultationStartLink);
        }
        k(consultationStartLink, this.f136032p, this.f136033q, this.f136034r, this.f136035s, str2, str3);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f136031o.b(this.f136023g.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f136031o.e();
    }

    public final void k(ConsultationStartLink consultationStartLink, String str, String str2, CallInterval callInterval, String str3, String str4, String str5) {
        String string = C43066x.G0(str2).toString();
        String str6 = consultationStartLink.f133121h;
        String str7 = str6 == null ? str : str6;
        AnalyticsData analyticsData = consultationStartLink.f133120g;
        String fromPage = analyticsData != null ? analyticsData.getFromPage() : null;
        String marketingParams = analyticsData != null ? analyticsData.getMarketingParams() : null;
        Boolean boolValueOf = callInterval != null ? Boolean.valueOf(callInterval.getAsSoonAsPossible()) : null;
        String fromByCalltrackingOffset = callInterval != null ? callInterval.getFromByCalltrackingOffset() : null;
        String toByCalltrackingOffset = callInterval != null ? callInterval.getToByCalltrackingOffset() : null;
        String str8 = consultationStartLink.f133118e;
        String str9 = consultationStartLink.f133119f;
        InterfaceC44946a interfaceC44946a = this.f136025i;
        String str10 = consultationStartLink.f133115b;
        String str11 = consultationStartLink.f133116c;
        String str12 = consultationStartLink.f133117d;
        I<TypedResult<AbstractC47454a>> iA2 = interfaceC44946a.a(string, str7, str3, null, str10, str11, str12, str8, str9, fromPage, marketingParams, boolValueOf, fromByCalltrackingOffset, toByCalltrackingOffset, str4, str5);
        InterfaceC35745a5 interfaceC35745a5 = this.f136026j;
        this.f136031o.b(new C42017o(iA2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new C4116d()), new E0(this, 20)).x(new e(str10, str11, str12, consultationStartLink, str3, string), new f()));
    }
}
