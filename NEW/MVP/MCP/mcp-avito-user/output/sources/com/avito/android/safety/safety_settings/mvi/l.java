package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import com.avito.android.safety.safety_settings.mvi.entity.b;
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
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsActor$process$6", f = "SafetySettingsActor.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257775q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257776r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.b f257777s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f257778t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, com.avito.android.safety.safety_settings.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f257777s = bVar;
        this.f257778t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f257778t, this.f257777s, continuation);
        lVar.f257776r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257775q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f257776r;
            SafetySettingsInternalAction.CloseAfterLogoutSessionBottomSheet closeAfterLogoutSessionBottomSheet = SafetySettingsInternalAction.CloseAfterLogoutSessionBottomSheet.f257705b;
            this.f257775q = 1;
            if (interfaceC43172j.emit(closeAfterLogoutSessionBottomSheet, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        com.avito.android.safety.safety_settings.mvi.entity.b bVar = this.f257777s;
        b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
        if (cVar != null && (deepLink = cVar.f257752l) != null) {
            b.a.a(this.f257778t.f257782b, deepLink, "safety_Settings", null, 4);
        }
        return G0.f406611a;
    }
}
