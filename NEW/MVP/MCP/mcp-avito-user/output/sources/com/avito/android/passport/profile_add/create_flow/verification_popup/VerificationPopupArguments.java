package com.avito.android.passport.profile_add.create_flow.verification_popup;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.remote.model.VerificationDisclaimer;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationPopupArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/VerificationPopupArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class VerificationPopupArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationPopupArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f212200b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f212201c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ProfileCreateExtendedFlow f212202d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f212203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f212204f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f212205g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final VerificationDisclaimer f212206h;

    /* compiled from: VerificationPopupArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationPopupArguments> {
        @Override // android.os.Parcelable.Creator
        public final VerificationPopupArguments createFromParcel(Parcel parcel) {
            return new VerificationPopupArguments(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ProfileCreateExtendedFlow) parcel.readParcelable(VerificationPopupArguments.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (VerificationDisclaimer) parcel.readParcelable(VerificationPopupArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationPopupArguments[] newArray(int i12) {
            return new VerificationPopupArguments[i12];
        }
    }

    public VerificationPopupArguments(int i12, @l Integer num, @k ProfileCreateExtendedFlow profileCreateExtendedFlow, @l String str, boolean z12, @l String str2, @k VerificationDisclaimer verificationDisclaimer) {
        this.f212200b = i12;
        this.f212201c = num;
        this.f212202d = profileCreateExtendedFlow;
        this.f212203e = str;
        this.f212204f = z12;
        this.f212205g = str2;
        this.f212206h = verificationDisclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationPopupArguments)) {
            return false;
        }
        VerificationPopupArguments verificationPopupArguments = (VerificationPopupArguments) obj;
        return this.f212200b == verificationPopupArguments.f212200b && L.f(this.f212201c, verificationPopupArguments.f212201c) && L.f(this.f212202d, verificationPopupArguments.f212202d) && L.f(this.f212203e, verificationPopupArguments.f212203e) && this.f212204f == verificationPopupArguments.f212204f && L.f(this.f212205g, verificationPopupArguments.f212205g) && L.f(this.f212206h, verificationPopupArguments.f212206h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f212200b) * 31;
        Integer num = this.f212201c;
        int iHashCode2 = (this.f212202d.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str = this.f212203e;
        int i12 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f212204f);
        String str2 = this.f212205g;
        return this.f212206h.hashCode() + ((i12 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "VerificationPopupArguments(verticalId=" + this.f212200b + ", specificId=" + this.f212201c + ", flow=" + this.f212202d + ", source=" + this.f212203e + ", alreadyHasExtendedProfile=" + this.f212204f + ", userHash=" + this.f212205g + ", verificationDisclaimer=" + this.f212206h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f212200b);
        Integer num = this.f212201c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f212202d, i12);
        parcel.writeString(this.f212203e);
        parcel.writeInt(this.f212204f ? 1 : 0);
        parcel.writeString(this.f212205g);
        parcel.writeParcelable(this.f212206h, i12);
    }
}
