package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import com.avito.android.remote.model.category_parameters.DirectionParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.filters_parameter.ParametersTree;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReplaceLocationParametersTree.kt */
@K51.d
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/ReplaceLocationParametersTree;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReplaceLocationParametersTree implements ParametersTreeWithAdditional {

    @Y61.k
    public static final Parcelable.Creator<ReplaceLocationParametersTree> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ParametersTreeWithAdditional f261897b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LocationInfo f261898c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Map<Integer, CategoryParameter> f261899d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f261900e;

    /* compiled from: ReplaceLocationParametersTree.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReplaceLocationParametersTree> {
        @Override // android.os.Parcelable.Creator
        public final ReplaceLocationParametersTree createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ParametersTreeWithAdditional parametersTreeWithAdditional = (ParametersTreeWithAdditional) parcel.readParcelable(ReplaceLocationParametersTree.class.getClassLoader());
            LocationInfo locationInfoCreateFromParcel = LocationInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap2.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(ReplaceLocationParametersTree.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ReplaceLocationParametersTree(parametersTreeWithAdditional, locationInfoCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ReplaceLocationParametersTree[] newArray(int i12) {
            return new ReplaceLocationParametersTree[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaceLocationParametersTree(@Y61.k ParametersTreeWithAdditional parametersTreeWithAdditional, @Y61.k LocationInfo locationInfo, @Y61.l Map<Integer, ? extends CategoryParameter> map) {
        this.f261897b = parametersTreeWithAdditional;
        this.f261898c = locationInfo;
        this.f261899d = map;
        this.f261900e = map != 0 ? new LinkedHashMap(map) : new LinkedHashMap();
    }

    @Override // com.avito.android.search.filter.InterfaceC34534a
    @Y61.l
    public final AdditionalCategoryParameter a(@Y61.k String str) {
        return this.f261897b.a(str);
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree
    public final boolean applyPretendResult(@Y61.l Map<String, ? extends PretendErrorValue> map) {
        return this.f261897b.applyPretendResult(map);
    }

    public final ParameterSlot d(int i12, ParameterSlot parameterSlot) {
        ParameterSlot locationParameter = parameterSlot;
        Integer numValueOf = Integer.valueOf(i12);
        LinkedHashMap linkedHashMap = this.f261900e;
        CategoryParameter categoryParameter = (CategoryParameter) linkedHashMap.get(numValueOf);
        if (categoryParameter != null) {
            if (!kotlin.jvm.internal.L.f(categoryParameter.getId(), parameterSlot.getId())) {
                linkedHashMap.remove(Integer.valueOf(i12));
                categoryParameter = null;
            }
            if (categoryParameter != null) {
                return categoryParameter;
            }
        }
        boolean z12 = locationParameter instanceof MetroParameter;
        LocationInfo locationInfo = this.f261898c;
        if (z12) {
            ((MetroParameter) locationParameter).setValues(locationInfo.f261877d);
        } else if (locationParameter instanceof DistrictParameter) {
            boolean shouldShowNewUI = locationInfo.f261879f.getShouldShowNewUI();
            DistrictsWithRegions districtsWithRegions = locationInfo.f261879f;
            if (!shouldShowNewUI) {
                return e((EditableParameter) locationParameter, i12, districtsWithRegions.getDistricts());
            }
            ((DistrictParameter) locationParameter).setValues(districtsWithRegions);
        } else {
            if (locationParameter instanceof DirectionParameter) {
                return e((EditableParameter) locationParameter, i12, locationInfo.f261880g);
            }
            if (locationParameter instanceof LocationParameter) {
                LocationParameter locationParameter2 = (LocationParameter) locationParameter;
                String id2 = locationParameter2.getId();
                String title = locationParameter2.getTitle();
                AttributedText motivation = locationParameter2.getMotivation();
                Boolean updatesForm = locationParameter2.getUpdatesForm();
                Location value = locationParameter2.getValue();
                locationParameter = new LocationParameter(id2, title, motivation, updatesForm, kotlin.jvm.internal.L.f(locationParameter2.getValue(), locationInfo.f261876c) && !locationInfo.f261881h, value, null, locationParameter2.getPhantom(), locationParameter2.getImmutable(), 64, null);
                linkedHashMap.put(Integer.valueOf(i12), locationParameter);
            }
        }
        return locationParameter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.avito.android.remote.model.Sublocation> com.avito.android.remote.model.category_parameters.MultiselectParameter e(com.avito.android.remote.model.category_parameters.base.EditableParameter<java.util.List<T>> r44, int r45, java.util.List<? extends T> r46) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.ReplaceLocationParametersTree.e(com.avito.android.remote.model.category_parameters.base.EditableParameter, int, java.util.List):com.avito.android.remote.model.category_parameters.MultiselectParameter");
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.l
    public final synchronized ParameterSlot findParameter(@Y61.k String str) {
        ParameterSlot parameterSlotD;
        Object next;
        try {
            Iterator it = this.f261900e.values().iterator();
            while (true) {
                parameterSlotD = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((CategoryParameter) next).getId(), str)) {
                    break;
                }
            }
            CategoryParameter categoryParameter = (CategoryParameter) next;
            if (categoryParameter != null) {
                parameterSlotD = categoryParameter;
            } else {
                ParameterSlot parameterSlotFindParameter = this.f261897b.findParameter(str);
                if (parameterSlotFindParameter != null) {
                    parameterSlotD = d(C42745f0.L(this.f261897b, parameterSlotFindParameter), parameterSlotFindParameter);
                }
            }
        } finally {
        }
        return parameterSlotD;
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.k
    public final <T extends ParameterSlot> List<T> findParametersOfType(@Y61.k Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<ParameterSlot> it = ParametersTree.DefaultImpls.iterator(this);
        while (it.hasNext()) {
            ParameterSlot next = it.next();
            if (cls.isInstance(next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ParameterSlot parameterSlot = (ParameterSlot) it2.next();
            d(C42745f0.L(this.f261897b, parameterSlot), parameterSlot);
            T tCast = cls.cast(parameterSlot);
            if (tCast != null) {
                arrayList2.add(tCast);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public final int getCount() {
        return this.f261897b.getCount();
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.l
    public final <T extends ParameterSlot> T getFirstParameterOfType(@Y61.k Class<T> cls) {
        ParameterSlot next;
        Iterator<ParameterSlot> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (cls.isInstance(next)) {
                break;
            }
        }
        if (next instanceof ParameterSlot) {
            return (T) next;
        }
        return null;
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public final Object getItem(int i12) {
        ParameterSlot parameterSlotD;
        synchronized (this) {
            parameterSlotD = d(i12, (ParameterSlot) this.f261897b.getItem(i12));
        }
        return parameterSlotD;
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree
    @Y61.k
    public final List<ParameterSlot> getParametersExceptOwnedBySlots() {
        return this.f261897b.getParametersExceptOwnedBySlots();
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public final boolean isEmpty() {
        return this.f261897b.isEmpty();
    }

    @Override // com.avito.android.remote.model.IterableParameters, java.lang.Iterable
    @Y61.k
    public final Iterator<ParameterSlot> iterator() {
        return ParametersTree.DefaultImpls.iterator(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f261897b, i12);
        this.f261898c.writeToParcel(parcel, i12);
        Map<Integer, CategoryParameter> map = this.f261899d;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = com.akita.compose.theme.re23.style.C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }

    public /* synthetic */ ReplaceLocationParametersTree(ParametersTreeWithAdditional parametersTreeWithAdditional, LocationInfo locationInfo, Map map, int i12, C42822w c42822w) {
        this(parametersTreeWithAdditional, locationInfo, (i12 & 4) != 0 ? null : map);
    }
}
