package com.avito.android.serp.adapter.vertical_main.cv.cv_display;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.cv.CvDisplayAction;
import com.avito.android.search.filter.adapter.select.m;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: CvDisplayItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_display/h;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/cv/cv_display/j;", "Lcom/avito/android/serp/adapter/vertical_main/cv/cv_display/CvDisplayItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements TV0.d<j, CvDisplayItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f272791b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272792c;

    @Inject
    public h(@k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k h31.e eVar) {
        this.f272791b = eVar;
        this.f272792c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        CvDisplayItem cvDisplayItem = (CvDisplayItem) aVar;
        jVar.f272796b.setText(cvDisplayItem.f272768c);
        jVar.f272798d.i(cvDisplayItem.f272769d, new e(cvDisplayItem, this), new f(cvDisplayItem, this));
        g gVar = new g(this, i12, cvDisplayItem);
        CvDisplayAction cvDisplayAction = cvDisplayItem.f272770e;
        String title = cvDisplayAction != null ? cvDisplayAction.getTitle() : null;
        Button button = jVar.f272797c;
        com.avito.android.lib.design.button.b.a(button, title, false);
        if (cvDisplayAction == null || cvDisplayAction.getDeeplink() == null) {
            return;
        }
        button.setOnClickListener(new m(23, gVar, cvDisplayAction));
    }
}
