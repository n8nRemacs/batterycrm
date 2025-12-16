package com.avito.android.freemium.screens.rules.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AcceptFreemiumRulesUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/freemium/screens/rules/domain/a;", "", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f159100a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ZE.a f159101b;

    /* renamed from: c, reason: collision with root package name */
    public final long f159102c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f159103d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f159104e;

    /* compiled from: AcceptFreemiumRulesUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.freemium.screens.rules.domain.AcceptFreemiumRulesUseCase$invoke$1", f = "AcceptFreemiumRulesUseCase.kt", i = {0, 1, 2, 3}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 33, 36, 39}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.freemium.screens.rules.domain.a$a, reason: collision with other inner class name */
    public static final class C4651a extends SuspendLambda implements p<InterfaceC43172j<? super FreemiumRulesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159105q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159106r;

        public C4651a(Continuation<? super C4651a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4651a c4651a = a.this.new C4651a(continuation);
            c4651a.f159106r = obj;
            return c4651a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FreemiumRulesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4651a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f159105q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3d
                if (r1 == r6) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L24
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                kotlin.C42729a0.b(r13)
                goto Lc5
            L1c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L24:
                java.lang.Object r1 = r12.f159106r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto Lb3
            L2d:
                java.lang.Object r1 = r12.f159106r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L6b
            L35:
                java.lang.Object r1 = r12.f159106r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L55
            L3d:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f159106r
                r1 = r13
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$AcceptanceLoading r13 = new com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$AcceptanceLoading
                r13.<init>(r6)
                r12.f159106r = r1
                r12.f159105q = r6
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L55
                return r0
            L55:
                com.avito.android.freemium.screens.rules.domain.a r13 = com.avito.android.freemium.screens.rules.domain.a.this
                ZE.a r6 = r13.f159101b
                r12.f159106r = r1
                r12.f159105q = r5
                java.lang.String r7 = r13.f159103d
                java.lang.String r8 = r13.f159104e
                long r9 = r13.f159102c
                r11 = r12
                java.lang.Object r13 = r6.c(r7, r8, r9, r11)
                if (r13 != r0) goto L6b
                return r0
            L6b:
                com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
                boolean r5 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L8d
                com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
                java.lang.Object r13 = r13.getResult()
                aF.a r13 = (aF.C19762a) r13
                com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$OpenDeepLink r3 = new com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$OpenDeepLink
                com.avito.android.deep_linking.links.DeepLink r13 = r13.getUri()
                r3.<init>(r13)
                r12.f159106r = r1
                r12.f159105q = r4
                java.lang.Object r13 = r1.emit(r3, r12)
                if (r13 != r0) goto Lb3
                return r0
            L8d:
                boolean r4 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lc8
                com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
                com.avito.android.remote.error.ApiError r4 = r13.getError()
                java.lang.Throwable r13 = r13.getCause()
                com.avito.android.util.ApiException r13 = com.avito.android.util.C35936s.a(r4, r13)
                com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$AcceptanceError r4 = new com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$AcceptanceError
                java.lang.String r13 = com.avito.android.error.z.l(r13)
                r4.<init>(r13)
                r12.f159106r = r1
                r12.f159105q = r3
                java.lang.Object r13 = r1.emit(r4, r12)
                if (r13 != r0) goto Lb3
                return r0
            Lb3:
                com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$AcceptanceLoading r13 = new com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction$AcceptanceLoading
                r3 = 0
                r13.<init>(r3)
                r3 = 0
                r12.f159106r = r3
                r12.f159105q = r2
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto Lc5
                return r0
            Lc5:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            Lc8:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.freemium.screens.rules.domain.a.C4651a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k R0 r02, @k ZE.a aVar, @YE.d long j12, @l @YE.a String str, @YE.b @k String str2) {
        this.f159100a = r02;
        this.f159101b = aVar;
        this.f159102c = j12;
        this.f159103d = str;
        this.f159104e = str2;
    }

    @k
    public final InterfaceC43160i<FreemiumRulesInternalAction> a() {
        return C43175k.I(this.f159100a.a(), C43175k.G(new C4651a(null)));
    }
}
