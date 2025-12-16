package com.avito.android.wallet.history.mvi.components;

import GO0.a;
import GO0.b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.wallet.history.analytics.WalletHistorySensitiveDataEvent;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryState;
import java.util.Iterator;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletHistoryActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.history.mvi.components.WalletHistoryActor$process$3", f = "WalletHistoryActor.kt", i = {}, l = {57, 63, 68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletHistoryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f327580q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f327581r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GO0.a f327582s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WalletHistoryState f327583t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f327584u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GO0.a aVar, WalletHistoryState walletHistoryState, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f327582s = aVar;
        this.f327583t = walletHistoryState;
        this.f327584u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f327582s, this.f327583t, this.f327584u, continuation);
        cVar.f327581r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletHistoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Integer num;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f327580q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f327581r;
            GO0.a aVar = this.f327582s;
            boolean z12 = aVar instanceof a.C0348a;
            WalletHistoryState walletHistoryState = this.f327583t;
            d dVar = this.f327584u;
            if (z12) {
                Iterator<T> it = walletHistoryState.f327664b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((GO0.b) next).getF6486a(), ((a.C0348a) aVar).f6474a)) {
                        break;
                    }
                }
                GO0.b bVar = (GO0.b) next;
                if (bVar instanceof b.d) {
                    b.d dVar2 = (b.d) bVar;
                    DeepLink deepLink = dVar2.f6491f;
                    InterfaceC28373a interfaceC28373a = dVar.f327586b;
                    JO0.a aVar2 = dVar2.f6493h;
                    BO0.a.a(interfaceC28373a, aVar2 != null ? aVar2.getHistoryItemClick() : null);
                    b.c cVar = dVar2.f6494i;
                    if ((cVar != null ? cVar.f6482a : null) != null && (num = cVar.f6483b) != null) {
                        Map<String, Object> map = cVar.f6484c;
                        Integer num2 = cVar.f6482a;
                        dVar.f327586b.c((map == null || map.isEmpty()) ? new com.avito.android.analytics.provider.clickstream.b(num2.intValue(), num.intValue()) : L.f(cVar.f6485d, Boolean.TRUE) ? new WalletHistorySensitiveDataEvent(num2.intValue(), num.intValue(), map) : new ParametrizedClickStreamEvent(num2.intValue(), num.intValue(), cVar.f6484c, null, 8, null));
                    }
                    com.avito.android.deeplink_handler.handler.composite.b.a(dVar.f327587c, deepLink);
                }
            } else if (aVar instanceof a.c) {
                InterfaceC43160i<WalletHistoryInternalAction> interfaceC43160iE = dVar.f327585a.e(false);
                this.f327580q = 1;
                if (C43175k.u(this, interfaceC43160iE, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (aVar instanceof a.d) {
                String str = walletHistoryState.f327665c;
                if (str != null && str.length() != 0 && walletHistoryState.f327668f && !walletHistoryState.f327669g) {
                    InterfaceC43160i<WalletHistoryInternalAction> interfaceC43160iF = dVar.f327585a.f(str);
                    this.f327580q = 2;
                    if (C43175k.u(this, interfaceC43160iF, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (aVar instanceof a.b) {
                InterfaceC43160i<WalletHistoryInternalAction> interfaceC43160iE2 = dVar.f327585a.e(true);
                this.f327580q = 3;
                if (C43175k.u(this, interfaceC43160iE2, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
