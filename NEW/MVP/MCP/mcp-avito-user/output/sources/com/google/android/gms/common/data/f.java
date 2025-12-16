package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    @RX0.a
    public int f349283a;

    @RX0.a
    public final boolean equals(@P Object obj) {
        return (obj instanceof f) && C36727t.a(Integer.valueOf(((f) obj).f349283a), Integer.valueOf(this.f349283a)) && C36727t.a(0, 0);
    }

    @RX0.a
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f349283a), 0, null});
    }
}
