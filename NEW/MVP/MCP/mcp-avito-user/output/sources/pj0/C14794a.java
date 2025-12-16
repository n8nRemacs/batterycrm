package Pj0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.captcha.model.CaptchaData;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetCaptchaResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LPj0/a;", "", "Lcom/avito/android/remote/captcha/model/CaptchaData;", "captcha", "<init>", "(Lcom/avito/android/remote/captcha/model/CaptchaData;)V", "Lcom/avito/android/remote/captcha/model/CaptchaData;", "a", "()Lcom/avito/android/remote/captcha/model/CaptchaData;", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final /* data */ class C14794a {

    @c("captcha")
    @k
    private final CaptchaData captcha;

    public C14794a(@k CaptchaData captchaData) {
        this.captcha = captchaData;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final CaptchaData getCaptcha() {
        return this.captcha;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14794a) && L.f(this.captcha, ((C14794a) obj).captcha);
    }

    public final int hashCode() {
        return this.captcha.hashCode();
    }

    @k
    public final String toString() {
        return "GetCaptchaResponse(captcha=" + this.captcha + ')';
    }
}
