package com.avito.android.trx_promo_impl.data;

import Y41.p;
import Y61.k;
import Y61.l;
import YF0.o;
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

/* compiled from: TrxPromoRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/data/b;", "Lcom/avito/android/trx_promo_impl/data/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.trx_promo_impl.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TF0.a f303911a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f303912b;

    /* compiled from: TrxPromoRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LUF0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_impl.data.TrxPromoRepositoryImpl$applyConfigurationV3$2", f = "TrxPromoRepository.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<UF0.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303913q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f303915s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f303916t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f303917u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f303918v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f303915s = str;
            this.f303916t = str2;
            this.f303917u = str3;
            this.f303918v = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f303915s, this.f303916t, this.f303917u, this.f303918v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<UF0.a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f303913q;
            if (i12 == 0) {
                C42729a0.b(obj);
                TF0.a aVar = b.this.f303911a;
                this.f303913q = 1;
                obj = aVar.d(this.f303915s, this.f303916t, this.f303917u, this.f303918v, this);
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

    /* compiled from: TrxPromoRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LVF0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_impl.data.TrxPromoRepositoryImpl$cancelConfiguration$2", f = "TrxPromoRepository.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.trx_promo_impl.data.b$b, reason: collision with other inner class name */
    public static final class C9316b extends SuspendLambda implements p<T, Continuation<? super TypedResult<VF0.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303919q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f303921s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9316b(String str, Continuation<? super C9316b> continuation) {
            super(2, continuation);
            this.f303921s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C9316b(this.f303921s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<VF0.a>> continuation) {
            return ((C9316b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f303919q;
            if (i12 == 0) {
                C42729a0.b(obj);
                TF0.a aVar = b.this.f303911a;
                this.f303919q = 1;
                obj = aVar.c(this.f303921s, this);
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

    /* compiled from: TrxPromoRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LYF0/o;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_impl.data.TrxPromoRepositoryImpl$getScreenDataV7$2", f = "TrxPromoRepository.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<o>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303922q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f303924s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f303924s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new c(this.f303924s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<o>> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f303922q;
            if (i12 == 0) {
                C42729a0.b(obj);
                TF0.a aVar = b.this.f303911a;
                this.f303922q = 1;
                obj = aVar.a(this.f303924s, this);
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
    public b(@k TF0.a aVar, @k R0 r02) {
        this.f303911a = aVar;
        this.f303912b = r02;
    }

    @Override // com.avito.android.trx_promo_impl.data.a
    @l
    public final Object a(@k String str, @k Continuation<? super TypedResult<VF0.a>> continuation) {
        return C43259k.g(this.f303912b.a(), new C9316b(str, null), continuation);
    }

    @Override // com.avito.android.trx_promo_impl.data.a
    @l
    public final Object b(@k String str, @l String str2, @l String str3, @k String str4, @k Continuation<? super TypedResult<UF0.a>> continuation) {
        return C43259k.g(this.f303912b.a(), new a(str, str4, str3, str2, null), continuation);
    }

    @Override // com.avito.android.trx_promo_impl.data.a
    @l
    public final Object c(@k String str, @k Continuation<? super TypedResult<o>> continuation) {
        return C43259k.g(this.f303912b.a(), new c(str, null), continuation);
    }
}
