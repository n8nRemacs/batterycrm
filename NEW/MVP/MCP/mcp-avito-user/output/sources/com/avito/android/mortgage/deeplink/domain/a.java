package com.avito.android.mortgage.deeplink.domain;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.internal.P;
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

/* compiled from: CheckApplicationIdRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/domain/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f198808a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f198809b;

    /* compiled from: CheckApplicationIdRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LJZ/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.deeplink.domain.CheckApplicationIdRepository$checkApplicationId$2", f = "CheckApplicationIdRepository.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.deeplink.domain.a$a, reason: collision with other inner class name */
    public static final class C5862a extends SuspendLambda implements p<T, Continuation<? super TypedResult<JZ.b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198810q;

        public C5862a(Continuation<? super C5862a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new C5862a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<JZ.b>> continuation) {
            return ((C5862a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f198810q;
            if (i12 == 0) {
                C42729a0.b(obj);
                IZ.a aVar = a.this.f198808a.get();
                this.f198810q = 1;
                obj = aVar.j(this);
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
    public a(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f198808a = eVar;
        this.f198809b = r02;
    }

    @l
    public final Object a(@Y61.k Continuation<? super TypedResult<JZ.b>> continuation) {
        return C43259k.g(this.f198809b.a(), new C5862a(null), continuation);
    }
}
