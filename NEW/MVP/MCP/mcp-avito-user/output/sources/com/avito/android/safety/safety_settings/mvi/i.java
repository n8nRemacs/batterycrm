package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsActor$process$1", f = "SafetySettingsActor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257764q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257765r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f257766s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.b f257767t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, com.avito.android.safety.safety_settings.mvi.entity.b bVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f257766s = nVar;
        this.f257767t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f257766s, this.f257767t, continuation);
        iVar.f257765r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257764q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f257765r;
            this.f257764q = 1;
            if (n.c(this.f257766s, interfaceC43172j, this.f257767t, this) == coroutine_suspended) {
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
