package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.l0;
import com.geetest.captcha.views.GTC4WebView;
import com.geetest.captcha.x;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.json.JSONException;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001PB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b-\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010GR\"\u0010\u0015\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/geetest/captcha/handlers/Request;", "", "Landroid/content/Context;", "context", "Lcom/geetest/captcha/model/DataBean;", "dataBean", "<init>", "(Landroid/content/Context;Lcom/geetest/captcha/model/DataBean;)V", "", "cancel", "()Z", "Lkotlin/G0;", "currentStatus", "()V", "dismiss", "hideLoading", "notifyWebViewShowed", "", "error", "onFailure", "(Ljava/lang/String;)V", "status", "result", "onSuccess", "(ZLjava/lang/String;)V", "onWebViewShow", "Lcom/geetest/captcha/observer/WebViewObserver;", "webViewObserver", "preLoadWebView", "(Landroid/content/Context;Lcom/geetest/captcha/model/DataBean;Lcom/geetest/captcha/observer/WebViewObserver;)V", "Lcom/geetest/captcha/controller/DialogController;", "dialogController", "setDialogController", "(Lcom/geetest/captcha/controller/DialogController;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "listener", "setListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "response", "setResponse", "(Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "setWebViewShowListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;)V", "showWebViewDialog", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/geetest/captcha/model/DataBean;", "getDataBean", "()Lcom/geetest/captcha/model/DataBean;", "Lcom/geetest/captcha/controller/DialogController;", "getDialogController$captcha_release", "()Lcom/geetest/captcha/controller/DialogController;", "setDialogController$captcha_release", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "preLoadStatus", "Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "getPreLoadStatus", "()Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "setPreLoadStatus", "(Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;)V", "", "requestLevel", "I", "getRequestLevel", "()I", "setRequestLevel", "(I)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "Lcom/geetest/captcha/model/StatusEnum;", "Lcom/geetest/captcha/model/StatusEnum;", "getStatus", "()Lcom/geetest/captcha/model/StatusEnum;", "setStatus", "(Lcom/geetest/captcha/model/StatusEnum;)V", "webViewShowListener", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public x.a f342765a = x.a.NONE;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public x f342766b = x.FLOWING;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public g f342767c;

    /* renamed from: d, reason: collision with root package name */
    public GTCaptcha4Client.OnSuccessListener f342768d;

    /* renamed from: e, reason: collision with root package name */
    public GTCaptcha4Client.OnFailureListener f342769e;

    /* renamed from: f, reason: collision with root package name */
    public GTCaptcha4Client.OnWebViewShowListener f342770f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f342771g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final v f342772h;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f342774b;

        public a(String str) {
            this.f342774b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GTCaptcha4Client.OnFailureListener onFailureListener = p.this.f342769e;
            if (onFailureListener != null) {
                onFailureListener.onFailure(this.f342774b);
            }
        }
    }

    public p(@Y61.k Context context, @Y61.k v vVar) {
        this.f342771g = context;
        this.f342772h = vVar;
    }

    public final void a(@Y61.k x.a aVar) {
        this.f342765a = aVar;
    }

    public final void b(@Y61.k Context context, @Y61.k v vVar, @Y61.k z zVar) {
        g gVar = this.f342767c;
        if (gVar != null) {
            try {
                y yVar = new y();
                yVar.a(zVar);
                GTC4WebView gTC4WebView = gVar.f342723b;
                if (gTC4WebView != null) {
                    gTC4WebView.setWebViewObservable(yVar);
                }
                l0 l0Var = gVar.f342724c;
                if (l0Var != null) {
                    l0Var.f342750b = yVar;
                    l0.b bVar = l0Var.f342752d;
                    String str = l0Var.f342749a;
                    GTC4WebView gTC4WebView2 = l0Var.f342751c;
                    if (bVar == null) {
                        throw null;
                    }
                    bVar.f342758c = yVar;
                    bVar.f342757b = gTC4WebView2;
                    bVar.f342756a = str;
                }
                if (L.f(Looper.getMainLooper(), Looper.myLooper())) {
                    gVar.b(context, vVar, zVar);
                } else {
                    ((Activity) context).runOnUiThread(new f(gVar, context, vVar, zVar));
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    public final void c() {
        GTC4WebView gTC4WebView;
        g gVar = this.f342767c;
        if (gVar != null && (gTC4WebView = gVar.f342723b) != null) {
            gTC4WebView.evaluateJavascript("javascript:jsBridge.callback('showBox')", d.f342706a);
        }
        try {
            h0.f342732d.a("Request.onWebViewShow");
            if (a()) {
                return;
            }
            if (L.f(Looper.getMainLooper(), Looper.myLooper())) {
                GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this.f342770f;
                if (onWebViewShowListener != null) {
                    onWebViewShowListener.onWebViewShow();
                    return;
                }
                return;
            }
            Context context = this.f342771g;
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) context).runOnUiThread(new RunnableC36501r(this));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public final void a(@Y61.k x xVar) {
        this.f342766b = xVar;
    }

    public final boolean a() {
        return this.f342766b == x.CANCEL;
    }

    public final void a(@Y61.k Context context, @Y61.k v vVar, @Y61.k z zVar) throws JSONException, PackageManager.NameNotFoundException, UnsupportedEncodingException {
        g gVar = this.f342767c;
        if (gVar != null) {
            gVar.a(context, vVar, zVar);
        }
    }

    public final void a(@Y61.k String str) {
        try {
            h0.f342732d.a("Request.onFailure: ".concat(str));
            if (a()) {
                return;
            }
            if (!L.f(Looper.getMainLooper(), Looper.myLooper())) {
                Context context = this.f342771g;
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) context).runOnUiThread(new a(str));
            } else {
                GTCaptcha4Client.OnFailureListener onFailureListener = this.f342769e;
                if (onFailureListener != null) {
                    onFailureListener.onFailure(str);
                }
            }
            this.f342766b = x.CANCEL;
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public final void b() {
        h hVar;
        g gVar = this.f342767c;
        if (gVar == null || (hVar = gVar.f342722a) == null || !hVar.isShowing()) {
            return;
        }
        GTC4WebView gTC4WebView = gVar.f342723b;
        Context context = gTC4WebView != null ? gTC4WebView.getContext() : null;
        if (context != null) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            if (!L.f(Looper.getMainLooper(), Looper.myLooper())) {
                activity.runOnUiThread(new c(hVar));
                return;
            } else {
                hVar.dismiss();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }
}
