package com.avito.android.vas_performance.screens.visual.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: GetVisualVasUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/domain/e;", "Lcom/avito/android/vas_performance/screens/visual/mvi/domain/d;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50482a f321116a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f321117b;

    /* compiled from: GetVisualVasUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.visual.mvi.domain.GetVisualVasUseCaseImpl$execute$1", f = "GetVisualVasUseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f321118q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f321119r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f321121t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f321122u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f321121t = str;
            this.f321122u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(this.f321121t, this.f321122u, continuation);
            aVar.f321119r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f321118q
                java.lang.String r2 = r7.f321122u
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto L96
            L24:
                java.lang.Object r1 = r7.f321119r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5d
            L2c:
                java.lang.Object r1 = r7.f321119r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f321119r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$Loading r1 = new com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$Loading
                r1.<init>()
                r7.f321119r = r8
                r7.f321118q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                com.avito.android.vas_performance.screens.visual.mvi.domain.e r8 = com.avito.android.vas_performance.screens.visual.mvi.domain.e.this
                zL0.a r8 = r8.f321116a
                r7.f321119r = r1
                r7.f321118q = r5
                java.lang.String r5 = r7.f321121t
                java.lang.Object r8 = r8.a(r5, r2, r7)
                if (r8 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L7c
                com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$Content r3 = new com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$Content
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                HL0.b r8 = (HL0.b) r8
                r3.<init>(r8, r2)
                r7.f321119r = r6
                r7.f321118q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L96
                return r0
            L7c:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto L96
                com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$Error r2 = new com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r8 = r8.getError()
                r2.<init>(r8)
                r7.f321119r = r6
                r7.f321118q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.visual.mvi.domain.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@k InterfaceC50482a interfaceC50482a, @k R0 r02) {
        this.f321116a = interfaceC50482a;
        this.f321117b = r02;
    }

    @Override // com.avito.android.vas_performance.screens.visual.mvi.domain.d
    @k
    public final InterfaceC43160i<VisualVasInternalAction> a(@k String str, @k String str2) {
        return C43175k.I(this.f321117b.a(), C43175k.G(new a(str, str2, null)));
    }
}
