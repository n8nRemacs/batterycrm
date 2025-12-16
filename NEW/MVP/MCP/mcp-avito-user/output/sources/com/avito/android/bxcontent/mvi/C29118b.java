package com.avito.android.bxcontent.mvi;

import com.avito.android.arch.mvi.utils.o;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$flowWithMutablePrivateStateAccess$1", f = "BxContentActor.kt", i = {}, l = {1798}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29118b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111747q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111748r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f111749s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f111750t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.k f111751u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29118b(Y41.q qVar, com.avito.android.arch.mvi.utils.o oVar, com.avito.android.bxcontent.mvi.entity.k kVar, Continuation continuation) {
        super(2, continuation);
        this.f111749s = (SuspendLambda) qVar;
        this.f111750t = oVar;
        this.f111751u = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29118b c29118b = new C29118b(this.f111749s, this.f111750t, this.f111751u, continuation);
        c29118b.f111748r = obj;
        return c29118b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29118b) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111747q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111748r;
            o.a aVar = this.f111750t.f92114c;
            this.f111747q = 1;
            if (this.f111749s.invoke(interfaceC43172j, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
