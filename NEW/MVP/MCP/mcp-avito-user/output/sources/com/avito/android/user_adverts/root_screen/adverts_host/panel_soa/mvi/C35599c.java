package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.a;
import MI0.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e2;

/* compiled from: PanelSoaActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMI0/b;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(LMI0/b;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$postProcessLoadingChanges$1", f = "PanelSoaActor.kt", i = {}, l = {290, 295}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35599c extends SuspendLambda implements Y41.p<MI0.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313542q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f313543r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35597a f313544s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35599c(C35597a c35597a, Continuation<? super C35599c> continuation) {
        super(2, continuation);
        this.f313544s = c35597a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35599c c35599c = new C35599c(this.f313544s, continuation);
        c35599c.f313543r = obj;
        return c35599c;
    }

    @Override // Y41.p
    public final Object invoke(MI0.b bVar, Continuation<? super G0> continuation) {
        return ((C35599c) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313542q;
        C35597a c35597a = this.f313544s;
        if (i12 == 0) {
            C42729a0.b(obj);
            MI0.b bVar = (MI0.b) this.f313543r;
            if (bVar instanceof b.l) {
                e2 e2Var = c35597a.f313523i;
                a.b bVar2 = a.b.f10550a;
                this.f313542q = 1;
                if (e2Var.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c35597a.f313520f.c(new pI0.g());
            } else if (bVar instanceof b.C0671b) {
                e2 e2Var2 = c35597a.f313523i;
                a.b bVar3 = a.b.f10550a;
                this.f313542q = 2;
                if (e2Var2.emit(bVar3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c35597a.f313520f.c(new pI0.g());
            }
        } else if (i12 == 1) {
            C42729a0.b(obj);
            c35597a.f313520f.c(new pI0.g());
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            c35597a.f313520f.c(new pI0.g());
        }
        return G0.f406611a;
    }
}
