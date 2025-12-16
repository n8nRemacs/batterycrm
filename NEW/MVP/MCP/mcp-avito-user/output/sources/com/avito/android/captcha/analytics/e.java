package com.avito.android.captcha.analytics;

import com.avito.android.captcha.CaptchaSdkErrorType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SdkErrorToAnalyticsErrorMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/analytics/e;", "", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* compiled from: SdkErrorToAnalyticsErrorMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CaptchaSdkErrorType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CaptchaSdkErrorType captchaSdkErrorType = CaptchaSdkErrorType.f114929b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CaptchaSdkErrorType captchaSdkErrorType2 = CaptchaSdkErrorType.f114929b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public e() {
    }
}
