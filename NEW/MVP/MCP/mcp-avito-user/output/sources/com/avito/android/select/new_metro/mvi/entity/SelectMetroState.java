package com.avito.android.select.new_metro.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.metro_lines.MetroStation;
import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.select.new_metro.item.SelectedStationInfo;
import com.avito.android.util.O2;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectMetroState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "SelectMetroStateLCE", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final /* data */ class SelectMetroState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MetroListOutputTypeItem f266248b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MetroSelectedStationsItem f266249c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f266250d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f266251e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SelectMetroStateLCE f266252f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f266253g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f266247h = new a(null);

    @k
    public static final Parcelable.Creator<SelectMetroState> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectMetroState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState$SelectMetroStateLCE;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectMetroStateLCE {

        /* renamed from: b, reason: collision with root package name */
        public static final SelectMetroStateLCE f266254b;

        /* renamed from: c, reason: collision with root package name */
        public static final SelectMetroStateLCE f266255c;

        /* renamed from: d, reason: collision with root package name */
        public static final SelectMetroStateLCE f266256d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SelectMetroStateLCE[] f266257e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f266258f;

        static {
            SelectMetroStateLCE selectMetroStateLCE = new SelectMetroStateLCE("LOADING", 0);
            f266254b = selectMetroStateLCE;
            SelectMetroStateLCE selectMetroStateLCE2 = new SelectMetroStateLCE("CONTENT", 1);
            f266255c = selectMetroStateLCE2;
            SelectMetroStateLCE selectMetroStateLCE3 = new SelectMetroStateLCE("ERROR", 2);
            f266256d = selectMetroStateLCE3;
            SelectMetroStateLCE[] selectMetroStateLCEArr = {selectMetroStateLCE, selectMetroStateLCE2, selectMetroStateLCE3};
            f266257e = selectMetroStateLCEArr;
            f266258f = c.a(selectMetroStateLCEArr);
        }

        public SelectMetroStateLCE() {
            throw null;
        }

        public static SelectMetroStateLCE valueOf(String str) {
            return (SelectMetroStateLCE) Enum.valueOf(SelectMetroStateLCE.class, str);
        }

        public static SelectMetroStateLCE[] values() {
            return (SelectMetroStateLCE[]) f266257e.clone();
        }
    }

    /* compiled from: SelectMetroState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static SelectMetroState a(@l MetroResponseBody metroResponseBody, @k ItemsHolder itemsHolder) {
            if (metroResponseBody == null) {
                MetroListOutputTypeItem metroListOutputTypeItem = new MetroListOutputTypeItem("", MetroListOutputTypeItem.OutputType.f266189b);
                C42784z0 c42784z0 = C42784z0.f406748b;
                return new SelectMetroState(metroListOutputTypeItem, new MetroSelectedStationsItem("", 0, false, c42784z0, 6, null), c42784z0, false, SelectMetroStateLCE.f266254b, "");
            }
            List<MetroStation> stations = metroResponseBody.getStations();
            ArrayList arrayList = new ArrayList(C42745f0.q(stations, 10));
            Iterator<T> it = stations.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((MetroStation) it.next()).getId()));
            }
            MetroListOutputTypeItem metroListOutputTypeItemX2 = itemsHolder.x2();
            MetroSelectedStationsItem metroSelectedStationsItemX3 = itemsHolder.X3();
            List listU = C42745f0.U(metroSelectedStationsItemX3, metroListOutputTypeItemX2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MetroStationItem metroStationItem = itemsHolder.c6().get(Integer.valueOf(((Number) it2.next()).intValue()));
                if (metroStationItem != null) {
                    arrayList2.add(metroStationItem);
                }
            }
            List<SelectedStationInfo> list = metroSelectedStationsItemX3.f266196e;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((SelectedStationInfo) it3.next()).f266210d));
            }
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(listU);
            ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                MetroStationItem metroStationItemA = (MetroStationItem) it4.next();
                if (arrayList3.contains(Integer.valueOf(metroStationItemA.f266202e))) {
                    metroStationItemA = MetroStationItem.a(metroStationItemA, 479);
                }
                arrayList5.add(metroStationItemA);
            }
            arrayList4.addAll(arrayList5);
            return new SelectMetroState(metroListOutputTypeItemX2, metroSelectedStationsItemX3, arrayList4, O2.a(metroSelectedStationsItemX3.f266196e), SelectMetroStateLCE.f266255c, "");
        }

        public a() {
        }
    }

    /* compiled from: SelectMetroState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SelectMetroState> {
        @Override // android.os.Parcelable.Creator
        public final SelectMetroState createFromParcel(Parcel parcel) {
            MetroListOutputTypeItem metroListOutputTypeItemCreateFromParcel = MetroListOutputTypeItem.CREATOR.createFromParcel(parcel);
            MetroSelectedStationsItem metroSelectedStationsItemCreateFromParcel = MetroSelectedStationsItem.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectMetroState.class, parcel, arrayList, iL2, 1);
            }
            return new SelectMetroState(metroListOutputTypeItemCreateFromParcel, metroSelectedStationsItemCreateFromParcel, arrayList, parcel.readInt() != 0, SelectMetroStateLCE.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectMetroState[] newArray(int i12) {
            return new SelectMetroState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectMetroState(@k MetroListOutputTypeItem metroListOutputTypeItem, @k MetroSelectedStationsItem metroSelectedStationsItem, @k List<? extends ParcelableItem> list, boolean z12, @k SelectMetroStateLCE selectMetroStateLCE, @k String str) {
        this.f266248b = metroListOutputTypeItem;
        this.f266249c = metroSelectedStationsItem;
        this.f266250d = list;
        this.f266251e = z12;
        this.f266252f = selectMetroStateLCE;
        this.f266253g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SelectMetroState a(SelectMetroState selectMetroState, MetroListOutputTypeItem metroListOutputTypeItem, MetroSelectedStationsItem metroSelectedStationsItem, ArrayList arrayList, SelectMetroStateLCE selectMetroStateLCE, String str, int i12) {
        if ((i12 & 1) != 0) {
            metroListOutputTypeItem = selectMetroState.f266248b;
        }
        MetroListOutputTypeItem metroListOutputTypeItem2 = metroListOutputTypeItem;
        if ((i12 & 2) != 0) {
            metroSelectedStationsItem = selectMetroState.f266249c;
        }
        MetroSelectedStationsItem metroSelectedStationsItem2 = metroSelectedStationsItem;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = selectMetroState.f266250d;
        }
        List list2 = list;
        boolean z12 = selectMetroState.f266251e;
        if ((i12 & 16) != 0) {
            selectMetroStateLCE = selectMetroState.f266252f;
        }
        SelectMetroStateLCE selectMetroStateLCE2 = selectMetroStateLCE;
        if ((i12 & 32) != 0) {
            str = selectMetroState.f266253g;
        }
        selectMetroState.getClass();
        return new SelectMetroState(metroListOutputTypeItem2, metroSelectedStationsItem2, list2, z12, selectMetroStateLCE2, str);
    }

    @k
    public final ArrayList c() {
        List<SelectedStationInfo> list = this.f266249c.f266196e;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SelectedStationInfo) it.next()).f266210d));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectMetroState)) {
            return false;
        }
        SelectMetroState selectMetroState = (SelectMetroState) obj;
        return L.f(this.f266248b, selectMetroState.f266248b) && L.f(this.f266249c, selectMetroState.f266249c) && L.f(this.f266250d, selectMetroState.f266250d) && this.f266251e == selectMetroState.f266251e && this.f266252f == selectMetroState.f266252f && L.f(this.f266253g, selectMetroState.f266253g);
    }

    public final int hashCode() {
        return this.f266253g.hashCode() + ((this.f266252f.hashCode() + r.i(H.e((this.f266249c.hashCode() + (this.f266248b.hashCode() * 31)) * 31, 31, this.f266250d), 31, this.f266251e)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectMetroState(selectOutputTypeItem=");
        sb2.append(this.f266248b);
        sb2.append(", selectedStationsItem=");
        sb2.append(this.f266249c);
        sb2.append(", items=");
        sb2.append(this.f266250d);
        sb2.append(", startedWithSelectMetro=");
        sb2.append(this.f266251e);
        sb2.append(", lce=");
        sb2.append(this.f266252f);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f266253g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f266248b.writeToParcel(parcel, i12);
        this.f266249c.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.f266250d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f266251e ? 1 : 0);
        parcel.writeString(this.f266252f.name());
        parcel.writeString(this.f266253g);
    }
}
