package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.filters_parameter.ParametersTree;
import com.avito.android.remote.model.filters_parameter.SimpleParametersTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ParametersTreeWithAdditional.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/ParametersTreeWithAdditionalImpl;", "Lcom/avito/android/search/filter/a;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "Lcom/avito/android/remote/model/filters_parameter/ParametersTree;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParametersTreeWithAdditionalImpl implements InterfaceC34534a, ParametersTreeWithAdditional, ParametersTree {

    @Y61.k
    public static final Parcelable.Creator<ParametersTreeWithAdditionalImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<ParameterSlot> f261890b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<AdditionalCategoryParameter> f261891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F1 f261892d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleParametersTree f261893e;

    /* compiled from: ParametersTreeWithAdditional.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParametersTreeWithAdditionalImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParametersTreeWithAdditionalImpl createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = com.avito.android.actions_sheet.a.l(ParametersTreeWithAdditionalImpl.class, parcel, arrayList2, iL3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(ParametersTreeWithAdditionalImpl.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            return new ParametersTreeWithAdditionalImpl(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ParametersTreeWithAdditionalImpl[] newArray(int i12) {
            return new ParametersTreeWithAdditionalImpl[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParametersTreeWithAdditionalImpl(@Y61.k List<? extends ParameterSlot> list, @Y61.l List<? extends AdditionalCategoryParameter> list2) {
        this.f261890b = list;
        this.f261891c = list2;
        this.f261892d = new F1(list2 == 0 ? C42784z0.f406748b : list2);
        this.f261893e = new SimpleParametersTree(list);
    }

    @Override // com.avito.android.search.filter.InterfaceC34534a
    @Y61.l
    public final AdditionalCategoryParameter a(@Y61.k String str) {
        return this.f261892d.a(str);
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree
    public final boolean applyPretendResult(@Y61.l Map<String, ? extends PretendErrorValue> map) {
        return this.f261893e.applyPretendResult(map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.l
    public final ParameterSlot findParameter(@Y61.k String str) {
        return this.f261893e.findParameter(str);
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.k
    public final <T extends ParameterSlot> List<T> findParametersOfType(@Y61.k Class<T> cls) {
        return this.f261893e.findParametersOfType(cls);
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public final int getCount() {
        return this.f261893e.getCount();
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @Y61.l
    public final <T extends ParameterSlot> T getFirstParameterOfType(@Y61.k Class<T> cls) {
        return (T) this.f261893e.getFirstParameterOfType(cls);
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public final Object getItem(int i12) {
        return this.f261893e.getItem(i12);
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree
    @Y61.k
    public final List<ParameterSlot> getParametersExceptOwnedBySlots() {
        return this.f261893e.getParametersExceptOwnedBySlots();
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public final boolean isEmpty() {
        return this.f261893e.isEmpty();
    }

    @Override // com.avito.android.remote.model.IterableParameters, java.lang.Iterable
    @Y61.k
    public final Iterator<ParameterSlot> iterator() {
        return this.f261893e.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = com.akita.compose.theme.re23.style.C0.j(this.f261890b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        List<AdditionalCategoryParameter> list = this.f261891c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
