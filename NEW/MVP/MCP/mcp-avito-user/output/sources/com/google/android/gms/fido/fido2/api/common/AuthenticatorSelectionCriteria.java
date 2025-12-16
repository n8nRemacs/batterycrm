package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new N();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Attachment f349733b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Boolean f349734c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final UserVerificationRequirement f349735d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ResidentKeyRequirement f349736e;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public Attachment f349737a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public Boolean f349738b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public ResidentKeyRequirement f349739c;
    }

    @SafeParcelable.b
    public AuthenticatorSelectionCriteria(@SafeParcelable.e @j.P Boolean bool, @SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P String str2, @SafeParcelable.e @j.P String str3) {
        Attachment attachmentA;
        ResidentKeyRequirement residentKeyRequirementA = null;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e12) {
                throw new IllegalArgumentException(e12);
            }
        }
        this.f349733b = attachmentA;
        this.f349734c = bool;
        this.f349735d = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirementA = ResidentKeyRequirement.a(str3);
        }
        this.f349736e = residentKeyRequirementA;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return C36727t.a(this.f349733b, authenticatorSelectionCriteria.f349733b) && C36727t.a(this.f349734c, authenticatorSelectionCriteria.f349734c) && C36727t.a(this.f349735d, authenticatorSelectionCriteria.f349735d) && C36727t.a(h(), authenticatorSelectionCriteria.h());
    }

    @j.P
    public final ResidentKeyRequirement h() {
        ResidentKeyRequirement residentKeyRequirement = this.f349736e;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f349734c;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349733b, this.f349734c, this.f349735d, h()});
    }

    @j.N
    public final String toString() {
        String strValueOf = String.valueOf(this.f349733b);
        String strValueOf2 = String.valueOf(this.f349735d);
        String strValueOf3 = String.valueOf(this.f349736e);
        StringBuilder sbA = androidx.appcompat.app.r.A("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbA.append(this.f349734c);
        sbA.append(", \n requireUserVerification=");
        sbA.append(strValueOf2);
        sbA.append(", \n residentKeyRequirement=");
        return AK.c.s(sbA, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        Attachment attachment = this.f349733b;
        TX0.a.j(parcel, 2, attachment == null ? null : attachment.f349688b, false);
        Boolean bool = this.f349734c;
        if (bool != null) {
            TX0.a.q(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        UserVerificationRequirement userVerificationRequirement = this.f349735d;
        TX0.a.j(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.f349849b, false);
        ResidentKeyRequirement residentKeyRequirementH = h();
        TX0.a.j(parcel, 5, residentKeyRequirementH != null ? residentKeyRequirementH.f349842b : null, false);
        TX0.a.p(parcel, iO2);
    }
}
