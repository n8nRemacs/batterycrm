package com.avito.android.early_access.adapter.parameter.element;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessParameterItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/parameter/element/EarlyAccessParameterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessParameterItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessParameterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145140b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f145141c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f145142d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f145143e;

    /* compiled from: EarlyAccessParameterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessParameterItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessParameterItem createFromParcel(Parcel parcel) {
            return new EarlyAccessParameterItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessParameterItem[] newArray(int i12) {
            return new EarlyAccessParameterItem[i12];
        }
    }

    public EarlyAccessParameterItem(@k String str, @k String str2, @k String str3, @l String str4) {
        this.f145140b = str;
        this.f145141c = str2;
        this.f145142d = str3;
        this.f145143e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessParameterItem)) {
            return false;
        }
        EarlyAccessParameterItem earlyAccessParameterItem = (EarlyAccessParameterItem) obj;
        return L.f(this.f145140b, earlyAccessParameterItem.f145140b) && L.f(this.f145141c, earlyAccessParameterItem.f145141c) && L.f(this.f145142d, earlyAccessParameterItem.f145142d) && L.f(this.f145143e, earlyAccessParameterItem.f145143e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145140b() {
        return this.f145140b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f145140b.hashCode() * 31, 31, this.f145141c), 31, this.f145142d);
        String str = this.f145143e;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessParameterItem(stringId=");
        sb2.append(this.f145140b);
        sb2.append(", icon=");
        sb2.append(this.f145141c);
        sb2.append(", text=");
        sb2.append(this.f145142d);
        sb2.append(", subtext=");
        return C22026a.c(sb2, this.f145143e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145140b);
        parcel.writeString(this.f145141c);
        parcel.writeString(this.f145142d);
        parcel.writeString(this.f145143e);
    }

    public /* synthetic */ EarlyAccessParameterItem(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessParameterItem.class.getName() : str, str2, str3, (i12 & 8) != 0 ? null : str4);
    }
}
