package com.avito.android.delivery_tarifikator.presentation.region_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import Yv.C18330a;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29814j;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29815k;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TarifikatorRegionScreenInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.domain.TarifikatorRegionScreenInteractorImpl$refreshTarifikator$1", f = "TarifikatorRegionScreenInteractor.kt", i = {0}, l = {47, 50, 55}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super TarifikatorRegionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135776q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135777r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f135778s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f135779t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f135778s = cVar;
        this.f135779t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f135778s, this.f135779t, continuation);
        bVar.f135777r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TarifikatorRegionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135776q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f135777r;
            InterfaceC29815k interfaceC29815k = this.f135778s.f135780a;
            this.f135777r = interfaceC43172j;
            this.f135776q = 1;
            obj = interfaceC29815k.a(this);
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
            interfaceC43172j = (InterfaceC43172j) this.f135777r;
            C42729a0.b(obj);
        }
        InterfaceC29814j interfaceC29814j = (InterfaceC29814j) obj;
        if (interfaceC29814j instanceof InterfaceC29814j.a) {
            InterfaceC29814j.a aVar = (InterfaceC29814j.a) interfaceC29814j;
            TarifikatorRegionInternalAction.TermsSavingFailed termsSavingFailed = new TarifikatorRegionInternalAction.TermsSavingFailed(C18330a.a(aVar.f135293a), aVar.f135293a);
            this.f135777r = null;
            this.f135776q = 2;
            if (interfaceC43172j.emit(termsSavingFailed, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (interfaceC29814j instanceof InterfaceC29814j.b) {
            String str = this.f135779t;
            TarifikatorRegionInternalAction.TermsSavingSuccess termsSavingSuccessC = TarifikatorRegionInternalAction.TermsSavingSuccess.c(str != null ? com.avito.android.printable_text.b.f(str) : null);
            this.f135777r = null;
            this.f135776q = 3;
            if (interfaceC43172j.emit(termsSavingSuccessC, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
