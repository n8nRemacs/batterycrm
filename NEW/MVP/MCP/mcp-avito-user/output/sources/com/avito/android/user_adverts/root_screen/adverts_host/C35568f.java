package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindHeaderMviView$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35568f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f312646q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312647r;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindHeaderMviView$2$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {771}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.f$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312648q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f312649r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f312649r = userAdvertsHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f312649r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312648q;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAdvertsHostFragment userAdvertsHostFragment = this.f312649r;
                h31.e<com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b> eVar = userAdvertsHostFragment.f312295E0;
                if (eVar == null) {
                    eVar = null;
                }
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar = eVar.get();
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
                if (e0Var == null) {
                    e0Var = null;
                }
                n2<TI0.c> state = e0Var.getState();
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = userAdvertsHostFragment.f312298H0;
                if (f12 == null) {
                    f12 = null;
                }
                n2<BI0.d> state2 = f12.getState();
                com.avito.android.user_adverts.tab_actions.host.j jVar = userAdvertsHostFragment.f312292B0;
                n2<UserAdvertsActionsState> state3 = (jVar != null ? jVar : null).getState();
                this.f312648q = 1;
                if (com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.n.a(bVar, state, state2, state3, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35568f(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super C35568f> continuation) {
        super(2, continuation);
        this.f312647r = userAdvertsHostFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35568f c35568f = new C35568f(this.f312647r, continuation);
        c35568f.f312646q = obj;
        return c35568f;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35568f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f312646q;
        UserAdvertsHostFragment userAdvertsHostFragment = this.f312647r;
        R0 r02 = userAdvertsHostFragment.f312300J0;
        if (r02 == null) {
            r02 = null;
        }
        C43259k.d(t12, r02.c(), null, new a(userAdvertsHostFragment, null), 2);
        return G0.f406611a;
    }
}
