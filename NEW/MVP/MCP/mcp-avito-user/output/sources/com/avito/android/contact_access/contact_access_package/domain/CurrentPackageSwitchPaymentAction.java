package com.avito.android.contact_access.contact_access_package.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ContactAccessPackage.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/domain/CurrentPackageSwitchPaymentAction;", "Landroid/os/Parcelable;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurrentPackageSwitchPaymentAction implements Parcelable {

    @k
    public static final Parcelable.Creator<CurrentPackageSwitchPaymentAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f125873b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f125874c;

    /* compiled from: ContactAccessPackage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CurrentPackageSwitchPaymentAction> {
        @Override // android.os.Parcelable.Creator
        public final CurrentPackageSwitchPaymentAction createFromParcel(Parcel parcel) {
            return new CurrentPackageSwitchPaymentAction((DeepLink) parcel.readParcelable(CurrentPackageSwitchPaymentAction.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CurrentPackageSwitchPaymentAction[] newArray(int i12) {
            return new CurrentPackageSwitchPaymentAction[i12];
        }
    }

    public CurrentPackageSwitchPaymentAction(@l DeepLink deepLink, @k String str) {
        this.f125873b = deepLink;
        this.f125874c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f125873b, i12);
        parcel.writeString(this.f125874c);
    }
}
