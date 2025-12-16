package com.avito.android.mortgage.applications_list;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
import com.avito.android.mortgage.deeplink.domain.i;
import com.avito.android.util.ApiException;
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

/* compiled from: ApplicationsListInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/d;", "Lcom/avito/android/mortgage/applications_list/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f198356a;

    /* compiled from: ApplicationsListInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.applications_list.ApplicationsListInteractorImpl$deleteApplication$1", f = "ApplicationsListInteractor.kt", i = {0, 1, 3, 3}, l = {43, 45, 46, 49, 50}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationsListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public ApiException f198357q;

        /* renamed from: r, reason: collision with root package name */
        public int f198358r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f198359s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f198361u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f198361u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = d.this.new a(this.f198361u, continuation);
            aVar.f198359s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ApplicationsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4 A[RETURN] */
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
                int r1 = r9.f198358r
                com.avito.android.mortgage.applications_list.d r2 = com.avito.android.mortgage.applications_list.d.this
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L43
                if (r1 == r7) goto L3b
                if (r1 == r6) goto L33
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                goto L2e
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                com.avito.android.util.ApiException r1 = r9.f198357q
                java.lang.Object r2 = r9.f198359s
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r10)
                goto Laf
            L2e:
                kotlin.C42729a0.b(r10)
                goto Lc5
            L33:
                java.lang.Object r1 = r9.f198359s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L6a
            L3b:
                java.lang.Object r1 = r9.f198359s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L5b
            L43:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f198359s
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction$ContentLoading r10 = new com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction$ContentLoading
                r10.<init>()
                r9.f198359s = r1
                r9.f198358r = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.mortgage.deeplink.domain.i r10 = r2.f198356a
                r9.f198359s = r1
                r9.f198358r = r6
                java.lang.String r6 = r9.f198361u
                java.lang.Object r10 = r10.a(r6, r9)
                if (r10 != r0) goto L6a
                return r0
            L6a:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r6 == 0) goto L87
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                kotlin.G0 r10 = (kotlin.G0) r10
                kotlinx.coroutines.flow.i r10 = r2.b()
                r9.f198359s = r8
                r9.f198358r = r5
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto Lc5
                return r0
            L87:
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc8
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r2 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
                com.avito.android.util.V2 r2 = com.avito.android.util.V2.f318762a
                r2.f(r10)
                com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction$DeleteError r2 = com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction.DeleteError.f198447b
                r9.f198359s = r1
                r9.f198357q = r10
                r9.f198358r = r4
                java.lang.Object r2 = r1.emit(r2, r9)
                if (r2 != r0) goto Lad
                return r0
            Lad:
                r2 = r1
                r1 = r10
            Laf:
                com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction$ShowErrorToast r10 = new com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction$ShowErrorToast
                java.lang.String r1 = com.avito.android.error.z.l(r1)
                r10.<init>(r1)
                r9.f198359s = r8
                r9.f198357q = r8
                r9.f198358r = r3
                java.lang.Object r10 = r2.emit(r10, r9)
                if (r10 != r0) goto Lc5
                return r0
            Lc5:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lc8:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.applications_list.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ApplicationsListInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.applications_list.ApplicationsListInteractorImpl$loadApplicationsList$1", f = "ApplicationsListInteractor.kt", i = {0, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30, 32, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationsListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198362q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f198363r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = d.this.new b(continuation);
            bVar.f198363r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ApplicationsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r38) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.applications_list.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public d(@k i iVar) {
        this.f198356a = iVar;
    }

    @Override // com.avito.android.mortgage.applications_list.c
    @k
    public final InterfaceC43160i<ApplicationsListInternalAction> a(@k String str) {
        return C43175k.G(new a(str, null));
    }

    @Override // com.avito.android.mortgage.applications_list.c
    @k
    public final InterfaceC43160i<ApplicationsListInternalAction> b() {
        return C43175k.G(new b(null));
    }
}
