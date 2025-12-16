package com.avito.android.freemium.screens.contact_history.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import YE.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction;
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

/* compiled from: GetFreemiumContactHistoryUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/domain/a;", "", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ZE.a f158973a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f158974b;

    /* renamed from: c, reason: collision with root package name */
    public final long f158975c;

    /* compiled from: GetFreemiumContactHistoryUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.freemium.screens.contact_history.domain.GetFreemiumContactHistoryUseCase$invoke$1", f = "GetFreemiumContactHistoryUseCase.kt", i = {0, 1}, l = {21, 23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.freemium.screens.contact_history.domain.a$a, reason: collision with other inner class name */
    public static final class C4645a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f158976q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f158977r;

        public C4645a(Continuation<? super C4645a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4645a c4645a = a.this.new C4645a(continuation);
            c4645a.f158977r = obj;
            return c4645a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4645a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
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
                int r1 = r8.f158976q
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
                goto L9c
            L22:
                java.lang.Object r1 = r8.f158977r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L5b
            L2a:
                java.lang.Object r1 = r8.f158977r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4a
            L32:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f158977r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction$Loading r1 = new com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction$Loading
                r1.<init>()
                r8.f158977r = r9
                r8.f158976q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r9
            L4a:
                com.avito.android.freemium.screens.contact_history.domain.a r9 = com.avito.android.freemium.screens.contact_history.domain.a.this
                ZE.a r5 = r9.f158973a
                r8.f158977r = r1
                r8.f158976q = r4
                long r6 = r9.f158975c
                java.lang.Object r9 = r5.b(r6, r8)
                if (r9 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7a
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                bF.a r9 = (bF.C25506a) r9
                com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction$Content r2 = new com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction$Content
                r2.<init>(r9)
                r8.f158977r = r5
                r8.f158976q = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L9c
                return r0
            L7a:
                boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9f
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r3 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r3, r9)
                com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction$Error r3 = new com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction$Error
                r3.<init>(r9)
                r8.f158977r = r5
                r8.f158976q = r2
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto L9c
                return r0
            L9c:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            L9f:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.freemium.screens.contact_history.domain.a.C4645a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@d long j12, @k ZE.a aVar, @k R0 r02) {
        this.f158973a = aVar;
        this.f158974b = r02;
        this.f158975c = j12;
    }

    @k
    public final InterfaceC43160i<FreemiumContactHistoryInternalAction> a() {
        return C43175k.I(this.f158974b.a(), C43175k.G(new C4645a(null)));
    }
}
