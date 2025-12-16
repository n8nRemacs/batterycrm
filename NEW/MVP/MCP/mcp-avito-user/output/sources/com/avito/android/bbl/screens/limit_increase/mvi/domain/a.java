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

/* compiled from: GetLimitIncreaseUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/domain/a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44774a f99767a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f99768b;

    /* renamed from: c, reason: collision with root package name */
    public final long f99769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f99770d;

    /* compiled from: GetLimitIncreaseUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bbl.screens.limit_increase.mvi.domain.GetLimitIncreaseUseCase$invoke$1", f = "GetLimitIncreaseUseCase.kt", i = {0, 1}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.bbl.screens.limit_increase.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C3008a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f99771q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f99772r;

        public C3008a(Continuation<? super C3008a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C3008a c3008a = a.this.new C3008a(continuation);
            c3008a.f99772r = obj;
            return c3008a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3008a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
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
                int r1 = r8.f99771q
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
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                kotlin.C42729a0.b(r9)
                goto L9e
            L22:
                java.lang.Object r1 = r8.f99772r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L5d
            L2a:
                java.lang.Object r1 = r8.f99772r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4a
            L32:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f99772r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$Loading r1 = new com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$Loading
                r1.<init>()
                r8.f99772r = r9
                r8.f99771q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r9
            L4a:
                com.avito.android.bbl.screens.limit_increase.mvi.domain.a r9 = com.avito.android.bbl.screens.limit_increase.mvi.domain.a.this
                oh.a r5 = r9.f99767a
                r8.f99772r = r1
                r8.f99771q = r4
                java.lang.String r4 = r9.f99770d
                long r6 = r9.f99769c
                java.lang.Object r9 = r5.d(r4, r6, r8)
                if (r9 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7c
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                qh.a r9 = (qh.C47397a) r9
                com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$Content r2 = new com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$Content
                r2.<init>(r9)
                r8.f99772r = r5
                r8.f99771q = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L9e
                return r0
            L7c:
                boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La1
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r3 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r3, r9)
                com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$Error r3 = new com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction$Error
                r3.<init>(r9)
                r8.f99772r = r5
                r8.f99771q = r2
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto L9e
                return r0
            L9e:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            La1:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bbl.screens.limit_increase.mvi.domain.a.C3008a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k InterfaceC44774a interfaceC44774a, @k R0 r02, @com.avito.android.bbl.screens.limit_increase.di.c long j12, @m @k String str) {
        this.f99767a = interfaceC44774a;
        this.f99768b = r02;
        this.f99769c = j12;
        this.f99770d = str;
    }

    @k
    public final InterfaceC43160i<LimitIncreaseInternalAction> a() {
        return C43175k.I(this.f99768b.a(), C43175k.G(new C3008a(null)));
    }
}
