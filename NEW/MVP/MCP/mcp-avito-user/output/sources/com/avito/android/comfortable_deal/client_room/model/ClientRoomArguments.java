package com.avito.android.comfortable_deal.client_room.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.model.ComfortableDealArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/model/ClientRoomArguments;", "Lcom/avito/android/comfortable_deal/model/ComfortableDealArguments;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClientRoomArguments implements ComfortableDealArguments {

    @k
    public static final Parcelable.Creator<ClientRoomArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119868b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PartnerStatus f119869c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f119870d;

    /* compiled from: ClientRoomArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientRoomArguments> {
        @Override // android.os.Parcelable.Creator
        public final ClientRoomArguments createFromParcel(Parcel parcel) {
            return new ClientRoomArguments(parcel.readString(), (PartnerStatus) parcel.readParcelable(ClientRoomArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClientRoomArguments[] newArray(int i12) {
            return new ClientRoomArguments[i12];
        }
    }

    public ClientRoomArguments(@k String str, @k PartnerStatus partnerStatus, @l String str2) {
        this.f119868b = str;
        this.f119869c = partnerStatus;
        this.f119870d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRoomArguments)) {
            return false;
        }
        ClientRoomArguments clientRoomArguments = (ClientRoomArguments) obj;
        return L.f(this.f119868b, clientRoomArguments.f119868b) && L.f(this.f119869c, clientRoomArguments.f119869c) && L.f(this.f119870d, clientRoomArguments.f119870d);
    }

    public final int hashCode() {
        int iHashCode = (this.f119869c.hashCode() + (this.f119868b.hashCode() * 31)) * 31;
        String str = this.f119870d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientRoomArguments(leadId=");
        sb2.append(this.f119868b);
        sb2.append(", partner=");
        sb2.append(this.f119869c);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f119870d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f119868b);
        parcel.writeParcelable(this.f119869c, i12);
        parcel.writeString(this.f119870d);
    }
}
