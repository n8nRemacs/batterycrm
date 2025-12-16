package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class WebImage extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<WebImage> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349296b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final Uri f349297c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349298d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349299e;

    @SafeParcelable.b
    public WebImage(@SafeParcelable.e int i12, @SafeParcelable.e Uri uri, @SafeParcelable.e int i13, @SafeParcelable.e int i14) {
        this.f349296b = i12;
        this.f349297c = uri;
        this.f349298d = i13;
        this.f349299e = i14;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (C36727t.a(this.f349297c, webImage.f349297c) && this.f349298d == webImage.f349298d && this.f349299e == webImage.f349299e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349297c, Integer.valueOf(this.f349298d), Integer.valueOf(this.f349299e)});
    }

    @N
    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.f349298d + "x" + this.f349299e + " " + this.f349297c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349296b);
        TX0.a.i(parcel, 2, this.f349297c, i12, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349298d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f349299e);
        TX0.a.p(parcel, iO2);
    }
}
