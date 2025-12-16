package com.avito.android.widget_filters.domain.use_case;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GetSuggestedLocationsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/use_case/c;", "Lcom/avito/android/widget_filters/domain/use_case/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f329913a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f329914b;

    @Inject
    public c(@Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k R0 r02) {
        this.f329913a = gVar;
        this.f329914b = r02;
    }

    @Override // com.avito.android.widget_filters.domain.use_case.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k String str) {
        return C43175k.I(this.f329914b.a(), C43175k.G(new b(this, str, null)));
    }
}
