package com.avito.android.profile_phones.phones_list.device_list_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeviceListItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/device_list_item/DeviceListItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DeviceListItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<DeviceListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f227645b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f227646c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f227647d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f227648e;

    /* renamed from: f, reason: collision with root package name */
    public final int f227649f;

    /* compiled from: DeviceListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeviceListItem> {
        @Override // android.os.Parcelable.Creator
        public final DeviceListItem createFromParcel(Parcel parcel) {
            return new DeviceListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceListItem[] newArray(int i12) {
            return new DeviceListItem[i12];
        }
    }

    public DeviceListItem(@k String str, @k String str2, @l String str3, int i12, boolean z12) {
        this.f227645b = str;
        this.f227646c = str2;
        this.f227647d = str3;
        this.f227648e = z12;
        this.f227649f = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceListItem)) {
            return false;
        }
        DeviceListItem deviceListItem = (DeviceListItem) obj;
        return L.f(this.f227645b, deviceListItem.f227645b) && L.f(this.f227646c, deviceListItem.f227646c) && L.f(this.f227647d, deviceListItem.f227647d) && this.f227648e == deviceListItem.f227648e && this.f227649f == deviceListItem.f227649f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF227645b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF227645b() {
        return this.f227645b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f227645b.hashCode() * 31, 31, this.f227646c);
        String str = this.f227647d;
        return Integer.hashCode(this.f227649f) + r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f227648e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceListItem(stringId=");
        sb2.append(this.f227645b);
        sb2.append(", name=");
        sb2.append(this.f227646c);
        sb2.append(", subtitle=");
        sb2.append(this.f227647d);
        sb2.append(", canDelete=");
        sb2.append(this.f227648e);
        sb2.append(", itemsCounter=");
        return r.t(sb2, this.f227649f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f227645b);
        parcel.writeString(this.f227646c);
        parcel.writeString(this.f227647d);
        parcel.writeInt(this.f227648e ? 1 : 0);
        parcel.writeInt(this.f227649f);
    }
}
