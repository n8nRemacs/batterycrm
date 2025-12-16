package com.avito.android.publish.price_list.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.objects.di.Y;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.Restrictions;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.price_list.PriceListDisplayingOptions;
import com.avito.android.remote.model.price_list.PriceListGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectPriceListDataProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/domain/d;", "Lcom/avito/android/publish/price_list/domain/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public ObjectsParameter f238532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final PriceListDisplayingOptions f238533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f238534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f238535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f238536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f238537f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<PriceListGroup> f238538g;

    @Inject
    public d(@Y @Y61.k ObjectsParameter objectsParameter) {
        this.f238532a = objectsParameter;
        DisplayingOptions displayingOptions = objectsParameter.getDisplayingOptions();
        PriceListDisplayingOptions priceListDisplaying = displayingOptions != null ? displayingOptions.getPriceListDisplaying() : null;
        this.f238533b = priceListDisplaying;
        this.f238534c = priceListDisplaying != null ? priceListDisplaying.getSelfServiceParamId() : null;
        DisplayingOptions displayingOptions2 = this.f238532a.getDisplayingOptions();
        this.f238535d = displayingOptions2 != null ? displayingOptions2.getEditScreenTitle() : null;
        this.f238536e = priceListDisplaying != null ? priceListDisplaying.getSelfServicesHeaderTitle() : null;
        String searchBarPlaceholder = priceListDisplaying != null ? priceListDisplaying.getSearchBarPlaceholder() : null;
        this.f238537f = searchBarPlaceholder == null ? "" : searchBarPlaceholder;
        this.f238538g = priceListDisplaying != null ? priceListDisplaying.getGroups() : null;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final ObjectsParameter getF238532a() {
        return this.f238532a;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF238535d() {
        return this.f238535d;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final List<List<ParameterSlot>> c() {
        return (List) this.f238532a.getValue();
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getF238536e() {
        return this.f238536e;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.k
    public final List<ParcelableEntity<String>> e() {
        List<ParcelableEntity<String>> listToShow;
        List<ParameterSlot> params = this.f238532a.getParams();
        ArrayList arrayList = null;
        SelectParameter selectParameterO = params != null ? o(params) : null;
        if (selectParameterO != null && (listToShow = selectParameterO.getListToShow()) != null) {
            arrayList = new ArrayList();
            for (Object obj : listToShow) {
                if (!L.f(((ParcelableEntity) obj).getId(), this.f238534c)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final Q<Integer, List<ParameterSlot>> f(@Y61.k String str) {
        int i12;
        List<? extends List<? extends ParameterSlot>> value = this.f238532a.getValue();
        if (value != null) {
            Iterator<? extends List<? extends ParameterSlot>> it = value.iterator();
            i12 = 0;
            while (it.hasNext()) {
                SelectParameter selectParameterO = o(it.next());
                if (L.f(selectParameterO != null ? selectParameterO.getValue() : null, str)) {
                    break;
                }
                i12++;
            }
            i12 = -1;
        } else {
            i12 = -1;
        }
        if (i12 == -1) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i12);
        List<? extends List<? extends ParameterSlot>> value2 = this.f238532a.getValue();
        List<? extends ParameterSlot> list = value2 != null ? value2.get(i12) : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        return new Q<>(numValueOf, list);
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getF238537f() {
        return this.f238537f;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final List<PriceListGroup> getGroups() {
        return this.f238538g;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    public final void h(@Y61.k ObjectsParameter objectsParameter) {
        this.f238532a = objectsParameter;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.k
    public final TreeMap i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<List<ParameterSlot>> listC = c();
        if (listC != null) {
            List<List<ParameterSlot>> list = listC;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                List<? extends ParameterSlot> list2 = (List) obj;
                SelectParameter selectParameterO = o(list2);
                if (L.f(selectParameterO != null ? selectParameterO.getValue() : null, this.f238534c)) {
                    linkedHashMap.put(Integer.valueOf(i12), list2);
                }
                arrayList.add(G0.f406611a);
                i12 = i13;
            }
        }
        return new TreeMap(linkedHashMap);
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final ParcelableEntity<String> j() {
        List<ParcelableEntity<String>> listToShow;
        List<ParameterSlot> params = this.f238532a.getParams();
        Object obj = null;
        SelectParameter selectParameterO = params != null ? o(params) : null;
        if (selectParameterO == null || (listToShow = selectParameterO.getListToShow()) == null) {
            return null;
        }
        Iterator<T> it = listToShow.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((ParcelableEntity) next).getId(), this.f238534c)) {
                obj = next;
                break;
            }
        }
        return (ParcelableEntity) obj;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final ObjectsParameter.Summary k() {
        PriceListDisplayingOptions priceListDisplayingOptions = this.f238533b;
        if (priceListDisplayingOptions != null) {
            return priceListDisplayingOptions.getSummary();
        }
        return null;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final String l() {
        SelectParameter.Displaying displaying;
        List<ParameterSlot> params = this.f238532a.getParams();
        SelectParameter selectParameterO = params != null ? o(params) : null;
        if (selectParameterO == null || (displaying = selectParameterO.getDisplaying()) == null) {
            return null;
        }
        return displaying.getValueIdForEmptySearch();
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final String m() {
        PriceListDisplayingOptions priceListDisplayingOptions = this.f238533b;
        if (priceListDisplayingOptions != null) {
            return priceListDisplayingOptions.getValuesProviderParamId();
        }
        return null;
    }

    @Override // com.avito.android.publish.price_list.domain.c
    @Y61.l
    public final Restrictions n() {
        return this.f238532a.getRestrictions();
    }

    public final SelectParameter o(List<? extends ParameterSlot> list) {
        ParameterSlot parameterSlot;
        Object next;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), m())) {
                    break;
                }
            }
            parameterSlot = (ParameterSlot) next;
        } else {
            parameterSlot = null;
        }
        if (parameterSlot instanceof SelectParameter) {
            return (SelectParameter) parameterSlot;
        }
        return null;
    }
}
