package Hq0;

import Wd.InterfaceC15745b;
import com.avito.android.B2;
import com.avito.android.account.C27672j;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin.common.g;
import com.avito.android.search.j;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingOrderActionInteractor;
import com.avito.android.user_advert.advert.C35392g0;
import com.avito.android.util.A4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.reflect.n;
import l41.s;
import lI0.InterfaceC43640a;
import oi.InterfaceC44779a;
import tG0.InterfaceC48553b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Hq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14021c implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7753c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7756f;

    public /* synthetic */ C14021c(int i12, String str, Object obj, Object obj2, Object obj3) {
        this.f7752b = i12;
        this.f7755e = obj;
        this.f7753c = str;
        this.f7754d = obj2;
        this.f7756f = obj3;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f7752b) {
            case 0:
                return ((C14022d) this.f7755e).f7757a.get().h(this.f7753c, (String) this.f7754d, (String) this.f7756f);
            case 1:
                return ((C27672j) this.f7755e).f68145a.get().c(this.f7753c, (String) this.f7754d, ((InterfaceC15745b.C1278b) this.f7756f).f17994a);
            case 2:
                return ((com.avito.android.advert.item.ownership_cost.d) this.f7755e).f77877a.get().a(this.f7753c, (String) this.f7754d, (String) this.f7756f);
            case 3:
                int i12 = g.a.f103420a[((BeduinExecuteRequestAction.HttpMethod) this.f7755e).ordinal()];
                h31.e<InterfaceC44779a> eVar = ((g) this.f7754d).f103418a;
                String str = this.f7753c;
                Map<String, String> map = (Map) this.f7756f;
                if (i12 == 1) {
                    return eVar.get().e(str, map);
                }
                if (i12 == 2) {
                    return eVar.get().c(str, map);
                }
                if (i12 == 3) {
                    return eVar.get().a(str);
                }
                if (i12 == 4) {
                    return eVar.get().b(str, map);
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                return ((com.avito.android.deal_confirmation.b) this.f7755e).f132736a.get().a(this.f7753c, (String) this.f7754d, (String) this.f7756f);
            case 5:
                return ((com.avito.android.safety.sessions.d) this.f7755e).f257935a.get().b(this.f7753c, (String) this.f7754d, (String) this.f7756f);
            case 6:
                return ((j) this.f7755e).f263821a.get().i(Boolean.FALSE, null, this.f7753c, (Boolean) this.f7754d, (Map) this.f7756f);
            case 7:
                return ((com.avito.android.service_booking_common.link.confirm.g) this.f7755e).f276623a.get().b(((ServiceBookingOrderActionInteractor.Action) this.f7756f).f276601b, this.f7753c, (String) this.f7754d);
            case 8:
                InterfaceC48553b interfaceC48553b = ((com.avito.android.universal_map.map.pin_filters.e) this.f7755e).f305702a.get();
                A4 a42 = A4.f318516a;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7754d;
                a42.getClass();
                Map<String, String> mapH = A4.h(linkedHashMap, "extraParameters");
                Map mapC = (Map) this.f7756f;
                if (mapC == null) {
                    mapC = P0.c();
                }
                return interfaceC48553b.e(this.f7753c, A4.h(mapC, "checkedFilters"), mapH);
            case 9:
                InterfaceC48553b interfaceC48553b2 = ((com.avito.android.universal_map.map.point_info.e) this.f7755e).f305795a.get();
                A4 a43 = A4.f318516a;
                Map mapC2 = (Map) this.f7754d;
                if (mapC2 == null) {
                    mapC2 = P0.c();
                }
                a43.getClass();
                return interfaceC48553b2.b(this.f7753c, A4.h(mapC2, "pinParameters"), A4.h((LinkedHashMap) this.f7756f, "extraParameters"));
            default:
                C35392g0 c35392g0 = (C35392g0) this.f7755e;
                InterfaceC43640a interfaceC43640a = c35392g0.f308930a.get();
                B2 b22 = c35392g0.f308933d;
                b22.getClass();
                n<Object> nVar = B2.f67184X[34];
                return interfaceC43640a.l(this.f7753c, (LinkedHashMap) this.f7756f, true, "view", ((Boolean) b22.f67191G.a().invoke()).booleanValue() ? (String) this.f7754d : null);
        }
    }

    public /* synthetic */ C14021c(BeduinExecuteRequestAction.HttpMethod httpMethod, g gVar, String str, Map map) {
        this.f7752b = 3;
        this.f7755e = httpMethod;
        this.f7754d = gVar;
        this.f7753c = str;
        this.f7756f = map;
    }

    public /* synthetic */ C14021c(com.avito.android.service_booking_common.link.confirm.g gVar, ServiceBookingOrderActionInteractor.Action action, String str, String str2) {
        this.f7752b = 7;
        this.f7755e = gVar;
        this.f7756f = action;
        this.f7753c = str;
        this.f7754d = str2;
    }

    public /* synthetic */ C14021c(com.avito.android.universal_map.map.pin_filters.e eVar, LinkedHashMap linkedHashMap, Map map, String str) {
        this.f7752b = 8;
        this.f7755e = eVar;
        this.f7754d = linkedHashMap;
        this.f7756f = map;
        this.f7753c = str;
    }

    public /* synthetic */ C14021c(C35392g0 c35392g0, String str, LinkedHashMap linkedHashMap, String str2) {
        this.f7752b = 10;
        this.f7755e = c35392g0;
        this.f7753c = str;
        this.f7756f = linkedHashMap;
        this.f7754d = str2;
    }
}
