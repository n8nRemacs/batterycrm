package com.google.android.gms.common.moduleinstall;

import TX0.a;
import VX0.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349504b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349505c;

    @SafeParcelable.b
    public ModuleInstallResponse(@SafeParcelable.e int i12, @SafeParcelable.e boolean z12) {
        this.f349504b = i12;
        this.f349505c = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f349504b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f349505c ? 1 : 0);
        a.p(parcel, iO2);
    }
}
