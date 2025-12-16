package com.google.android.gms.signin.internal;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;
import jY0.C42332g;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zag extends AbstractSafeParcelable implements r {
    public static final Parcelable.Creator<zag> CREATOR = new C42332g();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f355604b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f355605c;

    @SafeParcelable.b
    public zag(@SafeParcelable.e ArrayList arrayList, @SafeParcelable.e @P String str) {
        this.f355604b = arrayList;
        this.f355605c = str;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f355605c != null ? Status.f348900f : Status.f348904j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.l(this.f355604b, parcel, 1);
        a.j(parcel, 2, this.f355605c, false);
        a.p(parcel, iO2);
    }
}
