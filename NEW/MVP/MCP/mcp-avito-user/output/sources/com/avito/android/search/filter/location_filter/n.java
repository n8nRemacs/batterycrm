package com.avito.android.search.filter.location_filter;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.SwitcherItem;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: LocationFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f263648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<P2<? super ParametersTreeWithAdditional>, G0> f263649c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(r rVar, Y41.l<? super P2<? super ParametersTreeWithAdditional>, G0> lVar) {
        this.f263648b = rVar;
        this.f263649c = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Object next;
        List<ParameterSlot> list;
        Object next2;
        String str;
        String str2;
        P2<? super ParametersTreeWithAdditional> p22 = (P2) obj;
        r rVar = this.f263648b;
        rVar.getClass();
        if (p22 instanceof P2.c) {
            u uVar = rVar.f263676w;
            if (uVar != null) {
                uVar.a();
            }
        } else {
            boolean z12 = p22 instanceof P2.b;
            com.avito.android.search.filter.tracker.a aVar = rVar.f263660g;
            if (z12) {
                ParametersTreeWithAdditional parametersTreeWithAdditional = (ParametersTreeWithAdditional) ((P2.b) p22).f318720a;
                aVar.b();
                aVar.j();
                rVar.f263665l = parametersTreeWithAdditional;
                com.avito.android.search.filter.converter.j jVar = rVar.f263656c;
                Iterator it = jVar.a(parametersTreeWithAdditional).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((com.avito.conveyor_item.a) next) instanceof ParameterElement.q) {
                            break;
                        }
                    }
                }
                ParameterElement.q qVar = next instanceof ParameterElement.q ? (ParameterElement.q) next : null;
                if (qVar != null && (list = qVar.f262814f) != null) {
                    ArrayList arrayListA = jVar.a(new UV0.c(list));
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = arrayListA.iterator();
                    while (it2.hasNext()) {
                        TV0.a bVar = (com.avito.conveyor_item.a) it2.next();
                        if (bVar instanceof com.avito.android.search.filter.converter.common.b) {
                            com.avito.android.search.filter.converter.common.b bVar2 = (com.avito.android.search.filter.converter.common.b) bVar;
                            bVar = new SwitcherItem(bVar2.f262951b, bVar2.f262952c, bVar2.f262953d, bVar2.f262954e, bVar2.f262955f, bVar2.f262956g, bVar2.f262957h, bVar2.f262958i, null, 256, null);
                        } else if (bVar instanceof ParameterElement.v) {
                            Iterator it3 = arrayListA.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                } else {
                                    next2 = it3.next();
                                    if (L.f(((com.avito.conveyor_item.a) next2).getF76230c(), "suggestLocationId")) {
                                        break;
                                    }
                                }
                            }
                            ParameterElement.v.b bVar3 = next2 instanceof ParameterElement.v.b ? (ParameterElement.v.b) next2 : null;
                            boolean z13 = bVar instanceof ParameterElement.v.b;
                            if (z13 && L.f(((ParameterElement) bVar).f262689b, SearchParamsConverterKt.LOCATION_ID) && bVar3 != null) {
                                Cp0.e eVar = bVar3.f262844g;
                                if (eVar == null || (str2 = eVar.f2697b) == null || (str = (String) C42745f0.Q(C43066x.f0(str2, new String[]{"_"}, 0, 6))) == null) {
                                    str = "";
                                }
                                ParameterElement.v.b bVar4 = (ParameterElement.v.b) bVar;
                                Cp0.e eVar2 = ((ParameterElement.v) bVar).f262844g;
                                bVar4.b(eVar2 != null ? Cp0.e.a(eVar2, str, false, 16382) : null);
                            }
                            if (z13 && (((ParameterElement.v) bVar).f262845h instanceof ParameterElement.DisplayType.b)) {
                                ParameterElement.v.b bVar5 = (ParameterElement.v.b) bVar;
                                ParameterElement.v.b bVar6 = new ParameterElement.v.b(bVar5.f262689b, bVar5.f262840c, bVar5.f262841d, bVar5.f262842e, bVar5.f262843f, bVar5.f262855r, bVar5.f262844g, bVar5.f262862t, new ParameterElement.DisplayType.Chips(false, null, 3, null), bVar5.f262846i, bVar5.f262847j, bVar5.f262848k, bVar5.f262849l, bVar5.f262850m, null, false, bVar5.f262853p, bVar5.f262854q, bVar5.f262856s, false, 573440, null);
                                bVar = new ParameterElement.v.b(bVar6.f262689b, "", bVar6.f262841d, bVar6.f262842e, bVar6.f262843f, bVar6.f262855r, bVar6.f262844g, bVar6.f262862t, bVar6.f262845h, bVar6.f262846i, bVar6.f262847j, bVar6.f262848k, bVar6.f262849l, bVar6.f262850m, null, false, bVar6.f262853p, bVar6.f262854q, bVar6.f262856s, false, 573440, null);
                            } else {
                                bVar = (ParameterElement.v) bVar;
                            }
                        } else if (!(bVar instanceof ParameterElement.s)) {
                            bVar = null;
                        }
                        arrayList.add(bVar);
                    }
                    UV0.c cVar = new UV0.c(C42745f0.C(arrayList));
                    rVar.f263679z = cVar;
                    rVar.f263655b.c(cVar);
                    u uVar2 = rVar.f263676w;
                    if (uVar2 != null) {
                        uVar2.onDataChanged();
                    }
                    u uVar3 = rVar.f263676w;
                    if (uVar3 != null) {
                        uVar3.i();
                    }
                    aVar.k();
                }
            } else if (p22 instanceof P2.a) {
                ApiError apiError = ((P2.a) p22).f318719a;
                aVar.f(apiError);
                aVar.j();
                u uVar4 = rVar.f263676w;
                if (uVar4 != null) {
                    uVar4.g(apiError);
                }
                aVar.h(apiError);
            }
        }
        Y41.l<P2<? super ParametersTreeWithAdditional>, G0> lVar = this.f263649c;
        if (lVar != null) {
            lVar.invoke(p22);
        }
    }
}
