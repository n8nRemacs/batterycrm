package com.avito.android.checkout.domain;

import Y41.p;
import Y61.l;
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
import so.InterfaceC48388a;
import uo.InterfaceC49084a;

/* compiled from: CheckoutSaveV3UseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/domain/e;", "Lcom/avito/android/checkout/domain/d;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48388a f118301a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f118302b;

    /* compiled from: CheckoutSaveV3UseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Luo/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.checkout.domain.CheckoutSaveV3UseCaseImpl$execute$2", f = "CheckoutSaveV3UseCase.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<InterfaceC49084a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f118303q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f118305s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118305s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new a(this.f118305s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<InterfaceC49084a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f118303q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC48388a interfaceC48388a = e.this.f118301a;
                this.f118303q = 1;
                obj = interfaceC48388a.d(this.f118305s, this);
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
    public e(@Y61.k InterfaceC48388a interfaceC48388a, @Y61.k R0 r02) {
        this.f118301a = interfaceC48388a;
        this.f118302b = r02;
    }

    @Override // com.avito.android.checkout.domain.d
    @l
    public final Object a(@Y61.k String str, @Y61.k Continuation<? super TypedResult<InterfaceC49084a>> continuation) {
        return C43259k.g(this.f118302b.a(), new a(str, null), continuation);
    }
}
