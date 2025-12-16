package com.avito.android.sx_address.selectaddresslist.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectListScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/domain/SelectListScreenData;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectListScreenData implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectListScreenData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<AddressListViewItem> f294076b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AddressListViewItem f294077c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AddButton f294078d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f294079e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f294080f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f294081g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f294082h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f294083i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f294084j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f294085k;

    /* compiled from: SelectListScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectListScreenData> {
        @Override // android.os.Parcelable.Creator
        public final SelectListScreenData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AddressListViewItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            Boolean boolValueOf = null;
            AddressListViewItem addressListViewItemCreateFromParcel = parcel.readInt() == 0 ? null : AddressListViewItem.CREATOR.createFromParcel(parcel);
            AddButton addButtonCreateFromParcel = parcel.readInt() == 0 ? null : AddButton.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SelectListScreenData(arrayList, addressListViewItemCreateFromParcel, addButtonCreateFromParcel, string, string2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectListScreenData[] newArray(int i12) {
            return new SelectListScreenData[i12];
        }
    }

    public SelectListScreenData(@k List<AddressListViewItem> list, @l AddressListViewItem addressListViewItem, @l AddButton addButton, @l String str, @l String str2, @l Boolean bool, @l String str3, @l String str4, @l String str5, boolean z12) {
        this.f294076b = list;
        this.f294077c = addressListViewItem;
        this.f294078d = addButton;
        this.f294079e = str;
        this.f294080f = str2;
        this.f294081g = bool;
        this.f294082h = str3;
        this.f294083i = str4;
        this.f294084j = str5;
        this.f294085k = z12;
    }

    public static SelectListScreenData a(SelectListScreenData selectListScreenData, List list, AddressListViewItem addressListViewItem, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            list = selectListScreenData.f294076b;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            addressListViewItem = selectListScreenData.f294077c;
        }
        AddressListViewItem addressListViewItem2 = addressListViewItem;
        AddButton addButton = selectListScreenData.f294078d;
        String str = selectListScreenData.f294079e;
        String str2 = selectListScreenData.f294080f;
        Boolean bool = selectListScreenData.f294081g;
        String str3 = selectListScreenData.f294082h;
        String str4 = selectListScreenData.f294083i;
        String str5 = selectListScreenData.f294084j;
        if ((i12 & 512) != 0) {
            z12 = selectListScreenData.f294085k;
        }
        selectListScreenData.getClass();
        return new SelectListScreenData(list2, addressListViewItem2, addButton, str, str2, bool, str3, str4, str5, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectListScreenData)) {
            return false;
        }
        SelectListScreenData selectListScreenData = (SelectListScreenData) obj;
        return L.f(this.f294076b, selectListScreenData.f294076b) && L.f(this.f294077c, selectListScreenData.f294077c) && L.f(this.f294078d, selectListScreenData.f294078d) && L.f(this.f294079e, selectListScreenData.f294079e) && L.f(this.f294080f, selectListScreenData.f294080f) && L.f(this.f294081g, selectListScreenData.f294081g) && L.f(this.f294082h, selectListScreenData.f294082h) && L.f(this.f294083i, selectListScreenData.f294083i) && L.f(this.f294084j, selectListScreenData.f294084j) && this.f294085k == selectListScreenData.f294085k;
    }

    public final int hashCode() {
        int iHashCode = this.f294076b.hashCode() * 31;
        AddressListViewItem addressListViewItem = this.f294077c;
        int iHashCode2 = (iHashCode + (addressListViewItem == null ? 0 : addressListViewItem.hashCode())) * 31;
        AddButton addButton = this.f294078d;
        int iHashCode3 = (iHashCode2 + (addButton == null ? 0 : addButton.hashCode())) * 31;
        String str = this.f294079e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f294080f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f294081g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f294082h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f294083i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f294084j;
        return Boolean.hashCode(this.f294085k) + ((iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectListScreenData(addresses=");
        sb2.append(this.f294076b);
        sb2.append(", selectedAddress=");
        sb2.append(this.f294077c);
        sb2.append(", addButton=");
        sb2.append(this.f294078d);
        sb2.append(", editSubtitle=");
        sb2.append(this.f294079e);
        sb2.append(", editTitle=");
        sb2.append(this.f294080f);
        sb2.append(", needSearch=");
        sb2.append(this.f294081g);
        sb2.append(", searchErrorText=");
        sb2.append(this.f294082h);
        sb2.append(", searchPlaceholder=");
        sb2.append(this.f294083i);
        sb2.append(", submitTitle=");
        sb2.append(this.f294084j);
        sb2.append(", showNotSelectedAddress=");
        return r.x(sb2, this.f294085k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f294076b, parcel);
        while (itJ.hasNext()) {
            ((AddressListViewItem) itJ.next()).writeToParcel(parcel, i12);
        }
        AddressListViewItem addressListViewItem = this.f294077c;
        if (addressListViewItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressListViewItem.writeToParcel(parcel, i12);
        }
        AddButton addButton = this.f294078d;
        if (addButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addButton.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f294079e);
        parcel.writeString(this.f294080f);
        Boolean bool = this.f294081g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f294082h);
        parcel.writeString(this.f294083i);
        parcel.writeString(this.f294084j);
        parcel.writeInt(this.f294085k ? 1 : 0);
    }

    public /* synthetic */ SelectListScreenData(List list, AddressListViewItem addressListViewItem, AddButton addButton, String str, String str2, Boolean bool, String str3, String str4, String str5, boolean z12, int i12, C42822w c42822w) {
        this(list, addressListViewItem, addButton, str, str2, bool, str3, str4, str5, (i12 & 512) != 0 ? false : z12);
    }
}
