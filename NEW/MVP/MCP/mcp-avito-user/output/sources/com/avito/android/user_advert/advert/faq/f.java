package com.avito.android.user_advert.advert.faq;

import Tl0.InterfaceC15374a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.faq.data.n;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertFaqSurveyInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/f;", "Lcom/avito/android/user_advert/advert/faq/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f308915a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC15374a f308916b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.faq.data.e f308917c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.faq.data.a f308918d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43238h f308919e;

    /* compiled from: AdvertFaqSurveyInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.faq.AdvertFaqSurveyInteractorImpl$uploadSurveys$1", f = "AdvertFaqSurveyInteractor.kt", i = {}, l = {34, 38, 39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f308920q;

        /* renamed from: r, reason: collision with root package name */
        public int f308921r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return f.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f308921r
                r2 = 3
                r3 = 2
                r4 = 1
                com.avito.android.user_advert.advert.faq.f r5 = com.avito.android.user_advert.advert.faq.f.this
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r7)
                goto La5
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r1 = r6.f308920q
                r5 = r1
                com.avito.android.user_advert.advert.faq.f r5 = (com.avito.android.user_advert.advert.faq.f) r5
                kotlin.C42729a0.b(r7)
                goto L5a
            L29:
                kotlin.C42729a0.b(r7)
                goto L3b
            L2d:
                kotlin.C42729a0.b(r7)
                com.avito.android.user_advert.advert.faq.data.n r7 = r5.f308915a
                r6.f308921r = r4
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L3b
                return r0
            L3b:
                com.avito.beduin.v2.engine.field.d r7 = (com.avito.beduin.v2.engine.field.d) r7
                if (r7 == 0) goto La5
                com.avito.android.user_advert.advert.faq.data.e r1 = r5.f308917c
                java.util.ArrayList r7 = r1.a(r7)
                if (r7 == 0) goto La5
                com.avito.android.user_advert.advert.faq.data.a r1 = r5.f308918d
                Ul0.c r7 = r1.a(r7)
                r6.f308920q = r5
                r6.f308921r = r3
                Tl0.a r1 = r5.f308916b
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L5a
                return r0
            L5a:
                r1 = r7
                com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
                r6.f308920q = r7
                r6.f308921r = r2
                r5.getClass()
                boolean r7 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
                com.avito.android.user_advert.advert.faq.data.n r2 = r5.f308915a
                if (r7 == 0) goto L78
                java.lang.Object r7 = r2.b(r6)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r7 != r1) goto L75
                goto La2
            L75:
                kotlin.G0 r7 = kotlin.G0.f406611a
                goto La2
            L78:
                boolean r7 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r7 == 0) goto La0
                com.avito.android.remote.model.TypedResult$Error r1 = (com.avito.android.remote.model.TypedResult.Error) r1
                com.avito.android.remote.error.ApiError r7 = r1.getError()
                boolean r7 = r7 instanceof com.avito.android.remote.error.ApiError.BadRequest
                if (r7 == 0) goto L94
                java.lang.Object r7 = r2.b(r6)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r7 != r1) goto L91
                goto L96
            L91:
                kotlin.G0 r7 = kotlin.G0.f406611a
                goto L96
            L94:
                kotlin.G0 r7 = kotlin.G0.f406611a
            L96:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r7 != r1) goto L9d
                goto La2
            L9d:
                kotlin.G0 r7 = kotlin.G0.f406611a
                goto La2
            La0:
                kotlin.G0 r7 = kotlin.G0.f406611a
            La2:
                if (r7 != r0) goto La5
                return r0
            La5:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.faq.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@k n nVar, @k InterfaceC15374a interfaceC15374a, @k com.avito.android.user_advert.advert.faq.data.e eVar, @k com.avito.android.user_advert.advert.faq.data.a aVar, @k R0 r02) {
        this.f308915a = nVar;
        this.f308916b = interfaceC15374a;
        this.f308917c = eVar;
        this.f308918d = aVar;
        this.f308919e = U.a(r02.a());
    }

    @Override // com.avito.android.user_advert.advert.faq.e
    public final void a() {
        C43259k.d(this.f308919e, null, null, new a(null), 3);
    }
}
