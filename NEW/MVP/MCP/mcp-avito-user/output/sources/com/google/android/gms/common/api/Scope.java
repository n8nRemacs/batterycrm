package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<Scope> CREATOR = new E();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348898b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348899c;

    @SafeParcelable.b
    public Scope(@SafeParcelable.e int i12, @SafeParcelable.e String str) {
        C36729v.g(str, "scopeUri must not be null or empty");
        this.f348898b = i12;
        this.f348899c = str;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f348899c.equals(((Scope) obj).f348899c);
    }

    public final int hashCode() {
        return this.f348899c.hashCode();
    }

    @N
    public final String toString() {
        return this.f348899c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348898b);
        TX0.a.j(parcel, 2, this.f348899c, false);
        TX0.a.p(parcel, iO2);
    }
}
