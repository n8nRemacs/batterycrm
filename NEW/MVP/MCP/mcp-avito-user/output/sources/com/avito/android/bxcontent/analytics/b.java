package com.avito.android.bxcontent.analytics;

import Cx0.C13372d;
import Ho0.C14015a;
import La.C14374a;
import Nr0.InterfaceC14605a;
import ac.C19864a;
import com.avito.android.AnalyticParams;
import com.avito.android.C29640d;
import com.avito.android.S2;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.analytics.event.A0;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.analytics.event.C28404a0;
import com.avito.android.analytics.event.C28406b0;
import com.avito.android.analytics.event.C28408c0;
import com.avito.android.analytics.event.C28423k;
import com.avito.android.analytics.event.C28425l;
import com.avito.android.analytics.event.C28431o;
import com.avito.android.analytics.event.C28432o0;
import com.avito.android.analytics.event.C28433p;
import com.avito.android.analytics.event.C28434p0;
import com.avito.android.analytics.event.C28442u;
import com.avito.android.analytics.event.C28448x;
import com.avito.android.analytics.event.C28452z;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.F0;
import com.avito.android.analytics.event.G0;
import com.avito.android.analytics.event.H0;
import com.avito.android.analytics.event.L;
import com.avito.android.analytics.event.P0;
import com.avito.android.analytics.event.Q0;
import com.avito.android.analytics.event.R0;
import com.avito.android.analytics.event.T;
import com.avito.android.analytics.event.V;
import com.avito.android.analytics.event.V0;
import com.avito.android.analytics.event.W;
import com.avito.android.analytics.event.W0;
import com.avito.android.analytics.event.Z;
import com.avito.android.analytics.event.Z0;
import com.avito.android.analytics.event.b1;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.H;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.RenderMetadata;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.vertical_main.analytics.WidgetPageSource;
import com.google.android.gms.maps.model.LatLngBounds;
import ic.C41379a;
import ic.C41380b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kt.C43496a;
import kt.C43497b;
import sc.C48156e;
import yr0.C50285a;

