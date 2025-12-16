package com.avito.android.virtual_deal_room_reference_category.reference_invite.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReferenceInviteArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_invite/model/ReferenceInviteArguments;", "Landroid/os/Parcelable;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReferenceInviteArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ReferenceInviteArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f327267b;

    /* compiled from: ReferenceInviteArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReferenceInviteArguments> {
        @Override // android.os.Parcelable.Creator
        public final ReferenceInviteArguments createFromParcel(Parcel parcel) {
            return new ReferenceInviteArguments(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReferenceInviteArguments[] newArray(int i12) {
            return new ReferenceInviteArguments[i12];
        }
    }

    public ReferenceInviteArguments(@k String str) {
        this.f327267b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReferenceInviteArguments) && L.f(this.f327267b, ((ReferenceInviteArguments) obj).f327267b);
    }

    public final int hashCode() {
        return this.f327267b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ReferenceInviteArguments(inviteId="), this.f327267b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f327267b);
    }
}
