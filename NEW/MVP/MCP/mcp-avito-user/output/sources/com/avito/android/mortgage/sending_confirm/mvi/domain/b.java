package com.avito.android.mortgage.sending_confirm.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.CheckboxMeta;
import com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import h31.e;
import java.util.Map;
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

/* compiled from: LegalRequirementsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/domain/b;", "Lcom/avito/android/mortgage/sending_confirm/mvi/domain/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.sending_confirm.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<IZ.a> f203558a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f203559b;

    /* compiled from: LegalRequirementsUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.sending_confirm.mvi.domain.LegalRequirementsUseCaseImpl$setPermissions$1", f = "LegalRequirementsUseCase.kt", i = {0, 1}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31, 32, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203560q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203561r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map<String, CheckboxMeta> f203562s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f203563t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, CheckboxMeta> map, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203562s = map;
            this.f203563t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f203562s, this.f203563t, continuation);
            aVar.f203561r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
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
                int r1 = r8.f203560q
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
                goto Ldf
            L22:
                java.lang.Object r1 = r8.f203561r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L9a
            L2a:
                java.lang.Object r1 = r8.f203561r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4a
            L32:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f203561r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction$LegalSendingStarted r1 = new com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction$LegalSendingStarted
                r1.<init>()
                r8.f203561r = r9
                r8.f203560q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r9
            L4a:
                java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
                java.util.Map<java.lang.String, com.avito.android.mortgage.api.model.CheckboxMeta> r5 = r8.f203562s
                int r6 = r5.size()
                int r6 = kotlin.collections.P0.f(r6)
                r9.<init>(r6)
                java.util.Set r5 = r5.entrySet()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L63:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L85
                java.lang.Object r6 = r5.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                java.lang.Object r6 = r6.getValue()
                com.avito.android.mortgage.api.model.CheckboxMeta r6 = (com.avito.android.mortgage.api.model.CheckboxMeta) r6
                boolean r6 = r6.getIsChecked()
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                r9.put(r7, r6)
                goto L63
            L85:
                com.avito.android.mortgage.sending_confirm.mvi.domain.b r5 = r8.f203563t
                h31.e<IZ.a> r5 = r5.f203558a
                java.lang.Object r5 = r5.get()
                IZ.a r5 = (IZ.a) r5
                r8.f203561r = r1
                r8.f203560q = r4
                java.lang.Object r9 = r5.q(r9, r8)
                if (r9 != r0) goto L9a
                return r0
            L9a:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto Lb9
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                kotlin.G0 r9 = (kotlin.G0) r9
                com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction$LegalSendingCompleted r9 = new com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction$LegalSendingCompleted
                r9.<init>()
                r8.f203561r = r5
                r8.f203560q = r3
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto Ldf
                return r0
            Lb9:
                boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Le2
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r3 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r3, r9)
                com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction$LegalSendingFailed r3 = new com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction$LegalSendingFailed
                com.avito.android.remote.error.ApiError r9 = com.avito.android.error.z.n(r9)
                r3.<init>(r9)
                r8.f203561r = r5
                r8.f203560q = r2
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto Ldf
                return r0
            Ldf:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            Le2:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.sending_confirm.mvi.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k R0 r02, @k e eVar) {
        this.f203558a = eVar;
        this.f203559b = r02;
    }

    @Override // com.avito.android.mortgage.sending_confirm.mvi.domain.a
    @k
    public final InterfaceC43160i<SendingConfirmInternalAction> a(@k Map<String, CheckboxMeta> map) {
        return C43175k.I(this.f203559b.a(), C43175k.G(new a(map, this, null)));
    }
}
