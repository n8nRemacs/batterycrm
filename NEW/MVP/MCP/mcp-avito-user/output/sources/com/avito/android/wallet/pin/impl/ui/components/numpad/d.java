package com.avito.android.wallet.pin.impl.ui.components.numpad;

import Y41.q;
import androidx.compose.animation.F0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.S;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.z;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: WalletPinNumPad.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-pin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final v f328933a;

    /* compiled from: WalletPinNumPad.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/ui/components/numpad/a;", "buttonState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/wallet/pin/impl/ui/components/numpad/a;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements q<com.avito.android.wallet.pin.impl.ui.components.numpad.a, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44967a f328934l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.numpad.a f328935m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328936n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328937o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC44967a interfaceC44967a, com.avito.android.wallet.pin.impl.ui.components.numpad.a aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
            super(3);
            this.f328934l = interfaceC44967a;
            this.f328935m = aVar;
            this.f328936n = aVar2;
            this.f328937o = aVar3;
        }

        @Override // Y41.q
        public final G0 invoke(com.avito.android.wallet.pin.impl.ui.components.numpad.a aVar, A a12, Integer num) {
            com.avito.android.wallet.pin.impl.ui.components.numpad.a aVar2 = aVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(aVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else if (aVar2 == com.avito.android.wallet.pin.impl.ui.components.numpad.a.f328924e) {
                a13.C(-521513879);
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                C20632w.a(C20588k2.o(v.f42878y1, 60), a13, 6);
                a13.h();
            } else {
                a13.C(-521420724);
                com.akita.compose.component.button.m.b(new com.avito.android.wallet.pin.impl.ui.components.numpad.b(this.f328934l, this.f328935m, this.f328936n, this.f328937o), d.f(a13), C22501m2.a(C20588k2.x(v.f42878y1, null, 3), "WalletPinDeleteButtonTestTag"), false, null, r.c(1157833756, new com.avito.android.wallet.pin.impl.ui.components.numpad.c(aVar2), a13), a13, 197056, 24);
                a13.h();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.numpad.a f328938l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328939m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328940n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f328941o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.wallet.pin.impl.ui.components.numpad.a aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, int i12) {
            super(2);
            this.f328938l = aVar;
            this.f328939m = aVar2;
            this.f328940n = aVar3;
            this.f328941o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f328941o | 1);
            d.a(this.f328938l, this.f328939m, this.f328940n, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44967a f328942l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NumPadNumber, G0> f328943m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ NumPadNumber f328944n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC44967a interfaceC44967a, Y41.l<? super NumPadNumber, G0> lVar, NumPadNumber numPadNumber) {
            super(0);
            this.f328942l = interfaceC44967a;
            this.f328943m = lVar;
            this.f328944n = numPadNumber;
        }

        @Override // Y41.a
        public final G0 invoke() {
            p0.b.f422385b.getClass();
            b.a.a();
            this.f328942l.a(0);
            this.f328943m.invoke(this.f328944n);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.pin.impl.ui.components.numpad.d$d, reason: collision with other inner class name */
    public static final class C10212d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ NumPadNumber f328945l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10212d(NumPadNumber numPadNumber) {
            super(2);
            this.f328945l = numPadNumber;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                String strValueOf = String.valueOf(this.f328945l.f328921b);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                long jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(a13);
                com.akita.compose.theme.re23.b.f63987e.getClass();
                com.akita.compose.theme.re23.semantic.b.f65956d.a().getClass();
                S s5 = Y2.a.f19276e.f19280a;
                long jC3 = z.c(32.0d);
                long jC4 = z.c(36.0d);
                e0.f42240c.getClass();
                e0 e0Var = e0.f42242e;
                androidx.compose.ui.text.style.i.f42675b.getClass();
                com.akita.compose.foundation.ui.p.d(strValueOf, new x0(jC2, jC3, e0Var, (Z) null, (C22605a0) null, s5, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, androidx.compose.ui.text.style.i.f42678e, 0, jC4, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613336, (C42822w) null), null, 0L, null, 0, 0, false, null, a13, 0, 508);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ NumPadNumber f328946l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NumPadNumber, G0> f328947m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f328948n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(NumPadNumber numPadNumber, Y41.l<? super NumPadNumber, G0> lVar, int i12) {
            super(2);
            this.f328946l = numPadNumber;
            this.f328947m = lVar;
            this.f328948n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f328948n | 1);
            d.b(this.f328946l, this.f328947m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f328949l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f328950l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NumPadNumber, G0> f328951l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328952m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f328953n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i12, Y41.a aVar, Y41.l lVar, boolean z12) {
            super(2);
            this.f328951l = lVar;
            this.f328952m = aVar;
            this.f328953n = z12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            boolean z12 = this.f328953n;
            Y41.l<NumPadNumber, G0> lVar = this.f328951l;
            d.d(iA2, this.f328952m, lVar, a12, z12);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NumPadNumber, G0> f328954l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328955m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f328956n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f328957o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328958p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f328959q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f328960r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f328961s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Y41.l<? super NumPadNumber, G0> lVar, Y41.a<G0> aVar, boolean z12, String str, Y41.a<G0> aVar2, boolean z13, Y41.a<G0> aVar3, int i12) {
            super(2);
            this.f328954l = lVar;
            this.f328955m = aVar;
            this.f328956n = z12;
            this.f328957o = str;
            this.f328958p = aVar2;
            this.f328959q = z13;
            this.f328960r = aVar3;
            this.f328961s = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f328961s | 1);
            String str = this.f328957o;
            Y41.a<G0> aVar = this.f328958p;
            d.e(this.f328954l, this.f328955m, this.f328956n, str, aVar, this.f328959q, this.f328960r, a12, iA2);
            return G0.f406611a;
        }
    }

    static {
        v.a aVar = v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        f328933a = R1.k(52, 0.0f, 2, aVar);
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(com.avito.android.wallet.pin.impl.ui.components.numpad.a aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, A a12, int i12) {
        B bE2 = a12.E(-2087897668);
        int i13 = (bE2.B(aVar) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar3) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            F0.b(aVar, null, null, "numPadDeleteButtonFade", r.c(-169938380, new a((InterfaceC44967a) bE2.o(Q0.f41203l), aVar, aVar2, aVar3), bE2), bE2, (i13 & 14) | 27648, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, aVar2, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(NumPadNumber numPadNumber, Y41.l<? super NumPadNumber, G0> lVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(75181035);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(numPadNumber) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.component.button.m.b(new c((InterfaceC44967a) bE2.o(Q0.f41203l), lVar, numPadNumber), f(bE2), C22501m2.a(C20588k2.x(v.f42878y1, null, 3), "WalletPinNumberButtonTestTag" + numPadNumber.f328921b), false, null, r.c(-1213143505, new C10212d(numPadNumber), bE2), bE2, 196672, 24);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(numPadNumber, lVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(String str, Y41.a aVar, v vVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(719283480);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            v vVarA = C22501m2.a(C20588k2.x(vVar, null, 3), "WalletPinRecoverButtonTestTag");
            com.akita.compose.theme.re23.b.f63983a.getClass();
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.button.m.b(aVar, t.c(com.akita.compose.theme.re23.b.c(bE2).i(), 60, 80, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, 33554428), vVarA, false, null, r.c(-1804315052, new o(str), bE2), bE2, ((i13 >> 3) & 14) | 196672, 24);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(str, aVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(int i12, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.l A a12, boolean z12) {
        B bE2 = a12.E(-1258727331);
        int i13 = (bE2.u(lVar) ? 4 : 2) | i12 | (bE2.u(aVar) ? 32 : 16) | (bE2.j(z12) ? 256 : 128);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            e(lVar, aVar, z12, null, f.f328949l, false, g.f328950l, bE2, (i13 & 14) | 1797120 | (i13 & 112) | (i13 & 896));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(i12, aVar, lVar, z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@Y61.k Y41.l<? super com.avito.android.wallet.pin.impl.ui.components.numpad.NumPadNumber, kotlin.G0> r29, @Y61.k Y41.a<kotlin.G0> r30, boolean r31, @Y61.l java.lang.String r32, @Y61.k Y41.a<kotlin.G0> r33, boolean r34, @Y61.k Y41.a<kotlin.G0> r35, @Y61.l androidx.compose.runtime.A r36, int r37) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.ui.components.numpad.d.e(Y41.l, Y41.a, boolean, java.lang.String, Y41.a, boolean, Y41.a, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22029a2
    @InterfaceC22132o
    @X41.i
    public static final t f(A a12) {
        t tVarO = com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a12);
        float f12 = 60;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 0;
        com.akita.compose.theme.re23.a aVar2 = com.akita.compose.theme.re23.b.f63984b;
        return t.c(tVarO, f12, f12, 32, f13, f13, f13, 0.0f, 0.0f, aVar2.f63851H1, null, aVar2.f63938l, null, null, null, null, null, aVar2.f63973w1, null, null, null, 33487552);
    }
}
