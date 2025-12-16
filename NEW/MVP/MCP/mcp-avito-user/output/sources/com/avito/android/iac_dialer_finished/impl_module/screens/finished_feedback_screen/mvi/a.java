package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacFinishedFeedbackScreenActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.IacFinishedFeedbackScreenActor$process$1", f = "IacFinishedFeedbackScreenActor.kt", i = {0, 2, 5}, l = {AvailableCode.ERROR_NO_ACTIVITY, 35, 37, 38, 41, 46, 55, 59}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super IacFinishedFeedbackScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166667q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166668r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ WK.a f166669s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f166670t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFeedbackScreenState f166671u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WK.a aVar, c cVar, IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f166669s = aVar;
        this.f166670t = cVar;
        this.f166671u = iacFinishedFeedbackScreenState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f166669s, this.f166670t, this.f166671u, continuation);
        aVar.f166668r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacFinishedFeedbackScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
