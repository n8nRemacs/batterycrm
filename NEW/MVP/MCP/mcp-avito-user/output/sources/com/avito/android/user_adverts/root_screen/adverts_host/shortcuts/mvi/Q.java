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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processShortcutChanges$$inlined$flatMapLatest$1", f = "ShortcutsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class Q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ShortcutsInternalAction>, TI0.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313937q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f313938r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f313939s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35609a f313940t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f313941u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Y41.a aVar, C35609a c35609a, Continuation continuation) {
        super(3, continuation);
        this.f313940t = c35609a;
        this.f313941u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ShortcutsInternalAction> interfaceC43172j, TI0.a aVar, Continuation<? super G0> continuation) {
        Q q12 = new Q(this.f313941u, this.f313940t, continuation);
        q12.f313938r = interfaceC43172j;
        q12.f313939s = aVar;
        return q12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313937q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f313938r;
            InterfaceC43160i<ShortcutsInternalAction> interfaceC43160iB = this.f313940t.b((TI0.a) this.f313939s, (TI0.c) this.f313941u.invoke());
            this.f313937q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
