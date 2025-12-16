package com.avito.android.wallet.pin.impl.verification.mvi;

import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import androidx.view.y;
import com.akita.compose.component.button.t;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import pP0.InterfaceC46989a;

/* compiled from: WalletPinVerificationScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C10227a f329268l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f329269m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC46989a, G0> f329270n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(a.C10227a c10227a, y yVar, Y41.l<? super InterfaceC46989a, G0> lVar) {
        super(2);
        this.f329268l = c10227a;
        this.f329269m = yVar;
        this.f329270n = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarI = R1.i(C20588k2.d(aVar, 1.0f), 12);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, vVarI);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v vVarD = c20644z.d(aVar, InterfaceC22215f.a.f39079e);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            t tVarI = com.akita.compose.theme.re23.b.c(a13).i();
            c cVar = new c(this.f329269m, this.f329270n);
            a.f329105a.getClass();
            com.akita.compose.component.button.m.b(cVar, tVarI, vVarD, false, null, a.f329106b, a13, 196672, 24);
            v vVarD2 = c20644z.d(aVar, InterfaceC22215f.a.f39080f);
            String str = this.f329268l.f329308a;
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65239j;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarD2, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, a13, 0, 984);
            a13.z();
        }
        return G0.f406611a;
    }
}
