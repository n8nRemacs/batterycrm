package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.text.input.C22648n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;
import l0.n;

/* compiled from: TextFieldDelegate.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/e2;", "", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20862e2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f30700a = new a(null);

    /* compiled from: TextFieldDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/e2$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e2$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(androidx.compose.ui.graphics.M m12, long j12, androidx.compose.ui.text.input.L l12, androidx.compose.ui.text.o0 o0Var, C22273n c22273n) {
            int iB2 = l12.b(androidx.compose.ui.text.v0.g(j12));
            int iB3 = l12.b(androidx.compose.ui.text.v0.f(j12));
            if (iB2 != iB3) {
                m12.v(o0Var.k(iB2, iB3), c22273n);
            }
        }

        @X41.n
        public static void b(@Y61.k androidx.compose.ui.text.input.W w12, @Y61.k U1 u12, @Y61.k androidx.compose.ui.text.o0 o0Var, @Y61.k androidx.compose.ui.layout.A a12, @Y61.k androidx.compose.ui.text.input.i0 i0Var, boolean z12, @Y61.k androidx.compose.ui.text.input.L l12) {
            l0.j jVar;
            if (z12) {
                int iB2 = l12.b(androidx.compose.ui.text.v0.f(w12.f42384b));
                if (iB2 < o0Var.f42526a.f42506a.f42127c.length()) {
                    jVar = o0Var.b(iB2);
                } else if (iB2 != 0) {
                    jVar = o0Var.b(iB2 - 1);
                } else {
                    jVar = new l0.j(0.0f, 0.0f, 1.0f, (int) (C20866f2.a(u12.f30562b, u12.f30567g, u12.f30568h, C20866f2.f30708a, 1) & 4294967295L));
                }
                float f12 = jVar.f413390a;
                long jFloatToRawIntBits = Float.floatToRawIntBits(f12);
                float f13 = jVar.f413391b;
                g.a aVar = l0.g.f413384b;
                long jY2 = a12.y((jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jY2 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY2 & 4294967295L));
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                float f14 = jVar.f413392c - f12;
                float f15 = jVar.f413393d - f13;
                n.a aVar2 = l0.n.f413402b;
                l0.j jVarA = l0.k.a(jFloatToRawIntBits2, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L));
                if (kotlin.jvm.internal.L.f(i0Var.f42445a.f42389b.get(), i0Var)) {
                    i0Var.f42446b.f(jVarA);
                }
            }
        }

        @X41.n
        public static void c(@Y61.k List list, @Y61.k C22648n c22648n, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.text.input.i0 i0Var) {
            androidx.compose.ui.text.input.W wA2 = c22648n.a(list);
            if (i0Var != null && kotlin.jvm.internal.L.f(i0Var.f42445a.f42389b.get(), i0Var)) {
                i0Var.f42446b.b(null, wA2);
            }
            ((C20985q1.b) lVar).invoke(wA2);
        }

        public a() {
        }
    }
}
