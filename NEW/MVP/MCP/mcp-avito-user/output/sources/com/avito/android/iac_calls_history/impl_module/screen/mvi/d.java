package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import Y41.p;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CallsHistoryScreenActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.mvi.CallsHistoryScreenActor$process$2", f = "CallsHistoryScreenActor.kt", i = {0, 0, 2, 2, 3, 3, 5, 5, 7, 7, 10, 12}, l = {41, 42, 48, 49, 50, 55, 56, 66, 67, 80, 85, 86, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 91}, m = "invokeSuspend", n = {"$this$flow", "loadingId", "$this$flow", "loadingId", "$this$flow", "loadingId", "$this$flow", "loadingId", "$this$flow", "loadingId", "$this$flow", "$this$flow"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "L$0"})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super CallsHistoryScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f164803q;

    /* renamed from: r, reason: collision with root package name */
    public int f164804r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f164805s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a f164806t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f164807u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164808v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a aVar, a aVar2, CallsHistoryScreenState callsHistoryScreenState, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f164806t = aVar;
        this.f164807u = aVar2;
        this.f164808v = callsHistoryScreenState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f164806t, this.f164807u, this.f164808v, continuation);
        dVar.f164805s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CallsHistoryScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0269 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_calls_history.impl_module.screen.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
