package com.yandex.mobile.ads.common;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public class AdImpressionData implements ImpressionData, Parcelable {
    public static final Parcelable.Creator<AdImpressionData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f382645a;

    public class a implements Parcelable.Creator<AdImpressionData> {
        @Override // android.os.Parcelable.Creator
        public final AdImpressionData createFromParcel(Parcel parcel) {
            return new AdImpressionData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdImpressionData[] newArray(int i12) {
            return new AdImpressionData[i12];
        }
    }

    public AdImpressionData(@N String str) {
        this.f382645a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f382645a.equals(((AdImpressionData) obj).f382645a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    @N
    public final String getRawData() {
        return this.f382645a;
    }

    public final int hashCode() {
        return this.f382645a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382645a);
    }

    public AdImpressionData(Parcel parcel) {
        this.f382645a = parcel.readString();
    }
}
