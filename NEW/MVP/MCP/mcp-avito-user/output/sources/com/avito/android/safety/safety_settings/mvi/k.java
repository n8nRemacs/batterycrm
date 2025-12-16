package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsActor$process$5", f = "SafetySettingsActor.kt", i = {}, l = {95, UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257770q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257771r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.a f257772s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f257773t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.safety.safety_settings.mvi.entity.b f257774u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.avito.android.safety.safety_settings.mvi.entity.a aVar, n nVar, com.avito.android.safety.safety_settings.mvi.entity.b bVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f257772s = aVar;
        this.f257773t = nVar;
        this.f257774u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f257772s, this.f257773t, this.f257774u, continuation);
        kVar.f257771r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
