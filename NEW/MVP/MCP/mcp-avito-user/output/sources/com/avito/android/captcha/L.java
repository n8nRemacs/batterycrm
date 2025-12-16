package com.avito.android.captcha;

import com.avito.android.captcha.K;
import com.avito.android.captcha.q;
import com.avito.android.captcha.z;
import com.avito.android.remote.captcha.generated.api.verify_v_3__api.VerifyV3ApiResponse;
import com.avito.android.remote.captcha.model.CaptchaData;
import com.avito.android.remote.captcha.model.CaptchaType;
import com.avito.android.remote.captcha.model.VerifyCaptchaResponse;
import com.avito.android.remote.model.TypedResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerifyCaptchaTokenResult.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_captcha"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class L {

    /* compiled from: VerifyCaptchaTokenResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/captcha/generated/api/verify_v_3__api/VerifyV3ApiResponse;", "verifyCaptchaResult", "Lcom/avito/android/captcha/K;", "invoke", "(Lcom/avito/android/remote/captcha/generated/api/verify_v_3__api/VerifyV3ApiResponse;)Lcom/avito/android/captcha/K;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<VerifyV3ApiResponse, K> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f114951l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final K invoke(VerifyV3ApiResponse verifyV3ApiResponse) {
            VerifyV3ApiResponse verifyV3ApiResponse2 = verifyV3ApiResponse;
            Object captcha = verifyV3ApiResponse2.getResult().getCaptcha();
            Map map = captcha instanceof Map ? (Map) captcha : null;
            u.f115136a.getClass();
            p pVarB = u.b(map, false);
            return verifyV3ApiResponse2.getResult().getVerified() ? K.b.f114950a : pVarB.f115120a.a() ? new K.a(new z.c(pVarB)) : new K.a(z.b.f115151a);
        }
    }

    /* compiled from: VerifyCaptchaTokenResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<String, K.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f114952b = new b();

        public b() {
            super(1, L.class, "getVerifyCaptchaTokenResultFailure", "getVerifyCaptchaTokenResultFailure(Ljava/lang/String;)Lcom/avito/android/captcha/VerifyCaptchaTokenResult$Failure;", 1);
        }

        @Override // Y41.l
        public final K.a invoke(String str) {
            return new K.a(new z.d(new q.a(str)));
        }
    }

    /* compiled from: VerifyCaptchaTokenResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/captcha/model/VerifyCaptchaResponse;", "it", "Lcom/avito/android/captcha/K;", "invoke", "(Lcom/avito/android/remote/captcha/model/VerifyCaptchaResponse;)Lcom/avito/android/captcha/K;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<VerifyCaptchaResponse, K> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f114953l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final K invoke(VerifyCaptchaResponse verifyCaptchaResponse) {
            CaptchaType type;
            VerifyCaptchaResponse verifyCaptchaResponse2 = verifyCaptchaResponse;
            if (verifyCaptchaResponse2.getVerified()) {
                return K.b.f114950a;
            }
            CaptchaData captcha = verifyCaptchaResponse2.getCaptcha();
            if (captcha == null || (type = captcha.getType()) == null || !type.a()) {
                return new K.a(z.b.f115151a);
            }
            u uVar = u.f115136a;
            CaptchaData captcha2 = verifyCaptchaResponse2.getCaptcha();
            uVar.getClass();
            return new K.a(new z.c(u.a(captcha2, false)));
        }
    }

    /* compiled from: VerifyCaptchaTokenResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.l<String, K.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f114954b = new d();

        public d() {
            super(1, L.class, "getVerifyCaptchaTokenResultFailure", "getVerifyCaptchaTokenResultFailure(Ljava/lang/String;)Lcom/avito/android/captcha/VerifyCaptchaTokenResult$Failure;", 1);
        }

        @Override // Y41.l
        public final K.a invoke(String str) {
            return new K.a(new z.d(new q.a(str)));
        }
    }

    @Y61.k
    public static final K a(@Y61.k TypedResult<VerifyV3ApiResponse> typedResult) {
        return (K) com.avito.android.error.z.r(typedResult, a.f114951l, b.f114952b, null, null, 60);
    }

    @Y61.k
    public static final K b(@Y61.k TypedResult<VerifyCaptchaResponse> typedResult) {
        return (K) com.avito.android.error.z.r(typedResult, c.f114953l, d.f114954b, null, null, 60);
    }
}
