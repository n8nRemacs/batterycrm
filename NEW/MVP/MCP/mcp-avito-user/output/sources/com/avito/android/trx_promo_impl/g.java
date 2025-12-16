package com.avito.android.trx_promo_impl;

import Y41.p;
import ZF0.a;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.trx_promo_impl.TrxPromoFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import okhttp3.internal.http.StatusLine;

/* compiled from: TrxPromoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_impl.TrxPromoFragment$subscribeToCommissionChange$1", f = "TrxPromoFragment.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f304173q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TrxPromoFragment f304174r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ZF0.a, G0> f304175s;

    /* compiled from: TrxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.trx_promo_impl.TrxPromoFragment$subscribeToCommissionChange$1$1", f = "TrxPromoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f304176q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TrxPromoFragment f304177r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ZF0.a, G0> f304178s;

        /* compiled from: TrxPromoFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.trx_promo_impl.TrxPromoFragment$subscribeToCommissionChange$1$1$1", f = "TrxPromoFragment.kt", i = {}, l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.trx_promo_impl.g$a$a, reason: collision with other inner class name */
        public static final class C9334a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f304179q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TrxPromoFragment f304180r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Y41.l<ZF0.a, G0> f304181s;

            /* compiled from: TrxPromoFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.trx_promo_impl.g$a$a$a, reason: collision with other inner class name */
            public static final class C9335a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Y41.l<ZF0.a, G0> f304182b;

                /* JADX WARN: Multi-variable type inference failed */
                public C9335a(Y41.l<? super ZF0.a, G0> lVar) {
                    this.f304182b = lVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    ((TrxPromoFragment.g) this.f304182b).invoke(new a.b(((Number) obj).intValue()));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C9334a(TrxPromoFragment trxPromoFragment, Y41.l<? super ZF0.a, G0> lVar, Continuation<? super C9334a> continuation) {
                super(2, continuation);
                this.f304180r = trxPromoFragment;
                this.f304181s = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C9334a(this.f304180r, this.f304181s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C9334a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f304179q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.trx_promo_impl.item.commission.d dVar = this.f304180r.f303875r0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    e2 f304241d = dVar.getF304241d();
                    C9335a c9335a = new C9335a(this.f304181s);
                    this.f304179q = 1;
                    f304241d.getClass();
                    if (e2.g(f304241d, c9335a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TrxPromoFragment trxPromoFragment, Y41.l<? super ZF0.a, G0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f304177r = trxPromoFragment;
            this.f304178s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f304177r, this.f304178s, continuation);
            aVar.f304176q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((T) this.f304176q, null, null, new C9334a(this.f304177r, this.f304178s, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(TrxPromoFragment trxPromoFragment, Y41.l<? super ZF0.a, G0> lVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f304174r = trxPromoFragment;
        this.f304175s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f304174r, this.f304175s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f304173q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            Y41.l<ZF0.a, G0> lVar = this.f304175s;
            TrxPromoFragment trxPromoFragment = this.f304174r;
            a aVar = new a(trxPromoFragment, lVar, null);
            this.f304173q = 1;
            if (C23056p0.b(trxPromoFragment, state, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
