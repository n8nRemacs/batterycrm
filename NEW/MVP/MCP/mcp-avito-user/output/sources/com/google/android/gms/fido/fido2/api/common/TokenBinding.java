package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<TokenBinding> CREATOR = new z();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final TokenBindingStatus f349843b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349844c;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public enum TokenBindingStatus implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        /* JADX INFO: Fake field, exist only in values array */
        SUPPORTED("supported"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SUPPORTED("not-supported");


        @j.N
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new y();

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final String f349846b;

        TokenBindingStatus(@j.N String str) {
            this.f349846b = str;
        }

        @j.N
        public static TokenBindingStatus a(@j.N String str) throws UnsupportedTokenBindingStatusException {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f349846b)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(AK.c.k("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @j.N
        public final String toString() {
            return this.f349846b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@j.N Parcel parcel, int i12) {
            parcel.writeString(this.f349846b);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedTokenBindingStatusException extends Exception {
    }

    static {
        Parcelable.Creator<TokenBindingStatus> creator = TokenBindingStatus.CREATOR;
        new TokenBinding("supported", null);
        Parcelable.Creator<TokenBindingStatus> creator2 = TokenBindingStatus.CREATOR;
        new TokenBinding("not-supported", null);
    }

    @SafeParcelable.b
    public TokenBinding(@SafeParcelable.e @j.N String str, @SafeParcelable.e @j.P String str2) {
        C36729v.j(str);
        try {
            this.f349843b = TokenBindingStatus.a(str);
            this.f349844c = str2;
        } catch (UnsupportedTokenBindingStatusException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return zzbk.zza(this.f349843b, tokenBinding.f349843b) && zzbk.zza(this.f349844c, tokenBinding.f349844c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349843b, this.f349844c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f349843b.f349846b, false);
        TX0.a.j(parcel, 3, this.f349844c, false);
        TX0.a.p(parcel, iO2);
    }
}
