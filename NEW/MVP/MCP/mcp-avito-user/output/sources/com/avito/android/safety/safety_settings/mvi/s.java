package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsBootstrap$deeplinkHandlerFlow$$inlined$flatMapLatest$1", f = "SafetySettingsBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class s extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SafetySettingsInternalAction>, C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257792q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f257793r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f257794s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f257795t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Continuation continuation, v vVar) {
        super(3, continuation);
        this.f257795t = vVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, C43501a c43501a, Continuation<? super G0> continuation) {
        s sVar = new s(continuation, this.f257795t);
        sVar.f257793r = interfaceC43172j;
        sVar.f257794s = c43501a;
        return sVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
