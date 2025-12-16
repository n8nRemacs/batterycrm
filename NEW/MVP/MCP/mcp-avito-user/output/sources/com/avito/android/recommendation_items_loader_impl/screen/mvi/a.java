package com.avito.android.recommendation_items_loader_impl.screen.mvi;

import Ii0.InterfaceC14116a;
import Ki0.C14318b;
import Mi0.InterfaceC14493b;
import Y41.p;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivityArgument;
import com.avito.android.remote.model.TypedResult;
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
@DebugMetadata(c = "com.avito.android.recommendation_items_loader_impl.screen.mvi.RecommendationLoaderActor$loadRecommendations$1", f = "RecommendationLoaderActor.kt", i = {0, 1}, l = {50, 51, 62, 84}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14493b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252308q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252309r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f252310s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument f252311t;

    /* compiled from: RecommendationLoaderActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LKi0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recommendation_items_loader_impl.screen.mvi.RecommendationLoaderActor$loadRecommendations$1$itemsResult$1", f = "RecommendationLoaderActor.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.recommendation_items_loader_impl.screen.mvi.a$a, reason: collision with other inner class name */
    public static final class C7570a extends SuspendLambda implements p<T, Continuation<? super TypedResult<C14318b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252312q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ e f252313r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument f252314s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7570a(e eVar, RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument recommendationBlocksLoaderArgument, Continuation<? super C7570a> continuation) {
            super(2, continuation);
            this.f252313r = eVar;
            this.f252314s = recommendationBlocksLoaderArgument;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new C7570a(this.f252313r, this.f252314s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C14318b>> continuation) {
            return ((C7570a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252312q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC14116a interfaceC14116a = this.f252313r.f252326a;
                RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument recommendationBlocksLoaderArgument = this.f252314s;
                String str = recommendationBlocksLoaderArgument.f252300c;
                this.f252312q = 1;
                obj = interfaceC14116a.a(str, recommendationBlocksLoaderArgument.f252299b, this);
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
    public a(e eVar, RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument recommendationBlocksLoaderArgument, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f252310s = eVar;
        this.f252311t = recommendationBlocksLoaderArgument;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f252310s, this.f252311t, continuation);
        aVar.f252309r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14493b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recommendation_items_loader_impl.screen.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
