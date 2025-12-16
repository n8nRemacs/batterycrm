package com.avito.android.cpt.mass_activation.domain;

import Qr.InterfaceC14925a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.mass_activation.di.q;
import com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction;
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

/* compiled from: GetCptMassActivationUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/domain/a;", "", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String[] f126566a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14925a f126567b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f126568c;

    /* compiled from: GetCptMassActivationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpt.mass_activation.domain.GetCptMassActivationUseCase$invoke$1", f = "GetCptMassActivationUseCase.kt", i = {0, 1}, l = {20, 23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.cpt.mass_activation.domain.a$a, reason: collision with other inner class name */
    public static final class C3767a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f126569q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f126570r;

        public C3767a(Continuation<? super C3767a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C3767a c3767a = a.this.new C3767a(continuation);
            c3767a.f126570r = obj;
            return c3767a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3767a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f126569q
                r2 = 1
                r3 = 4
                r4 = 3
                r5 = 2
                if (r1 == 0) goto L32
                if (r1 == r2) goto L2a
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                kotlin.C42729a0.b(r11)
                goto Lb3
            L22:
                java.lang.Object r1 = r10.f126570r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L72
            L2a:
                java.lang.Object r1 = r10.f126570r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L4a
            L32:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f126570r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction$Loading r1 = new com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction$Loading
                r1.<init>()
                r10.f126570r = r11
                r10.f126569q = r2
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r11
            L4a:
                com.avito.android.cpt.mass_activation.domain.a r11 = com.avito.android.cpt.mass_activation.domain.a.this
                java.lang.String[] r2 = r11.f126566a
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r7 = r2.length
                r8 = 0
            L55:
                if (r8 >= r7) goto L65
                r9 = r2[r8]
                java.lang.Long r9 = kotlin.text.C43066x.z0(r9)
                if (r9 == 0) goto L62
                r6.add(r9)
            L62:
                int r8 = r8 + 1
                goto L55
            L65:
                r10.f126570r = r1
                r10.f126569q = r5
                Qr.a r11 = r11.f126567b
                java.lang.Object r11 = r11.b(r6, r10)
                if (r11 != r0) goto L72
                return r0
            L72:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r2 == 0) goto L91
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                Rr.g r11 = (Rr.g) r11
                com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction$Content r2 = new com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction$Content
                r2.<init>(r11)
                r10.f126570r = r5
                r10.f126569q = r4
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lb3
                return r0
            L91:
                boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lb6
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r2 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.ApiException r11 = com.avito.android.util.C35936s.a(r2, r11)
                com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction$Error r2 = new com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction$Error
                r2.<init>(r11)
                r10.f126570r = r5
                r10.f126569q = r3
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lb3
                return r0
            Lb3:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            Lb6:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpt.mass_activation.domain.a.C3767a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@q @k String[] strArr, @k InterfaceC14925a interfaceC14925a, @k R0 r02) {
        this.f126566a = strArr;
        this.f126567b = interfaceC14925a;
        this.f126568c = r02;
    }

    @k
    public final InterfaceC43160i<CptMassActivationInternalAction> a() {
        return C43175k.I(this.f126568c.a(), C43175k.G(new C3767a(null)));
    }
}
