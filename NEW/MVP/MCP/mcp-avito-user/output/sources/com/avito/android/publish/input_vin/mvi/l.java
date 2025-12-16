package com.avito.android.publish.input_vin.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ne0.InterfaceC44384a;

/* compiled from: InputVinMviFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/input_vin/items/scan_button/c;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/publish/input_vin/items/scan_button/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.InputVinMviFragment$subscribeToItemPresenters$1$2", f = "InputVinMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends SuspendLambda implements Y41.p<com.avito.android.publish.input_vin.items.scan_button.c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InputVinMviFragment f236643q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InputVinMviFragment inputVinMviFragment, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f236643q = inputVinMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f236643q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.publish.input_vin.items.scan_button.c cVar, Continuation<? super G0> continuation) {
        return ((l) create(cVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f236643q.q5().accept(InterfaceC44384a.i.f415229a);
        return G0.f406611a;
    }
}
