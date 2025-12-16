package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import II0.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PanelConfigActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LII0/b;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(LII0/b;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.PanelConfigActor$postProcessLoadingChanges$1", f = "PanelConfigActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35594b extends SuspendLambda implements Y41.p<II0.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313350q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35593a f313351r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35594b(C35593a c35593a, Continuation<? super C35594b> continuation) {
        super(2, continuation);
        this.f313351r = c35593a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35594b c35594b = new C35594b(this.f313351r, continuation);
        c35594b.f313350q = obj;
        return c35594b;
    }

    @Override // Y41.p
    public final Object invoke(II0.b bVar, Continuation<? super G0> continuation) {
        return ((C35594b) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        II0.b bVar = (II0.b) this.f313350q;
        if (bVar instanceof b.C0455b) {
            C35593a c35593a = this.f313351r;
            int i12 = C35593a.f313326j;
            c35593a.getClass();
            if (((b.C0455b) bVar).f8088a.f6419f != null && !c35593a.f313335i) {
                c35593a.f313335i = true;
                c35593a.f313333g.c(new pI0.n());
            }
        }
        return G0.f406611a;
    }
}
