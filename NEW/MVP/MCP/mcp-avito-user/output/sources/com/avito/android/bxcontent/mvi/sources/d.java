package com.avito.android.bxcontent.mvi.sources;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.serp.adapter.l1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceOrderRequestsDataSource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/l1;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateItem;", "<anonymous>", "(Lcom/avito/android/serp/adapter/l1;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.sources.ServiceOrderRequestsDataSourceImpl$observeServiceOrderRequests$3", f = "ServiceOrderRequestsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<l1, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction.UpdateItem>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112558q;

    public d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(2, continuation);
        dVar.f112558q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(l1 l1Var, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction.UpdateItem>> continuation) {
        return ((d) create(l1Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        l1 l1Var = (l1) this.f112558q;
        return l1Var == null ? C43175k.w() : new C43210w(new BxContentInternalAction.UpdateItem(l1Var));
    }
}
