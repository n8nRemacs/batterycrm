package com.avito.android.iac_dialer.impl_module.analytics.dnd_track_startup_task;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.notification.m;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import nJ.C44277l;

/* compiled from: DndTrackStartupTask.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/dnd_track_startup_task/DndTrackStartupTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/notification/m;", "notificationManagerFactory", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/util/R0;", "dispatchersFactory", "<init>", "(Lcom/avito/android/notification/m;Lcom/avito/android/analytics/a;Lcom/avito/android/util/R0;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/analytics/a;", "getAnalytics", "()Lcom/avito/android/analytics/a;", "Lcom/avito/android/util/R0;", "getDispatchersFactory", "()Lcom/avito/android/util/R0;", "Landroid/app/NotificationManager;", "notificationManager$delegate", "Lkotlin/C;", "getNotificationManager", "()Landroid/app/NotificationManager;", "notificationManager", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DndTrackStartupTask implements ApplicationBackgroundStartupTask {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final R0 dispatchersFactory;

    /* renamed from: notificationManager$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C notificationManager;

    /* compiled from: DndTrackStartupTask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.analytics.dnd_track_startup_task.DndTrackStartupTask$execute$1", f = "DndTrackStartupTask.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165665q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return DndTrackStartupTask.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165665q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f165665q = 1;
                if (C43131e0.b(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            DndTrackStartupTask dndTrackStartupTask = DndTrackStartupTask.this;
            InterfaceC28373a analytics = dndTrackStartupTask.getAnalytics();
            int currentInterruptionFilter = dndTrackStartupTask.getNotificationManager().getCurrentInterruptionFilter();
            analytics.c(new C44277l((currentInterruptionFilter == 0 || currentInterruptionFilter == 1) ? false : true));
            return G0.f406611a;
        }
    }

    /* compiled from: DndTrackStartupTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/NotificationManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<NotificationManager> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f165667l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super(0);
            this.f165667l = mVar;
        }

        @Override // Y41.a
        public final NotificationManager invoke() {
            return this.f165667l.a();
        }
    }

    @Inject
    public DndTrackStartupTask(@k m mVar, @k InterfaceC28373a interfaceC28373a, @k R0 r02) {
        this.analytics = interfaceC28373a;
        this.dispatchersFactory = r02;
        this.notificationManager = C42727D.c(new b(mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationManager getNotificationManager() {
        return (NotificationManager) this.notificationManager.getValue();
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @SuppressLint({"CheckResult"})
    public void execute(@k Application application) {
        C43259k.d(U.a(this.dispatchersFactory.a()), null, null, new a(null), 3);
    }

    @k
    public final InterfaceC28373a getAnalytics() {
        return this.analytics;
    }
}
