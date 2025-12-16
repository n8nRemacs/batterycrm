package com.avito.android.safedeal.delivery.order_cancellation.data;

import Y41.p;
import Y61.k;
import Y61.l;
import bk0.InterfaceC25671a;
import ck0.C27212a;
import com.avito.android.remote.B;
import com.avito.android.remote.model.OrderCancellationReasons;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import h31.e;
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

/* compiled from: RdsOrderCancellationRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/data/b;", "Lcom/avito/android/safedeal/delivery/order_cancellation/data/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.safedeal.delivery.order_cancellation.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<B> f256094a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<InterfaceC25671a> f256095b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f256096c;

    /* compiled from: RdsOrderCancellationRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/OrderCancellationReasons;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safedeal.delivery.order_cancellation.data.RdsOrderCancellationRepositoryImpl$getReasons$2", f = "RdsOrderCancellationRepositoryImpl.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<OrderCancellationReasons>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f256097q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f256099s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f256099s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f256099s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<OrderCancellationReasons>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f256097q;
            if (i12 == 0) {
                C42729a0.b(obj);
                B b12 = b.this.f256094a.get();
                this.f256097q = 1;
                obj = b12.f(this.f256099s, this);
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

    /* compiled from: RdsOrderCancellationRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lck0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safedeal.delivery.order_cancellation.data.RdsOrderCancellationRepositoryImpl$isFBSEntryPointOpen$2", f = "RdsOrderCancellationRepositoryImpl.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.safedeal.delivery.order_cancellation.data.b$b, reason: collision with other inner class name */
    public static final class C7670b extends SuspendLambda implements p<T, Continuation<? super TypedResult<C27212a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f256100q;

        public C7670b(Continuation<? super C7670b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C7670b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C27212a>> continuation) {
            return ((C7670b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f256100q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC25671a interfaceC25671a = b.this.f256095b.get();
                this.f256100q = 1;
                obj = interfaceC25671a.a(this);
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
    public b(@k R0 r02, @k e eVar, @k e eVar2) {
        this.f256094a = eVar;
        this.f256095b = eVar2;
        this.f256096c = r02;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.data.a
    @l
    public final Object a(@k String str, @k Continuation continuation) {
        return C43259k.g(this.f256096c.a(), new c(this, str, null), continuation);
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.data.a
    @l
    public final Object b(@k Continuation<? super TypedResult<C27212a>> continuation) {
        return C43259k.g(this.f256096c.a(), new C7670b(null), continuation);
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.data.a
    @l
    public final Object c(@k String str, @k Continuation<? super TypedResult<OrderCancellationReasons>> continuation) {
        return C43259k.g(this.f256096c.a(), new a(str, null), continuation);
    }
}
