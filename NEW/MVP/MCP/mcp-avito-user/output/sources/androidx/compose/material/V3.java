package androidx.compose.material;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Drawer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33270a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f33271b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f33272c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.G1<Float> f33273d;

    static {
        float f12 = 56;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33270a = f12;
        f33271b = f12;
        f33272c = Constants.MINIMAL_ERROR_STATUS_CODE;
        f33273d = new androidx.compose.animation.core.G1<>(256, 0, null, 6, null);
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k Y41.q qVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l W3 w32, boolean z12, @Y61.l androidx.compose.foundation.shape.e eVar, float f12, long j12, long j13, long j14, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1305806945);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(qVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(w32) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.j(z12) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.B(eVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.k(f12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & i12) == 0) {
            i13 |= bE2.n(j12) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= bE2.n(j13) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= bE2.n(j14) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? 536870912 : 268435456;
        }
        if (bE2.p(i13 & 1, (i13 & 306783379) != 306783378)) {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            androidx.compose.foundation.layout.E.a(vVar.d0(C20588k2.f28682c), null, false, androidx.compose.runtime.internal.r.c(816674999, new K3(w32, z12, (kotlinx.coroutines.T) objT, j14, eVar, j12, j13, f12, c22096n, qVar), bE2), bE2, 3072, 6);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new L3(qVar, vVar, w32, z12, eVar, f12, j12, j13, j14, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r17, Y41.a r18, Y41.a r19, long r20, androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.V3.b(boolean, Y41.a, Y41.a, long, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.material.W3 c(@Y61.l androidx.compose.runtime.A r8) {
        /*
            androidx.compose.material.DrawerValue r0 = androidx.compose.material.DrawerValue.f32548b
            androidx.compose.material.T3 r0 = androidx.compose.material.T3.f33207l
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            androidx.compose.material.W3$b r1 = androidx.compose.material.W3.f33299c
            r1.getClass()
            androidx.compose.material.X3 r1 = androidx.compose.material.X3.f33349l
            androidx.compose.material.Y3 r3 = new androidx.compose.material.Y3
            r3.<init>(r0)
            androidx.compose.runtime.saveable.w r4 = androidx.compose.runtime.saveable.v.f38606a
            androidx.compose.runtime.saveable.w r4 = new androidx.compose.runtime.saveable.w
            r4.<init>(r3, r1)
            boolean r1 = r8.B(r0)
            java.lang.Object r3 = r8.t()
            if (r1 != 0) goto L2d
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r1) goto L35
        L2d:
            androidx.compose.material.U3 r3 = new androidx.compose.material.U3
            r3.<init>(r0)
            r8.H(r3)
        L35:
            r0 = r3
            Y41.a r0 = (Y41.a) r0
            r6 = 0
            r7 = 4
            r3 = r4
            r4 = r0
            r5 = r8
            java.lang.Object r8 = androidx.compose.runtime.saveable.j.c(r2, r3, r4, r5, r6, r7)
            androidx.compose.material.W3 r8 = (androidx.compose.material.W3) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.V3.c(androidx.compose.runtime.A):androidx.compose.material.W3");
    }
}
