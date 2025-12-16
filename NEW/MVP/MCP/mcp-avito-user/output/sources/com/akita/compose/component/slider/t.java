package com.akita.compose.component.slider;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SliderThumb.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"slider_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t {

    /* compiled from: SliderThumb.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f62764l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f62765m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f62766n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f62767o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f62768p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f62769q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.foundation.interaction.m mVar, androidx.compose.ui.v vVar, long j12, float f12, int i12, int i13) {
            super(2);
            this.f62764l = mVar;
            this.f62765m = vVar;
            this.f62766n = j12;
            this.f62767o = f12;
            this.f62768p = i12;
            this.f62769q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f62768p | 1);
            androidx.compose.ui.v vVar = this.f62765m;
            t.a(this.f62764l, vVar, this.f62766n, this.f62767o, a12, iA2, this.f62769q);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.foundation.interaction.m r12, @Y61.l androidx.compose.ui.v r13, long r14, float r16, @Y61.l androidx.compose.runtime.A r17, int r18, int r19) {
        /*
            r1 = r12
            r6 = r18
            r0 = 4
            r2 = 1006483722(0x3bfdb90a, float:0.0077430056)
            r3 = r17
            androidx.compose.runtime.B r2 = r3.E(r2)
            r3 = r6 & 14
            if (r3 != 0) goto L1c
            boolean r3 = r2.B(r12)
            if (r3 == 0) goto L19
            r3 = r0
            goto L1a
        L19:
            r3 = 2
        L1a:
            r3 = r3 | r6
            goto L1d
        L1c:
            r3 = r6
        L1d:
            r4 = r3 | 48
            r5 = r19 & 4
            if (r5 == 0) goto L27
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            r7 = r14
            goto L34
        L27:
            r7 = r14
            boolean r3 = r2.n(r14)
            if (r3 == 0) goto L31
            r3 = 256(0x100, float:3.59E-43)
            goto L33
        L31:
            r3 = 128(0x80, float:1.8E-43)
        L33:
            r3 = r3 | r4
        L34:
            r4 = r19 & 8
            if (r4 == 0) goto L3d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L3a:
            r9 = r16
            goto L4f
        L3d:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L3a
            r9 = r16
            boolean r10 = r2.k(r9)
            if (r10 == 0) goto L4c
            r10 = 2048(0x800, float:2.87E-42)
            goto L4e
        L4c:
            r10 = 1024(0x400, float:1.435E-42)
        L4e:
            r3 = r3 | r10
        L4f:
            r3 = r3 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r3 != r10) goto L62
            boolean r3 = r2.c()
            if (r3 != 0) goto L5c
            goto L62
        L5c:
            r2.f()
            r3 = r13
        L60:
            r5 = r9
            goto L92
        L62:
            androidx.compose.ui.v$a r3 = androidx.compose.ui.v.f42878y1
            if (r5 == 0) goto L6d
            androidx.compose.ui.graphics.T$a r5 = androidx.compose.ui.graphics.T.f39320b
            r5.getClass()
            long r7 = androidx.compose.ui.graphics.T.f39321c
        L6d:
            if (r4 == 0) goto L75
            r4 = 16
            float r4 = (float) r4
            androidx.compose.ui.unit.h$a r5 = androidx.compose.ui.unit.h.f42849c
            r9 = r4
        L75:
            androidx.compose.ui.v r4 = androidx.compose.foundation.layout.C20588k2.o(r3, r9)
            r5 = 0
            r10 = 0
            androidx.compose.foundation.v1 r0 = com.akita.compose.foundation.n.d(r9, r0, r10, r5)
            androidx.compose.ui.v r0 = androidx.compose.foundation.C20839s1.a(r4, r12, r0)
            androidx.compose.ui.v r0 = androidx.compose.foundation.C20539l1.a(r0, r12)
            androidx.compose.foundation.shape.n r4 = androidx.compose.foundation.shape.o.f30153a
            androidx.compose.ui.v r0 = androidx.compose.foundation.A.b(r0, r7, r4)
            androidx.compose.foundation.layout.C20608p2.a(r2, r0)
            goto L60
        L92:
            androidx.compose.runtime.c2 r9 = r2.Z()
            if (r9 == 0) goto La7
            com.akita.compose.component.slider.t$a r10 = new com.akita.compose.component.slider.t$a
            r0 = r10
            r1 = r12
            r2 = r3
            r3 = r7
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r9.f38184d = r10
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.slider.t.a(androidx.compose.foundation.interaction.m, androidx.compose.ui.v, long, float, androidx.compose.runtime.A, int, int):void");
    }
}
