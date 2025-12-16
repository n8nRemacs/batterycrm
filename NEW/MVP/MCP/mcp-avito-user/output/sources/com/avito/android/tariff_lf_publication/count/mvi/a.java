package com.avito.android.tariff_lf_publication.count.mvi;

import MD0.a;
import Y41.p;
import com.avito.android.tariff_lf_publication.count.mvi.entity.TariffLfPublicationCountInternalAction;
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

/* compiled from: TariffLfPublicationCountActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff_lf_publication.count.mvi.TariffLfPublicationCountActor$process$2", f = "TariffLfPublicationCountActor.kt", i = {0}, l = {64, 66}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super TariffLfPublicationCountInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f300813q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f300814r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MD0.a f300815s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.tariff_lf_publication.count.ui.items.option.c f300816t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f300817u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MD0.a aVar, com.avito.android.tariff_lf_publication.count.ui.items.option.c cVar, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f300815s = aVar;
        this.f300816t = cVar;
        this.f300817u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f300815s, this.f300816t, this.f300817u, continuation);
        aVar.f300814r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TariffLfPublicationCountInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f300813q;
        com.avito.android.tariff_lf_publication.count.ui.items.option.c cVar = this.f300816t;
        MD0.a aVar = this.f300815s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f300814r;
            TariffLfPublicationCountInternalAction.ChangeCount changeCount = new TariffLfPublicationCountInternalAction.ChangeCount(((a.b) aVar).f10458a, cVar != null ? cVar.f300862g : null);
            this.f300814r = interfaceC43172j;
            this.f300813q = 1;
            if (interfaceC43172j.emit(changeCount, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f300814r;
            C42729a0.b(obj);
        }
        if ((cVar != null ? cVar.f300862g : null) == null) {
            InterfaceC43160i<TariffLfPublicationCountInternalAction> interfaceC43160iA = this.f300817u.f300819b.a(((a.b) aVar).f10458a);
            this.f300814r = null;
            this.f300813q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
