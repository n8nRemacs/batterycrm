package com.avito.android.virtual_deal_room.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ClientRoomDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/ClientRoomDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class ClientRoomDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ClientRoomDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f326434b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Category f326435c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f326436d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f326437e;

    /* compiled from: ClientRoomDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientRoomDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ClientRoomDeeplink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            Category categoryCreateFromParcel = Category.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClientRoomDeeplink(categoryCreateFromParcel, boolValueOf, string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientRoomDeeplink[] newArray(int i12) {
            return new ClientRoomDeeplink[i12];
        }
    }

    /* compiled from: ClientRoomDeeplink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/ClientRoomDeeplink$b;", "LJu/c$b;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f326438b;

        public b(boolean z12) {
            this.f326438b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f326438b == ((b) obj).f326438b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f326438b);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("Result(needUpdate="), this.f326438b, ')');
        }
    }

    public ClientRoomDeeplink(@Y61.k Category category, @Y61.l Boolean bool, @Y61.k String str, @Y61.l String str2) {
        this.f326434b = str;
        this.f326435c = category;
        this.f326436d = str2;
        this.f326437e = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRoomDeeplink)) {
            return false;
        }
        ClientRoomDeeplink clientRoomDeeplink = (ClientRoomDeeplink) obj;
        return L.f(this.f326434b, clientRoomDeeplink.f326434b) && this.f326435c == clientRoomDeeplink.f326435c && L.f(this.f326436d, clientRoomDeeplink.f326436d) && L.f(this.f326437e, clientRoomDeeplink.f326437e);
    }

    public final int hashCode() {
        int iHashCode = (this.f326435c.hashCode() + (this.f326434b.hashCode() * 31)) * 31;
        String str = this.f326436d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f326437e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientRoomDeeplink(processId=");
        sb2.append(this.f326434b);
        sb2.append(", type=");
        sb2.append(this.f326435c);
        sb2.append(", fromPage=");
        sb2.append(this.f326436d);
        sb2.append(", needFallback=");
        return C0.g(sb2, this.f326437e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f326434b);
        this.f326435c.writeToParcel(parcel, i12);
        parcel.writeString(this.f326436d);
        Boolean bool = this.f326437e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
