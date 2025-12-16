package com.avito.android.early_access.mvi;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.v;
import com.avito.android.early_access.adapter.banner.EarlyAccessBannerItem;
import com.avito.android.early_access.adapter.description.EarlyAccessDescriptionItem;
import com.avito.android.early_access.adapter.price_info.EarlyAccessPriceInfoItem;
import com.avito.android.early_access.adapter.short_price.carousel.EarlyAccessShortPricesCarouselItem;
import com.avito.android.early_access.adapter.short_price.element.EarlyAccessShortPriceItem;
import com.avito.android.early_access.adapter.title.EarlyAccessTitleItem;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.entity.ButtonContent;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import com.avito.android.early_access.mvi.entity.PopupContentType;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: EarlyAccessScreenPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145432l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(int i12) {
        super(2);
        this.f145432l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145432l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1699795083);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            List<ReEarlyAccessData.Package> listD = f0.d();
            ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
            int i12 = 0;
            for (Object obj : listD) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList.add(new EarlyAccessShortPriceItem((ReEarlyAccessData.Package) obj, i12 == 0));
                i12 = i13;
            }
            EarlyAccessShortPricesCarouselItem earlyAccessShortPricesCarouselItem = new EarlyAccessShortPricesCarouselItem(null, arrayList, 1, null);
            ButtonContent buttonContent = new ButtonContent("Продолжить", null, null, 6, null);
            kotlin.collections.builders.b bVarT = C42745f0.t();
            bVarT.add(new EarlyAccessTitleItem(null, "Свяжитесь сейчас от*129*₽", null, 5, null));
            bVarT.add(new EarlyAccessDescriptionItem(null, f0.b(), 1, null));
            bVarT.add(new EarlyAccessBannerItem(null, "Это объявление от*собственника, такое жильё уходит быстро", new Image(P0.c()), null, 9, null));
            bVarT.addAll(f0.e(false));
            bVarT.add(earlyAccessShortPricesCarouselItem);
            bVarT.add(new EarlyAccessPriceInfoItem(null, "Количество объявлений, в*которых вы*сможете открыть телефон и*чат с*собственником", 1, null));
            EarlyAccessState.Content content = new EarlyAccessState.Content(buttonContent, f0.c(), C42745f0.p(bVarT), PopupContentType.Default.f145482b, false, false, 48, null);
            Y y12 = Y.f145431l;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            A.a(content, y12, androidx.compose.foundation.A.b(aVar, X2.b.f18125d.c(bE2), Y0.f39346a), bE2, 56, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Z(iA2);
        }
        return G0.f406611a;
    }
}
