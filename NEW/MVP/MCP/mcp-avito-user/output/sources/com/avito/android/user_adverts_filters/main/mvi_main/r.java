package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinResult;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
import gj.InterfaceC40691b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rJ0.InterfaceC47554a;
import rJ0.c;

/* compiled from: MainFiltersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/r;", "Lcom/avito/android/arch/mvi/a;", "LrJ0/a;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "LrJ0/c;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements com.avito.android.arch.mvi.a<InterfaceC47554a, MainFiltersInternalAction, rJ0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts_filters.main.domain.a f316307a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts_filters.main.action.c f316308b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts_filters.main.action.a f316309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f316310d;

    @Inject
    public r(@Y61.k com.avito.android.user_adverts_filters.main.domain.a aVar, @Y61.k com.avito.android.user_adverts_filters.main.action.c cVar, @Y61.k com.avito.android.user_adverts_filters.main.action.a aVar2, @Y61.k InterfaceC40691b interfaceC40691b) {
        this.f316307a = aVar;
        this.f316308b = cVar;
        this.f316309c = aVar2;
        this.f316310d = interfaceC40691b;
    }

    public static final Map c(r rVar, Map map, List list) {
        rVar.getClass();
        if (list.isEmpty()) {
            return map;
        }
        Set setP0 = C42745f0.P0(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (setP0.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.Y(C43175k.N(new e(new C43210w(InterfaceC47554a.c.f429729a), aVar), new f(new g(c43197r1), aVar)), new h(aVar, this, null)), C43175k.B(new p(aVar, this, null), C43175k.N(new o(kotlinx.coroutines.rx3.y.a(this.f316309c.f315994b)), new m(c43197r1), new n(c43197r1))), new q(kotlinx.coroutines.rx3.y.a(this.f316308b.f315997b), aVar, this), C43175k.B(new l(aVar, this, null), new k(c43197r1)), C43175k.B(new j(aVar, this, null), new i(c43197r1)), new a(kotlinx.coroutines.rx3.y.a(this.f316310d.q())));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<MainFiltersInternalAction> b(@Y61.k InterfaceC47554a interfaceC47554a, @Y61.k rJ0.c cVar) {
        C43210w c43210w;
        UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen;
        C43210w c43210w2;
        UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel;
        if (interfaceC47554a instanceof InterfaceC47554a.c) {
            return new C43137a0(new d(2, null), new b(C43175k.G(new c(this, cVar, null))));
        }
        if (interfaceC47554a instanceof InterfaceC47554a.f) {
            return new C43137a0(new d(2, null), new b(C43175k.G(new c(this, cVar, null))));
        }
        if (interfaceC47554a instanceof InterfaceC47554a.C12368a) {
            UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen2 = cVar.f429743e;
            if (userAdvertsFiltersBeduinScreen2 != null) {
                c43210w2 = new C43210w(new MainFiltersInternalAction.MoveTo(userAdvertsFiltersBeduinScreen2));
                return c43210w2;
            }
            c43210w = new C43210w(MainFiltersInternalAction.Close.f316224b);
            return c43210w;
        }
        if (!(interfaceC47554a instanceof InterfaceC47554a.g)) {
            if (interfaceC47554a instanceof InterfaceC47554a.b) {
                return new C43210w(MainFiltersInternalAction.Close.f316224b);
            }
            if (interfaceC47554a instanceof InterfaceC47554a.d) {
                return new C43210w(new MainFiltersInternalAction.MoveTo(((InterfaceC47554a.d) interfaceC47554a).f429730a));
            }
            if (!(interfaceC47554a instanceof InterfaceC47554a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC47554a.e eVar = (InterfaceC47554a.e) interfaceC47554a;
            return new C43210w(new MainFiltersInternalAction.ParamsChanged(eVar.f429731a, eVar.f429732b, eVar.f429733c));
        }
        c.b bVar = cVar.f429744f;
        c.b.a aVar = bVar instanceof c.b.a ? (c.b.a) bVar : null;
        if (aVar == null || (userAdvertsFiltersBeduinScreen = aVar.f429747a) == null) {
            c43210w = new C43210w(MainFiltersInternalAction.NoChange.f316234b);
            return c43210w;
        }
        UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult = cVar.f429741c;
        c43210w2 = (userAdvertsFiltersBeduinResult == null || (userAdvertsFiltersBeduinModel = (UserAdvertsFiltersBeduinModel) userAdvertsFiltersBeduinResult.f316077c.get(userAdvertsFiltersBeduinScreen)) == null) ? new C43210w(new MainFiltersInternalAction.ResetScreens(userAdvertsFiltersBeduinScreen, Collections.singleton(userAdvertsFiltersBeduinScreen))) : new C43210w(new MainFiltersInternalAction.ResetScreens(userAdvertsFiltersBeduinScreen, b1.i(C42745f0.O0((Iterable) userAdvertsFiltersBeduinModel.f316056d), userAdvertsFiltersBeduinScreen)));
        return c43210w2;
    }
}
