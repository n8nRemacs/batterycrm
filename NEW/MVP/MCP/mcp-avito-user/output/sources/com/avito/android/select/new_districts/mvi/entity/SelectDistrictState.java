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
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.select.new_districts.mvi.entity.ui.RegionState;
import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectDistrictState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<UiItem> f265818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SelectDistrictViewState f265819c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Boolean> f265820d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<RegionState> f265821e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<Boolean> f265822f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f265823g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f265824h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f265817i = new a(null);

    @k
    public static final Parcelable.Creator<SelectDistrictState> CREATOR = new b();

    /* compiled from: SelectDistrictState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictState$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectDistrictState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SelectDistrictState> {
        @Override // android.os.Parcelable.Creator
        public final SelectDistrictState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectDistrictState.class, parcel, arrayList, iL2, 1);
            }
            SelectDistrictViewState selectDistrictViewStateCreateFromParcel = SelectDistrictViewState.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int i14 = 0;
            while (true) {
                boolean z12 = true;
                if (i14 == i13) {
                    break;
                }
                if (parcel.readInt() == 0) {
                    z12 = false;
                }
                arrayList2.add(Boolean.valueOf(z12));
                i14++;
            }
            int i15 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i15);
            int iC2 = 0;
            while (iC2 != i15) {
                iC2 = com.avito.android.actions_sheet.a.c(RegionState.CREATOR, parcel, arrayList3, iC2, 1);
            }
            int i16 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList4.add(Boolean.valueOf(parcel.readInt() != 0));
            }
            return new SelectDistrictState(arrayList, selectDistrictViewStateCreateFromParcel, arrayList2, arrayList3, arrayList4, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDistrictState[] newArray(int i12) {
            return new SelectDistrictState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectDistrictState(@k List<? extends UiItem> list, @k SelectDistrictViewState selectDistrictViewState, @k List<Boolean> list2, @k List<RegionState> list3, @k List<Boolean> list4, @k String str, boolean z12) {
        this.f265818b = list;
        this.f265819c = selectDistrictViewState;
        this.f265820d = list2;
        this.f265821e = list3;
        this.f265822f = list4;
        this.f265823g = str;
        this.f265824h = z12;
    }

    public static SelectDistrictState a(SelectDistrictState selectDistrictState, ArrayList arrayList, SelectDistrictViewState selectDistrictViewState, ArrayList arrayList2, List list, ArrayList arrayList3, String str, boolean z12, int i12) {
        List<UiItem> list2 = (i12 & 1) != 0 ? selectDistrictState.f265818b : arrayList;
        SelectDistrictViewState selectDistrictViewState2 = (i12 & 2) != 0 ? selectDistrictState.f265819c : selectDistrictViewState;
        List<Boolean> list3 = (i12 & 4) != 0 ? selectDistrictState.f265820d : arrayList2;
        List list4 = (i12 & 8) != 0 ? selectDistrictState.f265821e : list;
        List<Boolean> list5 = (i12 & 16) != 0 ? selectDistrictState.f265822f : arrayList3;
        String str2 = (i12 & 32) != 0 ? selectDistrictState.f265823g : str;
        boolean z13 = (i12 & 64) != 0 ? selectDistrictState.f265824h : z12;
        selectDistrictState.getClass();
        return new SelectDistrictState(list2, selectDistrictViewState2, list3, list4, list5, str2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDistrictState)) {
            return false;
        }
        SelectDistrictState selectDistrictState = (SelectDistrictState) obj;
        return L.f(this.f265818b, selectDistrictState.f265818b) && L.f(this.f265819c, selectDistrictState.f265819c) && L.f(this.f265820d, selectDistrictState.f265820d) && L.f(this.f265821e, selectDistrictState.f265821e) && L.f(this.f265822f, selectDistrictState.f265822f) && L.f(this.f265823g, selectDistrictState.f265823g) && this.f265824h == selectDistrictState.f265824h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265824h) + H.d(H.e(H.e(H.e((this.f265819c.hashCode() + (this.f265818b.hashCode() * 31)) * 31, 31, this.f265820d), 31, this.f265821e), 31, this.f265822f), 31, this.f265823g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectDistrictState(immutableUiItemsList=");
        sb2.append(this.f265818b);
        sb2.append(", viewState=");
        sb2.append(this.f265819c);
        sb2.append(", isItemSelectedByIndex=");
        sb2.append(this.f265820d);
        sb2.append(", regionStates=");
        sb2.append(this.f265821e);
        sb2.append(", isItemShowBySearchByIndex=");
        sb2.append(this.f265822f);
        sb2.append(", searchQuery=");
        sb2.append(this.f265823g);
        sb2.append(", isSearchModeOn=");
        return r.x(sb2, this.f265824h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f265818b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        this.f265819c.writeToParcel(parcel, i12);
        Iterator itJ2 = C0.j(this.f265820d, parcel);
        while (itJ2.hasNext()) {
            parcel.writeInt(((Boolean) itJ2.next()).booleanValue() ? 1 : 0);
        }
        Iterator itJ3 = C0.j(this.f265821e, parcel);
        while (itJ3.hasNext()) {
            ((RegionState) itJ3.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ4 = C0.j(this.f265822f, parcel);
        while (itJ4.hasNext()) {
            parcel.writeInt(((Boolean) itJ4.next()).booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f265823g);
        parcel.writeInt(this.f265824h ? 1 : 0);
    }

    public SelectDistrictState(List list, SelectDistrictViewState selectDistrictViewState, List list2, List list3, List list4, String str, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, selectDistrictViewState, (i12 & 4) != 0 ? C42784z0.f406748b : list2, (i12 & 8) != 0 ? C42784z0.f406748b : list3, (i12 & 16) != 0 ? C42784z0.f406748b : list4, (i12 & 32) != 0 ? "" : str, (i12 & 64) != 0 ? false : z12);
    }
}
