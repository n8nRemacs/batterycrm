package com.avito.android.captcha;

import kotlin.Metadata;

/* compiled from: VerifyCaptchaTokenResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/captcha/K;", "", "a", "b", "Lcom/avito/android/captcha/K$a;", "Lcom/avito/android/captcha/K$b;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface K {

    /* compiled from: VerifyCaptchaTokenResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/K$a;", "Lcom/avito/android/captcha/K;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements K {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final z f114949a;

        public a(@Y61.k z zVar) {
            this.f114949a = zVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f114949a, ((a) obj).f114949a);
        }

        public final int hashCode() {
            return this.f114949a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Failure(error=" + this.f114949a + ')';
        }
    }

    /* compiled from: VerifyCaptchaTokenResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/K$b;", "Lcom/avito/android/captcha/K;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements K {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f114950a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1917735831;
        }

        @Y61.k
        public final String toString() {
            return "Success";
        }
    }
}
