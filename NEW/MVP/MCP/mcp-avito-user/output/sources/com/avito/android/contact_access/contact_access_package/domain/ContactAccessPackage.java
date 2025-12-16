package com.avito.android.contact_access.contact_access_package.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;

/* compiled from: ContactAccessPackage.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/domain/ContactAccessPackage;", "Landroid/os/Parcelable;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactAccessPackage implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactAccessPackage> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CurrentPackageBalance f125861b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CurrentPackageBuyAction f125862c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f125863d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f125864e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CurrentPackageSwitchPaymentAction f125865f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f125866g;

    /* compiled from: ContactAccessPackage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactAccessPackage> {
        @Override // android.os.Parcelable.Creator
        public final ContactAccessPackage createFromParcel(Parcel parcel) {
            return new ContactAccessPackage(parcel.readInt() == 0 ? null : CurrentPackageBalance.CREATOR.createFromParcel(parcel), CurrentPackageBuyAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? CurrentPackageSwitchPaymentAction.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactAccessPackage[] newArray(int i12) {
            return new ContactAccessPackage[i12];
        }
    }

    public ContactAccessPackage(@l CurrentPackageBalance currentPackageBalance, @k CurrentPackageBuyAction currentPackageBuyAction, @l Long l12, @l String str, @l CurrentPackageSwitchPaymentAction currentPackageSwitchPaymentAction, @k String str2) {
        this.f125861b = currentPackageBalance;
        this.f125862c = currentPackageBuyAction;
        this.f125863d = l12;
        this.f125864e = str;
        this.f125865f = currentPackageSwitchPaymentAction;
        this.f125866g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CurrentPackageBalance currentPackageBalance = this.f125861b;
        if (currentPackageBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currentPackageBalance.writeToParcel(parcel, i12);
        }
        this.f125862c.writeToParcel(parcel, i12);
        Long l12 = this.f125863d;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f125864e);
        CurrentPackageSwitchPaymentAction currentPackageSwitchPaymentAction = this.f125865f;
        if (currentPackageSwitchPaymentAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currentPackageSwitchPaymentAction.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f125866g);
    }
}
