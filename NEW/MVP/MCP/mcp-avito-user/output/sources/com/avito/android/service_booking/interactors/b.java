package com.avito.android.service_booking.interactors;

import Gt0.InterfaceC13916a;
import It0.C14157a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.P2;
import com.huawei.hms.adapter.internal.AvailableCode;
import h31.e;
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

/* compiled from: SbVerifyPhoneLinkInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/interactors/b;", "Lcom/avito/android/service_booking/interactors/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends com.avito.android.service_booking.interactors.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC13916a> f274291a;

    /* compiled from: SbVerifyPhoneLinkInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "LIt0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking.interactors.SbVerifyPhoneLinkInteractorImpl$verifyPhone$1", f = "SbVerifyPhoneLinkInteractor.kt", i = {0, 1}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 31}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super P2<? super C14157a>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f274292q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f274293r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f274295t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f274295t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f274295t, continuation);
            aVar.f274293r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super P2<? super C14157a>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f274292q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r6)
                goto L87
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                java.lang.Object r1 = r5.f274293r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L5a
            L26:
                java.lang.Object r1 = r5.f274293r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L43
            L2e:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f274293r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.util.P2$c r1 = com.avito.android.util.P2.c.f318721a
                r5.f274293r = r6
                r5.f274292q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L42
                return r0
            L42:
                r1 = r6
            L43:
                com.avito.android.service_booking.interactors.b r6 = com.avito.android.service_booking.interactors.b.this
                h31.e<Gt0.a> r6 = r6.f274291a
                java.lang.Object r6 = r6.get()
                Gt0.a r6 = (Gt0.InterfaceC13916a) r6
                r5.f274293r = r1
                r5.f274292q = r3
                java.lang.String r3 = r5.f274295t
                java.lang.Object r6 = r6.a(r3, r5)
                if (r6 != r0) goto L5a
                return r0
            L5a:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L6c
                com.avito.android.util.P2$b r3 = new com.avito.android.util.P2$b
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                r3.<init>(r6)
                goto L7b
            L6c:
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L8a
                com.avito.android.util.P2$a r3 = new com.avito.android.util.P2$a
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r6 = r6.getError()
                r3.<init>(r6)
            L7b:
                r6 = 0
                r5.f274293r = r6
                r5.f274292q = r2
                java.lang.Object r6 = r1.emit(r3, r5)
                if (r6 != r0) goto L87
                return r0
            L87:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L8a:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking.interactors.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k e<InterfaceC13916a> eVar) {
        this.f274291a = eVar;
    }

    @Override // com.avito.android.service_booking.interactors.a
    @k
    public final InterfaceC43160i<P2<C14157a>> a(@k String str) {
        return C43175k.G(new a(str, null));
    }
}
