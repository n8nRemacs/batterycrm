package com.avito.android.favorite_sellers;

import FC.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: FavoriteSellersView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/I;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public N0 f155451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f155452c;

    /* compiled from: FavoriteSellersView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$viewPortListener$1$onScrolled$1", f = "FavoriteSellersView.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155453q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ H f155454r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ X f155455s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H h12, X x12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f155454r = h12;
            this.f155455s = x12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f155454r, this.f155455s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155453q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f155453q = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            this.f155454r.f155430d.accept(new a.n(this.f155455s));
            return G0.f406611a;
        }
    }

    public I(H h12) {
        this.f155452c = h12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        H h12 = this.f155452c;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) h12.f155442p.getLayoutManager();
        X x12 = new X(linearLayoutManager.K1(), linearLayoutManager.M1(), linearLayoutManager.L1());
        N0 n02 = this.f155451b;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f155451b = C43259k.d(C22981N.a(h12.f155431e.getLifecycle()), null, null, new a(h12, x12, null), 3);
    }
}
