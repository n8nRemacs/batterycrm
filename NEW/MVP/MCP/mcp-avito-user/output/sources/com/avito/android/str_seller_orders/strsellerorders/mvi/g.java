package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import java.util.Map;
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
import vz0.C49404a;
import yz0.InterfaceC50328b;

/* compiled from: StrSellerOrdersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersActor$process$5", f = "StrSellerOrdersActor.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289912q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289913r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50328b f289914s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f289915t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersState f289916u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, StrSellerOrdersState strSellerOrdersState, Continuation continuation, InterfaceC50328b interfaceC50328b) {
        super(2, continuation);
        this.f289914s = interfaceC50328b;
        this.f289915t = aVar;
        this.f289916u = strSellerOrdersState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f289915t, this.f289916u, continuation, this.f289914s);
        gVar.f289913r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Map<String, SuggestAnalyticsEvent> mapC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289912q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289913r;
            InterfaceC50328b.d dVar = (InterfaceC50328b.d) this.f289914s;
            Prompt prompt = dVar.f443633a.getPrompt();
            C49404a c49404aA = null;
            SuggestAnalyticsEvent suggestAnalyticsEvent = (prompt == null || (mapC = prompt.c()) == null) ? null : mapC.get("approve");
            if (suggestAnalyticsEvent != null) {
                C49404a.f441068c.getClass();
                c49404aA = C49404a.C12801a.a(suggestAnalyticsEvent);
            }
            a aVar = this.f289915t;
            if (c49404aA != null) {
                aVar.f289829c.c(c49404aA);
            }
            ButtonAction buttonAction = dVar.f443633a;
            StrSellerOrdersState strSellerOrdersState = this.f289916u;
            StrSellerOrdersDialogData strSellerOrdersDialogData = strSellerOrdersState.f289891k;
            int i13 = a.f289826f;
            aVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new b(buttonAction, aVar, strSellerOrdersDialogData, strSellerOrdersState.f289888h, null));
            this.f289912q = 1;
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
