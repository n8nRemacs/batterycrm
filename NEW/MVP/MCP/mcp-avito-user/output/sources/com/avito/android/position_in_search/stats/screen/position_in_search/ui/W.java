package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.animation.InterfaceC20343e0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import c90.InterfaceC26960a;
import c90.c;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PositionInSearchQueryItems.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class W extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20343e0, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.e.a.C2036c.b f221617l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f221618m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221619n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public W(c.e.a.C2036c.b bVar, int i12, Y41.l<? super InterfaceC26960a, G0> lVar) {
        super(3);
        this.f221617l = bVar;
        this.f221618m = i12;
        this.f221619n = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20343e0 interfaceC20343e0, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
        int f37888q = a13.getF37888Q();
        O1 o1Y = a13.y();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        androidx.compose.ui.v vVar = null;
        if (a13.F() == null) {
            C22190v.b();
            throw null;
        }
        a13.A();
        if (a13.getF37887P()) {
            a13.b(aVar);
        } else {
            a13.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
        R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
            androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        a13.C(-267127359);
        c.e.a.C2036c.b bVar = this.f221617l;
        ArrayList arrayList = bVar.f57770f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c.e.a.C2036c.b.C2038a c2038a = (c.e.a.C2036c.b.C2038a) it.next();
            a13.C(-267126686);
            if (kotlin.jvm.internal.L.f(c2038a, C42745f0.E(arrayList))) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(12, vVar, a13, 6);
            }
            a13.h();
            String str = c2038a.f57773a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            Iterator it2 = it;
            com.akita.compose.component.description_list.d.d(str, c2038a.f57774b, false, null, com.akita.compose.component.description_list.j.a(com.akita.compose.theme.re23.b.g(a13).getF66136b(), com.akita.compose.foundation.r.a(com.akita.compose.theme.re23.b.g(a13).getF66136b().f61490a, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, 0L, 0L, 1022), 62), C22501m2.a(androidx.compose.ui.v.f42878y1, "query_item_statistic_line_" + this.f221618m), false, a13, 3456, 64);
            a13.C(-267094591);
            if (!c2038a.equals(C42745f0.Q(arrayList))) {
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(12, null, a13, 6);
            }
            a13.h();
            it = it2;
            vVar = null;
        }
        a13.h();
        a13.C(-267087578);
        AttributedText attributedText = bVar.f57768d;
        if (attributedText != null) {
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(12, null, a13, 6);
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, R.attr.textM20, null, new V(this.f221619n, attributedText), 0, a13, 8, 42);
            com.akita.compose.foundation.ui.g.a(24, null, a13, 6);
        }
        a13.h();
        a13.z();
        return G0.f406611a;
    }
}
