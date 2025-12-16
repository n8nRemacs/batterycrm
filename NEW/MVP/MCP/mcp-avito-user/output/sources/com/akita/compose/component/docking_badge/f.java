package com.akita.compose.component.docking_badge;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DockingBadgeRow.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"docking-badge_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {

    /* compiled from: DockingBadgeRow.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<Z0, C22712b, InterfaceC22367j0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f61530l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ h f61531m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f61532n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, h hVar, int i12) {
            super(2);
            this.f61530l = f12;
            this.f61531m = hVar;
            this.f61532n = i12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x016e A[SYNTHETIC] */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.layout.InterfaceC22367j0 invoke(androidx.compose.ui.layout.Z0 r27, androidx.compose.ui.unit.C22712b r28) {
            /*
                Method dump skipped, instructions count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.docking_badge.f.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DockingBadgeRow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f61533l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f61534m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f61535n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f61536o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f61537p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f61538q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(v vVar, int i12, float f12, Y41.l<? super g, G0> lVar, int i13, int i14) {
            super(2);
            this.f61533l = vVar;
            this.f61534m = i12;
            this.f61535n = f12;
            this.f61536o = (N) lVar;
            this.f61537p = i13;
            this.f61538q = i14;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f61537p | 1);
            ?? r32 = this.f61536o;
            int i12 = this.f61534m;
            f.a(this.f61533l, i12, this.f61535n, r32, a12, iA2, this.f61538q);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l androidx.compose.ui.v r10, int r11, float r12, @Y61.k Y41.l<? super com.akita.compose.component.docking_badge.g, kotlin.G0> r13, @Y61.l androidx.compose.runtime.A r14, int r15, int r16) {
        /*
            r4 = r13
            r0 = 2
            r1 = -1485403924(0xffffffffa77688ec, float:-3.4213584E-15)
            r2 = r14
            androidx.compose.runtime.B r1 = r14.E(r1)
            r2 = r16 & 2
            if (r2 == 0) goto L13
            r3 = r15 | 48
            r5 = r3
            r3 = r11
            goto L27
        L13:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L25
            r3 = r11
            boolean r5 = r1.m(r11)
            if (r5 == 0) goto L21
            r5 = 32
            goto L23
        L21:
            r5 = 16
        L23:
            r5 = r5 | r15
            goto L27
        L25:
            r3 = r11
            r5 = r15
        L27:
            r5 = r5 | 384(0x180, float:5.38E-43)
            boolean r6 = r1.u(r13)
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L33
            r6 = r7
            goto L35
        L33:
            r6 = 1024(0x400, float:1.435E-42)
        L35:
            r5 = r5 | r6
            r6 = r5 & 5851(0x16db, float:8.199E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r6 != r8) goto L4a
            boolean r6 = r1.c()
            if (r6 != 0) goto L43
            goto L4a
        L43:
            r1.f()
            r7 = r10
            r2 = r3
            r3 = r12
            goto L8b
        L4a:
            if (r2 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r3
        L4e:
            r2 = 3
            float r2 = (float) r2
            androidx.compose.ui.unit.h$a r3 = androidx.compose.ui.unit.h.f42849c
            r3 = -801157788(0xffffffffd03f4d64, float:-1.283808E10)
            r1.C(r3)
            r3 = r5 & 7168(0x1c00, float:1.0045E-41)
            r5 = 0
            if (r3 != r7) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = r5
        L60:
            java.lang.Object r6 = r1.t()
            if (r3 != 0) goto L6f
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r3) goto L7a
        L6f:
            com.akita.compose.component.docking_badge.h r6 = new com.akita.compose.component.docking_badge.h
            r6.<init>()
            r13.invoke(r6)
            r1.H(r6)
        L7a:
            com.akita.compose.component.docking_badge.h r6 = (com.akita.compose.component.docking_badge.h) r6
            r1.X(r5)
            com.akita.compose.component.docking_badge.f$a r3 = new com.akita.compose.component.docking_badge.f$a
            r3.<init>(r2, r6, r0)
            r6 = 6
            r7 = r10
            androidx.compose.ui.layout.V0.a(r10, r3, r1, r6, r5)
            r3 = r2
            r2 = r0
        L8b:
            androidx.compose.runtime.c2 r8 = r1.Z()
            if (r8 == 0) goto L9e
            com.akita.compose.component.docking_badge.f$b r9 = new com.akita.compose.component.docking_badge.f$b
            r0 = r9
            r1 = r10
            r4 = r13
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f38184d = r9
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.docking_badge.f.a(androidx.compose.ui.v, int, float, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}
