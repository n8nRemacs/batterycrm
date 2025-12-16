package com.avito.android.suggest_locations.di;

import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import nF.C44245a;

/* compiled from: SuggestLocationsDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/di/r;", "Lcom/avito/android/di/h;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.c
/* loaded from: classes4.dex */
public interface r extends InterfaceC29971h {
    @Y61.k
    PublishIntentFactory C1();

    @Y61.k
    I1 H();

    @Y61.k
    C44245a R0();

    @Y61.k
    InterfaceC35745a5 T5();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    com.avito.android.geo_common.interactor.g u0();
}
