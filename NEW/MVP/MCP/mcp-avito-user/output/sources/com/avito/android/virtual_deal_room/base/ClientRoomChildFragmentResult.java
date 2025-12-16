package com.avito.android.virtual_deal_room.base;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ClientRoomChildFragmentResult.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/base/ClientRoomChildFragmentResult;", "Landroid/os/Parcelable;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientRoomChildFragmentResult implements Parcelable {

    @k
    public static final Parcelable.Creator<ClientRoomChildFragmentResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f326099b;

    /* compiled from: ClientRoomChildFragmentResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientRoomChildFragmentResult> {
        @Override // android.os.Parcelable.Creator
        public final ClientRoomChildFragmentResult createFromParcel(Parcel parcel) {
            return new ClientRoomChildFragmentResult(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientRoomChildFragmentResult[] newArray(int i12) {
            return new ClientRoomChildFragmentResult[i12];
        }
    }

    public ClientRoomChildFragmentResult(boolean z12) {
        this.f326099b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientRoomChildFragmentResult) && this.f326099b == ((ClientRoomChildFragmentResult) obj).f326099b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f326099b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ClientRoomChildFragmentResult(needUpdateList="), this.f326099b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f326099b ? 1 : 0);
    }
}
