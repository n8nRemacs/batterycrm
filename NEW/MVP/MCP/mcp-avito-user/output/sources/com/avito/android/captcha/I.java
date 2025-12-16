package com.avito.android.captcha;

import com.avito.android.captcha.q;
import com.avito.android.captcha.s;
import com.avito.android.captcha.y;
import com.avito.android.captcha.z;
import com.avito.android.remote.captcha.model.CaptchaType;
import com.avito.android.util.V2;
import com.hcaptcha.sdk.HCaptchaError;
import com.hcaptcha.sdk.HCaptchaException;
import id.C41383a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HCaptchaHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/I;", "Lcom/avito/android/captcha/r;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I implements r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41383a f114946b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.D f114947c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.hcaptcha.sdk.b f114948d;

    public I(@Y61.k C41383a c41383a, @Y61.k com.avito.android.D d12) {
        this.f114946b = c41383a;
        this.f114947c = d12;
    }

    @Override // com.avito.android.captcha.r
    @Y61.k
    public final s b() {
        com.avito.android.D d12 = this.f114947c;
        d12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.D.f67247d[0];
        if (!((Boolean) d12.f67248b.a().invoke()).booleanValue()) {
            return s.a.f115133a;
        }
        C41383a c41383a = this.f114946b;
        if (c41383a.get() != null) {
            this.f114948d = com.hcaptcha.sdk.b.c(c41383a.get());
            return s.c.f115135a;
        }
        V2.f318762a.e("HCaptcha is null, skip deeplink handling", null);
        return s.b.f115134a;
    }

    @Override // com.avito.android.captcha.r
    public final void c(@Y61.k Y41.a aVar, @Y61.k final Y41.l lVar, @Y61.k final Y41.l lVar2) {
        com.hcaptcha.sdk.b bVar = this.f114948d;
        if (bVar == null) {
            lVar2.invoke(z.a.f115150a);
            return;
        }
        bVar.f363124c.add(new com.hcaptcha.sdk.tasks.d(lVar) { // from class: com.avito.android.captcha.G

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f114944b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f114944b = (N) lVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // com.hcaptcha.sdk.tasks.d
            public final void onSuccess(Object obj) {
                this.f114944b.invoke(new y.c(((com.hcaptcha.sdk.o) obj).f363115a));
            }
        });
        bVar.b();
        bVar.f363125d.add(new com.hcaptcha.sdk.tasks.a(lVar2, this) { // from class: com.avito.android.captcha.H

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f114945b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f114945b = (N) lVar2;
            }

            /* JADX WARN: Type inference failed for: r5v5, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // com.hcaptcha.sdk.tasks.a
            public final void B3(HCaptchaException hCaptchaException) {
                HCaptchaError hCaptchaError = hCaptchaException.f363082b;
                String str = hCaptchaError.f363081c;
                int i12 = hCaptchaError.f363080b;
                this.f114945b.invoke(new z.d(new q.c(str, i12 != 15 ? i12 != 16 ? i12 != 30 ? CaptchaSdkErrorType.f114933f : CaptchaSdkErrorType.f114931d : CaptchaSdkErrorType.f114930c : CaptchaSdkErrorType.f114929b, CaptchaType.H_CAPTCHA)));
            }
        });
        bVar.b();
        com.hcaptcha.sdk.b bVar2 = this.f114948d;
        bVar2.e();
        bVar2.f();
    }

    @Override // com.avito.android.captcha.r
    public final void destroy() {
        com.hcaptcha.sdk.b bVar = this.f114948d;
        if (bVar != null) {
            bVar.f363124c.clear();
            bVar.f363125d.clear();
            bVar.f363126e.clear();
        }
        com.hcaptcha.sdk.b bVar2 = this.f114948d;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.f114948d = null;
    }

    @Override // com.avito.android.captcha.r
    public final void e() {
    }
}
