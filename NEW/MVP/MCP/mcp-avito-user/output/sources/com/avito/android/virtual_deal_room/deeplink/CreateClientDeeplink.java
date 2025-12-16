package com.avito.android.virtual_deal_room.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CreateClientDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "Result", "_avito_virtual-deal-room-client-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class CreateClientDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CreateClientDeeplink> CREATOR = new a();

    /* compiled from: CreateClientDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink$Result;", "LJu/c$b;", "Landroid/os/Parcelable;", "Client", "Dismissed", "Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink$Result$Client;", "Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink$Result$Dismissed;", "_avito_virtual-deal-room-client-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends InterfaceC14249c.b, Parcelable {

        /* compiled from: CreateClientDeeplink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink$Result$Client;", "Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink$Result;", "_avito_virtual-deal-room-client-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Client implements Result {

            @Y61.k
            public static final Parcelable.Creator<Client> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f326439b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f326440c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f326441d;

            /* compiled from: CreateClientDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Client> {
                @Override // android.os.Parcelable.Creator
                public final Client createFromParcel(Parcel parcel) {
                    return new Client(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Client[] newArray(int i12) {
                    return new Client[i12];
                }
            }

            public Client(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
                this.f326439b = str;
                this.f326440c = str2;
                this.f326441d = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Client)) {
                    return false;
                }
                Client client = (Client) obj;
                return L.f(this.f326439b, client.f326439b) && L.f(this.f326440c, client.f326440c) && L.f(this.f326441d, client.f326441d);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f326439b.hashCode() * 31, 31, this.f326440c);
                String str = this.f326441d;
                return iD2 + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Client(id=");
                sb2.append(this.f326439b);
                sb2.append(", name=");
                sb2.append(this.f326440c);
                sb2.append(", phone=");
                return C22026a.c(sb2, this.f326441d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f326439b);
                parcel.writeString(this.f326440c);
                parcel.writeString(this.f326441d);
            }
        }

        /* compiled from: CreateClientDeeplink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink$Result$Dismissed;", "Lcom/avito/android/virtual_deal_room/deeplink/CreateClientDeeplink$Result;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Dismissed implements Result {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Dismissed f326442b = new Dismissed();

            @Y61.k
            public static final Parcelable.Creator<Dismissed> CREATOR = new a();

            /* compiled from: CreateClientDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Dismissed> {
                @Override // android.os.Parcelable.Creator
                public final Dismissed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Dismissed.f326442b;
                }

                @Override // android.os.Parcelable.Creator
                public final Dismissed[] newArray(int i12) {
                    return new Dismissed[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Dismissed);
            }

            public final int hashCode() {
                return -484349680;
            }

            @Y61.k
            public final String toString() {
                return "Dismissed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: CreateClientDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateClientDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final CreateClientDeeplink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CreateClientDeeplink();
        }

        @Override // android.os.Parcelable.Creator
        public final CreateClientDeeplink[] newArray(int i12) {
            return new CreateClientDeeplink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
