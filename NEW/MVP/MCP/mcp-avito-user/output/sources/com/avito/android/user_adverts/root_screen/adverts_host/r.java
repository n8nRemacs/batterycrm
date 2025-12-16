package com.avito.android.user_adverts.root_screen.adverts_host;

import Ju.InterfaceC14249c;
import TI0.a;
import YI0.a;
import android.os.Bundle;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.service_booking_common.link.onboarding.ServicesSteppedOnboardingLink;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectDeeplinkResult$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1215}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class r extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313799q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f313800r;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f313801b;

        public a(UserAdvertsHostFragment userAdvertsHostFragment) {
            this.f313801b = userAdvertsHostFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Bundle bundle;
            String string;
            C43501a c43501a = (C43501a) obj;
            UserAdvertsHostFragment.a aVar = UserAdvertsHostFragment.f312290o1;
            UserAdvertsHostFragment userAdvertsHostFragment = this.f313801b;
            boolean zF2 = kotlin.jvm.internal.L.f(c43501a.f413260a.f134521b, "user_adverts.single_action_request_key");
            InterfaceC14249c interfaceC14249c = c43501a.f413261b;
            if (zF2 && (bundle = c43501a.f413260a.f134522c) != null && (string = bundle.getString("user_adverts.single_action_request_advert_id")) != null) {
                com.avito.android.user_adverts.tab_actions.host.j jVar = userAdvertsHostFragment.f312292B0;
                (jVar != null ? jVar : null).accept(new a.g(string, interfaceC14249c));
            } else if (interfaceC14249c instanceof AdvertPublicationLink.a) {
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
                if (e0Var == null) {
                    e0Var = null;
                }
                e0Var.accept(new a.h(false, 1, null));
            } else if (interfaceC14249c instanceof ServicesSteppedOnboardingLink.c) {
                userAdvertsHostFragment.F5().p0();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f313800r = userAdvertsHostFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f313800r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313799q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsHostFragment userAdvertsHostFragment = this.f313800r;
            com.avito.android.deeplink_handler.handler.composite.a aVar = userAdvertsHostFragment.f312334w0;
            if (aVar == null) {
                aVar = null;
            }
            InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(aVar.d9());
            a aVar2 = new a(userAdvertsHostFragment);
            this.f313799q = 1;
            if (((AbstractC43168f) interfaceC43160iA).collect(aVar2, this) == coroutine_suspended) {
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
