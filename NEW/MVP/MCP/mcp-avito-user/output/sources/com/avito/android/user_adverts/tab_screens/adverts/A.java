package com.avito.android.user_adverts.tab_screens.adverts;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import fJ0.InterfaceC40302b;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import l70.InterfaceC43570a;
import nE.C44240b;

/* compiled from: UserAdvertsListMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectViewModelEvents$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {672}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class A extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314816q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f314817r;

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f314818b;

        public a(UserAdvertsListMviFragment userAdvertsListMviFragment) {
            this.f314818b = userAdvertsListMviFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC40302b interfaceC40302b = (InterfaceC40302b) obj;
            UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f314818b;
            if (!(interfaceC40302b instanceof InterfaceC40302b.a)) {
                if (interfaceC40302b instanceof InterfaceC40302b.C11144b) {
                    if (((InterfaceC40302b.C11144b) interfaceC40302b).f395833a) {
                        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, userAdvertsListMviFragment, com.avito.android.printable_text.b.a(), Collections.singletonList(new c.a.b(userAdvertsListMviFragment.getLayoutInflater().inflate(R.layout.fill_parameters_toast_content, (ViewGroup) null))), null, null, 0, null, 1020);
                    }
                } else if (interfaceC40302b instanceof InterfaceC40302b.d) {
                    userAdvertsListMviFragment.K3();
                    C44240b c44240b = userAdvertsListMviFragment.f314835G0;
                    if ((c44240b != null ? c44240b : null).v().invoke().booleanValue()) {
                        userAdvertsListMviFragment.v5().accept(InterfaceC43570a.c.f413537a);
                    }
                } else if (interfaceC40302b instanceof InterfaceC40302b.c) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    Fragment fragmentRequireParentFragment = userAdvertsListMviFragment.requireParentFragment();
                    InterfaceC40302b.c cVar2 = (InterfaceC40302b.c) interfaceC40302b;
                    PrintableText printableText = cVar2.f395834a;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.c(cVar, fragmentRequireParentFragment, printableText, null, null, f.c.a.a(cVar2.f395835b, cVar2.f395836c), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                }
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
            return new C42801a(2, this.f314818b, UserAdvertsListMviFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListOneTimeEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f314817r = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new A(this.f314817r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((A) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314816q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f314817r;
            InterfaceC43160i<InterfaceC40302b> events = userAdvertsListMviFragment.u5().getEvents();
            a aVar = new a(userAdvertsListMviFragment);
            this.f314816q = 1;
            if (events.collect(aVar, this) == coroutine_suspended) {
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
