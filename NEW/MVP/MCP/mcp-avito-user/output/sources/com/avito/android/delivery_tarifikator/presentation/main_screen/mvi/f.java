package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import Tv.InterfaceC15412c;
import com.avito.android.delivery_tarifikator.domain.D;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TarifikatorMainActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainActor$process$1", f = "TarifikatorMainActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TarifikatorMainInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f135663q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15412c f135664r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, InterfaceC15412c interfaceC15412c, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f135663q = bVar;
        this.f135664r = interfaceC15412c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f135663q, this.f135664r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TarifikatorMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b bVar = this.f135663q;
        D d12 = bVar.f135616d;
        InterfaceC15412c.r rVar = (InterfaceC15412c.r) this.f135664r;
        Ov.k kVarC = d12.c(rVar.f16005a);
        if (kVarC == null) {
            return G0.f406611a;
        }
        bVar.f135615c.h(kVarC, rVar.f16006b);
        return G0.f406611a;
    }
}
