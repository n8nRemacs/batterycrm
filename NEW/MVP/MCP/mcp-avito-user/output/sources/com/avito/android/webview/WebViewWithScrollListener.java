package com.avito.android.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewWithScrollListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/WebViewWithScrollListener;", "Landroid/webkit/WebView;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebViewWithScrollListener extends WebView {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f329534b;

    @X41.j
    public WebViewWithScrollListener(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i12, int i13, int i14, int i15) {
        super.onScrollChanged(i12, i13, i14, i15);
        Iterator it = this.f329534b.iterator();
        while (it.hasNext()) {
            ((l41.i) it.next()).a(Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
        }
    }

    public WebViewWithScrollListener(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f329534b = new ArrayList();
    }
}
