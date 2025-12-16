package com.avito.android.virtual_deal_room.client_edit;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;

/* compiled from: ClientEditView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditViewImpl$actionDoneListener$1", f = "ClientEditView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f326138q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Y41.a<G0> aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f326138q = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f326138q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((d) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f326138q.invoke();
        return G0.f406611a;
    }
}
