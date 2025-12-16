package com.avito.android.captcha.interceptor;

import Y61.k;
import com.avito.android.D;
import com.avito.android.H0;
import com.avito.android.di.module.T9;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CaptchaTokenVerificationHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/captcha/interceptor/b;", "Lcom/avito/android/captcha/interceptor/a;", "a", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.captcha.interceptor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<Gson> f115051a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<Gson> f115052b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final H0 f115053c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final D f115054d;

    /* compiled from: CaptchaTokenVerificationHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/captcha/interceptor/b$a;", "", "<init>", "()V", "", "AVITO_CAPTCHA_PARAM", "Ljava/lang/String;", "GEETEST_CAPTCHA_OUTPUT_PARAM", "GEETEST_GEN_TIME_PARAM", "GEETEST_ID_PARAM", "GEETEST_LOT_NUMBER_PARAM", "GEETEST_PASS_TOKEN_PARAM", "HCAPTCHA_RESPONSE_PARAM", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k h31.e<Gson> eVar, @k @T9 h31.e<Gson> eVar2, @k H0 h02, @k D d12) {
        this.f115051a = eVar;
        this.f115052b = eVar2;
        this.f115053c = h02;
        this.f115054d = d12;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    @Override // com.avito.android.captcha.interceptor.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.captcha.K a(@Y61.k com.avito.android.captcha.y r7, @Y61.k okhttp3.Interceptor.Chain r8) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.interceptor.b.a(com.avito.android.captcha.y, okhttp3.Interceptor$Chain):com.avito.android.captcha.K");
    }
}
