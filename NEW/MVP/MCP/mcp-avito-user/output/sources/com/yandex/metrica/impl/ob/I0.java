package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import java.util.Map;

/* loaded from: classes7.dex */
public interface I0 extends M0, IPluginReporter {
    void a(int i12, String str, String str2, Map<String, String> map, Map<String, byte[]> map2);

    void a(@j.N String str, @j.P String str2);

    void a(String str, byte[] bArr);

    void b(@j.N String str);

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    /* synthetic */ void b(@j.P String str, @j.P String str2);

    void c(@j.P String str);

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    /* synthetic */ void d(@j.N String str, @j.P String str2);
}
