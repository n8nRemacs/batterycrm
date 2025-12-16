package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.auto_contact_models.ContactPackageModal;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuyContactOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/data/BuyContactOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuyContactOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<BuyContactOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ContactPackageModal f95706b;

    /* compiled from: BuyContactOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuyContactOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final BuyContactOpenParams createFromParcel(Parcel parcel) {
            return new BuyContactOpenParams((ContactPackageModal) parcel.readParcelable(BuyContactOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BuyContactOpenParams[] newArray(int i12) {
            return new BuyContactOpenParams[i12];
        }
    }

    public BuyContactOpenParams(@k ContactPackageModal contactPackageModal) {
        this.f95706b = contactPackageModal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuyContactOpenParams) && L.f(this.f95706b, ((BuyContactOpenParams) obj).f95706b);
    }

    public final int hashCode() {
        return this.f95706b.hashCode();
    }

    @k
    public final String toString() {
        return "BuyContactOpenParams(contactPackageModal=" + this.f95706b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f95706b, i12);
    }
}
