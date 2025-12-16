package com.avito.android.phone_confirmation.state;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmationScreenState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;", "Landroid/os/Parcelable;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PhoneConfirmationScreenState implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneConfirmationScreenState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215955b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f215956c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f215957d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f215958e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PhoneConfirmationTime f215959f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f215960g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f215961h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f215962i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f215963j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f215964k;

    /* compiled from: PhoneConfirmationScreenState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneConfirmationScreenState> {
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationScreenState createFromParcel(Parcel parcel) {
            return new PhoneConfirmationScreenState(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PhoneConfirmationTime.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationScreenState[] newArray(int i12) {
            return new PhoneConfirmationScreenState[i12];
        }
    }

    public PhoneConfirmationScreenState(@k String str, boolean z12, boolean z13, boolean z14, @l PhoneConfirmationTime phoneConfirmationTime, boolean z15, @l String str2, @l String str3, @l String str4, @k String str5) {
        this.f215955b = str;
        this.f215956c = z12;
        this.f215957d = z13;
        this.f215958e = z14;
        this.f215959f = phoneConfirmationTime;
        this.f215960g = z15;
        this.f215961h = str2;
        this.f215962i = str3;
        this.f215963j = str4;
        this.f215964k = str5;
    }

    public static PhoneConfirmationScreenState a(PhoneConfirmationScreenState phoneConfirmationScreenState, String str, PhoneConfirmationTime phoneConfirmationTime, boolean z12, String str2, String str3, String str4, String str5, int i12) {
        String str6 = (i12 & 1) != 0 ? phoneConfirmationScreenState.f215955b : str;
        boolean z13 = phoneConfirmationScreenState.f215956c;
        boolean z14 = phoneConfirmationScreenState.f215957d;
        boolean z15 = (i12 & 8) != 0 ? phoneConfirmationScreenState.f215958e : true;
        PhoneConfirmationTime phoneConfirmationTime2 = (i12 & 16) != 0 ? phoneConfirmationScreenState.f215959f : phoneConfirmationTime;
        boolean z16 = (i12 & 32) != 0 ? phoneConfirmationScreenState.f215960g : z12;
        String str7 = (i12 & 64) != 0 ? phoneConfirmationScreenState.f215961h : str2;
        String str8 = (i12 & 128) != 0 ? phoneConfirmationScreenState.f215962i : str3;
        String str9 = (i12 & 256) != 0 ? phoneConfirmationScreenState.f215963j : str4;
        String str10 = (i12 & 512) != 0 ? phoneConfirmationScreenState.f215964k : str5;
        phoneConfirmationScreenState.getClass();
        return new PhoneConfirmationScreenState(str6, z13, z14, z15, phoneConfirmationTime2, z16, str7, str8, str9, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneConfirmationScreenState)) {
            return false;
        }
        PhoneConfirmationScreenState phoneConfirmationScreenState = (PhoneConfirmationScreenState) obj;
        return L.f(this.f215955b, phoneConfirmationScreenState.f215955b) && this.f215956c == phoneConfirmationScreenState.f215956c && this.f215957d == phoneConfirmationScreenState.f215957d && this.f215958e == phoneConfirmationScreenState.f215958e && L.f(this.f215959f, phoneConfirmationScreenState.f215959f) && this.f215960g == phoneConfirmationScreenState.f215960g && L.f(this.f215961h, phoneConfirmationScreenState.f215961h) && L.f(this.f215962i, phoneConfirmationScreenState.f215962i) && L.f(this.f215963j, phoneConfirmationScreenState.f215963j) && L.f(this.f215964k, phoneConfirmationScreenState.f215964k);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(this.f215955b.hashCode() * 31, 31, this.f215956c), 31, this.f215957d), 31, this.f215958e);
        PhoneConfirmationTime phoneConfirmationTime = this.f215959f;
        int i13 = r.i((i12 + (phoneConfirmationTime == null ? 0 : phoneConfirmationTime.hashCode())) * 31, 31, this.f215960g);
        String str = this.f215961h;
        int iHashCode = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215962i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215963j;
        return this.f215964k.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneConfirmationScreenState(phone=");
        sb2.append(this.f215955b);
        sb2.append(", isCompany=");
        sb2.append(this.f215956c);
        sb2.append(", codeRequested=");
        sb2.append(this.f215957d);
        sb2.append(", validationStatus=");
        sb2.append(this.f215958e);
        sb2.append(", confirmationTime=");
        sb2.append(this.f215959f);
        sb2.append(", hasNetworkError=");
        sb2.append(this.f215960g);
        sb2.append(", codeRequestError=");
        sb2.append(this.f215961h);
        sb2.append(", validationError=");
        sb2.append(this.f215962i);
        sb2.append(", tooManyValidations=");
        sb2.append(this.f215963j);
        sb2.append(", enteredCode=");
        return C22026a.c(sb2, this.f215964k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215955b);
        parcel.writeInt(this.f215956c ? 1 : 0);
        parcel.writeInt(this.f215957d ? 1 : 0);
        parcel.writeInt(this.f215958e ? 1 : 0);
        PhoneConfirmationTime phoneConfirmationTime = this.f215959f;
        if (phoneConfirmationTime == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phoneConfirmationTime.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f215960g ? 1 : 0);
        parcel.writeString(this.f215961h);
        parcel.writeString(this.f215962i);
        parcel.writeString(this.f215963j);
        parcel.writeString(this.f215964k);
    }

    public /* synthetic */ PhoneConfirmationScreenState(String str, boolean z12, boolean z13, boolean z14, PhoneConfirmationTime phoneConfirmationTime, boolean z15, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(str, z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? null : phoneConfirmationTime, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? null : str2, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? "" : str5);
    }
}
