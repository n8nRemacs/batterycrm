package com.avito.android.iac_dialer_watcher.impl_module.logging.task;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Application;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.IacLogSendingWorker;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: IacLogSendingPlannerStartupTask.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/task/IacLogSendingPlannerStartupTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Landroid/app/Application;", "application", "Lcom/avito/android/iac_dialer_watcher/impl_module/splitter/features/a;", "iacDialerWatcherFeatures", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/c;", "iacLogSendingShortTaskScheduler", "Lcom/avito/android/util/R0;", "dispatchersFactory", "<init>", "(Landroid/app/Application;Lcom/avito/android/iac_dialer_watcher/impl_module/splitter/features/a;Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/c;Lcom/avito/android/util/R0;)V", "Lkotlin/G0;", "execute", "()V", "Landroid/app/Application;", "Lcom/avito/android/iac_dialer_watcher/impl_module/splitter/features/a;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/c;", "Lcom/avito/android/util/R0;", "Companion", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacLogSendingPlannerStartupTask implements ApplicationForegroundStartupTask {

    @k
    private final Application application;

    @k
    private final R0 dispatchersFactory;

    @k
    private final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a iacDialerWatcherFeatures;

    @k
    private final com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.c iacLogSendingShortTaskScheduler;

    /* compiled from: IacLogSendingPlannerStartupTask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer_watcher.impl_module.logging.task.IacLogSendingPlannerStartupTask$execute$1", f = "IacLogSendingPlannerStartupTask.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f167942q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return IacLogSendingPlannerStartupTask.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IacLogSendingPlannerStartupTask iacLogSendingPlannerStartupTask = IacLogSendingPlannerStartupTask.this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f167942q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSendingPlannerStartupTask", "IacLogSending will be scheduled to start in 5000 millis", null);
                this.f167942q = 1;
                if (C43131e0.b(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            try {
                com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar = iacLogSendingPlannerStartupTask.iacDialerWatcherFeatures;
                aVar.getClass();
                n<Object> nVar = com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a.f168141e[2];
                if (((Boolean) aVar.f168144d.a().invoke()).booleanValue()) {
                    iacLogSendingPlannerStartupTask.iacLogSendingShortTaskScheduler.a(null, false);
                } else {
                    IacLogSendingWorker.a aVar2 = IacLogSendingWorker.f168050g;
                    Application application = iacLogSendingPlannerStartupTask.application;
                    aVar2.getClass();
                    IacLogSendingWorker.a.a(application, -1L, false);
                }
            } catch (Exception e12) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSendingPlannerStartupTask", "Error in scheduling IacLogSending", e12);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public IacLogSendingPlannerStartupTask(@k Application application, @k com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar, @k com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.c cVar, @k R0 r02) {
        this.application = application;
        this.iacDialerWatcherFeatures = aVar;
        this.iacLogSendingShortTaskScheduler = cVar;
        this.dispatchersFactory = r02;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        C43259k.d(U.a(this.dispatchersFactory.a()), null, null, new b(null), 3);
    }
}
