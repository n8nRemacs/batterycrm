package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.Bundle;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.oj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39033oj implements T0 {
    @Override // com.yandex.metrica.impl.ob.T0
    @j.P
    public String a() {
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void b(boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.P
    public String c() {
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.P
    public C38915k1 d() {
        return new C38915k1(new C38908jj());
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC38790f0.a
    public void a(int i12, @j.N Bundle bundle) {
    }

    @Override // com.yandex.metrica.impl.ob.O0
    @j.N
    public N0 b() {
        return new C38983mj();
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void c(@j.N com.yandex.metrica.f fVar) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(@j.P Location location) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void c(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a(@j.N AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a(@j.N YandexMetricaConfig yandexMetricaConfig, @j.N com.yandex.metrica.j jVar) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.N
    public M0 a(@j.N com.yandex.metrica.f fVar) {
        return new C38958lj();
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a(IIdentifierCallback iIdentifierCallback, @j.N List<String> list) {
        iIdentifierCallback.onRequestError(IIdentifierCallback.Reason.UNKNOWN);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void setStatisticsSending(boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void setUserProfileID(@j.P String str) {
    }
}
