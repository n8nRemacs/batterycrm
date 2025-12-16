package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import TI0.a;
import com.avito.android.Z0;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
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
import kotlinx.coroutines.flow.e2;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "com/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/S", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$process$$inlined$wrapWithAuthorization$1", f = "ShortcutsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35611c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ShortcutsInternalAction>, Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314007q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f314008r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f314009s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35609a f314010t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f314011u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a f314012v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f314013w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a f314014x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35611c(Continuation continuation, C35609a c35609a, C43197r1 c43197r1, Y41.a aVar, C43197r1 c43197r12, Y41.a aVar2) {
        super(3, continuation);
        this.f314010t = c35609a;
        this.f314011u = c43197r1;
        this.f314012v = aVar;
        this.f314013w = c43197r12;
        this.f314014x = aVar2;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ShortcutsInternalAction> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
        C35611c c35611c = new C35611c(continuation, this.f314010t, this.f314011u, this.f314012v, this.f314013w, this.f314014x);
        c35611c.f314008r = interfaceC43172j;
        c35611c.f314009s = bool;
        return c35611c.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object obj2;
        InterfaceC43172j interfaceC43172j;
        kotlinx.coroutines.flow.internal.m mVarN;
        Continuation continuation;
        InterfaceC43160i interfaceC43160iW;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314007q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f314008r;
            boolean zBooleanValue = ((Boolean) this.f314009s).booleanValue();
            C35609a c35609a = this.f314010t;
            if (zBooleanValue) {
                int i13 = C35609a.f313967k;
                c35609a.getClass();
                C43210w c43210w = new C43210w(a.b.f15531a);
                C35625q c35625q = new C35625q(new C35621m(kotlinx.coroutines.rx3.y.a(c35609a.f313968a.getF68171a())));
                r rVar = new r(c35609a.f313973f.g(new C42140a(false, false, 3, null)));
                C43197r1 c43197r1 = this.f314011u;
                kotlinx.coroutines.flow.internal.m mVarN2 = C43175k.N(c43210w, c35625q, rVar, new C35622n(c43197r1), new C35623o(c43197r1));
                Y41.a aVar = this.f314012v;
                C43197r1 c43197r12 = new C43197r1(new C35610b(aVar, c35609a, null), C43175k.Y(mVarN2, new C35624p(aVar, c35609a, null)));
                L l12 = new L(c43197r1);
                M m12 = new M(c43197r1);
                e2 e2Var = c35609a.f313977j;
                obj2 = coroutine_suspended;
                kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(C43175k.n(C43175k.N(l12, m12, new N(e2Var), new O(e2Var), new P(e2Var)), 100L), new Q(aVar, c35609a, null));
                InterfaceC43160i interfaceC43160iC = C43175k.C(new C35628u(aVar, c35609a, null), C43175k.N(new C35626s(c43197r1), new C35627t(c43197r1)));
                interfaceC43172j = interfaceC43172j2;
                InterfaceC43160i interfaceC43160iC2 = C43175k.C(new K(aVar, c35609a, null), C43175k.n(C43175k.N(new G(e2Var), new H(e2Var), new I(c43197r1), new J(c43197r1)), 300L));
                kotlinx.coroutines.flow.internal.m mVarN3 = C43175k.N(C43175k.Y(new C35629v(c43197r1), new C35632y(aVar, c35609a, null)), C43175k.Y(C43175k.n(C43175k.N(new C35630w(c43197r1), new C35631x(e2Var)), 300L), new C35633z(aVar, c35609a, null)));
                kotlinx.coroutines.flow.internal.l lVarY2 = C43175k.Y(new E(c43197r1), new F(aVar, c35609a, null));
                Z0 z02 = c35609a.f313974g;
                z02.getClass();
                kotlin.reflect.n<Object> nVar = Z0.f67595D[3];
                if (((Boolean) z02.f67603f.a().invoke()).booleanValue()) {
                    com.avito.android.clientEventBus.a aVar2 = c35609a.f313975h;
                    continuation = null;
                    interfaceC43160iW = C43175k.Y(kotlinx.coroutines.rx3.y.a(aVar2.a().y0(new C35619k(aVar2))), new C35616h(3, null));
                } else {
                    continuation = null;
                    interfaceC43160iW = C43175k.w();
                }
                mVarN = C43175k.N(c43197r12, lVarY, interfaceC43160iC, interfaceC43160iC2, mVarN3, lVarY2, interfaceC43160iW, C43175k.C(new C35612d(aVar, c35609a, continuation), new C35614f(c43197r1)));
            } else {
                obj2 = coroutine_suspended;
                interfaceC43172j = interfaceC43172j2;
                mVarN = C43175k.N(new C43210w(ShortcutsInternalAction.Unauthorized.f314047b), C43175k.C(new C35613e(this.f314014x, c35609a, null), new C35615g(this.f314013w)));
            }
            this.f314007q = 1;
            Object obj3 = obj2;
            if (C43175k.u(this, mVarN, interfaceC43172j) == obj3) {
                return obj3;
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
