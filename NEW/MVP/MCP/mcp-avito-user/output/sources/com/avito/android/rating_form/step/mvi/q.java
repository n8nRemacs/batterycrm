package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepBootstrap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/rating_form/FieldIdentifier;", "", "Lcom/avito/android/rating_form/step/e;", "fileList", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<anonymous>", "(Ljava/util/Map;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepBootstrap$observeFileEvents$1", f = "RatingFormStepBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class q extends SuspendLambda implements Y41.p<Map<FieldIdentifier, ? extends List<? extends com.avito.android.rating_form.step.e>>, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f249673q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f249674r;

    /* compiled from: RatingFormStepBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepBootstrap$observeFileEvents$1$1", f = "RatingFormStepBootstrap.kt", i = {0, 0, 0, 0, 1, 1}, l = {108, 117}, m = "invokeSuspend", n = {"$this$flow", "fileFieldList", "it", "files", "$this$flow", "fileFieldList"}, s = {"L$0", "L$1", "L$5", "L$6", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public List f249675q;

        /* renamed from: r, reason: collision with root package name */
        public Map f249676r;

        /* renamed from: s, reason: collision with root package name */
        public s f249677s;

        /* renamed from: t, reason: collision with root package name */
        public Iterator f249678t;

        /* renamed from: u, reason: collision with root package name */
        public FieldIdentifier f249679u;

        /* renamed from: v, reason: collision with root package name */
        public Map.Entry f249680v;

        /* renamed from: w, reason: collision with root package name */
        public int f249681w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f249682x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ s f249683y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Map<FieldIdentifier, List<com.avito.android.rating_form.step.e>> f249684z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s sVar, Map<FieldIdentifier, ? extends List<com.avito.android.rating_form.step.e>> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f249683y = sVar;
            this.f249684z = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f249683y, this.f249684z, continuation);
            aVar.f249682x = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01e3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01e7  */
        /* JADX WARN: Type inference failed for: r1v16, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01e4 -> B:7:0x002a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 490
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f249674r = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f249674r, continuation);
        qVar.f249673q = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(Map<FieldIdentifier, ? extends List<? extends com.avito.android.rating_form.step.e>> map, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>> continuation) {
        return ((q) create(map, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43175k.G(new a(this.f249674r, (Map) this.f249673q, null));
    }
}
