package com.avito.android.item_map.routes;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.item_map.remote.model.route.Type;
import com.avito.android.item_map.view.V;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: RoutesPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/routes/k;", "", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface k {
    void I();

    void a(@Y61.l V v12);

    void b(@Y61.k AvitoMapPoint avitoMapPoint, boolean z12);

    void c(@Y61.l d dVar);

    void d(boolean z12);

    @Y61.k
    Kundle d0();

    boolean e();

    @Y61.k
    Type f();

    void g(@Y61.k Button button);
}
