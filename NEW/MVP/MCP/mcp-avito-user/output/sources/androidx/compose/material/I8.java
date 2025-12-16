package androidx.compose.material;

import androidx.compose.foundation.C20539l1;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Slider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I8 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32762a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32763b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f32764c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f32765d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f32766e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.v f32767f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.G1<Float> f32768g;

    /* compiled from: Slider.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f32769l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f32770m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f32771n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f32772o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f32773p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f32774q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ List<Float> f32775r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f32776s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f32777t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i32, float f13, float f14, float f15, androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i33, List<Float> list, androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i34, androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i35) {
            super(1);
            this.f32769l = f12;
            this.f32770m = i32;
            this.f32771n = f13;
            this.f32772o = f14;
            this.f32773p = f15;
            this.f32774q = i33;
            this.f32775r = list;
            this.f32776s = i34;
            this.f32777t = i35;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            boolean z12 = gVar2.getLayoutDirection() == LayoutDirection.f42839c;
            float fH2 = l0.g.h(gVar2.v1());
            float f12 = this.f32769l;
            long jA2 = l0.h.a(f12, fH2);
            long jA3 = l0.h.a(l0.n.e(gVar2.i()) - f12, l0.g.h(gVar2.v1()));
            long j12 = z12 ? jA3 : jA2;
            long j13 = z12 ? jA2 : jA3;
            long j14 = this.f32770m.getF42167b().f39331a;
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            int i12 = androidx.compose.ui.graphics.m1.f39699c;
            long j15 = j13;
            long j16 = j12;
            androidx.compose.ui.graphics.drawscope.g.G0(gVar2, j14, j12, j13, this.f32771n, i12, null, 0, 480);
            float fG2 = l0.g.g(j16);
            float fG3 = l0.g.g(j15) - l0.g.g(j16);
            float f13 = this.f32772o;
            long jA4 = l0.h.a((fG3 * f13) + fG2, l0.g.h(gVar2.v1()));
            float fG4 = l0.g.g(j16);
            float fG5 = l0.g.g(j15) - l0.g.g(j16);
            float f14 = this.f32773p;
            androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f32774q.getF42167b().f39331a, l0.h.a((fG5 * f14) + fG4, l0.g.h(gVar2.v1())), jA4, this.f32771n, i12, null, 0, 480);
            List<Float> list = this.f32775r;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                float fFloatValue = ((Number) obj).floatValue();
                Boolean boolValueOf = Boolean.valueOf(fFloatValue > f13 || fFloatValue < f14);
                Object arrayList = linkedHashMap.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                List list2 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size = list2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList2.add(l0.g.a(l0.h.a(l0.g.g(l0.h.b(j16, j15, ((Number) list2.get(i13)).floatValue())), l0.g.h(gVar2.v1()))));
                }
                long j17 = j15;
                long j18 = j16;
                androidx.compose.ui.graphics.U0.f39334b.getClass();
                long j19 = (zBooleanValue ? this.f32776s : this.f32777t).getF42167b().f39331a;
                androidx.compose.ui.graphics.m1.f39698b.getClass();
                int i14 = androidx.compose.ui.graphics.m1.f39699c;
                androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
                gVar2.B1(arrayList2, j19, this.f32771n, i14, g.a.f39492b);
                j16 = j18;
                j15 = j17;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f32778l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21184g8 f32779m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f32780n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f32781o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f32782p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List<Float> f32783q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ float f32784r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f32785s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f32786t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.v vVar, InterfaceC21184g8 interfaceC21184g8, boolean z12, float f12, float f13, List<Float> list, float f14, float f15, int i12) {
            super(2);
            this.f32778l = vVar;
            this.f32779m = interfaceC21184g8;
            this.f32780n = z12;
            this.f32781o = f12;
            this.f32782p = f13;
            this.f32783q = list;
            this.f32784r = f14;
            this.f32785s = f15;
            this.f32786t = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f32786t | 1);
            float f12 = this.f32784r;
            float f13 = this.f32785s;
            I8.b(this.f32778l, this.f32779m, this.f32780n, this.f32781o, this.f32782p, this.f32783q, f12, f13, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f32762a = 10;
        f32763b = 24;
        f32764c = 1;
        f32765d = 6;
        f32766e = 4;
        f32767f = C20588k2.h(0.0f, 48, 1, C20588k2.v(144, 0.0f, 2, androidx.compose.ui.v.f42878y1));
        f32768g = new androidx.compose.animation.core.G1<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(C20644z c20644z, androidx.compose.ui.v vVar, float f12, androidx.compose.foundation.interaction.m mVar, InterfaceC21184g8 interfaceC21184g8, boolean z12, float f13, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(428907178);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(c20644z) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.k(f12) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.B(mVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.B(interfaceC21184g8) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.j(z12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & i12) == 0) {
            i13 |= bE2.k(f13) ? 1048576 : 524288;
        }
        if (bE2.p(i13 & 1, (599187 & i13) != 599186)) {
            androidx.compose.ui.v vVarM = androidx.compose.foundation.layout.R1.m(androidx.compose.ui.v.f42878y1, f12, 0.0f, 0.0f, 0.0f, 14);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.v vVarD = c20644z.d(vVarM, InterfaceC22215f.a.f39079e);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z2 = C20644z.f28804a;
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new androidx.compose.runtime.snapshots.D();
                bE2.H(objT);
            }
            androidx.compose.runtime.snapshots.D d12 = (androidx.compose.runtime.snapshots.D) objT;
            boolean z13 = (i13 & 7168) == 2048;
            Object objT2 = bE2.t();
            if (z13 || objT2 == c1651a) {
                objT2 = new G8(mVar, d12, null);
                bE2.H(objT2);
            }
            C22187u0.d((Y41.p) objT2, bE2, mVar);
            float f14 = !d12.isEmpty() ? f32765d : f32764c;
            androidx.compose.ui.v vVarA = C20539l1.a(C20839s1.a(C20588k2.q(vVar, f13, f13), mVar, B7.a(f32763b, 4, 0L, false)), mVar);
            if (!z12) {
                f14 = 0;
            }
            androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
            C20608p2.a(bE2, androidx.compose.foundation.A.b(androidx.compose.ui.draw.y.a(vVarA, f14, nVar, false, 24), ((androidx.compose.ui.graphics.T) interfaceC21184g8.c(z12, bE2).getF42167b()).f39331a, nVar));
            bE2.X(true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new H8(c20644z, vVar, f12, mVar, interfaceC21184g8, z12, f13, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.v r20, androidx.compose.material.InterfaceC21184g8 r21, boolean r22, float r23, float r24, java.util.List<java.lang.Float> r25, float r26, float r27, androidx.compose.runtime.A r28, int r29) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.I8.b(androidx.compose.ui.v, androidx.compose.material.g8, boolean, float, float, java.util.List, float, float, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.InterfaceC22325c r8, long r9, int r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.K8
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material.K8 r0 = (androidx.compose.material.K8) r0
            int r1 = r0.f32844s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f32844s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material.K8 r0 = new androidx.compose.material.K8
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f32843r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f32844s
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.jvm.internal.l0$e r8 = r6.f32842q
            kotlin.C42729a0.b(r12)
            goto L53
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            kotlin.jvm.internal.l0$e r12 = new kotlin.jvm.internal.l0$e
            r12.<init>()
            androidx.compose.material.L8 r5 = new androidx.compose.material.L8
            r5.<init>(r12)
            r6.f32842q = r12
            r6.f32844s = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.C21140d3.a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L50
            goto L66
        L50:
            r7 = r12
            r12 = r8
            r8 = r7
        L53:
            androidx.compose.ui.input.pointer.C r12 = (androidx.compose.ui.input.pointer.C) r12
            if (r12 == 0) goto L64
            float r8 = r8.f406839b
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
            kotlin.Q r9 = new kotlin.Q
            r9.<init>(r12, r8)
            r0 = r9
            goto L66
        L64:
            r8 = 0
            r0 = r8
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.I8.c(androidx.compose.ui.input.pointer.c, long, int, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final float d(float f12, List list, float f13, float f14) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fAbs = Math.abs(E0.e.b(f13, f14, ((Number) obj2).floatValue()) - f12);
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Object obj3 = list.get(i12);
                    float fAbs2 = Math.abs(E0.e.b(f13, f14, ((Number) obj3).floatValue()) - f12);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        obj2 = obj3;
                        fAbs = fAbs2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
            obj = obj2;
        }
        Float f15 = (Float) obj;
        return f15 != null ? E0.e.b(f13, f14, f15.floatValue()) : f12;
    }

    public static final float e(float f12, float f13, float f14, float f15, float f16) {
        float f17 = f13 - f12;
        float f18 = f17 == 0.0f ? 0.0f : (f14 - f12) / f17;
        float f19 = f18 >= 0.0f ? f18 : 0.0f;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        return E0.e.b(f15, f16, f19);
    }
}
