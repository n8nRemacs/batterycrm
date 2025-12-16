package com.avito.android.rating.details.interactor;

import Gg0.InterfaceC13878a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.rating.details.RatingDetailsArguments;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsDataSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/interactor/q;", "Lcom/avito/android/rating/details/interactor/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13878a f247145a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RatingDetailsArguments.UserRating f247146b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.interactor.converter.a f247147c;

    /* compiled from: RatingDetailsDataSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.UserRatingDataSource", f = "RatingDetailsDataSource.kt", i = {0}, l = {33}, m = "getItems", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public q f247148q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247149r;

        /* renamed from: t, reason: collision with root package name */
        public int f247151t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f247149r = obj;
            this.f247151t |= BeduinInputModel.MIN_TEXT_VERSION;
            return q.this.a(null, null, this);
        }
    }

    /* compiled from: RatingDetailsDataSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.UserRatingDataSource", f = "RatingDetailsDataSource.kt", i = {0}, l = {45}, m = "getItems", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public q f247152q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247153r;

        /* renamed from: t, reason: collision with root package name */
        public int f247155t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f247153r = obj;
            this.f247155t |= BeduinInputModel.MIN_TEXT_VERSION;
            return q.this.b(null, this);
        }
    }

    public q(@Y61.k InterfaceC13878a interfaceC13878a, @Y61.k RatingDetailsArguments.UserRating userRating, @Y61.k com.avito.android.rating.details.interactor.converter.a aVar) {
        this.f247145a = interfaceC13878a;
        this.f247146b = userRating;
        this.f247147c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.rating.details.interactor.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.Map<java.lang.String, java.lang.String> r12, @Y61.l java.util.List<java.lang.String> r13, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.avito.android.rating.details.interactor.q.a
            if (r0 == 0) goto L14
            r0 = r14
            com.avito.android.rating.details.interactor.q$a r0 = (com.avito.android.rating.details.interactor.q.a) r0
            int r1 = r0.f247151t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f247151t = r1
        L12:
            r10 = r0
            goto L1c
        L14:
            com.avito.android.rating.details.interactor.q$a r0 = new com.avito.android.rating.details.interactor.q$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r14 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r14
            r0.<init>(r14)
            goto L12
        L1c:
            java.lang.Object r14 = r10.f247149r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f247151t
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            com.avito.android.rating.details.interactor.q r12 = r10.f247148q
            kotlin.C42729a0.b(r14)
            goto L6c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.C42729a0.b(r14)
            com.avito.android.rating.details.RatingDetailsArguments$UserRating r14 = r11.f247146b
            java.lang.String r4 = r14.f246419d
            java.lang.String r14 = "sortRating"
            java.lang.Object r14 = r12.get(r14)
            r5 = r14
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r14 = "photoOnly"
            java.lang.Object r12 = r12.get(r14)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L57
            java.lang.Boolean r12 = kotlin.text.C43066x.v0(r12)
        L55:
            r8 = r12
            goto L59
        L57:
            r12 = 0
            goto L55
        L59:
            r10.f247148q = r11
            r10.f247151t = r2
            r6 = 0
            r7 = 0
            Gg0.a r1 = r11.f247145a
            r2 = 0
            r3 = 0
            r9 = r13
            java.lang.Object r14 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r0) goto L6b
            return r0
        L6b:
            r12 = r11
        L6c:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            com.avito.android.rating.details.interactor.converter.a r12 = r12.f247147c
            com.avito.android.remote.model.TypedResult r12 = r12.a(r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.q.a(java.util.Map, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.rating.details.interactor.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k android.net.Uri r12, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.avito.android.rating.details.interactor.q.b
            if (r0 == 0) goto L14
            r0 = r13
            com.avito.android.rating.details.interactor.q$b r0 = (com.avito.android.rating.details.interactor.q.b) r0
            int r1 = r0.f247155t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f247155t = r1
        L12:
            r10 = r0
            goto L1c
        L14:
            com.avito.android.rating.details.interactor.q$b r0 = new com.avito.android.rating.details.interactor.q$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r13 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r13
            r0.<init>(r13)
            goto L12
        L1c:
            java.lang.Object r13 = r10.f247153r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f247155t
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            com.avito.android.rating.details.interactor.q r12 = r10.f247152q
            kotlin.C42729a0.b(r13)
            goto La3
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            kotlin.C42729a0.b(r13)
            com.avito.android.rating.details.RatingDetailsArguments$UserRating r13 = r11.f247146b
            java.lang.String r4 = r13.f246419d
            java.lang.String r13 = "sortRating"
            java.lang.String r5 = r12.getQueryParameter(r13)
            java.lang.String r13 = "photoOnly"
            java.lang.String r13 = r12.getQueryParameter(r13)
            r1 = 0
            if (r13 == 0) goto L54
            java.lang.Boolean r13 = kotlin.text.C43066x.v0(r13)
            r8 = r13
            goto L55
        L54:
            r8 = r1
        L55:
            java.lang.String r13 = "requiredFilters"
            java.util.List r9 = r12.getQueryParameters(r13)
            java.lang.String r13 = "offset"
            java.lang.String r13 = r12.getQueryParameter(r13)
            if (r13 == 0) goto L68
            java.lang.Long r13 = kotlin.text.C43066x.z0(r13)
            goto L69
        L68:
            r13 = r1
        L69:
            java.lang.String r3 = "limit"
            java.lang.String r3 = r12.getQueryParameter(r3)
            if (r3 == 0) goto L76
            java.lang.Long r3 = kotlin.text.C43066x.z0(r3)
            goto L77
        L76:
            r3 = r1
        L77:
            java.lang.String r6 = "cursor"
            java.lang.String r6 = r12.getQueryParameter(r6)
            if (r6 == 0) goto L84
            java.lang.Long r6 = kotlin.text.C43066x.z0(r6)
            goto L85
        L84:
            r6 = r1
        L85:
            java.lang.String r7 = "step"
            java.lang.String r12 = r12.getQueryParameter(r7)
            if (r12 == 0) goto L93
            java.lang.Long r12 = kotlin.text.C43066x.z0(r12)
            r7 = r12
            goto L94
        L93:
            r7 = r1
        L94:
            r10.f247152q = r11
            r10.f247155t = r2
            Gg0.a r1 = r11.f247145a
            r2 = r13
            java.lang.Object r13 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto La2
            return r0
        La2:
            r12 = r11
        La3:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            com.avito.android.rating.details.interactor.converter.a r12 = r12.f247147c
            com.avito.android.remote.model.TypedResult r12 = r12.a(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.q.b(android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
