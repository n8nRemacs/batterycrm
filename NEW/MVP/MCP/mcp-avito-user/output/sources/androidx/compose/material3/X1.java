package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.unit.h;
import d0.C39471u;
import kotlin.Metadata;

/* compiled from: Button.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/X1;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final X1 f35798a = new X1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.layout.V1 f35799b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.layout.V1 f35800c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f35801d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f35802e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f35803f;

    static {
        float f12 = 24;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 8;
        androidx.compose.foundation.layout.V1 v1D = androidx.compose.foundation.layout.R1.d(f12, f13, f12, f13);
        f35799b = v1D;
        float f14 = 16;
        androidx.compose.foundation.layout.R1.d(f14, f13, f12, f13);
        float f15 = 12;
        float f16 = v1D.f28521b;
        float f17 = v1D.f28523d;
        f35800c = androidx.compose.foundation.layout.R1.d(f15, f16, f15, f17);
        androidx.compose.foundation.layout.R1.d(f15, f16, f14, f17);
        f35801d = 58;
        f35802e = 40;
        C39471u.f393575a.getClass();
        f35803f = f13;
    }

    @InterfaceC22132o
    @Y61.k
    public static W1 a(long j12, long j13, @Y61.l androidx.compose.runtime.A a12, int i12) {
        long j14;
        a12.I(-339300779);
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        aVar.getClass();
        long j15 = androidx.compose.ui.graphics.T.f39330l;
        if ((i12 & 4) != 0) {
            aVar.getClass();
            j14 = j15;
        } else {
            j14 = j13;
        }
        aVar.getClass();
        C21859s9.f37272a.getClass();
        C21942w3 c21942w3A = C21859s9.a(a12);
        W1 w12 = c21942w3A.f37645K;
        if (w12 == null) {
            C39471u.f393575a.getClass();
            w12 = new W1(C21964x3.c(c21942w3A, C39471u.f393576b), C21964x3.c(c21942w3A, C39471u.f393583i), androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, C39471u.f393578d), 0.12f), androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, C39471u.f393580f), 0.38f), null);
            c21942w3A.f37645K = w12;
        }
        W1 w1A = w12.a(j12, j15, j14, j15);
        a12.O();
        return w1A;
    }

    @InterfaceC22132o
    @Y61.k
    public static W1 b(long j12, long j13, @Y61.l androidx.compose.runtime.A a12, int i12) {
        long j14;
        a12.I(-1402274782);
        if ((i12 & 1) != 0) {
            androidx.compose.ui.graphics.T.f39320b.getClass();
            j14 = androidx.compose.ui.graphics.T.f39330l;
        } else {
            j14 = j12;
        }
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        aVar.getClass();
        long j15 = androidx.compose.ui.graphics.T.f39330l;
        aVar.getClass();
        C21859s9.f37272a.getClass();
        C21942w3 c21942w3A = C21859s9.a(a12);
        W1 w12 = c21942w3A.f37647M;
        if (w12 == null) {
            androidx.compose.ui.graphics.T.f39320b.getClass();
            long j16 = androidx.compose.ui.graphics.T.f39329k;
            d0.h0.f393421a.getClass();
            w12 = new W1(j16, C21964x3.c(c21942w3A, d0.h0.f393424d), j16, androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, d0.h0.f393423c), 0.38f), null);
            c21942w3A.f37647M = w12;
        }
        W1 w1A = w12.a(j14, j13, j15, j15);
        a12.O();
        return w1A;
    }
}
