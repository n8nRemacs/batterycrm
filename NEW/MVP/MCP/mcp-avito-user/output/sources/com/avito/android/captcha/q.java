package com.avito.android.captcha;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.captcha.model.CaptchaType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CaptchaError.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/captcha/q;", "", "a", "b", "c", "Lcom/avito/android/captcha/q$a;", "Lcom/avito/android/captcha/q$b;", "Lcom/avito/android/captcha/q$c;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f115126a;

    /* compiled from: CaptchaError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/q$a;", "Lcom/avito/android/captcha/q;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f115127b;

        public a(@Y61.k String str) {
            super(str, null);
            this.f115127b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f115127b, ((a) obj).f115127b);
        }

        public final int hashCode() {
            return this.f115127b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApiError(message="), this.f115127b, ')');
        }
    }

    /* compiled from: CaptchaError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/q$b;", "Lcom/avito/android/captcha/q;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f115128b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final CaptchaType f115129c;

        public /* synthetic */ b(String str, CaptchaType captchaType, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : captchaType);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f115128b, bVar.f115128b) && this.f115129c == bVar.f115129c;
        }

        public final int hashCode() {
            int iHashCode = this.f115128b.hashCode() * 31;
            CaptchaType captchaType = this.f115129c;
            return iHashCode + (captchaType == null ? 0 : captchaType.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ClientError(message=" + this.f115128b + ", captchaType=" + this.f115129c + ')';
        }

        public b(@Y61.k String str, @Y61.l CaptchaType captchaType) {
            super(str, null);
            this.f115128b = str;
            this.f115129c = captchaType;
        }
    }

    /* compiled from: CaptchaError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/q$c;", "Lcom/avito/android/captcha/q;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f115130b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final CaptchaSdkErrorType f115131c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final CaptchaType f115132d;

        public c(@Y61.k String str, @Y61.k CaptchaSdkErrorType captchaSdkErrorType, @Y61.k CaptchaType captchaType) {
            super(str, null);
            this.f115130b = str;
            this.f115131c = captchaSdkErrorType;
            this.f115132d = captchaType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f115130b, cVar.f115130b) && this.f115131c == cVar.f115131c && this.f115132d == cVar.f115132d;
        }

        public final int hashCode() {
            return this.f115132d.hashCode() + ((this.f115131c.hashCode() + (this.f115130b.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "SdkError(message=" + this.f115130b + ", errorType=" + this.f115131c + ", captchaType=" + this.f115132d + ')';
        }
    }

    public q(String str, C42822w c42822w) {
        this.f115126a = str;
    }
}
