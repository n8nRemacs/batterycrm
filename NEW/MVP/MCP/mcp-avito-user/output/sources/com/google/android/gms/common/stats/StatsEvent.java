package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@Deprecated
/* loaded from: classes6.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    public interface a {
    }

    public abstract long h();

    @N
    public final String toString() {
        return h() + "\t" + zza() + "\t-1" + zzc();
    }

    public abstract int zza();

    @N
    public abstract String zzc();
}
