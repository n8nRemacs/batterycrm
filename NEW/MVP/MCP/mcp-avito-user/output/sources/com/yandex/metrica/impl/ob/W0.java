package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public class W0 implements Parcelable {
    public static final Parcelable.Creator<W0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f379795a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final U0 f379796b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f379797c;

    public class a implements Parcelable.Creator<W0> {
        @Override // android.os.Parcelable.Creator
        public W0 createFromParcel(Parcel parcel) {
            return new W0(parcel.readString(), U0.a(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public W0[] newArray(int i12) {
            return new W0[i12];
        }
    }

    public W0(@j.P String str, @j.N U0 u02, @j.P String str2) {
        this.f379795a = str;
        this.f379796b = u02;
        this.f379797c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W0.class != obj.getClass()) {
            return false;
        }
        W0 w02 = (W0) obj;
        String str = this.f379795a;
        if (str == null ? w02.f379795a != null : !str.equals(w02.f379795a)) {
            return false;
        }
        if (this.f379796b != w02.f379796b) {
            return false;
        }
        String str2 = this.f379797c;
        return str2 != null ? str2.equals(w02.f379797c) : w02.f379797c == null;
    }

    public int hashCode() {
        String str = this.f379795a;
        int iHashCode = (this.f379796b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.f379797c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdentifiersResultInternal{mId='");
        sb2.append(this.f379795a);
        sb2.append("', mStatus=");
        sb2.append(this.f379796b);
        sb2.append(", mErrorExplanation='");
        return AK.c.s(sb2, this.f379797c, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f379795a);
        parcel.writeString(this.f379796b.a());
        parcel.writeString(this.f379797c);
    }
}
