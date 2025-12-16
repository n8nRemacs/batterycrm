package com.avito.android.publish.cpa_tariff.mvi.domain;

import Kd0.AbstractC14304b;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.H0;
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

/* compiled from: CpaTariffGetContactsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/mvi/domain/b;", "Lcom/avito/android/publish/cpa_tariff/mvi/domain/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.cpa_tariff.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f232459a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H0 f232460b;

    /* compiled from: CpaTariffGetContactsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKd0/b$c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.cpa_tariff.mvi.domain.CpaTariffGetContactsInteractorImpl$getContactInfo$1", f = "CpaTariffGetContactsInteractor.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC14304b.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f232461q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f232462r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f232462r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AbstractC14304b.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
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
                int r1 = r7.f232461q
                com.avito.android.publish.cpa_tariff.mvi.domain.b r2 = com.avito.android.publish.cpa_tariff.mvi.domain.b.this
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r4) goto L15
                kotlin.C42729a0.b(r8)
                goto Lab
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f232462r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L3a
            L25:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f232462r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.remote.H0 r8 = r2.f232460b
                r7.f232462r = r1
                r7.f232461q = r3
                java.lang.Object r8 = r8.f(r7)
                if (r8 != r0) goto L3a
                return r0
            L3a:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r3 == 0) goto L93
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.remote.model.CpaContactInfoResponse r8 = (com.avito.android.remote.model.CpaContactInfoResponse) r8
                r2.getClass()
                java.util.List r2 = r8.getPhones()
                if (r2 == 0) goto L7e
                int r3 = r2.size()
                java.util.ListIterator r2 = r2.listIterator(r3)
            L5a:
                boolean r3 = r2.hasPrevious()
                if (r3 == 0) goto L6e
                java.lang.Object r3 = r2.previous()
                r6 = r3
                com.avito.android.remote.model.CpaPhone r6 = (com.avito.android.remote.model.CpaPhone) r6
                boolean r6 = r6.isConfirmed()
                if (r6 == 0) goto L5a
                goto L6f
            L6e:
                r3 = r5
            L6f:
                com.avito.android.remote.model.CpaPhone r3 = (com.avito.android.remote.model.CpaPhone) r3
                if (r3 == 0) goto L7e
                java.lang.String r2 = r3.getPhone()
                java.lang.String r3 = "7"
                java.lang.String r2 = kotlin.text.C43066x.U(r3, r2)
                goto L7f
            L7e:
                r2 = r5
            L7f:
                java.lang.String r8 = r8.getName()
                Kd0.b$c r3 = new Kd0.b$c
                r3.<init>(r8, r2)
                r7.f232462r = r5
                r7.f232461q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto Lab
                return r0
            L93:
                boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto Lae
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r0 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.C35936s.a(r0, r8)
                com.avito.android.util.V2 r8 = com.avito.android.util.V2.f318762a
                java.lang.String r0 = "Can't load contact info for CPA tariff screen"
                r8.e(r0, r5)
            Lab:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lae:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.cpa_tariff.mvi.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k R0 r02, @k H0 h02) {
        this.f232459a = r02;
        this.f232460b = h02;
    }

    @Override // com.avito.android.publish.cpa_tariff.mvi.domain.a
    @k
    public final InterfaceC43160i<AbstractC14304b> a() {
        return C43175k.I(this.f232459a.a(), C43175k.G(new a(null)));
    }
}
