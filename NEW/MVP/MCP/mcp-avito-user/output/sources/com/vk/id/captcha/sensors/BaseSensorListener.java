package com.vk.id.captcha.sensors;

import Y41.l;
import Y61.k;
import com.vk.id.captcha.sensors.a.a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BaseSensorListener.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0010J#\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/vk/id/captcha/sensors/BaseSensorListener;", "Lcom/vk/id/captcha/sensors/model/SensorData;", "T", "", "Lkotlin/Function1;", "Lkotlin/G0;", "listener", "setOnSensorChangedListener", "(LY41/l;)V", "Lcom/vk/id/captcha/sensors/model/PeriodMs;", "periodMs", "startListening-6M9zLzk", "(I)V", "startListening", "stopListening", "()V", "Companion", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.vk.id.captcha.c.c, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public interface BaseSensorListener<T extends com.vk.id.captcha.sensors.a.a> {

    /* compiled from: BaseSensorListener.kt */
    /* renamed from: com.vk.id.captcha.c.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f366816a = new a();

        private a() {
        }
    }

    void a();

    void a(int i12);

    void a(@k l<? super T, G0> lVar);
}
