package com.avito.android.publish.price_list.mvi;

import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectPriceListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.price_list.mvi.SelectPriceListActor$getPriceListValidationInternalActionFlow$1", f = "SelectPriceListActor.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectPriceListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f238769q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f238770r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f238771s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.price_list.mvi.entity.f f238772t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, com.avito.android.publish.price_list.mvi.entity.f fVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f238771s = hVar;
        this.f238772t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f238771s, this.f238772t, continuation);
        aVar.f238770r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectPriceListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f238769q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f238770r;
            h hVar = this.f238771s;
            InterfaceC43160i interfaceC43160iG = C43175k.G(new e(hVar.f238872b.a(hVar.f238873c.getF238532a()), null, hVar, this.f238772t));
            this.f238770r = interfaceC43160iG;
            this.f238769q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
