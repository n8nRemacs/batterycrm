package com.avito.android.comfortable_deal.repository;

import Y41.p;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.remote.model.TypedResult;
import cp.InterfaceC39387a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ComfortableDealRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "Ldp/f;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$getComments$2", f = "ComfortableDealRepository.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super TypedResult<List<? extends dp.f>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122584q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f122585r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f122586s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CommentsFilter f122587t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, String str, CommentsFilter commentsFilter, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f122585r = dVar;
        this.f122586s = str;
        this.f122587t = commentsFilter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f122585r, this.f122586s, this.f122587t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<List<? extends dp.f>>> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f122584q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC39387a interfaceC39387aY = d.y(this.f122585r);
            CommentsFilter commentsFilter = this.f122587t;
            String str = commentsFilter != null ? commentsFilter.f122620b : null;
            this.f122584q = 1;
            obj = interfaceC39387aY.f(this.f122586s, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new TypedResult.Success(((dp.k) ((TypedResult.Success) typedResult).getResult()).a());
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
