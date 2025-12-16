package com.avito.android.captcha;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.captcha.model.CaptchaType;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Captcha.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/captcha/p;", "", "a", "b", "c", "d", "Lcom/avito/android/captcha/p$a;", "Lcom/avito/android/captcha/p$b;", "Lcom/avito/android/captcha/p$c;", "Lcom/avito/android/captcha/p$d;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CaptchaType f115120a;

    /* compiled from: Captcha.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/p$a;", "Lcom/avito/android/captcha/p;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends p {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f115121b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f115122c;

        public a(@Y61.l String str, @Y61.l String str2) {
            super(CaptchaType.AVITO_CAPTCHA, null);
            this.f115121b = str;
            this.f115122c = str2;
        }

        public static a a(a aVar, String str) {
            String str2 = aVar.f115121b;
            aVar.getClass();
            return new a(str2, str);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f115121b, aVar.f115121b) && kotlin.jvm.internal.L.f(this.f115122c, aVar.f115122c);
        }

        public final int hashCode() {
            String str = this.f115121b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f115122c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvitoCaptcha(image=");
            sb2.append(this.f115121b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f115122c, ')');
        }
    }

    /* compiled from: Captcha.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/p$b;", "Lcom/avito/android/captcha/p;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends p {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f115123b = new b();

        public b() {
            super(CaptchaType.GEETEST, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 116951348;
        }

        @Y61.k
        public final String toString() {
            return "GeetestCaptcha";
        }
    }

    /* compiled from: Captcha.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/p$c;", "Lcom/avito/android/captcha/p;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends p {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f115124b = new c();

        public c() {
            super(CaptchaType.H_CAPTCHA, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1570554747;
        }

        @Y61.k
        public final String toString() {
            return "HCaptcha";
        }
    }

    /* compiled from: Captcha.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/p$d;", "Lcom/avito/android/captcha/p;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends p {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f115125b = new d();

        public d() {
            super(CaptchaType.f253318b, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1658652073;
        }

        @Y61.k
        public final String toString() {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public p(CaptchaType captchaType, C42822w c42822w) {
        this.f115120a = captchaType;
    }
}
