package com.avito.android.user_adverts.root_screen.adverts_host;

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
import kotlinx.coroutines.flow.d2;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectHeaderAction$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1374}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35608s extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313802q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.u f313803r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.h f313804s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50474d f313805t;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.s$a */
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC50474d f313806b;

        public a(InterfaceC50474d interfaceC50474d) {
            this.f313806b = interfaceC50474d;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f313806b.accept((AI0.a) obj);
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
            return new C42801a(2, this.f313806b, com.avito.android.arch.mvi.android.l.class, "accept", "accept(Ljava/lang/Object;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35608s(com.avito.android.user_adverts.root_screen.adverts_host.binder.u uVar, com.avito.android.user_adverts.root_screen.adverts_host.binder.h hVar, InterfaceC50474d interfaceC50474d, Continuation continuation) {
        super(2, continuation);
        this.f313803r = uVar;
        this.f313804s = hVar;
        this.f313805t = interfaceC50474d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35608s(this.f313803r, this.f313804s, this.f313805t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35608s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313802q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.user_adverts.root_screen.adverts_host.binder.u uVar = this.f313803r;
            InterfaceC43160i interfaceC43160iI = C43175k.I(uVar.f312508a, new com.avito.android.user_adverts.root_screen.adverts_host.binder.v(uVar.f312510c.f441371a.f441370b, uVar.f312509b));
            com.avito.android.user_adverts.root_screen.adverts_host.binder.h hVar = this.f313804s;
            d2<com.avito.android.user_adverts.root_screen.adverts_host.host_view.a> d2Var = hVar.f312438c.f441371a.f441370b;
            com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e eVar = hVar.f312436a;
            kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(interfaceC43160iI, C43175k.I(hVar.f312437b, C43175k.N(new com.avito.android.user_adverts.root_screen.adverts_host.binder.j(d2Var, eVar), new com.avito.android.user_adverts.root_screen.adverts_host.binder.k(d2Var, eVar))));
            a aVar = new a(this.f313805t);
            this.f313802q = 1;
            if (mVarN.collect(aVar, this) == coroutine_suspended) {
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
