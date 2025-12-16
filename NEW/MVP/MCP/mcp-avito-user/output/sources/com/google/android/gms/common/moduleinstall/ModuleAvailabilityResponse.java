package com.google.android.gms.common.moduleinstall;

import VX0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new f();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349501b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349502c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    @SafeParcelable.b
    @RX0.a
    public ModuleAvailabilityResponse(@SafeParcelable.e boolean z12, @SafeParcelable.e int i12) {
        this.f349501b = z12;
        this.f349502c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349501b ? 1 : 0);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349502c);
        TX0.a.p(parcel, iO2);
    }
}
