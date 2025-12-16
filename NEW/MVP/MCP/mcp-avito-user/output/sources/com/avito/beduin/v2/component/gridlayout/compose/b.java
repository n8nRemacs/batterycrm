package com.avito.beduin.v2.component.gridlayout.compose;

import Y41.l;
import Y41.p;
import Y41.q;
import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.foundation.lazy.grid.M0;
import androidx.compose.foundation.lazy.grid.y0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GridColumnComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: GridColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements q<com.avito.beduin.v2.component.gridlayout.state.c, A, Integer, I0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f335802l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final I0 invoke(com.avito.beduin.v2.component.gridlayout.state.c cVar, A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-661453529);
            I0 i0A = M0.a(0, 3, a13);
            a13.h();
            return i0A;
        }
    }

    /* compiled from: GridColumnComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "it", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.component.gridlayout.compose.b$b, reason: collision with other inner class name */
    public static final class C10398b extends N implements l<m, n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f335803l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10398b(n nVar) {
            super(1);
            this.f335803l = nVar;
        }

        @Override // Y41.l
        public final n invoke(m mVar) {
            return this.f335803l;
        }
    }

    /* compiled from: GridColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335804l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f335805m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f335806n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335807o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f335808p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC36249i interfaceC36249i, l<? super m, n> lVar, q<? super com.avito.beduin.v2.component.gridlayout.state.c, ? super A, ? super Integer, I0> qVar, int i12, int i13) {
            super(2);
            this.f335804l = interfaceC36249i;
            this.f335805m = lVar;
            this.f335806n = (N) qVar;
            this.f335807o = i12;
            this.f335808p = i13;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f335807o | 1);
            ?? r22 = this.f335806n;
            InterfaceC36249i interfaceC36249i = this.f335804l;
            b.a(interfaceC36249i, this.f335805m, r22, a12, iA2, this.f335808p);
            return G0.f406611a;
        }
    }

    /* compiled from: GridColumnComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f335809l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f335809l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f335809l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: GridColumnComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<y0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.gridlayout.state.c f335810l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.beduin.v2.component.gridlayout.state.c cVar) {
            super(1);
            this.f335810l = cVar;
        }

        @Override // Y41.l
        public final G0 invoke(y0 y0Var) {
            i.b(y0Var, this.f335810l.f335846g);
            return G0.f406611a;
        }
    }

    /* compiled from: GridColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335811l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f335812m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f335813n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335814o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i12, q qVar, InterfaceC36249i interfaceC36249i, n nVar) {
            super(2);
            this.f335811l = interfaceC36249i;
            this.f335812m = nVar;
            this.f335813n = (N) qVar;
            this.f335814o = i12;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f335814o | 1);
            n nVar = this.f335812m;
            b.b(iA2, this.f335813n, a12, this.f335811l, nVar);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.beduin.v2.engine.component.InterfaceC36249i r10, @Y61.k Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> r11, @Y61.l Y41.q<? super com.avito.beduin.v2.component.gridlayout.state.c, ? super androidx.compose.runtime.A, ? super java.lang.Integer, androidx.compose.foundation.lazy.grid.I0> r12, @Y61.l androidx.compose.runtime.A r13, int r14, int r15) {
        /*
            r0 = -26584004(0xfffffffffe6a5c3c, float:-7.7879565E37)
            androidx.compose.runtime.B r13 = r13.E(r0)
            r0 = r14 & 14
            if (r0 != 0) goto L16
            boolean r0 = r13.B(r10)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r14
            goto L17
        L16:
            r0 = r14
        L17:
            r1 = r14 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L27
            boolean r1 = r13.u(r11)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r14 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L3b
            r1 = r15 & 4
            if (r1 != 0) goto L38
            boolean r1 = r13.u(r12)
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
            boolean r1 = r13.c()
            if (r1 != 0) goto L48
            goto L4d
        L48:
            r13.f()
        L4b:
            r7 = r12
            goto La1
        L4d:
            r13.y0()
            r1 = r14 & 1
            if (r1 == 0) goto L65
            boolean r1 = r13.g0()
            if (r1 == 0) goto L5b
            goto L65
        L5b:
            r13.f()
            r1 = r15 & 4
            if (r1 == 0) goto L6c
        L62:
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L6c
        L65:
            r1 = r15 & 4
            if (r1 == 0) goto L6c
            com.avito.beduin.v2.component.gridlayout.compose.b$a r12 = com.avito.beduin.v2.component.gridlayout.compose.b.a.f335802l
            goto L62
        L6c:
            r13.Y()
            int r1 = r0 >> 3
            r1 = r1 & 14
            com.avito.beduin.v2.render.compose.n r1 = com.avito.beduin.v2.render.compose.o.a(r11, r13, r1)
            boolean r2 = r1.f338093d
            r3 = 0
            if (r2 == 0) goto L92
            r0 = -1349469914(0xffffffffaf90b926, float:-2.6325003E-10)
            r13.C(r0)
            com.avito.beduin.v2.component.gridlayout.compose.b$b r0 = new com.avito.beduin.v2.component.gridlayout.compose.b$b
            r0.<init>(r1)
            java.lang.String r1 = r10.getF336566c()
            com.avito.beduin.v2.render.compose.p.a(r0, r1, r13, r3)
            r13.X(r3)
            goto L4b
        L92:
            r2 = -1349297833(0xffffffffaf935957, float:-2.6802624E-10)
            r13.C(r2)
            r0 = r0 & 910(0x38e, float:1.275E-42)
            b(r0, r12, r13, r10, r1)
            r13.X(r3)
            goto L4b
        La1:
            androidx.compose.runtime.c2 r12 = r13.Z()
            if (r12 == 0) goto Lb3
            com.avito.beduin.v2.component.gridlayout.compose.b$c r13 = new com.avito.beduin.v2.component.gridlayout.compose.b$c
            r4 = r13
            r5 = r10
            r6 = r11
            r8 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            r12.f38184d = r13
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.gridlayout.compose.b.a(com.avito.beduin.v2.engine.component.i, Y41.l, Y41.q, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r24, Y41.q r25, androidx.compose.runtime.A r26, com.avito.beduin.v2.engine.component.InterfaceC36249i r27, com.avito.beduin.v2.render.compose.n r28) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.gridlayout.compose.b.b(int, Y41.q, androidx.compose.runtime.A, com.avito.beduin.v2.engine.component.i, com.avito.beduin.v2.render.compose.n):void");
    }
}
