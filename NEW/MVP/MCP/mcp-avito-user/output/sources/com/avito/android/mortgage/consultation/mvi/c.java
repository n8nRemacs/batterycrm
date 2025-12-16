package com.avito.android.mortgage.consultation.mvi;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.consultation.model.ConsultationArguments;
import com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageConsultationBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.b<MortgageConsultationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConsultationArguments f198600a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.consultation.domain.c f198601b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UZ.a f198602c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f198603d;

    /* compiled from: MortgageConsultationBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.consultation.mvi.MortgageConsultationBootstrap$produce$1", f = "MortgageConsultationBootstrap.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super MortgageConsultationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198604q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f198605r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f198605r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MortgageConsultationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f198604q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f198605r;
                c cVar = c.this;
                if (cVar.f198603d) {
                    return G0.f406611a;
                }
                cVar.f198603d = true;
                ConsultationArguments consultationArguments = cVar.f198600a;
                cVar.f198602c.c(consultationArguments.f198590b, consultationArguments.f198592d);
                InterfaceC43160i<MortgageConsultationInternalAction> interfaceC43160iA = cVar.f198601b.a();
                this.f198604q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k ConsultationArguments consultationArguments, @Y61.k com.avito.android.mortgage.consultation.domain.c cVar, @Y61.k UZ.a aVar) {
        this.f198600a = consultationArguments;
        this.f198601b = cVar;
        this.f198602c = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MortgageConsultationInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
