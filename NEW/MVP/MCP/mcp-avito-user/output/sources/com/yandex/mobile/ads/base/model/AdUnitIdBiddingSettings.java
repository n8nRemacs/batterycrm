package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.zf0;
import j.N;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class AdUnitIdBiddingSettings implements Parcelable {
    public static final Parcelable.Creator<AdUnitIdBiddingSettings> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f382624a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final List<zf0> f382625b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final String f382626c;

    public class a implements Parcelable.Creator<AdUnitIdBiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings createFromParcel(Parcel parcel) {
            return new AdUnitIdBiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings[] newArray(int i12) {
            return new AdUnitIdBiddingSettings[i12];
        }
    }

    public AdUnitIdBiddingSettings(@N String str, @N String str2, @N ArrayList arrayList) {
        this.f382624a = str;
        this.f382625b = arrayList;
        this.f382626c = str2;
    }

    @N
    public final String c() {
        return this.f382624a;
    }

    @N
    public final List<zf0> d() {
        return this.f382625b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @N
    public final String e() {
        return this.f382626c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdUnitIdBiddingSettings adUnitIdBiddingSettings = (AdUnitIdBiddingSettings) obj;
        return this.f382624a.equals(adUnitIdBiddingSettings.f382624a) && this.f382625b.equals(adUnitIdBiddingSettings.f382625b);
    }

    public final int hashCode() {
        return this.f382625b.hashCode() + (this.f382624a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeList(this.f382625b);
        parcel.writeString(this.f382624a);
        parcel.writeString(this.f382626c);
    }

    public AdUnitIdBiddingSettings(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f382625b = arrayList;
        parcel.readList(arrayList, zf0.class.getClassLoader());
        this.f382624a = parcel.readString();
        this.f382626c = parcel.readString();
    }
}
