package com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestCountOption.kt */
@d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/state/viewstate/entity/GuestCountOption;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GuestCountOption implements ParcelableEntity<String>, Parcelable {

    @k
    public static final Parcelable.Creator<GuestCountOption> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f282831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f282832c;

    /* compiled from: GuestCountOption.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestCountOption> {
        @Override // android.os.Parcelable.Creator
        public final GuestCountOption createFromParcel(Parcel parcel) {
            return new GuestCountOption(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GuestCountOption[] newArray(int i12) {
            return new GuestCountOption[i12];
        }
    }

    public GuestCountOption(@k String str, int i12) {
        this.f282831b = str;
        this.f282832c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestCountOption)) {
            return false;
        }
        GuestCountOption guestCountOption = (GuestCountOption) obj;
        return L.f(this.f282831b, guestCountOption.f282831b) && this.f282832c == guestCountOption.f282832c;
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return String.valueOf(this.f282832c);
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF282831b() {
        return this.f282831b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282832c) + (this.f282831b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestCountOption(title=");
        sb2.append(this.f282831b);
        sb2.append(", count=");
        return r.t(sb2, this.f282832c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f282831b);
        parcel.writeInt(this.f282832c);
    }
}
