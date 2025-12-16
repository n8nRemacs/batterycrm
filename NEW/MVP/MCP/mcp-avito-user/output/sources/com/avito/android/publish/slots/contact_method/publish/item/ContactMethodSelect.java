package com.avito.android.publish.slots.contact_method.publish.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishContactMethodItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/publish/item/ContactMethodSelect;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ContactMethodSelect implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactMethodSelect> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243320b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243321c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f243322d;

    /* compiled from: PublishContactMethodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactMethodSelect> {
        @Override // android.os.Parcelable.Creator
        public final ContactMethodSelect createFromParcel(Parcel parcel) {
            return new ContactMethodSelect(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ContactMethodSelect[] newArray(int i12) {
            return new ContactMethodSelect[i12];
        }
    }

    public ContactMethodSelect(@k String str, @k String str2, boolean z12) {
        this.f243320b = str;
        this.f243321c = str2;
        this.f243322d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactMethodSelect)) {
            return false;
        }
        ContactMethodSelect contactMethodSelect = (ContactMethodSelect) obj;
        return L.f(this.f243320b, contactMethodSelect.f243320b) && L.f(this.f243321c, contactMethodSelect.f243321c) && this.f243322d == contactMethodSelect.f243322d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243322d) + H.d(this.f243320b.hashCode() * 31, 31, this.f243321c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactMethodSelect(id=");
        sb2.append(this.f243320b);
        sb2.append(", title=");
        sb2.append(this.f243321c);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f243322d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f243320b);
        parcel.writeString(this.f243321c);
        parcel.writeInt(this.f243322d ? 1 : 0);
    }

    public /* synthetic */ ContactMethodSelect(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? true : z12);
    }
}
