package com.avito.android.vas_performance.screens.visual.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zL0.InterfaceC50482a;

/* compiled from: GetVasContextUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/domain/b;", "Lcom/avito/android/vas_performance/screens/visual/mvi/domain/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.vas_performance.screens.visual.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50482a f321104a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f321105b;

    /* compiled from: GetVasContextUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.visual.mvi.domain.GetVasContextUseCaseImpl$execute$1", f = "GetVasContextUseCase.kt", i = {0, 1, 2, 2}, l = {35, 38, 40, 42, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super VisualVasInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult f321106q;

        /* renamed from: r, reason: collision with root package name */
        public int f321107r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f321108s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f321109t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Set<String> f321110u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b f321111v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f321112w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f321113x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Set<String> set, b bVar, String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f321109t = num;
            this.f321110u = set;
            this.f321111v = bVar;
            this.f321112w = str;
            this.f321113x = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f321109t, this.f321110u, this.f321111v, this.f321112w, this.f321113x, continuation);
            aVar.f321108s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super VisualVasInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f321107r
                java.lang.Integer r2 = r9.f321109t
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L41
                if (r1 == r7) goto L39
                if (r1 == r6) goto L31
                if (r1 == r5) goto L27
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.C42729a0.b(r10)
                goto Ld0
            L27:
                com.avito.android.remote.model.TypedResult r1 = r9.f321106q
                java.lang.Object r2 = r9.f321108s
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r10)
                goto L90
            L31:
                java.lang.Object r1 = r9.f321108s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L79
            L39:
                java.lang.Object r1 = r9.f321108s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L59
            L41:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f321108s
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$ChangeButtonState r10 = new com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$ChangeButtonState
                r10.<init>(r7, r2)
                r9.f321108s = r1
                r9.f321107r = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L59
                return r0
            L59:
                com.avito.android.util.A4 r10 = com.avito.android.util.A4.f318516a
                r10.getClass()
                java.util.Set<java.lang.String> r10 = r9.f321110u
                java.lang.String r7 = "slug"
                java.util.HashMap r10 = com.avito.android.util.A4.g(r7, r10)
                com.avito.android.vas_performance.screens.visual.mvi.domain.b r7 = r9.f321111v
                zL0.a r7 = r7.f321104a
                r9.f321108s = r1
                r9.f321107r = r6
                java.lang.String r6 = r9.f321112w
                java.lang.String r8 = r9.f321113x
                java.lang.Object r10 = r7.p(r6, r10, r8, r9)
                if (r10 != r0) goto L79
                return r0
            L79:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$ChangeButtonState r6 = new com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$ChangeButtonState
                r7 = 0
                r6.<init>(r7, r2)
                r9.f321108s = r1
                r9.f321106q = r10
                r9.f321107r = r5
                java.lang.Object r2 = r1.emit(r6, r9)
                if (r2 != r0) goto L8e
                return r0
            L8e:
                r2 = r1
                r1 = r10
            L90:
                boolean r10 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r10 == 0) goto Lb4
                com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$OpenDeepLink r10 = new com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$OpenDeepLink
                com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
                java.lang.Object r1 = r1.getResult()
                com.avito.android.remote.model.DeepLinkResponse r1 = (com.avito.android.remote.model.DeepLinkResponse) r1
                com.avito.android.deep_linking.links.DeepLink r1 = r1.getDeepLink()
                r10.<init>(r1)
                r9.f321108s = r5
                r9.f321106q = r5
                r9.f321107r = r4
                java.lang.Object r10 = r2.emit(r10, r9)
                if (r10 != r0) goto Ld0
                return r0
            Lb4:
                boolean r10 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r10 == 0) goto Ld0
                com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$ShowErrorToast r10 = new com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$ShowErrorToast
                com.avito.android.remote.model.TypedResult$Error r1 = (com.avito.android.remote.model.TypedResult.Error) r1
                com.avito.android.remote.error.ApiError r1 = r1.getError()
                r10.<init>(r1)
                r9.f321108s = r5
                r9.f321106q = r5
                r9.f321107r = r3
                java.lang.Object r10 = r2.emit(r10, r9)
                if (r10 != r0) goto Ld0
                return r0
            Ld0:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.visual.mvi.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC50482a interfaceC50482a, @k R0 r02) {
        this.f321104a = interfaceC50482a;
        this.f321105b = r02;
    }

    @Override // com.avito.android.vas_performance.screens.visual.mvi.domain.a
    @k
    public final InterfaceC43160i<VisualVasInternalAction> a(@k String str, @k String str2, @k Set<String> set, @l Integer num) {
        return C43175k.I(this.f321105b.a(), C43175k.G(new a(num, set, this, str, str2, null)));
    }
}
