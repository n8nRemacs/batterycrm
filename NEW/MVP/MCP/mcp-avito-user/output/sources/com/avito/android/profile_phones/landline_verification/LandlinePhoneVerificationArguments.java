package com.avito.android.profile_phones.landline_verification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandlinePhoneVerificationArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationArguments;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LandlinePhoneVerificationArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<LandlinePhoneVerificationArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f227154b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f227155c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f227156d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AttributedText f227157e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f227158f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f227159g;

    /* compiled from: LandlinePhoneVerificationArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandlinePhoneVerificationArguments> {
        @Override // android.os.Parcelable.Creator
        public final LandlinePhoneVerificationArguments createFromParcel(Parcel parcel) {
            return new LandlinePhoneVerificationArguments(parcel.readInt(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(LandlinePhoneVerificationArguments.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LandlinePhoneVerificationArguments[] newArray(int i12) {
            return new LandlinePhoneVerificationArguments[i12];
        }
    }

    public LandlinePhoneVerificationArguments(int i12, @Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.k String str3, boolean z12) {
        this.f227154b = i12;
        this.f227155c = str;
        this.f227156d = str2;
        this.f227157e = attributedText;
        this.f227158f = str3;
        this.f227159g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandlinePhoneVerificationArguments)) {
            return false;
        }
        LandlinePhoneVerificationArguments landlinePhoneVerificationArguments = (LandlinePhoneVerificationArguments) obj;
        return this.f227154b == landlinePhoneVerificationArguments.f227154b && L.f(this.f227155c, landlinePhoneVerificationArguments.f227155c) && L.f(this.f227156d, landlinePhoneVerificationArguments.f227156d) && L.f(this.f227157e, landlinePhoneVerificationArguments.f227157e) && L.f(this.f227158f, landlinePhoneVerificationArguments.f227158f) && this.f227159g == landlinePhoneVerificationArguments.f227159g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227159g) + H.d(com.avito.android.actions_sheet.a.b(H.d(H.d(Integer.hashCode(this.f227154b) * 31, 31, this.f227155c), 31, this.f227156d), 31, this.f227157e), 31, this.f227158f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandlinePhoneVerificationArguments(callId=");
        sb2.append(this.f227154b);
        sb2.append(", title=");
        sb2.append(this.f227155c);
        sb2.append(", subtitle=");
        sb2.append(this.f227156d);
        sb2.append(", description=");
        sb2.append(this.f227157e);
        sb2.append(", phone=");
        sb2.append(this.f227158f);
        sb2.append(", isManual=");
        return androidx.appcompat.app.r.x(sb2, this.f227159g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f227154b);
        parcel.writeString(this.f227155c);
        parcel.writeString(this.f227156d);
        parcel.writeParcelable(this.f227157e, i12);
        parcel.writeString(this.f227158f);
        parcel.writeInt(this.f227159g ? 1 : 0);
    }
}
