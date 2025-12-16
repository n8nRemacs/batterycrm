package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.ob.ResultReceiverC38790f0;
import j.InterfaceC42148d;
import java.util.List;

/* loaded from: classes7.dex */
public interface T0 extends InterfaceC38990n1, ResultReceiverC38790f0.a, O0 {
    @j.N
    @j.l0
    M0 a(@j.N com.yandex.metrica.f fVar);

    @j.P
    @InterfaceC42148d
    String a();

    @j.l0
    void a(@j.N AppMetricaDeviceIDListener appMetricaDeviceIDListener);

    @j.l0
    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    @j.l0
    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    @j.l0
    void a(IIdentifierCallback iIdentifierCallback, @j.N List<String> list);

    @j.l0
    void a(@j.N YandexMetricaConfig yandexMetricaConfig, @j.N com.yandex.metrica.j jVar);

    @j.P
    @InterfaceC42148d
    String c();

    @j.l0
    void c(@j.N com.yandex.metrica.f fVar);

    @j.P
    @InterfaceC42148d
    C38915k1 d();
}
