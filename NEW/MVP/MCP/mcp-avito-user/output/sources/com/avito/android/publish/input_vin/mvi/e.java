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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUV0/a;", "Lcom/avito/conveyor_item/a;", "it", "Lkotlin/G0;", "<anonymous>", "(LUV0/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.InputVinMviFragment$subscribeToItemChanges$2", f = "InputVinMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements Y41.p<UV0.a<? extends com.avito.conveyor_item.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f236632q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InputVinMviFragment f236633r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputVinMviFragment inputVinMviFragment, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f236633r = inputVinMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f236633r, continuation);
        eVar.f236632q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(UV0.a<? extends com.avito.conveyor_item.a> aVar, Continuation<? super G0> continuation) {
        return ((e) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f236633r.q5().accept(new InterfaceC44384a.e((UV0.a) this.f236632q));
        return G0.f406611a;
    }
}
