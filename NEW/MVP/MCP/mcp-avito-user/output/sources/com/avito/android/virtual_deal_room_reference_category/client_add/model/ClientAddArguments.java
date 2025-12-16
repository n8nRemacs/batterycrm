package com.avito.android.virtual_deal_room_reference_category.client_add.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ClientAddArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddArguments;", "Landroid/os/Parcelable;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientAddArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ClientAddArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f327183b;

    /* compiled from: ClientAddArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientAddArguments> {
        @Override // android.os.Parcelable.Creator
        public final ClientAddArguments createFromParcel(Parcel parcel) {
            return new ClientAddArguments(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientAddArguments[] newArray(int i12) {
            return new ClientAddArguments[i12];
        }
    }

    public ClientAddArguments(boolean z12) {
        this.f327183b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientAddArguments) && this.f327183b == ((ClientAddArguments) obj).f327183b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f327183b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ClientAddArguments(isRoot="), this.f327183b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f327183b ? 1 : 0);
    }
}
