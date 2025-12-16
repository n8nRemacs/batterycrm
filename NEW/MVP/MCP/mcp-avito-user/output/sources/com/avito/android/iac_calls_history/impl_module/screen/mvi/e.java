package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import Y41.p;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CallsHistoryScreenActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.mvi.CallsHistoryScreenActor$reloadItems$1", f = "CallsHistoryScreenActor.kt", i = {0}, l = {UpdateStatusCode.DialogButton.CONFIRM, 106}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super CallsHistoryScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f164809q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f164810r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryTabType f164811s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_calls_history.impl_module.screen.mvi.a f164812t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f164813u;

    /* compiled from: CallsHistoryScreenActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CallsHistoryTabType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CallsHistoryTabType callsHistoryTabType = CallsHistoryTabType.f164755b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CallsHistoryTabType callsHistoryTabType, com.avito.android.iac_calls_history.impl_module.screen.mvi.a aVar, long j12, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f164811s = callsHistoryTabType;
        this.f164812t = aVar;
        this.f164813u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f164811s, this.f164812t, this.f164813u, continuation);
        eVar.f164810r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CallsHistoryScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f164809q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f164810r;
            CallsHistoryScreenInternalAction.SetOnlyLoadingItem setOnlyLoadingItem = CallsHistoryScreenInternalAction.SetOnlyLoadingItem.f164821b;
            this.f164810r = interfaceC43172j;
            this.f164809q = 1;
            if (interfaceC43172j.emit(setOnlyLoadingItem, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f164810r;
            C42729a0.b(obj);
        }
        CallsHistoryTabType callsHistoryTabType = this.f164811s;
        int iOrdinal = callsHistoryTabType.ordinal();
        com.avito.android.iac_calls_history.impl_module.screen.mvi.a aVar = this.f164812t;
        if (iOrdinal == 0) {
            aVar.f164789b.b();
        } else if (iOrdinal == 1) {
            aVar.f164789b.d();
        }
        AtomicLong atomicLong = com.avito.android.iac_calls_history.impl_module.screen.mvi.a.f164787d;
        aVar.getClass();
        InterfaceC43160i interfaceC43160iG = C43175k.G(new b(aVar, null, callsHistoryTabType, this.f164813u, null));
        this.f164810r = null;
        this.f164809q = 2;
        if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
