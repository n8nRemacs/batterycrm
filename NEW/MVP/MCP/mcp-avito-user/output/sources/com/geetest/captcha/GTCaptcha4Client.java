package com.geetest.captcha;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Pair;
import com.geetest.captcha.GTCaptcha4Holder;
import com.geetest.captcha.h0;
import com.geetest.captcha.views.GTC4WebView;
import com.geetest.captcha.w;
import com.geetest.captcha.x;
import kotlin.G0;
import kotlin.jvm.internal.L;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class GTCaptcha4Client implements NoProguard {

    /* renamed from: a, reason: collision with root package name */
    public final GTCaptcha4Holder f342663a;

    public interface OnDialogShowListener extends NoProguard {
        void actionAfterDialogShow(Dialog dialog);

        void actionBeforeDialogShow(Dialog dialog);

        void onDialogFocusChanged(Dialog dialog, boolean z12);
    }

    public interface OnFailureListener extends NoProguard {
        void onFailure(String str);
    }

    public interface OnSuccessListener extends NoProguard {
        void onSuccess(boolean z12, String str);
    }

    public interface OnWebViewShowListener extends NoProguard {
        void onWebViewShow();
    }

    public GTCaptcha4Client(Context context) {
        this.f342663a = new GTCaptcha4Holder(context);
    }

    public static GTCaptcha4Client getClient(Context context) {
        return new GTCaptcha4Client(context);
    }

    public static String getVersion() {
        return "1.8.3.1";
    }

    public static Pair<Boolean, String> isSupportWebView(Context context) {
        GTCaptcha4Holder.b bVar = GTCaptcha4Holder.f342687f;
        try {
            new GTC4WebView(context).destroy();
            return new Pair<>(Boolean.TRUE, null);
        } catch (Exception e12) {
            e12.printStackTrace();
            h0.f342732d.c("The device does not support WebViews, error message: " + e12.getMessage());
            return new Pair<>(Boolean.FALSE, e12.getMessage());
        }
    }

    public GTCaptcha4Client addOnFailureListener(OnFailureListener onFailureListener) {
        GTCaptcha4Holder gTCaptcha4Holder = this.f342663a;
        gTCaptcha4Holder.getClass();
        gTCaptcha4Holder.f342690c = onFailureListener;
        return this;
    }

    public GTCaptcha4Client addOnSuccessListener(OnSuccessListener onSuccessListener) {
        GTCaptcha4Holder gTCaptcha4Holder = this.f342663a;
        gTCaptcha4Holder.getClass();
        gTCaptcha4Holder.f342689b = onSuccessListener;
        return this;
    }

    public GTCaptcha4Client addOnWebViewShowListener(OnWebViewShowListener onWebViewShowListener) {
        GTCaptcha4Holder gTCaptcha4Holder = this.f342663a;
        gTCaptcha4Holder.getClass();
        gTCaptcha4Holder.f342691d = onWebViewShowListener;
        return this;
    }

    public void cancel() throws JSONException {
        GTCaptcha4Holder gTCaptcha4Holder = this.f342663a;
        gTCaptcha4Holder.getClass();
        if (System.currentTimeMillis() - GTCaptcha4Holder.f342686e < 1000) {
            h0.f342732d.c("The interval between the two cancel is at least 1 second.");
            return;
        }
        b bVar = gTCaptcha4Holder.f342688a;
        if (bVar.f342699f.a()) {
            return;
        }
        bVar.f342699f.a(x.FAIL);
        String strJ = L.j(d0.USER_ERROR.getType() + "60", x.CANCEL.getType());
        w.a aVar = w.f342797d;
        String str = e0.f342712d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("description", "User cancelled 'Captcha'");
        G0 g02 = G0.f406611a;
        String strA = aVar.a(strJ, str, jSONObject).a();
        h0.f342732d.c("Controller: " + strA);
        bVar.f342699f.b();
        bVar.f342699f.a(strA);
    }

    public void configurationChanged(Configuration configuration) {
        h hVar;
        GTCaptcha4Holder gTCaptcha4Holder = this.f342663a;
        gTCaptcha4Holder.getClass();
        b bVar = gTCaptcha4Holder.f342688a;
        bVar.getClass();
        try {
            g gVar = bVar.f342699f.f342767c;
            if (gVar == null || (hVar = gVar.f342722a) == null) {
                return;
            }
            hVar.a();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public void destroy() {
        this.f342663a.getClass();
        try {
            h0.a aVar = h0.f342730b;
            if (aVar != null) {
                if (aVar != null) {
                    aVar.b();
                }
                h0.f342730b = null;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public GTCaptcha4Client init(String str) {
        this.f342663a.a(str, null);
        return this;
    }

    public void setLogEnable(boolean z12) {
        this.f342663a.getClass();
        h0.f342731c = z12;
        h0.f342729a = z12 ? 1 : 9999;
    }

    public GTCaptcha4Client verifyWithCaptcha() throws JSONException {
        GTCaptcha4Holder gTCaptcha4Holder = this.f342663a;
        gTCaptcha4Holder.getClass();
        if (System.currentTimeMillis() - GTCaptcha4Holder.f342686e < 1000) {
            h0.f342732d.c("The interval between the two captcha is at least 1 second.");
        } else {
            GTCaptcha4Holder.f342686e = System.currentTimeMillis();
            b bVar = gTCaptcha4Holder.f342688a;
            OnSuccessListener onSuccessListener = gTCaptcha4Holder.f342689b;
            bVar.f342695b = onSuccessListener;
            OnFailureListener onFailureListener = gTCaptcha4Holder.f342690c;
            bVar.f342696c = onFailureListener;
            bVar.f342697d = gTCaptcha4Holder.f342691d;
            Context context = bVar.f342702i;
            if (onFailureListener == null) {
                throw new IllegalArgumentException("The OnFailureListener object cannot be null.");
            }
            if (onSuccessListener == null) {
                w.a aVar = w.f342797d;
                String str = x.FLOWING.getType() + d0.PARAM.getType() + "70";
                String str2 = e0.f342711c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", "The GTC4SessionResponse object cannot be null");
                G0 g02 = G0.f406611a;
                String strA = aVar.a(str, str2, jSONObject).a();
                h0.f342732d.c(strA);
                OnFailureListener onFailureListener2 = bVar.f342696c;
                if (onFailureListener2 != null) {
                    onFailureListener2.onFailure(strA);
                }
            } else if (context == null) {
                w.a aVar2 = w.f342797d;
                String str3 = x.FLOWING.getType() + d0.PARAM.getType() + "71";
                String str4 = e0.f342711c;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("description", "The context parameter should not be null");
                G0 g03 = G0.f406611a;
                String strA2 = aVar2.a(str3, str4, jSONObject2).a();
                h0.f342732d.c(strA2);
                OnFailureListener onFailureListener3 = bVar.f342696c;
                if (onFailureListener3 != null) {
                    onFailureListener3.onFailure(strA2);
                }
            } else if (!(context instanceof Activity)) {
                w.a aVar3 = w.f342797d;
                String str5 = x.FLOWING.getType() + d0.PARAM.getType() + "72";
                String str6 = e0.f342711c;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("description", "The context must be an 'Activity' object");
                G0 g04 = G0.f406611a;
                String strA3 = aVar3.a(str5, str6, jSONObject3).a();
                h0.f342732d.c(strA3);
                OnFailureListener onFailureListener4 = bVar.f342696c;
                if (onFailureListener4 != null) {
                    onFailureListener4.onFailure(strA3);
                }
            } else if (TextUtils.isEmpty(bVar.f342694a)) {
                w.a aVar4 = w.f342797d;
                String str7 = x.FLOWING.getType() + d0.PARAM.getType() + "74";
                String str8 = e0.f342711c;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("description", "The 'AppId' parameter should not be null");
                G0 g05 = G0.f406611a;
                String strA4 = aVar4.a(str7, str8, jSONObject4).a();
                h0.f342732d.c(strA4);
                OnFailureListener onFailureListener5 = bVar.f342696c;
                if (onFailureListener5 != null) {
                    onFailureListener5.onFailure(strA4);
                }
            } else {
                p pVar = bVar.f342699f;
                x.a aVar5 = pVar.f342765a;
                x.a aVar6 = x.a.NONE;
                if (aVar5 == aVar6 || pVar.f342766b != x.NONE) {
                    bVar.f342701h = new s();
                    p pVar2 = new p(bVar.f342702i, v.f342783l.a(bVar.f342694a, bVar.f342698e));
                    bVar.f342699f = pVar2;
                    pVar2.a(aVar6);
                    bVar.f342699f.a(x.FLOWING);
                    p pVar3 = bVar.f342699f;
                    GTCaptcha4Config gTCaptcha4Config = bVar.f342698e;
                    pVar3.f342767c = new g(gTCaptcha4Config != null ? gTCaptcha4Config.getDialogShowListener() : null);
                    p pVar4 = bVar.f342699f;
                    pVar4.f342768d = bVar.f342695b;
                    pVar4.f342769e = bVar.f342696c;
                    pVar4.f342770f = bVar.f342697d;
                    bVar.f342701h.b(pVar4);
                } else {
                    pVar.a(x.FLOWING);
                    p pVar5 = bVar.f342699f;
                    pVar5.f342768d = bVar.f342695b;
                    pVar5.f342769e = bVar.f342696c;
                    pVar5.f342770f = bVar.f342697d;
                    bVar.f342701h.b(pVar5);
                }
            }
        }
        return this;
    }

    public GTCaptcha4Client init(String str, GTCaptcha4Config gTCaptcha4Config) {
        this.f342663a.a(str, gTCaptcha4Config);
        return this;
    }
}
