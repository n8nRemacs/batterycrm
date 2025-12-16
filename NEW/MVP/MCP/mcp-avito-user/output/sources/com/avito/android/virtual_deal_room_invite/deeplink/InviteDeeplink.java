package com.avito.android.virtual_deal_room_invite.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: InviteDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/deeplink/InviteDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_virtual-deal-room-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class InviteDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<InviteDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f326912b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f326913c;

    /* compiled from: InviteDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InviteDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final InviteDeeplink createFromParcel(Parcel parcel) {
            return new InviteDeeplink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InviteDeeplink[] newArray(int i12) {
            return new InviteDeeplink[i12];
        }
    }

    public InviteDeeplink(@k String str, @l String str2) {
        this.f326912b = str;
        this.f326913c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteDeeplink)) {
            return false;
        }
        InviteDeeplink inviteDeeplink = (InviteDeeplink) obj;
        return L.f(this.f326912b, inviteDeeplink.f326912b) && L.f(this.f326913c, inviteDeeplink.f326913c);
    }

    public final int hashCode() {
        int iHashCode = this.f326912b.hashCode() * 31;
        String str = this.f326913c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InviteDeeplink(invitationId=");
        sb2.append(this.f326912b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f326913c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f326912b);
        parcel.writeString(this.f326913c);
    }
}
