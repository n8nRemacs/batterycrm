package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.rtm.service.EventToReporterProxy;
import j.N;

/* loaded from: classes7.dex */
public class l implements f {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final EventToReporterProxy f382498a;

    public l(@N Context context, @N ICommonExecutor iCommonExecutor) {
        this.f382498a = new EventToReporterProxy(new a(), context, iCommonExecutor, new c());
    }

    @Override // com.yandex.metrica.rtm.wrapper.f
    public final void reportData(@N Bundle bundle) {
        try {
            this.f382498a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }
}
