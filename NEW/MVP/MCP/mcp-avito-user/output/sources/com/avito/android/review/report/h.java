package com.avito.android.review.report;

import Y41.l;
import Y41.p;
import Y41.q;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import bn0.C25683a;
import cn0.AbstractC27228a;
import cn0.C27230c;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealReviewsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal-reviews_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    /* compiled from: ComfortableDealReviewsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<AbstractC27228a, G0> f255398l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super AbstractC27228a, G0> lVar) {
            super(0);
            this.f255398l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f255398l.invoke(AbstractC27228a.C2064a.f58136a);
            return G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealReviewsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<AbstractC27228a, G0> f255399l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super AbstractC27228a, G0> lVar) {
            super(2);
            this.f255399l = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r9, java.lang.Integer r10) {
            /*
                r8 = this;
                r5 = r9
                androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
                java.lang.Number r10 = (java.lang.Number) r10
                int r9 = r10.intValue()
                r9 = r9 & 11
                r10 = 2
                if (r9 != r10) goto L19
                boolean r9 = r5.c()
                if (r9 != 0) goto L15
                goto L19
            L15:
                r5.f()
                goto L66
            L19:
                androidx.compose.runtime.J3 r9 = com.akita.compose.component.navbar.v.f62301a
                java.lang.Object r9 = r5.o(r9)
                com.akita.compose.component.navbar.u r9 = (com.akita.compose.component.navbar.u) r9
                com.akita.compose.theme.re23.b r10 = com.akita.compose.theme.re23.b.f63983a
                r10.getClass()
                com.akita.compose.theme.re23.e r10 = com.akita.compose.theme.re23.b.f63985c
                r10.getClass()
                int r10 = com.akita.compose.theme.re23.e.f64233O
                r0 = 0
                r1 = 1791(0x6ff, float:2.51E-42)
                com.akita.compose.component.navbar.u r1 = com.akita.compose.component.navbar.u.a(r9, r0, r10, r1)
                r9 = 1786554418(0x6a7ca832, float:7.6360897E25)
                r5.C(r9)
                Y41.l<cn0.a, kotlin.G0> r9 = r8.f255399l
                boolean r10 = r5.B(r9)
                java.lang.Object r0 = r5.t()
                if (r10 != 0) goto L4f
                androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a
                r10.getClass()
                androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b
                if (r0 != r10) goto L57
            L4f:
                com.avito.android.review.report.i r0 = new com.avito.android.review.report.i
                r0.<init>(r9)
                r5.H(r0)
            L57:
                r3 = r0
                Y41.a r3 = (Y41.a) r3
                r5.h()
                r6 = 0
                r7 = 21
                r0 = 0
                r2 = 0
                r4 = 0
                com.akita.compose.component.navbar.t.b(r0, r1, r2, r3, r4, r5, r6, r7)
            L66:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.review.report.h.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ComfortableDealReviewsScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C27230c f255400l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C27230c c27230c) {
            super(3);
            this.f255400l = c27230c;
        }

        @Override // Y41.q
        public final G0 invoke(T1 t12, A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                C27230c c27230c = this.f255400l;
                h.b(c27230c.f58139b, c27230c.f58140c, a13, 64);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ComfortableDealReviewsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C27230c f255401l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<AbstractC27228a, G0> f255402m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C27230c c27230c, l<? super AbstractC27228a, G0> lVar, int i12) {
            super(2);
            this.f255401l = c27230c;
            this.f255402m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            h.a(this.f255401l, this.f255402m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k cn0.C27230c r12, @Y61.k Y41.l<? super cn0.AbstractC27228a, kotlin.G0> r13, @Y61.l androidx.compose.runtime.A r14, int r15) {
        /*
            r0 = 45462324(0x2b5b334, float:2.6698417E-37)
            androidx.compose.runtime.B r14 = r14.E(r0)
            r0 = 186476095(0xb1d663f, float:3.0314022E-32)
            r14.C(r0)
            boolean r0 = r14.B(r13)
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r14.t()
            if (r0 != 0) goto L22
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r0) goto L2a
        L22:
            com.avito.android.review.report.h$a r3 = new com.avito.android.review.report.h$a
            r3.<init>(r13)
            r14.H(r3)
        L2a:
            Y41.a r3 = (Y41.a) r3
            r14.X(r1)
            androidx.view.compose.h.a(r1, r3, r14, r1, r2)
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.a r0 = com.akita.compose.theme.re23.b.f63984b
            com.akita.compose.foundation.p r6 = r0.f63851H1
            com.avito.android.review.report.h$b r0 = new com.avito.android.review.report.h$b
            r0.<init>(r13)
            r1 = 1099628528(0x418afff0, float:17.37497)
            androidx.compose.runtime.internal.n r2 = androidx.compose.runtime.internal.r.c(r1, r0, r14)
            com.avito.android.review.report.h$c r0 = new com.avito.android.review.report.h$c
            r0.<init>(r12)
            r1 = -1194865017(0xffffffffb8c7ce87, float:-9.527528E-5)
            androidx.compose.runtime.internal.n r8 = androidx.compose.runtime.internal.r.c(r1, r0, r14)
            r5 = 0
            r7 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r10 = 12582960(0xc00030, float:1.7632483E-38)
            r11 = 93
            r9 = r14
            com.akita.compose.component.scaffold.g.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.runtime.c2 r14 = r14.Z()
            if (r14 == 0) goto L6e
            com.avito.android.review.report.h$d r0 = new com.avito.android.review.report.h$d
            r0.<init>(r12, r13, r15)
            r14.f38184d = r0
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.review.report.h.a(cn0.c, Y41.l, androidx.compose.runtime.A, int):void");
    }

    public static final void b(int i12, List list, A a12, int i13) {
        B bE2 = a12.E(-450107440);
        v.a aVar = v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        float f12 = 16;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        v vVarK = R1.k(f12, 0.0f, 2, fillElement);
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarK);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, interfaceC22365i0D);
        p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        v vVarD = C20644z.f28804a.d(a2.b(aVar, a2.a(bE2), true, true), InterfaceC22215f.a.f39077c);
        C20585k.f28659a.getClass();
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = n.c(bE2, vVarD);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, iA2);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        K k12 = K.f28344a;
        com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
        String strC = u0.i.c(bE2, i12);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65232c, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
        bE2.C(1808976627);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.avito.android.review.ui.f.c((C25683a) it.next(), bE2, 8);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
        }
        bE2.X(false);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(i12, i13, list);
        }
    }
}
