package com.avito.android.tariff_lf_publication.count.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff_lf_publication.count.mvi.entity.TariffLfPublicationCountInternalAction;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetTariffLfPublicationCountPriceUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/domain/a;", "", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f300793a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final OD0.a f300794b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f300795c;

    /* compiled from: GetTariffLfPublicationCountPriceUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_lf_publication.count.domain.GetTariffLfPublicationCountPriceUseCase$invoke$1", f = "GetTariffLfPublicationCountPriceUseCase.kt", i = {0}, l = {19, 21, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.tariff_lf_publication.count.domain.a$a, reason: collision with other inner class name */
    public static final class C9202a extends SuspendLambda implements p<InterfaceC43172j<? super TariffLfPublicationCountInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f300796q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f300797r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f300799t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9202a(long j12, Continuation<? super C9202a> continuation) {
            super(2, continuation);
            this.f300799t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9202a c9202a = a.this.new C9202a(this.f300799t, continuation);
            c9202a.f300797r = obj;
            return c9202a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TariffLfPublicationCountInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9202a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f300796q;
            long j12 = this.f300799t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f300797r;
                a aVar = a.this;
                OD0.a aVar2 = aVar.f300794b;
                this.f300797r = interfaceC43172j;
                this.f300796q = 1;
                obj = aVar2.e(aVar.f300793a, j12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f300797r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                QD0.a aVar3 = (QD0.a) ((TypedResult.Success) typedResult).getResult();
                TariffLfPublicationCountInternalAction.UpdatePriceInfo updatePriceInfo = new TariffLfPublicationCountInternalAction.UpdatePriceInfo(j12, aVar3.getPriceInfo(), aVar3.getDescription());
                this.f300797r = null;
                this.f300796q = 2;
                if (interfaceC43172j.emit(updatePriceInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                TariffLfPublicationCountInternalAction.OnScreenError onScreenError = new TariffLfPublicationCountInternalAction.OnScreenError(C35936s.a(error.getError(), error.getCause()), j12);
                this.f300797r = null;
                this.f300796q = 3;
                if (interfaceC43172j.emit(onScreenError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@KD0.a @k String str, @k OD0.a aVar, @k R0 r02) {
        this.f300793a = str;
        this.f300794b = aVar;
        this.f300795c = r02;
    }

    @k
    public final InterfaceC43160i<TariffLfPublicationCountInternalAction> a(long j12) {
        return C43175k.I(this.f300795c.a(), C43175k.G(new C9202a(j12, null)));
    }
}
