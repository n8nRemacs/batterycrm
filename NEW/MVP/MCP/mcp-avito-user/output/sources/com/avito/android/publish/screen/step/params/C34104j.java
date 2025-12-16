package com.avito.android.publish.screen.step.params;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PublishDetailsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$observeSelectAddressDeeplinkResult$4", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.publish.screen.step.params.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34104j extends SuspendLambda implements Y41.p<AddressParameter.Value, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f241316q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f241317r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34104j(p pVar, Continuation<? super C34104j> continuation) {
        super(2, continuation);
        this.f241317r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34104j c34104j = new C34104j(this.f241317r, continuation);
        c34104j.f241316q = obj;
        return c34104j;
    }

    @Override // Y41.p
    public final Object invoke(AddressParameter.Value value, Continuation<? super G0> continuation) {
        return ((C34104j) create(value, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f241317r.f241521f.v((AddressParameter.Value) this.f241316q);
        return G0.f406611a;
    }
}
