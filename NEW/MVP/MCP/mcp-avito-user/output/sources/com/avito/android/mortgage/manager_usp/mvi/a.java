package com.avito.android.mortgage.manager_usp.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z00.C50332a;
import z00.C50335d;

/* compiled from: ManagerUspActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.manager_usp.mvi.ManagerUspActor$process$1", f = "ManagerUspActor.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ManagerUspInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f200412q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f200413r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C50335d f200414s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C50335d c50335d, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f200414s = c50335d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f200414s, continuation);
        aVar.f200413r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ManagerUspInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C50332a c50332a;
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f200412q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f200413r;
            z00.f fVar = this.f200414s.f443688b;
            if (fVar == null || (c50332a = fVar.f443697c) == null || (deepLink = c50332a.f443682b) == null) {
                return G0.f406611a;
            }
            ManagerUspInternalAction.HandleDeeplinkClick handleDeeplinkClick = new ManagerUspInternalAction.HandleDeeplinkClick(deepLink);
            this.f200412q = 1;
            if (interfaceC43172j.emit(handleDeeplinkClick, this) == coroutine_suspended) {
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
