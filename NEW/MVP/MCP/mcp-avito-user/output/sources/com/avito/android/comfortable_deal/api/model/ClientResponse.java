package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/ClientResponse;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/comfortable_deal/api/model/Client;", "client", "", "Lcom/avito/android/comfortable_deal/api/model/Process;", "processes", "<init>", "(Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/Client;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/comfortable_deal/api/model/Client;", "c", "()Lcom/avito/android/comfortable_deal/api/model/Client;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClientResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<ClientResponse> CREATOR = new a();

    @c("details")
    @k
    private final Client client;

    @c("id")
    @k
    private final String id;

    @c("processes")
    @k
    private final List<Process> processes;

    /* compiled from: ClientResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientResponse> {
        @Override // android.os.Parcelable.Creator
        public final ClientResponse createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Client clientCreateFromParcel = Client.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Process.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ClientResponse(string, clientCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientResponse[] newArray(int i12) {
            return new ClientResponse[i12];
        }
    }

    public ClientResponse(@k String str, @k Client client, @k List<Process> list) {
        this.id = str;
        this.client = client;
        this.processes = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Client getClient() {
        return this.client;
    }

    @k
    public final List<Process> d() {
        return this.processes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientResponse)) {
            return false;
        }
        ClientResponse clientResponse = (ClientResponse) obj;
        return L.f(this.id, clientResponse.id) && L.f(this.client, clientResponse.client) && L.f(this.processes, clientResponse.processes);
    }

    public final int hashCode() {
        return this.processes.hashCode() + ((this.client.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientResponse(id=");
        sb2.append(this.id);
        sb2.append(", client=");
        sb2.append(this.client);
        sb2.append(", processes=");
        return H.p(sb2, this.processes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        this.client.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.processes, parcel);
        while (itJ.hasNext()) {
            ((Process) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
