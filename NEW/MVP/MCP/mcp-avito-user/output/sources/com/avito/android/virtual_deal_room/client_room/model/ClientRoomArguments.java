package com.avito.android.virtual_deal_room.client_room.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/model/ClientRoomArguments;", "Landroid/os/Parcelable;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientRoomArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ClientRoomArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f326339b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Category f326340c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f326341d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f326342e;

    /* compiled from: ClientRoomArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientRoomArguments> {
        @Override // android.os.Parcelable.Creator
        public final ClientRoomArguments createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            Category category = (Category) parcel.readParcelable(ClientRoomArguments.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClientRoomArguments(category, boolValueOf, string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClientRoomArguments[] newArray(int i12) {
            return new ClientRoomArguments[i12];
        }
    }

    public ClientRoomArguments(@k Category category, @l Boolean bool, @k String str, @l String str2) {
        this.f326339b = str;
        this.f326340c = category;
        this.f326341d = bool;
        this.f326342e = str2;
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
        return L.f(this.f326339b, clientRoomArguments.f326339b) && this.f326340c == clientRoomArguments.f326340c && L.f(this.f326341d, clientRoomArguments.f326341d) && L.f(this.f326342e, clientRoomArguments.f326342e);
    }

    public final int hashCode() {
        int iHashCode = (this.f326340c.hashCode() + (this.f326339b.hashCode() * 31)) * 31;
        Boolean bool = this.f326341d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f326342e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientRoomArguments(processId=");
        sb2.append(this.f326339b);
        sb2.append(", selectedCategory=");
        sb2.append(this.f326340c);
        sb2.append(", needFallback=");
        sb2.append(this.f326341d);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f326342e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f326339b);
        parcel.writeParcelable(this.f326340c, i12);
        Boolean bool = this.f326341d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f326342e);
    }

    public /* synthetic */ ClientRoomArguments(String str, Category category, Boolean bool, String str2, int i12, C42822w c42822w) {
        this(category, (i12 & 4) != 0 ? null : bool, str, (i12 & 8) != 0 ? null : str2);
    }
}
