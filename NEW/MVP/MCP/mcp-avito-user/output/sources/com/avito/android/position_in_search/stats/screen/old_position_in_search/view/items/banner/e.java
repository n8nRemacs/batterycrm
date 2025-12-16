package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.BannerItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BannerItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/e;", "LTV0/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<f, BannerItem> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        BannerItem bannerItem = (BannerItem) aVar;
        fVar.getClass();
        PrintableText printableText = bannerItem.f220856c;
        Context context = fVar.f220884c;
        fVar.f220887f.setText(printableText.k0(context));
        fVar.B80(bannerItem);
        I5.a(fVar.f220889h, bannerItem.f220857d.k0(context), false);
        fVar.C80(bannerItem);
        fVar.f220888g.setVisibility(bannerItem.f220860g != null ? 0 : 8);
        boolean z12 = bannerItem.f220861h;
        fVar.f220885d.setVisibility(z12 ? 4 : 0);
        fVar.f220892k.setVisibility(z12 ? 0 : 8);
        fVar.f220883b = bannerItem;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        BannerItem bannerItem = (BannerItem) aVar;
        Object objG = C42745f0.G(list);
        BannerItem.a aVar2 = null;
        if (objG != null) {
            if (!(objG instanceof BannerItem.a)) {
                objG = null;
            }
            aVar2 = (BannerItem.a) objG;
        }
        if (aVar2 == null) {
            fVar.getClass();
            PrintableText printableText = bannerItem.f220856c;
            Context context = fVar.f220884c;
            fVar.f220887f.setText(printableText.k0(context));
            fVar.B80(bannerItem);
            I5.a(fVar.f220889h, bannerItem.f220857d.k0(context), false);
            fVar.C80(bannerItem);
            fVar.f220888g.setVisibility(bannerItem.f220860g != null ? 0 : 8);
            boolean z12 = bannerItem.f220861h;
            fVar.f220885d.setVisibility(z12 ? 4 : 0);
            fVar.f220892k.setVisibility(z12 ? 0 : 8);
            fVar.f220883b = bannerItem;
            return;
        }
        Iterator it = aVar2.f220873a.iterator();
        while (it.hasNext()) {
            BannerItem.b bVar = (BannerItem.b) it.next();
            if (L.f(bVar, BannerItem.b.a.f220874a)) {
                fVar.C80(bannerItem);
            } else if (L.f(bVar, BannerItem.b.c.f220876a)) {
                fVar.getClass();
                I5.a(fVar.f220889h, bannerItem.f220857d.k0(fVar.f220884c), false);
            } else if (L.f(bVar, BannerItem.b.d.f220877a)) {
                fVar.getClass();
                fVar.f220885d.setVisibility(bannerItem.f220861h ? 4 : 0);
                fVar.f220892k.setVisibility(bannerItem.f220861h ? 0 : 8);
            } else if (L.f(bVar, BannerItem.b.e.f220878a)) {
                fVar.B80(bannerItem);
            } else if (L.f(bVar, BannerItem.b.f.f220879a)) {
                fVar.getClass();
                fVar.f220887f.setText(bannerItem.f220856c.k0(fVar.f220884c));
            } else if (L.f(bVar, BannerItem.b.C6670b.f220875a)) {
                fVar.getClass();
                fVar.f220888g.setVisibility(bannerItem.f220860g != null ? 0 : 8);
            }
        }
        fVar.f220883b = bannerItem;
    }
}
