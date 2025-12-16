package com.vk.id.captcha.web;

import Y61.k;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VKCaptchaWebViewActivity.kt */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    private static final InterfaceC42726C f366865a = C42727D.c(AnonymousClass1.f366866a);

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/c/d;", "a", "()Lcom/vk/id/captcha/c/d;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.f$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.a<com.vk.id.captcha.sensors.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f366866a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.vk.id.captcha.sensors.d invoke() {
            return new com.vk.id.captcha.sensors.d("vk-webview-thread");
        }
    }

    @k
    public static final com.vk.id.captcha.sensors.d a() {
        return (com.vk.id.captcha.sensors.d) f366865a.getValue();
    }
}
