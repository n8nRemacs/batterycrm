package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import TI0.a;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTI0/a$d;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "<anonymous>", "(LTI0/a$d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$process$2$1", f = "ShortcutsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35613e extends SuspendLambda implements Y41.p<a.d, Continuation<? super InterfaceC43160i<? extends ShortcutsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f314020q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35609a f314021r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<TI0.c> f314022s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35613e(Y41.a aVar, C35609a c35609a, Continuation continuation) {
        super(2, continuation);
        this.f314021r = c35609a;
        this.f314022s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35613e c35613e = new C35613e(this.f314022s, this.f314021r, continuation);
        c35613e.f314020q = obj;
        return c35613e;
    }

    @Override // Y41.p
    public final Object invoke(a.d dVar, Continuation<? super InterfaceC43160i<? extends ShortcutsInternalAction>> continuation) {
        return ((C35613e) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f314021r.b((a.d) this.f314020q, this.f314022s.invoke());
    }
}
