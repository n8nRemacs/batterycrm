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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItemBadge;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UspBannerItemBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<UspBannerItemBadge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f273321b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f273322c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f273323d;

    /* compiled from: UspBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UspBannerItemBadge> {
        @Override // android.os.Parcelable.Creator
        public final UspBannerItemBadge createFromParcel(Parcel parcel) {
            return new UspBannerItemBadge(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UspBannerItemBadge[] newArray(int i12) {
            return new UspBannerItemBadge[i12];
        }
    }

    public UspBannerItemBadge(@k String str, @k String str2, @k String str3) {
        this.f273321b = str;
        this.f273322c = str2;
        this.f273323d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UspBannerItemBadge)) {
            return false;
        }
        UspBannerItemBadge uspBannerItemBadge = (UspBannerItemBadge) obj;
        return L.f(this.f273321b, uspBannerItemBadge.f273321b) && L.f(this.f273322c, uspBannerItemBadge.f273322c) && L.f(this.f273323d, uspBannerItemBadge.f273323d);
    }

    public final int hashCode() {
        return this.f273323d.hashCode() + H.d(this.f273321b.hashCode() * 31, 31, this.f273322c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UspBannerItemBadge(text=");
        sb2.append(this.f273321b);
        sb2.append(", style=");
        sb2.append(this.f273322c);
        sb2.append(", theme=");
        return C22026a.c(sb2, this.f273323d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f273321b);
        parcel.writeString(this.f273322c);
        parcel.writeString(this.f273323d);
    }
}
