package com.avito.android.realty_agency.checkerboard;

import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.realty_agency.checkerboard.CheckerboardActivity;
import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CheckerboardActivity.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckerboardActivity f251083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CheckerboardActivity checkerboardActivity) {
        super(2);
        this.f251083l = checkerboardActivity;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, aVar);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            CheckerboardActivity.a aVar3 = CheckerboardActivity.f250899B;
            CheckerboardActivity checkerboardActivity = this.f251083l;
            ?? r02 = checkerboardActivity.f250904p;
            com.avito.android.realty_agency.checkerboard.ui.j.a(((CheckerboardArguments) r02.getValue()).f251211d, ((CheckerboardArguments) r02.getValue()).f251210c, ((CheckerboardArguments) r02.getValue()).f251212e, new b(checkerboardActivity), a13, 8, 0);
            a13.z();
        }
        return G0.f406611a;
    }
}
