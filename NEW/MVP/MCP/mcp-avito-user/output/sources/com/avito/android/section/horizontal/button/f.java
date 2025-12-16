package com.avito.android.section.horizontal.button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.section.horizontal.button.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HorizontalSectionButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/horizontal/button/f;", "Lcom/avito/android/section/horizontal/button/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f264700b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e.a f264701c;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k e.a aVar2) {
        this.f264700b = aVar;
        this.f264701c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        HorizontalSectionButtonItem horizontalSectionButtonItem = (HorizontalSectionButtonItem) aVar;
        ((c) eVar).q60(horizontalSectionButtonItem.f264690d, new m(2, horizontalSectionButtonItem, this));
    }
}
