package com.avito.android.serp.adapter.model_card;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ModelCardWidgetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/j;", "Lcom/avito/android/serp/adapter/model_card/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f270431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f270432c;

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f270431b = aVar;
        this.f270432c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        ModelCardWidget modelCardWidget = (ModelCardWidget) aVar;
        int i13 = modelCardWidget.f270397e != null ? R.drawable.arrow_right : 0;
        lVar.b(modelCardWidget.f270395c);
        lVar.eh(i13);
        lVar.j(modelCardWidget.f270396d);
        lVar.s1(modelCardWidget.f270398f);
        lVar.F40(new h(i12, modelCardWidget, this));
        lVar.fX(new i(i12, modelCardWidget, this));
    }
}
