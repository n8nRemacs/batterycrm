package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;

/* compiled from: CaptchaFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/D;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class D extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f67247d;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f67248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f67249c;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(D.class, "captchaForBlockedIp", "getCaptchaForBlockedIp()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f67247d = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(D.class, "captchaApico", "getCaptchaApico()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public D() {
        Owners owners = Owners.f210513m0;
        this.f67248b = A0.u(this, "включение обработки капчи для заблокированного пользователя", "captchaForBlockedIp", Boolean.TRUE, false, 0, owners, 56);
        this.f67249c = A0.u(this, "Переключение ручек капчи на Apico", "captchaApico", Boolean.FALSE, false, 0, owners, 56);
    }

    @Y61.k
    public final DE0.a<Boolean> v() {
        kotlin.reflect.n<Object> nVar = f67247d[1];
        return this.f67249c.a();
    }
}
