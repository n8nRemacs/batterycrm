package com.avito.android.profile_settings_extended.adapter.count;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CountItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/count/CountItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "LRb0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CountItem implements SettingsListItem, InterfaceC15025a, Rb0.d {

    @k
    public static final Parcelable.Creator<CountItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229357b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229358c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f229359d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f229360e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f229361f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f229362g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f229363h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f229364i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f229365j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f229366k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f229367l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f229368m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Integer f229369n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f229370o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f229371p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229372q;

    /* compiled from: CountItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CountItem> {
        @Override // android.os.Parcelable.Creator
        public final CountItem createFromParcel(Parcel parcel) {
            return new CountItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CountItem[] newArray(int i12) {
            return new CountItem[i12];
        }
    }

    public CountItem(@k String str, @l String str2, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l Integer num, @l Integer num2, @l String str8, @k String str9, @k String str10, @l Integer num3, @l String str11, boolean z12) {
        this.f229357b = str;
        this.f229358c = str2;
        this.f229359d = str3;
        this.f229360e = str4;
        this.f229361f = str5;
        this.f229362g = str6;
        this.f229363h = str7;
        this.f229364i = num;
        this.f229365j = num2;
        this.f229366k = str8;
        this.f229367l = str9;
        this.f229368m = str10;
        this.f229369n = num3;
        this.f229370o = str11;
        this.f229371p = z12;
        this.f229372q = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountItem)) {
            return false;
        }
        CountItem countItem = (CountItem) obj;
        return L.f(this.f229357b, countItem.f229357b) && L.f(this.f229358c, countItem.f229358c) && L.f(this.f229359d, countItem.f229359d) && L.f(this.f229360e, countItem.f229360e) && L.f(this.f229361f, countItem.f229361f) && L.f(this.f229362g, countItem.f229362g) && L.f(this.f229363h, countItem.f229363h) && L.f(this.f229364i, countItem.f229364i) && L.f(this.f229365j, countItem.f229365j) && L.f(this.f229366k, countItem.f229366k) && L.f(this.f229367l, countItem.f229367l) && L.f(this.f229368m, countItem.f229368m) && L.f(this.f229369n, countItem.f229369n) && L.f(this.f229370o, countItem.f229370o) && this.f229371p == countItem.f229371p;
    }

    @Override // Rb0.d
    @l
    /* renamed from: f, reason: from getter */
    public final String getF229813c() {
        return this.f229358c;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154919c() {
        return this.f229372q;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF225291b() {
        return this.f229357b;
    }

    public final int hashCode() {
        int iHashCode = this.f229357b.hashCode() * 31;
        String str = this.f229358c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229359d);
        String str2 = this.f229360e;
        int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f229361f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f229362g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f229363h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f229364i;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f229365j;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f229366k;
        int iD3 = H.d(H.d((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f229367l), 31, this.f229368m);
        Integer num3 = this.f229369n;
        int iHashCode8 = (iD3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.f229370o;
        return Boolean.hashCode(this.f229371p) + ((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CountItem(stringId=");
        sb2.append(this.f229357b);
        sb2.append(", widgetName=");
        sb2.append(this.f229358c);
        sb2.append(", title=");
        sb2.append(this.f229359d);
        sb2.append(", description=");
        sb2.append(this.f229360e);
        sb2.append(", placeholder=");
        sb2.append(this.f229361f);
        sb2.append(", inputPlaceholder=");
        sb2.append(this.f229362g);
        sb2.append(", popupTitle=");
        sb2.append(this.f229363h);
        sb2.append(", maxIntDigits=");
        sb2.append(this.f229364i);
        sb2.append(", maxValue=");
        sb2.append(this.f229365j);
        sb2.append(", popupInputPlaceholder=");
        sb2.append(this.f229366k);
        sb2.append(", fieldName=");
        sb2.append(this.f229367l);
        sb2.append(", valueId=");
        sb2.append(this.f229368m);
        sb2.append(", value=");
        sb2.append(this.f229369n);
        sb2.append(", defaultSaveErrorMessage=");
        sb2.append(this.f229370o);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229371p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229357b);
        parcel.writeString(this.f229358c);
        parcel.writeString(this.f229359d);
        parcel.writeString(this.f229360e);
        parcel.writeString(this.f229361f);
        parcel.writeString(this.f229362g);
        parcel.writeString(this.f229363h);
        Integer num = this.f229364i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f229365j;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeString(this.f229366k);
        parcel.writeString(this.f229367l);
        parcel.writeString(this.f229368m);
        Integer num3 = this.f229369n;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeString(this.f229370o);
        parcel.writeInt(this.f229371p ? 1 : 0);
    }

    public /* synthetic */ CountItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, String str9, String str10, Integer num3, String str11, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "count_item" : str, str2, str3, str4, str5, str6, str7, num, num2, str8, str9, str10, num3, str11, z12);
    }
}
