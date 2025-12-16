package com.avito.android.short_term_rent.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrIncreasedCashbackApplyResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: StrIncreasedCashbackApplyUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/h;", "Lcom/avito/android/short_term_rent/deeplink/g;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f282264a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f282265b;

    /* compiled from: StrIncreasedCashbackApplyUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrIncreasedCashbackApplyResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.deeplink.StrIncreasedCashbackApplyUseCaseImpl$execute$2", f = "StrIncreasedCashbackApplyUseCase.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<StrIncreasedCashbackApplyResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282266q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return h.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<StrIncreasedCashbackApplyResponse>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282266q;
            if (i12 == 0) {
                C42729a0.b(obj);
                d1 d1Var = h.this.f282264a;
                this.f282266q = 1;
                obj = d1Var.h(this);
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

    @Inject
    public h(@k d1 d1Var, @k R0 r02) {
        this.f282264a = d1Var;
        this.f282265b = r02;
    }

    @Override // com.avito.android.short_term_rent.deeplink.g
    @l
    public final Object a(@k Continuation<? super TypedResult<StrIncreasedCashbackApplyResponse>> continuation) {
        return C43259k.g(this.f282265b.a(), new a(null), continuation);
    }
}
