package com.google.android.gms.auth.api.identity;

import OX0.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new q();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final SignInPassword f348687b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348688c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348689d;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public SignInPassword f348690a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f348691b;

        /* renamed from: c, reason: collision with root package name */
        public int f348692c;
    }

    @SafeParcelable.b
    public SavePasswordRequest(@SafeParcelable.e SignInPassword signInPassword, @SafeParcelable.e @P String str, @SafeParcelable.e int i12) {
        C36729v.j(signInPassword);
        this.f348687b = signInPassword;
        this.f348688c = str;
        this.f348689d = i12;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return C36727t.a(this.f348687b, savePasswordRequest.f348687b) && C36727t.a(this.f348688c, savePasswordRequest.f348688c) && this.f348689d == savePasswordRequest.f348689d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348687b, this.f348688c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f348687b, i12, false);
        TX0.a.j(parcel, 2, this.f348688c, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f348689d);
        TX0.a.p(parcel, iO2);
    }
}
