package com.avito.android.referral_contacts.contacts_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_contacts/contacts_list/ContactItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ContactItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ContactItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252397b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f252398c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f252399d;

    /* compiled from: ContactItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactItem> {
        @Override // android.os.Parcelable.Creator
        public final ContactItem createFromParcel(Parcel parcel) {
            return new ContactItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactItem[] newArray(int i12) {
            return new ContactItem[i12];
        }
    }

    public ContactItem(@k String str, @k String str2, @k String str3) {
        this.f252397b = str;
        this.f252398c = str2;
        this.f252399d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactItem)) {
            return false;
        }
        ContactItem contactItem = (ContactItem) obj;
        return L.f(this.f252397b, contactItem.f252397b) && L.f(this.f252398c, contactItem.f252398c) && L.f(this.f252399d, contactItem.f252399d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF223480b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223480b() {
        return this.f252399d;
    }

    public final int hashCode() {
        return this.f252399d.hashCode() + H.d(this.f252397b.hashCode() * 31, 31, this.f252398c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactItem(name=");
        sb2.append(this.f252397b);
        sb2.append(", number=");
        sb2.append(this.f252398c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f252399d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f252397b);
        parcel.writeString(this.f252398c);
        parcel.writeString(this.f252399d);
    }

    public /* synthetic */ ContactItem(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? str2 : str3);
    }
}
