package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class RewardData implements Parcelable {
    public static final Parcelable.Creator<RewardData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f382632a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final ClientSideReward f382633b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final ServerSideReward f382634c;

    public class a implements Parcelable.Creator<RewardData> {
        @Override // android.os.Parcelable.Creator
        public final RewardData createFromParcel(@N Parcel parcel) {
            return new RewardData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RewardData[] newArray(int i12) {
            return new RewardData[i12];
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f382635a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private ClientSideReward f382636b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private ServerSideReward f382637c;

        @N
        public final RewardData a() {
            return new RewardData(this, 0);
        }

        @N
        public final b a(boolean z12) {
            this.f382635a = z12;
            return this;
        }

        @N
        public final b a(@P ClientSideReward clientSideReward) {
            this.f382636b = clientSideReward;
            return this;
        }

        @N
        public final b a(@P ServerSideReward serverSideReward) {
            this.f382637c = serverSideReward;
            return this;
        }
    }

    public /* synthetic */ RewardData(b bVar, int i12) {
        this(bVar);
    }

    @P
    public final ClientSideReward c() {
        return this.f382633b;
    }

    @P
    public final ServerSideReward d() {
        return this.f382634c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f382632a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeByte(this.f382632a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f382633b, i12);
        parcel.writeParcelable(this.f382634c, i12);
    }

    private RewardData(@N b bVar) {
        this.f382633b = bVar.f382636b;
        this.f382634c = bVar.f382637c;
        this.f382632a = bVar.f382635a;
    }

    public RewardData(@N Parcel parcel) {
        this.f382632a = parcel.readByte() != 0;
        this.f382633b = (ClientSideReward) parcel.readParcelable(ClientSideReward.class.getClassLoader());
        this.f382634c = (ServerSideReward) parcel.readParcelable(ServerSideReward.class.getClassLoader());
    }
}
