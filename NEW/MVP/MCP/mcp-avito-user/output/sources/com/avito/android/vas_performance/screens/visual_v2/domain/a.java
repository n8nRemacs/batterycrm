package com.avito.android.vas_performance.screens.visual_v2.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: GetVisualVasV2ContextUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/domain/a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50482a f321210a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f321211b;

    /* compiled from: GetVisualVasV2ContextUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.visual_v2.domain.GetVisualVasV2ContextUseCase$invoke$1", f = "GetVisualVasV2ContextUseCase.kt", i = {0, 1, 2, 2}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 31, 32}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
    /* renamed from: com.avito.android.vas_performance.screens.visual_v2.domain.a$a, reason: collision with other inner class name */
    public static final class C9948a extends SuspendLambda implements p<InterfaceC43172j<? super VisualVasV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult f321212q;

        /* renamed from: r, reason: collision with root package name */
        public int f321213r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f321214s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Set<String> f321215t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f321216u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f321217v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f321218w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9948a(Set<String> set, a aVar, String str, String str2, Continuation<? super C9948a> continuation) {
            super(2, continuation);
            this.f321215t = set;
            this.f321216u = aVar;
            this.f321217v = str;
            this.f321218w = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9948a c9948a = new C9948a(this.f321215t, this.f321216u, this.f321217v, this.f321218w, continuation);
            c9948a.f321214s = obj;
            return c9948a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super VisualVasV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9948a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f321213r
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3f
                if (r1 == r6) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                kotlin.C42729a0.b(r9)
                goto Lce
            L25:
                com.avito.android.remote.model.TypedResult r1 = r8.f321212q
                java.lang.Object r4 = r8.f321214s
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.InterfaceC43172j) r4
                kotlin.C42729a0.b(r9)
                goto L8e
            L2f:
                java.lang.Object r1 = r8.f321214s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L77
            L37:
                java.lang.Object r1 = r8.f321214s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L57
            L3f:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f321214s
                r1 = r9
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$ChangeButtonState r9 = new com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$ChangeButtonState
                r9.<init>(r6)
                r8.f321214s = r1
                r8.f321213r = r6
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L57
                return r0
            L57:
                com.avito.android.util.A4 r9 = com.avito.android.util.A4.f318516a
                r9.getClass()
                java.util.Set<java.lang.String> r9 = r8.f321215t
                java.lang.String r6 = "slug"
                java.util.HashMap r9 = com.avito.android.util.A4.g(r6, r9)
                com.avito.android.vas_performance.screens.visual_v2.domain.a r6 = r8.f321216u
                zL0.a r6 = r6.f321210a
                r8.f321214s = r1
                r8.f321213r = r5
                java.lang.String r5 = r8.f321217v
                java.lang.String r7 = r8.f321218w
                java.lang.Object r9 = r6.p(r5, r9, r7, r8)
                if (r9 != r0) goto L77
                return r0
            L77:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$ChangeButtonState r5 = new com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$ChangeButtonState
                r6 = 0
                r5.<init>(r6)
                r8.f321214s = r1
                r8.f321212q = r9
                r8.f321213r = r4
                java.lang.Object r4 = r1.emit(r5, r8)
                if (r4 != r0) goto L8c
                return r0
            L8c:
                r4 = r1
                r1 = r9
            L8e:
                boolean r9 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r9 == 0) goto Lb2
                com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$OpenDeepLink r9 = new com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$OpenDeepLink
                com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
                java.lang.Object r1 = r1.getResult()
                com.avito.android.remote.model.DeepLinkResponse r1 = (com.avito.android.remote.model.DeepLinkResponse) r1
                com.avito.android.deep_linking.links.DeepLink r1 = r1.getDeepLink()
                r9.<init>(r1)
                r8.f321214s = r5
                r8.f321212q = r5
                r8.f321213r = r3
                java.lang.Object r9 = r4.emit(r9, r8)
                if (r9 != r0) goto Lce
                return r0
            Lb2:
                boolean r9 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r9 == 0) goto Lce
                com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$ShowErrorToast r9 = new com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction$ShowErrorToast
                com.avito.android.remote.model.TypedResult$Error r1 = (com.avito.android.remote.model.TypedResult.Error) r1
                com.avito.android.remote.error.ApiError r1 = r1.getError()
                r9.<init>(r1)
                r8.f321214s = r5
                r8.f321212q = r5
                r8.f321213r = r2
                java.lang.Object r9 = r4.emit(r9, r8)
                if (r9 != r0) goto Lce
                return r0
            Lce:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.visual_v2.domain.a.C9948a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k InterfaceC50482a interfaceC50482a, @k R0 r02) {
        this.f321210a = interfaceC50482a;
        this.f321211b = r02;
    }

    @k
    public final InterfaceC43160i<VisualVasV2InternalAction> a(@k String str, @k String str2, @k Set<String> set) {
        return C43175k.I(this.f321211b.a(), C43175k.G(new C9948a(set, this, str, str2, null)));
    }
}
