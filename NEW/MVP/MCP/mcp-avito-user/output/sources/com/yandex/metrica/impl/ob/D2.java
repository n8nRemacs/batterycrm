package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaInitializerJsInterface;
import com.yandex.metrica.AppMetricaJsInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class D2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38986mm<C38737cm>> f377926a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private C38737cm f377927b;

    public class a implements InterfaceC38986mm<C38737cm> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f377928a;

        public a(D2 d22, String str) {
            this.f377928a = str;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(C38737cm c38737cm) {
            C38737cm c38737cm2 = c38737cm;
            if (c38737cm2.isEnabled()) {
                c38737cm2.w(this.f377928a);
            }
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void a(@j.N WebView webView, @j.N Uf uf2) {
        if (!A2.a(17)) {
            a("WebView interface is not available on Android < 17.");
            return;
        }
        try {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                a("WebView interface setup failed because javascript is disabled for the WebView.");
                return;
            }
            webView.addJavascriptInterface(new AppMetricaJsInterface(uf2), "AppMetrica");
            webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(uf2), "AppMetricaInitializer");
            C2 c22 = new C2(this, "WebView interface setup is successful.");
            synchronized (this) {
                try {
                    C38737cm c38737cm = this.f377927b;
                    if (c38737cm == null) {
                        this.f377926a.add(c22);
                    } else {
                        c22.b(c38737cm);
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            E2 e22 = new E2(this, th2, "WebView interface setup failed because of an exception.");
            synchronized (this) {
                try {
                    C38737cm c38737cm2 = this.f377927b;
                    if (c38737cm2 == null) {
                        this.f377926a.add(e22);
                    } else {
                        e22.b(c38737cm2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void a(@j.N C38737cm c38737cm) {
        synchronized (this) {
            this.f377927b = c38737cm;
        }
        Iterator<InterfaceC38986mm<C38737cm>> it = this.f377926a.iterator();
        while (it.hasNext()) {
            it.next().b(c38737cm);
        }
        this.f377926a.clear();
    }

    private void a(@j.N String str) {
        a aVar = new a(this, str);
        synchronized (this) {
            try {
                C38737cm c38737cm = this.f377927b;
                if (c38737cm == null) {
                    this.f377926a.add(aVar);
                } else {
                    aVar.b(c38737cm);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
