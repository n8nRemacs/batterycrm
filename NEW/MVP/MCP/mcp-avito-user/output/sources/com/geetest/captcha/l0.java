package com.geetest.captcha;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.geetest.captcha.views.GTC4WebView;
import com.geetest.captcha.w;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/geetest/captcha/views/WebViewBuilder;", "", "Lcom/geetest/captcha/views/WebViewBuilder$Builder;", "builder", "<init>", "(Lcom/geetest/captcha/views/WebViewBuilder$Builder;)V", "loadUrl", "()Lcom/geetest/captcha/views/WebViewBuilder;", "Lcom/geetest/captcha/observer/WebViewObservable;", "observable", "Lkotlin/G0;", "setObservable", "(Lcom/geetest/captcha/observer/WebViewObservable;)V", "Lcom/geetest/captcha/views/WebViewBuilder$JSInterface;", "jsInterface", "Lcom/geetest/captcha/views/WebViewBuilder$JSInterface;", "Lcom/geetest/captcha/observer/WebViewObservable;", "", ContextActionHandler.Link.URL, "Ljava/lang/String;", "Lcom/geetest/captcha/views/GTC4WebView;", "webView", "Lcom/geetest/captcha/views/GTC4WebView;", "getWebView", "()Lcom/geetest/captcha/views/GTC4WebView;", "Builder", "JSInterface", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f342749a;

    /* renamed from: b, reason: collision with root package name */
    public y f342750b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GTC4WebView f342751c;

    /* renamed from: d, reason: collision with root package name */
    public b f342752d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f342753a;

        /* renamed from: b, reason: collision with root package name */
        public y f342754b;

        /* renamed from: c, reason: collision with root package name */
        public GTC4WebView f342755c;

        @Y61.k
        public final y a() {
            return this.f342754b;
        }

        @Y61.k
        public final String b() {
            return this.f342753a;
        }

        @Y61.k
        public final GTC4WebView c() {
            return this.f342755c;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\tR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/geetest/captcha/views/WebViewBuilder$JSInterface;", "", "", ContextActionHandler.Link.URL, "Lcom/geetest/captcha/views/GTC4WebView;", "webView", "Lcom/geetest/captcha/observer/WebViewObservable;", "observable", "<init>", "(Ljava/lang/String;Lcom/geetest/captcha/views/GTC4WebView;Lcom/geetest/captcha/observer/WebViewObservable;)V", "response", "Lkotlin/G0;", "gt4Notify", "(Ljava/lang/String;)V", "setObservable", "Lcom/geetest/captcha/observer/WebViewObservable;", "Ljava/lang/String;", "Lcom/geetest/captcha/views/GTC4WebView;", "captcha_release"}, k = 1, mv = {1, 4, 1})
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f342756a;

        /* renamed from: b, reason: collision with root package name */
        public GTC4WebView f342757b;

        /* renamed from: c, reason: collision with root package name */
        public y f342758c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f342760b;

            /* renamed from: com.geetest.captcha.l0$b$a$a, reason: collision with other inner class name */
            public static final class C10551a<T> implements ValueCallback<String> {

                /* renamed from: a, reason: collision with root package name */
                public static final C10551a f342761a = new C10551a();

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    h0.f342732d.a("WebViewBuilder javascript:jsBridge.callback('postNativeMessage') return: " + str);
                }
            }

            public a(String str) {
                this.f342760b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.f342757b.evaluateJavascript(AK.c.s(new StringBuilder("javascript:jsBridge.callback('postNativeMessage', '"), this.f342760b, "')"), C10551a.f342761a);
            }
        }

        public b(@Y61.k String str, @Y61.k GTC4WebView gTC4WebView, @Y61.k y yVar) {
            this.f342756a = str;
            this.f342757b = gTC4WebView;
            this.f342758c = yVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void gt4Notify(@Y61.l String response) throws JSONException {
            String strB;
            h0 h0Var = h0.f342732d;
            StringBuilder sbA = androidx.appcompat.app.r.A("JSInterface.gt4Notify: ", response, ", main: ");
            sbA.append(L.f(Looper.getMainLooper(), Looper.myLooper()));
            h0Var.c(sbA.toString());
            if (response == null || C43066x.K(response)) {
                y yVar = this.f342758c;
                String str = d0.WEB_CALLBACK_ERROR.getType() + "80";
                String str2 = e0.f342709a;
                w.a aVar = w.f342797d;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", "The Web callback data is empty");
                G0 g02 = G0.f406611a;
                yVar.a(str, str2, jSONObject);
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(response);
                String string = jSONObject2.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -934426595:
                            if (string.equals("result")) {
                                this.f342758c.a(true, jSONObject2.getJSONObject("data").toString());
                                return;
                            }
                            break;
                        case 102230:
                            if (string.equals("get")) {
                                try {
                                    if (!L.f(Looper.getMainLooper(), Looper.myLooper()) && (this.f342757b.getContext() instanceof Activity) && (strB = a0.f342693b.b(this.f342757b.getContext(), this.f342756a)) != null && !C43066x.K(strB)) {
                                        Context context = this.f342757b.getContext();
                                        if (context == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                                        }
                                        ((Activity) context).runOnUiThread(new a(strB));
                                        return;
                                    }
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            break;
                        case 3135262:
                            if (string.equals("fail")) {
                                this.f342758c.a(false, jSONObject2.getJSONObject("data").toString());
                                return;
                            }
                            break;
                        case 94756344:
                            if (string.equals("close")) {
                                Iterator<z> it = this.f342758c.f342803a.iterator();
                                while (it.hasNext()) {
                                    it.next().b();
                                }
                                return;
                            }
                            break;
                        case 96784904:
                            if (string.equals("error")) {
                                String string2 = jSONObject2.getJSONObject("data").toString();
                                y yVar2 = this.f342758c;
                                if (yVar2 == null) {
                                    throw null;
                                }
                                Iterator<z> it2 = yVar2.f342803a.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(string2);
                                }
                                return;
                            }
                            break;
                        case 108386723:
                            if (string.equals("ready")) {
                                Iterator<z> it3 = this.f342758c.f342803a.iterator();
                                while (it3.hasNext()) {
                                    it3.next().a();
                                }
                                return;
                            }
                            break;
                    }
                }
                y yVar3 = this.f342758c;
                String str3 = d0.WEB_CALLBACK_ERROR.getType() + "82";
                String str4 = e0.f342709a;
                w.a aVar2 = w.f342797d;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("description", jSONObject2);
                G0 g03 = G0.f406611a;
                yVar3.a(str3, str4, jSONObject3);
            } catch (Exception e13) {
                e13.printStackTrace();
                y yVar4 = this.f342758c;
                String str5 = d0.WEB_CALLBACK_ERROR.getType() + "81";
                String str6 = e0.f342709a;
                w.a aVar3 = w.f342797d;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("exception", e13.getMessage());
                jSONObject4.put("description", response);
                G0 g04 = G0.f406611a;
                yVar4.a(str5, str6, jSONObject4);
            }
        }
    }

    public l0(a aVar) {
        this.f342749a = aVar.b();
        this.f342750b = aVar.a();
        this.f342751c = aVar.c();
    }

    @Y61.k
    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public final l0 a() {
        b bVar = new b(this.f342749a, this.f342751c, this.f342750b);
        this.f342752d = bVar;
        this.f342751c.addJavascriptInterface(bVar, "JSInterface");
        this.f342751c.buildLayer();
        this.f342751c.loadUrl(this.f342749a);
        this.f342751c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this;
    }
}
