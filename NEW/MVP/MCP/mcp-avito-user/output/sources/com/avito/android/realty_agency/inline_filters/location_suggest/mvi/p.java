package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.realty_agency.blueprint.text_block.TextBlockItem;
import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import ji0.d;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import oi0.C44782a;
import oi0.C44783b;

/* compiled from: LocationSuggestReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Lji0/c;", "<init>", "()V", "a", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements u<LocationSuggestInternalAction, ji0.c> {

    /* compiled from: LocationSuggestReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/p$a;", "", "<init>", "()V", "", "NO_LOCATIONS_TEXT_ITEM_ID", "Ljava/lang/String;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public p() {
    }

    public static com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.a b(C44783b c44783b, boolean z12, String str) {
        return new com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.a(String.valueOf(c44783b.getId()), c44783b.getId(), c44783b.getName(), c44783b.getRegionName(), z12, !z12 && L.f(str, String.valueOf(c44783b.getId())));
    }

    @Override // com.avito.android.arch.mvi.u
    public final ji0.c a(LocationSuggestInternalAction locationSuggestInternalAction, ji0.c cVar) {
        List<C44783b> listB;
        String str;
        LocationSuggestInternalAction locationSuggestInternalAction2 = locationSuggestInternalAction;
        ji0.c cVar2 = cVar;
        if (locationSuggestInternalAction2 instanceof LocationSuggestInternalAction.Init) {
            return ji0.c.a(cVar2, ((LocationSuggestInternalAction.Init) locationSuggestInternalAction2).f251694b, null, null, null, 14);
        }
        if (locationSuggestInternalAction2 instanceof LocationSuggestInternalAction.LocationsLoading.StartLoading) {
            return ji0.c.a(cVar2, null, null, null, d.b.f405775a, 7);
        }
        if (!(locationSuggestInternalAction2 instanceof LocationSuggestInternalAction.LocationsLoading.Loaded)) {
            return locationSuggestInternalAction2 instanceof LocationSuggestInternalAction.LocationsLoading.LoadingError ? ji0.c.a(cVar2, null, null, null, d.c.f405776a, 7) : locationSuggestInternalAction2 instanceof LocationSuggestInternalAction.UpdateQueryString ? ji0.c.a(cVar2, null, ((LocationSuggestInternalAction.UpdateQueryString) locationSuggestInternalAction2).f251700b, null, null, 13) : cVar2;
        }
        ArrayList arrayList = new ArrayList();
        C44782a c44782a = ((LocationSuggestInternalAction.LocationsLoading.Loaded) locationSuggestInternalAction2).f251695b;
        List<C44783b> listA = c44782a.a();
        if ((listA == null || listA.isEmpty()) && ((listB = c44782a.b()) == null || listB.isEmpty())) {
            arrayList.add(new TextBlockItem("no-locations-text-item", com.avito.android.printable_text.b.c(R.string.realty_agency_inline_filters_location_suggest_no_locations_hint, new Serializable[0]), R.attr.textM20, R.attr.gray48, TextBlockItem.Alignment.f250890c, 0, 0, 96, null));
        } else {
            List<C44783b> listA2 = c44782a.a();
            if (listA2 == null) {
                listA2 = C42784z0.f406748b;
            }
            List<C44783b> list = listA2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = cVar2.f405770b;
                if (!zHasNext) {
                    break;
                }
                arrayList2.add(b((C44783b) it.next(), true, str));
            }
            arrayList.addAll(arrayList2);
            List<C44783b> listB2 = c44782a.b();
            if (listB2 == null) {
                listB2 = C42784z0.f406748b;
            }
            List<C44783b> list2 = listB2;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(b((C44783b) it2.next(), false, str));
            }
            arrayList.addAll(arrayList3);
        }
        return ji0.c.a(cVar2, null, null, c44782a, new d.a(arrayList), 3);
    }
}
