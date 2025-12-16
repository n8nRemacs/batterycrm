package com.avito.android.mortgage_invite.client_form.domain;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import e20.InterfaceC39928a;
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

/* compiled from: LoadClientFormUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/l;", "Lcom/avito/android/mortgage_invite/client_form/domain/k;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39928a f205174a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f205175b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.client_form.domain.mapper.d f205176c;

    /* compiled from: LoadClientFormUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.domain.LoadClientFormUseCaseImpl$invoke$1", f = "LoadClientFormUseCase.kt", i = {0, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f205177q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f205178r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f205180t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f205180t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = l.this.new a(this.f205180t, continuation);
            aVar.f205178r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
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
                int r1 = r7.f205177q
                com.avito.android.mortgage_invite.client_form.domain.l r2 = com.avito.android.mortgage_invite.client_form.domain.l.this
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
                goto La6
            L24:
                java.lang.Object r1 = r7.f205178r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5b
            L2c:
                java.lang.Object r1 = r7.f205178r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f205178r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$FormLoadingStarted r1 = new com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$FormLoadingStarted
                r1.<init>()
                r7.f205178r = r8
                r7.f205177q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                e20.a r8 = r2.f205174a
                r7.f205178r = r1
                r7.f205177q = r5
                java.lang.String r5 = r7.f205180t
                java.lang.Object r8 = r8.e(r5, r7)
                if (r8 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L80
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                h20.a r8 = (h20.C40763a) r8
                com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$FormLoadingSuccess r3 = new com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$FormLoadingSuccess
                com.avito.android.mortgage_invite.client_form.domain.mapper.d r2 = r2.f205176c
                T10.c r8 = r2.a(r8)
                r3.<init>(r8)
                r7.f205178r = r6
                r7.f205177q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto La6
                return r0
            L80:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto La9
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r2 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r2, r8)
                com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$FormLoadingFailed r2 = new com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$FormLoadingFailed
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r2.<init>(r8)
                r7.f205178r = r6
                r7.f205177q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La6
                return r0
            La6:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            La9:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_form.domain.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public l(@Y61.k InterfaceC39928a interfaceC39928a, @Y61.k R0 r02, @Y61.k com.avito.android.mortgage_invite.client_form.domain.mapper.d dVar) {
        this.f205174a = interfaceC39928a;
        this.f205175b = r02;
        this.f205176c = dVar;
    }

    @Override // com.avito.android.mortgage_invite.client_form.domain.k
    @Y61.k
    public final InterfaceC43160i<ApplicationClientFormInternalAction> a(@Y61.k String str) {
        return C43175k.I(this.f205175b.a(), C43175k.G(new a(str, null)));
    }
}
