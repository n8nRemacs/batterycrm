package com.avito.android.str_seller_orders.orders.mvi;

import Y41.p;
import com.avito.android.str_seller_orders.orders.analitycs.StrOrdersOpenBuyerTabClickEvent;
import com.avito.android.str_seller_orders.orders.mvi.entity.StrOrdersInternalAction;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lz0.C43851a;
import mz0.InterfaceC44156a;

/* compiled from: StrOrdersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.orders.mvi.StrOrdersActor$process$1", f = "StrOrdersActor.kt", i = {}, l = {23, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super StrOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f288875q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f288876r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44156a f288877s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f288878t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC44156a interfaceC44156a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f288877s = interfaceC44156a;
        this.f288878t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f288877s, this.f288878t, continuation);
        aVar.f288876r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f288875q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f288876r;
            InterfaceC44156a interfaceC44156a = this.f288877s;
            if (interfaceC44156a instanceof InterfaceC44156a.C11850a) {
                StrOrdersInternalAction.CloseScreen closeScreen = StrOrdersInternalAction.CloseScreen.f288887b;
                this.f288875q = 1;
                if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC44156a instanceof InterfaceC44156a.b) {
                com.avito.android.str_seller_orders.orders.a.f288840a.getClass();
                Iterator<C43851a> it = com.avito.android.str_seller_orders.orders.a.f288841b.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (it.next().f414255b.equals("tab_buyer_shortcut")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC44156a.b bVar = (InterfaceC44156a.b) interfaceC44156a;
                if (bVar.f414837a.intValue() == i13) {
                    StrOrdersOpenBuyerTabClickEvent.FromType[] fromTypeArr = StrOrdersOpenBuyerTabClickEvent.FromType.f288843b;
                    this.f288878t.f288879a.c(new StrOrdersOpenBuyerTabClickEvent());
                }
                StrOrdersInternalAction.NewSelectedTab newSelectedTab = new StrOrdersInternalAction.NewSelectedTab(bVar.f414837a.intValue());
                this.f288875q = 2;
                if (interfaceC43172j.emit(newSelectedTab, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
