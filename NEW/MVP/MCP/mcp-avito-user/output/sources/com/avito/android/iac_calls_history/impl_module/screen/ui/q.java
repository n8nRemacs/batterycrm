package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTab;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.LoadingCallsHistoryItem;
import java.time.LocalDate;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f164947l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i12) {
        super(2);
        this.f164947l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f164947l | 1);
        B bE2 = a12.E(-2121634313);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            r.a(new CallsHistoryScreenState(C42745f0.U(new CallsHistoryTab(CallsHistoryTabType.f164755b, 0), new CallsHistoryTab(CallsHistoryTabType.f164756c, 5)), 0, null, C42745f0.i0(LoadingCallsHistoryItem.f164848b, com.avito.android.iac_calls_history.impl_module.screen.ui.items.g.f164929d), LocalDate.of(2025, 9, 1)), l.f164942l, m.f164943l, n.f164944l, o.f164945l, p.f164946l, null, bE2, 224688);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(iA2);
        }
        return G0.f406611a;
    }
}
