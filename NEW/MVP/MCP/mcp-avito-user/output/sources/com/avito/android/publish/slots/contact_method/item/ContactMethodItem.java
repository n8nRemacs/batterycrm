package com.avito.android.publish.slots.contact_method.item;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactMethodItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/item/ContactMethodItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ContactMethodItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ContactMethodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f243284b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f243285c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f243286d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f243287e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f243288f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f243289g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f243290h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f243291i;

    /* compiled from: ContactMethodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactMethodItem> {
        @Override // android.os.Parcelable.Creator
        public final ContactMethodItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            return new ContactMethodItem(parcel.readInt() != 0, string, string2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, string3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactMethodItem[] newArray(int i12) {
            return new ContactMethodItem[i12];
        }
    }

    public ContactMethodItem(boolean z12, @Y61.k String str, @Y61.k String str2, boolean z13, boolean z14, boolean z15, @l String str3, @Y61.k String str4) {
        this.f243284b = str;
        this.f243285c = str2;
        this.f243286d = str3;
        this.f243287e = z12;
        this.f243288f = str4;
        this.f243289g = z13;
        this.f243290h = z14;
        this.f243291i = z15;
    }

    public static ContactMethodItem a(ContactMethodItem contactMethodItem, String str, boolean z12, String str2, boolean z13, boolean z14, int i12) {
        String str3 = contactMethodItem.f243284b;
        if ((i12 & 2) != 0) {
            str = contactMethodItem.f243285c;
        }
        String str4 = str;
        String str5 = contactMethodItem.f243286d;
        if ((i12 & 8) != 0) {
            z12 = contactMethodItem.f243287e;
        }
        boolean z15 = z12;
        if ((i12 & 16) != 0) {
            str2 = contactMethodItem.f243288f;
        }
        String str6 = str2;
        if ((i12 & 32) != 0) {
            z13 = contactMethodItem.f243289g;
        }
        boolean z16 = z13;
        boolean z17 = contactMethodItem.f243290h;
        if ((i12 & 128) != 0) {
            z14 = contactMethodItem.f243291i;
        }
        contactMethodItem.getClass();
        return new ContactMethodItem(z15, str3, str4, z16, z17, z14, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactMethodItem)) {
            return false;
        }
        ContactMethodItem contactMethodItem = (ContactMethodItem) obj;
        return L.f(this.f243284b, contactMethodItem.f243284b) && L.f(this.f243285c, contactMethodItem.f243285c) && L.f(this.f243286d, contactMethodItem.f243286d) && this.f243287e == contactMethodItem.f243287e && L.f(this.f243288f, contactMethodItem.f243288f) && this.f243289g == contactMethodItem.f243289g && this.f243290h == contactMethodItem.f243290h && this.f243291i == contactMethodItem.f243291i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF221112b() {
        return this.f243284b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f243284b.hashCode() * 31, 31, this.f243285c);
        String str = this.f243286d;
        return Boolean.hashCode(this.f243291i) + r.i(r.i(H.d(r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f243287e), 31, this.f243288f), 31, this.f243289g), 31, this.f243290h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactMethodItem(stringId=");
        sb2.append(this.f243284b);
        sb2.append(", messengerText=");
        sb2.append(this.f243285c);
        sb2.append(", title=");
        sb2.append(this.f243286d);
        sb2.append(", isMessengerChecked=");
        sb2.append(this.f243287e);
        sb2.append(", phoneText=");
        sb2.append(this.f243288f);
        sb2.append(", isPhoneChecked=");
        sb2.append(this.f243289g);
        sb2.append(", isPhoneDisabled=");
        sb2.append(this.f243290h);
        sb2.append(", hasError=");
        return r.x(sb2, this.f243291i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f243284b);
        parcel.writeString(this.f243285c);
        parcel.writeString(this.f243286d);
        parcel.writeInt(this.f243287e ? 1 : 0);
        parcel.writeString(this.f243288f);
        parcel.writeInt(this.f243289g ? 1 : 0);
        parcel.writeInt(this.f243290h ? 1 : 0);
        parcel.writeInt(this.f243291i ? 1 : 0);
    }
}
