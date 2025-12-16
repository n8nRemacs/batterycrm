package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.StrOrdersListBody;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import com.avito.android.travel_seller_banners.models.PageForBanner;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vz0.C49404a;
import vz0.C49405b;
import xz0.C50024a;
import xz0.C50025b;
import yz0.InterfaceC50328b;

/* compiled from: StrSellerOrdersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lyz0/b;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersState;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC50328b, StrSellerOrdersInternalAction, StrSellerOrdersState> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f289826f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.strsellerorders.domain.a f289827a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50025b f289828b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f289829c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f289830d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f289831e;

    /* compiled from: StrSellerOrdersActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/a$a;", "", "<init>", "()V", "", "API_PREFIX", "Ljava/lang/String;", "DEEPLINK_PREFIX", "TEL_PREFIX", "WEB_PREFIX", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders.strsellerorders.mvi.a$a, reason: collision with other inner class name */
    public static final class C8737a {
        public /* synthetic */ C8737a(C42822w c42822w) {
            this();
        }

        public C8737a() {
        }
    }

    static {
        new C8737a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.str_seller_orders.strsellerorders.domain.a aVar, @Y61.k C50025b c50025b, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k x xVar, @Y61.k com.avito.android.analytics.provider.a aVar2) {
        this.f289827a = aVar;
        this.f289828b = c50025b;
        this.f289829c = interfaceC28373a;
        this.f289830d = xVar;
        this.f289831e = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSellerOrdersInternalAction> b(InterfaceC50328b interfaceC50328b, StrSellerOrdersState strSellerOrdersState) {
        Map<String, SuggestAnalyticsEvent> mapC;
        C43210w c43210w;
        InterfaceC50328b interfaceC50328b2 = interfaceC50328b;
        StrSellerOrdersState strSellerOrdersState2 = strSellerOrdersState;
        if (interfaceC50328b2 instanceof InterfaceC50328b.a) {
            return new C43210w(StrSellerOrdersInternalAction.CloseScreen.f289866b);
        }
        if (interfaceC50328b2 instanceof InterfaceC50328b.j) {
            c43210w = new C43210w(new StrSellerOrdersInternalAction.OpenDeeplink(((InterfaceC50328b.j) interfaceC50328b2).f443642a));
        } else if (interfaceC50328b2 instanceof InterfaceC50328b.C12935b) {
            c43210w = new C43210w(new StrSellerOrdersInternalAction.OpenDeeplink(((InterfaceC50328b.C12935b) interfaceC50328b2).f443631a));
        } else {
            if (!(interfaceC50328b2 instanceof InterfaceC50328b.c)) {
                boolean z12 = interfaceC50328b2 instanceof InterfaceC50328b.k ? true : interfaceC50328b2 instanceof InterfaceC50328b.l;
                com.avito.android.str_seller_orders.strsellerorders.domain.a aVar = this.f289827a;
                if (z12) {
                    InterfaceC43160i<StrSellerOrdersInternalAction> interfaceC43160iB = aVar.b(true, StrOrdersListBody.INSTANCE.getEMPTY());
                    C50025b c50025b = this.f289828b;
                    c50025b.getClass();
                    PageForBanner pageForBanner = PageForBanner.f303306b;
                    return C43175k.N(interfaceC43160iB, new C50024a(c50025b.f442819a.b()));
                }
                if (interfaceC50328b2 instanceof InterfaceC50328b.g) {
                    return aVar.b(false, StrOrdersListBody.INSTANCE.getEMPTY());
                }
                boolean z13 = interfaceC50328b2 instanceof InterfaceC50328b.m;
                InterfaceC28373a interfaceC28373a = this.f289829c;
                if (z13) {
                    interfaceC28373a.c(new C49405b(this.f289831e.a()));
                    return C43175k.w();
                }
                C49404a c49404aA = null;
                if (interfaceC50328b2 instanceof InterfaceC50328b.o) {
                    return C43175k.G(new c(interfaceC50328b2, null));
                }
                if (interfaceC50328b2 instanceof InterfaceC50328b.n) {
                    return C43175k.G(new d(strSellerOrdersState2, this, null));
                }
                if (interfaceC50328b2 instanceof InterfaceC50328b.h) {
                    return C43175k.G(new e(this, strSellerOrdersState2, null, interfaceC50328b2));
                }
                if (interfaceC50328b2 instanceof InterfaceC50328b.p ? true : interfaceC50328b2 instanceof InterfaceC50328b.f) {
                    return aVar.b(false, StrOrdersListBody.INSTANCE.getEMPTY());
                }
                if (interfaceC50328b2 instanceof InterfaceC50328b.i) {
                    return C43175k.G(new f(this, strSellerOrdersState2, null, interfaceC50328b2));
                }
                if (interfaceC50328b2 instanceof InterfaceC50328b.d) {
                    return C43175k.G(new g(this, strSellerOrdersState2, null, interfaceC50328b2));
                }
                if (!(interfaceC50328b2 instanceof InterfaceC50328b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                Prompt prompt = ((InterfaceC50328b.e) interfaceC50328b2).f443635a.getPrompt();
                SuggestAnalyticsEvent suggestAnalyticsEvent = (prompt == null || (mapC = prompt.c()) == null) ? null : mapC.get("cancel");
                if (suggestAnalyticsEvent != null) {
                    C49404a.f441068c.getClass();
                    c49404aA = C49404a.C12801a.a(suggestAnalyticsEvent);
                }
                if (c49404aA != null) {
                    interfaceC28373a.c(c49404aA);
                }
                return C43175k.w();
            }
            c43210w = new C43210w(new StrSellerOrdersInternalAction.OpenDeeplink(((InterfaceC50328b.c) interfaceC50328b2).f443632a));
        }
        return c43210w;
    }
}
