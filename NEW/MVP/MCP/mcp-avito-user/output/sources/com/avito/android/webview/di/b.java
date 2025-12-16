package com.avito.android.webview.di;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.CalledFrom;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.webview.WebViewActivity;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: WebViewComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/webview/di/b;", "", "a", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: WebViewComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/di/b$a;", "", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k InterfaceC39417a interfaceC39417a);

        @k
        a b(@k c cVar);

        @k
        b build();

        @h31.b
        @k
        a c(@k Uri uri);

        @h31.b
        @k
        a d(@k WebViewLinkSettings webViewLinkSettings);

        @h31.b
        @k
        a e(@l CalledFrom calledFrom);
    }

    void a(@k WebViewActivity webViewActivity);
}
