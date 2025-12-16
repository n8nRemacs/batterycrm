package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import android.net.Uri;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult;
import com.avito.android.remote.model.review_reply.DeleteModelReviewResult;
import com.avito.android.remote.model.review_reply.DeleteReviewReplyResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tg0.InterfaceC48669b;
import zz.InterfaceC50647a;

/* compiled from: RatingDetailsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/interactor/f;", "Lcom/avito/android/rating/details/interactor/e;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class f implements com.avito.android.rating.details.interactor.e {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f247034l = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14487a f247035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f247036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_persistence.llm_summary.h f247037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_persistence.aspects.e f247038d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_persistence.sort.e f247039e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48669b f247040f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RatingDetailsArguments f247041g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f247042h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.interactor.c f247043i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final R0 f247044j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public String f247045k = "";

    /* compiled from: RatingDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/rating/details/interactor/f$a;", "", "<init>", "()V", "", "KEY_DELETED_ANSWER", "Ljava/lang/String;", "KEY_REVIEW_ID", "REVIEWS_SORT", "SPHINX_ERROR", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingDetailsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.RatingDetailsInteractorImpl$deleteAnswer$1", f = "RatingDetailsInteractor.kt", i = {0, 1, 2, 2, 3, 3}, l = {283, 284, 286, 288, 293, 306}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$2"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public BaseRatingReviewItem.ReviewAnswer f247046q;

        /* renamed from: r, reason: collision with root package name */
        public DeleteReviewReplyResult f247047r;

        /* renamed from: s, reason: collision with root package name */
        public long f247048s;

        /* renamed from: t, reason: collision with root package name */
        public int f247049t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f247050u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f247052w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f247053x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ BaseRatingReviewItem.ReviewAnswer f247054y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, long j13, BaseRatingReviewItem.ReviewAnswer reviewAnswer, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f247052w = j12;
            this.f247053x = j13;
            this.f247054y = reviewAnswer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = f.this.new b(this.f247052w, this.f247053x, this.f247054y, continuation);
            bVar.f247050u = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0101 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RatingDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.RatingDetailsInteractorImpl$getItems$1", f = "RatingDetailsInteractor.kt", i = {0, 0}, l = {145, 160}, m = "invokeSuspend", n = {"$this$flow", "searchParameters"}, s = {"L$0", "L$1"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ boolean f247055A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ String f247056B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ Long f247057C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ boolean f247058D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ List<Long> f247059E;

        /* renamed from: F, reason: collision with root package name */
        public final /* synthetic */ List<String> f247060F;

        /* renamed from: G, reason: collision with root package name */
        public final /* synthetic */ boolean f247061G;

        /* renamed from: H, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247062H;

        /* renamed from: q, reason: collision with root package name */
        public LinkedHashMap f247063q;

        /* renamed from: r, reason: collision with root package name */
        public int f247064r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f247065s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ List<SearchParametersEntry.SearchParametersBlock> f247067u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f247068v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f247069w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f247070x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f247071y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f247072z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends SearchParametersEntry.SearchParametersBlock> list, String str, String str2, String str3, String str4, boolean z12, boolean z13, String str5, Long l12, boolean z14, List<Long> list2, List<String> list3, boolean z15, com.avito.android.rating.details.mvi.entity.a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f247067u = list;
            this.f247068v = str;
            this.f247069w = str2;
            this.f247070x = str3;
            this.f247071y = str4;
            this.f247072z = z12;
            this.f247055A = z13;
            this.f247056B = str5;
            this.f247057C = l12;
            this.f247058D = z14;
            this.f247059E = list2;
            this.f247060F = list3;
            this.f247061G = z15;
            this.f247062H = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = f.this.new c(this.f247067u, this.f247068v, this.f247069w, this.f247070x, this.f247071y, this.f247072z, this.f247055A, this.f247056B, this.f247057C, this.f247058D, this.f247059E, this.f247060F, this.f247061G, this.f247062H, continuation);
            cVar.f247065s = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RatingDetailsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.RatingDetailsInteractorImpl$getItems$3", f = "RatingDetailsInteractor.kt", i = {0, 0}, l = {272, 273, 274}, m = "invokeSuspend", n = {"$this$flow", "loadItemsUUID"}, s = {"L$0", "L$1"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f247073q;

        /* renamed from: r, reason: collision with root package name */
        public int f247074r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f247075s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Uri f247077u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f247077u = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = f.this.new d(this.f247077u, continuation);
            dVar.f247075s = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String string;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f247074r;
            f fVar = f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f247075s;
                string = UUID.randomUUID().toString();
                fVar.f247045k = string;
                this.f247075s = interfaceC43172j2;
                this.f247073q = string;
                this.f247074r = 1;
                Object objB = fVar.f247043i.b(this.f247077u, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                obj = objB;
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                string = this.f247073q;
                interfaceC43172j = (InterfaceC43172j) this.f247075s;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                RatingDetailsResult ratingDetailsResult = (RatingDetailsResult) ((TypedResult.Success) typedResult).getResult();
                if (fVar.f247045k.equals(string)) {
                    RatingDetailsInternalAction.NextPageLoaded nextPageLoaded = new RatingDetailsInternalAction.NextPageLoaded(ratingDetailsResult);
                    this.f247075s = null;
                    this.f247073q = null;
                    this.f247074r = 2;
                    if (interfaceC43172j.emit(nextPageLoaded, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                RatingDetailsInternalAction.LoadingError loadingError = new RatingDetailsInternalAction.LoadingError(C35936s.a(error.getError(), error.getCause()), null, 2, null);
                this.f247075s = null;
                this.f247073q = null;
                this.f247074r = 3;
                if (interfaceC43172j.emit(loadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.interactor.RatingDetailsInteractorImpl$sendNetworkRequestFlow$1", f = "RatingDetailsInteractor.kt", i = {0}, l = {341, 351, 361, 371, 383}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f247078q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f247079r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f247081t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Integer f247082u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Integer f247083v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Integer f247084w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f247085x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Long f247086y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Integer num, Integer num2, Integer num3, String str2, Long l12, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f247081t = str;
            this.f247082u = num;
            this.f247083v = num2;
            this.f247084w = num3;
            this.f247085x = str2;
            this.f247086y = l12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = f.this.new e(this.f247081t, this.f247082u, this.f247083v, this.f247084w, this.f247085x, this.f247086y, continuation);
            eVar.f247079r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objA;
            DeepLink uri;
            String title;
            DeepLink uri2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f247078q;
            f fVar = f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f247079r;
                m mVar = fVar.f247036b;
                this.f247079r = interfaceC43172j;
                this.f247078q = 1;
                objA = mVar.a(this.f247081t, this.f247082u, this.f247083v, this.f247084w, this.f247085x, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f247079r;
                C42729a0.b(obj);
                interfaceC43172j = interfaceC43172j2;
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            if (typedResult instanceof TypedResult.Success) {
                ReviewActionNetworkRequestResult reviewActionNetworkRequestResult = (ReviewActionNetworkRequestResult) ((TypedResult.Success) typedResult).getResult();
                if (reviewActionNetworkRequestResult instanceof ReviewActionNetworkRequestResult.Ok) {
                    RatingDetailsInternalAction.HandleDeeplink handleDeeplink = new RatingDetailsInternalAction.HandleDeeplink(C22777e.b(new Q("review_id_key", this.f247086y)), ((ReviewActionNetworkRequestResult.Ok) reviewActionNetworkRequestResult).getAction(), null);
                    this.f247079r = null;
                    this.f247078q = 2;
                    if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (reviewActionNetworkRequestResult instanceof ReviewActionNetworkRequestResult.Info) {
                    ReviewActionNetworkRequestResult.Info info = (ReviewActionNetworkRequestResult.Info) reviewActionNetworkRequestResult;
                    String message = info.getMessage();
                    ReviewActionNetworkRequestResult.Button button = info.getButton();
                    String title2 = button != null ? button.getTitle() : null;
                    ReviewActionNetworkRequestResult.Button button2 = info.getButton();
                    RatingDetailsInternalAction.ShowToastBar showToastBar = new RatingDetailsInternalAction.ShowToastBar(message, title2, (button2 == null || (uri2 = button2.getUri()) == null) ? null : new a.i(uri2, null, null, 6, null), 0, 8, null);
                    this.f247079r = null;
                    this.f247078q = 3;
                    if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (reviewActionNetworkRequestResult instanceof ReviewActionNetworkRequestResult.Error) {
                    ReviewActionNetworkRequestResult.Error error = (ReviewActionNetworkRequestResult.Error) reviewActionNetworkRequestResult;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(error.getMessage());
                    ReviewActionNetworkRequestResult.Button button3 = error.getButton();
                    PrintableText printableTextA = (button3 == null || (title = button3.getTitle()) == null) ? com.avito.android.printable_text.b.a() : com.avito.android.printable_text.b.f(title);
                    ReviewActionNetworkRequestResult.Button button4 = error.getButton();
                    RatingDetailsInternalAction.ShowErrorToastBar showErrorToastBar = new RatingDetailsInternalAction.ShowErrorToastBar(printableTextF, null, printableTextA, (button4 == null || (uri = button4.getUri()) == null) ? null : new a.i(uri, null, null, 6, null), null, 0, 50, null);
                    this.f247079r = null;
                    this.f247078q = 4;
                    if (interfaceC43172j.emit(showErrorToastBar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error2 = (TypedResult.Error) typedResult;
                ApiException apiExceptionA = C35936s.a(error2.getError(), error2.getCause());
                V2.f318762a.a("DEFAULT_TAG", "Failed to send review action network request", apiExceptionA);
                RatingDetailsInternalAction.ShowErrorToastBar showErrorToastBar2 = new RatingDetailsInternalAction.ShowErrorToastBar(com.avito.android.printable_text.b.f(fVar.f247042h.c(apiExceptionA)), null, null, null, null, 0, 62, null);
                this.f247079r = null;
                this.f247078q = 5;
                if (interfaceC43172j.emit(showErrorToastBar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k InterfaceC14487a interfaceC14487a, @Y61.k m mVar, @Y61.k com.avito.android.rating_persistence.llm_summary.h hVar, @Y61.k com.avito.android.rating_persistence.aspects.e eVar, @Y61.k com.avito.android.rating_persistence.sort.e eVar2, @Y61.k InterfaceC48669b interfaceC48669b, @Y61.k RatingDetailsArguments ratingDetailsArguments, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k com.avito.android.rating.details.interactor.c cVar, @Y61.k R0 r02) {
        this.f247035a = interfaceC14487a;
        this.f247036b = mVar;
        this.f247037c = hVar;
        this.f247038d = eVar;
        this.f247039e = eVar2;
        this.f247040f = interfaceC48669b;
        this.f247041g = ratingDetailsArguments;
        this.f247042h = interfaceC50647a;
        this.f247043i = cVar;
        this.f247044j = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(com.avito.android.rating.details.interactor.f r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.avito.android.rating.details.interactor.g
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.rating.details.interactor.g r0 = (com.avito.android.rating.details.interactor.g) r0
            int r1 = r0.f247089s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247089s = r1
            goto L18
        L13:
            com.avito.android.rating.details.interactor.g r0 = new com.avito.android.rating.details.interactor.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f247087q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f247089s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r6)
            if (r5 == 0) goto L4b
            r0.f247089s = r3
            com.avito.android.rating_persistence.aspects.e r4 = r4.f247038d
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L41
            goto L4f
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4a
            goto L4b
        L4a:
            r3 = 0
        L4b:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.f.i(com.avito.android.rating.details.interactor.f, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(com.avito.android.rating.details.interactor.f r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.avito.android.rating.details.interactor.h
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.rating.details.interactor.h r0 = (com.avito.android.rating.details.interactor.h) r0
            int r1 = r0.f247092s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247092s = r1
            goto L18
        L13:
            com.avito.android.rating.details.interactor.h r0 = new com.avito.android.rating.details.interactor.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f247090q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f247092s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r6)
            if (r5 == 0) goto L4b
            r0.f247092s = r3
            com.avito.android.rating_persistence.sort.e r4 = r4.f247039e
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L41
            goto L4f
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4a
            goto L4b
        L4a:
            r3 = 0
        L4b:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.f.j(com.avito.android.rating.details.interactor.f, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.rating.details.interactor.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.rating.details.interactor.j
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.rating.details.interactor.j r0 = (com.avito.android.rating.details.interactor.j) r0
            int r1 = r0.f247123s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247123s = r1
            goto L18
        L13:
            com.avito.android.rating.details.interactor.j r0 = new com.avito.android.rating.details.interactor.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f247121q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f247123s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            r0.f247123s = r3
            Mg0.a r7 = r4.f247035a
            java.lang.Object r7 = r7.i(r5, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L65
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r5 = r7.getResult()
            com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult r5 = (com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult) r5
            com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult$ReviewActionsButton r5 = r5.getButton()
            boolean r6 = r5 instanceof com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult.ReviewActionsBottomSheet
            if (r6 == 0) goto L56
            goto L57
        L56:
            r5 = 0
        L57:
            if (r5 == 0) goto L62
            com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult$ReviewActionsBottomSheet r5 = (com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult.ReviewActionsBottomSheet) r5
            java.util.List r5 = r5.getActions()
            if (r5 == 0) goto L62
            goto L67
        L62:
            kotlin.collections.z0 r5 = kotlin.collections.C42784z0.f406748b
            goto L67
        L65:
            kotlin.collections.z0 r5 = kotlin.collections.C42784z0.f406748b
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.f.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.rating.details.interactor.e
    @Y61.l
    public final Object b(long j12, @Y61.k Continuation<? super DeleteModelReviewResult> continuation) {
        return this.f247035a.b(j12, continuation);
    }

    @Override // com.avito.android.rating.details.interactor.e
    @Y61.l
    public final Object c(long j12, @Y61.k Continuation<? super TypedResult<DeleteReviewReplyResult>> continuation) {
        return this.f247035a.c(j12, continuation);
    }

    @Override // com.avito.android.rating.details.interactor.e
    @Y61.k
    public final InterfaceC43160i<RatingDetailsInternalAction> d(@Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str2, @Y61.l Long l12) {
        return C43175k.I(this.f247044j.a(), C43175k.G(new e(str, num, num2, num3, str2, l12, null)));
    }

    @Override // com.avito.android.rating.details.interactor.e
    @Y61.l
    public final Object e(long j12, @Y61.k Continuation<? super DeleteBuyerReviewResult> continuation) {
        return this.f247035a.e(j12, continuation);
    }

    @Override // com.avito.android.rating.details.interactor.e
    @Y61.k
    public final InterfaceC43160i<RatingDetailsInternalAction> f(@Y61.k Uri uri) {
        return C43175k.I(this.f247044j.a(), C43175k.G(new d(uri, null)));
    }

    @Override // com.avito.android.rating.details.interactor.e
    @Y61.k
    public final InterfaceC43160i<RatingDetailsInternalAction> g(@Y61.l List<? extends SearchParametersEntry.SearchParametersBlock> list, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Long l12, @Y61.l String str5, boolean z12, boolean z13, @Y61.l List<Long> list2, @Y61.l List<String> list3, boolean z14, @Y61.l com.avito.android.rating.details.mvi.entity.a aVar, boolean z15) {
        return C43175k.G(new c(list, str, str2, str3, str4, z15, z12, str5, l12, z13, list2, list3, z14, aVar, null));
    }

    @Override // com.avito.android.rating.details.interactor.e
    @Y61.k
    public final InterfaceC43160i<RatingDetailsInternalAction> h(long j12, long j13, @Y61.k BaseRatingReviewItem.ReviewAnswer reviewAnswer) {
        return C43175k.I(this.f247044j.a(), C43175k.G(new b(j13, j12, reviewAnswer, null)));
    }
}
