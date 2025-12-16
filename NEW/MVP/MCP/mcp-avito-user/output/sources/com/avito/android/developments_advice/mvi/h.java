package com.avito.android.developments_advice.mvi;

import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import com.avito.android.remote.model.ConsultationFormData;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DevelopmentsAdviceBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_advice/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.b<DevelopmentsAdviceInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_advice.data.a f136168a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ConsultationFormData f136169b;

    /* compiled from: DevelopmentsAdviceBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_advice.mvi.DevelopmentsAdviceBootstrap$produce$1", f = "DevelopmentsAdviceBootstrap.kt", i = {0}, l = {19, 21, 21}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DevelopmentsAdviceInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f136170q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f136171r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f136171r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DevelopmentsAdviceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
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
                int r1 = r7.f136170q
                com.avito.android.developments_advice.mvi.h r2 = com.avito.android.developments_advice.mvi.h.this
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.C42729a0.b(r8)
                goto L66
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r1 = r7.f136171r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L58
            L27:
                java.lang.Object r1 = r7.f136171r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4b
            L2f:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f136171r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.remote.model.ConsultationFormData r8 = r2.f136169b
                if (r8 == 0) goto L4b
                com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction$InitialFormData r6 = new com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction$InitialFormData
                r6.<init>(r8)
                r7.f136171r = r1
                r7.f136170q = r5
                java.lang.Object r8 = r1.emit(r6, r7)
                if (r8 != r0) goto L4b
                return r0
            L4b:
                com.avito.android.developments_advice.data.a r8 = r2.f136168a
                r7.f136171r = r1
                r7.f136170q = r4
                kotlinx.coroutines.flow.i r8 = r8.a()
                if (r8 != r0) goto L58
                return r0
            L58:
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.InterfaceC43160i) r8
                r2 = 0
                r7.f136171r = r2
                r7.f136170q = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto L66
                return r0
            L66:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_advice.mvi.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.developments_advice.data.a aVar, @Y61.l ConsultationFormData consultationFormData) {
        this.f136168a = aVar;
        this.f136169b = consultationFormData;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DevelopmentsAdviceInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    public /* synthetic */ h(com.avito.android.developments_advice.data.a aVar, ConsultationFormData consultationFormData, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : consultationFormData);
    }
}
