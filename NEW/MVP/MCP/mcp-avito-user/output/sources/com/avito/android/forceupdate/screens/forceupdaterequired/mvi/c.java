package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import Y41.p;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ForceUpdateRequiredActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.forceupdate.screens.forceupdaterequired.mvi.ForceUpdateRequiredActor$process$3", f = "ForceUpdateRequiredActor.kt", i = {0}, l = {49, 50}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super ForceUpdateRequiredInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f158496q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f158497r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f158498s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f158498s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f158498s, continuation);
        cVar.f158497r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ForceUpdateRequiredInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f158496q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f158497r;
            e.c(this.f158498s);
            ForceUpdateRequiredInternalAction.DownloadStarted downloadStarted = ForceUpdateRequiredInternalAction.DownloadStarted.f158504b;
            this.f158497r = interfaceC43172j;
            this.f158496q = 1;
            if (interfaceC43172j.emit(downloadStarted, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f158497r;
            C42729a0.b(obj);
        }
        ForceUpdateRequiredInternalAction.TrackClosedWithUpdate trackClosedWithUpdate = ForceUpdateRequiredInternalAction.TrackClosedWithUpdate.f158511b;
        this.f158497r = null;
        this.f158496q = 2;
        if (interfaceC43172j.emit(trackClosedWithUpdate, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
