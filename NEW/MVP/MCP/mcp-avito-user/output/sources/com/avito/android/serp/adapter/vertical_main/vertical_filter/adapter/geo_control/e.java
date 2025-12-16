package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.vertical_main.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerticalSearchFilterGeoControlItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/geo_control/e;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/geo_control/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f273484b;

    @Inject
    public e(@k p pVar) {
        this.f273484b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String displayTitle;
        Filter.Widget widget;
        Filter.Config config;
        g gVar = (g) eVar;
        com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e eVar2 = (com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) aVar;
        Filter filter = eVar2.f273466c;
        String title = null;
        AttributedText attributedDisplayTitle = (filter == null || (widget = filter.getWidget()) == null || (config = widget.getConfig()) == null) ? null : config.getAttributedDisplayTitle();
        if (attributedDisplayTitle != null) {
            gVar.e(attributedDisplayTitle);
        } else {
            Filter filter2 = eVar2.f273466c;
            if (filter2 == null || (displayTitle = filter2.getDisplayTitle()) == null) {
                Filter filter3 = eVar2.f273466c;
                if (filter3 != null) {
                    title = filter3.getTitle();
                }
            } else {
                title = displayTitle;
            }
            gVar.V3(title);
        }
        gVar.setEnabled(eVar2.f273468e && eVar2.f273466c != null);
        gVar.a(new d(eVar2, this));
    }
}
