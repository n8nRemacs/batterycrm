package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.dynamiclinks.f;
import j.P;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.a
/* loaded from: classes5.dex */
public final class ShortDynamicLinkImpl extends AbstractSafeParcelable implements com.google.firebase.dynamiclinks.f {
    public static final Parcelable.Creator<ShortDynamicLinkImpl> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Uri f361527b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Uri f361528c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final List<WarningImpl> f361529d;

    @SafeParcelable.a
    public static class WarningImpl extends AbstractSafeParcelable implements f.b {
        public static final Parcelable.Creator<WarningImpl> CREATOR = new j();

        /* renamed from: b, reason: collision with root package name */
        @SafeParcelable.c
        @SafeParcelable.g
        public final String f361530b;

        @SafeParcelable.b
        public WarningImpl(@SafeParcelable.e String str) {
            this.f361530b = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            int iO2 = TX0.a.o(parcel, 20293);
            TX0.a.j(parcel, 2, this.f361530b, false);
            TX0.a.p(parcel, iO2);
        }
    }

    @SafeParcelable.b
    public ShortDynamicLinkImpl(@SafeParcelable.e @P Uri uri, @SafeParcelable.e @P Uri uri2, @SafeParcelable.e @P ArrayList arrayList) {
        this.f361527b = uri;
        this.f361528c = uri2;
        this.f361529d = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f361527b, i12, false);
        TX0.a.i(parcel, 2, this.f361528c, i12, false);
        TX0.a.n(parcel, 3, this.f361529d, false);
        TX0.a.p(parcel, iO2);
    }
}
