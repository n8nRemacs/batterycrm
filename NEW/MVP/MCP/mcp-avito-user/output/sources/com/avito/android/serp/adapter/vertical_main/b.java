package com.avito.android.serp.adapter.vertical_main;

import com.avito.android.remote.model.search.Filter;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;

/* compiled from: PromoBlockFilterPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/b;", "", "Action", "Lcom/avito/android/serp/adapter/vertical_main/p;", "Lcom/avito/android/serp/adapter/vertical_main/q;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b<Action> {
    void e0();

    @Y61.k
    C41981q0 f();

    @Y61.k
    e2 i();

    void invalidate();

    void j(@Y61.k Filter filter);

    void n(@Y61.k Filter filter, boolean z12);

    void o(@Y61.k Filter filter, @Y61.l Filter.InnerOptions.Options options);

    @Y61.k
    C41981q0 p();
}
