package com.google.android.gms.common.moduleinstall;

import VX0.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new j();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349506b;

    /* renamed from: c, reason: collision with root package name */
    @a
    @SafeParcelable.c
    public final int f349507c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Long f349508d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Long f349509e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349510f;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    public static class b {
    }

    @SafeParcelable.b
    @RX0.a
    public ModuleInstallStatusUpdate(@SafeParcelable.e int i12, @SafeParcelable.e @a int i13, @SafeParcelable.e @P Long l12, @SafeParcelable.e @P Long l13, @SafeParcelable.e int i14) {
        this.f349506b = i12;
        this.f349507c = i13;
        this.f349508d = l12;
        this.f349509e = l13;
        this.f349510f = i14;
        if (l12 != null && l13 != null && l13.longValue() != 0 && l13.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349506b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349507c);
        TX0.a.h(parcel, 3, this.f349508d);
        TX0.a.h(parcel, 4, this.f349509e);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f349510f);
        TX0.a.p(parcel, iO2);
    }
}