/* compiled from: BxContentAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/analytics/b;", "Lcom/avito/android/bxcontent/analytics/a;", "LNr0/a;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.bxcontent.analytics.a, InterfaceC14605a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f109467a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.e f109468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14605a f109469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f109470d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C19864a f109471e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C29640d f109472f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final H f109473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109474h;

    /* renamed from: i, reason: collision with root package name */
    public long f109475i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C48156e f109476j = C48156e.f437918a;

    /* compiled from: BxContentAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/analytics/b$a;", "", "<init>", "()V", "", "NOTIFICATION_MESSAGE_ID", "Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BxContentAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.analytics.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3267b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109477a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.SERP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f109477a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.provider.e eVar, @Y61.k InterfaceC14605a interfaceC14605a, @Y61.k E e12, @Y61.k C19864a c19864a, @Y61.k C29640d c29640d, @Y61.k H h12) {
        this.f109467a = interfaceC28373a;
        this.f109468b = eVar;
        this.f109469c = interfaceC14605a;
        this.f109470d = e12;
        this.f109471e = c19864a;
        this.f109472f = c29640d;
        this.f109473g = h12;
        this.f109475i = eVar.a();
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void A(@Y61.k List<? extends l1> list, @Y61.k String str, boolean z12, @Y61.l String str2, @Y61.k PresentationType presentationType, @Y61.l AnalyticParams analyticParams) {
        BxContentShowEventType bxContentShowEventType;
        Map<String, String> map;
        if (this.f109474h) {
            return;
        }
        this.f109474h = true;
        if (str2 != null) {
            bxContentShowEventType = BxContentShowEventType.f109452e;
        } else if (z12) {
            bxContentShowEventType = BxContentShowEventType.f109451d;
        } else {
            switch (C3267b.f109477a[presentationType.ordinal()]) {
                case 1:
                    bxContentShowEventType = BxContentShowEventType.f109454g;
                    break;
                case 2:
                    bxContentShowEventType = BxContentShowEventType.f109450c;
                    break;
                case 3:
                    bxContentShowEventType = BxContentShowEventType.f109453f;
                    break;
                case 4:
                case 5:
                case 6:
                    bxContentShowEventType = BxContentShowEventType.f109455h;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        BxContentShowEventType bxContentShowEventType2 = bxContentShowEventType;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l1) obj) instanceof S2) {
                arrayList.add(obj);
            }
        }
        this.f109467a.c(new f(str, C42745f0.O(arrayList, ",", null, null, e.f109486l, 30), bxContentShowEventType2, str2, (analyticParams == null || (map = analyticParams.f67181b) == null) ? null : map.get("notification_message_id")));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void B(@Y61.k String str, @Y61.l String str2, @Y61.k ContactSource contactSource) {
        this.f109467a.c(new com.avito.android.analytics.call.c(str, null, str2, contactSource.f89925b ? "xs" : "s", 0, "ADVERT_DETAILS", null, this.f109471e.v().getValue().booleanValue(), 64, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void C(int i12, @Y61.k String str) {
        this.f109467a.c(new C28404a0(str, i12));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void D() {
        this.f109467a.c(new yr0.c());
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void E(@Y61.k PresentationType presentationType, @Y61.k String str) {
        String strB = d.b(presentationType);
        String strA = this.f109470d.a();
        if (strA == null) {
            strA = "";
        }
        this.f109467a.c(new BannerEvent.b(str, strB, "click", "", strA));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void F(@Y61.k String str, @Y61.k String str2) {
        this.f109467a.c(new F0(str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void G(@Y61.k String str, @Y61.l String str2, @Y61.l LatLngBounds latLngBounds, @Y61.l Integer num, @Y61.l Integer num2, @Y61.k PresentationType presentationType) {
        this.f109467a.c(new C28452z(null, latLngBounds != null ? com.avito.android.map_core.utils.d.c(latLngBounds) : null, str, str2, d.b(presentationType), num, num2, null, null, null, null, null, null, null, null, 32640, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void H(@Y61.k String str, int i12, @Y61.k PresentationType presentationType) {
        this.f109467a.c(new Z(str, "shortcut_".concat(d.b(presentationType)), i12));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void I(@Y61.k ArrayList arrayList) {
        this.f109467a.c(new com.avito.android.analytics.event.E(arrayList));
    }

    @Override // Nr0.InterfaceC14605a
    public final void J(@Y61.k WidgetPageSource widgetPageSource, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l Map map) {
        this.f109469c.J(widgetPageSource, num, num2, l12, str, str2, str3, str4, str5, str6, map);
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void K(@Y61.l String str) {
        this.f109467a.c(new l(str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void L(int i12, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f109467a.c(new Cx0.g(i12, str, str2, str5, str4, str3));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void M(int i12) {
        this.f109467a.c(new com.avito.android.map_core.analytics.event.q(i12));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void N(@Y61.l String str, @Y61.l String str2, @Y61.l ArrayList arrayList) {
        this.f109467a.c(new Cx0.h(str2, str, arrayList));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void O(@Y61.k ParametrizedEvent parametrizedEvent) {
        this.f109467a.c(a0.a(parametrizedEvent));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void P(@Y61.l String str, @Y61.l String str2, @Y61.k StoriesFromPage storiesFromPage) {
        this.f109467a.c(new C13372d(str, this.f109473g.getF253025a(), storiesFromPage.f109466b, null, str2, 8, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void Q(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str, @Y61.l String str2) {
        this.f109467a.c(new C43496a(num, num2, num3, str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void R() {
        this.f109467a.c(new C28408c0());
    }

    @Override // Nr0.InterfaceC14605a
    public final void S(@Y61.k WidgetPageSource widgetPageSource, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f109469c.S(widgetPageSource, str, str2, str3, str4, str5);
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void T(@Y61.k PresentationType presentationType, @Y61.k String str) {
        this.f109467a.c(new C28406b0(str, d.b(presentationType)));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void U(@Y61.k String str) {
        this.f109467a.c(new C28433p("b360_serp", str));
    }

    @Override // Nr0.InterfaceC14605a
    public final void V(int i12, @Y61.k WidgetPageSource widgetPageSource, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.k LinkedHashMap linkedHashMap) {
        this.f109469c.V(i12, widgetPageSource, num, num2, l12, str, str2, str3, str4, str5, str6, linkedHashMap);
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void W(@Y61.l String str) {
        this.f109467a.c(new L(str, null, null, 6, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    @Y61.k
    public final TreeClickStreamParent X(@Y61.k PresentationType presentationType) {
        return new TreeClickStreamParent(this.f109475i, d.b(presentationType), null, null);
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void Y(@Y61.k String str, boolean z12, @Y61.k PresentationType presentationType) {
        boolean zIsMap = presentationType.isMap();
        com.avito.android.analytics.provider.e eVar = this.f109468b;
        InterfaceC28373a interfaceC28373a = this.f109467a;
        if (zIsMap) {
            interfaceC28373a.c(new com.avito.android.map_core.analytics.event.a(eVar.a(), X(presentationType), str, z12));
        } else {
            interfaceC28373a.c(new C28425l(eVar.a(), X(presentationType), str, z12));
        }
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void Z(@Y61.l String str) {
        this.f109467a.c(new C50285a(str, null, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void a(@Y61.k String str, @Y61.k SearchParams searchParams, @Y61.l String str2, @Y61.l Integer num) {
        String categoryId = searchParams.getCategoryId();
        String query = searchParams.getQuery();
        Long priceMax = searchParams.getPriceMax();
        Long priceMin = searchParams.getPriceMin();
        String strA = d.a(searchParams.getOwner());
        Boolean withDeliveryOnly = searchParams.getWithDeliveryOnly();
        this.f109467a.c(new C28452z(null, null, str, categoryId, "serp", null, null, num, query, str2, priceMin, priceMax, strA, withDeliveryOnly != null ? Integer.valueOf(withDeliveryOnly.equals(Boolean.TRUE) ? 1 : 0).toString() : null, "1", 99, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void a0(@Y61.k String str, @Y61.k String str2) {
        this.f109467a.c(new j(str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void b(@Y61.l String str, @Y61.l String str2) {
        this.f109467a.c(new P0(str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void b0(@Y61.k String str) {
        this.f109467a.c(new C28431o("b360_main", str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void c(@Y61.k String str, @Y61.k String str2) {
        this.f109467a.c(new C28442u(str2, str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void c0(@Y61.l Integer num, @Y61.k String str) {
        this.f109467a.c(new T(str, str, num));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void d(@Y61.k String str, @Y61.l String str2) {
        this.f109467a.c(new com.avito.android.analytics.call.a(str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void d0(@Y61.k String str) {
        this.f109467a.c(new C28433p("avito_main_change", str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void e(@Y61.k PresentationType presentationType) {
        this.f109467a.c(new R0(d.b(presentationType)));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void e0(@Y61.l RenderMetadata renderMetadata) {
        String requestId;
        String templateSlug;
        Boolean boolIsDegraded;
        Integer targetLayoutVersion;
        Integer targetNodeID;
        Integer requestedLayoutVersion;
        Integer requestedNodeID;
        if (renderMetadata == null || (requestId = renderMetadata.getRequestId()) == null) {
            requestId = "";
        }
        boolean zBooleanValue = false;
        int templateId = renderMetadata != null ? renderMetadata.getTemplateId() : 0;
        if (renderMetadata == null || (templateSlug = renderMetadata.getTemplateSlug()) == null) {
            templateSlug = "";
        }
        Integer numValueOf = Integer.valueOf((renderMetadata == null || (requestedNodeID = renderMetadata.getRequestedNodeID()) == null) ? 0 : requestedNodeID.intValue());
        Integer numValueOf2 = Integer.valueOf((renderMetadata == null || (requestedLayoutVersion = renderMetadata.getRequestedLayoutVersion()) == null) ? 0 : requestedLayoutVersion.intValue());
        Integer numValueOf3 = Integer.valueOf((renderMetadata == null || (targetNodeID = renderMetadata.getTargetNodeID()) == null) ? 0 : targetNodeID.intValue());
        Integer numValueOf4 = Integer.valueOf((renderMetadata == null || (targetLayoutVersion = renderMetadata.getTargetLayoutVersion()) == null) ? 0 : targetLayoutVersion.intValue());
        if (renderMetadata != null && (boolIsDegraded = renderMetadata.isDegraded()) != null) {
            zBooleanValue = boolIsDegraded.booleanValue();
        }
        this.f109467a.c(new C41380b(requestId, templateId, templateSlug, numValueOf, numValueOf2, numValueOf3, numValueOf4, Boolean.valueOf(zBooleanValue)));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void f(@Y61.k String str, @Y61.k String str2) {
        this.f109467a.c(new V0(str2, str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void f0(@Y61.l String str, @Y61.l String str2, @Y61.k StoriesFromPage storiesFromPage) {
        this.f109467a.c(new Cx0.f(str, this.f109473g.getF253025a(), storiesFromPage.f109466b, null, str2, 8, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void g(@Y61.k String str) {
        this.f109467a.c(new C28433p("b360_main", str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void g0(@Y61.l String str, @Y61.k String str2) {
        this.f109467a.c(new k(str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void h() {
        this.f109467a.c(new G0());
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void h0(@Y61.k String str, @Y61.k ContactSource contactSource, @Y61.l String str2, @Y61.k PresentationType presentationType, @Y61.l ScreenIdField screenIdField, @Y61.l String str3) {
        String str4;
        String str5 = contactSource.f89925b ? "xl" : "s";
        long jA2 = this.f109468b.a();
        TreeClickStreamParent treeClickStreamParentX = X(presentationType);
        Integer numValueOf = Integer.valueOf(contactSource.f89926c);
        if (screenIdField != null) {
            str4 = screenIdField.f90257b;
        } else {
            ScreenIdField screenIdField2 = ScreenIdField.f90251c;
            str4 = "serp";
        }
        this.f109467a.c(new i1(this.f109472f, this.f109467a, jA2, treeClickStreamParentX, str, str5, numValueOf, str4, str2, str3));
        this.f109476j.a();
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void i(@Y61.k String str) {
        this.f109467a.c(new com.avito.android.map_core.analytics.event.e(str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void i0(@Y61.l Map<String, String> map, @Y61.k SearchParams searchParams, long j12, @Y61.l SerpDisplayType serpDisplayType, @Y61.l String str, @Y61.k PresentationType presentationType, @Y61.l String str2, int i12) {
        InterfaceC28373a interfaceC28373a = this.f109467a;
        if (map != null) {
            interfaceC28373a.c(new Z0(map));
        }
        if (i12 == 1) {
            long jA2 = this.f109468b.a();
            this.f109475i = jA2;
            interfaceC28373a.c(new W(jA2, X(presentationType), searchParams, j12, null, serpDisplayType, str2, null, str, null, 512, null));
        }
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void j(@Y61.k String str) {
        this.f109467a.c(new H0(str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void j0(@Y61.l String str, @Y61.l String str2) {
        this.f109467a.c(new Q0(str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void k(@Y61.k String str) {
        this.f109467a.c(new W0(str, "button"));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void k0(@Y61.k String str) {
        this.f109467a.c(new V(str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void l(@Y61.k String str) {
        this.f109467a.c(new C28431o("avito_main_change", str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void m(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str, @Y61.l String str2) {
        this.f109467a.c(new C43497b(num, num2, num3, str, str2));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void n(@Y61.l Integer num, @Y61.k String str, @Y61.l String str2) {
        this.f109467a.c(new C14374a(str, str2, num));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void o(@Y61.k String str) {
        this.f109467a.c(new A0(str));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void p(@Y61.l String str) {
        this.f109467a.c(new yr0.b(str, null, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void q() {
        this.f109467a.c(new C14015a());
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void r() {
        this.f109467a.c(new C28434p0());
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void s() {
        this.f109467a.c(new C28432o0());
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void t(@Y61.k String str) {
        this.f109467a.c(new C28431o("b360_serp", str));
    }

    @Override // Nr0.InterfaceC14605a
    public final void u(int i12, @Y61.l String str, int i13, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k WidgetPageSource widgetPageSource, @Y61.l String str5, @Y61.l String str6, @Y61.l Long l12, @Y61.k LinkedHashMap linkedHashMap) {
        this.f109469c.u(i12, str, i13, str2, str3, str4, widgetPageSource, str5, str6, l12, linkedHashMap);
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void v(@Y61.k String str) {
        this.f109467a.c(new C28448x(str));
    }

    @Override // Nr0.InterfaceC14605a
    public final void w(@Y61.l String str, int i12, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k WidgetPageSource widgetPageSource, @Y61.l String str5, @Y61.l String str6, @Y61.l Long l12, @Y61.l Map<String, String> map) {
        this.f109469c.w(str, i12, str2, str3, str4, widgetPageSource, str5, str6, l12, map);
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void x() {
        this.f109467a.c(new C28423k());
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void y(@Y61.k SearchParams searchParams, @Y61.l ArrayList arrayList, boolean z12) {
        ArrayList arrayListC = arrayList != null ? C42745f0.C(arrayList) : null;
        String categoryId = searchParams.getCategoryId();
        String query = searchParams.getQuery();
        Long priceMin = searchParams.getPriceMin();
        Long priceMax = searchParams.getPriceMax();
        String strA = d.a(searchParams.getOwner());
        Boolean withDeliveryOnly = searchParams.getWithDeliveryOnly();
        this.f109467a.c(new b1("serp", null, null, arrayListC, categoryId, query, null, priceMin, priceMax, strA, withDeliveryOnly != null ? Integer.valueOf(withDeliveryOnly.equals(Boolean.TRUE) ? 1 : 0).toString() : null, String.valueOf(!z12 ? 0 : 1), 70, null));
    }

    @Override // com.avito.android.bxcontent.analytics.a
    public final void z(@Y61.k String str, @Y61.k String str2, @Y61.l RenderMetadata renderMetadata) {
        String requestId;
        String templateSlug;
        Boolean boolIsDegraded;
        Integer targetLayoutVersion;
        Integer targetNodeID;
        Integer requestedLayoutVersion;
        Integer requestedNodeID;
        if (renderMetadata == null || (requestId = renderMetadata.getRequestId()) == null) {
            requestId = "";
        }
        boolean zBooleanValue = false;
        int templateId = renderMetadata != null ? renderMetadata.getTemplateId() : 0;
        if (renderMetadata == null || (templateSlug = renderMetadata.getTemplateSlug()) == null) {
            templateSlug = "";
        }
        Integer numValueOf = Integer.valueOf((renderMetadata == null || (requestedNodeID = renderMetadata.getRequestedNodeID()) == null) ? 0 : requestedNodeID.intValue());
        Integer numValueOf2 = Integer.valueOf((renderMetadata == null || (requestedLayoutVersion = renderMetadata.getRequestedLayoutVersion()) == null) ? 0 : requestedLayoutVersion.intValue());
        Integer numValueOf3 = Integer.valueOf((renderMetadata == null || (targetNodeID = renderMetadata.getTargetNodeID()) == null) ? 0 : targetNodeID.intValue());
        Integer numValueOf4 = Integer.valueOf((renderMetadata == null || (targetLayoutVersion = renderMetadata.getTargetLayoutVersion()) == null) ? 0 : targetLayoutVersion.intValue());
        if (renderMetadata != null && (boolIsDegraded = renderMetadata.isDegraded()) != null) {
            zBooleanValue = boolIsDegraded.booleanValue();
        }
        this.f109467a.c(new C41379a(requestId, templateId, templateSlug, numValueOf, numValueOf2, numValueOf3, numValueOf4, Boolean.valueOf(zBooleanValue), str, str2));
    }
}
