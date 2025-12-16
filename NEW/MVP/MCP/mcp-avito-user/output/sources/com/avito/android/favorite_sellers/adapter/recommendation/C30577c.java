package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.Q;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecommendationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/c;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/b;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.adapter.recommendation.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30577c implements InterfaceC30576b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<Q> f155627a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I30.d f155628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f155629c;

    /* compiled from: RecommendationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationInteractorImpl", f = "RecommendationInteractor.kt", i = {}, l = {45}, m = "changeNotificationsSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.favorite_sellers.adapter.recommendation.c$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f155630q;

        /* renamed from: s, reason: collision with root package name */
        public int f155632s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f155630q = obj;
            this.f155632s |= BeduinInputModel.MIN_TEXT_VERSION;
            return C30577c.this.a(null, false, null, this);
        }
    }

    /* compiled from: RecommendationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationInteractorImpl", f = "RecommendationInteractor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "subscribeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.favorite_sellers.adapter.recommendation.c$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f155633q;

        /* renamed from: s, reason: collision with root package name */
        public int f155635s;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f155633q = obj;
            this.f155635s |= BeduinInputModel.MIN_TEXT_VERSION;
            return C30577c.this.c(null, null, this);
        }
    }

    /* compiled from: RecommendationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.favorite_sellers.adapter.recommendation.RecommendationInteractorImpl", f = "RecommendationInteractor.kt", i = {}, l = {35}, m = "unsubscribeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.favorite_sellers.adapter.recommendation.c$c, reason: collision with other inner class name */
    public static final class C4560c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f155636q;

        /* renamed from: s, reason: collision with root package name */
        public int f155638s;

        public C4560c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f155636q = obj;
            this.f155638s |= BeduinInputModel.MIN_TEXT_VERSION;
            return C30577c.this.d(null, null, this);
        }
    }

    @Inject
    public C30577c(@Y61.k h31.e<Q> eVar, @Y61.k I30.d dVar) {
        this.f155627a = eVar;
        this.f155628b = dVar;
        SubscriptionSource subscriptionSource = SubscriptionSource.f90035c;
        this.f155629c = "favorite_sellers_rec";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, boolean r6, @Y61.l com.avito.android.analytics.event.favorite.SubscriptionSource r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.favorite_sellers.adapter.recommendation.C30577c.a
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.favorite_sellers.adapter.recommendation.c$a r0 = (com.avito.android.favorite_sellers.adapter.recommendation.C30577c.a) r0
            int r1 = r0.f155632s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f155632s = r1
            goto L1a
        L13:
            com.avito.android.favorite_sellers.adapter.recommendation.c$a r0 = new com.avito.android.favorite_sellers.adapter.recommendation.c$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f155630q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f155632s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r8)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            h31.e<com.avito.android.remote.Q> r8 = r4.f155627a
            java.lang.Object r8 = r8.get()
            com.avito.android.remote.Q r8 = (com.avito.android.remote.Q) r8
            if (r7 == 0) goto L43
            java.lang.String r7 = r7.f90042b
            goto L45
        L43:
            java.lang.String r7 = r4.f155629c
        L45:
            r0.f155632s = r3
            java.lang.Object r8 = r8.a(r7, r5, r6, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L5f
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r5 = r8.getResult()
            kotlin.G0 r5 = (kotlin.G0) r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L5f:
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L72
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r5 = r8.getError()
            java.lang.Throwable r6 = r8.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L72:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.adapter.recommendation.C30577c.a(java.lang.String, boolean, com.avito.android.analytics.event.favorite.SubscriptionSource, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r9, @Y61.l com.avito.android.analytics.event.favorite.SubscriptionSource r10, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.SubscribeResult> r11) throws com.avito.android.util.ApiException {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.avito.android.favorite_sellers.adapter.recommendation.C30577c.b
            if (r0 == 0) goto L14
            r0 = r11
            com.avito.android.favorite_sellers.adapter.recommendation.c$b r0 = (com.avito.android.favorite_sellers.adapter.recommendation.C30577c.b) r0
            int r1 = r0.f155635s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f155635s = r1
        L12:
            r7 = r0
            goto L1c
        L14:
            com.avito.android.favorite_sellers.adapter.recommendation.c$b r0 = new com.avito.android.favorite_sellers.adapter.recommendation.c$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            r0.<init>(r11)
            goto L12
        L1c:
            java.lang.Object r11 = r7.f155633q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f155635s
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.C42729a0.b(r11)
            goto L5b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r11)
            h31.e<com.avito.android.remote.Q> r11 = r8.f155627a
            java.lang.Object r11 = r11.get()
            r1 = r11
            com.avito.android.remote.Q r1 = (com.avito.android.remote.Q) r1
            if (r10 == 0) goto L46
            java.lang.String r10 = r10.f90042b
            goto L48
        L46:
            java.lang.String r10 = r8.f155629c
        L48:
            I30.d r11 = r8.f155628b
            boolean r4 = r11.b()
            r7.f155635s = r2
            r5 = 0
            r6 = 0
            r2 = r10
            r3 = r9
            java.lang.Object r11 = r1.g(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L5b
            return r0
        L5b:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r9 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L6a
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r9 = r11.getResult()
            com.avito.android.remote.model.SubscribeResult r9 = (com.avito.android.remote.model.SubscribeResult) r9
            return r9
        L6a:
            boolean r9 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L7d
            com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
            com.avito.android.remote.error.ApiError r9 = r11.getError()
            java.lang.Throwable r10 = r11.getCause()
            com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r9, r10)
            throw r9
        L7d:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.adapter.recommendation.C30577c.c(java.lang.String, com.avito.android.analytics.event.favorite.SubscriptionSource, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r5, @Y61.l com.avito.android.analytics.event.favorite.SubscriptionSource r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.favorite_sellers.adapter.recommendation.C30577c.C4560c
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.favorite_sellers.adapter.recommendation.c$c r0 = (com.avito.android.favorite_sellers.adapter.recommendation.C30577c.C4560c) r0
            int r1 = r0.f155638s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f155638s = r1
            goto L1a
        L13:
            com.avito.android.favorite_sellers.adapter.recommendation.c$c r0 = new com.avito.android.favorite_sellers.adapter.recommendation.c$c
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f155636q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f155638s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            h31.e<com.avito.android.remote.Q> r7 = r4.f155627a
            java.lang.Object r7 = r7.get()
            com.avito.android.remote.Q r7 = (com.avito.android.remote.Q) r7
            if (r6 == 0) goto L43
            java.lang.String r6 = r6.f90042b
            goto L45
        L43:
            java.lang.String r6 = r4.f155629c
        L45:
            r0.f155638s = r3
            r2 = 0
            java.lang.Object r7 = r7.i(r6, r5, r2, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L60
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r5 = r7.getResult()
            com.avito.android.remote.model.UnsubscribeResult r5 = (com.avito.android.remote.model.UnsubscribeResult) r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L60:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L73
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L73:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.adapter.recommendation.C30577c.d(java.lang.String, com.avito.android.analytics.event.favorite.SubscriptionSource, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
