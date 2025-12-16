package com.avito.android.str_seller_orders.orders_buyer.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_seller_orders.orders_buyer.analytics.StrOrdersBuyerOrderClickEvent;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.StrOrdersBuyerInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pz0.C47173d;
import pz0.InterfaceC47170a;

/* compiled from: StrOrdersBuyerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.orders_buyer.mvi.StrOrdersBuyerActor$process$1", f = "StrOrdersBuyerActor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, 32, 37, 40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super StrOrdersBuyerInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289066q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289067r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47170a f289068s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f289069t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C47173d f289070u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC47170a interfaceC47170a, b bVar, C47173d c47173d, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f289068s = interfaceC47170a;
        this.f289069t = bVar;
        this.f289070u = c47173d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f289068s, this.f289069t, this.f289070u, continuation);
        aVar.f289067r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersBuyerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f289066q) {
            case 0:
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289067r;
                InterfaceC47170a interfaceC47170a = this.f289068s;
                if (interfaceC47170a instanceof InterfaceC47170a.C12299a) {
                    StrOrdersBuyerInternalAction.CloseScreen closeScreen = StrOrdersBuyerInternalAction.CloseScreen.f289085b;
                    this.f289066q = 1;
                    if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    boolean z12 = interfaceC47170a instanceof InterfaceC47170a.f;
                    C47173d c47173d = this.f289070u;
                    b bVar = this.f289069t;
                    if (z12) {
                        com.avito.android.str_seller_orders.orders_buyer.domain.c cVarA = bVar.f289071a.a(c47173d, null);
                        this.f289066q = 2;
                        if (C43175k.u(this, cVarA, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC47170a instanceof InterfaceC47170a.c) {
                        com.avito.android.str_seller_orders.orders_buyer.domain.c cVarA2 = bVar.f289071a.a(c47173d, null);
                        this.f289066q = 3;
                        if (C43175k.u(this, cVarA2, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC47170a instanceof InterfaceC47170a.d) {
                        StrOrdersBuyerOrderClickEvent.FromType[] fromTypeArr = StrOrdersBuyerOrderClickEvent.FromType.f288922b;
                        bVar.f289072b.c(new StrOrdersBuyerOrderClickEvent());
                        DeepLink deepLink = ((InterfaceC47170a.d) interfaceC47170a).f428922a;
                        if (deepLink == null) {
                            return G0.f406611a;
                        }
                        StrOrdersBuyerInternalAction.OpenDeeplink openDeeplink = new StrOrdersBuyerInternalAction.OpenDeeplink(deepLink);
                        this.f289066q = 4;
                        if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC47170a instanceof InterfaceC47170a.b) {
                        DeepLink deepLink2 = ((InterfaceC47170a.b) interfaceC47170a).f428920a;
                        if (deepLink2 == null) {
                            return G0.f406611a;
                        }
                        StrOrdersBuyerInternalAction.OpenDeeplink openDeeplink2 = new StrOrdersBuyerInternalAction.OpenDeeplink(deepLink2);
                        this.f289066q = 5;
                        if (interfaceC43172j.emit(openDeeplink2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC47170a instanceof InterfaceC47170a.e) {
                        com.avito.android.str_seller_orders.orders_buyer.domain.c cVarA3 = bVar.f289071a.a(c47173d, ((InterfaceC47170a.e) interfaceC47170a).f428923a);
                        this.f289066q = 6;
                        if (C43175k.u(this, cVarA3, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C42729a0.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}
