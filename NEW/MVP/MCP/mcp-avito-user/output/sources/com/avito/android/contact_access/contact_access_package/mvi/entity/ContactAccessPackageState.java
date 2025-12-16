package com.avito.android.contact_access.contact_access_package.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactAccessPackageState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/mvi/entity/ContactAccessPackageState;", "Landroid/os/Parcelable;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactAccessPackageState implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactAccessPackageState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ContactAccessPackage f125893b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125894c;

    /* compiled from: ContactAccessPackageState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactAccessPackageState> {
        @Override // android.os.Parcelable.Creator
        public final ContactAccessPackageState createFromParcel(Parcel parcel) {
            return new ContactAccessPackageState(parcel.readInt() == 0 ? null : ContactAccessPackage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ContactAccessPackageState[] newArray(int i12) {
            return new ContactAccessPackageState[i12];
        }
    }

    public ContactAccessPackageState(@l ContactAccessPackage contactAccessPackage, boolean z12) {
        this.f125893b = contactAccessPackage;
        this.f125894c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactAccessPackageState)) {
            return false;
        }
        ContactAccessPackageState contactAccessPackageState = (ContactAccessPackageState) obj;
        return L.f(this.f125893b, contactAccessPackageState.f125893b) && this.f125894c == contactAccessPackageState.f125894c;
    }

    public final int hashCode() {
        ContactAccessPackage contactAccessPackage = this.f125893b;
        return Boolean.hashCode(this.f125894c) + ((contactAccessPackage == null ? 0 : contactAccessPackage.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactAccessPackageState(contactAccessPackage=");
        sb2.append(this.f125893b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f125894c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ContactAccessPackage contactAccessPackage = this.f125893b;
        if (contactAccessPackage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactAccessPackage.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f125894c ? 1 : 0);
    }
}
