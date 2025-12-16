package com.avito.android.mortgage.phone_confirm.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/model/PhoneConfirmArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PhoneConfirmArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneConfirmArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f201577b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f201578c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f201579d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f201580e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f201581f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f201582g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f201583h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f201584i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f201585j;

    /* compiled from: PhoneConfirmArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneConfirmArguments> {
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmArguments createFromParcel(Parcel parcel) {
            return new PhoneConfirmArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmArguments[] newArray(int i12) {
            return new PhoneConfirmArguments[i12];
        }
    }

    public PhoneConfirmArguments(@l String str, @l String str2, @l String str3, @k String str4, @k String str5, @l String str6, @k String str7, @l Integer num, @k String str8) {
        this.f201577b = str;
        this.f201578c = str2;
        this.f201579d = num;
        this.f201580e = str3;
        this.f201581f = str4;
        this.f201582g = str5;
        this.f201583h = str6;
        this.f201584i = str7;
        this.f201585j = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneConfirmArguments)) {
            return false;
        }
        PhoneConfirmArguments phoneConfirmArguments = (PhoneConfirmArguments) obj;
        return L.f(this.f201577b, phoneConfirmArguments.f201577b) && L.f(this.f201578c, phoneConfirmArguments.f201578c) && L.f(this.f201579d, phoneConfirmArguments.f201579d) && L.f(this.f201580e, phoneConfirmArguments.f201580e) && L.f(this.f201581f, phoneConfirmArguments.f201581f) && L.f(this.f201582g, phoneConfirmArguments.f201582g) && L.f(this.f201583h, phoneConfirmArguments.f201583h) && L.f(this.f201584i, phoneConfirmArguments.f201584i) && L.f(this.f201585j, phoneConfirmArguments.f201585j);
    }

    public final int hashCode() {
        String str = this.f201577b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f201578c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f201579d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f201580e;
        int iD2 = H.d(H.d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f201581f), 31, this.f201582g);
        String str4 = this.f201583h;
        return this.f201585j.hashCode() + H.d((iD2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f201584i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneConfirmArguments(title=");
        sb2.append(this.f201577b);
        sb2.append(", description=");
        sb2.append(this.f201578c);
        sb2.append(", retryTimeoutSeconds=");
        sb2.append(this.f201579d);
        sb2.append(", error=");
        sb2.append(this.f201580e);
        sb2.append(", applicationId=");
        sb2.append(this.f201581f);
        sb2.append(", applicantId=");
        sb2.append(this.f201582g);
        sb2.append(", applicantType=");
        sb2.append(this.f201583h);
        sb2.append(", flowType=");
        sb2.append(this.f201584i);
        sb2.append(", step=");
        return C22026a.c(sb2, this.f201585j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f201577b);
        parcel.writeString(this.f201578c);
        Integer num = this.f201579d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f201580e);
        parcel.writeString(this.f201581f);
        parcel.writeString(this.f201582g);
        parcel.writeString(this.f201583h);
        parcel.writeString(this.f201584i);
        parcel.writeString(this.f201585j);
    }
}
