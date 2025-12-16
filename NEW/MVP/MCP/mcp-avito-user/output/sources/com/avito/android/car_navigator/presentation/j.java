package com.avito.android.car_navigator.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.progress_overlay.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarNavigatorView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/presentation/j;", "Lcom/avito/android/car_navigator/presentation/c;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f115262a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WebView f115263b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f115264c;

    public j(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.toolbar_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f115262a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.web_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView");
        }
        WebView webView = (WebView) viewFindViewById2;
        this.f115263b = webView;
        View viewFindViewById3 = view.findViewById(R.id.content_holder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f115264c = new l((ViewGroup) viewFindViewById3, R.id.web_view, null, 0, 0, 28, null);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
    }
}
