package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
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
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersActor$process$4", f = "StrSellerOrdersActor.kt", i = {}, l = {133, 139}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289907q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289908r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50328b f289909s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f289910t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersState f289911u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, StrSellerOrdersState strSellerOrdersState, Continuation continuation, InterfaceC50328b interfaceC50328b) {
        super(2, continuation);
        this.f289909s = interfaceC50328b;
        this.f289910t = aVar;
        this.f289911u = strSellerOrdersState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f289910t, this.f289911u, continuation, this.f289909s);
        fVar.f289908r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C49404a c49404aA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289907q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289908r;
        InterfaceC50328b.i iVar = (InterfaceC50328b.i) this.f289909s;
        SuggestAnalyticsEvent suggestAnalyticsEvent = iVar.f443639a;
        if (suggestAnalyticsEvent != null) {
            C49404a.f441068c.getClass();
            c49404aA = C49404a.C12801a.a(suggestAnalyticsEvent);
        } else {
            c49404aA = null;
        }
        a aVar = this.f289910t;
        if (c49404aA != null) {
            aVar.f289829c.c(c49404aA);
        }
        if (iVar.f443640b.getPrompt() != null) {
            StrSellerOrdersInternalAction.ShowConfirmationBottomSheet showConfirmationBottomSheet = new StrSellerOrdersInternalAction.ShowConfirmationBottomSheet(iVar.f443640b, iVar.f443641c);
            this.f289907q = 1;
            if (interfaceC43172j.emit(showConfirmationBottomSheet, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        ButtonAction buttonAction = iVar.f443640b;
        StrSellerOrdersState strSellerOrdersState = this.f289911u;
        StrSellerOrdersDialogData strSellerOrdersDialogData = strSellerOrdersState.f289891k;
        int i13 = a.f289826f;
        aVar.getClass();
        InterfaceC43160i interfaceC43160iG = C43175k.G(new b(buttonAction, aVar, strSellerOrdersDialogData, strSellerOrdersState.f289888h, null));
        this.f289907q = 2;
        if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
