package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.notification.OnNotificationDisplayingResultAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationBootstrap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.NotificationBootstrap$process$1$1$1", f = "NotificationBootstrap.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class Q extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f165213q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ NotificationBootstrap f165214r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacEvent.Notification f165215s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IacBootstrap.a f165216t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(NotificationBootstrap notificationBootstrap, IacEvent.Notification notification, IacBootstrap.a aVar, Continuation<? super Q> continuation) {
        super(2, continuation);
        this.f165214r = notificationBootstrap;
        this.f165215s = notification;
        this.f165216t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Q(this.f165214r, this.f165215s, this.f165216t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((Q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f165213q;
        IacEvent.Notification notification = this.f165215s;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.iac_dialer.impl_module.notifications.new_impl.e eVar = this.f165214r.notificationManager;
            String callId = notification.getCallId();
            this.f165213q = 1;
            obj = eVar.a(callId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f165216t.a(new OnNotificationDisplayingResultAction(((Boolean) obj).booleanValue(), notification.getCallId()));
        return G0.f406611a;
    }
}
