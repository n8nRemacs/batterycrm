package com.avito.android.publish.input_vin.mvi;

import com.avito.android.items.ItemWithAdditionalButton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ne0.InterfaceC44384a;

/* compiled from: InputVinMviFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/ItemWithAdditionalButton;", "item", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/items/ItemWithAdditionalButton;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.InputVinMviFragment$subscribeToItemPresenters$1$8", f = "InputVinMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class r extends SuspendLambda implements Y41.p<ItemWithAdditionalButton, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f236717q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InputVinMviFragment f236718r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InputVinMviFragment inputVinMviFragment, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f236718r = inputVinMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f236718r, continuation);
        rVar.f236717q = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(ItemWithAdditionalButton itemWithAdditionalButton, Continuation<? super G0> continuation) {
        return ((r) create(itemWithAdditionalButton, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f236718r.q5().accept(new InterfaceC44384a.C11865a((ItemWithAdditionalButton) this.f236717q));
        return G0.f406611a;
    }
}
