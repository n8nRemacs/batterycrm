package com.avito.android.str_seller_orders.orders.mvi;

import Y41.p;
import com.avito.android.str_seller_orders.orders.StrOrdersOpenParams;
import com.avito.android.str_seller_orders.orders.mvi.entity.StrOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Iterator;
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
import lz0.C43851a;

/* compiled from: StrOrdersBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.b<StrOrdersInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final StrOrdersOpenParams f288881a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f288882b;

    /* compiled from: StrOrdersBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.orders.mvi.StrOrdersBootstrap$produce$1", f = "StrOrdersBootstrap.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super StrOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f288883q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f288884r;

        /* compiled from: StrOrdersBootstrap.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_seller_orders.orders.mvi.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C8694a {
            static {
                int[] iArr = new int[StrSellerOrdersIntentFactory.InitialTab.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    StrSellerOrdersIntentFactory.InitialTab initialTab = StrSellerOrdersIntentFactory.InitialTab.f289693b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f288884r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f288883q;
            d dVar = d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f288884r;
                if (!dVar.f288882b) {
                    int iOrdinal = dVar.f288881a.f288838b.ordinal();
                    if (iOrdinal == 0) {
                        str = "tab_seller_shortcut";
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "tab_buyer_shortcut";
                    }
                    com.avito.android.str_seller_orders.orders.a.f288840a.getClass();
                    Iterator<C43851a> it = com.avito.android.str_seller_orders.orders.a.f288841b.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i13 = -1;
                            break;
                        }
                        if (it.next().f414255b.equals(str)) {
                            break;
                        }
                        i13++;
                    }
                    com.avito.android.str_seller_orders.orders.a.f288840a.getClass();
                    StrOrdersInternalAction.ShowContent showContent = new StrOrdersInternalAction.ShowContent(com.avito.android.str_seller_orders.orders.a.f288841b, i13);
                    this.f288883q = 1;
                    if (interfaceC43172j.emit(showContent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            dVar.f288882b = true;
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k StrOrdersOpenParams strOrdersOpenParams) {
        this.f288881a = strOrdersOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrOrdersInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
