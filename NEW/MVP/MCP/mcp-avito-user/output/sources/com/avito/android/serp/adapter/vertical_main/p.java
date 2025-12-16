package com.avito.android.serp.adapter.vertical_main;

import com.avito.android.bxcontent.Y0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.J;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.VerticalFilterState;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;

/* compiled from: PromoBlockFilterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/p;", "Lcom/avito/android/serp/adapter/vertical_main/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface p extends b<DeepLink> {

    /* compiled from: PromoBlockFilterPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void b(@Y61.k Y0 y02);

    void c(@Y61.k Y41.a<Integer> aVar);

    @Y61.k
    C41981q0 d();

    @Y61.l
    VerticalFilterState d0();

    @Y61.k
    e2 e();

    @Y61.k
    e2 g();

    void h(@Y61.k J j12, @Y61.k VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem, int i12);

    void i0();

    void j0();

    void k(@Y61.k String str, @Y61.k List<? extends ParcelableEntity<String>> list);

    @Y61.k
    e2 m();

    void q(@Y61.k Y41.p<? super String, ? super String, G0> pVar);
}
