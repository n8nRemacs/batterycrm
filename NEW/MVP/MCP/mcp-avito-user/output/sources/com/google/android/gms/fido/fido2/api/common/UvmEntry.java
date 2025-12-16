package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<UvmEntry> CREATOR = new E();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349851b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final short f349852c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final short f349853d;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {
    }

    @SafeParcelable.b
    public UvmEntry(@SafeParcelable.e int i12, @SafeParcelable.e short s5, @SafeParcelable.e short s12) {
        this.f349851b = i12;
        this.f349852c = s5;
        this.f349853d = s12;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f349851b == uvmEntry.f349851b && this.f349852c == uvmEntry.f349852c && this.f349853d == uvmEntry.f349853d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f349851b), Short.valueOf(this.f349852c), Short.valueOf(this.f349853d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349851b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349852c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349853d);
        TX0.a.p(parcel, iO2);
    }
}
