package com.avito.android.user_viewed.domain.business;

import Y41.q;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_viewed.domain.model.UserViewedData;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_viewed.domain.business.UserViewedCommonInteractorImpl$observe$$inlined$flatMapLatest$1", f = "UserViewedCommonInteractor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class b extends SuspendLambda implements q<InterfaceC43172j<? super TypedResult<UserViewedData>>, G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f318330q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f318331r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f318332s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f318333t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, Continuation continuation) {
        super(3, continuation);
        this.f318333t = fVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TypedResult<UserViewedData>> interfaceC43172j, G0 g02, Continuation<? super G0> continuation) {
        b bVar = new b(this.f318333t, continuation);
        bVar.f318331r = interfaceC43172j;
        bVar.f318332s = g02;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f318330q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f318331r;
            f fVar = this.f318333t;
            C43152f0 c43152f0 = new C43152f0(C43175k.L(new d(fVar, null), fVar.f318342a.a()), new e(3, null));
            this.f318330q = 1;
            if (C43175k.u(this, c43152f0, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
