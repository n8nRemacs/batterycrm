package com.avito.android.sx_address.selectaddresslist.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectListScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/domain/AddressListViewItem;", "Landroid/os/Parcelable;", "Lcom/avito/conveyor_item/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddressListViewItem implements Parcelable, com.avito.conveyor_item.a {

    @k
    public static final Parcelable.Creator<AddressListViewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294064b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f294065c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f294066d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f294067e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ListItemValue f294068f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f294069g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f294070h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f294071i;

    /* compiled from: SelectListScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressListViewItem> {
        @Override // android.os.Parcelable.Creator
        public final AddressListViewItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ListItemValue listItemValueCreateFromParcel = ListItemValue.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressListViewItem(string, string2, string3, string4, listItemValueCreateFromParcel, z12, boolValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AddressListViewItem[] newArray(int i12) {
            return new AddressListViewItem[i12];
        }
    }

    public AddressListViewItem(@k String str, @l String str2, @k String str3, @k String str4, @k ListItemValue listItemValue, boolean z12, @l Boolean bool, boolean z13) {
        this.f294064b = str;
        this.f294065c = str2;
        this.f294066d = str3;
        this.f294067e = str4;
        this.f294068f = listItemValue;
        this.f294069g = z12;
        this.f294070h = bool;
        this.f294071i = z13;
    }

    public static AddressListViewItem a(AddressListViewItem addressListViewItem, boolean z12, boolean z13, int i12) {
        String str = addressListViewItem.f294064b;
        String str2 = addressListViewItem.f294065c;
        String str3 = addressListViewItem.f294066d;
        String str4 = addressListViewItem.f294067e;
        ListItemValue listItemValue = addressListViewItem.f294068f;
        if ((i12 & 32) != 0) {
            z12 = addressListViewItem.f294069g;
        }
        boolean z14 = z12;
        Boolean bool = addressListViewItem.f294070h;
        if ((i12 & 128) != 0) {
            z13 = addressListViewItem.f294071i;
        }
        addressListViewItem.getClass();
        return new AddressListViewItem(str, str2, str3, str4, listItemValue, z14, bool, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressListViewItem)) {
            return false;
        }
        AddressListViewItem addressListViewItem = (AddressListViewItem) obj;
        return L.f(this.f294064b, addressListViewItem.f294064b) && L.f(this.f294065c, addressListViewItem.f294065c) && L.f(this.f294066d, addressListViewItem.f294066d) && L.f(this.f294067e, addressListViewItem.f294067e) && L.f(this.f294068f, addressListViewItem.f294068f) && this.f294069g == addressListViewItem.f294069g && L.f(this.f294070h, addressListViewItem.f294070h) && this.f294071i == addressListViewItem.f294071i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF294814b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294814b() {
        return this.f294064b;
    }

    public final int hashCode() {
        int iHashCode = this.f294064b.hashCode() * 31;
        String str = this.f294065c;
        int i12 = r.i((this.f294068f.hashCode() + H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f294066d), 31, this.f294067e)) * 31, 31, this.f294069g);
        Boolean bool = this.f294070h;
        return Boolean.hashCode(this.f294071i) + ((i12 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressListViewItem(stringId=");
        sb2.append(this.f294064b);
        sb2.append(", house=");
        sb2.append(this.f294065c);
        sb2.append(", location=");
        sb2.append(this.f294066d);
        sb2.append(", name=");
        sb2.append(this.f294067e);
        sb2.append(", value=");
        sb2.append(this.f294068f);
        sb2.append(", isSelected=");
        sb2.append(this.f294069g);
        sb2.append(", isDisabled=");
        sb2.append(this.f294070h);
        sb2.append(", isError=");
        return r.x(sb2, this.f294071i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f294064b);
        parcel.writeString(this.f294065c);
        parcel.writeString(this.f294066d);
        parcel.writeString(this.f294067e);
        this.f294068f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f294069g ? 1 : 0);
        Boolean bool = this.f294070h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f294071i ? 1 : 0);
    }

    public /* synthetic */ AddressListViewItem(String str, String str2, String str3, String str4, ListItemValue listItemValue, boolean z12, Boolean bool, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, listItemValue, z12, bool, (i12 & 128) != 0 ? false : z13);
    }
}
