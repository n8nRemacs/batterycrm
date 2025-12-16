package com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UspBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItemButton;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UspBannerItemButton implements Parcelable {

    @k
    public static final Parcelable.Creator<UspBannerItemButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f273324b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f273325c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f273326d;

    /* compiled from: UspBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UspBannerItemButton> {
        @Override // android.os.Parcelable.Creator
        public final UspBannerItemButton createFromParcel(Parcel parcel) {
            return new UspBannerItemButton(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UspBannerItemButton[] newArray(int i12) {
            return new UspBannerItemButton[i12];
        }
    }

    public UspBannerItemButton(@k String str, @k String str2, @k String str3) {
        this.f273324b = str;
        this.f273325c = str2;
        this.f273326d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UspBannerItemButton)) {
            return false;
        }
        UspBannerItemButton uspBannerItemButton = (UspBannerItemButton) obj;
        return L.f(this.f273324b, uspBannerItemButton.f273324b) && L.f(this.f273325c, uspBannerItemButton.f273325c) && L.f(this.f273326d, uspBannerItemButton.f273326d);
    }

    public final int hashCode() {
        return this.f273326d.hashCode() + H.d(this.f273324b.hashCode() * 31, 31, this.f273325c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UspBannerItemButton(text=");
        sb2.append(this.f273324b);
        sb2.append(", style=");
        sb2.append(this.f273325c);
        sb2.append(", theme=");
        return C22026a.c(sb2, this.f273326d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f273324b);
        parcel.writeString(this.f273325c);
        parcel.writeString(this.f273326d);
    }
}
