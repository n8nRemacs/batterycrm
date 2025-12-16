package com.yandex.mobile.ads.base.tracker.interaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public class FalseClick implements Parcelable {
    public static final Parcelable.Creator<FalseClick> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f382639a;

    /* renamed from: b, reason: collision with root package name */
    private final long f382640b;

    public class a implements Parcelable.Creator<FalseClick> {
        @Override // android.os.Parcelable.Creator
        @N
        public final FalseClick createFromParcel(@N Parcel parcel) {
            return new FalseClick(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final FalseClick[] newArray(int i12) {
            return new FalseClick[i12];
        }
    }

    public FalseClick(@N String str, long j12) {
        this.f382639a = str;
        this.f382640b = j12;
    }

    public final long c() {
        return this.f382640b;
    }

    @N
    public final String d() {
        return this.f382639a;
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
        FalseClick falseClick = (FalseClick) obj;
        if (this.f382640b != falseClick.f382640b) {
            return false;
        }
        return this.f382639a.equals(falseClick.f382639a);
    }

    public final int hashCode() {
        int iHashCode = this.f382639a.hashCode() * 31;
        long j12 = this.f382640b;
        return iHashCode + ((int) (j12 ^ (j12 >>> 32)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382639a);
        parcel.writeLong(this.f382640b);
    }

    public FalseClick(@N Parcel parcel) {
        this.f382639a = parcel.readString();
        this.f382640b = parcel.readLong();
    }
}
