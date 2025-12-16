package com.avito.android.service.short_task.app_update;

import Y61.k;
import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AppUpdateTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/app_update/g;", "Lcom/avito/android/service/short_task/ShortTask;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class g implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f274050a;

    @Inject
    public g(@k e eVar) {
        this.f274050a = eVar;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @k
    public final I<ShortTask.Status> start(@k Bundle bundle) {
        e eVar = this.f274050a;
        return eVar.f274042a.a() != eVar.f274043b.a() ? z.c0(G0.f406611a).K(new b(eVar)).d0(c.f274040b).m0(d.f274041b).S() : I.q(ShortTask.Status.f274030b);
    }
}
