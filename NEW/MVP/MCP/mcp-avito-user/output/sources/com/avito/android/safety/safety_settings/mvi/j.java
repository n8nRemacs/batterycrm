package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import com.avito.android.safety.safety_settings.mvi.entity.b;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsActor$process$2", f = "SafetySettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.b f257768q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f257769r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, com.avito.android.safety.safety_settings.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f257768q = bVar;
        this.f257769r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f257769r, this.f257768q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<SafetySettingsElement> list;
        Object next;
        DeepLink deepLink;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.safety.safety_settings.mvi.entity.b bVar = this.f257768q;
        b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
        if (cVar != null && (list = cVar.f257742b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof SafetySettingsElement.c) {
                    break;
                }
            }
            if (!(next instanceof SafetySettingsElement.c)) {
                next = null;
            }
            SafetySettingsElement.c cVar2 = (SafetySettingsElement.c) next;
            if (cVar2 != null && (deepLink = cVar2.f257689c) != null) {
                b.a.a(this.f257769r.f257782b, deepLink, "safety_Settings", null, 4);
            }
        }
        return G0.f406611a;
    }
}
