package com.avito.android.passport.profile_add.merge.profile_to_convert;

import Y41.p;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment;
import e60.C39958c;
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

/* compiled from: ProfileToConvertFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment$observeViewModel$1", f = "ProfileToConvertFragment.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213120q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileToConvertFragment f213121r;

    /* compiled from: ProfileToConvertFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment$observeViewModel$1$1", f = "ProfileToConvertFragment.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213122q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ProfileToConvertFragment f213123r;

        /* compiled from: ProfileToConvertFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.profile_to_convert.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6382a extends H implements Y41.l<C39958c, G0> {
            @Override // Y41.l
            public final G0 invoke(C39958c c39958c) {
                C39958c c39958c2 = c39958c;
                ProfileToConvertFragment profileToConvertFragment = (ProfileToConvertFragment) this.receiver;
                com.avito.konveyor.adapter.a aVar = profileToConvertFragment.f213081o0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.c(new UV0.c(c39958c2.f394963c));
                com.avito.konveyor.adapter.j jVar = profileToConvertFragment.f213080n0;
                (jVar != null ? jVar : null).notifyDataSetChanged();
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfileToConvertFragment profileToConvertFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f213123r = profileToConvertFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f213123r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f213122q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ProfileToConvertFragment.a aVar = ProfileToConvertFragment.f213078w0;
                ProfileToConvertFragment profileToConvertFragment = this.f213123r;
                n2<C39958c> state = profileToConvertFragment.q5().getState();
                ScreenPerformanceTracker screenPerformanceTracker = profileToConvertFragment.f213083q0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C6382a c6382a = new C6382a(1, profileToConvertFragment, ProfileToConvertFragment.class, "render", "render(Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertState;)V", 0);
                this.f213122q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6382a, this) == coroutine_suspended) {
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
    public c(ProfileToConvertFragment profileToConvertFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f213121r = profileToConvertFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f213121r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f213120q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ProfileToConvertFragment profileToConvertFragment = this.f213121r;
            a aVar = new a(profileToConvertFragment, null);
            this.f213120q = 1;
            if (C23056p0.b(profileToConvertFragment, state, aVar, this) == coroutine_suspended) {
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
