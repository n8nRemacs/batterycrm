package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.model.CartSimilarItemsArguments;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Map;
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
import nn.InterfaceC44450a;
import on.C44825a;
import on.C44826b;

/* compiled from: CartSimilarItemsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/D;", "Lcom/avito/android/cart_similar_items/mvi/C;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class D implements C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44450a> f115931a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CartSimilarItemsArguments f115932b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f115933c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f115934d;

    /* compiled from: CartSimilarItemsRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lon/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsRepositoryImpl$getNextPage$2", f = "CartSimilarItemsRepository.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C44826b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115935q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f115937s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f115938t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f115937s = str;
            this.f115938t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return D.this.new a(this.f115937s, this.f115938t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C44826b>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115935q;
            if (i12 == 0) {
                C42729a0.b(obj);
                D d12 = D.this;
                InterfaceC44450a interfaceC44450a = d12.f115931a.get();
                this.f115935q = 1;
                obj = interfaceC44450a.b(this.f115937s, this.f115938t, d12.f115934d, this);
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

    /* compiled from: CartSimilarItemsRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lon/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsRepositoryImpl$getSimilarItems$2", f = "CartSimilarItemsRepository.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C44825a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115939q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return D.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C44825a>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115939q;
            if (i12 == 0) {
                C42729a0.b(obj);
                D d12 = D.this;
                InterfaceC44450a interfaceC44450a = d12.f115931a.get();
                String str = d12.f115932b.f115926d;
                this.f115939q = 1;
                obj = interfaceC44450a.a(str, d12.f115934d, this);
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
    public D(@Y61.k h31.e<InterfaceC44450a> eVar, @Y61.k CartSimilarItemsArguments cartSimilarItemsArguments, @Y61.k R0 r02) {
        this.f115931a = eVar;
        this.f115932b = cartSimilarItemsArguments;
        this.f115933c = r02;
        this.f115934d = A4.j(A4.f318516a, cartSimilarItemsArguments.f115927e);
    }

    @Override // com.avito.android.cart_similar_items.mvi.C
    @Y61.l
    public final Object a(@Y61.k String str, int i12, @Y61.k Continuation<? super TypedResult<C44826b>> continuation) {
        return C43259k.g(this.f115933c.a(), new a(str, i12, null), continuation);
    }

    @Override // com.avito.android.cart_similar_items.mvi.C
    @Y61.l
    public final Object b(@Y61.k Continuation<? super TypedResult<C44825a>> continuation) {
        return C43259k.g(this.f115933c.a(), new b(null), continuation);
    }
}
