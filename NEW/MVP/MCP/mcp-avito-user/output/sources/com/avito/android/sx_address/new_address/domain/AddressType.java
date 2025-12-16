package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressType.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/AddressType;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddressType implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressType> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f293602b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f293603c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f293604d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f293605e;

    /* compiled from: AddressType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressType> {
        @Override // android.os.Parcelable.Creator
        public final AddressType createFromParcel(Parcel parcel) {
            return new AddressType((AttributedText) parcel.readParcelable(AddressType.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AddressType[] newArray(int i12) {
            return new AddressType[i12];
        }
    }

    public AddressType(@l AttributedText attributedText, @k String str, @k String str2, boolean z12) {
        this.f293602b = str;
        this.f293603c = str2;
        this.f293604d = z12;
        this.f293605e = attributedText;
    }

    public static AddressType a(AddressType addressType, boolean z12) {
        return new AddressType(addressType.f293605e, addressType.f293602b, addressType.f293603c, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressType)) {
            return false;
        }
        AddressType addressType = (AddressType) obj;
        return L.f(this.f293602b, addressType.f293602b) && L.f(this.f293603c, addressType.f293603c) && this.f293604d == addressType.f293604d && L.f(this.f293605e, addressType.f293605e);
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f293602b.hashCode() * 31, 31, this.f293603c), 31, this.f293604d);
        AttributedText attributedText = this.f293605e;
        return i12 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressType(id=");
        sb2.append(this.f293602b);
        sb2.append(", title=");
        sb2.append(this.f293603c);
        sb2.append(", isSelected=");
        sb2.append(this.f293604d);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f293605e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f293602b);
        parcel.writeString(this.f293603c);
        parcel.writeInt(this.f293604d ? 1 : 0);
        parcel.writeParcelable(this.f293605e, i12);
    }
}
