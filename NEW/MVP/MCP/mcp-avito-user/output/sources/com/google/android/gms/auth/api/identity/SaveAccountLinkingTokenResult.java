package com.google.android.gms.auth.api.identity;

import OX0.p;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new p();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final PendingIntent f348686b;

    @SafeParcelable.b
    public SaveAccountLinkingTokenResult(@SafeParcelable.e @P PendingIntent pendingIntent) {
        this.f348686b = pendingIntent;
    }

    public final boolean equals(@P Object obj) {
        if (obj instanceof SaveAccountLinkingTokenResult) {
            return C36727t.a(this.f348686b, ((SaveAccountLinkingTokenResult) obj).f348686b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348686b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f348686b, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
