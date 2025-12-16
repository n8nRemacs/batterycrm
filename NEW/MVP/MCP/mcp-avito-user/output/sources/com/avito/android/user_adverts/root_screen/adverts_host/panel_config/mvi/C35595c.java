package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import II0.a;
import II0.b;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "com/avito/android/user_adverts/root_screen/adverts_host/panel_config/mvi/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.PanelConfigActor$process$$inlined$wrapWithAuthorization$1", f = "PanelConfigActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35595c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super II0.b>, Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313352q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f313353r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f313354s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35593a f313355t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f313356u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a f313357v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35595c(Continuation continuation, C35593a c35593a, C43197r1 c43197r1, Y41.a aVar) {
        super(3, continuation);
        this.f313355t = c35593a;
        this.f313356u = c43197r1;
        this.f313357v = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super II0.b> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
        Y41.a aVar = this.f313357v;
        C35595c c35595c = new C35595c(continuation, this.f313355t, this.f313356u, aVar);
        c35595c.f313353r = interfaceC43172j;
        c35595c.f313354s = bool;
        return c35595c.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object obj2;
        int i12;
        InterfaceC43160i c43210w;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f313352q;
        if (i13 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f313353r;
            if (((Boolean) this.f313354s).booleanValue()) {
                int i14 = C35593a.f313326j;
                C35593a c35593a = this.f313355t;
                c35593a.getClass();
                C43210w c43210w2 = new C43210w(a.C0454a.f8078a);
                C43197r1 c43197r1 = this.f313356u;
                e eVar = new e(c43197r1);
                InterfaceC43160i interfaceC43160iN = C43175k.n(new f(c43197r1), 500L);
                Y41.a aVar = this.f313357v;
                obj2 = coroutine_suspended;
                i12 = 1;
                c43210w = C43175k.N(new C43197r1(new C35594b(c35593a, null), C43175k.Y(C43175k.N(c43210w2, eVar, new C35596d(aVar, interfaceC43160iN), new i(new g(kotlinx.coroutines.rx3.y.a(c35593a.f313327a.getF68171a()))), new j(c35593a.f313334h.g(new C42140a(false, false, 3, null)))), new h(aVar, c35593a, null))), C43175k.Y(C43175k.n(new o(c43197r1), 300L), new p(aVar, c35593a, null)), C43175k.B(new t(aVar, c35593a, null), new s(c43197r1)), C43175k.B(new n(aVar, c35593a, null), C43175k.N(new k(c43197r1), new l(c43197r1), new m(c43197r1))));
            } else {
                obj2 = coroutine_suspended;
                i12 = 1;
                c43210w = new C43210w(b.g.f8095a);
            }
            this.f313352q = i12;
            if (C43175k.u(this, c43210w, interfaceC43172j) == obj2) {
                return obj2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
