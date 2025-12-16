package com.avito.android.passport.profiles_list;

import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_list_item.PassportListItem;
import com.avito.android.passport.profiles_list.PassportProfilesListActivity;
import com.avito.android.util.D6;
import j60.C42206c;
import java.util.List;
import kd0.C42670a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* compiled from: PassportProfilesListActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profiles_list.PassportProfilesListActivity$observeScreenState$1", f = "PassportProfilesListActivity.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213748q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PassportProfilesListActivity f213749r;

    /* compiled from: PassportProfilesListActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profiles_list.PassportProfilesListActivity$observeScreenState$1$1", f = "PassportProfilesListActivity.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213750q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PassportProfilesListActivity f213751r;

        /* compiled from: PassportProfilesListActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profiles_list.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6406a extends H implements Y41.l<C42206c, G0> {
            public final void f(@Y61.k C42206c c42206c) {
                PassportProfilesListActivity passportProfilesListActivity = (PassportProfilesListActivity) this.receiver;
                PassportProfilesListActivity.a aVar = PassportProfilesListActivity.f213728u;
                passportProfilesListActivity.getClass();
                if (c42206c.f405439c) {
                    l lVar = passportProfilesListActivity.f213730n;
                    if (lVar != null) {
                        lVar.f213812d.c(null, new n(lVar));
                        return;
                    }
                    return;
                }
                if (c42206c.f405438b) {
                    l lVar2 = passportProfilesListActivity.f213730n;
                    if (lVar2 != null) {
                        C42670a.d(lVar2.f213812d);
                        return;
                    }
                    return;
                }
                if (c42206c.f405443g.isEmpty()) {
                    return;
                }
                l lVar3 = passportProfilesListActivity.f213730n;
                if (lVar3 != null) {
                    lVar3.f213812d.b();
                }
                l lVar4 = passportProfilesListActivity.f213730n;
                if (lVar4 != null) {
                    D6.G(lVar4.f213811c, c42206c.f405440d);
                }
                List<PassportListItem> list = c42206c.f405442f;
                if (list != null) {
                    com.avito.konveyor.adapter.a aVar2 = passportProfilesListActivity.f213732p;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar2, list);
                    com.avito.konveyor.adapter.j jVar = passportProfilesListActivity.f213731o;
                    (jVar != null ? jVar : null).notifyDataSetChanged();
                }
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(C42206c c42206c) {
                f(c42206c);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PassportProfilesListActivity passportProfilesListActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f213751r = passportProfilesListActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f213751r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f213750q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PassportProfilesListActivity passportProfilesListActivity = this.f213751r;
                n2<C42206c> state = ((i) passportProfilesListActivity.f213734r.getValue()).getState();
                ScreenPerformanceTracker screenPerformanceTracker = passportProfilesListActivity.f213735s;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C6406a c6406a = new C6406a(1, passportProfilesListActivity, PassportProfilesListActivity.class, "render", "render(Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListState;)V", 0);
                this.f213750q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6406a, this) == coroutine_suspended) {
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
    public b(PassportProfilesListActivity passportProfilesListActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f213749r = passportProfilesListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f213749r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f213748q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            PassportProfilesListActivity passportProfilesListActivity = this.f213749r;
            a aVar = new a(passportProfilesListActivity, null);
            this.f213748q = 1;
            if (C23056p0.b(passportProfilesListActivity, state, aVar, this) == coroutine_suspended) {
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
