package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.a;
import MI0.b;
import iz.C42140a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "com/avito/android/user_adverts/root_screen/adverts_host/panel_soa/mvi/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$process$$inlined$wrapWithAuthorization$1", f = "PanelSoaActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35600d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MI0.b>, Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313545q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f313546r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f313547s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35597a f313548t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f313549u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a f313550v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35600d(Continuation continuation, C35597a c35597a, C43197r1 c43197r1, Y41.a aVar) {
        super(3, continuation);
        this.f313548t = c35597a;
        this.f313549u = c43197r1;
        this.f313550v = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super MI0.b> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
        Y41.a aVar = this.f313550v;
        C35600d c35600d = new C35600d(continuation, this.f313548t, this.f313549u, aVar);
        c35600d.f313546r = interfaceC43172j;
        c35600d.f313547s = bool;
        return c35600d.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i c43210w;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313545q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f313546r;
            boolean zBooleanValue = ((Boolean) this.f313547s).booleanValue();
            C35597a c35597a = this.f313548t;
            if (zBooleanValue) {
                int i13 = C35597a.f313514j;
                c35597a.getClass();
                C43210w c43210w2 = new C43210w(a.C0670a.f10549a);
                C43197r1 c43197r1 = this.f313549u;
                C35602f c35602f = new C35602f(c43197r1);
                InterfaceC43160i interfaceC43160iN = C43175k.n(new C35603g(c43197r1), 500L);
                Y41.a aVar = this.f313550v;
                c43210w = C43175k.N(new C43197r1(new C35599c(c35597a, null), C43175k.Y(C43175k.N(c43210w2, c35602f, new C35601e(aVar, interfaceC43160iN), new k(new C35604h(kotlinx.coroutines.rx3.y.a(c35597a.f313515a.getF68171a()))), new C35605i(c43197r1), new l(c35597a.f313521g.g(new C42140a(false, false, 3, null)))), new C35606j(aVar, c35597a, null))), C43175k.N(C43175k.Y(C43175k.n(new m(c43197r1), 400L), new o(aVar, c35597a, null)), C43175k.Y(new n(c35597a.f313523i), new p(aVar, c35597a, null))), C43175k.B(new t(aVar, c35597a, null), new s(c43197r1)));
            } else {
                int i14 = C35597a.f313514j;
                c35597a.getClass();
                c43210w = new C43210w(b.h.f10566a);
            }
            this.f313545q = 1;
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
