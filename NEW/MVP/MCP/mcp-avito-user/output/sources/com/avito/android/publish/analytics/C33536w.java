package com.avito.android.publish.analytics;

import Cd0.A0;
import Cd0.C;
import Cd0.C0;
import Cd0.C13250a;
import Cd0.C13251a0;
import Cd0.C13252b;
import Cd0.C13253b0;
import Cd0.C13256d;
import Cd0.C13258e;
import Cd0.C13259e0;
import Cd0.C13260f;
import Cd0.C13261f0;
import Cd0.C13262g;
import Cd0.C13263g0;
import Cd0.C13264h;
import Cd0.C13266i;
import Cd0.C13268j;
import Cd0.C13270k;
import Cd0.C13272l;
import Cd0.C13274m;
import Cd0.C13276n;
import Cd0.C13278o;
import Cd0.C13285s;
import Cd0.C13287u;
import Cd0.C13288v;
import Cd0.C13290x;
import Cd0.C13292z;
import Cd0.D0;
import Cd0.E;
import Cd0.E0;
import Cd0.J0;
import Cd0.L0;
import Cd0.N0;
import Cd0.r;
import Cd0.t0;
import Cd0.u0;
import Cd0.w0;
import Cd0.x0;
import Cd0.y0;
import Dd0.C13388a;
import Ed0.C13476a;
import android.annotation.SuppressLint;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.events.j;
import com.avito.android.analytics.publish.FromPage;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import com.avito.android.publish.O0;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.publish.analytics.events.CommissionInfoSeenEvent;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.MicroCategoryIds;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.NavigationKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.base.BaseEditableParameter;
import com.avito.android.remote.model.category_parameters.base.BaseParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.BaseSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaButtonAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.validation.n1;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import yc.C50213a;

