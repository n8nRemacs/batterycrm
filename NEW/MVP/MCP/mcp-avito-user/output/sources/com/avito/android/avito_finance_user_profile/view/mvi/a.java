package com.avito.android.avito_finance_user_profile.view.mvi;

import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mg.InterfaceC44078b;
import pg.C47078d;
import pg.InterfaceC47075a;

/* compiled from: AvitoFinanceBlockActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lpg/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avito_finance_user_profile.view.mvi.AvitoFinanceBlockActor$initialFlow$1", f = "AvitoFinanceBlockActor.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC47075a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98035q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98036r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C47078d> f98037s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y41.a<C47078d> aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f98037s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f98037s, continuation);
        aVar.f98036r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC47075a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98035q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f98036r;
            Y41.a<C47078d> aVar = this.f98037s;
            InterfaceC44078b interfaceC44078b = aVar.invoke().f428728a;
            if (!(interfaceC44078b instanceof InterfaceC44078b.a) && (interfaceC44078b instanceof InterfaceC44078b.C11835b) && (aVar.invoke().f428729b instanceof C47078d.a.C12285d)) {
                InterfaceC47075a.d dVar = InterfaceC47075a.d.f428719a;
                this.f98035q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
