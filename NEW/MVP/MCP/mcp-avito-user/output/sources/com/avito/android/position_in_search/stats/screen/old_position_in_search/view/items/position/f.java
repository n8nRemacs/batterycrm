package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PositionItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/f;", "LTV0/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/g;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements TV0.f<g, a> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.getClass();
        gVar.f221075d.setText(aVar2.f221057c.k0(gVar.f221074c));
        AttributedText attributedText = aVar2.f221058d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(gVar.f221082k);
        }
        j.a(gVar.f221076e, attributedText, gVar.f221073b);
        gVar.B80(aVar2.f221059e);
        gVar.f221083l = aVar2;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Object objG = C42745f0.G(list);
        a.b bVar = null;
        if (objG != null) {
            if (!(objG instanceof a.b)) {
                objG = null;
            }
            bVar = (a.b) objG;
        }
        if (bVar == null) {
            gVar.getClass();
            gVar.f221075d.setText(aVar2.f221057c.k0(gVar.f221074c));
            AttributedText attributedText = aVar2.f221058d;
            if (attributedText != null) {
                attributedText.setOnDeepLinkClickListener(gVar.f221082k);
            }
            j.a(gVar.f221076e, attributedText, gVar.f221073b);
            gVar.B80(aVar2.f221059e);
            gVar.f221083l = aVar2;
            return;
        }
        Iterator it = bVar.f221065a.iterator();
        while (it.hasNext()) {
            a.c cVar = (a.c) it.next();
            if (cVar instanceof a.c.C6683a) {
                gVar.getClass();
                AttributedText attributedText2 = aVar2.f221058d;
                if (attributedText2 != null) {
                    attributedText2.setOnDeepLinkClickListener(gVar.f221082k);
                }
                j.a(gVar.f221076e, aVar2.f221058d, gVar.f221073b);
            } else if (cVar instanceof a.c.b) {
                gVar.B80(aVar2.f221059e);
            } else if (cVar instanceof a.c.d) {
                gVar.getClass();
                gVar.f221075d.setText(aVar2.f221057c.k0(gVar.f221074c));
            } else {
                boolean z12 = cVar instanceof a.c.C6684c;
            }
        }
        gVar.f221083l = aVar2;
    }
}
