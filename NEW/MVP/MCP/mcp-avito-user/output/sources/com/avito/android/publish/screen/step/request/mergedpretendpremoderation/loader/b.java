package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader;

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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;

/* compiled from: BasePretendPremoderationLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/a0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/a0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.BasePretendPremoderationLoader$async$2", f = "BasePretendPremoderationLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super InterfaceC43076a0<Object>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f241778q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f241779r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f241780s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar, p<? super T, ? super Continuation<Object>, ? extends Object> pVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f241779r = aVar;
        this.f241780s = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f241779r, this.f241780s, continuation);
        bVar.f241778q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super InterfaceC43076a0<Object>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.b((T) this.f241778q, this.f241779r.f241767a.a(), this.f241780s, 2);
    }
}
