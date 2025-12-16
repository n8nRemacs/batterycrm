package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class BiddingSettings implements Parcelable {
    public static final Parcelable.Creator<BiddingSettings> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final List<AdUnitIdBiddingSettings> f382627a;

    public class a implements Parcelable.Creator<BiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final BiddingSettings createFromParcel(Parcel parcel) {
            return new BiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiddingSettings[] newArray(int i12) {
            return new BiddingSettings[i12];
        }
    }

    public BiddingSettings(@N ArrayList arrayList) {
        this.f382627a = arrayList;
    }

    @N
    public final List<AdUnitIdBiddingSettings> c() {
        return this.f382627a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f382627a.equals(((BiddingSettings) obj).f382627a);
    }

    public final int hashCode() {
        return this.f382627a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeTypedList(this.f382627a);
    }

    public BiddingSettings(Parcel parcel) {
        this.f382627a = parcel.createTypedArrayList(AdUnitIdBiddingSettings.CREATOR);
    }
}
