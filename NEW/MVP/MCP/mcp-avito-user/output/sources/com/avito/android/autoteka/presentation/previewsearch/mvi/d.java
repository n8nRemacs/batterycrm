package com.avito.android.autoteka.presentation.previewsearch.mvi;

import Y41.p;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.UtmParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaPreviewSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$searchPreview$1", f = "AutotekaPreviewSearchActor.kt", i = {0, 1, 2, 2}, l = {131, 134, 146, 148}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaPreviewSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f97590q;

    /* renamed from: r, reason: collision with root package name */
    public int f97591r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f97592s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f97593t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.autoteka.presentation.previewsearch.mvi.a f97594u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f97595v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UtmParams f97596w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f97597x;

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LHj0/c;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$searchPreview$1$result$1", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<Hj0.c>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97598q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.autoteka.presentation.previewsearch.mvi.a f97599r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f97600s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f97601t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ UtmParams f97602u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f97603v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar, UtmParams utmParams, Integer num, String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f97599r = aVar;
            this.f97600s = str;
            this.f97601t = num;
            this.f97602u = utmParams;
            this.f97603v = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            UtmParams utmParams = this.f97602u;
            String str = this.f97603v;
            return new a(this.f97599r, utmParams, this.f97601t, this.f97600s, str, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<Hj0.c>> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97598q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar = this.f97599r;
                com.avito.android.autoteka.data.previewSearch.a aVar2 = aVar.f97560a;
                boolean z12 = aVar.f97562c.f96228f;
                this.f97598q = 1;
                obj = aVar2.a(this.f97600s, this.f97601t, this.f97602u, this.f97603v, z12, this);
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
    public d(com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar, UtmParams utmParams, Integer num, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f97593t = str;
        this.f97594u = aVar;
        this.f97595v = num;
        this.f97596w = utmParams;
        this.f97597x = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        UtmParams utmParams = this.f97596w;
        String str = this.f97597x;
        d dVar = new d(this.f97594u, utmParams, this.f97595v, this.f97593t, str, continuation);
        dVar.f97592s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaPreviewSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.previewsearch.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
