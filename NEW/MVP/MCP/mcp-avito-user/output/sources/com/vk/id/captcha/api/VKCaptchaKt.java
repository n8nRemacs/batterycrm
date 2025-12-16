package com.vk.id.captcha.api;

import X41.i;
import Y61.l;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.data.VKCaptchaError;
import com.vk.id.captcha.api.data.VKCaptchaResult;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import kotlin.Metadata;

/* compiled from: VKCaptcha.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\".\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/a;", "value", "result", "Lcom/vk/id/captcha/a;", "getResult", "()Lcom/vk/id/captcha/a;", "setResult", "(Lcom/vk/id/captcha/a;)V"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKCaptchaKt {

    @l
    private static a result;

    @i
    public static final void setResult(@l a aVar) {
        if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            VKCaptchaResult.Success success = new VKCaptchaResult.Success(cVar.a(), cVar.b());
            VKCaptcha vKCaptcha = VKCaptcha.INSTANCE;
            VKCaptchaResultListener captchaListener$captcha_release = vKCaptcha.getCaptchaListener$captcha_release();
            if (captchaListener$captcha_release != null) {
                captchaListener$captcha_release.onResult(success);
            }
            if (cVar.b() != null) {
                vKCaptcha.getCaptchaStorage$captcha_release().a(cVar.b(), cVar.a());
            }
        } else if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            VKCaptchaResult.Error error = new VKCaptchaResult.Error(bVar.a(), bVar.b());
            VKCaptchaResultListener captchaListener$captcha_release2 = VKCaptcha.INSTANCE.getCaptchaListener$captcha_release();
            if (captchaListener$captcha_release2 != null) {
                captchaListener$captcha_release2.onResult(error);
            }
        } else if (aVar instanceof a.C10823a) {
            VKCaptchaResult.Error error2 = new VKCaptchaResult.Error(new VKCaptchaError.Cancelled(), null);
            VKCaptchaResultListener captchaListener$captcha_release3 = VKCaptcha.INSTANCE.getCaptchaListener$captcha_release();
            if (captchaListener$captcha_release3 != null) {
                captchaListener$captcha_release3.onResult(error2);
            }
        }
        result = aVar;
    }
}
