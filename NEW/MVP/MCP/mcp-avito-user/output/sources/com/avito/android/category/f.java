package com.avito.android.category;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoryFlowInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "<anonymous>", "(Ljava/util/Map;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.category.CategoryFlowInteractorImpl$loadSerpDeeplink$1", f = "CategoryFlowInteractor.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<Map<String, String>, Continuation<? super InterfaceC43160i<? extends TypedResult<DeepLinkResponse>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f116632q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116633r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f116634s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f116634s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f116634s, continuation);
        fVar.f116633r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(Map<String, String> map, Continuation<? super InterfaceC43160i<? extends TypedResult<DeepLinkResponse>>> continuation) {
        return ((f) create(map, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f116632q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Map<String, String> map = (Map) this.f116633r;
            V0 v02 = this.f116634s.f116636b.get();
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            this.f116632q = 1;
            obj = v02.h(boolBoxBoolean, null, map, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return new C43210w(obj);
    }
}
