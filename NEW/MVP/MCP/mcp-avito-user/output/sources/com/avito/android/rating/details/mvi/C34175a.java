package com.avito.android.rating.details.mvi;

import Dh0.InterfaceC13400a;
import androidx.core.os.C22777e;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.adapter.seller.RatingDetailsReviewItem;
import com.avito.android.rating.details.adapter.summary.SummaryItem;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating_ui.reviews.model_review.ModelActionType;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.ratings.ReviewReplyStatus;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tg0.InterfaceC48669b;

/* compiled from: RatingDetailsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/rating/details/mvi/entity/a;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lcom/avito/android/rating/details/mvi/entity/b;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.rating.details.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34175a implements com.avito.android.arch.mvi.a<com.avito.android.rating.details.mvi.entity.a, RatingDetailsInternalAction, com.avito.android.rating.details.mvi.entity.b> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f247271j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.interactor.e f247272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f247273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48669b f247274c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_persistence.llm_summary.h f247275d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_persistence.aspects.e f247276e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_persistence.sort.e f247277f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final VD.b f247278g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f247279h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RatingDetailsArguments f247280i;

    /* compiled from: RatingDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating/details/mvi/a$a;", "", "<init>", "()V", "", "RELOAD_ITEMS_DELAY_MS", "J", "", "REVERT_TOAST_BAR_DURATION", "I", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.mvi.a$a, reason: collision with other inner class name */
    public static final class C7420a {
        public /* synthetic */ C7420a(C42822w c42822w) {
            this();
        }

        public C7420a() {
        }
    }

    /* compiled from: RatingDetailsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.mvi.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f247281a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f247282b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f247283c;

        static {
            int[] iArr = new int[BaseRatingReviewItem.ReviewAction.ReviewActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType2 = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType3 = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType4 = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType5 = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType6 = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType7 = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType8 = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f247281a = iArr;
            int[] iArr2 = new int[ModelActionType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f247282b = iArr2;
            int[] iArr3 = new int[SummaryItem.SummaryScore.SummaryScoreState.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                SummaryItem.SummaryScore.SummaryScoreState summaryScoreState = SummaryItem.SummaryScore.SummaryScoreState.f246550b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[ReviewReplyStatus.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                ReviewReplyStatus reviewReplyStatus = ReviewReplyStatus.f250519b;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                ReviewReplyStatus reviewReplyStatus2 = ReviewReplyStatus.f250519b;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f247283c = iArr4;
        }
    }

    /* compiled from: RatingDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$deleteBuyerReview$1", f = "RatingDetailsActor.kt", i = {0, 1}, l = {440, 441, 442}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.rating.details.mvi.a$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f247284q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247285r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f247287t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247288u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12, com.avito.android.rating.details.mvi.entity.b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f247287t = j12;
            this.f247288u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = C34175a.this.new c(this.f247287t, this.f247288u, continuation);
            cVar.f247285r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f247284q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r11)
                goto L6f
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                java.lang.Object r1 = r10.f247285r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
            L24:
                r4 = r1
                goto L59
            L26:
                java.lang.Object r1 = r10.f247285r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L48
            L2e:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f247285r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading r1 = new com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading
                com.avito.android.rating.details.mvi.entity.b$e$b r5 = com.avito.android.rating.details.mvi.entity.b.e.C7423b.f247441a
                r1.<init>(r5)
                r10.f247285r = r11
                r10.f247284q = r4
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L47
                return r0
            L47:
                r1 = r11
            L48:
                com.avito.android.rating.details.mvi.a r11 = com.avito.android.rating.details.mvi.C34175a.this
                com.avito.android.rating.details.interactor.e r11 = r11.f247272a
                r10.f247285r = r1
                r10.f247284q = r3
                long r3 = r10.f247287t
                java.lang.Object r11 = r11.e(r3, r10)
                if (r11 != r0) goto L24
                return r0
            L59:
                r7 = r11
                com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult r7 = (com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult) r7
                r11 = 0
                r10.f247285r = r11
                r10.f247284q = r2
                long r5 = r10.f247287t
                com.avito.android.rating.details.mvi.entity.b r8 = r10.f247288u
                com.avito.android.rating.details.mvi.a r3 = com.avito.android.rating.details.mvi.C34175a.this
                r9 = r10
                java.lang.Object r11 = com.avito.android.rating.details.mvi.C34175a.d(r3, r4, r5, r7, r8, r9)
                if (r11 != r0) goto L6f
                return r0
            L6f:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34175a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RatingDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$deleteBuyerReview$2", f = "RatingDetailsActor.kt", i = {}, l = {444}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.rating.details.mvi.a$d */
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super RatingDetailsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f247289q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f247290r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f247291s;

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = C34175a.this.new d(continuation);
            dVar.f247290r = interfaceC43172j;
            dVar.f247291s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f247289q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f247290r;
                Throwable th2 = this.f247291s;
                this.f247290r = null;
                this.f247289q = 1;
                if (C34175a.f(C34175a.this, interfaceC43172j, th2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    static {
        new C7420a(null);
    }

    @Inject
    public C34175a(@Y61.k com.avito.android.rating.details.interactor.e eVar, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k InterfaceC48669b interfaceC48669b, @Y61.k com.avito.android.rating_persistence.llm_summary.h hVar, @Y61.k com.avito.android.rating_persistence.aspects.e eVar2, @Y61.k com.avito.android.rating_persistence.sort.e eVar3, @Y61.k VD.b bVar, @Y61.k R0 r02, @Y61.k RatingDetailsArguments ratingDetailsArguments) {
        this.f247272a = eVar;
        this.f247273b = interfaceC30274a;
        this.f247274c = interfaceC48669b;
        this.f247275d = hVar;
        this.f247276e = eVar2;
        this.f247277f = eVar3;
        this.f247278g = bVar;
        this.f247279h = r02;
        this.f247280i = ratingDetailsArguments;
    }

    public static final SearchParametersEntry.SearchParametersBlock.Sort c(C34175a c34175a, com.avito.android.rating.details.mvi.entity.b bVar) {
        c34175a.getClass();
        List<SearchParametersEntry.SearchParametersBlock> list = bVar.f247425h;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SearchParametersEntry.SearchParametersBlock.Sort) {
                arrayList.add(obj);
            }
        }
        return (SearchParametersEntry.SearchParametersBlock.Sort) C42745f0.G(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.rating.details.mvi.C34175a r16, kotlinx.coroutines.flow.InterfaceC43172j r17, long r18, com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult r20, com.avito.android.rating.details.mvi.entity.b r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34175a.d(com.avito.android.rating.details.mvi.a, kotlinx.coroutines.flow.j, long, com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult, com.avito.android.rating.details.mvi.entity.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.rating.details.mvi.C34175a r16, kotlinx.coroutines.flow.InterfaceC43172j r17, long r18, com.avito.android.remote.model.review_reply.DeleteModelReviewResult r20, com.avito.android.rating.details.mvi.entity.b r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34175a.e(com.avito.android.rating.details.mvi.a, kotlinx.coroutines.flow.j, long, com.avito.android.remote.model.review_reply.DeleteModelReviewResult, com.avito.android.rating.details.mvi.entity.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(com.avito.android.rating.details.mvi.C34175a r17, kotlinx.coroutines.flow.InterfaceC43172j r18, java.lang.Throwable r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34175a.f(com.avito.android.rating.details.mvi.a, kotlinx.coroutines.flow.j, java.lang.Throwable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(com.avito.android.rating.details.mvi.C34175a r17, kotlinx.coroutines.flow.InterfaceC43172j r18, long r19, com.avito.android.remote.model.review_reply.DeleteReviewReplyResult r21, com.avito.android.rating.details.mvi.entity.b r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34175a.g(com.avito.android.rating.details.mvi.a, kotlinx.coroutines.flow.j, long, com.avito.android.remote.model.review_reply.DeleteReviewReplyResult, com.avito.android.rating.details.mvi.entity.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(com.avito.android.rating.details.mvi.C34175a r17, kotlinx.coroutines.flow.InterfaceC43172j r18, com.avito.android.adapter.RatingDetailsItem r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34175a.h(com.avito.android.rating.details.mvi.a, kotlinx.coroutines.flow.j, com.avito.android.adapter.RatingDetailsItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RatingDetailsInternalAction> b(com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.rating.details.mvi.entity.b bVar) {
        Object next;
        C43210w c43210w;
        List<BaseRatingReviewItem.ReviewAction> actions;
        Boolean bool;
        com.avito.android.rating.details.mvi.entity.a aVar2 = aVar;
        com.avito.android.rating.details.mvi.entity.b bVar2 = bVar;
        if (aVar2 instanceof a.s) {
            return C43175k.G(new C34196t(this, aVar2, bVar2, null));
        }
        if (aVar2 instanceof a.C34180b) {
            return C43175k.G(new z(this, aVar2, bVar2, null));
        }
        boolean z12 = aVar2 instanceof a.C34181c;
        R0 r02 = this.f247279h;
        if (z12) {
            return C43175k.I(r02.a(), C43175k.G(new A(this, bVar2, null)));
        }
        if (aVar2 instanceof a.B) {
            return C43175k.G(new B(this, bVar2, null));
        }
        if (aVar2 instanceof a.C) {
            return C43175k.G(new C(this, aVar2, bVar2, null));
        }
        if (aVar2 instanceof a.l) {
            return C43175k.G(new D(this, aVar2, bVar2, null));
        }
        if (aVar2 instanceof a.D) {
            return C43175k.I(r02.a(), C43175k.G(new E(this, bVar2, null)));
        }
        boolean z13 = aVar2 instanceof a.y;
        InterfaceC48669b interfaceC48669b = this.f247274c;
        if (z13) {
            InterfaceC13400a interfaceC13400a = ((a.y) aVar2).f247415a;
            boolean zBooleanValue = false;
            if (!(interfaceC13400a instanceof InterfaceC13400a.C0184a)) {
                if (interfaceC13400a instanceof InterfaceC13400a.d) {
                    InterfaceC13400a.d dVar = (InterfaceC13400a.d) interfaceC13400a;
                    if (dVar.f3386a.getActions() == null) {
                        return C43175k.w();
                    }
                    com.avito.android.rating_ui.reviews.model_review.a aVar3 = dVar.f3386a;
                    interfaceC48669b.j(aVar3.getF78624c(), false);
                    return new C43210w(new RatingDetailsInternalAction.OpenModelReviewActionsDialog(aVar3));
                }
                if (interfaceC13400a instanceof InterfaceC13400a.c) {
                    InterfaceC13400a.c cVar = (InterfaceC13400a.c) interfaceC13400a;
                    interfaceC48669b.b(cVar);
                    return new C43210w(new RatingDetailsInternalAction.OpenGallery(cVar.a(), cVar.getF3376b()));
                }
                if (!(interfaceC13400a instanceof InterfaceC13400a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13400a.e eVar = (InterfaceC13400a.e) interfaceC13400a;
                BaseRatingReviewItem baseRatingReviewItem = eVar.f3387a;
                interfaceC48669b.i(baseRatingReviewItem.getF302127y(), baseRatingReviewItem.getF302110D());
                return new C43210w(new RatingDetailsInternalAction.HandleDeeplink(eVar.f3388b, null, null, 6, null));
            }
            InterfaceC13400a.C0184a c0184a = (InterfaceC13400a.C0184a) interfaceC13400a;
            BaseRatingReviewItem baseRatingReviewItem2 = c0184a.f3373a;
            if (c0184a.f3374b) {
                actions = baseRatingReviewItem2.getActions();
            } else {
                BaseRatingReviewItem.ReviewAnswer f246528m = baseRatingReviewItem2.getF302119M();
                actions = f246528m != null ? f246528m.f250315n : null;
            }
            if (actions == null) {
                return C43175k.w();
            }
            BaseRatingReviewItem baseRatingReviewItem3 = c0184a.f3373a;
            RatingDetailsReviewItem ratingDetailsReviewItem = baseRatingReviewItem3 instanceof RatingDetailsReviewItem ? (RatingDetailsReviewItem) baseRatingReviewItem3 : null;
            if (ratingDetailsReviewItem != null && (bool = ratingDetailsReviewItem.f246535T) != null) {
                zBooleanValue = bool.booleanValue();
            }
            interfaceC48669b.j(baseRatingReviewItem2.getF302127y(), zBooleanValue);
            c43210w = new C43210w(new RatingDetailsInternalAction.OpenReviewActionsDialog(baseRatingReviewItem2, actions, null));
        } else {
            if (!(aVar2 instanceof a.v)) {
                if (aVar2 instanceof a.n) {
                    a.n nVar = (a.n) aVar2;
                    ModelActionType modelActionType = nVar.f247401b.f250137b;
                    if ((modelActionType != null ? b.f247282b[modelActionType.ordinal()] : -1) != 1) {
                        return C43175k.w();
                    }
                    Long f78624c = nVar.f247400a.getF78624c();
                    return f78624c != null ? C43175k.I(r02.a(), new C43152f0(C43175k.G(new C34176b(this, f78624c.longValue(), bVar2, null)), new C34177c(this, null))) : C43175k.w();
                }
                if (aVar2 instanceof a.C7421a) {
                    return C43175k.I(r02.a(), C43175k.G(new F(this, aVar2, null)));
                }
                if (aVar2 instanceof a.g) {
                    return C43175k.I(r02.a(), C43175k.G(new C34178d(this, ((a.g) aVar2).f247390a, bVar2, null)));
                }
                if (aVar2 instanceof a.f) {
                    return i(((a.f) aVar2).f247389a, bVar2);
                }
                if (aVar2 instanceof a.u) {
                    return C43175k.G(new G(aVar2, null));
                }
                if (aVar2 instanceof a.t) {
                    return C43175k.G(new C34187j(aVar2, null));
                }
                if (aVar2 instanceof a.i) {
                    return C43175k.G(new C34188k(aVar2, null));
                }
                if (aVar2 instanceof a.m) {
                    return C43175k.G(new C34189l(this, bVar2, null));
                }
                if (aVar2 instanceof a.A) {
                    return C43175k.G(new C34190m(2, null));
                }
                if (aVar2 instanceof a.e) {
                    return C43175k.G(new C34191n(aVar2, null));
                }
                if (aVar2 instanceof a.C34182d) {
                    return C43175k.G(new C34192o(this, bVar2, null));
                }
                if (aVar2 instanceof a.k) {
                    return C43175k.G(new C34193p(aVar2, null));
                }
                if (aVar2 instanceof a.o) {
                    return C43175k.G(new C34194q(this, aVar2, null));
                }
                if (aVar2 instanceof a.x) {
                    return C43175k.G(new r(this, null));
                }
                if (aVar2 instanceof a.h) {
                    return C43175k.G(new C34195s(this, aVar2, null));
                }
                if (aVar2 instanceof a.j) {
                    return C43175k.G(new C34197u(aVar2, null));
                }
                if (aVar2 instanceof a.r) {
                    return C43175k.G(new v(this, bVar2, null));
                }
                if (aVar2 instanceof a.z) {
                    return C43175k.G(new w(this, null));
                }
                if (aVar2 instanceof a.q) {
                    return new C43210w(new RatingDetailsInternalAction.HandleDeeplink(((a.q) aVar2).f247404a, null, null, 6, null));
                }
                if (aVar2 instanceof a.p) {
                    return C43175k.I(r02.a(), C43175k.G(new x(this, aVar2, null)));
                }
                if (aVar2 instanceof a.w) {
                    return C43175k.I(r02.c(), C43175k.G(new y(this, aVar2, bVar2, null)));
                }
                throw new NoWhenBranchMatchedException();
            }
            a.v vVar = (a.v) aVar2;
            BaseRatingReviewItem.ReviewAction reviewAction = vVar.f247412b;
            interfaceC48669b.k(reviewAction.f250247c.f250277j);
            BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType = reviewAction.f250246b;
            int i12 = reviewActionType != null ? b.f247281a[reviewActionType.ordinal()] : -1;
            BaseRatingReviewItem baseRatingReviewItem4 = vVar.f247411a;
            BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue = reviewAction.f250247c;
            switch (i12) {
                case -1:
                    return C43175k.w();
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return new C43210w(new RatingDetailsInternalAction.OpenAddAnswerScreen(baseRatingReviewItem4.getF302127y(), reviewActionValue.f250279l));
                case 2:
                    Long f246537y = baseRatingReviewItem4.getF302127y();
                    if (f246537y == null) {
                        return C43175k.w();
                    }
                    long jLongValue = f246537y.longValue();
                    Iterator<T> it = bVar2.f247419b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            com.avito.conveyor_item.a aVar4 = (com.avito.conveyor_item.a) next;
                            if (!(aVar4 instanceof RatingDetailsReviewItem) || !kotlin.jvm.internal.L.f(((RatingDetailsReviewItem) aVar4).f246537y, baseRatingReviewItem4.getF302127y())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    com.avito.conveyor_item.a aVar5 = (com.avito.conveyor_item.a) next;
                    if (aVar5 != null) {
                        RatingDetailsReviewItem ratingDetailsReviewItem2 = aVar5 instanceof RatingDetailsReviewItem ? (RatingDetailsReviewItem) aVar5 : null;
                        BaseRatingReviewItem.ReviewAnswer reviewAnswer = ratingDetailsReviewItem2 != null ? ratingDetailsReviewItem2.f246528M : null;
                        if (reviewAnswer != null) {
                            Long l12 = reviewAnswer.f250303b;
                            return l12 != null ? this.f247272a.h(jLongValue, l12.longValue(), reviewAnswer) : C43175k.w();
                        }
                    }
                    return C43175k.w();
                case 3:
                    Long f246537y2 = baseRatingReviewItem4.getF302127y();
                    if (f246537y2 == null) {
                        return C43175k.w();
                    }
                    long jLongValue2 = f246537y2.longValue();
                    BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog = reviewActionValue.f250280m;
                    return confirmDialog == null ? C43175k.I(r02.a(), C43175k.G(new C34178d(this, jLongValue2, bVar2, null))) : new C43210w(new RatingDetailsInternalAction.OpenDeleteReviewConfirmationDialog(jLongValue2, confirmDialog));
                case 4:
                    Long f246537y3 = baseRatingReviewItem4.getF302127y();
                    if (f246537y3 == null) {
                        return C43175k.w();
                    }
                    long jLongValue3 = f246537y3.longValue();
                    BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog2 = reviewActionValue.f250280m;
                    return confirmDialog2 == null ? i(jLongValue3, bVar2) : new C43210w(new RatingDetailsInternalAction.OpenDeleteBuyerReviewConfirmationDialog(jLongValue3, confirmDialog2));
                case 5:
                    DeepLink deepLink = reviewActionValue.f250278k;
                    return deepLink != null ? new C43210w(new RatingDetailsInternalAction.HandleDeeplink(C22777e.b(new kotlin.Q("review_id_key", baseRatingReviewItem4.getF302127y())), deepLink, null)) : C43175k.w();
                case 6:
                    String str = reviewActionValue.f250271d;
                    if (str == null) {
                        return C43175k.w();
                    }
                    BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueParam reviewActionValueParam = reviewActionValue.f250272e;
                    return this.f247272a.d(str, reviewActionValueParam != null ? reviewActionValueParam.f250292b : null, reviewActionValueParam != null ? reviewActionValueParam.f250293c : null, reviewActionValueParam != null ? reviewActionValueParam.f250294d : null, reviewActionValueParam != null ? reviewActionValueParam.f250295e : null, baseRatingReviewItem4.getF302127y());
                case 7:
                    List<BaseRatingReviewItem.ReviewAction> list = reviewActionValue.f250273f;
                    return list == null ? C43175k.w() : new C43210w(new RatingDetailsInternalAction.OpenReviewActionsDialog(baseRatingReviewItem4, list, reviewActionValue.f250276i));
                case 8:
                    c43210w = new C43210w(new RatingDetailsInternalAction.OpenTextSheet(reviewActionValue));
                    break;
                case 9:
                    return new C43210w(new RatingDetailsInternalAction.OpenInfoScreen(baseRatingReviewItem4.getF302127y(), reviewActionValue));
            }
        }
        return c43210w;
    }

    public final InterfaceC43160i<RatingDetailsInternalAction> i(long j12, com.avito.android.rating.details.mvi.entity.b bVar) {
        return C43175k.I(this.f247279h.a(), new C43152f0(C43175k.G(new c(j12, bVar, null)), new d(null)));
    }
}
