package com.avito.android.publish.details;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.details.PublishDetailsFragment$observeSelectAddressDeeplinkResult$3", f = "PublishDetailsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class F0 extends SuspendLambda implements Y41.p<AddressParameter.Value, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f232929q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f232930r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(PublishDetailsFragment publishDetailsFragment, Continuation<? super F0> continuation) {
        super(2, continuation);
        this.f232930r = publishDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F0 f02 = new F0(this.f232930r, continuation);
        f02.f232929q = obj;
        return f02;
    }

    @Override // Y41.p
    public final Object invoke(AddressParameter.Value value, Continuation<? super kotlin.G0> continuation) {
        return ((F0) create(value, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        AddressParameter.Value value = (AddressParameter.Value) this.f232929q;
        com.avito.android.details.b bVar = this.f232930r.f135892n0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.v(value);
        return kotlin.G0.f406611a;
    }
}
