package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.startup_task;

import com.avito.android.permissions.PermissionState;
import com.avito.android.util.V2;
import ig0.AbstractC41398a;
import kotlin.Metadata;
import l41.o;

/* compiled from: IacUpdateAvailabilityTask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/permissions/PermissionState;", "permissionState", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/permissions/PermissionState;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IacUpdateAvailabilityTask f168385b;

    public c(IacUpdateAvailabilityTask iacUpdateAvailabilityTask) {
        this.f168385b = iacUpdateAvailabilityTask;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        V2.f318762a.c("IacUpdateAvailabilityTask", "Try to update availability. micPermissionState=" + ((PermissionState) obj), null);
        return this.f168385b.iacDeviceAvailabilityUpdater.a(AbstractC41398a.C11383a.f398615c).l(b.f168384b).r();
    }
}
