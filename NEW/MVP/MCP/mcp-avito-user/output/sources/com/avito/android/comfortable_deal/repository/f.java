package com.avito.android.comfortable_deal.repository;

import Y41.p;
import com.avito.android.comfortable_deal.api.model.TeamMemberPhone;
import com.avito.android.remote.model.TypedResult;
import cp.InterfaceC39387a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ComfortableDealRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comfortable_deal/api/model/TeamMemberPhone;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$getClientPhone$2", f = "ComfortableDealRepository.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super TypedResult<TeamMemberPhone>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122580q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f122581r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f122582s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f122583t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str, String str2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f122581r = dVar;
        this.f122582s = str;
        this.f122583t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f122581r, this.f122582s, this.f122583t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<TeamMemberPhone>> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f122580q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC39387a interfaceC39387aY = d.y(this.f122581r);
            this.f122580q = 1;
            obj = interfaceC39387aY.i(this.f122582s, this.f122583t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
