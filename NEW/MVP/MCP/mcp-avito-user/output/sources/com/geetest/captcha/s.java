package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.geetest.captcha.w;
import com.geetest.captcha.x;
import java.io.UnsupportedEncodingException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/geetest/captcha/handlers/WebViewHandler;", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "<init>", "()V", "Lcom/geetest/captcha/handlers/Request;", "request", "Lkotlin/G0;", "handler", "(Lcom/geetest/captcha/handlers/Request;)V", "", "getHandlerLevel", "()I", "handlerLevel", "Companion", "HandlerObserver", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class s extends u {
    @Override // com.geetest.captcha.t
    public int a() {
        return 5;
    }

    @Override // com.geetest.captcha.t
    public void a(@Y61.k p pVar) throws JSONException, PackageManager.NameNotFoundException, UnsupportedEncodingException {
        if (pVar.a()) {
            return;
        }
        h0 h0Var = h0.f342732d;
        h0Var.c("Step: WebViewHandler.handler");
        a aVar = new a(pVar, this);
        pVar.a(x.FLOWING);
        h0Var.a("Request", "currentStatus preLoadStatus: " + pVar.f342765a.name() + ", status: " + pVar.f342766b.name());
        x.a aVar2 = pVar.f342765a;
        if (aVar2 == x.a.FLOWING) {
            pVar.b(pVar.f342771g, pVar.f342772h, aVar);
            return;
        }
        if (aVar2 == x.a.SUCCESS) {
            pVar.c();
            pVar.b(pVar.f342771g, pVar.f342772h, aVar);
            return;
        }
        if (aVar2 == x.a.FAIL) {
            pVar.a(pVar.f342771g, pVar.f342772h, aVar);
            if (pVar.f342766b != x.FAIL) {
                pVar.b(pVar.f342771g, pVar.f342772h, aVar);
                return;
            }
            return;
        }
        if (aVar2 == x.a.NONE) {
            pVar.a(pVar.f342771g, pVar.f342772h, aVar);
            if (pVar.f342766b != x.FAIL) {
                pVar.b(pVar.f342771g, pVar.f342772h, aVar);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/geetest/captcha/handlers/WebViewHandler$HandlerObserver;", "Lcom/geetest/captcha/observer/WebViewObserver;", "Lcom/geetest/captcha/handlers/Request;", "request", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "handler", "<init>", "(Lcom/geetest/captcha/handlers/Request;Lcom/geetest/captcha/handlers/base/HandlerImpl;)V", "Lkotlin/G0;", "onCallReady", "()V", "onClose", "", "errorCode", "errorMsg", "Lorg/json/JSONObject;", "errorDesc", "onError", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "", "status", "result", "onResult", "(ZLjava/lang/String;)V", "error", "onWebError", "(Ljava/lang/String;)V", "fail", "onWebFailure", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "Lcom/geetest/captcha/handlers/Request;", "captcha_release"}, k = 1, mv = {1, 4, 1})
    public static final class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final p f342779a;

        /* renamed from: b, reason: collision with root package name */
        public final u f342780b;

        /* renamed from: com.geetest.captcha.s$a$a, reason: collision with other inner class name */
        public static final class RunnableC10552a implements Runnable {
            public RunnableC10552a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f342779a.c();
            }
        }

        public a(@Y61.k p pVar, @Y61.k u uVar) {
            this.f342779a = pVar;
            this.f342780b = uVar;
        }

        @Override // com.geetest.captcha.z
        public void a() {
            if (this.f342779a.a()) {
                return;
            }
            h0.f342732d.a("WebViewHandler", "WebViewHandler.HandlerObserver.onCallReady");
            this.f342779a.a(x.SUCCESS);
            if (L.f(Looper.myLooper(), Looper.getMainLooper())) {
                this.f342779a.c();
                return;
            }
            Context context = this.f342779a.f342771g;
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) context).runOnUiThread(new RunnableC10552a());
        }

        @Override // com.geetest.captcha.z
        public void b() throws JSONException {
            if (this.f342779a.a()) {
                return;
            }
            h0 h0Var = h0.f342732d;
            h0Var.a("WebViewHandler", "WebViewHandler.HandlerObserver.onClose");
            this.f342779a.a(x.FAIL);
            String strJ = L.j(d0.USER_ERROR.getType() + "60", x.CANCEL.getType());
            w.a aVar = w.f342797d;
            String str = e0.f342712d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", "User cancelled 'Captcha'");
            G0 g02 = G0.f406611a;
            String strA = aVar.a(strJ, str, jSONObject).a();
            h0Var.c("WebViewHandler: " + strA);
            this.f342779a.b();
            this.f342779a.a(strA);
        }

        @Override // com.geetest.captcha.z
        public void a(@Y61.k String str) {
            if (this.f342779a.a()) {
                return;
            }
            h0.f342732d.b("WebViewHandler", "WebViewHandler.HandlerObserver.onWebError: ".concat(str));
            this.f342779a.a(x.FAIL);
            this.f342780b.a(this.f342779a, str);
        }

        @Override // com.geetest.captcha.z
        public void a(@Y61.k String str, @Y61.k String str2, @Y61.k JSONObject jSONObject) throws JSONException {
            if (this.f342779a.a()) {
                return;
            }
            this.f342779a.a(x.FAIL);
            String strA = w.f342797d.a(L.j(str, this.f342779a.f342766b.getType()), str2, jSONObject).a();
            h0.f342732d.b("WebViewHandler", "WebViewHandler.HandlerObserver.onError: " + strA);
            this.f342780b.a(this.f342779a, strA);
        }

        @Override // com.geetest.captcha.z
        public void a(boolean z12, @Y61.k String str) {
            if (this.f342779a.a()) {
                return;
            }
            h0.f342732d.b("WebViewHandler", "HandlerObserver.onResult: ".concat(str));
            if (z12) {
                this.f342779a.a(x.END);
                this.f342780b.a(this.f342779a, true, str);
            } else {
                this.f342779a.a(x.FLOWING);
                this.f342780b.a(this.f342779a, false, str);
            }
        }
    }
}
