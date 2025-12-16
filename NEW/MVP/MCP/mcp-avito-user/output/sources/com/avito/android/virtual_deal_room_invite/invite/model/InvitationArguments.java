package com.avito.android.virtual_deal_room_invite.invite.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.virtual_deal_room_invite.model.InviteArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InvitationArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/model/InvitationArguments;", "Lcom/avito/android/virtual_deal_room_invite/model/InviteArguments;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvitationArguments implements InviteArguments {

    @k
    public static final Parcelable.Creator<InvitationArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f327042b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f327043c;

    /* compiled from: InvitationArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InvitationArguments> {
        @Override // android.os.Parcelable.Creator
        public final InvitationArguments createFromParcel(Parcel parcel) {
            return new InvitationArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InvitationArguments[] newArray(int i12) {
            return new InvitationArguments[i12];
        }
    }

    public InvitationArguments(@k String str, @k String str2) {
        this.f327042b = str;
        this.f327043c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvitationArguments)) {
            return false;
        }
        InvitationArguments invitationArguments = (InvitationArguments) obj;
        return L.f(this.f327042b, invitationArguments.f327042b) && L.f(this.f327043c, invitationArguments.f327043c);
    }

    public final int hashCode() {
        return this.f327043c.hashCode() + (this.f327042b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvitationArguments(invitationId=");
        sb2.append(this.f327042b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f327043c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f327042b);
        parcel.writeString(this.f327043c);
    }
}
