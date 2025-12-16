package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.geetest.captcha.GTCaptcha4Client;
import kotlin.jvm.internal.L;

/* loaded from: classes4.dex */
public abstract class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public u f342782a;

    public void a(@Y61.k p pVar, boolean z12, @Y61.k String str) {
        if (pVar.a()) {
            return;
        }
        if (z12) {
            pVar.b();
        }
        try {
            if (L.f(Looper.getMainLooper(), Looper.myLooper())) {
                GTCaptcha4Client.OnSuccessListener onSuccessListener = pVar.f342768d;
                if (onSuccessListener != null) {
                    onSuccessListener.onSuccess(z12, str);
                    return;
                }
                return;
            }
            Context context = pVar.f342771g;
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) context).runOnUiThread(new q(pVar, z12, str));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public void b(@Y61.k p pVar) {
        if (pVar.a()) {
            return;
        }
        if (a() >= 0) {
            a(pVar);
            return;
        }
        u uVar = this.f342782a;
        if (uVar != null) {
            uVar.b(pVar);
        }
    }

    public void a(@Y61.k p pVar, @Y61.k String str) {
        if (pVar.a()) {
            return;
        }
        h0.f342732d.c("HandlerImpl.onFailure: ".concat(str));
        if (pVar.f342766b == x.FAIL) {
            pVar.b();
            pVar.a(str);
        }
    }
}
