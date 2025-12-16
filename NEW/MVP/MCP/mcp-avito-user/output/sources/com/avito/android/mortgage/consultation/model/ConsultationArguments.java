package com.avito.android.mortgage.consultation.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConsultationArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/model/ConsultationArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConsultationArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ConsultationArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f198590b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f198591c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f198592d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f198593e;

    /* compiled from: ConsultationArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConsultationArguments> {
        @Override // android.os.Parcelable.Creator
        public final ConsultationArguments createFromParcel(Parcel parcel) {
            return new ConsultationArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConsultationArguments[] newArray(int i12) {
            return new ConsultationArguments[i12];
        }
    }

    public ConsultationArguments(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f198590b = str;
        this.f198591c = str2;
        this.f198592d = str3;
        this.f198593e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsultationArguments)) {
            return false;
        }
        ConsultationArguments consultationArguments = (ConsultationArguments) obj;
        return L.f(this.f198590b, consultationArguments.f198590b) && L.f(this.f198591c, consultationArguments.f198591c) && L.f(this.f198592d, consultationArguments.f198592d) && L.f(this.f198593e, consultationArguments.f198593e);
    }

    public final int hashCode() {
        String str = this.f198590b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f198591c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f198592d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f198593e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsultationArguments(applicationId=");
        sb2.append(this.f198590b);
        sb2.append(", fullName=");
        sb2.append(this.f198591c);
        sb2.append(", fromPage=");
        sb2.append(this.f198592d);
        sb2.append(", role=");
        return C22026a.c(sb2, this.f198593e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f198590b);
        parcel.writeString(this.f198591c);
        parcel.writeString(this.f198592d);
        parcel.writeString(this.f198593e);
    }
}
