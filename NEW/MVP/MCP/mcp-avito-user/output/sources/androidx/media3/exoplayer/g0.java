package androidx.media3.exoplayer;

import androidx.media3.common.util.C23110a;

/* compiled from: SeekParameters.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f49167c;

    /* renamed from: a, reason: collision with root package name */
    public final long f49168a;

    /* renamed from: b, reason: collision with root package name */
    public final long f49169b;

    static {
        g0 g0Var = new g0(0L, 0L);
        new g0(Long.MAX_VALUE, Long.MAX_VALUE);
        new g0(Long.MAX_VALUE, 0L);
        new g0(0L, Long.MAX_VALUE);
        f49167c = g0Var;
    }

    public g0(long j12, long j13) {
        C23110a.b(j12 >= 0);
        C23110a.b(j13 >= 0);
        this.f49168a = j12;
        this.f49169b = j13;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f49168a == g0Var.f49168a && this.f49169b == g0Var.f49169b;
    }

    public final int hashCode() {
        return (((int) this.f49168a) * 31) + ((int) this.f49169b);
    }
}
