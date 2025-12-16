package com.avito.android.comfortable_deal.clients.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.model.ComfortableDealArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/model/ClientsArguments;", "Lcom/avito/android/comfortable_deal/model/ComfortableDealArguments;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClientsArguments implements ComfortableDealArguments {

    @k
    public static final Parcelable.Creator<ClientsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ClientsInfo f120265b;

    /* compiled from: ClientsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientsArguments> {
        @Override // android.os.Parcelable.Creator
        public final ClientsArguments createFromParcel(Parcel parcel) {
            return new ClientsArguments(ClientsInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ClientsArguments[] newArray(int i12) {
            return new ClientsArguments[i12];
        }
    }

    public ClientsArguments(@k ClientsInfo clientsInfo) {
        this.f120265b = clientsInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientsArguments) && L.f(this.f120265b, ((ClientsArguments) obj).f120265b);
    }

    public final int hashCode() {
        return this.f120265b.hashCode();
    }

    @k
    public final String toString() {
        return "ClientsArguments(info=" + this.f120265b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f120265b.writeToParcel(parcel, i12);
    }
}
