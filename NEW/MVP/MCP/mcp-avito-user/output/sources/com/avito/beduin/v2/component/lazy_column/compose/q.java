package com.avito.beduin.v2.component.lazy_column.compose;

import androidx.compose.foundation.lazy.A0;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import com.avito.beduin.v2.component.lazy_column.state.a;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyColumnComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q {

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.q<com.avito.beduin.v2.component.lazy_column.state.a, A, Integer, w0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f335960l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final w0 invoke(com.avito.beduin.v2.component.lazy_column.state.a aVar, A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-152058246);
            w0 w0VarA = A0.a(0, 0, 3, a13);
            a13.h();
            return w0VarA;
        }
    }

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "it", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.render.compose.n f335961l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.beduin.v2.render.compose.n nVar) {
            super(1);
            this.f335961l = nVar;
        }

        @Override // Y41.l
        public final com.avito.beduin.v2.render.compose.n invoke(com.avito.beduin.v2.render.compose.m mVar) {
            return this.f335961l;
        }
    }

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.render.compose.n f335962l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335963m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f335964n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335965o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f335966p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.avito.beduin.v2.render.compose.n nVar, InterfaceC36249i interfaceC36249i, Y41.q<? super com.avito.beduin.v2.component.lazy_column.state.a, ? super A, ? super Integer, w0> qVar, int i12, int i13) {
            super(2);
            this.f335962l = nVar;
            this.f335963m = interfaceC36249i;
            this.f335964n = (N) qVar;
            this.f335965o = i12;
            this.f335966p = i13;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f335965o | 1);
            ?? r22 = this.f335964n;
            com.avito.beduin.v2.render.compose.n nVar = this.f335962l;
            q.a(nVar, this.f335963m, r22, a12, iA2, this.f335966p);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyColumnComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.lazy_column.state.a f335967l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f335968m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f335969n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.beduin.v2.component.lazy_column.state.a aVar, boolean z12, boolean z13) {
            super(1);
            this.f335967l = aVar;
            this.f335968m = z12;
            this.f335969n = z13;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            m0 m0Var2 = m0Var;
            ET0.a<a.C10406a> aVar = this.f335967l.f335987a;
            r rVar = r.f335974l;
            m0Var2.a(aVar.f4014b.size(), rVar != null ? new u(rVar, aVar) : null, new v(s.f335975l, aVar), new C22096n(-632812321, new w(aVar, this.f335968m, this.f335969n), true));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.render.compose.n f335970l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335971m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f335972n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335973o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(int i12, Y41.q qVar, InterfaceC36249i interfaceC36249i, com.avito.beduin.v2.render.compose.n nVar) {
            super(2);
            this.f335970l = nVar;
            this.f335971m = interfaceC36249i;
            this.f335972n = (N) qVar;
            this.f335973o = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            q.b(C22066f2.a(this.f335973o | 1), this.f335972n, a12, this.f335971m, this.f335970l);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.beduin.v2.render.compose.n r9, @Y61.k com.avito.beduin.v2.engine.component.InterfaceC36249i r10, @Y61.l Y41.q<? super com.avito.beduin.v2.component.lazy_column.state.a, ? super androidx.compose.runtime.A, ? super java.lang.Integer, androidx.compose.foundation.lazy.w0> r11, @Y61.l androidx.compose.runtime.A r12, int r13, int r14) {
        /*
            r0 = -987969237(0xffffffffc51cc92b, float:-2508.573)
            androidx.compose.runtime.B r12 = r12.E(r0)
            r0 = r13 & 14
            if (r0 != 0) goto L16
            boolean r0 = r12.B(r9)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r13
            goto L17
        L16:
            r0 = r13
        L17:
            r1 = r13 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L27
            boolean r1 = r12.B(r10)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r13 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L3b
            r1 = r14 & 4
            if (r1 != 0) goto L38
            boolean r1 = r12.u(r11)
            if (r1 == 0) goto L38
            r1 = 256(0x100, float:3.59E-43)
            goto L3a
        L38:
            r1 = 128(0x80, float:1.8E-43)
        L3a:
            r0 = r0 | r1
        L3b:
            r1 = r0 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L4d
            boolean r1 = r12.c()
            if (r1 != 0) goto L48
            goto L4d
        L48:
            r12.f()
        L4b:
            r6 = r11
            goto L99
        L4d:
            r12.y0()
            r1 = r13 & 1
            if (r1 == 0) goto L65
            boolean r1 = r12.g0()
            if (r1 == 0) goto L5b
            goto L65
        L5b:
            r12.f()
            r1 = r14 & 4
            if (r1 == 0) goto L6c
        L62:
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L6c
        L65:
            r1 = r14 & 4
            if (r1 == 0) goto L6c
            com.avito.beduin.v2.component.lazy_column.compose.q$a r11 = com.avito.beduin.v2.component.lazy_column.compose.q.a.f335960l
            goto L62
        L6c:
            r12.Y()
            boolean r1 = r9.f338093d
            r2 = 0
            if (r1 == 0) goto L8a
            r0 = 1906633452(0x71a4eaec, float:1.6332654E30)
            r12.C(r0)
            com.avito.beduin.v2.component.lazy_column.compose.q$b r0 = new com.avito.beduin.v2.component.lazy_column.compose.q$b
            r0.<init>(r9)
            java.lang.String r1 = r10.getF336566c()
            com.avito.beduin.v2.render.compose.p.a(r0, r1, r12, r2)
            r12.X(r2)
            goto L4b
        L8a:
            r1 = 1906814740(0x71a7af14, float:1.6606609E30)
            r12.C(r1)
            r0 = r0 & 1022(0x3fe, float:1.432E-42)
            b(r0, r11, r12, r10, r9)
            r12.X(r2)
            goto L4b
        L99:
            androidx.compose.runtime.c2 r11 = r12.Z()
            if (r11 == 0) goto Lab
            com.avito.beduin.v2.component.lazy_column.compose.q$c r12 = new com.avito.beduin.v2.component.lazy_column.compose.q$c
            r3 = r12
            r4 = r9
            r5 = r10
            r7 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r11.f38184d = r12
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.lazy_column.compose.q.a(com.avito.beduin.v2.render.compose.n, com.avito.beduin.v2.engine.component.i, Y41.q, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r23, Y41.q r24, androidx.compose.runtime.A r25, com.avito.beduin.v2.engine.component.InterfaceC36249i r26, com.avito.beduin.v2.render.compose.n r27) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.lazy_column.compose.q.b(int, Y41.q, androidx.compose.runtime.A, com.avito.beduin.v2.engine.component.i, com.avito.beduin.v2.render.compose.n):void");
    }
}
