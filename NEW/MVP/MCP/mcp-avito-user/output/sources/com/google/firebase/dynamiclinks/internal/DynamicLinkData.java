package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

@SafeParcelable.a
/* loaded from: classes5.dex */
public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public String f361521b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public String f361522c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public int f361523d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public long f361524e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public Bundle f361525f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public Uri f361526g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f361521b, false);
        TX0.a.j(parcel, 2, this.f361522c, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f361523d);
        long j12 = this.f361524e;
        TX0.a.q(parcel, 4, 8);
        parcel.writeLong(j12);
        Bundle bundle = this.f361525f;
        if (bundle == null) {
            bundle = new Bundle();
        }
        TX0.a.a(parcel, 5, bundle, false);
        TX0.a.i(parcel, 6, this.f361526g, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
