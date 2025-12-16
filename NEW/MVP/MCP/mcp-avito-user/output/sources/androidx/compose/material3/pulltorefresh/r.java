package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.C20283h;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.Q;
import androidx.compose.foundation.C20835r0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import d0.C39465n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PullToRefresh.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "targetAlpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final float f37101a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f37102b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f37103c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f37104d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f37105e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f37106f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final G1<Float> f37107g;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f37101a = (float) 2.5d;
        f37102b = (float) 5.5d;
        f37103c = 16;
        f37104d = 40;
        C39465n.f393463a.getClass();
        C39465n c39465n = C39465n.f393463a;
        f37105e = 10;
        f37106f = 5;
        f37107g = C20310q.e(300, 0, Q.f26124d, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, int] */
    public static final void a(Y41.a aVar, long j12, A a12, int i12) {
        int i13;
        ?? r102;
        B b12;
        B b13;
        B bE2 = a12.E(-569718810);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && bE2.c()) {
            bE2.f();
            b13 = bE2;
        } else {
            bE2.I(-656076138);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            Object obj = objT;
            if (objT == c1651a) {
                C22277p c22277pA = C22315w.a();
                J0.f39288b.getClass();
                c22277pA.l(J0.f39289c);
                bE2.H(c22277pA);
                obj = c22277pA;
            }
            Path path = (Path) obj;
            bE2.X(false);
            bE2.I(-656075976);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = C22126m3.d(new j(aVar));
                bE2.H(objT2);
            }
            bE2.X(false);
            I3 i3B = C20283h.b(((Number) ((I3) objT2).getF42167b()).floatValue(), f37107g, null, bE2, 48, 28);
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            bE2.I(-656075714);
            int i14 = i13 & 14;
            boolean z12 = i14 == 4;
            Object objT3 = bE2.t();
            if (z12 || objT3 == c1651a) {
                objT3 = new g(aVar);
                bE2.H(objT3);
            }
            bE2.X(false);
            androidx.compose.ui.v vVarO = C20588k2.o(androidx.compose.ui.semantics.r.b(aVar2, true, (Y41.l) objT3), f37103c);
            bE2.I(-656075558);
            boolean zB2 = (i14 == 4) | bE2.B(i3B) | ((i13 & 112) == 32) | bE2.u(path);
            Object objT4 = bE2.t();
            if (zB2 || objT4 == c1651a) {
                r102 = 0;
                B b14 = bE2;
                h hVar = new h(aVar, i3B, j12, path);
                b14.H(hVar);
                objT4 = hVar;
                b12 = b14;
            } else {
                r102 = 0;
                b12 = bE2;
            }
            b12.X(r102);
            C20835r0.a(r102, (Y41.l) objT4, b12, vVarO);
            b13 = b12;
        }
        C22039c2 c22039c2Z = b13.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(aVar, j12, i12);
        }
    }
}
