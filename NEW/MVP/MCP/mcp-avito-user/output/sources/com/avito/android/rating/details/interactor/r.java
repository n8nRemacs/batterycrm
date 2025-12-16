package com.avito.android.rating.details.interactor;

import Gg0.InterfaceC13878a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsDataSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/interactor/r;", "Lcom/avito/android/rating/details/interactor/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13878a f247156a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.interactor.converter.e f247157b;

    /* compiled from: RatingDetailsDataSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.UserReviewsDataSource", f = "RatingDetailsDataSource.kt", i = {0}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "getItems", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public r f247158q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247159r;

        /* renamed from: t, reason: collision with root package name */
        public int f247161t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f247159r = obj;
            this.f247161t |= BeduinInputModel.MIN_TEXT_VERSION;
            return r.this.a(null, null, this);
        }
    }

    /* compiled from: RatingDetailsDataSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.UserReviewsDataSource", f = "RatingDetailsDataSource.kt", i = {0}, l = {96}, m = "getItems", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public r f247162q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247163r;

        /* renamed from: t, reason: collision with root package name */
        public int f247165t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f247163r = obj;
            this.f247165t |= BeduinInputModel.MIN_TEXT_VERSION;
            return r.this.b(null, this);
        }
    }

    public r(@Y61.k InterfaceC13878a interfaceC13878a, @Y61.k com.avito.android.rating.details.interactor.converter.e eVar) {
        this.f247156a = interfaceC13878a;
        this.f247157b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.rating.details.interactor.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.Map<java.lang.String, java.lang.String> r3, @Y61.l java.util.List<java.lang.String> r4, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult>> r5) {
        /*
            r2 = this;
            boolean r3 = r5 instanceof com.avito.android.rating.details.interactor.r.a
            if (r3 == 0) goto L13
            r3 = r5
            com.avito.android.rating.details.interactor.r$a r3 = (com.avito.android.rating.details.interactor.r.a) r3
            int r4 = r3.f247161t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f247161t = r4
            goto L1a
        L13:
            com.avito.android.rating.details.interactor.r$a r3 = new com.avito.android.rating.details.interactor.r$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r5 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r5
            r3.<init>(r5)
        L1a:
            java.lang.Object r4 = r3.f247159r
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.f247161t
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            com.avito.android.rating.details.interactor.r r3 = r3.f247158q
            kotlin.C42729a0.b(r4)
            goto L47
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            kotlin.C42729a0.b(r4)
            r3.f247158q = r2
            r3.f247161t = r1
            Gg0.a r4 = r2.f247156a
            r0 = 0
            java.lang.Object r4 = r4.b(r0, r0, r3)
            if (r4 != r5) goto L46
            return r5
        L46:
            r3 = r2
        L47:
            com.avito.android.remote.model.TypedResult r4 = (com.avito.android.remote.model.TypedResult) r4
            com.avito.android.rating.details.interactor.converter.e r3 = r3.f247157b
            com.avito.android.remote.model.TypedResult r3 = r3.a(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.r.a(java.util.Map, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.rating.details.interactor.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k android.net.Uri r6, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.rating.details.interactor.r.b
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.rating.details.interactor.r$b r0 = (com.avito.android.rating.details.interactor.r.b) r0
            int r1 = r0.f247165t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247165t = r1
            goto L1a
        L13:
            com.avito.android.rating.details.interactor.r$b r0 = new com.avito.android.rating.details.interactor.r$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f247163r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f247165t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.rating.details.interactor.r r6 = r0.f247162q
            kotlin.C42729a0.b(r7)
            goto L61
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            java.lang.String r7 = "limit"
            java.lang.String r7 = r6.getQueryParameter(r7)
            r2 = 0
            if (r7 == 0) goto L46
            java.lang.Long r7 = kotlin.text.C43066x.z0(r7)
            goto L47
        L46:
            r7 = r2
        L47:
            java.lang.String r4 = "cursor"
            java.lang.String r6 = r6.getQueryParameter(r4)
            if (r6 == 0) goto L53
            java.lang.Long r2 = kotlin.text.C43066x.z0(r6)
        L53:
            r0.f247162q = r5
            r0.f247165t = r3
            Gg0.a r6 = r5.f247156a
            java.lang.Object r7 = r6.b(r2, r7, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            r6 = r5
        L61:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            com.avito.android.rating.details.interactor.converter.e r6 = r6.f247157b
            com.avito.android.remote.model.TypedResult r6 = r6.a(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.r.b(android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
