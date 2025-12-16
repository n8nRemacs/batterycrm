package com.avito.android.info.ui;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/info/ui/m;", "Lcom/avito/android/info/ui/k;", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f170974a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Toolbar f170975b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WebView f170976c;

    public m(@Y61.k View view, @Y61.k c cVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f170975b = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.web_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView");
        }
        WebView webView = (WebView) viewFindViewById2;
        this.f170976c = webView;
        View viewFindViewById3 = view.findViewById(R.id.content_holder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((FrameLayout) viewFindViewById3, R.id.web_view, interfaceC28373a, 0, 0, 24, null);
        this.f170974a = lVar;
        lVar.f231600j = new l(cVar);
        toolbar.setNavigationOnClickListener(new com.avito.android.imv_similiar_adverts.h(cVar, 1));
        webView.getSettings().setDefaultTextEncodingName(Constants.ENCODING);
    }

    public final void a() {
        this.f170974a.j();
    }
}
