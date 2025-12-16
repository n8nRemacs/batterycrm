package com.avito.android.wallet.pin.impl.settings.mvi;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import androidx.view.C;
import androidx.view.y;
import com.akita.compose.component.list_item.s;
import com.akita.compose.component.toast_bar.u;
import com.akita.compose.component.toast_bar.w;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.a;
import kP0.C42616b;
import kP0.C42617c;
import kP0.InterfaceC42615a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletSecuritySettingsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-pin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

    /* compiled from: WalletSecuritySettingsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.settings.mvi.entity.a f328891l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC42615a, G0> f328892m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.android.wallet.pin.impl.settings.mvi.entity.a aVar, Y41.l<? super InterfaceC42615a, G0> lVar) {
            super(2);
            this.f328891l = aVar;
            this.f328892m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r5, java.lang.Integer r6) {
            /*
                r4 = this;
                androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r6 = r6 & 11
                r0 = 2
                if (r6 != r0) goto L19
                boolean r6 = r5.c()
                if (r6 != 0) goto L14
                goto L19
            L14:
                r5.f()
                goto L91
            L19:
                com.avito.android.wallet.pin.impl.settings.mvi.entity.a r6 = r4.f328891l
                boolean r0 = r6 instanceof com.avito.android.wallet.pin.impl.settings.mvi.entity.a.C10210a
                Y41.l<kP0.a, kotlin.G0> r1 = r4.f328892m
                r2 = 0
                if (r0 == 0) goto L31
                r0 = -351493697(0xffffffffeb0ca1bf, float:-1.7001344E26)
                r5.C(r0)
                com.avito.android.wallet.pin.impl.settings.mvi.entity.a$a r6 = (com.avito.android.wallet.pin.impl.settings.mvi.entity.a.C10210a) r6
                com.avito.android.wallet.pin.impl.settings.mvi.o.b(r6, r1, r5, r2)
                r5.h()
                goto L91
            L31:
                com.avito.android.wallet.pin.impl.settings.mvi.entity.a$b r0 = com.avito.android.wallet.pin.impl.settings.mvi.entity.a.b.f328873a
                boolean r0 = kotlin.jvm.internal.L.f(r6, r0)
                if (r0 == 0) goto L73
                r6 = -351378873(0xffffffffeb0e6247, float:-1.7213157E26)
                r5.C(r6)
                r6 = 2131958215(0x7f1319c7, float:1.9553036E38)
                java.lang.String r6 = u0.i.c(r5, r6)
                r0 = 1512690685(0x5a29d3fd, float:1.1950589E16)
                r5.C(r0)
                boolean r0 = r5.B(r1)
                java.lang.Object r3 = r5.t()
                if (r0 != 0) goto L5f
                androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
                r0.getClass()
                androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
                if (r3 != r0) goto L67
            L5f:
                com.avito.android.wallet.pin.impl.settings.mvi.n r3 = new com.avito.android.wallet.pin.impl.settings.mvi.n
                r3.<init>(r1)
                r5.H(r3)
            L67:
                Y41.a r3 = (Y41.a) r3
                r5.h()
                com.avito.android.wallet.pin.impl.ui.components.error_screen.a.a(r6, r3, r5, r2)
                r5.h()
                goto L91
            L73:
                com.avito.android.wallet.pin.impl.settings.mvi.entity.a$c r0 = com.avito.android.wallet.pin.impl.settings.mvi.entity.a.c.f328874a
                boolean r6 = kotlin.jvm.internal.L.f(r6, r0)
                if (r6 == 0) goto L88
                r6 = -351121170(0xffffffffeb1250ee, float:-1.7688535E26)
                r5.C(r6)
                com.avito.android.wallet.pin.impl.settings.mvi.o.c(r5, r2)
                r5.h()
                goto L91
            L88:
                r6 = -351050707(0xffffffffeb13642d, float:-1.7818516E26)
                r5.C(r6)
                r5.h()
            L91:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.settings.mvi.o.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WalletSecuritySettingsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.settings.mvi.entity.a f328893l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC42615a, G0> f328894m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.avito.android.wallet.pin.impl.settings.mvi.entity.a aVar, Y41.l<? super InterfaceC42615a, G0> lVar, int i12) {
            super(2);
            this.f328893l = aVar;
            this.f328894m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            o.a(this.f328893l, this.f328894m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.wallet.pin.impl.settings.mvi.entity.a aVar, @Y61.k Y41.l<? super InterfaceC42615a, G0> lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1104907327);
        if ((((bE2.B(aVar) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, r.c(-53334502, new a(aVar, lVar), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, lVar, i12);
        }
    }

    public static final void b(a.C10210a c10210a, Y41.l lVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1941135683);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c10210a) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            androidx.view.compose.m.f21198a.getClass();
            C cA2 = androidx.view.compose.m.a(bE2);
            y f21241d = cA2 != null ? cA2.getF21241d() : null;
            u uVarA = w.a(bE2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.scaffold.g.a(null, r.c(-1537365639, new f(c10210a, f21241d), bE2), null, uVarA, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, r.c(1182751632, new h(c10210a, lVar), bE2), bE2, 12582960, 85);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(c10210a, lVar, i12);
        }
    }

    public static final void c(A a12, int i12) {
        B bE2 = a12.E(1400068372);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            v vVarB = androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), Y0.f39346a);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66694c(), C20644z.f28804a.d(aVar, InterfaceC22215f.a.f39080f), bE2, 0, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(i12);
        }
    }

    public static final void d(C42617c c42617c, Y41.a aVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(1994923012);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c42617c) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar2 = v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, aVar2);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            String str = c42617c.f406271a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65233d, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            bE2.C(632330892);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            bE2.C(632334394);
            boolean z12 = (i14 & 112) == 32;
            Object objT2 = bE2.t();
            if (z12 || objT2 == c1651a) {
                objT2 = new k(aVar);
                bE2.H(objT2);
            }
            bE2.X(false);
            v vVarB = C21086w0.b(aVar2, mVar, null, false, null, (Y41.a) objT2, 28);
            s f66431b = com.akita.compose.theme.re23.b.m(bE2).getF66431b();
            C42616b c42616b = c42617c.f406272b;
            com.akita.compose.component.list_item.m.e(c42616b.f406268a, c42616b.f406269b, f66431b, vVarB, null, r.c(180596747, new l(c42617c, aVar), bE2), bE2, 196608, 16);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(c42617c, aVar, i12);
        }
    }
}