/* compiled from: PublishEventTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/publish/analytics/w;", "Lcom/avito/android/publish/analytics/h;", "Lcom/avito/android/publish/analytics/s;", "Lcom/avito/android/publish/analytics/p;", "Lcom/avito/android/publish/analytics/b0;", "Lcom/avito/android/publish/analytics/Y;", "Lcom/avito/android/publish/analytics/e0;", "Lcom/avito/android/publish/analytics/y;", "Lcom/avito/android/publish/analytics/B;", "Lcom/avito/android/publish/analytics/P;", "Lcom/avito/android/publish/analytics/v;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* renamed from: com.avito.android.publish.analytics.w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33536w implements InterfaceC33522h, InterfaceC33532s, InterfaceC33530p, b0, Y, e0, InterfaceC33538y, B, P, InterfaceC33535v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232281a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f232283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Gson f232284d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33522h f232285e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33532s f232286f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33530p f232287g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final b0 f232288h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y f232289i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final e0 f232290j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33538y f232291k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final B f232292l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final P f232293m;

    /* compiled from: PublishEventTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.analytics.w$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f232294a;

        static {
            int[] iArr = new int[AdvertisementCategoryAlias.values().length];
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_TRANSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_CONSTRUCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_GARDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_BEAUTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_REPAIR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_COURSES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_INSTALLATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_CLEANING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_EVENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_PHOTOGRAPHY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdvertisementCategoryAlias.NO_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f232294a = iArr;
        }
    }

    @Inject
    public C33536w(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.avito.android.analytics.provider.a aVar, @com.avito.android.publish.drafts.di.a @Y61.k Gson gson, @Y61.k InterfaceC33522h interfaceC33522h, @Y61.k InterfaceC33532s interfaceC33532s, @Y61.k InterfaceC33530p interfaceC33530p, @Y61.k b0 b0Var, @Y61.k Y y12, @Y61.k e0 e0Var, @Y61.k InterfaceC33538y interfaceC33538y, @Y61.k B b12, @Y61.k P p12) {
        this.f232281a = interfaceC28373a;
        this.f232282b = c50213a;
        this.f232283c = aVar;
        this.f232284d = gson;
        this.f232285e = interfaceC33522h;
        this.f232286f = interfaceC33532s;
        this.f232287g = interfaceC33530p;
        this.f232288h = b0Var;
        this.f232289i = y12;
        this.f232290j = e0Var;
        this.f232291k = interfaceC33538y;
        this.f232292l = b12;
        this.f232293m = p12;
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void A(@Y61.l String str) {
        this.f232290j.A(str);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void A0(@Y61.k C13290x.a aVar) {
        this.f232281a.c(new C13290x(this.f232282b, aVar));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void B(@Y61.l String str) {
        this.f232290j.B(str);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void B0() {
        this.f232281a.c(new C13288v(this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void C(@Y61.l Integer num, @Y61.k O0 o02) {
        if (String.valueOf(num).equals(CategoryIds.AUTO.MOTO.getId())) {
            MicroCategoryIds microCategoryIds = MicroCategoryIds.INSTANCE;
            List<String> mopeds_and_scooters = microCategoryIds.getMOPEDS_AND_SCOOTERS();
            String str = o02.f231952b;
            if (C42745f0.r(mopeds_and_scooters, str) || C42745f0.r(microCategoryIds.getMOTORCYCLES(), str)) {
                this.f232281a.c(new C13278o());
            }
        }
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void C0(@Y61.l Integer num) {
        if (kotlin.jvm.internal.L.f(num, this.f232282b.f443214f) || num == null) {
            return;
        }
        this.f232282b.f443214f = num;
        this.f232281a.c(new D0(num.intValue()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void D() {
        this.f232281a.c(new N0(this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.B
    public final void D0(long j12, @Y61.k ArrayList arrayList) {
        this.f232292l.D0(j12, arrayList);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void E() {
        this.f232281a.c(new C13388a(this.f232282b.b()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void E0() {
        this.f232281a.c(new com.avito.android.analytics.events.i(this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.P
    public final void F(@Y61.k String str, @Y61.k String str2) {
        this.f232293m.F(str, str2);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void F0(@Y61.l ArrayList arrayList, @Y61.k Navigation navigation2, @Y61.l String str) {
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n1.a aVar = (n1.a) it.next();
            arrayList2.add(new u0.a(aVar.f319402a, aVar.f319403b, aVar.f319404c, aVar.f319407f));
        }
        Gson gson = this.f232284d;
        String strL = gson.l(arrayList2);
        List<Integer> categoryIds = navigation2.getCategoryIds();
        List<Map<String, String>> attributes = navigation2.getAttributes();
        this.f232281a.c(new u0(this.f232282b, strL, categoryIds, attributes != null ? NavigationKt.toAnalyticsFormat(attributes, gson) : null, str));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void G(float f12, @Y61.k CommissionInfoSeenEvent.Source source) {
        InterfaceC28373a interfaceC28373a = this.f232281a;
        String str = this.f232282b.f443213e;
        interfaceC28373a.c(new CommissionInfoSeenEvent(str != null ? C43066x.z0(str) : null, this.f232282b.b(), f12, source));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void G0(boolean z12) {
        this.f232281a.c(new Dd0.f(this.f232282b.b(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void H(@Y61.k String str) {
        this.f232281a.c(new J0(this.f232282b, str));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void H0(int i12, boolean z12) {
        this.f232285e.H0(i12, z12);
    }

    @Override // com.avito.android.publish.analytics.Y
    public final void I() {
        this.f232289i.I();
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void I0(@Y61.l Float f12, @Y61.l String str, @Y61.l Long l12) {
        this.f232290j.I0(f12, str, l12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void J() {
        this.f232281a.c(new C13261f0(this.f232282b.c()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void J0(boolean z12) {
        this.f232286f.J0(z12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void K(@Y61.k Navigation navigation2) {
        InterfaceC28373a interfaceC28373a = this.f232281a;
        FromPage fromPage = this.f232282b.f443212d;
        Integer categoryId = navigation2.getCategoryId();
        String analyticsFormat = null;
        String string = categoryId != null ? categoryId.toString() : null;
        String group = navigation2.getGroup();
        List<Map<String, String>> attributes = navigation2.getAttributes();
        if (attributes != null) {
            if (attributes.isEmpty()) {
                attributes = null;
            }
            if (attributes != null) {
                analyticsFormat = NavigationKt.toAnalyticsFormat(attributes, this.f232284d);
            }
        }
        interfaceC28373a.c(new C0(fromPage, string, group, analyticsFormat));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void K0(boolean z12) {
        this.f232286f.K0(z12);
    }

    @Override // com.avito.android.publish.analytics.Y
    public final void L(@Y61.k ArrayList arrayList) {
        this.f232289i.L(arrayList);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void L0(@Y61.k String str) {
        String strK = AK.c.k("Attempt to invoke method \n            | com.avito.android.publish.details.ItemDetailsOverlayPanel.showError(", str, ") \n            | on a null object reference");
        this.f232281a.c(new NonFatalErrorEvent(strK, new NullPointerException(strK), null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void M() {
        this.f232281a.c(new C13259e0(this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void M0(@Y61.k String str) {
        this.f232286f.M0(str);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void N(@Y61.k E.a aVar) {
        this.f232281a.c(new Cd0.E(this.f232282b, aVar));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void O(@Y61.k Navigation navigation2, @Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        List<Integer> categoryIds = navigation2.getCategoryIds();
        List<Map<String, String>> attributes = navigation2.getAttributes();
        this.f232281a.c(new A0(str, str2, str4, categoryIds, attributes != null ? NavigationKt.toAnalyticsFormat(attributes, this.f232284d) : null, this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void P(@Y61.k String str) {
        this.f232281a.c(new Dd0.e(this.f232282b.b(), str));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void Q(@Y61.l Boolean bool) {
        this.f232281a.c(new C13476a(bool));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void R(@Y61.k Navigation navigation2, @Y61.k String str) {
        List<Map<String, String>> attributes = navigation2.getAttributes();
        this.f232281a.c(new y0(str, attributes != null ? NavigationKt.toAnalyticsFormat(attributes, this.f232284d) : null, this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33530p
    public final void S(boolean z12) {
        this.f232287g.S(z12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void T() {
        CallsPopupType callsPopupType = CallsPopupType.f164277b;
        IacEnablingScenario iacEnablingScenario = IacEnablingScenario.f164281b;
        this.f232285e.T();
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void U() {
        this.f232281a.c(new Dd0.h(this.f232282b.b()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void V(boolean z12) {
        this.f232286f.V(z12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void W(boolean z12, boolean z13) {
        this.f232285e.W(z12, z13);
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void X(@Y61.l Integer num, @Y61.l String str, @Y61.l String str2) {
        this.f232290j.X(num, str, str2);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void Y(boolean z12, @Y61.k IacPermissionRequestSource iacPermissionRequestSource) {
        this.f232285e.Y(z12, iacPermissionRequestSource);
    }

    @Override // com.avito.android.publish.analytics.P
    public final void Z() {
        this.f232293m.Z();
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void a(@Y61.l Integer num, @Y61.l String str, @Y61.l String str2) {
        this.f232290j.a(num, str, str2);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void a0(boolean z12) {
        this.f232286f.a0(z12);
    }

    @Override // com.avito.android.publish.analytics.b0
    public final void b(@Y61.l CpaButtonAction cpaButtonAction) {
        this.f232288h.b(cpaButtonAction);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33530p
    public final void b0(boolean z12) {
        this.f232287g.b0(z12);
    }

    @Override // com.avito.android.publish.analytics.P
    public final void c() {
        this.f232293m.c();
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void c0(boolean z12) {
        this.f232281a.c(new Cd0.Y(this.f232282b.c(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void d(@Y61.k String str) {
        this.f232281a.c(new Dd0.d(this.f232282b.b(), str));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void d0() {
        this.f232281a.c(new L0(this.f232282b.f443213e));
    }

    @Override // com.avito.android.publish.analytics.b0
    public final void e() {
        this.f232288h.e();
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void e0(@Y61.l Integer num) {
        this.f232281a.c(new C13251a0(num, this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void f() {
        this.f232286f.f();
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void f0() {
        CallsPopupType callsPopupType = CallsPopupType.f164277b;
        IacEnablingScenario iacEnablingScenario = IacEnablingScenario.f164281b;
        this.f232285e.f0();
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void g(@Y61.k C.a aVar) {
        this.f232281a.c(new Cd0.C(this.f232282b, aVar));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void g0(@Y61.l Integer num, boolean z12) {
        this.f232290j.g0(num, z12);
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void h(@Y61.l String str, boolean z12) {
        this.f232290j.h(str, z12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void h0() {
        this.f232281a.c(new Dd0.j(this.f232282b.b()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void i(int i12, @Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
        this.f232281a.c(new x0(this.f232282b, str, i12, str2, str3));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void i0(@Y61.k AdvertisementCategoryAlias advertisementCategoryAlias) {
        int i12 = a.f232294a[advertisementCategoryAlias.ordinal()];
        InterfaceC28373a interfaceC28373a = this.f232281a;
        switch (i12) {
            case 1:
                interfaceC28373a.c(new C13276n());
                break;
            case 2:
                interfaceC28373a.c(new C13262g());
                break;
            case 3:
                interfaceC28373a.c(new C13268j());
                break;
            case 4:
                interfaceC28373a.c(new C13258e());
                break;
            case 5:
                interfaceC28373a.c(new C13274m());
                break;
            case 6:
                interfaceC28373a.c(new C13264h());
                break;
            case 7:
                interfaceC28373a.c(new C13270k());
                break;
            case 8:
                interfaceC28373a.c(new C13260f());
                break;
            case 9:
                interfaceC28373a.c(new C13266i());
                break;
            case 10:
                interfaceC28373a.c(new C13272l());
                break;
        }
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void j(@Y61.k String str) {
        this.f232281a.c(new Cd0.X(this.f232282b, str));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void j0() {
        this.f232281a.c(new C13250a(this.f232282b.b(), this.f232282b.f443213e, this.f232282b.f443212d));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void k() {
        this.f232286f.k();
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void k0(@Y61.k String str, @Y61.k ParameterSlot parameterSlot, @Y61.k Navigation navigation2, @Y61.l String str2, @Y61.l String str3) {
        ArrayList arrayList;
        List<Constraint> constraints;
        AttributedText motivation;
        Object value;
        String id2 = parameterSlot.getId();
        boolean z12 = parameterSlot instanceof BaseSlot;
        String str4 = z12 ? "slot" : "parameter";
        String strValue = z12 ? ((BaseSlot) parameterSlot).getSlotType().getStrValue() : parameterSlot.getClass().getSimpleName();
        String strL = this.f232284d.l(navigation2);
        String str5 = str2 == null ? "Unknown step" : str2;
        BaseEditableParameter baseEditableParameter = parameterSlot instanceof BaseEditableParameter ? (BaseEditableParameter) parameterSlot : null;
        String string = (baseEditableParameter == null || (value = baseEditableParameter.getValue()) == null) ? null : value.toString();
        BaseParameter baseParameter = parameterSlot instanceof BaseParameter ? (BaseParameter) parameterSlot : null;
        String text = (baseParameter == null || (motivation = baseParameter.getMotivation()) == null) ? null : motivation.getText();
        HasConstraints hasConstraints = parameterSlot instanceof HasConstraints ? (HasConstraints) parameterSlot : null;
        if (hasConstraints == null || (constraints = hasConstraints.getConstraints()) == null) {
            arrayList = null;
        } else {
            List<Constraint> list = constraints;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Constraint) it.next()).toAnalyticsValue());
            }
            arrayList = arrayList2;
        }
        this.f232281a.c(new w0(this.f232282b, str, id2, str4, strValue, strL, str5, string, str3, text, arrayList));
    }

    @Override // com.avito.android.publish.analytics.Y
    public final void l(@Y61.l ArrayList arrayList) {
        this.f232289i.l(arrayList);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void l0() {
        this.f232281a.c(new com.avito.android.analytics.events.b(this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void m() {
        this.f232281a.c(new Dd0.i(this.f232282b.b()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void m0(boolean z12) {
        this.f232286f.m0(z12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33530p
    public final void n(boolean z12) {
        this.f232287g.n(z12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void n0(@Y61.k AddressChoiceType addressChoiceType, @Y61.k AddressParameter.Value value) {
        this.f232281a.c(new C13252b(this.f232282b, addressChoiceType, value));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void o() {
        this.f232281a.c(new Dd0.c(this.f232282b.b()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void o0(@Y61.l String str, @Y61.l String str2) {
        this.f232281a.c(new C13263g0(str, str2, null, this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void p() {
        this.f232281a.c(new Dd0.b(this.f232282b.b()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void p0() {
        this.f232281a.c(new C13285s(this.f232282b.b()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void q() {
        r.d dVar = new r.d();
        InterfaceC28373a interfaceC28373a = this.f232281a;
        interfaceC28373a.c(dVar);
        interfaceC28373a.c(new Cd0.G(this.f232282b.c()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33538y
    public final void q0(@Y61.k List<String> list, @Y61.k List<String> list2) {
        this.f232291k.q0(list, list2);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void r(@Y61.k String str, @Y61.l Throwable th2, @Y61.k NonFatalErrorEvent.a aVar) {
        this.f232281a.c(new NonFatalErrorEvent(str, th2, null, aVar, 4, null));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void r0() {
        this.f232281a.c(new Ed0.c(this.f232282b.f443213e));
    }

    @Override // com.avito.android.publish.analytics.b0
    public final void s(@Y61.l CpaButtonAction cpaButtonAction) {
        this.f232288h.s(cpaButtonAction);
    }

    @Override // com.avito.android.publish.analytics.Y
    public final void s0(@Y61.l String str) {
        this.f232289i.s0(str);
    }

    @Override // com.avito.android.publish.analytics.P
    public final void t() {
        this.f232293m.t();
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void t0(@Y61.l Float f12, @Y61.l String str, @Y61.l Long l12) {
        this.f232290j.t0(f12, str, l12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void u(@Y61.k C13292z.a aVar) {
        this.f232281a.c(new C13292z(this.f232282b, aVar));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void u0(boolean z12) {
        this.f232281a.c(new Ed0.d(z12, this.f232282b.f443213e));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void v(@Y61.l Float f12, @Y61.l String str, @Y61.l Long l12, @Y61.k Throwable th2) {
        this.f232290j.v(f12, str, l12, th2);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void v0(@Y61.k AddressChoiceType addressChoiceType) {
        if (this.f232282b.f443215g == null || !kotlin.jvm.internal.L.f(this.f232282b.f443215g, this.f232282b.b())) {
            this.f232281a.c(new Cd0.W(this.f232282b.b(), this.f232282b.f443213e, addressChoiceType));
            C50213a c50213a = this.f232282b;
            c50213a.f443215g = c50213a.b();
        }
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void w(@Y61.l Integer num) {
        C13256d c13256d = new C13256d();
        InterfaceC28373a interfaceC28373a = this.f232281a;
        interfaceC28373a.c(c13256d);
        if (kotlin.jvm.internal.L.f(num != null ? num.toString() : null, CategoryIds.JOB.VACANCY.getId())) {
            interfaceC28373a.c(new C13287u());
        }
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void w0(@Y61.k SuggestAnalyticsEvent suggestAnalyticsEvent) {
        com.avito.android.analytics.events.d.f90154c.getClass();
        this.f232281a.c(new com.avito.android.analytics.events.d(suggestAnalyticsEvent.getId(), suggestAnalyticsEvent.getVersion(), suggestAnalyticsEvent.getParameters(), null));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void x(@Y61.k j.a aVar) {
        this.f232281a.c(new com.avito.android.analytics.events.j(this.f232282b, aVar));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33538y
    public final void x0(boolean z12) {
        this.f232291k.x0(z12);
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void y(@Y61.k String str, @Y61.l String str2) {
        this.f232281a.c(new Cd0.s0(str, str2, this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void y0(@Y61.k Navigation navigation2) {
        Integer categoryId = navigation2.getCategoryId();
        String string = categoryId != null ? categoryId.toString() : null;
        List<Integer> categoryIds = navigation2.getCategoryIds();
        String strB = this.f232282b.b();
        List<Map<String, String>> attributes = navigation2.getAttributes();
        this.f232281a.c(new E0(string, categoryIds, strB, attributes != null ? NavigationKt.toAnalyticsFormat(attributes, this.f232284d) : null));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void z(@Y61.l Integer num) {
        this.f232281a.c(new C13253b0(num, this.f232282b));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33535v
    public final void z0(int i12) {
        this.f232281a.c(new t0(i12, this.f232282b.c()));
    }
}
