package com.avito.android.advert.item.additionalSeller.analytics;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ButtonItemAnalyticsInfo.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/analytics/ButtonItemAnalyticsInfo;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ButtonItemAnalyticsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ButtonItemAnalyticsInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f72553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72554c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72555d;

    /* compiled from: ButtonItemAnalyticsInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonItemAnalyticsInfo> {
        @Override // android.os.Parcelable.Creator
        public final ButtonItemAnalyticsInfo createFromParcel(Parcel parcel) {
            return new ButtonItemAnalyticsInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonItemAnalyticsInfo[] newArray(int i12) {
            return new ButtonItemAnalyticsInfo[i12];
        }
    }

    public ButtonItemAnalyticsInfo(@k String str, int i12, int i13) {
        this.f72553b = str;
        this.f72554c = i12;
        this.f72555d = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonItemAnalyticsInfo)) {
            return false;
        }
        ButtonItemAnalyticsInfo buttonItemAnalyticsInfo = (ButtonItemAnalyticsInfo) obj;
        return L.f(this.f72553b, buttonItemAnalyticsInfo.f72553b) && this.f72554c == buttonItemAnalyticsInfo.f72554c && this.f72555d == buttonItemAnalyticsInfo.f72555d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72555d) + r.e(this.f72554c, this.f72553b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonItemAnalyticsInfo(itemId=");
        sb2.append(this.f72553b);
        sb2.append(", cardModelId=");
        sb2.append(this.f72554c);
        sb2.append(", catalogId=");
        return r.t(sb2, this.f72555d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f72553b);
        parcel.writeInt(this.f72554c);
        parcel.writeInt(this.f72555d);
    }
}
