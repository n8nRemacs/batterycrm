package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ShortcutsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTI0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "<anonymous>", "(LTI0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processOpenChanges$1", f = "ShortcutsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35628u extends SuspendLambda implements Y41.p<TI0.a, Continuation<? super InterfaceC43160i<? extends ShortcutsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f314108q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35609a f314109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<TI0.c> f314110s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35628u(Y41.a aVar, C35609a c35609a, Continuation continuation) {
        super(2, continuation);
        this.f314109r = c35609a;
        this.f314110s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35628u c35628u = new C35628u(this.f314110s, this.f314109r, continuation);
        c35628u.f314108q = obj;
        return c35628u;
    }

    @Override // Y41.p
    public final Object invoke(TI0.a aVar, Continuation<? super InterfaceC43160i<? extends ShortcutsInternalAction>> continuation) {
        return ((C35628u) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f314109r.b((TI0.a) this.f314108q, this.f314110s.invoke());
    }
}
