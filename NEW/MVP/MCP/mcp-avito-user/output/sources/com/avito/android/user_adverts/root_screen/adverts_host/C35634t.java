package com.avito.android.user_adverts.root_screen.adverts_host;

import DI0.b;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
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
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectHostEvent$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1361}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35634t extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314144q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.q f314145r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.a f314146s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f314147t;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.t$a */
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f314148b;

        public a(UserAdvertsHostFragment userAdvertsHostFragment) {
            this.f314148b = userAdvertsHostFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            DI0.b bVar = (DI0.b) obj;
            UserAdvertsHostFragment userAdvertsHostFragment = this.f314148b;
            if (bVar instanceof b.a) {
                UserAdvertsHostFragment.G5(userAdvertsHostFragment, ((b.a) bVar).f3146a);
            } else if (bVar instanceof b.C0166b) {
                userAdvertsHostFragment.f312325i1.b(G0.f406611a);
            } else if (bVar instanceof b.c) {
                UserAdvertsHostFragment.G5(userAdvertsHostFragment, new AdvertPublicationLink.Public(null, null, false, null, false, null, null, null, null, null, 1023, null));
            } else if (bVar instanceof b.d) {
                userAdvertsHostFragment.I5(((b.d) bVar).f3149a);
            } else if (bVar instanceof b.e) {
                userAdvertsHostFragment.f312326j1.b(G0.f406611a);
            } else if (bVar instanceof b.f) {
                userAdvertsHostFragment.E5();
            }
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
            return new C42801a(2, this.f314148b, DI0.c.class, "handle", "handle(Lcom/avito/android/user_adverts/root_screen/adverts_host/host_handler/HostEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35634t(com.avito.android.user_adverts.root_screen.adverts_host.binder.q qVar, com.avito.android.user_adverts.root_screen.adverts_host.binder.a aVar, UserAdvertsHostFragment userAdvertsHostFragment, Continuation continuation) {
        super(2, continuation);
        this.f314145r = qVar;
        this.f314146s = aVar;
        this.f314147t = userAdvertsHostFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35634t(this.f314145r, this.f314146s, this.f314147t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35634t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314144q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.user_adverts.root_screen.adverts_host.binder.q qVar = this.f314145r;
            InterfaceC43160i interfaceC43160iI = C43175k.I(qVar.f312488a, new com.avito.android.user_adverts.root_screen.adverts_host.binder.r(qVar.f312490c.f441371a.f441370b, qVar.f312489b));
            com.avito.android.user_adverts.root_screen.adverts_host.binder.a aVar = this.f314146s;
            kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(interfaceC43160iI, C43175k.I(aVar.f312404a, new com.avito.android.user_adverts.root_screen.adverts_host.binder.b(aVar.f312406c.f441371a.f441370b, aVar.f312405b)));
            a aVar2 = new a(this.f314147t);
            this.f314144q = 1;
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
