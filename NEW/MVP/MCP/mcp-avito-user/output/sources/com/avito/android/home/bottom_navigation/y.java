package com.avito.android.home.bottom_navigation;

import com.avito.android.remote.model.TypedResult;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;
import s90.C48016a;

/* compiled from: BottomNavigationViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.home.bottom_navigation.BottomNavigationViewModel$isProObservable$isProProvider$1", f = "BottomNavigationViewModel.kt", i = {0}, l = {UpdateStatusCode.DialogButton.CONFIRM, 103}, m = "invokeSuspend", n = {"$this$rxObservable"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class y extends SuspendLambda implements Y41.p<I0<? super Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f162371q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f162372r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f162373s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(F f12, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f162373s = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        y yVar = new y(this.f162373s, continuation);
        yVar.f162372r = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super Boolean> i02, Continuation<? super G0> continuation) {
        return ((y) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f162371q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i02 = (I0) this.f162372r;
            s90.b bVar = this.f162373s.f162315L;
            this.f162372r = i02;
            this.f162371q = 1;
            obj = bVar.a(this);
            if (obj == coroutine_suspended) {
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
            i02 = (I0) this.f162372r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        Boolean boolBoxBoolean = Boxing.boxBoolean((typedResult instanceof TypedResult.Success) && ((C48016a) ((TypedResult.Success) typedResult).getResult()).f437498a);
        this.f162372r = null;
        this.f162371q = 2;
        if (i02.send(boolBoxBoolean, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
