package com.vk.id.captcha.api;

import X41.i;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.data.VKCaptchaError;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import com.vk.id.captcha.b.a;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: VKCaptcha.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/vk/id/captcha/api/VKCaptcha;", "", "<init>", "()V", "", "isInternetAvailable", "()Z", "Landroid/content/Context;", "context", "Lkotlin/G0;", "init", "(Landroid/content/Context;)V", "", "domain", "redirectUri", "Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;", "listener", "openCaptcha", "(Ljava/lang/String;Ljava/lang/String;Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;)V", "closeCaptcha", "Lcom/vk/id/captcha/a;", VoiceInfo.STATE, "closeCaptcha$captcha_release", "(Lcom/vk/id/captcha/a;)V", "getToken", "(Ljava/lang/String;)Ljava/lang/String;", "token", "setResult$captcha_release", "(Ljava/lang/String;Ljava/lang/String;)V", "captchaListener", "Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;", "getCaptchaListener$captcha_release", "()Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;", "setCaptchaListener$captcha_release", "(Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;)V", "Lcom/vk/id/captcha/a/a;", "captchaStorage$delegate", "Lkotlin/C;", "getCaptchaStorage$captcha_release", "()Lcom/vk/id/captcha/a/a;", "captchaStorage", "appContext", "Landroid/content/Context;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKCaptcha {
    private static Context appContext;

    @l
    private static VKCaptchaResultListener captchaListener;

    @k
    public static final VKCaptcha INSTANCE = new VKCaptcha();

    /* renamed from: captchaStorage$delegate, reason: from kotlin metadata */
    @k
    private static final InterfaceC42726C captchaStorage = C42727D.c(VKCaptcha$captchaStorage$2.INSTANCE);

    private VKCaptcha() {
    }

    private final boolean isInternetAvailable() {
        a.Companion companion = a.INSTANCE;
        return a.Companion.a().b().a();
    }

    public final void closeCaptcha() {
        closeCaptcha$captcha_release(a.C10823a.INSTANCE);
    }

    public final void closeCaptcha$captcha_release(@k com.vk.id.captcha.a state) {
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        a.Companion.a().a().a();
        VKCaptchaKt.setResult(state);
    }

    @l
    @i
    public final VKCaptchaResultListener getCaptchaListener$captcha_release() {
        return captchaListener;
    }

    @i
    @k
    public final com.vk.id.captcha.a.a getCaptchaStorage$captcha_release() {
        return (com.vk.id.captcha.a.a) captchaStorage.getValue();
    }

    @l
    public final String getToken(@k String domain) {
        return getCaptchaStorage$captcha_release().a(domain);
    }

    public final void init(@k Context context) {
        appContext = context.getApplicationContext();
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        Context context2 = appContext;
        if (context2 == null) {
            context2 = null;
        }
        a.Companion.a(context2);
    }

    public final void openCaptcha(@k String domain, @k String redirectUri, @k VKCaptchaResultListener listener) {
        captchaListener = listener;
        if (!isInternetAvailable()) {
            closeCaptcha$captcha_release(new a.b(new VKCaptchaError.NetworkError("There is no internet connection", null, 2, null), domain));
            return;
        }
        Context context = appContext;
        if (context == null) {
            context = null;
        }
        Intent intent = new Intent(context, (Class<?>) VKCaptchaWebViewActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("VK_CAPTCHA_URL_KEY", redirectUri);
        intent.putExtra("VK_CAPTCHA_CHALLENGE_DOMAIN_URL_KEY", domain);
        Context context2 = appContext;
        (context2 != null ? context2 : null).startActivity(intent);
    }

    public final void setResult$captcha_release(@k String token, @l String domain) {
        VKCaptchaKt.setResult(new a.c(token, domain));
    }
}
