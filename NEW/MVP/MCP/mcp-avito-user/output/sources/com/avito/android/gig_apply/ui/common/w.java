package com.avito.android.gig_apply.ui.common;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextWithShowMoreWidget.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isShowFullText", "_avito_gig_slot-screen_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w {

    /* compiled from: TextWithShowMoreWidget.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<F, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f159983l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f159984m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f159983l = yVar;
            this.f159984m = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.F r16, androidx.compose.runtime.A r17, java.lang.Integer r18) {
            /*
                r15 = this;
                r0 = r15
                r1 = r16
                androidx.compose.foundation.layout.F r1 = (androidx.compose.foundation.layout.F) r1
                r12 = r17
                androidx.compose.runtime.A r12 = (androidx.compose.runtime.A) r12
                r2 = r18
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = r2 & 14
                r4 = 4
                if (r3 != 0) goto L20
                boolean r3 = r12.B(r1)
                if (r3 == 0) goto L1e
                r3 = r4
                goto L1f
            L1e:
                r3 = 2
            L1f:
                r2 = r2 | r3
            L20:
                r2 = r2 & 91
                r3 = 18
                if (r2 != r3) goto L32
                boolean r2 = r12.c()
                if (r2 != 0) goto L2d
                goto L32
            L2d:
                r12.f()
                goto Lb5
            L32:
                r2 = 1
                r3 = 0
                androidx.compose.ui.text.q0 r5 = androidx.compose.ui.text.r0.a(r3, r3, r2, r12)
                com.akita.compose.theme.re23.b r2 = com.akita.compose.theme.re23.b.f63983a
                r2.getClass()
                com.akita.compose.theme.re23.i r2 = com.akita.compose.theme.re23.b.f63988f
                com.akita.compose.foundation.r r2 = r2.f65240k
                java.lang.Object[] r3 = new java.lang.Object[r3]
                androidx.compose.ui.text.x0 r3 = r2.d(r3, r12)
                com.avito.android.gig_apply.ui.common.y r2 = r0.f159983l
                java.lang.String r6 = r2.f159992b
                r7 = 818831437(0x30ce604d, float:1.5015843E-9)
                r12.C(r7)
                boolean r6 = r12.B(r6)
                java.lang.Object r7 = r12.t()
                if (r6 != 0) goto L64
                androidx.compose.runtime.A$a r6 = androidx.compose.runtime.A.f37866a
                r6.getClass()
                androidx.compose.runtime.A$a$a r6 = androidx.compose.runtime.A.a.f37868b
                if (r7 != r6) goto L74
            L64:
                long r8 = r1.getF28270b()
                java.lang.String r6 = r2.f159992b
                r10 = 988(0x3dc, float:1.384E-42)
                r7 = r3
                androidx.compose.ui.text.o0 r7 = androidx.compose.ui.text.q0.a(r5, r6, r7, r8, r10)
                r12.H(r7)
            L74:
                androidx.compose.ui.text.o0 r7 = (androidx.compose.ui.text.o0) r7
                r12.h()
                androidx.compose.ui.text.G r1 = r7.f42527b
                int r1 = r1.f41921f
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.avito.android.gig_apply.ui.common.v r5 = new com.avito.android.gig_apply.ui.common.v
                r6 = 0
                androidx.compose.runtime.y1<java.lang.Boolean> r8 = r0.f159984m
                r5.<init>(r7, r8, r6)
                androidx.compose.runtime.C22187u0.d(r5, r12, r1)
                androidx.compose.ui.v$a r1 = androidx.compose.ui.v.f42878y1
                java.lang.Object r5 = r8.getF42167b()
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L9d
                r4 = 2147483647(0x7fffffff, float:NaN)
            L9d:
                r8 = r4
                androidx.compose.ui.text.style.s$a r4 = androidx.compose.ui.text.style.s.f42720b
                r4.getClass()
                int r9 = androidx.compose.ui.text.style.s.f42722d
                r13 = 1573248(0x180180, float:2.20459E-39)
                r14 = 408(0x198, float:5.72E-43)
                java.lang.String r2 = r2.f159992b
                r5 = 0
                r7 = 0
                r10 = 0
                r11 = 0
                r4 = r1
                com.akita.compose.foundation.ui.p.d(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            Lb5:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_apply.ui.common.w.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TextWithShowMoreWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f159985l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f159985l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f159985l.setValue(Boolean.TRUE);
            return G0.f406611a;
        }
    }

    /* compiled from: TextWithShowMoreWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f159986l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y yVar, int i12) {
            super(2);
            this.f159986l = yVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            w.a(this.f159986l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: TextWithShowMoreWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f159987l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f159987l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f159987l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: TextWithShowMoreWidget.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/o0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<o0> f159988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22204y1<o0> interfaceC22204y1) {
            super(1);
            this.f159988l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final G0 invoke(o0 o0Var) {
            this.f159988l.setValue(o0Var);
            return G0.f406611a;
        }
    }

    /* compiled from: TextWithShowMoreWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f159989l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i12, Y41.a aVar) {
            super(2);
            this.f159989l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(7);
            w.b(this.f159989l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b6  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.avito.android.gig_apply.ui.common.y r37, androidx.compose.runtime.A r38, int r39) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_apply.ui.common.w.a(com.avito.android.gig_apply.ui.common.y, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(Y41.a<G0> aVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(716231282);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(1588215175);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(null);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            bE2.C(1588218375);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new d(aVar);
                bE2.H(objT2);
            }
            bE2.X(false);
            androidx.compose.ui.v vVarC = C21086w0.c(aVar2, false, null, null, (Y41.a) objT2, 7);
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarC);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            String strC = u0.i.c(bE2, R.string.gig_slot_show_more);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVarA = com.akita.compose.foundation.r.a(com.akita.compose.theme.re23.b.f63988f.f65240k, com.akita.compose.theme.re23.b.f63984b.f63837D, 0L, 0L, null, 0L, 0L, 1022);
            androidx.compose.ui.v vVarK = R1.k(0.0f, 0.0f, 3, aVar2);
            bE2.C(1882726422);
            Object objT3 = bE2.t();
            if (objT3 == c1651a) {
                objT3 = new e(interfaceC22204y1);
                bE2.H(objT3);
            }
            bE2.X(false);
            com.akita.compose.foundation.ui.p.b(strC, rVarA, vVarK, false, 0L, null, 0, 0, false, (Y41.l) objT3, bE2, 805306752, 504);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(i12, aVar);
        }
    }
}
