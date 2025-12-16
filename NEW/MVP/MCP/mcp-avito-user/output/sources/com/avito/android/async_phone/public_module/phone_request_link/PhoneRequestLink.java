package com.avito.android.async_phone.public_module.phone_request_link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: PhoneRequestLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class PhoneRequestLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PhoneRequestLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92281b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f92282c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92283d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f92284e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f92285f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f92286g;

    /* compiled from: PhoneRequestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneRequestLink> {
        @Override // android.os.Parcelable.Creator
        public final PhoneRequestLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PhoneRequestLink(string, string2, z12, boolValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneRequestLink[] newArray(int i12) {
            return new PhoneRequestLink[i12];
        }
    }

    public /* synthetic */ PhoneRequestLink(String str, String str2, boolean z12, Boolean bool, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4);
    }

    public static PhoneRequestLink a(PhoneRequestLink phoneRequestLink, String str) {
        String str2 = phoneRequestLink.f92281b;
        String str3 = phoneRequestLink.f92282c;
        boolean z12 = phoneRequestLink.f92283d;
        Boolean bool = phoneRequestLink.f92284e;
        String str4 = phoneRequestLink.f92286g;
        phoneRequestLink.getClass();
        return new PhoneRequestLink(str2, str3, z12, bool, str, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneRequestLink)) {
            return false;
        }
        PhoneRequestLink phoneRequestLink = (PhoneRequestLink) obj;
        return L.f(this.f92281b, phoneRequestLink.f92281b) && L.f(this.f92282c, phoneRequestLink.f92282c) && this.f92283d == phoneRequestLink.f92283d && L.f(this.f92284e, phoneRequestLink.f92284e) && L.f(this.f92285f, phoneRequestLink.f92285f) && L.f(this.f92286g, phoneRequestLink.f92286g);
    }

    public final int hashCode() {
        int iHashCode = this.f92281b.hashCode() * 31;
        String str = this.f92282c;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f92283d);
        Boolean bool = this.f92284e;
        int iHashCode2 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f92285f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92286g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneRequestLink(itemId=");
        sb2.append(this.f92281b);
        sb2.append(", context=");
        sb2.append(this.f92282c);
        sb2.append(", needAuth=");
        sb2.append(this.f92283d);
        sb2.append(", needConfirm=");
        sb2.append(this.f92284e);
        sb2.append(", jobDisclaimerPDViewed=");
        sb2.append(this.f92285f);
        sb2.append(", iacScenario=");
        return C22026a.c(sb2, this.f92286g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f92281b);
        parcel.writeString(this.f92282c);
        parcel.writeInt(this.f92283d ? 1 : 0);
        Boolean bool = this.f92284e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f92285f);
        parcel.writeString(this.f92286g);
    }

    public PhoneRequestLink(@k String str, @l String str2, boolean z12, @l Boolean bool, @l String str3, @l String str4) {
        this.f92281b = str;
        this.f92282c = str2;
        this.f92283d = z12;
        this.f92284e = bool;
        this.f92285f = str3;
        this.f92286g = str4;
    }
}
