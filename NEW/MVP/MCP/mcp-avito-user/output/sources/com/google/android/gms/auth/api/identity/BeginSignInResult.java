package com.google.android.gms.auth.api.identity;

import OX0.j;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new j();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final PendingIntent f348660b;

    @SafeParcelable.b
    public BeginSignInResult(@SafeParcelable.e @N PendingIntent pendingIntent) {
        C36729v.j(pendingIntent);
        this.f348660b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f348660b, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
