package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
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

/* compiled from: InitializationUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/domain/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<IZ.a> f201877a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PreApprovalArguments f201878b;

    /* compiled from: InitializationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.pre_approval.form.mvi.domain.InitializationUseCase$initialize$1", f = "InitializationUseCase.kt", i = {0, 1}, l = {17, 19, 20, 21}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.pre_approval.form.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C5988a extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201879q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201880r;

        public C5988a(Continuation<? super C5988a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C5988a c5988a = a.this.new C5988a(continuation);
            c5988a.f201880r = obj;
            return c5988a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PreApprovalFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C5988a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
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
                int r1 = r7.f201879q
                com.avito.android.mortgage.pre_approval.form.mvi.domain.a r2 = com.avito.android.mortgage.pre_approval.form.mvi.domain.a.this
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
                java.lang.Object r1 = r7.f201880r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5f
            L2c:
                java.lang.Object r1 = r7.f201880r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f201880r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction$InitLoadingStarted r1 = new com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction$InitLoadingStarted
                r1.<init>()
                r7.f201880r = r8
                r7.f201879q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                h31.e<IZ.a> r8 = r2.f201877a
                java.lang.Object r8 = r8.get()
                IZ.a r8 = (IZ.a) r8
                r7.f201880r = r1
                r7.f201879q = r5
                java.lang.Object r8 = r8.b(r7)
                if (r8 != r0) goto L5f
                return r0
            L5f:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L80
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.mortgage.api.model.DictionariesResult r8 = (com.avito.android.mortgage.api.model.DictionariesResult) r8
                com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction$InitLoadingCompleted r3 = new com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction$InitLoadingCompleted
                com.avito.android.mortgage.pre_approval.model.PreApprovalArguments r2 = r2.f201878b
                r3.<init>(r2, r8)
                r7.f201880r = r6
                r7.f201879q = r4
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
                com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction$InitLoadingFailed r2 = new com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction$InitLoadingFailed
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r2.<init>(r8)
                r7.f201880r = r6
                r7.f201879q = r3
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
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.pre_approval.form.mvi.domain.a.C5988a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k h31.e<IZ.a> eVar, @k PreApprovalArguments preApprovalArguments) {
        this.f201877a = eVar;
        this.f201878b = preApprovalArguments;
    }

    @k
    public final InterfaceC43160i<PreApprovalFormInternalAction> a() {
        return C43175k.G(new C5988a(null));
    }
}
