package com.avito.android.favorite_sellers;

import FC.a;
import FC.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: FavoriteSellersView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$handleOneTimeEvent$1", f = "FavoriteSellersView.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class z extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156177q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f156178r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FC.b f156179s;

    /* compiled from: FavoriteSellersView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H f156180l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FC.b f156181m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H h12, FC.b bVar) {
            super(0);
            this.f156180l = h12;
            this.f156181m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f156180l.f155430d.accept(new a.k(((b.d) this.f156181m).f4617b));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(H h12, FC.b bVar, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f156178r = h12;
        this.f156179s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new z(this.f156178r, this.f156179s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156177q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f156177q = 1;
            if (C43131e0.b(2500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        H h12 = this.f156178r;
        h12.c(new a(h12, this.f156179s));
        return G0.f406611a;
    }
}
