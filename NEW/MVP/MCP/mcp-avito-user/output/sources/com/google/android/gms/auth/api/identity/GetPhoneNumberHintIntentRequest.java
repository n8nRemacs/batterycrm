package com.google.android.gms.auth.api.identity;

import OX0.l;
import OX0.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new m();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348661b;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class a {
        public a() {
            throw null;
        }

        public /* synthetic */ a(l lVar) {
        }
    }

    @SafeParcelable.b
    public GetPhoneNumberHintIntentRequest(@SafeParcelable.e int i12) {
        this.f348661b = i12;
    }

    public final boolean equals(@P Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return C36727t.a(Integer.valueOf(this.f348661b), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f348661b));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f348661b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348661b);
        TX0.a.p(parcel, iO2);
    }
}
