package com.avito.android.app.task;

import android.app.Application;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.InterfaceC34159q1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendPendingMessagesTask.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR'\u0010\"\u001a\u0015\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001e¢\u0006\u0002\b!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/app/task/SendPendingMessagesTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Landroidx/lifecycle/O;", "Lh31/e;", "Lcom/avito/android/app/task/P0;", "pendingMessageHandler", "Lcom/avito/android/q1;", "workFactory", "Lcom/avito/android/util/a5;", "schedulers", "<init>", "(Lh31/e;Lcom/avito/android/q1;Lcom/avito/android/util/a5;)V", "Lio/reactivex/rxjava3/core/H;", "foregroundHandlingScheduler", "Lio/reactivex/rxjava3/core/a;", "startHandlingWithWorkManager", "(Lio/reactivex/rxjava3/core/H;)Lio/reactivex/rxjava3/core/a;", "scheduler", "startForegroundHandling", "Lkotlin/G0;", "onResume", "()V", "onPause", "Landroid/app/Application;", "application", "execute", "(Landroid/app/Application;)V", "Lh31/e;", "Lcom/avito/android/q1;", "Lcom/avito/android/util/a5;", "Lcom/jakewharton/rxrelay3/b;", "", "kotlin.jvm.PlatformType", "Lj41/e;", "foregroundStream", "Lcom/jakewharton/rxrelay3/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendPendingMessagesTask implements ApplicationBackgroundStartupTask, InterfaceC22982O {

    @Y61.k
    private final com.jakewharton.rxrelay3.b<Boolean> foregroundStream = com.jakewharton.rxrelay3.b.N0(Boolean.FALSE);

    @Y61.k
    private final h31.e<P0> pendingMessageHandler;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    @Y61.k
    private final InterfaceC34159q1 workFactory;

    /* compiled from: SendPendingMessagesTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isForeground", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f91522b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SendPendingMessagesTask f91523c;

        public a(AtomicBoolean atomicBoolean, SendPendingMessagesTask sendPendingMessagesTask) {
            this.f91522b = atomicBoolean;
            this.f91523c = sendPendingMessagesTask;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            boolean zCompareAndSet = this.f91522b.compareAndSet(true, false);
            boolean zBooleanValue = bool.booleanValue();
            SendPendingMessagesTask sendPendingMessagesTask = this.f91523c;
            return zBooleanValue ? sendPendingMessagesTask.workFactory.a().k(new com.avito.android.advert_core.task.a(6)).h(io.reactivex.rxjava3.core.I.q(bool)).i(I1.f91466b).u(new com.avito.android.analytics.clickstream.I(3)) : zCompareAndSet ? sendPendingMessagesTask.workFactory.b(0L, false).k(new com.avito.android.advert_core.task.a(7)).l(J1.f91475b).h(io.reactivex.rxjava3.core.I.q(bool)).u(new com.avito.android.analytics.clickstream.I(3)) : sendPendingMessagesTask.workFactory.b(30L, true).k(new com.avito.android.advert_core.task.a(8)).j(30L, TimeUnit.SECONDS, sendPendingMessagesTask.schedulers.c()).h(io.reactivex.rxjava3.core.I.q(bool)).i(K1.f91479b).u(new com.avito.android.analytics.clickstream.I(3));
        }
    }

    /* compiled from: SendPendingMessagesTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isForeground", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.core.H f91525c;

        public b(io.reactivex.rxjava3.core.H h12) {
            this.f91525c = h12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((Boolean) obj).booleanValue() ? SendPendingMessagesTask.this.startForegroundHandling(this.f91525c).n(L1.f91481b) : new C41826q(new com.avito.android.advert_core.task.a(9));
        }
    }

    @Inject
    public SendPendingMessagesTask(@Y61.k h31.e<P0> eVar, @Y61.k InterfaceC34159q1 interfaceC34159q1, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.pendingMessageHandler = eVar;
        this.workFactory = interfaceC34159q1;
        this.schedulers = interfaceC35745a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.G0 execute$lambda$0(SendPendingMessagesTask sendPendingMessagesTask) {
        C23050m0.f46822j.getClass();
        C23050m0.f46823k.f46829g.a(sendPendingMessagesTask);
        return kotlin.G0.f406611a;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        this.foregroundStream.accept(Boolean.FALSE);
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        this.foregroundStream.accept(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC41768a startForegroundHandling(io.reactivex.rxjava3.core.H scheduler) {
        return this.pendingMessageHandler.get().a(scheduler);
    }

    private final AbstractC41768a startHandlingWithWorkManager(io.reactivex.rxjava3.core.H foregroundHandlingScheduler) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = this.foregroundStream.j0(this.schedulers.c());
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        return new io.reactivex.rxjava3.internal.operators.mixed.v(new io.reactivex.rxjava3.internal.operators.mixed.x(i0J0.D(oVar), new a(atomicBoolean, this)).D(oVar), new b(foregroundHandlingScheduler));
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        startHandlingWithWorkManager(new hu.akarnokd.rxjava3.schedulers.c(this.schedulers.a())).u();
        new io.reactivex.rxjava3.internal.operators.completable.r(new VH0.c(this, 9)).x(this.schedulers.e()).u();
    }
}
