package com.avito.android.certificate_pinning;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/certificate_pinning/NetworkState;", "Landroid/os/Parcelable;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NetworkState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<NetworkState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f117751b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f117752c;

    /* compiled from: NetworkState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NetworkState> {
        @Override // android.os.Parcelable.Creator
        public final NetworkState createFromParcel(Parcel parcel) {
            return new NetworkState(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NetworkState[] newArray(int i12) {
            return new NetworkState[i12];
        }
    }

    public NetworkState(@d long j12, @Y61.l String str) {
        this.f117751b = j12;
        this.f117752c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f117751b);
        parcel.writeString(this.f117752c);
    }

    public /* synthetic */ NetworkState(long j12, String str, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? null : str);
    }
}
