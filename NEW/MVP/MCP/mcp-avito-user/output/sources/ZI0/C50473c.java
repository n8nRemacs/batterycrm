package zI0;

import II0.d;
import MI0.d;
import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import java.util.Collections;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileHeaderStateBinder.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-adverts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: zI0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50473c {
    @l
    public static final h.g a(@k AI0.c cVar) {
        II0.d dVar = cVar.f270b;
        d.a aVar = dVar.f8103b;
        boolean z12 = aVar instanceof d.a.C0458d;
        C42822w c42822w = null;
        int i12 = 0;
        MI0.d dVar2 = cVar.f269a;
        if (z12 && (dVar2.f10579c instanceof d.a.e)) {
            return new h.g(C42784z0.f406748b, i12, 2, c42822w);
        }
        if (!(aVar instanceof d.a.c) || !(dVar2.f10579c instanceof d.a.C0673d)) {
            d.a aVar2 = dVar2.f10579c;
            boolean z13 = (aVar2 instanceof d.a.c) || (aVar2 instanceof d.a.C0672a) || (aVar2 instanceof d.a.b);
            if ((!(aVar instanceof d.a.C0457a) && !(aVar instanceof d.a.b)) || !z13) {
                return null;
            }
        }
        kotlin.collections.builders.b bVarT = C42745f0.t();
        d.a aVar3 = dVar.f8103b;
        bVarT.addAll(aVar3 instanceof d.a.b ? ((d.a.b) aVar3).f8117l : aVar3 instanceof d.a.c ? ((d.a.c) aVar3).f8118a : C42784z0.f406748b);
        d.a aVar4 = dVar2.f10579c;
        bVarT.addAll(aVar4 instanceof d.a.c ? Collections.singletonList(((d.a.c) aVar4).f10583a) : aVar4 instanceof d.a.C0673d ? C42745f0.V(((d.a.C0673d) aVar4).f10584a) : C42784z0.f406748b);
        kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
        ListIterator listIterator = bVarP.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                i12 = -1;
                break;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a aVar5 = (com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a) listIterator.next();
            if (aVar5 instanceof PanelCardItem) {
                PanelCardItem panelCardItem = (PanelCardItem) aVar5;
                if (panelCardItem.getF9898d() || panelCardItem.getF9899e() != null) {
                    break;
                }
            }
            i12++;
        }
        return new h.g(bVarP, i12);
    }
}
