package com.vk.id.captcha.sensors;

import Y41.a;
import Y61.k;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AndroidSensorListener.kt */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    private static final InterfaceC42726C f366814a = C42727D.c(AnonymousClass1.f366815a);

    /* compiled from: AndroidSensorListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/c/d;", "a", "()Lcom/vk/id/captcha/c/d;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.b$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements a<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f366815a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return new d("vk-sensor-thread");
        }
    }

    @k
    public static final d a() {
        return (d) f366814a.getValue();
    }
}
