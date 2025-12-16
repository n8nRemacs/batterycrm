package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetrica;

/* loaded from: classes8.dex */
public final class qa {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final py0 f389123a;

    public qa(@Y61.k py0 py0Var) {
        this.f389123a = py0Var;
    }

    @Y61.l
    public final IReporter a(@Y61.k Context context) {
        String str = h7.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        try {
            YandexMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(str).withStatisticsSending(this.f389123a.b(context)).build());
            return YandexMetrica.getReporter(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
