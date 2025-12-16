package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public class ServerSideReward implements Parcelable {
    public static final Parcelable.Creator<ServerSideReward> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f382638a;

    public class a implements Parcelable.Creator<ServerSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ServerSideReward createFromParcel(@N Parcel parcel) {
            return new ServerSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerSideReward[] newArray(int i12) {
            return new ServerSideReward[i12];
        }
    }

    public ServerSideReward(@N String str) {
        this.f382638a = str;
    }

    @N
    public final String c() {
        return this.f382638a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f382638a);
    }

    public ServerSideReward(@N Parcel parcel) {
        this.f382638a = parcel.readString();
    }
}
