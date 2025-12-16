package com.avito.android.sx_address.list.mvi.entity;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.ListViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SxAddressListState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/ListState;", "Landroid/os/Parcelable;", "a", "LoadingType", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes4.dex */
public final /* data */ class ListState implements Parcelable {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final ListState f293244g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListViewState f293245b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LoadingType f293246c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ScreenData f293247d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<AddressItem> f293248e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f293243f = new a(null);

    @k
    public static final Parcelable.Creator<ListState> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SxAddressListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/ListState$LoadingType;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f293249b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f293250c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingType f293251d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f293252e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f293253f;

        static {
            LoadingType loadingType = new LoadingType("NONE", 0);
            f293249b = loadingType;
            LoadingType loadingType2 = new LoadingType("LOADING", 1);
            f293250c = loadingType2;
            LoadingType loadingType3 = new LoadingType("ERROR", 2);
            f293251d = loadingType3;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3};
            f293252e = loadingTypeArr;
            f293253f = kotlin.enums.c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f293252e.clone();
        }
    }

    /* compiled from: SxAddressListState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/ListState$a;", "", "<init>", "()V", "Lcom/avito/android/sx_address/list/domain/ScreenData;", "emptyData", "Lcom/avito/android/sx_address/list/domain/ScreenData;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SxAddressListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ListState> {
        @Override // android.os.Parcelable.Creator
        public final ListState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ListViewState listViewState = (ListViewState) parcel.readParcelable(ListState.class.getClassLoader());
            LoadingType loadingTypeValueOf = LoadingType.valueOf(parcel.readString());
            ScreenData screenDataCreateFromParcel = ScreenData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AddressItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ListState(listViewState, loadingTypeValueOf, screenDataCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ListState[] newArray(int i12) {
            return new ListState[i12];
        }
    }

    static {
        ScreenData screenData = new ScreenData(null, new AttributedText("", C42784z0.f406748b, 0, 4, null), null, null, false, null, null, null, null, "", "", false, Filter.f293146c, true, null);
        f293244g = new ListState(new ListViewState.Content(screenData), LoadingType.f293249b, screenData, null);
    }

    public ListState(@k ListViewState listViewState, @k LoadingType loadingType, @k ScreenData screenData, @l List<AddressItem> list) {
        this.f293245b = listViewState;
        this.f293246c = loadingType;
        this.f293247d = screenData;
        this.f293248e = list;
    }

    public static ListState a(ListState listState, ListViewState listViewState, LoadingType loadingType, ScreenData screenData, List list, int i12) {
        if ((i12 & 1) != 0) {
            listViewState = listState.f293245b;
        }
        if ((i12 & 2) != 0) {
            loadingType = listState.f293246c;
        }
        if ((i12 & 4) != 0) {
            screenData = listState.f293247d;
        }
        if ((i12 & 8) != 0) {
            list = listState.f293248e;
        }
        listState.getClass();
        return new ListState(listViewState, loadingType, screenData, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListState)) {
            return false;
        }
        ListState listState = (ListState) obj;
        return L.f(this.f293245b, listState.f293245b) && this.f293246c == listState.f293246c && L.f(this.f293247d, listState.f293247d) && L.f(this.f293248e, listState.f293248e);
    }

    public final int hashCode() {
        int iHashCode = (this.f293247d.hashCode() + ((this.f293246c.hashCode() + (this.f293245b.hashCode() * 31)) * 31)) * 31;
        List<AddressItem> list = this.f293248e;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListState(viewState=");
        sb2.append(this.f293245b);
        sb2.append(", loadingType=");
        sb2.append(this.f293246c);
        sb2.append(", data=");
        sb2.append(this.f293247d);
        sb2.append(", fullAddressList=");
        return H.p(sb2, this.f293248e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f293245b, i12);
        parcel.writeString(this.f293246c.name());
        this.f293247d.writeToParcel(parcel, i12);
        List<AddressItem> list = this.f293248e;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AddressItem) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
