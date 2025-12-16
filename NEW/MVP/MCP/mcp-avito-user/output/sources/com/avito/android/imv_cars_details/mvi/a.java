package com.avito.android.imv_cars_details.mvi;

import Y41.p;
import com.avito.android.imv_cars_details.mvi.entity.ImvCarsDetailsInternalAction;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsParams;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImvCarsDetailsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_cars_details.mvi.ImvCarsDetailsActor$loadImvCarsDetails$1", f = "ImvCarsDetailsActor.kt", i = {0, 1, 2}, l = {72, 74, 79, 83, 93}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ImvCarsDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f169970q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f169971r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ImvCarsDetailsParams f169972s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f169973t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ImvCarsDetailsParams imvCarsDetailsParams, e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f169972s = imvCarsDetailsParams;
        this.f169973t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f169972s, this.f169973t, continuation);
        aVar.f169971r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ImvCarsDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.imv_cars_details.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
