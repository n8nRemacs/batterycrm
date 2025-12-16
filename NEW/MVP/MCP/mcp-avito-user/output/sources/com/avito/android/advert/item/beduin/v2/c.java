package com.avito.android.advert.item.beduin.v2;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/c;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsBeduinItemVisibilityTrackerImpl f73283b;

    /* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.beduin.v2.AdvertDetailsBeduinItemVisibilityTrackerImpl$scrollListener$1$onScrolled$1$1", f = "AdvertDetailsBeduinItemVisibilityTracker.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f73284q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsBeduinItemVisibilityTrackerImpl f73285r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f73286s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertDetailsBeduinItemVisibilityTrackerImpl advertDetailsBeduinItemVisibilityTrackerImpl, RecyclerView recyclerView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f73285r = advertDetailsBeduinItemVisibilityTrackerImpl;
            this.f73286s = recyclerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f73285r, this.f73286s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f73284q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f73284q = 1;
                if (C43131e0.b(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            this.f73285r.c(this.f73286s);
            return G0.f406611a;
        }
    }

    public c(AdvertDetailsBeduinItemVisibilityTrackerImpl advertDetailsBeduinItemVisibilityTrackerImpl) {
        this.f73283b = advertDetailsBeduinItemVisibilityTrackerImpl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        AdvertDetailsBeduinItemVisibilityTrackerImpl advertDetailsBeduinItemVisibilityTrackerImpl = this.f73283b;
        C43238h c43238h = advertDetailsBeduinItemVisibilityTrackerImpl.f73259d;
        if (c43238h != null) {
            N0 n02 = advertDetailsBeduinItemVisibilityTrackerImpl.f73261f;
            if (n02 == null || !((AbstractC43075a) n02).isActive()) {
                advertDetailsBeduinItemVisibilityTrackerImpl.f73261f = C43259k.d(c43238h, null, null, new a(advertDetailsBeduinItemVisibilityTrackerImpl, recyclerView, null), 3);
            }
        }
    }
}
