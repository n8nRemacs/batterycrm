package com.avito.android.bxcontent;

import com.avito.android.bxcontent.Q1;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VacancyInfoProviderImpl.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/S1;", "Lcom/avito/android/bxcontent/Q1;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class S1 implements Q1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f109430a;

    @Inject
    public S1(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f109430a = interfaceC35745a5;
    }

    public static Q1.a b(String str, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            if (aVar instanceof AdvertItem) {
                AdvertItem advertItem = (AdvertItem) aVar;
                if (kotlin.jvm.internal.L.f(advertItem.f268425c, str)) {
                    Integer num = advertItem.f268453o0;
                    return new Q1.a(str, advertItem.f268428d, advertItem.f268420a0, num != null ? num.toString() : null, advertItem.f268467v0);
                }
            }
            if (aVar instanceof AdvertXlItem) {
                AdvertXlItem advertXlItem = (AdvertXlItem) aVar;
                if (kotlin.jvm.internal.L.f(advertXlItem.f268777c, str)) {
                    return new Q1.a(str, advertXlItem.f268793k, advertXlItem.f268776b0, null, advertXlItem.f268782e0);
                }
            }
            if (aVar instanceof CarouselWidgetItem) {
                Q1.a aVarB = b(str, ((CarouselWidgetItem) aVar).f269249f);
                if (aVarB != null) {
                    return aVarB;
                }
            } else {
                if (aVar instanceof FavoriteAdvertItem) {
                    FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVar;
                    return new Q1.a(str, favoriteAdvertItem.f156405c, String.valueOf(favoriteAdvertItem.f156413k), null, false);
                }
                if (aVar instanceof ConstructorAdvertItem) {
                    String f116595b = aVar.getF116595b();
                    ConstructorAdvertItem constructorAdvertItem = (ConstructorAdvertItem) aVar;
                    String title = constructorAdvertItem.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String str2 = title;
                    Integer categoryId = constructorAdvertItem.getCategoryId();
                    return new Q1.a(f116595b, str2, categoryId != null ? categoryId.toString() : null, null, false);
                }
            }
        }
    }

    @Override // com.avito.android.bxcontent.Q1
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.maybe.h0 a(@Y61.k final List list, @Y61.k final String str, @Y61.l final SearchParams searchParams) {
        return new io.reactivex.rxjava3.internal.operators.maybe.K(new Callable() { // from class: com.avito.android.bxcontent.R1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f109425b.getClass();
                Q1.a aVarB = S1.b(str, list);
                if (aVarB == null) {
                    return null;
                }
                if (!kotlin.jvm.internal.L.f(aVarB.f109422c, "111")) {
                    aVarB = null;
                }
                if (aVarB == null) {
                    return null;
                }
                SearchParams searchParams2 = searchParams;
                String locationId = searchParams2 != null ? searchParams2.getLocationId() : null;
                if (aVarB.f109423d != null || locationId == null) {
                    return aVarB;
                }
                return new Q1.a(aVarB.f109420a, aVarB.f109421b, aVarB.f109422c, locationId, aVarB.f109424e);
            }
        }).p(this.f109430a.c());
    }
}
