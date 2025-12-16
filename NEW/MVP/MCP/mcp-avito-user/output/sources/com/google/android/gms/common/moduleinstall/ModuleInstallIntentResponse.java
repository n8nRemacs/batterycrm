package com.google.android.gms.common.moduleinstall;

import RX0.a;
import VX0.g;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new g();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final PendingIntent f349503b;

    @SafeParcelable.b
    @a
    public ModuleInstallIntentResponse(@SafeParcelable.e @P PendingIntent pendingIntent) {
        this.f349503b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f349503b, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
