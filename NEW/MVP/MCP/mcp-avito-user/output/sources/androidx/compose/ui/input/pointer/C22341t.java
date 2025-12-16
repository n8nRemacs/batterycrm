package androidx.compose.ui.input.pointer;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PointerEvent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22341t {
    public static final boolean a(@Y61.k C c12) {
        return !c12.f40123h && c12.f40119d;
    }

    public static final boolean b(@Y61.k C c12) {
        return (c12.b() || !c12.f40123h || c12.f40119d) ? false : true;
    }

    public static final boolean c(@Y61.k C c12) {
        return c12.f40123h && !c12.f40119d;
    }

    @InterfaceC42830m
    public static final void d(@Y61.k C c12) {
        long jF2 = f(c12, false);
        l0.g.f413384b.getClass();
        if (l0.g.d(jF2, 0L)) {
            return;
        }
        c12.a();
    }

    public static final boolean e(@Y61.k C c12, long j12, long j13) {
        U.f40189b.getClass();
        boolean zA2 = U.a(c12.f40124i, U.f40190c);
        long j14 = c12.f40118c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j13 >> 32));
        float f12 = zA2 ? 1.0f : 0.0f;
        float f13 = fIntBitsToFloat3 * f12;
        float f14 = ((int) (j12 >> 32)) + f13;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * f12;
        return (fIntBitsToFloat > f14) | (fIntBitsToFloat < (-f13)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j12 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long f(C c12, boolean z12) {
        long jI2 = l0.g.i(c12.f40118c, c12.f40122g);
        if (z12 || !c12.b()) {
            return jI2;
        }
        l0.g.f413384b.getClass();
        return 0L;
    }
}
