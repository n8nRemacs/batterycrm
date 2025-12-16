package com.avito.android.webview;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.avito.android.webview.x;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WebViewPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/webview/p;", "Lcom/avito/android/webview/x$a;", "a", "b", "c", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface p extends x.a {

    /* compiled from: WebViewPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/p$a;", "Lcom/avito/android/webview/p$c;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends c {

        /* compiled from: WebViewPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.webview.p$a$a, reason: collision with other inner class name */
        public static final class C10240a {
        }

        void V(@Y61.k Y41.l<? super Boolean, G0> lVar);

        void i0(@Y61.k ValueCallback<Uri[]> valueCallback);
    }

    /* compiled from: WebViewPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/p$b;", "", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: WebViewPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/p$c;", "", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: WebViewPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }
    }

    void K();

    void b(@Y61.k Uri uri);

    void c(@Y61.k D d12);

    void e(@Y61.k WebViewActivity webViewActivity);

    void f();

    void i0();
}
