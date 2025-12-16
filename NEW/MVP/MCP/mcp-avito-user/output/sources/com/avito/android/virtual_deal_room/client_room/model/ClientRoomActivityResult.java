package com.avito.android.virtual_deal_room.client_room.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ClientRoomActivityResult.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/model/ClientRoomActivityResult;", "Landroid/os/Parcelable;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientRoomActivityResult implements Parcelable {

    @k
    public static final Parcelable.Creator<ClientRoomActivityResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f326338b;

    /* compiled from: ClientRoomActivityResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientRoomActivityResult> {
        @Override // android.os.Parcelable.Creator
        public final ClientRoomActivityResult createFromParcel(Parcel parcel) {
            return new ClientRoomActivityResult(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientRoomActivityResult[] newArray(int i12) {
            return new ClientRoomActivityResult[i12];
        }
    }

    public ClientRoomActivityResult(boolean z12) {
        this.f326338b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientRoomActivityResult) && this.f326338b == ((ClientRoomActivityResult) obj).f326338b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f326338b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ClientRoomActivityResult(needUpdate="), this.f326338b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f326338b ? 1 : 0);
    }
}
