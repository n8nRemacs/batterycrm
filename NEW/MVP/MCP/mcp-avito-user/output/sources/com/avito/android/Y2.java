package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;

/* compiled from: WebViewFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/Y2;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y2 extends A0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f67590f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f67591b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f67592c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f67593d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f67594e;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(Y2.class, "webViewDebug", "getWebViewDebug()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f67590f = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(Y2.class, "enableWebLandingEvent", "getEnableWebLandingEvent()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(Y2.class, "cameraPermissionForWebView", "getCameraPermissionForWebView()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(Y2.class, "addHeadersToWebviewFeature", "getAddHeadersToWebviewFeature()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public Y2() {
        Owners owners = Owners.f210440R0;
        Boolean bool = Boolean.FALSE;
        this.f67591b = A0.u(this, "WebView debug enabled", "webViewDebug", bool, false, 0, owners, 40);
        this.f67592c = A0.u(this, "Enable sending the 2619 event", "ma_enableWebLandingEvent", bool, true, 0, owners, 40);
        this.f67593d = A0.u(this, "Разрешаем использовать камеру внутри webView", "allowCameraPermissionForWebView", bool, false, 0, Owners.f210413H3, 56);
        this.f67594e = A0.u(this, "Добавляем хедеры X-Platform, X-Route и X-AppVer в WebView", "addHeadersToWebviewFeature", bool, false, 0, Owners.f210477d0, 56);
    }
}
