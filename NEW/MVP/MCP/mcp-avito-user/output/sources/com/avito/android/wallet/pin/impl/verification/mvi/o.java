package com.avito.android.wallet.pin.impl.verification.mvi;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
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
import androidx.compose.ui.v;
import androidx.view.C;
import androidx.view.y;
import com.akita.compose.component.toast_bar.u;
import com.akita.compose.component.toast_bar.w;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pP0.InterfaceC46989a;
import pP0.InterfaceC46990b;

/* compiled from: WalletPinVerificationScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-pin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

    /* compiled from: WalletPinVerificationScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.verification.mvi.entity.a f329335l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC46989a, G0> f329336m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC46990b> f329337n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.android.wallet.pin.impl.verification.mvi.entity.a aVar, Y41.l<? super InterfaceC46989a, G0> lVar, InterfaceC43160i<? extends InterfaceC46990b> interfaceC43160i) {
            super(2);
            this.f329335l = aVar;
            this.f329336m = lVar;
            this.f329337n = interfaceC43160i;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.verification.mvi.o.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WalletPinVerificationScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.verification.mvi.entity.a f329338l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC46990b> f329339m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC46989a, G0> f329340n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.avito.android.wallet.pin.impl.verification.mvi.entity.a aVar, InterfaceC43160i<? extends InterfaceC46990b> interfaceC43160i, Y41.l<? super InterfaceC46989a, G0> lVar, int i12) {
            super(2);
            this.f329338l = aVar;
            this.f329339m = interfaceC43160i;
            this.f329340n = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            Y41.l<InterfaceC46989a, G0> lVar = this.f329340n;
            o.a(this.f329338l, this.f329339m, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.wallet.pin.impl.verification.mvi.entity.a aVar, @Y61.k InterfaceC43160i<? extends InterfaceC46990b> interfaceC43160i, @Y61.k Y41.l<? super InterfaceC46989a, G0> lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1874498832);
        com.akita.compose.theme.re23.c.a(false, r.c(-957088629, new a(aVar, lVar, interfaceC43160i), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, interfaceC43160i, lVar, i12);
        }
    }

    public static final void b(a.C10227a c10227a, InterfaceC43160i interfaceC43160i, Y41.l lVar, A a12, int i12) {
        B bE2 = a12.E(-1177328681);
        androidx.view.compose.m.f21198a.getClass();
        C cA2 = androidx.view.compose.m.a(bE2);
        y f21241d = cA2 != null ? cA2.getF21241d() : null;
        com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVarA = com.avito.android.wallet.pin.impl.ui.components.pin_input.g.a(bE2, c10227a.f329312e);
        u uVarA = w.a(bE2);
        C22187u0.d(new com.avito.android.wallet.pin.impl.verification.mvi.b(interfaceC43160i, fVarA, uVarA, com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2), null), bE2, G0.f406611a);
        com.akita.compose.component.scaffold.g.a(null, r.c(-1312813669, new d(c10227a, f21241d, lVar), bE2), null, uVarA, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, r.c(2129470372, new j(lVar, c10227a, fVarA), bE2), bE2, 12582960, 85);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(c10227a, interfaceC43160i, lVar, i12);
        }
    }

    public static final void c(A a12, int i12) {
        B bE2 = a12.E(207282022);
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
            c22039c2Z.f38184d = new l(i12);
        }
    }
}
