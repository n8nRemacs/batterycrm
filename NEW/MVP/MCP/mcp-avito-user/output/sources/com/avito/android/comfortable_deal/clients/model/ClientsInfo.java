package com.avito.android.comfortable_deal.clients.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsInfo.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/model/ClientsInfo;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClientsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ClientsInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<ClientCardData> f120266b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f120267c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<RequestType, Integer> f120268d;

    /* compiled from: ClientsInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientsInfo> {
        @Override // android.os.Parcelable.Creator
        public final ClientsInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ClientCardData.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ClientsInfo.class.getClassLoader());
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(RequestType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }
            return new ClientsInfo(arrayList, deepLink, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientsInfo[] newArray(int i12) {
            return new ClientsInfo[i12];
        }
    }

    public ClientsInfo(@l List<ClientCardData> list, @l DeepLink deepLink, @k Map<RequestType, Integer> map) {
        this.f120266b = list;
        this.f120267c = deepLink;
        this.f120268d = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientsInfo)) {
            return false;
        }
        ClientsInfo clientsInfo = (ClientsInfo) obj;
        return L.f(this.f120266b, clientsInfo.f120266b) && L.f(this.f120267c, clientsInfo.f120267c) && L.f(this.f120268d, clientsInfo.f120268d);
    }

    public final int hashCode() {
        List<ClientCardData> list = this.f120266b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        DeepLink deepLink = this.f120267c;
        return this.f120268d.hashCode() + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientsInfo(firstPageData=");
        sb2.append(this.f120266b);
        sb2.append(", mortgageLink=");
        sb2.append(this.f120267c);
        sb2.append(", counts=");
        return r.w(sb2, this.f120268d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<ClientCardData> list = this.f120266b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ClientCardData) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.f120267c, i12);
        Iterator itI = C0.i(parcel, this.f120268d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString(((RequestType) entry.getKey()).name());
            Integer num = (Integer) entry.getValue();
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }
}
