package com.vk.id.captcha.sensors;

import Y41.l;
import Y61.k;
import com.vk.id.captcha.sensors.a.a;
import com.vk.id.captcha.sensors.a.b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SensorsDataRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001JI\u0010\u000e\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001c\u0010\u000b\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\t\u0012\u0004\u0012\u00020\n0\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/vk/id/captcha/sensors/SensorsDataRepository;", "", "", "Lcom/vk/id/captcha/sensors/model/Sensors;", "sensors", "Lcom/vk/id/captcha/sensors/model/PeriodMs;", "periodMs", "Lkotlin/Function1;", "Lcom/vk/id/captcha/sensors/model/SensorData;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "Lkotlin/G0;", "onDataUpdate", "startListening-vmuVbT4", "(Ljava/util/List;ILY41/l;)V", "startListening", "stopListening", "()V", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.vk.id.captcha.c.e, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public interface SensorsDataRepository {
    void a();

    void a(@k List<? extends b> list, int i12, @k l<? super List<? extends a>, G0> lVar);
}
