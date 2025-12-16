package com.avito.android.contact_access.contact_access_package.domain;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ContactAccessPackage.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/domain/CurrentPackageBuyAction;", "Landroid/os/Parcelable;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurrentPackageBuyAction implements Parcelable {

    @k
    public static final Parcelable.Creator<CurrentPackageBuyAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125870b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125871c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f125872d;

    /* compiled from: ContactAccessPackage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CurrentPackageBuyAction> {
        @Override // android.os.Parcelable.Creator
        public final CurrentPackageBuyAction createFromParcel(Parcel parcel) {
            return new CurrentPackageBuyAction(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CurrentPackageBuyAction[] newArray(int i12) {
            return new CurrentPackageBuyAction[i12];
        }
    }

    public CurrentPackageBuyAction(boolean z12, boolean z13, @k String str) {
        this.f125870b = z12;
        this.f125871c = z13;
        this.f125872d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f125870b ? 1 : 0);
        parcel.writeInt(this.f125871c ? 1 : 0);
        parcel.writeString(this.f125872d);
    }
}
