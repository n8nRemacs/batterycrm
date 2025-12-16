package com.avito.android.passport.profile_add.merge.profiles_list;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.passport.profile_add.merge.profiles_list.ProfilesListFragment;
import f60.b;
import java.io.Serializable;
import kd0.C42670a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;

/* compiled from: ProfilesListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profiles_list.ProfilesListFragment$observeViewModel$1", f = "ProfilesListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f213248q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfilesListFragment f213249r;

    /* compiled from: ProfilesListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profiles_list.ProfilesListFragment$observeViewModel$1$1", f = "ProfilesListFragment.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213250q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ProfilesListFragment f213251r;

        /* compiled from: ProfilesListFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.profiles_list.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6391a extends H implements Y41.l<f60.c, G0> {
            public final void f(@Y61.k f60.c cVar) {
                ProfilesListFragment profilesListFragment = (ProfilesListFragment) this.receiver;
                ProfilesListFragment.a aVar = ProfilesListFragment.f213192A0;
                profilesListFragment.getClass();
                if (cVar.f395671c) {
                    profilesListFragment.q5().c(null, new g(profilesListFragment));
                    return;
                }
                if (cVar.f395670b) {
                    C42670a.d(profilesListFragment.q5());
                    return;
                }
                profilesListFragment.q5().b();
                com.avito.konveyor.adapter.a aVar2 = profilesListFragment.f213195o0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.c(new UV0.c(cVar.f395675g));
                com.avito.konveyor.adapter.j jVar = profilesListFragment.f213194n0;
                (jVar != null ? jVar : null).notifyDataSetChanged();
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(f60.c cVar) {
                f(cVar);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfilesListFragment profilesListFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f213251r = profilesListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f213251r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f213250q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ProfilesListFragment.a aVar = ProfilesListFragment.f213192A0;
                ProfilesListFragment profilesListFragment = this.f213251r;
                n2<f60.c> state = profilesListFragment.r5().getState();
                ScreenPerformanceTracker screenPerformanceTracker = profilesListFragment.f213199s0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C6391a c6391a = new C6391a(1, profilesListFragment, ProfilesListFragment.class, "renderState", "renderState(Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListState;)V", 0);
                this.f213250q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6391a, this) == coroutine_suspended) {
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

    /* compiled from: ProfilesListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profiles_list.ProfilesListFragment$observeViewModel$1$2", f = "ProfilesListFragment.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213252q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ProfilesListFragment f213253r;

        /* compiled from: ProfilesListFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfilesListFragment f213254b;

            public a(ProfilesListFragment profilesListFragment) {
                this.f213254b = profilesListFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                f60.b bVar = (f60.b) obj;
                ProfilesListFragment.a aVar = ProfilesListFragment.f213192A0;
                ProfilesListFragment profilesListFragment = this.f213254b;
                if (bVar instanceof b.a) {
                    G50.a aVar2 = profilesListFragment.f213200t0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a aVar3 = (b.a) bVar;
                    aVar2.a(aVar3.f395666a, m0.f406844a.b(PassportAddProfileLink.class));
                    com.avito.android.passport.profile_add.merge.b.c(profilesListFragment.requireActivity(), true, aVar3.f395666a);
                } else if (bVar instanceof b.C11127b) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    C47313c c47313c = profilesListFragment.f213204x0;
                    kotlin.reflect.n<Object> nVar = ProfilesListFragment.f213193B0[1];
                    com.avito.android.component.toast.c.b(cVar, (RecyclerView) c47313c.a(), com.avito.android.printable_text.b.c(R.string.passport_common_error, new Serializable[0]), null, null, null, new f.c(((b.C11127b) bVar).f395667a), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                } else if (bVar instanceof b.d) {
                    com.avito.android.passport.profile_add.merge.b.g(profilesListFragment.requireActivity(), ((b.d) bVar).f395669a);
                } else if (bVar instanceof b.c) {
                    com.avito.android.passport.profile_add.merge.b.f(profilesListFragment.requireActivity(), ((b.c) bVar).f395668a);
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f213254b, ProfilesListFragment.class, "collectEvents", "collectEvents(Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProfilesListFragment profilesListFragment, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f213253r = profilesListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f213253r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f213252q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ProfilesListFragment.a aVar = ProfilesListFragment.f213192A0;
                ProfilesListFragment profilesListFragment = this.f213253r;
                s sVarR5 = profilesListFragment.r5();
                a aVar2 = new a(profilesListFragment);
                this.f213252q = 1;
                if (sVarR5.ke(aVar2, this) == coroutine_suspended) {
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
    public e(ProfilesListFragment profilesListFragment, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f213249r = profilesListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f213249r, continuation);
        eVar.f213248q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f213248q;
        ProfilesListFragment profilesListFragment = this.f213249r;
        C43259k.d(t12, null, null, new a(profilesListFragment, null), 3);
        C43259k.d(t12, null, null, new b(profilesListFragment, null), 3);
        return G0.f406611a;
    }
}
