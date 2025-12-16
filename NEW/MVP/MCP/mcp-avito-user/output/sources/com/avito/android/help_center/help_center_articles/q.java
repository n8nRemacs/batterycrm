package com.avito.android.help_center.help_center_articles;

import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.yatatsu.powerwebview.PowerWebView;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: HelpCenterArticlesView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/help_center/help_center_articles/q;", "Lcom/avito/android/help_center/help_center_articles/n;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f161753a = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f161754b = C42727D.c(new p(this));

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.view.d f161755c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f161756d;

    public q(@Y61.k ViewGroup viewGroup, @Y61.k InterfaceC28373a interfaceC28373a) {
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        this.f161755c = new com.avito.android.ui.view.d((PowerWebView) viewGroup.findViewById(R.id.webview));
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewGroup.findViewById(R.id.content_holder), R.id.webview, interfaceC28373a, 0, 0, 24, null);
        this.f161756d = lVar;
        toolbar.setNavigationIcon(R.drawable.ic_back_24_blue);
        toolbar.setNavigationOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 18));
        lVar.f231600j = new o(this);
    }
}
