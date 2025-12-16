package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$3", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29200i extends SuspendLambda implements Y41.p<InterfaceC29127b, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112456q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29105a f112457r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.bxcontent.mvi.entity.l> f112458s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29200i(Y41.a aVar, C29105a c29105a, Continuation continuation) {
        super(2, continuation);
        this.f112457r = c29105a;
        this.f112458s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29200i c29200i = new C29200i(this.f112458s, this.f112457r, continuation);
        c29200i.f112456q = obj;
        return c29200i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC29127b interfaceC29127b, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
        return ((C29200i) create(interfaceC29127b, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f112457r.b((InterfaceC29127b) this.f112456q, this.f112458s.invoke());
    }
}
