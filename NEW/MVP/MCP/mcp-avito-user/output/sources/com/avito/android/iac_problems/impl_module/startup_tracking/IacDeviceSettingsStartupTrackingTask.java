package com.avito.android.iac_problems.impl_module.startup_tracking;

import Y61.k;
import android.app.Application;
import androidx.compose.runtime.internal.P;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import gM.d;
import gM.e;
import gM.g;
import hM.InterfaceC40849a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import nJ.C44263B;
import nJ.G;
import oM.C44664a;

/* compiled from: IacDeviceSettingsStartupTrackingTask.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/startup_tracking/IacDeviceSettingsStartupTrackingTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "LgM/g;", "micAccessTracker", "LgM/e;", "iacProblemStartupTracker", "<init>", "(LgM/g;LgM/e;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "LgM/g;", "LgM/e;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacDeviceSettingsStartupTrackingTask implements ApplicationBackgroundStartupTask {

    @k
    private final e iacProblemStartupTracker;

    @k
    private final g micAccessTracker;

    @Inject
    public IacDeviceSettingsStartupTrackingTask(@k g gVar, @k e eVar) {
        this.micAccessTracker = gVar;
        this.iacProblemStartupTracker = eVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        g gVar = this.micAccessTracker;
        boolean zB2 = gVar.f396466b.b("android.permission.RECORD_AUDIO");
        InterfaceC40849a interfaceC40849a = gVar.f396467c;
        if (!Boolean.valueOf(zB2).equals(interfaceC40849a.b())) {
            interfaceC40849a.g(Boolean.valueOf(zB2));
            gVar.f396465a.c(new G(zB2));
        }
        e eVar = this.iacProblemStartupTracker;
        List<IacProblem> listC = eVar.f396459a.c();
        InterfaceC40849a interfaceC40849a2 = eVar.f396461c;
        List<IacProblem> listH = interfaceC40849a2.h();
        if (L.f(listC, listH != null ? C42745f0.B0(listH, new d()) : null)) {
            return;
        }
        eVar.f396460b.c(new C44263B(C44664a.a(listC), null, 2, null));
        interfaceC40849a2.f(listC);
    }
}
