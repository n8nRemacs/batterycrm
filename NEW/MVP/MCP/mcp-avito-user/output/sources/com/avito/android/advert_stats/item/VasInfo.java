package com.avito.android.advert_stats.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: VasInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/VasInfo;", "Landroid/os/Parcelable;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VasInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VasInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Image f86716c;

    /* compiled from: VasInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasInfo> {
        @Override // android.os.Parcelable.Creator
        public final VasInfo createFromParcel(Parcel parcel) {
            return new VasInfo(parcel.readString(), (Image) parcel.readParcelable(VasInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VasInfo[] newArray(int i12) {
            return new VasInfo[i12];
        }
    }

    public VasInfo(@Y61.k String str, @Y61.k Image image) {
        this.f86715b = str;
        this.f86716c = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f86715b);
        parcel.writeParcelable(this.f86716c, i12);
    }
}
