package com.avito.android.bbl.screens.limit_increase.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.limit_increase.di.m;
import com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
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
import oh.InterfaceC44774a;

/* compiled from: PostLimitIncreaseUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/domain/c;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44774a f99778a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f99779b;

    /* renamed from: c, reason: collision with root package name */
    public final long f99780c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f99781d;

    /* compiled from: PostLimitIncreaseUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bbl.screens.limit_increase.mvi.domain.PostLimitIncreaseUseCase$invoke$1", f = "PostLimitIncreaseUseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, 31, 32}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super LimitIncreaseInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f99782q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f99783r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Long f99785t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f99785t = l12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f99785t, continuation);
            aVar.f99783r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LimitIncreaseInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
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
                int r1 = r12.f99782q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.C42729a0.b(r13)
                goto La6
            L22:
                java.lang.Object r1 = r12.f99783r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L61
            L2a:
                java.lang.Object r1 = r12.f99783r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L47
            L32:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f99783r
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
                com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$PostSaveLoading r1 = com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction.PostSaveLoading.f99804b
                r12.f99783r = r13
                r12.f99782q = r5
                java.lang.Object r1 = r13.emit(r1, r12)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r13
            L47:
                com.avito.android.bbl.screens.limit_increase.mvi.domain.c r13 = com.avito.android.bbl.screens.limit_increase.mvi.domain.c.this
                oh.a r5 = r13.f99778a
                java.lang.Long r6 = r12.f99785t
                long r9 = r6.longValue()
                r12.f99783r = r1
                r12.f99782q = r4
                java.lang.String r6 = r13.f99781d
                long r7 = r13.f99780c
                r11 = r12
                java.lang.Object r13 = r5.c(r6, r7, r9, r11)
                if (r13 != r0) goto L61
                return r0
            L61:
                com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
                boolean r4 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L84
                com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
                java.lang.Object r13 = r13.getResult()
                rh.a r13 = (rh.C47656a) r13
                com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$HandleDeeplink r2 = new com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$HandleDeeplink
                com.avito.android.deep_linking.links.DeepLink r13 = r13.getUri()
                r2.<init>(r13)
                r12.f99783r = r5
                r12.f99782q = r3
                java.lang.Object r13 = r1.emit(r2, r12)
                if (r13 != r0) goto La6
                return r0
            L84:
                boolean r3 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La9
                com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
                com.avito.android.remote.error.ApiError r3 = r13.getError()
                java.lang.Throwable r13 = r13.getCause()
                com.avito.android.util.ApiException r13 = com.avito.android.util.C35936s.a(r3, r13)
                com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$PostSaveError r3 = new com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$PostSaveError
                r3.<init>(r13)
                r12.f99783r = r5
                r12.f99782q = r2
                java.lang.Object r13 = r1.emit(r3, r12)
                if (r13 != r0) goto La6
                return r0
            La6:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            La9:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bbl.screens.limit_increase.mvi.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k InterfaceC44774a interfaceC44774a, @k R0 r02, @com.avito.android.bbl.screens.limit_increase.di.c long j12, @m @k String str) {
        this.f99778a = interfaceC44774a;
        this.f99779b = r02;
        this.f99780c = j12;
        this.f99781d = str;
    }

    @k
    public final InterfaceC43160i<LimitIncreaseInternalAction> a(@l Long l12) {
        if (l12 == null) {
            return C43175k.w();
        }
        return C43175k.I(this.f99779b.a(), C43175k.G(new a(l12, null)));
    }
}
