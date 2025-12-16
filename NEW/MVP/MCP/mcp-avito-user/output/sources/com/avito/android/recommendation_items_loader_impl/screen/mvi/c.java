package com.avito.android.recommendation_items_loader_impl.screen.mvi;

import Ii0.InterfaceC14116a;
import Ji0.C14201a;
import Mi0.InterfaceC14493b;
import Y41.p;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivityArgument;
import com.avito.android.remote.model.TypedResult;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecommendationLoaderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMi0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recommendation_items_loader_impl.screen.mvi.RecommendationLoaderActor$loadRecommendations$3", f = "RecommendationLoaderActor.kt", i = {0, 1}, l = {94, 95, UpdateStatusCode.DialogButton.CONFIRM, 123}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14493b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252317q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252318r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f252319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument f252320t;

    /* compiled from: RecommendationLoaderActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LJi0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recommendation_items_loader_impl.screen.mvi.RecommendationLoaderActor$loadRecommendations$3$itemsResult$1", f = "RecommendationLoaderActor.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<C14201a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252321q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ e f252322r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument f252323s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument recommendationItemsLoaderArgument, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f252322r = eVar;
            this.f252323s = recommendationItemsLoaderArgument;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f252322r, this.f252323s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C14201a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252321q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC14116a interfaceC14116a = this.f252322r.f252326a;
                String str = this.f252323s.f252304d;
                this.f252321q = 1;
                obj = interfaceC14116a.b(str, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument recommendationItemsLoaderArgument, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f252319s = eVar;
        this.f252320t = recommendationItemsLoaderArgument;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f252319s, this.f252320t, continuation);
        cVar.f252318r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14493b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recommendation_items_loader_impl.screen.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
