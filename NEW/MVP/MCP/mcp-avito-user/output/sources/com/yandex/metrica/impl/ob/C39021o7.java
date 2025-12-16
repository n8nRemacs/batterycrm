package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.NativeCrashesHelper;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.o7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39021o7 implements InterfaceC38921k7 {
    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    @j.N
    public String a() {
        return "YandexMetricaNativeCrashes";
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    public void b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    @j.N
    public String c() {
        return "YandexMetricaNativeModule";
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    public void a(@j.P String str) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    @j.l0
    public void a(@j.N String str, @j.N String str2, @j.P String str3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    public void a(boolean z12) {
        NativeCrashesHelper.logsEnabled(z12);
    }
}
