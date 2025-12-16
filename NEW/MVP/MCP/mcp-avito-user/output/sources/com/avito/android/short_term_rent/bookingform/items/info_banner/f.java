package com.avito.android.short_term_rent.bookingform.items.info_banner;

import com.avito.android.short_term_rent.bookingform.items.info_banner.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/info_banner/f;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/info_banner/h;", "Lcom/avito/android/short_term_rent/bookingform/items/info_banner/InfoBannerItem;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements TV0.f<h, InfoBannerItem> {
    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        InfoBannerItem infoBannerItem = (InfoBannerItem) aVar;
        hVar.i(infoBannerItem.f281528d);
        hVar.r(infoBannerItem.f281527c);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        InfoBannerItem infoBannerItem = (InfoBannerItem) aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof c) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            hVar.i(infoBannerItem.f281528d);
            hVar.r(infoBannerItem.f281527c);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar instanceof c.a) {
                hVar.i(((c.a) cVar).f281533a);
            } else if (cVar instanceof c.b) {
                hVar.r(((c.b) cVar).f281534a);
            }
        }
    }
}
