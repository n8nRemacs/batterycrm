package com.avito.android.publish.slots.images_groups_recommendations.analytics;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: ImagesGroupsRecommendationsShownTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.images_groups_recommendations.analytics.ImagesGroupsRecommendationsShownTracker$trackRecommendationOnInitIfNeeded$1", f = "ImagesGroupsRecommendationsShownTracker.kt", i = {0}, l = {39}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f244162q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f244163r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f244164s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f244165t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecyclerView recyclerView, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f244164s = recyclerView;
        this.f244165t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f244164s, this.f244165t, continuation);
        cVar.f244163r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f244162q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t13 = (T) this.f244163r;
            this.f244163r = t13;
            this.f244162q = 1;
            if (C43131e0.b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            t12 = t13;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t12 = (T) this.f244163r;
            C42729a0.b(obj);
        }
        if (!U.e(t12)) {
            return G0.f406611a;
        }
        RecyclerView recyclerView = this.f244164s;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return G0.f406611a;
        }
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        while (U.e(t12) && iM1 >= iK1 && !(recyclerView.P(iM1) instanceof com.avito.android.publish.slots.images_groups_recommendations.item.k)) {
            iM1--;
        }
        this.f244165t.a(iM1, recyclerView);
        return G0.f406611a;
    }
}
