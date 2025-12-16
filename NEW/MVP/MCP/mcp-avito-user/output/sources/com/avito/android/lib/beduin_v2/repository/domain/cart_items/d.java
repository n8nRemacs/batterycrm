package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CartItemsRepositoryClientImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.domain.cart_items.CartItemsRepositoryClientImpl$observe$job$1", f = "CartItemsRepositoryClientImpl.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f176551q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f176552r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, YU0.b, G0> f176553s;

    /* compiled from: CartItemsRepositoryClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/model/CartItemInfo;", "pair", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f176554b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.p<String, YU0.b, G0> f176555c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, Y41.p<? super String, ? super YU0.b, G0> pVar) {
            this.f176554b = eVar;
            this.f176555c = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            YU0.b bVar;
            Q q12 = (Q) obj;
            CartItemInfo cartItemInfo = (CartItemInfo) q12.f406620c;
            if (cartItemInfo != null) {
                this.f176554b.getClass();
                bVar = new YU0.b(cartItemInfo.f176568b, cartItemInfo.f176569c);
            } else {
                bVar = null;
            }
            this.f176555c.invoke(q12.f406619b, bVar);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, Y41.p<? super String, ? super YU0.b, G0> pVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f176552r = eVar;
        this.f176553s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f176552r, this.f176553s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f176551q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e eVar = this.f176552r;
            InterfaceC43160i<Q<String, CartItemInfo>> interfaceC43160iA = eVar.f176556a.a();
            a aVar = new a(eVar, this.f176553s);
            this.f176551q = 1;
            if (interfaceC43160iA.collect(aVar, this) == coroutine_suspended) {
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
