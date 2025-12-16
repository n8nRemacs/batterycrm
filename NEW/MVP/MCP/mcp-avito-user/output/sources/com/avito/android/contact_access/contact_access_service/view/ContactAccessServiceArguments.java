package com.avito.android.contact_access.contact_access_service.view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ContactAccessServiceActivity.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/view/ContactAccessServiceArguments;", "Landroid/os/Parcelable;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactAccessServiceArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ContactAccessServiceArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f126009b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f126010c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f126011d;

    /* compiled from: ContactAccessServiceActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactAccessServiceArguments> {
        @Override // android.os.Parcelable.Creator
        public final ContactAccessServiceArguments createFromParcel(Parcel parcel) {
            return new ContactAccessServiceArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactAccessServiceArguments[] newArray(int i12) {
            return new ContactAccessServiceArguments[i12];
        }
    }

    public ContactAccessServiceArguments(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f126009b = str;
        this.f126010c = str2;
        this.f126011d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f126009b);
        parcel.writeString(this.f126010c);
        parcel.writeString(this.f126011d);
    }
}
