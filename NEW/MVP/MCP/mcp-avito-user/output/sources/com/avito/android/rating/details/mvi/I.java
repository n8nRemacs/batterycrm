package com.avito.android.rating.details.mvi;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.deep_linking.RevertRatingsDeletionLink;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.util.R0;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: RatingDetailsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/I;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class I implements com.avito.android.arch.mvi.b<RatingDetailsInternalAction> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f247222g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.interactor.e f247223a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f247224b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f247225c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_ux_feedback.b f247226d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RatingDetailsArguments f247227e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f247228f;

    /* compiled from: RatingDetailsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/rating/details/mvi/I$a;", "", "<init>", "()V", "", "REQ_KEY_RATING_DETAILS_REVERT_ANSWER", "Ljava/lang/String;", "REQ_KEY_RATING_DETAILS_REVERT_REVIEW", "REVIEW_ID_KEY", "", "SHOW_UX_FEEDBACK_DELAY", "J", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingDetailsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsBootstrap$produce$1", f = "RatingDetailsBootstrap.kt", i = {0}, l = {57, 58, 61, 62}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f247229q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247230r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = I.this.new b(continuation);
            bVar.f247230r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f247229q
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                com.avito.android.rating.details.mvi.I r7 = com.avito.android.rating.details.mvi.I.this
                if (r2 == 0) goto L35
                if (r2 == r6) goto L2d
                if (r2 == r5) goto L29
                if (r2 == r4) goto L25
                if (r2 != r3) goto L1d
                kotlin.C42729a0.b(r25)
                goto L95
            L1d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L25:
                kotlin.C42729a0.b(r25)
                goto L88
            L29:
                kotlin.C42729a0.b(r25)
                goto L77
            L2d:
                java.lang.Object r2 = r0.f247230r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r25)
                goto L4e
            L35:
                kotlin.C42729a0.b(r25)
                java.lang.Object r2 = r0.f247230r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading r8 = new com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading
                com.avito.android.rating.details.mvi.entity.b$e$a r9 = com.avito.android.rating.details.mvi.entity.b.e.a.f247440a
                r8.<init>(r9)
                r0.f247230r = r2
                r0.f247229q = r6
                java.lang.Object r6 = r2.emit(r8, r0)
                if (r6 != r1) goto L4e
                return r1
            L4e:
                com.avito.android.rating.details.interactor.e r8 = r7.f247223a
                r21 = 0
                r22 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1
                r23 = 13311(0x33ff, float:1.8653E-41)
                kotlinx.coroutines.flow.i r6 = com.avito.android.rating.details.interactor.e.a.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                r8 = 0
                r0.f247230r = r8
                r0.f247229q = r5
                java.lang.Object r2 = kotlinx.coroutines.flow.C43175k.u(r0, r6, r2)
                if (r2 != r1) goto L77
                return r1
            L77:
                com.avito.android.rating.details.RatingDetailsArguments r2 = r7.f247227e
                boolean r2 = r2 instanceof com.avito.android.rating.details.RatingDetailsArguments.UserReviews
                if (r2 == 0) goto L95
                r0.f247229q = r4
                r4 = 750(0x2ee, double:3.705E-321)
                java.lang.Object r2 = kotlinx.coroutines.C43131e0.b(r4, r0)
                if (r2 != r1) goto L88
                return r1
            L88:
                com.avito.android.rating_ux_feedback.b r2 = r7.f247226d
                com.avito.android.rating_ux_feedback.i$c r4 = com.avito.android.rating_ux_feedback.i.c.f250503b
                r0.f247229q = r3
                java.lang.Object r2 = r2.a(r4, r0)
                if (r2 != r1) goto L95
                return r1
            L95:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.I.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public I(@Y61.k com.avito.android.rating.details.interactor.e eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.rating_ux_feedback.b bVar, @Y61.k RatingDetailsArguments ratingDetailsArguments, boolean z12) {
        this.f247223a = eVar;
        this.f247224b = aVar;
        this.f247225c = r02;
        this.f247226d = bVar;
        this.f247227e = ratingDetailsArguments;
        this.f247228f = z12;
    }

    public static final InterfaceC43160i c(I i12, C43501a c43501a) {
        i12.getClass();
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        if (interfaceC14249c instanceof RevertRatingsDeletionLink.b.C3982b) {
            return new C43210w(RatingDetailsInternalAction.ReviewRevertSuccess.f247357b);
        }
        if (!(interfaceC14249c instanceof RevertRatingsDeletionLink.b.a)) {
            return C43175k.w();
        }
        RevertRatingsDeletionLink.b.a aVar = (RevertRatingsDeletionLink.b.a) interfaceC14249c;
        String message = aVar.f132873b.getMessage();
        if (message == null) {
            return C43175k.w();
        }
        return new C43210w(new RatingDetailsInternalAction.ShowErrorToastBar(com.avito.android.printable_text.b.f(message), aVar.f132873b, com.avito.android.printable_text.b.c(R.string.review_revert_retry_button, new Serializable[0]), new a.u(c43501a.f413260a.f134520a), null, 5000, 16, null));
    }

    public static final InterfaceC43160i d(I i12, Bundle bundle) {
        i12.getClass();
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("review_id_key")) : null;
        Long l12 = (lValueOf == null || lValueOf.longValue() != 0) ? lValueOf : null;
        return l12 != null ? new C43210w(new RatingDetailsInternalAction.ReviewDeletedExternal(l12.longValue())) : C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<RatingDetailsInternalAction> a() {
        boolean z12 = this.f247228f;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f247224b;
        return z12 ? C43175k.B(new K(this, null), new J(kotlinx.coroutines.rx3.y.a(aVar.V9()), this)) : C43175k.N(C43175k.B(new K(this, null), new J(kotlinx.coroutines.rx3.y.a(aVar.V9()), this)), C43175k.G(new b(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
