package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @RX0.a
    public FastSafeParcelableJsonResponse() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @RX0.a
    public boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (b(field)) {
                if (!fastJsonResponse.b(field) || !C36727t.a(a(field), fastJsonResponse.a(field))) {
                    return false;
                }
            } else if (fastJsonResponse.b(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @P
    public Object getValueObject(@N String str) {
        return null;
    }

    @RX0.a
    public int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (b(field)) {
                Object objA = a(field);
                C36729v.j(objA);
                iHashCode = (iHashCode * 31) + objA.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isPrimitiveFieldSet(@N String str) {
        return false;
    }

    @N
    @RX0.a
    public byte[] toByteArray() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
