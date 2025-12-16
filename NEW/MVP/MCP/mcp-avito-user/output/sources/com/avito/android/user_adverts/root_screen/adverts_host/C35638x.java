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

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectShortcutsAction$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1347}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35638x extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314175q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.h f314176r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 f314177s;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.x$a */
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 f314178b;

        public a(com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var) {
            this.f314178b = e0Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f314178b.accept((TI0.a) obj);
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
            return new C42801a(2, this.f314178b, com.avito.android.arch.mvi.android.l.class, "accept", "accept(Ljava/lang/Object;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35638x(com.avito.android.user_adverts.root_screen.adverts_host.binder.h hVar, com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.f314176r = hVar;
        this.f314177s = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35638x(this.f314176r, this.f314177s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35638x) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314175q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.user_adverts.root_screen.adverts_host.binder.h hVar = this.f314176r;
            InterfaceC43160i interfaceC43160iI = C43175k.I(hVar.f312437b, new com.avito.android.user_adverts.root_screen.adverts_host.binder.l(hVar.f312438c.f441371a.f441370b, hVar.f312436a));
            a aVar = new a(this.f314177s);
            this.f314175q = 1;
            if (interfaceC43160iI.collect(aVar, this) == coroutine_suspended) {
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
