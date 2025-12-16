package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Button.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/N1;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final N1 f32961a = new N1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.layout.V1 f32962b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f32963c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f32964d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.layout.V1 f32965e;

    static {
        float f12 = 16;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 8;
        androidx.compose.foundation.layout.V1 v1D = androidx.compose.foundation.layout.R1.d(f12, f13, f12, f13);
        f32962b = v1D;
        f32963c = 64;
        f32964d = 36;
        f32965e = androidx.compose.foundation.layout.R1.d(f13, v1D.f28521b, f13, v1D.f28523d);
    }

    @InterfaceC22132o
    @Y61.k
    public static M1 a(long j12, long j13, long j14, long j15, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        long jD2;
        long jG2;
        long jC2;
        if ((i13 & 1) != 0) {
            C21365u5.f34242a.getClass();
            jD2 = C21365u5.a(a12).d();
        } else {
            jD2 = j12;
        }
        long jA2 = (i13 & 2) != 0 ? C21320r2.a(jD2, a12) : j13;
        if ((i13 & 4) != 0) {
            C21365u5.f34242a.getClass();
            jG2 = androidx.compose.ui.graphics.V.g(androidx.compose.ui.graphics.T.c(C21365u5.a(a12).c(), 0.12f), C21365u5.a(a12).f());
        } else {
            jG2 = j14;
        }
        if ((i13 & 8) != 0) {
            C21365u5.f34242a.getClass();
            long jC3 = C21365u5.a(a12).c();
            C21414y2.f34415a.getClass();
            jC2 = androidx.compose.ui.graphics.T.c(jC3, C21414y2.a(0.38f, 0.38f, a12));
        } else {
            jC2 = j15;
        }
        return new B2(jD2, jA2, jG2, jC2, null);
    }
}
