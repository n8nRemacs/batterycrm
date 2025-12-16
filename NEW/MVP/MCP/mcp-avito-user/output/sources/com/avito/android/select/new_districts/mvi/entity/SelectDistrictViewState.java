package com.avito.android.select.new_districts.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip;
import com.avito.android.select.new_districts.mvi.entity.ui.RegionState;
import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictViewState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictViewState;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectDistrictViewState implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectDistrictViewState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<UiItem> f265825b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<DistrictChip> f265826c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Boolean> f265827d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<RegionState> f265828e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<Boolean> f265829f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f265830g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f265831h;

    /* compiled from: SelectDistrictViewState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectDistrictViewState> {
        @Override // android.os.Parcelable.Creator
        public final SelectDistrictViewState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectDistrictViewState.class, parcel, arrayList, iL2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(DistrictChip.CREATOR, parcel, arrayList2, iC2, 1);
            }
            int i14 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i14);
            int i15 = 0;
            while (true) {
                boolean z12 = true;
                if (i15 == i14) {
                    break;
                }
                if (parcel.readInt() == 0) {
                    z12 = false;
                }
                arrayList3.add(Boolean.valueOf(z12));
                i15++;
            }
            int i16 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i16);
            int iC3 = 0;
            while (iC3 != i16) {
                iC3 = com.avito.android.actions_sheet.a.c(RegionState.CREATOR, parcel, arrayList4, iC3, 1);
            }
            int i17 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList5.add(Boolean.valueOf(parcel.readInt() != 0));
            }
            return new SelectDistrictViewState(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDistrictViewState[] newArray(int i12) {
            return new SelectDistrictViewState[i12];
        }
    }

    public SelectDistrictViewState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static SelectDistrictViewState a(SelectDistrictViewState selectDistrictViewState, List list, ArrayList arrayList, List list2, List list3, List list4, String str, boolean z12, int i12) {
        List list5 = (i12 & 1) != 0 ? selectDistrictViewState.f265825b : list;
        List<DistrictChip> list6 = (i12 & 2) != 0 ? selectDistrictViewState.f265826c : arrayList;
        List list7 = (i12 & 4) != 0 ? selectDistrictViewState.f265827d : list2;
        List list8 = (i12 & 8) != 0 ? selectDistrictViewState.f265828e : list3;
        List list9 = (i12 & 16) != 0 ? selectDistrictViewState.f265829f : list4;
        String str2 = (i12 & 32) != 0 ? selectDistrictViewState.f265830g : str;
        boolean z13 = (i12 & 64) != 0 ? selectDistrictViewState.f265831h : z12;
        selectDistrictViewState.getClass();
        return new SelectDistrictViewState(list5, list6, list7, list8, list9, str2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDistrictViewState)) {
            return false;
        }
        SelectDistrictViewState selectDistrictViewState = (SelectDistrictViewState) obj;
        return L.f(this.f265825b, selectDistrictViewState.f265825b) && L.f(this.f265826c, selectDistrictViewState.f265826c) && L.f(this.f265827d, selectDistrictViewState.f265827d) && L.f(this.f265828e, selectDistrictViewState.f265828e) && L.f(this.f265829f, selectDistrictViewState.f265829f) && L.f(this.f265830g, selectDistrictViewState.f265830g) && this.f265831h == selectDistrictViewState.f265831h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265831h) + H.d(H.e(H.e(H.e(H.e(this.f265825b.hashCode() * 31, 31, this.f265826c), 31, this.f265827d), 31, this.f265828e), 31, this.f265829f), 31, this.f265830g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectDistrictViewState(immutableUiItemsList=");
        sb2.append(this.f265825b);
        sb2.append(", immutableUiChipsInfoList=");
        sb2.append(this.f265826c);
        sb2.append(", isItemSelectedByIndex=");
        sb2.append(this.f265827d);
        sb2.append(", regionsState=");
        sb2.append(this.f265828e);
        sb2.append(", isItemShowBySearchByIndex=");
        sb2.append(this.f265829f);
        sb2.append(", searchQuery=");
        sb2.append(this.f265830g);
        sb2.append(", isSearchModeOn=");
        return r.x(sb2, this.f265831h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f265825b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.f265826c, parcel);
        while (itJ2.hasNext()) {
            ((DistrictChip) itJ2.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ3 = C0.j(this.f265827d, parcel);
        while (itJ3.hasNext()) {
            parcel.writeInt(((Boolean) itJ3.next()).booleanValue() ? 1 : 0);
        }
        Iterator itJ4 = C0.j(this.f265828e, parcel);
        while (itJ4.hasNext()) {
            ((RegionState) itJ4.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ5 = C0.j(this.f265829f, parcel);
        while (itJ5.hasNext()) {
            parcel.writeInt(((Boolean) itJ5.next()).booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f265830g);
        parcel.writeInt(this.f265831h ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectDistrictViewState(@k List<? extends UiItem> list, @k List<DistrictChip> list2, @k List<Boolean> list3, @k List<RegionState> list4, @k List<Boolean> list5, @k String str, boolean z12) {
        this.f265825b = list;
        this.f265826c = list2;
        this.f265827d = list3;
        this.f265828e = list4;
        this.f265829f = list5;
        this.f265830g = str;
        this.f265831h = z12;
    }

    public SelectDistrictViewState(List list, List list2, List list3, List list4, List list5, String str, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? C42784z0.f406748b : list3, (i12 & 8) != 0 ? C42784z0.f406748b : list4, (i12 & 16) != 0 ? C42784z0.f406748b : list5, (i12 & 32) != 0 ? "" : str, (i12 & 64) != 0 ? false : z12);
    }
}
