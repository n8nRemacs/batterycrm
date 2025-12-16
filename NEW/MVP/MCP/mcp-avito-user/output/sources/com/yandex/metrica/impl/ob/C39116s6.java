package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.s6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39116s6 {

    /* renamed from: a, reason: collision with root package name */
    private final A0 f381821a;

    public C39116s6(@Y61.k A0 a02) {
        this.f381821a = a02;
    }

    @Y61.k
    public final H6 a(@Y61.k PluginErrorDetails pluginErrorDetails) {
        return I6.a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.f381821a.a(), this.f381821a.b());
    }
}
