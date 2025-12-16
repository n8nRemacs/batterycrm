package com.avito.android.tariff.cpx.limit.save.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.DeepLinkResponse;
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

/* compiled from: PostTariffCpxLimitSaveUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/save/domain/b;", "Lcom/avito/android/tariff/cpx/limit/save/domain/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff.cpx.limit.save.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WB0.a f297218a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f297219b;

    /* compiled from: PostTariffCpxLimitSaveUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpx.limit.save.domain.PostTariffCpxLimitSaveUseCaseImpl$execute$2", f = "PostTariffCpxLimitSaveUseCase.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<DeepLinkResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f297220q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f297222s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f297222s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f297222s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<DeepLinkResponse>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f297220q;
            if (i12 == 0) {
                C42729a0.b(obj);
                WB0.a aVar = b.this.f297218a;
                this.f297220q = 1;
                obj = aVar.r(this.f297222s, this);
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
    public b(@k WB0.a aVar, @k R0 r02) {
        this.f297218a = aVar;
        this.f297219b = r02;
    }

    @Override // com.avito.android.tariff.cpx.limit.save.domain.a
    @l
    public final Object a(@k String str, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation) {
        return C43259k.g(this.f297219b.a(), new a(str, null), continuation);
    }
}
