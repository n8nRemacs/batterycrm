package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: DevelopmentXlListItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/C;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/A;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements A {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f270892b;

    public C(@Y61.k h31.e<InterfaceC47690b> eVar) {
        this.f270892b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        E e12 = (E) eVar;
        DevelopmentXlItem developmentXlItem = (DevelopmentXlItem) aVar;
        e12.setTitle(developmentXlItem.f270914d);
        e12.p(developmentXlItem.f270916f);
        List<Image> list = developmentXlItem.f270921k;
        Image image = list != null ? (Image) C42745f0.E(list) : null;
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        if (aVarB != null) {
            InterfaceC34846e.a.a(e12, aVarB, null, 6);
        }
        Image image2 = list != null ? (Image) C42745f0.K(1, list) : null;
        com.avito.android.image_loader.a aVarB2 = image2 != null ? com.avito.android.image_loader.b.b(image2) : null;
        if (aVarB2 != null) {
            e12.jM(aVarB2);
        }
        Image image3 = list != null ? (Image) C42745f0.K(2, list) : null;
        com.avito.android.image_loader.a aVarB3 = image3 != null ? com.avito.android.image_loader.b.b(image3) : null;
        if (aVarB3 != null) {
            e12.ME(aVarB3);
        }
        SerpBadgeBar serpBadgeBar = developmentXlItem.f270926p;
        e12.vd(serpBadgeBar != null ? Q81.b.d(serpBadgeBar) : null);
        List<String> list2 = developmentXlItem.f270925o;
        if (list2 != null) {
            e12.i1(C42745f0.O(list2, "\n", null, null, null, 62));
        }
        List<GeoReference> list3 = developmentXlItem.f270924n;
        e12.Q5(list3 != null ? (GeoReference) C42745f0.E(list3) : null);
        e12.l3(developmentXlItem.f270915e);
        e12.c(new B(this, developmentXlItem));
    }
}
