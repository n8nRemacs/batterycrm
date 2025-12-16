package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import BI0.a;
import BI0.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBI0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.SearchActor$processTextChange$1", f = "SearchActor.kt", i = {0}, l = {201, 202}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BI0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312932q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f312933r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.k f312934s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35571a f312935t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a.k kVar, C35571a c35571a, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f312934s = kVar;
        this.f312935t = c35571a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f312934s, this.f312935t, continuation);
        sVar.f312933r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BI0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        InterfaceC43160i interfaceC43160iI;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312932q;
        a.k kVar = this.f312934s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f312933r;
            b.j jVar = new b.j(kVar.f1301a);
            this.f312933r = interfaceC43172j;
            this.f312932q = 1;
            if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f312933r;
            C42729a0.b(obj);
        }
        int i13 = C35571a.f312850e;
        C35571a c35571a = this.f312935t;
        c35571a.getClass();
        if (C43066x.K(kVar.f1301a)) {
            interfaceC43160iI = new C43210w(new b.i(C42784z0.f406748b));
        } else {
            interfaceC43160iI = C43175k.I(c35571a.f312852b.a(), C43175k.r(new C43197r1(new r(kVar, c35571a, null), new C43137a0(new q(2, null), new o(C43175k.G(new p(kVar, c35571a, null)))))));
        }
        this.f312933r = null;
        this.f312932q = 2;
        if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
