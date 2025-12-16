package com.avito.android.user_adverts.root_screen.adverts_host;

import TI0.b;
import android.content.res.Resources;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.V;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectShortcutsEvents$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35639y extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314179q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f314180r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f314181s;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTI0/b;", "event", "Lkotlin/G0;", "emit", "(LTI0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.y$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f314182b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f314183c;

        public a(UserAdvertsHostFragment userAdvertsHostFragment, b0 b0Var) {
            this.f314182b = userAdvertsHostFragment;
            this.f314183c = b0Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
            TI0.b bVar = (TI0.b) obj;
            if (!(bVar instanceof b.a)) {
                boolean z12 = bVar instanceof b.C1058b;
                UserAdvertsHostFragment userAdvertsHostFragment = this.f314182b;
                if (z12) {
                    UserAdvertsHostFragment.a aVar = UserAdvertsHostFragment.f312290o1;
                    userAdvertsHostFragment.E5();
                } else if (bVar instanceof b.c) {
                    UserAdvertsHostFragment.a aVar2 = UserAdvertsHostFragment.f312290o1;
                    userAdvertsHostFragment.f312325i1.b(G0.f406611a);
                } else if (bVar instanceof b.d) {
                    UserAdvertsHostFragment.a aVar3 = UserAdvertsHostFragment.f312290o1;
                    UserAdvertsHostFragment.G5(userAdvertsHostFragment, new AdvertPublicationLink.Public(null, null, false, null, false, null, null, null, null, null, 1023, null));
                } else {
                    boolean z13 = bVar instanceof b.e;
                    b0 b0Var = this.f314183c;
                    if (z13) {
                        b0Var.f(((b.e) bVar).f15549a);
                    } else if (bVar instanceof b.f) {
                        int i12 = ((b.f) bVar).f15550a;
                        ViewPager viewPager = b0Var.f312390p;
                        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
                        if (adapter != null && i12 >= 0 && i12 < adapter.c()) {
                            h0 h0Var = (h0) b0Var.f312386l.f(viewPager, i12);
                            b0Var.f312386l.b();
                            h0Var.Z3();
                        }
                    } else if (bVar instanceof b.h) {
                        V.a.a(b0Var, ((b.h) bVar).f15552a, null, 14);
                    } else if (bVar instanceof b.g) {
                        V.a.a(b0Var, ((b.g) bVar).f15551a, null, 6);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35639y(UserAdvertsHostFragment userAdvertsHostFragment, b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.f314180r = userAdvertsHostFragment;
        this.f314181s = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35639y(this.f314180r, this.f314181s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35639y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314179q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsHostFragment userAdvertsHostFragment = this.f314180r;
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
            if (e0Var == null) {
                e0Var = null;
            }
            InterfaceC43160i<TI0.b> events = e0Var.getEvents();
            a aVar = new a(userAdvertsHostFragment, this.f314181s);
            this.f314179q = 1;
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
