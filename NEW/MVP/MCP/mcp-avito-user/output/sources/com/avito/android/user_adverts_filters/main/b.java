package com.avito.android.user_adverts_filters.main;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts_filters.main.vm.h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsFiltersMainMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.UserAdvertsFiltersMainMviFragment$collectMainState$1", f = "UserAdvertsFiltersMainMviFragment.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315999q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsFiltersMainMviFragment f316000r;

    /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsFiltersMainMviFragment f316001b;

        public a(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment) {
            this.f316001b = userAdvertsFiltersMainMviFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            h.f fVar = (h.f) obj;
            UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = this.f316001b;
            ScreenPerformanceTracker screenPerformanceTracker = userAdvertsFiltersMainMviFragment.f315971t0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.i(fVar, screenPerformanceTracker, new d(fVar, userAdvertsFiltersMainMviFragment));
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f316001b, UserAdvertsFiltersMainMviFragment.class, "renderFiltersState", "renderFiltersState(Lcom/avito/android/user_adverts_filters/main/vm/UserAdvertsFiltersMainMviViewModel$State;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f316000r = userAdvertsFiltersMainMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f316000r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315999q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = this.f316000r;
            n2<h.f> state = userAdvertsFiltersMainMviFragment.r5().getState();
            a aVar = new a(userAdvertsFiltersMainMviFragment);
            this.f315999q = 1;
            if (state.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
