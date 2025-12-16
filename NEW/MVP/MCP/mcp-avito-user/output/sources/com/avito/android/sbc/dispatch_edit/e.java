package com.avito.android.sbc.dispatch_edit;

import Wo0.C15785a;
import Wo0.InterfaceC15786b;
import android.annotation.SuppressLint;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.C22554b;
import androidx.compose.ui.semantics.F;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.r0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.toggle.ToggleState;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SbcDispatchEditScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_sbc_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: SbcDispatchEditScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15786b, G0> f260075l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C15785a f260076m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super InterfaceC15786b, G0> lVar, C15785a c15785a) {
            super(0);
            this.f260075l = lVar;
            this.f260076m = c15785a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((com.avito.android.sbc.dispatch_edit.a) this.f260075l).invoke(new InterfaceC15786b.c(this.f260076m.f18045a));
            return G0.f406611a;
        }
    }

    /* compiled from: SbcDispatchEditScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<F, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f260077l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12) {
            super(1);
            this.f260077l = i12;
        }

        @Override // Y41.l
        public final G0 invoke(F f12) {
            C.k(f12, new C22554b(this.f260077l, 1));
            return G0.f406611a;
        }
    }

    /* compiled from: SbcDispatchEditScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<F, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C15785a f260078l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15785a c15785a) {
            super(1);
            this.f260078l = c15785a;
        }

        @Override // Y41.l
        public final G0 invoke(F f12) {
            C.v(f12, this.f260078l.f18046b ? ToggleableState.f41896b : ToggleableState.f41897c);
            return G0.f406611a;
        }
    }

    /* compiled from: SbcDispatchEditScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C15785a f260079l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f260080m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f260081n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15786b, G0> f260082o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f260083p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C15785a c15785a, int i12, boolean z12, Y41.l<? super InterfaceC15786b, G0> lVar, float f12, int i13) {
            super(2);
            this.f260079l = c15785a;
            this.f260080m = i12;
            this.f260081n = z12;
            this.f260082o = lVar;
            this.f260083p = f12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.l<InterfaceC15786b, G0> lVar = this.f260082o;
            int i12 = this.f260080m;
            boolean z12 = this.f260081n;
            e.a(this.f260079l, i12, z12, lVar, this.f260083p, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SbcDispatchEditScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.sbc.dispatch_edit.e$e, reason: collision with other inner class name */
    public static final class C7802e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15786b, G0> f260084l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7802e(Y41.l<? super InterfaceC15786b, G0> lVar) {
            super(2);
            this.f260084l = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                r9 = this;
                r6 = r10
                androidx.compose.runtime.A r6 = (androidx.compose.runtime.A) r6
                java.lang.Number r11 = (java.lang.Number) r11
                int r10 = r11.intValue()
                r10 = r10 & 11
                r11 = 2
                if (r10 != r11) goto L19
                boolean r10 = r6.c()
                if (r10 != 0) goto L15
                goto L19
            L15:
                r6.f()
                goto L5b
            L19:
                androidx.compose.ui.v$a r10 = androidx.compose.ui.v.f42878y1
                java.lang.String r11 = "dispatchEditTitleTestTag"
                androidx.compose.ui.v r1 = androidx.compose.ui.platform.C22501m2.a(r10, r11)
                r10 = 2131956759(0x7f131417, float:1.9550083E38)
                java.lang.String r0 = u0.i.c(r6, r10)
                r10 = 1799912455(0x6b487c07, float:2.4237087E26)
                r6.C(r10)
                Y41.l<Wo0.b, kotlin.G0> r10 = r9.f260084l
                boolean r11 = r6.B(r10)
                java.lang.Object r2 = r6.t()
                if (r11 != 0) goto L43
                androidx.compose.runtime.A$a r11 = androidx.compose.runtime.A.f37866a
                r11.getClass()
                androidx.compose.runtime.A$a$a r11 = androidx.compose.runtime.A.a.f37868b
                if (r2 != r11) goto L4b
            L43:
                com.avito.android.sbc.dispatch_edit.h r2 = new com.avito.android.sbc.dispatch_edit.h
                r2.<init>(r10)
                r6.H(r2)
            L4b:
                r4 = r2
                Y41.a r4 = (Y41.a) r4
                r6.h()
                r7 = 48
                r8 = 44
                r2 = 0
                r3 = 0
                r5 = 0
                com.akita.compose.component.navbar.t.d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            L5b:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.dispatch_edit.e.C7802e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SbcDispatchEditScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Wo0.d f260085l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15786b, G0> f260086m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Wo0.d dVar, Y41.l<? super InterfaceC15786b, G0> lVar) {
            super(2);
            this.f260085l = dVar;
            this.f260086m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                e.b(null, androidx.compose.runtime.internal.r.c(-232100817, new j(this.f260085l, this.f260086m), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SbcDispatchEditScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15786b, G0> f260087l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Wo0.d f260088m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f260089n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f12, Wo0.d dVar, Y41.l lVar) {
            super(3);
            this.f260087l = lVar;
            this.f260088m = dVar;
            this.f260089n = f12;
        }

        @Override // Y41.q
        public final G0 invoke(T1 t12, A a12, Integer num) {
            T1 t13 = t12;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(t13) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                v vVarH = R1.h(fillElement, t13);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, vVarH);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
                R3.b(pVar, a13, iA2);
                Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
                }
                Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, a13, vVarC);
                K k12 = K.f28344a;
                float f12 = 16;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                C20608p2.a(a13, C20588k2.d(C20588k2.f(aVar, f12), 1.0f));
                i.b bVar = InterfaceC22215f.a.f39086l;
                C20585k.C1589k c1589k = C20585k.f28660b;
                C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, a13, 48);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                v vVarC2 = androidx.compose.ui.n.c(a13, aVar);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, c20568f2A);
                R3.b(pVar2, a13, o1Y2);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                }
                R3.b(pVar4, a13, vVarC2);
                C20576h2 c20576h2 = C20576h2.f28641a;
                a13.C(-797810396);
                Object objT = a13.t();
                A.f37866a.getClass();
                Object obj = A.a.f37868b;
                if (objT == obj) {
                    objT = androidx.compose.foundation.interaction.l.a();
                    a13.H(objT);
                }
                androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
                a13.h();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
                InterfaceC21084v1 interfaceC21084v1D = com.akita.compose.foundation.n.d(0.0f, 3, aVar4.f63936k0.c(a13), false);
                a13.C(-797804816);
                Y41.l<InterfaceC15786b, G0> lVar2 = this.f260087l;
                boolean zB2 = a13.B(lVar2);
                Object objT2 = a13.t();
                if (zB2 || objT2 == obj) {
                    objT2 = new k(lVar2);
                    a13.H(objT2);
                }
                a13.h();
                v vVarB = C21086w0.b(aVar, mVar, interfaceC21084v1D, false, null, (Y41.a) objT2, 28);
                float f13 = 11;
                v vVarL = R1.l(vVarB, f12, f13, f12, f13);
                C20568f2 c20568f2A2 = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, a13, 0);
                int f37888q3 = a13.getF37888Q();
                O1 o1Y3 = a13.y();
                v vVarC3 = androidx.compose.ui.n.c(a13, vVarL);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, c20568f2A2);
                R3.b(pVar2, a13, o1Y3);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar3);
                }
                R3.b(pVar4, a13, vVarC3);
                v vVarA = C22501m2.a(aVar, "dispatchEditGeneralCheckToggleTestTag");
                Wo0.d dVar = this.f260088m;
                com.akita.compose.component.toggle.j.b(dVar.f18061b, null, com.akita.compose.theme.re23.b.m(a13).getF66432c().f61954f, androidx.compose.ui.semantics.r.b(vVarA, false, new l(dVar)), dVar.f18063d ? ToggleState.f63312c : ToggleState.f63311b, null, a13, 48, 96);
                com.akita.compose.foundation.ui.g.b(12, null, a13, 6, 2);
                String strC = u0.i.c(a13, R.string.sbc_dispatch_edit_advert);
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.foundation.r.a(iVar.f65245p, aVar4.f63918e0, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                a13.z();
                C20608p2.a(a13, c20576h2.a(aVar, 1.0f, true));
                com.akita.compose.foundation.ui.p.b(u0.i.c(a13, R.string.sbc_dispatch_edit_created_chats), com.akita.compose.foundation.r.a(iVar.f65245p, aVar4.f63918e0, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                com.akita.compose.foundation.ui.g.b(f12, null, a13, 6, 2);
                a13.z();
                com.avito.android.lib.compose.design.shared.divider.a.a(R1.k(f12, 0.0f, 2, aVar), aVar4.f63842E1, 1, 0.0f, a13, 390, 8);
                C20650b.a(C22501m2.a(fillElement, "dispatchEditListTestTag"), null, null, false, null, null, null, false, null, new r(this.f260089n, dVar, lVar2), a13, 6, 510);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SbcDispatchEditScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Wo0.d f260090l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15786b, G0> f260091m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Wo0.d dVar, Y41.l<? super InterfaceC15786b, G0> lVar, int i12) {
            super(2);
            this.f260090l = dVar;
            this.f260091m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            Y41.l<InterfaceC15786b, G0> lVar = this.f260091m;
            e.c(this.f260090l, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Wo0.C15785a r49, int r50, boolean r51, @Y61.k Y41.l<? super Wo0.InterfaceC15786b, kotlin.G0> r52, float r53, @Y61.l androidx.compose.runtime.A r54, int r55) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.dispatch_edit.e.a(Wo0.a, int, boolean, Y41.l, float, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.l v.a aVar, @Y61.k C22096n c22096n, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1258011081);
        if (((i12 | 6) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            aVar = v.f42878y1;
            float f12 = 24;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.n.a(aVar, androidx.compose.foundation.shape.o.c(f12, f12, 0.0f, 0.0f, 12), 3, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(-900238725, new com.avito.android.sbc.dispatch_edit.f(c22096n), bE2), bE2, 1573254, 48);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.sbc.dispatch_edit.g(aVar, c22096n, i12);
        }
    }

    @InterfaceC22132o
    @SuppressLint({"ComposeAndroidView"})
    @InterfaceC22181t
    public static final void c(@Y61.k Wo0.d dVar, @Y61.k Y41.l<? super InterfaceC15786b, G0> lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1302815164);
        q0 q0VarA = r0.a(1, 6, 0, bE2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        x0 x0VarD = com.akita.compose.foundation.r.a(com.akita.compose.theme.re23.b.f63988f.f65245p, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, 0L, 0L, 1022).d(new Object[0], bE2);
        bE2.C(971085239);
        float fJ2 = ((androidx.compose.ui.unit.d) bE2.o(Q0.f41199h)).J((int) (q0.a(q0VarA, u0.i.c(bE2, R.string.sbc_dispatch_edit_created_chats), x0VarD, 0L, 1020).f42528c >> 32));
        bE2.X(false);
        v.a aVar = v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(-1874800120, new C7802e(lVar), bE2), androidx.compose.runtime.internal.r.c(-909237303, new f(dVar, lVar), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(712279697, new g(fJ2, dVar, lVar), bE2), bE2, 12583350, 120);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(dVar, lVar, i12);
        }
    }
}
