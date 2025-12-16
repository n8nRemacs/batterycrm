package com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UspBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItemAnalytics;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UspBannerItemAnalytics implements Parcelable {

    @k
    public static final Parcelable.Creator<UspBannerItemAnalytics> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f273319b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f273320c;

    /* compiled from: UspBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UspBannerItemAnalytics> {
        @Override // android.os.Parcelable.Creator
        public final UspBannerItemAnalytics createFromParcel(Parcel parcel) {
            return new UspBannerItemAnalytics(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UspBannerItemAnalytics[] newArray(int i12) {
            return new UspBannerItemAnalytics[i12];
        }
    }

    public UspBannerItemAnalytics(@l String str, @l String str2) {
        this.f273319b = str;
        this.f273320c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UspBannerItemAnalytics)) {
            return false;
        }
        UspBannerItemAnalytics uspBannerItemAnalytics = (UspBannerItemAnalytics) obj;
        return L.f(this.f273319b, uspBannerItemAnalytics.f273319b) && L.f(this.f273320c, uspBannerItemAnalytics.f273320c);
    }

    public final int hashCode() {
        String str = this.f273319b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273320c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UspBannerItemAnalytics(fromPage=");
        sb2.append(this.f273319b);
        sb2.append(", targetPage=");
        return C22026a.c(sb2, this.f273320c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f273319b);
        parcel.writeString(this.f273320c);
    }
}
