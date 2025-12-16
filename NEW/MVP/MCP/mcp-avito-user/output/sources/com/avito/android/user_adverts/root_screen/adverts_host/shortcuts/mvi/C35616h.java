package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processClientEventBusEvents$$inlined$flatMapLatest$1", f = "ShortcutsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35616h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ShortcutsInternalAction.ShowToastBarForUpdateAdverts>, eH0.g, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314059q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f314060r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f314061s;

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ShortcutsInternalAction.ShowToastBarForUpdateAdverts> interfaceC43172j, eH0.g gVar, Continuation<? super G0> continuation) {
        C35616h c35616h = new C35616h(3, continuation);
        c35616h.f314060r = interfaceC43172j;
        c35616h.f314061s = gVar;
        return c35616h.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314059q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f314060r;
            C43210w c43210w = new C43210w(ShortcutsInternalAction.ShowToastBarForUpdateAdverts.f314042b);
            this.f314059q = 1;
            if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
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
