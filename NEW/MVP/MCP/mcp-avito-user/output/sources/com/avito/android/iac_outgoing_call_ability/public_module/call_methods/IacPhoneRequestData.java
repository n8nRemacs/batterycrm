package com.avito.android.iac_outgoing_call_ability.public_module.call_methods;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacPhoneRequestData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/call_methods/IacPhoneRequestData;", "Landroid/os/Parcelable;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacPhoneRequestData implements Parcelable {

    @k
    public static final Parcelable.Creator<IacPhoneRequestData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f168673b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f168674c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f168675d;

    /* compiled from: IacPhoneRequestData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacPhoneRequestData> {
        @Override // android.os.Parcelable.Creator
        public final IacPhoneRequestData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IacPhoneRequestData(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final IacPhoneRequestData[] newArray(int i12) {
            return new IacPhoneRequestData[i12];
        }
    }

    public IacPhoneRequestData(@l String str, @l String str2, @l Boolean bool) {
        this.f168673b = str;
        this.f168674c = str2;
        this.f168675d = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacPhoneRequestData)) {
            return false;
        }
        IacPhoneRequestData iacPhoneRequestData = (IacPhoneRequestData) obj;
        return L.f(this.f168673b, iacPhoneRequestData.f168673b) && L.f(this.f168674c, iacPhoneRequestData.f168674c) && L.f(this.f168675d, iacPhoneRequestData.f168675d);
    }

    public final int hashCode() {
        String str = this.f168673b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f168674c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f168675d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacPhoneRequestData(context=");
        sb2.append(this.f168673b);
        sb2.append(", jobDisclaimerPDViewed=");
        sb2.append(this.f168674c);
        sb2.append(", needConfirm=");
        return C0.g(sb2, this.f168675d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f168673b);
        parcel.writeString(this.f168674c);
        Boolean bool = this.f168675d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
