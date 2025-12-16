package com.google.android.gms.auth.api.identity;

import OX0.r;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public class SavePasswordResult extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new r();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final PendingIntent f348693b;

    @SafeParcelable.b
    public SavePasswordResult(@SafeParcelable.e @N PendingIntent pendingIntent) {
        C36729v.j(pendingIntent);
        this.f348693b = pendingIntent;
    }

    public final boolean equals(@P Object obj) {
        if (obj instanceof SavePasswordResult) {
            return C36727t.a(this.f348693b, ((SavePasswordResult) obj).f348693b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348693b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f348693b, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
