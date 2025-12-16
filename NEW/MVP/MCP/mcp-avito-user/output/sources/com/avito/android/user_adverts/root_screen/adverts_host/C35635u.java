package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.user_adverts.root_screen.adverts_host.host_view.c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectHostViewEvent$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1391}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35635u extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314149q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.u f314150r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.q f314151s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.e f314152t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.a f314153u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.host_view.j f314154v;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.u$a */
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.host_view.j f314155b;

        public a(com.avito.android.user_adverts.root_screen.adverts_host.host_view.j jVar) {
            this.f314155b = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f314155b.g((com.avito.android.user_adverts.root_screen.adverts_host.host_view.b) obj);
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f314155b, c.a.class, "handle", "handle(Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35635u(com.avito.android.user_adverts.root_screen.adverts_host.binder.u uVar, com.avito.android.user_adverts.root_screen.adverts_host.binder.q qVar, com.avito.android.user_adverts.root_screen.adverts_host.binder.e eVar, com.avito.android.user_adverts.root_screen.adverts_host.binder.a aVar, com.avito.android.user_adverts.root_screen.adverts_host.host_view.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f314150r = uVar;
        this.f314151s = qVar;
        this.f314152t = eVar;
        this.f314153u = aVar;
        this.f314154v = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35635u(this.f314150r, this.f314151s, this.f314152t, this.f314153u, this.f314154v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35635u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314149q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<com.avito.android.user_adverts.root_screen.adverts_host.host_view.b> interfaceC43160iA = this.f314150r.a();
            com.avito.android.user_adverts.root_screen.adverts_host.binder.q qVar = this.f314151s;
            InterfaceC43160i interfaceC43160iI = C43175k.I(qVar.f312488a, new com.avito.android.user_adverts.root_screen.adverts_host.binder.s(qVar.f312490c.f441371a.f441370b, qVar.f312489b));
            com.avito.android.user_adverts.root_screen.adverts_host.binder.e eVar = this.f314152t;
            InterfaceC43160i interfaceC43160iI2 = C43175k.I(eVar.f312425b, new com.avito.android.user_adverts.root_screen.adverts_host.binder.f(eVar.f312426c.f441371a.f441370b, eVar.f312424a));
            com.avito.android.user_adverts.root_screen.adverts_host.binder.a aVar = this.f314153u;
            kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(interfaceC43160iA, interfaceC43160iI, interfaceC43160iI2, C43175k.I(aVar.f312404a, new com.avito.android.user_adverts.root_screen.adverts_host.binder.c(aVar.f312406c.f441371a.f441370b, aVar.f312405b)));
            a aVar2 = new a(this.f314154v);
            this.f314149q = 1;
            if (mVarN.collect(aVar2, this) == coroutine_suspended) {
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
