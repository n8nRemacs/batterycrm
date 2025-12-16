package com.avito.android.mortgage.document_upload;

import android.content.Context;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import f00.C40196c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentUploadScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f00.d f199145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199147n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C40196c f199148o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f00.d dVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, C40196c c40196c) {
        super(2);
        this.f199145l = dVar;
        this.f199146m = aVar;
        this.f199147n = aVar2;
        this.f199148o = c40196c;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar;
        Y41.p<InterfaceC22413h, Integer, G0> pVar2;
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar3;
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            float f12 = 48;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarF = C20588k2.f(vVarD, f12);
            C20585k.f28659a.getClass();
            C20585k.h hVar = C20585k.f28666h;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39086l, a13, 54);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarF);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar5 = InterfaceC22413h.a.f40796g;
            R3.b(pVar5, a13, c20568f2A);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar6 = InterfaceC22413h.a.f40795f;
            R3.b(pVar6, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar7 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar7);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar8 = InterfaceC22413h.a.f40793d;
            R3.b(pVar8, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            if (this.f199145l.a()) {
                a13.C(-2126910256);
                pVar = pVar8;
                pVar2 = pVar7;
                pVar3 = pVar6;
                pVar4 = pVar5;
                com.avito.android.mortgage.widgets.b.a(C35835l0.j(R.attr.ic_arrowBack24, (Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)), this.f199146m, C20588k2.t(C20588k2.f28681b, f12), InterfaceC22215f.a.f39079e, false, null, a13, 3456, 48);
                a13.h();
            } else {
                pVar = pVar8;
                pVar2 = pVar7;
                pVar3 = pVar6;
                pVar4 = pVar5;
                a13.C(-2126503381);
                C20608p2.a(a13, C20588k2.o(aVar, f12));
                a13.h();
            }
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39089o, a13, 48);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, aVar);
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
            R3.b(pVar4, a13, iA2);
            R3.b(pVar3, a13, o1Y2);
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar2);
            }
            R3.b(pVar, a13, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            C40196c c40196c = this.f199148o;
            String str = c40196c.f395546f;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65239j;
            androidx.compose.ui.text.style.s.f42720b.getClass();
            int i12 = androidx.compose.ui.text.style.s.f42722d;
            com.akita.compose.foundation.ui.p.b(str, rVar, null, false, 0L, null, 1, i12, false, null, a13, 14155776, 828);
            com.akita.compose.foundation.ui.p.b(u0.i.b(R.string.documents_upload_title_counter, new Object[]{Integer.valueOf(c40196c.f395547g), Integer.valueOf(c40196c.f395548h)}, a13), iVar.f65241l, null, false, 0L, null, 1, i12, false, null, a13, 14155776, 828);
            a13.z();
            com.avito.android.mortgage.widgets.b.a(C35835l0.j(R.attr.ic_close24, (Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)), this.f199147n, C20588k2.t(C20588k2.f28681b, f12), InterfaceC22215f.a.f39081g, false, null, a13, 3456, 48);
            a13.z();
        }
        return G0.f406611a;
    }
}
