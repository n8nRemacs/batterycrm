package com.avito.android.seller_promotions.mvi;

import Oq0.d;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
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
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: SellerPromotionsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$4", f = "SellerPromotionsActor.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SellerPromotionsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f268023q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34670a f268024r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Oq0.d f268025s;

    /* compiled from: SellerPromotionsActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$4$1", f = "SellerPromotionsActor.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268026q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C34670a f268027r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Oq0.d f268028s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34670a c34670a, Oq0.d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f268027r = c34670a;
            this.f268028s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f268027r, this.f268028s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f268026q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C34670a c34670a = this.f268027r;
                com.avito.android.favorite.h hVar = c34670a.f267928c;
                d.k kVar = (d.k) this.f268028s;
                io.reactivex.rxjava3.core.I iG2 = hVar.g(kVar.f12589a, new AbstractC30567a.m(c34670a.f267931f.f267883h), kVar.f12590b, null, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0);
                this.f268026q = 1;
                if (C43292o.b(iG2, this) == coroutine_suspended) {
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
    public n(C34670a c34670a, Oq0.d dVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f268024r = c34670a;
        this.f268025s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f268024r, this.f268025s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f268023q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C34670a c34670a = this.f268024r;
            kotlinx.coroutines.scheduling.b bVarA = c34670a.f267929d.a();
            a aVar = new a(c34670a, this.f268025s, null);
            this.f268023q = 1;
            if (C43259k.g(bVarA, aVar, this) == coroutine_suspended) {
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
