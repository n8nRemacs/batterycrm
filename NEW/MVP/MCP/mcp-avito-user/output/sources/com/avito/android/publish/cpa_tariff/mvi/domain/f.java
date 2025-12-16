package com.avito.android.publish.cpa_tariff.mvi.domain;

import Kd0.AbstractC14304b;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import dl0.InterfaceC39749a;
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

/* compiled from: CpaTariffGetTariffInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/mvi/domain/f;", "Lcom/avito/android/publish/cpa_tariff/mvi/domain/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f232466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232467b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC39749a f232468c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC33535v f232469d;

    /* compiled from: CpaTariffGetTariffInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKd0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.cpa_tariff.mvi.domain.CpaTariffGetTariffInteractorImpl$getCpaTariff$1", f = "CpaTariffGetTariffInteractor.kt", i = {2, 3}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30, 32, 34, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC14304b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f232470q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f232471r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f232473t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f232474u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f232473t = str;
            this.f232474u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f232473t, this.f232474u, continuation);
            aVar.f232471r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AbstractC14304b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
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
                int r1 = r7.f232470q
                java.lang.String r2 = r7.f232474u
                java.lang.String r3 = r7.f232473t
                com.avito.android.publish.cpa_tariff.mvi.domain.f r4 = com.avito.android.publish.cpa_tariff.mvi.domain.f.this
                switch(r1) {
                    case 0: goto L2c;
                    case 1: goto L27;
                    case 2: goto L27;
                    case 3: goto L1f;
                    case 4: goto L17;
                    case 5: goto L27;
                    case 6: goto L27;
                    default: goto Lf;
                }
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                java.lang.Object r1 = r7.f232471r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L83
            L1f:
                java.lang.Object r1 = r7.f232471r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L69
            L27:
                kotlin.C42729a0.b(r8)
                goto Lc5
            L2c:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f232471r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                r4.getClass()
                int r1 = r3.length()
                if (r1 != 0) goto L48
                Kd0.b$e r1 = Kd0.AbstractC14304b.e.f9549a
                r2 = 1
                r7.f232470q = r2
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto Lc5
                return r0
            L48:
                int r1 = r2.length()
                if (r1 != 0) goto L5a
                Kd0.b$f r1 = Kd0.AbstractC14304b.f.f9550a
                r2 = 2
                r7.f232470q = r2
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto Lc5
                return r0
            L5a:
                Kd0.b$d r1 = Kd0.AbstractC14304b.d.f9548a
                r7.f232471r = r8
                r5 = 3
                r7.f232470q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L68
                return r0
            L68:
                r1 = r8
            L69:
                com.avito.android.publish.analytics.v r8 = r4.f232469d
                r8.e()
                int r8 = r4.f232467b
                long r5 = (long) r8
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
                r7.f232471r = r1
                r5 = 4
                r7.f232470q = r5
                dl0.a r4 = r4.f232468c
                java.lang.Object r8 = r4.f(r8, r3, r2, r7)
                if (r8 != r0) goto L83
                return r0
            L83:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r3 = 0
                if (r2 == 0) goto La0
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                hl0.a r8 = (hl0.C40957a) r8
                Kd0.b$b r8 = Kd0.AbstractC14304b.C0582b.f9545a
                r7.f232471r = r3
                r2 = 5
                r7.f232470q = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto Lc5
                return r0
            La0:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc8
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r2 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r2, r8)
                Kd0.b$g r2 = new Kd0.b$g
                com.avito.android.remote.error.ApiError r8 = r8.f318522b
                r2.<init>(r8)
                r7.f232471r = r3
                r8 = 6
                r7.f232470q = r8
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto Lc5
                return r0
            Lc5:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lc8:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.cpa_tariff.mvi.domain.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@k R0 r02, int i12, @k InterfaceC39749a interfaceC39749a, @k InterfaceC33535v interfaceC33535v) {
        this.f232466a = r02;
        this.f232467b = i12;
        this.f232468c = interfaceC39749a;
        this.f232469d = interfaceC33535v;
    }

    @Override // com.avito.android.publish.cpa_tariff.mvi.domain.e
    @k
    public final InterfaceC43160i<AbstractC14304b> a(@k String str, @k String str2) {
        return C43175k.I(this.f232466a.a(), C43175k.G(new a(str, str2, null)));
    }
}
