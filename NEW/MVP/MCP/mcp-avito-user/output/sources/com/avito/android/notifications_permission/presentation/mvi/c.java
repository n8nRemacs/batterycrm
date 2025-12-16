package com.avito.android.notifications_permission.presentation.mvi;

import Q30.a;
import Y41.p;
import com.avito.android.notifications_permission.presentation.mvi.entity.NotificationPermissionInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NotificationPermissionInfoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.notifications_permission.presentation.mvi.NotificationPermissionInfoActor$process$3", f = "NotificationPermissionInfoActor.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super NotificationPermissionInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207865q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207866r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f207867s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Q30.a f207868t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Q30.a aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f207867s = dVar;
        this.f207868t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f207867s, this.f207868t, continuation);
        cVar.f207866r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super NotificationPermissionInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f207865q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f207866r;
            com.avito.android.notifications_permission.analytics.b bVar = this.f207867s.f207871c;
            bVar.f207832b.c(((a.c) this.f207868t).f13443a ? new com.avito.android.notifications_permission.analytics.a((String) bVar.f207833c.getValue()) : new com.avito.android.notifications_permission.analytics.f((String) bVar.f207833c.getValue()));
            NotificationPermissionInfoInternalAction.CloseScreen closeScreen = NotificationPermissionInfoInternalAction.CloseScreen.f207876b;
            this.f207865q = 1;
            if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
