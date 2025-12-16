package com.avito.android.advert.item.brandingGallery.block;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.brandingGallery.items.BrandingGalleryBlockElementItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.component.serp.FixedWidthLinearLayoutManager;

/* compiled from: BrandingGalleryBlockPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/block/c;", "LTV0/d;", "Lcom/avito/android/advert/item/brandingGallery/block/e;", "Lcom/avito/android/advert/item/brandingGallery/block/BrandingGalleryBlockItem;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<e, BrandingGalleryBlockItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        List<BrandingGalleryBlockElementItem> list = ((BrandingGalleryBlockItem) aVar).f74120b;
        float f12 = list.size() <= 1 ? 1.0f : 0.85f;
        int iC2 = eVar2.f74142d.c();
        RecyclerView recyclerView = eVar2.f74146h;
        int paddingStart = (int) (((iC2 - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd()) * f12);
        int i13 = eVar2.f74147i;
        if (paddingStart > i13) {
            paddingStart = i13;
        }
        recyclerView.setLayoutManager(new FixedWidthLinearLayoutManager(paddingStart, recyclerView.getContext()));
        ArrayList arrayList = eVar2.f74144f;
        arrayList.clear();
        arrayList.addAll(list);
        eVar2.f74140b.c(eVar2.f74145g);
        eVar2.f74141c.notifyDataSetChanged();
    }
}
