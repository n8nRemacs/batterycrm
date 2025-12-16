package com.avito.android.comfortable_deal.deal.item.commenttabs;

import Ep.InterfaceC13517a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deal.item.commenttabs.a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommentTabsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commenttabs/j;", "LTV0/f;", "Lcom/avito/android/comfortable_deal/deal/item/commenttabs/l;", "Lcom/avito/android/comfortable_deal/deal/item/commenttabs/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements TV0.f<l, f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13517a, G0> f121327b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super InterfaceC13517a, G0> lVar) {
        this.f121327b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (f) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        f fVar = (f) aVar;
        G0 g02 = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                boolean z12 = ((a) it.next()) instanceof a.C3580a;
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            k(lVar, fVar);
        }
    }

    public final void k(@Y61.k l lVar, @Y61.k f fVar) {
        List<CommentTab> list = fVar.f121321c;
        CommentTab commentTab = fVar.f121322d;
        lVar.P0(list.indexOf(commentTab), list);
        lVar.RV(commentTab == CommentTab.f121308c || commentTab == CommentTab.f121309d);
        lVar.N1(new h(lVar, this, fVar));
        lVar.qQ(new i(this));
    }
}
