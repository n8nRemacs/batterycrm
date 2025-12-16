package com.avito.android.iac_calls_history.impl_module.screen.ui;

import R2.b;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.tab_group.u;
import com.akita.compose.theme.re23.style.M3;
import com.akita.compose.theme.re23.style.N3;
import com.avito.android.R;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTab;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: CallsHistoryScreenUI.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164880l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f164881m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164882n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.a f164883o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164884p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacCallsHistoryItem, G0> f164885q;

    /* compiled from: CallsHistoryScreenUI.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CallsHistoryTabType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CallsHistoryTabType callsHistoryTabType = CallsHistoryTabType.f164755b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(CallsHistoryScreenState callsHistoryScreenState, Y41.l<? super Integer, G0> lVar, Y41.a<G0> aVar, l0.a aVar2, Y41.a<G0> aVar3, Y41.l<? super IacCallsHistoryItem, G0> lVar2) {
        super(3);
        this.f164880l = callsHistoryScreenState;
        this.f164881m = lVar;
        this.f164882n = aVar;
        this.f164883o = aVar2;
        this.f164884p = aVar3;
        this.f164885q = lVar2;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        int i12;
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, fillElement);
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
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            a13.C(1127976898);
            CallsHistoryScreenState callsHistoryScreenState = this.f164880l;
            if (!callsHistoryScreenState.f164824b.isEmpty()) {
                List<CallsHistoryTab> list = callsHistoryScreenState.f164824b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (CallsHistoryTab callsHistoryTab : list) {
                    int iOrdinal = callsHistoryTab.f164753b.ordinal();
                    if (iOrdinal == 0) {
                        i12 = R.string.iac_calls_history_tab_title_all;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i12 = R.string.iac_calls_history_tab_title_missed;
                    }
                    b.c.C0937b c0937b = new b.c.C0937b(i12);
                    int i13 = callsHistoryTab.f164754c;
                    b.a aVar3 = new b.a(i13, null, 2, null);
                    if (i13 <= 0) {
                        aVar3 = null;
                    }
                    arrayList.add(new R2.b(c0937b, new b.C0936b(aVar3, false, 2, null), false, 4, null));
                }
                com.akita.compose.theme.re23.b.f63983a.getClass();
                u f66748c = ((M3) a13.o(N3.f66170b)).getF66748c();
                v.a aVar4 = v.f42878y1;
                float f12 = 16;
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.tab_group.k.a(arrayList, callsHistoryScreenState.f164825c, this.f164881m, f66748c, R1.l(aVar4, f12, 24, f12, 8), null, a13, 8, 32);
            }
            a13.h();
            com.akita.compose.component.pull_to_refresh.i.b(com.akita.compose.component.pull_to_refresh.k.a(a13), false, this.f164882n, null, null, null, androidx.compose.runtime.internal.r.c(630936235, new b(callsHistoryScreenState, this.f164883o, this.f164884p, this.f164885q), a13), a13, 1572920, 56);
            a13.z();
        }
        return G0.f406611a;
    }
}
