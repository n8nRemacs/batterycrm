package com.avito.android.fees_methods.common.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.K0;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: PaidPublishLimitsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/common/domain/b;", "Lcom/avito/android/fees_methods/common/domain/a;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.fees_methods.common.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final K0 f157931a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f157932b;

    /* compiled from: PaidPublishLimitsUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/LimitsInfo;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/LimitsInfo;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.fees_methods.common.domain.PaidPublishLimitsUseCaseImpl$invoke$2", f = "PaidPublishLimitsUseCase.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"limitsInfo"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super LimitsInfo>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.h f157933q;

        /* renamed from: r, reason: collision with root package name */
        public int f157934r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f157936t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f157937u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f157936t = str;
            this.f157937u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f157936t, this.f157937u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super LimitsInfo> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r6v12, types: [T, com.avito.android.remote.model.LimitsInfo] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            l0.h hVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f157934r;
            if (i12 == 0) {
                l0.h hVarT = H.t(obj);
                K0 k02 = b.this.f157931a;
                this.f157933q = hVarT;
                this.f157934r = 1;
                Object objB = k02.b(this.f157936t, this.f157937u, "pay", this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hVar = hVarT;
                obj = objB;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = this.f157933q;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                hVar.f406842b = (LimitsInfo) ((TypedResult.Success) typedResult).getResult();
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                hVar.f406842b = null;
            }
            return hVar.f406842b;
        }
    }

    @Inject
    public b(@k K0 k02, @k R0 r02) {
        this.f157931a = k02;
        this.f157932b = r02;
    }

    @Override // com.avito.android.fees_methods.common.domain.a
    @l
    public final Object a(@l String str, @l String str2, @k Continuation<? super LimitsInfo> continuation) {
        return C43259k.g(this.f157932b.a(), new a(str, str2, null), continuation);
    }
}
