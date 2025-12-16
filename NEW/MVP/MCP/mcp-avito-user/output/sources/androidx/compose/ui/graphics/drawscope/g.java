package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.C22258i0;
import androidx.compose.ui.graphics.C22279q;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.I0;
import androidx.compose.ui.graphics.InterfaceC22280q0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import j.InterfaceC42167x;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: DrawScope.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/unit/d;", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public interface g extends androidx.compose.ui.unit.d {

    /* renamed from: B1, reason: collision with root package name */
    @Y61.k
    public static final a f39490B1 = a.f39491a;

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f39491a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f39492b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f39493c;

        static {
            E.f39229b.getClass();
            f39492b = E.f39232e;
            C22258i0.f39518b.getClass();
            f39493c = C22258i0.f39519c;
        }
    }

    /* compiled from: DrawScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: DrawScope.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<g, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f39495m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super g, G0> lVar) {
            super(1);
            this.f39495m = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(g gVar) {
            g gVar2 = gVar;
            androidx.compose.ui.unit.d dVarB = gVar2.getF39478c().b();
            LayoutDirection layoutDirectionD = gVar2.getF39478c().d();
            M mA2 = gVar2.getF39478c().a();
            long jE2 = gVar2.getF39478c().e();
            C22267c c22267c = gVar2.getF39478c().f39486b;
            ?? r52 = this.f39495m;
            g gVar3 = g.this;
            androidx.compose.ui.unit.d dVarB2 = gVar3.getF39478c().b();
            LayoutDirection layoutDirectionD2 = gVar3.getF39478c().d();
            M mA3 = gVar3.getF39478c().a();
            long jE3 = gVar3.getF39478c().e();
            C22267c c22267c2 = gVar3.getF39478c().f39486b;
            a.b bVarJ0 = gVar3.getF39478c();
            bVarJ0.g(dVarB);
            bVarJ0.i(layoutDirectionD);
            bVarJ0.f(mA2);
            bVarJ0.j(jE2);
            bVarJ0.f39486b = c22267c;
            mA2.k();
            try {
                r52.invoke(gVar3);
                mA2.i();
                a.b bVarJ02 = gVar3.getF39478c();
                bVarJ02.g(dVarB2);
                bVarJ02.i(layoutDirectionD2);
                bVarJ02.f(mA3);
                bVarJ02.j(jE3);
                bVarJ02.f39486b = c22267c2;
                return G0.f406611a;
            } catch (Throwable th2) {
                mA2.i();
                a.b bVarJ03 = gVar3.getF39478c();
                bVarJ03.g(dVarB2);
                bVarJ03.i(layoutDirectionD2);
                bVarJ03.f(mA3);
                bVarJ03.j(jE3);
                bVarJ03.f39486b = c22267c2;
                throw th2;
            }
        }
    }

    static void G0(g gVar, long j12, long j13, long j14, float f12, int i12, C22279q c22279q, int i13, int i14) {
        int i15;
        int i16;
        float f13 = (i14 & 8) != 0 ? 0.0f : f12;
        if ((i14 & 16) != 0) {
            o.f39498f.getClass();
            i15 = 0;
        } else {
            i15 = i12;
        }
        C22279q c22279q2 = (i14 & 32) != 0 ? null : c22279q;
        if ((i14 & 256) != 0) {
            f39490B1.getClass();
            i16 = a.f39492b;
        } else {
            i16 = i13;
        }
        gVar.E1(j12, j13, j14, f13, i15, c22279q2, i16);
    }

    static long J0(long j12, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) - Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) - Float.intBitsToFloat((int) (j13 & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        n.a aVar = l0.n.f413402b;
        return jFloatToRawIntBits;
    }

    static void U(g gVar, long j12, float f12, long j13, float f13, j jVar, int i12, int i13) {
        int i14;
        float fD2 = (i13 & 2) != 0 ? l0.n.d(gVar.i()) / 2.0f : f12;
        long jV1 = (i13 & 4) != 0 ? gVar.v1() : j13;
        float f14 = (i13 & 8) != 0 ? 1.0f : f13;
        j jVar2 = (i13 & 16) != 0 ? n.f39497a : jVar;
        if ((i13 & 64) != 0) {
            f39490B1.getClass();
            i14 = a.f39492b;
        } else {
            i14 = i12;
        }
        gVar.L1(j12, fD2, jV1, f14, jVar2, i14);
    }

    static void X0(g gVar, InterfaceC22280q0 interfaceC22280q0, long j12, long j13, long j14, long j15, float f12, j jVar, U u12, int i12, int i13, int i14) {
        long j16;
        long j17;
        int i15;
        int i16;
        if ((i14 & 2) != 0) {
            q.f42862b.getClass();
            j16 = 0;
        } else {
            j16 = j12;
        }
        if ((i14 & 8) != 0) {
            q.f42862b.getClass();
            j17 = 0;
        } else {
            j17 = j14;
        }
        long j18 = (i14 & 16) != 0 ? j13 : j15;
        float f13 = (i14 & 32) != 0 ? 1.0f : f12;
        j jVar2 = (i14 & 64) != 0 ? n.f39497a : jVar;
        int i17 = i14 & 256;
        a aVar = f39490B1;
        if (i17 != 0) {
            aVar.getClass();
            i15 = a.f39492b;
        } else {
            i15 = i12;
        }
        if ((i14 & 512) != 0) {
            aVar.getClass();
            i16 = a.f39493c;
        } else {
            i16 = i13;
        }
        gVar.P0(interfaceC22280q0, j16, j13, j17, j18, f13, jVar2, u12, i15, i16);
    }

    static void Y0(g gVar, Path path, J j12, float f12, o oVar, int i12) {
        int i13;
        if ((i12 & 4) != 0) {
            f12 = 1.0f;
        }
        float f13 = f12;
        j jVar = oVar;
        if ((i12 & 8) != 0) {
            jVar = n.f39497a;
        }
        j jVar2 = jVar;
        if ((i12 & 32) != 0) {
            f39490B1.getClass();
            i13 = a.f39492b;
        } else {
            i13 = 0;
        }
        gVar.x0(path, j12, f13, jVar2, i13);
    }

    static void Z0(g gVar, J j12, long j13, long j14, long j15, j jVar, int i12) {
        long j16;
        if ((i12 & 2) != 0) {
            l0.g.f413384b.getClass();
            j16 = 0;
        } else {
            j16 = j13;
        }
        long jJ02 = (i12 & 4) != 0 ? J0(gVar.i(), j16) : j14;
        j jVar2 = (i12 & 32) != 0 ? n.f39497a : jVar;
        f39490B1.getClass();
        gVar.Y(j12, j16, jJ02, j15, 1.0f, jVar2, a.f39492b);
    }

    static void c0(g gVar, long j12, long j13, long j14, float f12, U u12, int i12) {
        long j15;
        int i13;
        if ((i12 & 2) != 0) {
            l0.g.f413384b.getClass();
            j15 = 0;
        } else {
            j15 = j13;
        }
        long jJ02 = (i12 & 4) != 0 ? J0(gVar.i(), j15) : j14;
        float f13 = (i12 & 8) != 0 ? 1.0f : f12;
        n nVar = n.f39497a;
        U u13 = (i12 & 32) != 0 ? null : u12;
        if ((i12 & 64) != 0) {
            f39490B1.getClass();
            i13 = a.f39492b;
        } else {
            i13 = 0;
        }
        gVar.P1(j12, j15, jJ02, f13, nVar, u13, i13);
    }

    static void d1(g gVar, long j12, long j13, long j14, long j15, j jVar, float f12, int i12) {
        long j16;
        if ((i12 & 2) != 0) {
            l0.g.f413384b.getClass();
            j16 = 0;
        } else {
            j16 = j13;
        }
        long jJ02 = (i12 & 4) != 0 ? J0(gVar.i(), j16) : j14;
        j jVar2 = (i12 & 16) != 0 ? n.f39497a : jVar;
        float f13 = (i12 & 32) != 0 ? 1.0f : f12;
        f39490B1.getClass();
        gVar.s0(j12, j16, jJ02, j15, jVar2, f13, a.f39492b);
    }

    static void e0(g gVar, J j12, long j13, long j14, float f12, j jVar, U u12, int i12) {
        long j15;
        if ((i12 & 2) != 0) {
            l0.g.f413384b.getClass();
            j15 = 0;
        } else {
            j15 = j13;
        }
        long jJ02 = (i12 & 4) != 0 ? J0(gVar.i(), j15) : j14;
        float f13 = (i12 & 8) != 0 ? 1.0f : f12;
        j jVar2 = (i12 & 16) != 0 ? n.f39497a : jVar;
        U u13 = (i12 & 32) != 0 ? null : u12;
        f39490B1.getClass();
        gVar.o1(j12, j15, jJ02, f13, jVar2, u13, a.f39492b);
    }

    static void l0(d dVar, InterfaceC22280q0 interfaceC22280q0, F f12) {
        l0.g.f413384b.getClass();
        n nVar = n.f39497a;
        f39490B1.getClass();
        dVar.V0(interfaceC22280q0, nVar, f12, a.f39492b);
    }

    static void n0(g gVar, Path path, long j12, float f12, o oVar, int i12) {
        if ((i12 & 4) != 0) {
            f12 = 1.0f;
        }
        float f13 = f12;
        j jVar = oVar;
        if ((i12 & 8) != 0) {
            jVar = n.f39497a;
        }
        f39490B1.getClass();
        gVar.I0(path, j12, f13, jVar, a.f39492b);
    }

    static void t1(g gVar, long j12, float f12, float f13, long j13, long j14, float f14, j jVar, int i12) {
        long j15;
        if ((i12 & 16) != 0) {
            l0.g.f413384b.getClass();
            j15 = 0;
        } else {
            j15 = j13;
        }
        float f15 = (i12 & 64) != 0 ? 1.0f : f14;
        f39490B1.getClass();
        gVar.V1(j12, f12, f13, j15, j14, f15, jVar, a.f39492b);
    }

    static void z1(d dVar, J j12, long j13, long j14, float f12, float f13, int i12) {
        o.f39498f.getClass();
        float f14 = (i12 & 64) != 0 ? 1.0f : f13;
        f39490B1.getClass();
        dVar.T1(j12, j13, j14, f12, f14, a.f39492b);
    }

    void B1(@Y61.k ArrayList arrayList, long j12, float f12, int i12, int i13);

    void E1(long j12, long j13, long j14, float f12, int i12, @Y61.l I0 i02, int i13);

    void I0(@Y61.k Path path, long j12, @InterfaceC42167x float f12, @Y61.k j jVar, int i12);

    void L1(long j12, float f12, long j13, @InterfaceC42167x float f13, @Y61.k j jVar, int i12);

    default void P0(@Y61.k InterfaceC22280q0 interfaceC22280q0, long j12, long j13, long j14, long j15, @InterfaceC42167x float f12, @Y61.k j jVar, @Y61.l U u12, int i12, int i13) {
        X0(this, interfaceC22280q0, j12, j13, j14, j15, f12, jVar, u12, i12, 0, 512);
    }

    void P1(long j12, long j13, long j14, @InterfaceC42167x float f12, @Y61.k j jVar, @Y61.l U u12, int i12);

    default void S(long j12, @Y61.k Y41.l lVar, @Y61.k C22267c c22267c) {
        c22267c.e(this, getLayoutDirection(), j12, new c(lVar));
    }

    void T1(@Y61.k J j12, long j13, long j14, float f12, @InterfaceC42167x float f13, int i12);

    void V0(@Y61.k InterfaceC22280q0 interfaceC22280q0, @Y61.k j jVar, @Y61.l F f12, int i12);

    void V1(long j12, float f12, float f13, long j13, long j14, @InterfaceC42167x float f14, @Y61.k j jVar, int i12);

    void Y(@Y61.k J j12, long j13, long j14, long j15, @InterfaceC42167x float f12, @Y61.k j jVar, int i12);

    @Y61.k
    LayoutDirection getLayoutDirection();

    default long i() {
        return getF39478c().e();
    }

    @Y61.k
    /* renamed from: j0 */
    a.b getF39478c();

    void o1(@Y61.k J j12, long j13, long j14, @InterfaceC42167x float f12, @Y61.k j jVar, @Y61.l U u12, int i12);

    void s0(long j12, long j13, long j14, long j15, @Y61.k j jVar, @InterfaceC42167x float f12, int i12);

    default long v1() {
        return l0.o.b(getF39478c().e());
    }

    void x0(@Y61.k Path path, @Y61.k J j12, @InterfaceC42167x float f12, @Y61.k j jVar, int i12);
}
