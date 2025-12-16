package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenArgument;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nJ.v;

/* compiled from: IacFinishedFeedbackScreenActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.IacFinishedFeedbackScreenActor$sendFeedbackAndCloseScreen$1", f = "IacFinishedFeedbackScreenActor.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super IacFinishedFeedbackScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166672q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166673r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f166674s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f166675t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFeedbackScreenArgument f166676u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f166677v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f166678w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f166679x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Integer num, c cVar, IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument, String str, String str2, boolean z12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f166674s = num;
        this.f166675t = cVar;
        this.f166676u = iacFinishedFeedbackScreenArgument;
        this.f166677v = str;
        this.f166678w = str2;
        this.f166679x = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f166674s, this.f166675t, this.f166676u, this.f166677v, this.f166678w, this.f166679x, continuation);
        bVar.f166673r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacFinishedFeedbackScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166672q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f166673r;
            Integer num = this.f166674s;
            if (num == null || !new kotlin.ranges.l(0, 4, 1).h(num.intValue())) {
                return G0.f406611a;
            }
            InterfaceC28373a interfaceC28373a = this.f166675t.f166680a;
            IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument = this.f166676u;
            String callId = iacFinishedFeedbackScreenArgument.getCallId();
            IacCallDirection direction = iacFinishedFeedbackScreenArgument.getDirection();
            int iIntValue = num.intValue();
            String itemId = iacFinishedFeedbackScreenArgument.getItemId();
            String str = this.f166678w;
            if (str.length() <= 0) {
                str = null;
            }
            String str2 = str;
            interfaceC28373a.c(new v(callId, direction, iIntValue, itemId, this.f166677v, str2, iacFinishedFeedbackScreenArgument.getScenario(), iacFinishedFeedbackScreenArgument.isVideo()));
            IacFinishedFeedbackScreenInternalAction.SendCloseScreenEvent sendCloseScreenEvent = new IacFinishedFeedbackScreenInternalAction.SendCloseScreenEvent(this.f166679x);
            this.f166672q = 1;
            if (interfaceC43172j.emit(sendCloseScreenEvent, this) == coroutine_suspended) {
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
