package com.avito.android.favorite;

import com.avito.android.remote.model.AdvertisementVerticalAlias;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/h;", "Lcom/avito/android/favorite/g;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface h extends InterfaceC30573g {

    /* compiled from: FavoriteAdvertsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    W b(@Y61.k String str, boolean z12);

    @Y61.k
    W d(@Y61.k List list);

    @Y61.k
    ArrayList e(@Y61.k ArrayList arrayList);

    @Y61.k
    Map<String, Boolean> f(@Y61.k List<String> list);

    @Y61.k
    C42026y g(@Y61.k String str, @Y61.k AbstractC30567a abstractC30567a, boolean z12, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l Double d12, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z13);
}
