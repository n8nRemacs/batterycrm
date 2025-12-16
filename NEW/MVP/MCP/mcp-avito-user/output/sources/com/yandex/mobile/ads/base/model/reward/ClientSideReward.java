package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public class ClientSideReward implements Parcelable {
    public static final Parcelable.Creator<ClientSideReward> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f382630a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final String f382631b;

    public class a implements Parcelable.Creator<ClientSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ClientSideReward createFromParcel(@N Parcel parcel) {
            return new ClientSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientSideReward[] newArray(int i12) {
            return new ClientSideReward[i12];
        }
    }

    public ClientSideReward(int i12, @N String str) {
        this.f382630a = i12;
        this.f382631b = str;
    }

    public final int c() {
        return this.f382630a;
    }

    @N
    public final String d() {
        return this.f382631b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeInt(this.f382630a);
        parcel.writeString(this.f382631b);
    }

    public ClientSideReward(@N Parcel parcel) {
        this.f382630a = parcel.readInt();
        this.f382631b = parcel.readString();
    }
}
