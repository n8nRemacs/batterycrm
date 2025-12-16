package com.avito.android.blueprints.input;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: MultiStateInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/input/d;", "LTV0/f;", "Lcom/avito/android/blueprints/input/z;", "Lcom/avito/android/items/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d extends TV0.f<z, com.avito.android.items.d> {
    @Y61.k
    com.jakewharton.rxrelay3.c C();

    @Y61.k
    com.jakewharton.rxrelay3.c G();

    @Y61.k
    io.reactivex.rxjava3.core.z<com.avito.android.items.a> b();

    @Y61.k
    io.reactivex.rxjava3.core.z<Q<Boolean, com.avito.android.items.a>> n();

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> r();

    @Y61.k
    io.reactivex.rxjava3.core.z<DeepLink> y();
}
