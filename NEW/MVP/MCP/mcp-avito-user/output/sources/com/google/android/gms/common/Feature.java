package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class Feature extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<Feature> CREATOR = new C();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348866b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @Deprecated
    public final int f348867c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f348868d;

    @SafeParcelable.b
    public Feature(@SafeParcelable.e @j.N String str, @SafeParcelable.e int i12, @SafeParcelable.e long j12) {
        this.f348866b = str;
        this.f348867c = i12;
        this.f348868d = j12;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f348866b;
            if (((str != null && str.equals(feature.f348866b)) || (str == null && feature.f348866b == null)) && h() == feature.h()) {
                return true;
            }
        }
        return false;
    }

    @RX0.a
    public final long h() {
        long j12 = this.f348868d;
        return j12 == -1 ? this.f348867c : j12;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348866b, Long.valueOf(h())});
    }

    @j.N
    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f348866b, "name");
        aVarB.a(Long.valueOf(h()), "version");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f348866b, false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f348867c);
        long jH2 = h();
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(jH2);
        TX0.a.p(parcel, iO2);
    }

    @RX0.a
    public Feature(@j.N String str, long j12) {
        this.f348866b = str;
        this.f348868d = j12;
        this.f348867c = -1;
    }
}
