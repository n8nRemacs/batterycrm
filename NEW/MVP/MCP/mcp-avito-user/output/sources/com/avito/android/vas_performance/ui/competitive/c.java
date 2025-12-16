package com.avito.android.vas_performance.ui.competitive;

import com.avito.android.lib.design.button.Button;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.util.P2;
import com.avito.android.vas_performance.ui.competitive.CompetitiveVasFragment;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitiveVasFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/competitive/t;", "kotlin.jvm.PlatformType", "viewState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/competitive/t;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.l<t, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CompetitiveVasFragment f321483l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CompetitiveVasFragment competitiveVasFragment) {
        super(1);
        this.f321483l = competitiveVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(t tVar) {
        t tVar2 = tVar;
        P2<CL0.c> p22 = tVar2.f321525a;
        CompetitiveVasFragment.a aVar = CompetitiveVasFragment.f321463C0;
        CompetitiveVasFragment competitiveVasFragment = this.f321483l;
        if (p22 instanceof P2.c) {
            com.avito.android.progress_overlay.l lVar = competitiveVasFragment.f321476x0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (p22 instanceof P2.b) {
            com.avito.android.progress_overlay.l lVar2 = competitiveVasFragment.f321476x0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.j();
        } else if (p22 instanceof P2.a) {
            com.avito.android.progress_overlay.l lVar3 = competitiveVasFragment.f321476x0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.a("");
        }
        List<com.avito.conveyor_item.a> list = tVar2.f321526b;
        if (list != null) {
            com.avito.konveyor.adapter.a aVar2 = competitiveVasFragment.f321466n0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar2, list);
            com.avito.konveyor.adapter.j jVar = competitiveVasFragment.f321469q0;
            if (jVar == null) {
                jVar = null;
            }
            jVar.notifyDataSetChanged();
        }
        String str = tVar2.f321527c;
        if (str != null) {
            Button button = competitiveVasFragment.f321475w0;
            if (button == null) {
                button = null;
            }
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        MnzFloatingFooter mnzFloatingFooter = competitiveVasFragment.f321477y0;
        if (mnzFloatingFooter == null) {
            mnzFloatingFooter = null;
        }
        com.avito.android.util.text.a aVar3 = competitiveVasFragment.f321473u0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        mnzFloatingFooter.d(tVar2.f321528d, aVar3, new a(competitiveVasFragment), new b(competitiveVasFragment));
        MnzFloatingFooter mnzFloatingFooter2 = competitiveVasFragment.f321477y0;
        if (mnzFloatingFooter2 == null) {
            mnzFloatingFooter2 = null;
        }
        boolean z12 = tVar2.f321529e;
        mnzFloatingFooter2.setVisibility(z12 ? 0 : 8);
        Button button2 = competitiveVasFragment.f321475w0;
        (button2 != null ? button2 : null).setVisibility(z12 ? 8 : 0);
        return G0.f406611a;
    }
}
