package com.avito.android.captcha;

import kotlin.Metadata;

/* compiled from: CaptchaVerificationError.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/captcha/z;", "", "a", "b", "c", "d", "Lcom/avito/android/captcha/z$a;", "Lcom/avito/android/captcha/z$b;", "Lcom/avito/android/captcha/z$c;", "Lcom/avito/android/captcha/z$d;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface z {

    /* compiled from: CaptchaVerificationError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/z$a;", "Lcom/avito/android/captcha/z;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f115150a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -290858199;
        }

        @Y61.k
        public final String toString() {
            return "CaptchaIsNotInitialized";
        }
    }

    /* compiled from: CaptchaVerificationError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/z$b;", "Lcom/avito/android/captcha/z;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f115151a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 499697529;
        }

        @Y61.k
        public final String toString() {
            return "CaptchaNotSupported";
        }
    }

    /* compiled from: CaptchaVerificationError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/z$c;", "Lcom/avito/android/captcha/z;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final p f115152a;

        public c(@Y61.k p pVar) {
            this.f115152a = pVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f115152a, ((c) obj).f115152a);
        }

        public final int hashCode() {
            return this.f115152a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "RetryCaptcha(captcha=" + this.f115152a + ')';
        }
    }

    /* compiled from: CaptchaVerificationError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/z$d;", "Lcom/avito/android/captcha/z;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final q f115153a;

        public d(@Y61.k q qVar) {
            this.f115153a = qVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f115153a, ((d) obj).f115153a);
        }

        public final int hashCode() {
            return this.f115153a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "VerificationFailed(error=" + this.f115153a + ')';
        }
    }
}
