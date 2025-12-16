package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: QueryItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query/f;", "LTV0/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query/g;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements TV0.f<g, a> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.getClass();
        PrintableText printableText = aVar2.f221087e;
        Context context = gVar.f221103c;
        I5.a(gVar.f221104d, printableText.k0(context), false);
        int i13 = aVar2.f221090h ? R.attr.textIconExpandLess : R.attr.textIconExpandMore;
        FV.a.f4720a.getClass();
        FV.a.c(gVar.f221105e, i13);
        gVar.B80(aVar2);
        PrintableText printableText2 = aVar2.f221088f;
        gVar.f221110j.b(printableText2 != null ? printableText2.k0(context) : null);
        gVar.f221111k = aVar2;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        a.C6685a c6685a;
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Object objG = C42745f0.G(list);
        if (objG != null) {
            if (!(objG instanceof a.C6685a)) {
                objG = null;
            }
            c6685a = (a.C6685a) objG;
        } else {
            c6685a = null;
        }
        int i13 = R.attr.textIconExpandMore;
        if (c6685a == null) {
            gVar.getClass();
            PrintableText printableText = aVar2.f221087e;
            Context context = gVar.f221103c;
            I5.a(gVar.f221104d, printableText.k0(context), false);
            if (aVar2.f221090h) {
                i13 = R.attr.textIconExpandLess;
            }
            FV.a.f4720a.getClass();
            FV.a.c(gVar.f221105e, i13);
            gVar.B80(aVar2);
            PrintableText printableText2 = aVar2.f221088f;
            gVar.f221110j.b(printableText2 != null ? printableText2.k0(context) : null);
            gVar.f221111k = aVar2;
            return;
        }
        Iterator it = c6685a.f221092a.iterator();
        while (it.hasNext()) {
            a.b bVar = (a.b) it.next();
            if (bVar instanceof a.b.C6687b) {
                gVar.getClass();
                int i14 = aVar2.f221090h ? R.attr.textIconExpandLess : R.attr.textIconExpandMore;
                FV.a.f4720a.getClass();
                FV.a.c(gVar.f221105e, i14);
            } else if (bVar instanceof a.b.C6686a) {
                gVar.B80(aVar2);
            } else if (bVar instanceof a.b.c) {
                gVar.B80(aVar2);
            } else if (bVar instanceof a.b.d) {
                gVar.getClass();
                I5.a(gVar.f221104d, aVar2.f221087e.k0(gVar.f221103c), false);
            } else if (bVar instanceof a.b.e) {
                gVar.getClass();
                PrintableText printableText3 = aVar2.f221088f;
                gVar.f221110j.b(printableText3 != null ? printableText3.k0(gVar.f221103c) : null);
            }
        }
        gVar.f221111k = aVar2;
    }
}
