package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public class ErrorResponseData extends ResponseData {

    @N
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new f();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ErrorCode f349904b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349905c;

    @SafeParcelable.b
    public ErrorResponseData(@SafeParcelable.e int i12, @SafeParcelable.e String str) {
        ErrorCode errorCode;
        ErrorCode[] errorCodeArrValues = ErrorCode.values();
        int length = errorCodeArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                errorCode = ErrorCode.OTHER_ERROR;
                break;
            }
            errorCode = errorCodeArrValues[i13];
            if (i12 == errorCode.f349903b) {
                break;
            } else {
                i13++;
            }
        }
        this.f349904b = errorCode;
        this.f349905c = str;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return C36727t.a(this.f349904b, errorResponseData.f349904b) && C36727t.a(this.f349905c, errorResponseData.f349905c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349904b, this.f349905c});
    }

    @N
    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zza("errorCode", this.f349904b.f349903b);
        String str = this.f349905c;
        if (str != null) {
            zzbiVarZza.zzb("errorMessage", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        int i13 = this.f349904b.f349903b;
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(i13);
        TX0.a.j(parcel, 3, this.f349905c, false);
        TX0.a.p(parcel, iO2);
    }
}
