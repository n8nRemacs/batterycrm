package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new d();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348530b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final long f348531c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348532d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348533e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348534f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348535g;

    @SafeParcelable.b
    public AccountChangeEvent(@SafeParcelable.e int i12, @SafeParcelable.e long j12, @SafeParcelable.e String str, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e String str2) {
        this.f348530b = i12;
        this.f348531c = j12;
        C36729v.j(str);
        this.f348532d = str;
        this.f348533e = i13;
        this.f348534f = i14;
        this.f348535g = str2;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f348530b == accountChangeEvent.f348530b && this.f348531c == accountChangeEvent.f348531c && C36727t.a(this.f348532d, accountChangeEvent.f348532d) && this.f348533e == accountChangeEvent.f348533e && this.f348534f == accountChangeEvent.f348534f && C36727t.a(this.f348535g, accountChangeEvent.f348535g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f348530b), Long.valueOf(this.f348531c), this.f348532d, Integer.valueOf(this.f348533e), Integer.valueOf(this.f348534f), this.f348535g});
    }

    @N
    public final String toString() {
        int i12 = this.f348533e;
        String str = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        StringBuilder sb2 = new StringBuilder("AccountChangeEvent {accountName = ");
        androidx.media3.exoplayer.analytics.m.p(sb2, this.f348532d, ", changeType = ", str, ", changeData = ");
        sb2.append(this.f348535g);
        sb2.append(", eventIndex = ");
        return AK.c.i(this.f348534f, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348530b);
        TX0.a.q(parcel, 2, 8);
        parcel.writeLong(this.f348531c);
        TX0.a.j(parcel, 3, this.f348532d, false);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f348533e);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f348534f);
        TX0.a.j(parcel, 6, this.f348535g, false);
        TX0.a.p(parcel, iO2);
    }
}
