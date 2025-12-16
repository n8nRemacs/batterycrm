package com.avito.android.newcars_mark_model_filter.presentation.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.newcars_mark_model_filter.presentation.mvi.entity.NewCarsBrandModelFilterInternalAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import p30.AbstractC46882a;

/* compiled from: NewCarsBrandModelFilterReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "Lo30/c;", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements u<NewCarsBrandModelFilterInternalAction, o30.c> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final o30.c a(NewCarsBrandModelFilterInternalAction newCarsBrandModelFilterInternalAction, o30.c cVar) {
        List listV;
        boolean z12;
        AbstractC46882a aVar;
        long j12;
        boolean z13;
        boolean z14;
        NewCarsBrandModelFilterInternalAction newCarsBrandModelFilterInternalAction2 = newCarsBrandModelFilterInternalAction;
        o30.c cVar2 = cVar;
        if (newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.BrandsLoaded) {
            NewCarsBrandModelFilterInternalAction.BrandsLoaded brandsLoaded = (NewCarsBrandModelFilterInternalAction.BrandsLoaded) newCarsBrandModelFilterInternalAction2;
            List<com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a> list = brandsLoaded.f207329b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a) it.next()).a());
            }
            return o30.c.a(cVar2, C42745f0.H(arrayList), brandsLoaded.f207329b, C42784z0.f406748b, null, null, false, true, true, false, 67);
        }
        if (newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.ModelsLoaded) {
            NewCarsBrandModelFilterInternalAction.ModelsLoaded modelsLoaded = (NewCarsBrandModelFilterInternalAction.ModelsLoaded) newCarsBrandModelFilterInternalAction2;
            List<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> list2 = modelsLoaded.f207333b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a) it2.next()).a());
            }
            return o30.c.a(cVar2, C42745f0.H(arrayList2), null, modelsLoaded.f207333b, modelsLoaded.f207334c, null, false, true, false, false, 75);
        }
        boolean z15 = newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.SelectModel;
        List<TV0.a> list3 = cVar2.f419352d;
        Iterable iterable = cVar2.f419354f;
        if (z15) {
            NewCarsBrandModelFilterInternalAction.SelectModel selectModel = (NewCarsBrandModelFilterInternalAction.SelectModel) newCarsBrandModelFilterInternalAction2;
            List<TV0.a> list4 = list3;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
            Iterator<T> it3 = list4.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                j12 = selectModel.f207336b;
                z13 = selectModel.f207337c;
                if (!zHasNext) {
                    break;
                }
                Object objA = (TV0.a) it3.next();
                if ((objA instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) && ((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) objA).f207394c == j12) {
                    objA = com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b.a((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) objA, z13);
                }
                arrayList3.add(objA);
            }
            Iterable<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> iterable2 = iterable;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(iterable2, 10));
            for (com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a aVar2 : iterable2) {
                ArrayList arrayList5 = aVar2.f207393g;
                if (!arrayList5.isEmpty()) {
                    Iterator it4 = arrayList5.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) it4.next()).f207394c == j12) {
                            ArrayList<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b> arrayList6 = aVar2.f207393g;
                            ArrayList arrayList7 = new ArrayList(C42745f0.q(arrayList6, 10));
                            for (com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b bVarA : arrayList6) {
                                if (bVarA.f207394c == j12) {
                                    bVarA = com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b.a(bVarA, z13);
                                }
                                arrayList7.add(bVarA);
                            }
                            aVar2 = new com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a(aVar2.f207391e, aVar2.f207392f, arrayList7);
                        }
                    }
                }
                arrayList4.add(aVar2);
            }
            if (arrayList3.isEmpty()) {
                z14 = false;
            } else {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    TV0.a aVar3 = (TV0.a) it5.next();
                    com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b bVar = aVar3 instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b ? (com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) aVar3 : null;
                    if (bVar != null ? bVar.f207396e : false) {
                        z14 = true;
                        break;
                    }
                }
                z14 = false;
            }
            return o30.c.a(cVar2, arrayList3, null, arrayList4, null, null, false, false, false, z14, 747);
        }
        if (newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.CancelSelection) {
            List<TV0.a> list5 = list3;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list5, 10));
            for (Object objA2 : list5) {
                if (objA2 instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.b) {
                    com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.b bVar2 = (com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.b) objA2;
                    objA2 = new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.b(bVar2.f207369c, bVar2.f207370d, false, bVar2.f207372f);
                } else if (objA2 instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) {
                    objA2 = com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b.a((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) objA2, false);
                } else if (!(objA2 instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.label.a)) {
                    throw new IllegalStateException("BrandModel item type doesn't exist");
                }
                arrayList8.add(objA2);
            }
            Iterable<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> iterable3 = iterable;
            ArrayList arrayList9 = new ArrayList(C42745f0.q(iterable3, 10));
            for (com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a aVar4 : iterable3) {
                ArrayList arrayList10 = aVar4.f207393g;
                ArrayList arrayList11 = new ArrayList(C42745f0.q(arrayList10, 10));
                Iterator it6 = arrayList10.iterator();
                while (it6.hasNext()) {
                    arrayList11.add(com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b.a((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) it6.next(), false));
                }
                arrayList9.add(new com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a(aVar4.f207391e, aVar4.f207392f, arrayList11));
            }
            return o30.c.a(cVar2, arrayList8, null, arrayList9, null, null, false, false, false, false, 747);
        }
        if (!(newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.Search)) {
            return newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.ShowLoader ? o30.c.a(cVar2, null, null, null, null, null, true, false, false, false, 1919) : newCarsBrandModelFilterInternalAction2 instanceof NewCarsBrandModelFilterInternalAction.HideLoader ? o30.c.a(cVar2, null, null, null, null, null, false, false, false, false, 1919) : cVar2;
        }
        if (cVar2.f419359k) {
            iterable = cVar2.f419353e;
        }
        Iterable<AbstractC46882a> iterable4 = iterable;
        ArrayList arrayList12 = new ArrayList(C42745f0.q(iterable4, 10));
        for (AbstractC46882a abstractC46882a : iterable4) {
            if (abstractC46882a instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a) {
                com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a aVar5 = (com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a) abstractC46882a;
                long j13 = aVar5.f207366e;
                ArrayList arrayList13 = ((com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a) abstractC46882a).f207368g;
                ArrayList arrayList14 = new ArrayList();
                for (Object obj : arrayList13) {
                    if (C43066x.q(((com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.b) obj).f207370d, ((NewCarsBrandModelFilterInternalAction.Search) newCarsBrandModelFilterInternalAction2).f207335b, true)) {
                        arrayList14.add(obj);
                    }
                }
                aVar = new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a(j13, aVar5.f207367f, arrayList14);
            } else {
                if (!(abstractC46882a instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a)) {
                    throw new IllegalStateException("BrandModel item type doesn't exist");
                }
                com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a aVar6 = (com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a) abstractC46882a;
                long j14 = aVar6.f207391e;
                ArrayList arrayList15 = ((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a) abstractC46882a).f207393g;
                ArrayList arrayList16 = new ArrayList();
                for (Object obj2 : arrayList15) {
                    if (C43066x.q(((com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) obj2).f207395d, ((NewCarsBrandModelFilterInternalAction.Search) newCarsBrandModelFilterInternalAction2).f207335b, true)) {
                        arrayList16.add(obj2);
                    }
                }
                aVar = new com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a(j14, aVar6.f207392f, arrayList16);
            }
            arrayList12.add(aVar);
        }
        NewCarsBrandModelFilterInternalAction.Search search = (NewCarsBrandModelFilterInternalAction.Search) newCarsBrandModelFilterInternalAction2;
        if (search.f207335b.length() == 0) {
            ArrayList arrayList17 = new ArrayList(C42745f0.q(arrayList12, 10));
            Iterator it7 = arrayList12.iterator();
            while (it7.hasNext()) {
                arrayList17.add(((AbstractC46882a) it7.next()).a());
            }
            listV = C42745f0.H(arrayList17);
        } else {
            ArrayList arrayList18 = new ArrayList(C42745f0.q(arrayList12, 10));
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                arrayList18.add(((AbstractC46882a) it8.next()).a());
            }
            ArrayList arrayListH = C42745f0.H(arrayList18);
            ArrayList arrayList19 = new ArrayList();
            Iterator it9 = arrayListH.iterator();
            while (it9.hasNext()) {
                Object next = it9.next();
                if (!(((TV0.a) next) instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.label.a)) {
                    arrayList19.add(next);
                }
            }
            listV = C42745f0.v(arrayList19);
        }
        List<TV0.a> list6 = listV;
        if ((list6 instanceof Collection) && list6.isEmpty()) {
            z12 = false;
        } else {
            for (TV0.a aVar7 : list6) {
                com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b bVar3 = aVar7 instanceof com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b ? (com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b) aVar7 : null;
                if (bVar3 != null ? bVar3.f207396e : false) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        return o30.c.a(cVar2, listV, null, null, null, search.f207335b, false, false, false, z12, 699);
    }
}
