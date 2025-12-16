package com.avito.android.verification.verification_finish.mvi;

import QM0.a;
import Y41.p;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FinishActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_finish.mvi.FinishActor$process$1", f = "FinishActor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super FinishInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325269q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f325271s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ QM0.a f325272t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, QM0.a aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f325271s = cVar;
        this.f325272t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f325271s, this.f325272t, continuation);
        aVar.f325270r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FinishInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325269q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325270r;
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f325271s.f325277a;
            a.c cVar = (a.c) this.f325272t;
            b.a.a(aVar, cVar.f13696a, null, null, 6);
            if (cVar.f13696a instanceof ProfileSettingsLink) {
                FinishInternalAction.Close close = FinishInternalAction.Close.f325282b;
                this.f325269q = 1;
                if (interfaceC43172j.emit(close, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
