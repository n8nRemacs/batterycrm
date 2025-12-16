package com.avito.android.rating.details.interactor;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.interactor.RatingDetailsInteractorImpl$getItems$2", f = "RatingDetailsInteractor.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 6, 6, 7, 7, 8, 9, 9, 9}, l = {194, 196, 198, 199, 201, 205, 214, 223, 226, 256, 258, 260, 262}, m = "invokeSuspend", n = {"$this$flow", "loadItemsUUID", "isSortApplied", "$this$flow", "loadItemsUUID", "result", "isSortApplied", "$this$flow", "result", "isSortApplied", "$this$flow", "result", "isSortApplied", "ratingLLMSummaryFeedbackWasSent", "$this$flow", "result", "isSortApplied", "ratingLLMSummaryFeedbackWasSent", "sortTooltipWasShown", "$this$flow", "result", "$this$flow", "result", "result", "$this$flow", "it", "isSortApplied"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$7", "I$0", "L$0", "L$6", "I$0", "L$0", "L$6", "I$0", "Z$4", "L$0", "L$6", "I$0", "Z$4", "Z$5", "L$0", "L$6", "L$0", "L$6", "L$5", "L$0", "L$2", "I$0"})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public boolean f247093A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f247094B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f247095C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f247096D;

    /* renamed from: E, reason: collision with root package name */
    public int f247097E;

    /* renamed from: F, reason: collision with root package name */
    public /* synthetic */ Object f247098F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ f f247099G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ String f247100H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f247101I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ List<String> f247102J;

    /* renamed from: K, reason: collision with root package name */
    public final /* synthetic */ boolean f247103K;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ String f247104L;

    /* renamed from: M, reason: collision with root package name */
    public final /* synthetic */ List<Long> f247105M;

    /* renamed from: N, reason: collision with root package name */
    public final /* synthetic */ boolean f247106N;

    /* renamed from: O, reason: collision with root package name */
    public final /* synthetic */ Long f247107O;

    /* renamed from: P, reason: collision with root package name */
    public final /* synthetic */ boolean f247108P;

    /* renamed from: Q, reason: collision with root package name */
    public final /* synthetic */ boolean f247109Q;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247110R;

    /* renamed from: q, reason: collision with root package name */
    public Object f247111q;

    /* renamed from: r, reason: collision with root package name */
    public Object f247112r;

    /* renamed from: s, reason: collision with root package name */
    public Object f247113s;

    /* renamed from: t, reason: collision with root package name */
    public Object f247114t;

    /* renamed from: u, reason: collision with root package name */
    public Object f247115u;

    /* renamed from: v, reason: collision with root package name */
    public Object f247116v;

    /* renamed from: w, reason: collision with root package name */
    public RatingDetailsResult f247117w;

    /* renamed from: x, reason: collision with root package name */
    public int f247118x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f247119y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f247120z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, String str, Map<String, String> map, List<String> list, boolean z12, String str2, List<Long> list2, boolean z13, Long l12, boolean z14, boolean z15, com.avito.android.rating.details.mvi.entity.a aVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f247099G = fVar;
        this.f247100H = str;
        this.f247101I = map;
        this.f247102J = list;
        this.f247103K = z12;
        this.f247104L = str2;
        this.f247105M = list2;
        this.f247106N = z13;
        this.f247107O = l12;
        this.f247108P = z14;
        this.f247109Q = z15;
        this.f247110R = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f247099G, this.f247100H, this.f247101I, this.f247102J, this.f247103K, this.f247104L, this.f247105M, this.f247106N, this.f247107O, this.f247108P, this.f247109Q, this.f247110R, continuation);
        iVar.f247098F = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x047b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0523 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0320 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0341  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
