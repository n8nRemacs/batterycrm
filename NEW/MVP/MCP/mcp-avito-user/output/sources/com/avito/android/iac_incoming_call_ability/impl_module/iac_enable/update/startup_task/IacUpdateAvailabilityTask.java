package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.startup_task;

import Y61.k;
import android.app.Application;
import com.avito.android.account.E;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.app_foreground_provider.util_module.AppForegroundStatus;
import com.avito.android.permissions.z;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.mixed.v;
import io.reactivex.rxjava3.internal.operators.observable.Z;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.o;

/* compiled from: IacUpdateAvailabilityTask.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/startup_task/IacUpdateAvailabilityTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/app_foreground_provider/util_module/a;", "iacAppForegroundProvider", "Lcom/avito/android/permissions/z;", "permissionStateProvider", "Lcom/avito/android/account/E;", "accountStateProvider", "Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/a;", "iacDeviceAvailabilityUpdater", "LNL/e;", "iacSettingsInteractor", "<init>", "(Lcom/avito/android/app_foreground_provider/util_module/a;Lcom/avito/android/permissions/z;Lcom/avito/android/account/E;Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/a;LNL/e;)V", "Lkotlin/G0;", "subscribeToMicAccessOnEachResumingToApp", "()V", "tryToUpdateIacEnable", "Landroid/app/Application;", "application", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/app_foreground_provider/util_module/a;", "Lcom/avito/android/permissions/z;", "Lcom/avito/android/account/E;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/a;", "LNL/e;", "Companion", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacUpdateAvailabilityTask implements ApplicationBackgroundStartupTask {

    @k
    private final E accountStateProvider;

    @k
    private final com.avito.android.app_foreground_provider.util_module.a iacAppForegroundProvider;

    @k
    private final com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a iacDeviceAvailabilityUpdater;

    @k
    private final NL.e iacSettingsInteractor;

    @k
    private final z permissionStateProvider;

    /* compiled from: IacUpdateAvailabilityTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "apply", "(Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f168380b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Boolean.valueOf(((AppForegroundStatus) obj).isForeground());
        }
    }

    /* compiled from: IacUpdateAvailabilityTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isAppForeground", "Lio/reactivex/rxjava3/core/g;", "apply", "(Z)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                return C41823n.f402260b;
            }
            IacUpdateAvailabilityTask iacUpdateAvailabilityTask = IacUpdateAvailabilityTask.this;
            return new Z(iacUpdateAvailabilityTask.permissionStateProvider.a().D(io.reactivex.rxjava3.internal.functions.a.f401991a).N(new a(iacUpdateAvailabilityTask)), new com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.startup_task.c(iacUpdateAvailabilityTask));
        }
    }

    /* compiled from: IacUpdateAvailabilityTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f168382b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("IacUpdateAvailabilityTask", "Can't update availability", (Throwable) obj);
        }
    }

    @Inject
    public IacUpdateAvailabilityTask(@k com.avito.android.app_foreground_provider.util_module.a aVar, @k z zVar, @k E e12, @k com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a aVar2, @k NL.e eVar) {
        this.iacAppForegroundProvider = aVar;
        this.permissionStateProvider = zVar;
        this.accountStateProvider = e12;
        this.iacDeviceAvailabilityUpdater = aVar2;
        this.iacSettingsInteractor = eVar;
    }

    private final void subscribeToMicAccessOnEachResumingToApp() {
        new v(this.iacAppForegroundProvider.b().d0(b.f168380b).D(io.reactivex.rxjava3.internal.functions.a.f401991a), new c()).l(d.f168382b).r().u();
    }

    private final void tryToUpdateIacEnable() {
        if (this.accountStateProvider.b()) {
            this.iacSettingsInteractor.c().r().u();
        }
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        subscribeToMicAccessOnEachResumingToApp();
        tryToUpdateIacEnable();
    }
}
