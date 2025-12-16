package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new k();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349577b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349578c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final FastJsonResponse.Field f349579d;

    @SafeParcelable.b
    public zam(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e FastJsonResponse.Field field) {
        this.f349577b = i12;
        this.f349578c = str;
        this.f349579d = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349577b);
        TX0.a.j(parcel, 2, this.f349578c, false);
        TX0.a.i(parcel, 3, this.f349579d, i12, false);
        TX0.a.p(parcel, iO2);
    }

    public zam(FastJsonResponse.Field field, String str) {
        this.f349577b = 1;
        this.f349578c = str;
        this.f349579d = field;
    }
}
