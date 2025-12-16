package com.avito.android.str_calendar.seller.calendar;

import Cd.C13243a;
import Jy0.InterfaceC14261a;
import Jy0.InterfaceC14263c;
import Y41.l;
import Y41.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.StrCalendarScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: StrSellerCalendarFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/StrSellerCalendarFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerCalendarFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.calendar.k f287478n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f287479o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f287480p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f287481q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f287482r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f287483s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.calendar.konveyor.g f287484t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.core.c f287485u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f287486v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f287487w0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f287477y0 = {m0.f406844a.e(new Y(StrSellerCalendarFragment.class, "calendarViewHolder", "getCalendarViewHolder()Lcom/avito/android/str_calendar/seller/calendar/StrSellerCalendarViewHolder;", 0))};

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f287476x0 = new a(null);

    /* compiled from: StrSellerCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/StrSellerCalendarFragment$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSellerCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC14263c, G0> {
        public final void f(@Y61.k InterfaceC14263c interfaceC14263c) {
            StrSellerCalendarFragment strSellerCalendarFragment = (StrSellerCalendarFragment) this.receiver;
            a aVar = StrSellerCalendarFragment.f287476x0;
            strSellerCalendarFragment.getClass();
            if (interfaceC14263c instanceof InterfaceC14263c.a) {
                C43259k.d(C22981N.a(strSellerCalendarFragment.getLifecycle()), null, null, new com.avito.android.str_calendar.seller.calendar.f(strSellerCalendarFragment, null), 3);
                return;
            }
            if (interfaceC14263c instanceof InterfaceC14263c.d) {
                C43259k.d(C22981N.a(strSellerCalendarFragment.getLifecycle()), null, null, new com.avito.android.str_calendar.seller.calendar.g(strSellerCalendarFragment, interfaceC14263c, null), 3);
                return;
            }
            if (interfaceC14263c instanceof InterfaceC14263c.C0548c) {
                C47313c c47313c = strSellerCalendarFragment.f287487w0;
                n<Object> nVar = StrSellerCalendarFragment.f287477y0[0];
                RecyclerView recyclerView = ((com.avito.android.str_calendar.seller.calendar.i) c47313c.a()).f287596a;
                ((GridLayoutManager) recyclerView.getLayoutManager()).b2(((InterfaceC14263c.C0548c) interfaceC14263c).f9197a, recyclerView.getHeight() / 2);
                return;
            }
            if (interfaceC14263c instanceof InterfaceC14263c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = strSellerCalendarFragment.f287486v0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC14263c.b) interfaceC14263c).f9196a, null, null, 6);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC14263c interfaceC14263c) {
            f(interfaceC14263c);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<StrSellerCalendarState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(StrSellerCalendarState strSellerCalendarState) {
            a aVar = StrSellerCalendarFragment.f287476x0;
            StrSellerCalendarFragment strSellerCalendarFragment = StrSellerCalendarFragment.this;
            C47313c c47313c = strSellerCalendarFragment.f287487w0;
            n<Object> nVar = StrSellerCalendarFragment.f287477y0[0];
            com.avito.android.str_calendar.seller.calendar.i iVar = (com.avito.android.str_calendar.seller.calendar.i) c47313c.a();
            com.avito.android.str_calendar.seller.calendar.mvi.entity.a aVar2 = strSellerCalendarState.f287725l;
            I5.a(iVar.f287601f, aVar2.getF287733a().k0(strSellerCalendarFragment.requireContext()), false);
            boolean z12 = aVar2 instanceof a.b;
            com.avito.android.progress_overlay.l lVar = iVar.f287597b;
            View view = iVar.f287598c;
            if (z12) {
                lVar.j();
                com.avito.konveyor.adapter.d dVar = strSellerCalendarFragment.f287483s0;
                a.b bVar = (a.b) aVar2;
                (dVar != null ? dVar : null).l(bVar.f287735e, new com.avito.android.publish.screen.objects.view.actions.h(strSellerCalendarFragment, 21));
                iVar.f287600e.a(bVar.f287736f.k0(strSellerCalendarFragment.requireContext()));
                view.setVisibility(bVar.f287737g ? 0 : 8);
            } else if (aVar2 instanceof a.c) {
                lVar.a("");
                D6.w(view);
            } else if (aVar2 instanceof a.d) {
                lVar.k(null);
                D6.w(view);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment$onCreateView$3", f = "StrSellerCalendarFragment.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287489q;

        /* compiled from: StrSellerCalendarFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment$onCreateView$3$1", f = "StrSellerCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f287491q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSellerCalendarFragment f287492r;

            /* compiled from: StrSellerCalendarFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment$onCreateView$3$1$1", f = "StrSellerCalendarFragment.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment$d$a$a, reason: collision with other inner class name */
            public static final class C8630a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f287493q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerCalendarFragment f287494r;

                /* compiled from: StrSellerCalendarFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldUpdateCalendar", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment$d$a$a$a, reason: collision with other inner class name */
                public static final class C8631a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrSellerCalendarFragment f287495b;

                    public C8631a(StrSellerCalendarFragment strSellerCalendarFragment) {
                        this.f287495b = strSellerCalendarFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        if (((Boolean) obj).booleanValue()) {
                            a aVar = StrSellerCalendarFragment.f287476x0;
                            this.f287495b.q5().accept(InterfaceC14261a.f.f9187a);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8630a(StrSellerCalendarFragment strSellerCalendarFragment, Continuation<? super C8630a> continuation) {
                    super(2, continuation);
                    this.f287494r = strSellerCalendarFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8630a(this.f287494r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8630a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f287493q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrSellerCalendarFragment strSellerCalendarFragment = this.f287494r;
                        com.avito.android.str_calendar.seller.core.c cVar = strSellerCalendarFragment.f287485u0;
                        if (cVar == null) {
                            cVar = null;
                        }
                        e2 f287827b = cVar.getF287827b();
                        C8631a c8631a = new C8631a(strSellerCalendarFragment);
                        this.f287493q = 1;
                        f287827b.getClass();
                        if (e2.g(f287827b, c8631a, this) == coroutine_suspended) {
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
            public a(StrSellerCalendarFragment strSellerCalendarFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f287492r = strSellerCalendarFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f287492r, continuation);
                aVar.f287491q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43259k.d((T) this.f287491q, null, null, new C8630a(this.f287492r, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrSellerCalendarFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287489q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                StrSellerCalendarFragment strSellerCalendarFragment = StrSellerCalendarFragment.this;
                a aVar = new a(strSellerCalendarFragment, null);
                this.f287489q = 1;
                if (C23056p0.b(strSellerCalendarFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrSellerCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJy0/a;", "it", "Lkotlin/G0;", "invoke", "(LJy0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<InterfaceC14261a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14261a interfaceC14261a) {
            a aVar = StrSellerCalendarFragment.f287476x0;
            StrSellerCalendarFragment.this.q5().accept(interfaceC14261a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f287497l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f287497l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f287497l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrSellerCalendarFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f287499l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f287499l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f287499l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f287500l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f287500l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f287500l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f287501l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f287501l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f287501l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrSellerCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_calendar/seller/calendar/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.str_calendar.seller.calendar.j> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_calendar.seller.calendar.j invoke() {
            com.avito.android.str_calendar.seller.calendar.k kVar = StrSellerCalendarFragment.this.f287478n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.str_calendar.seller.calendar.j) kVar.get();
        }
    }

    public StrSellerCalendarFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f287479o0 = new O0(m0.f406844a.b(com.avito.android.str_calendar.seller.calendar.j.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f287487w0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f287480p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f287480p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, q5(), new b(1, this, StrSellerCalendarFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarOneTimeEvent;)V", 0), new c());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new d(null), 3);
        View viewInflate = layoutInflater.inflate(R.layout.seller_calendar_fragment, viewGroup, false);
        InterfaceC28373a interfaceC28373a = this.f287481q0;
        com.avito.android.str_calendar.seller.calendar.i iVar = new com.avito.android.str_calendar.seller.calendar.i(viewInflate, interfaceC28373a != null ? interfaceC28373a : null);
        C47313c c47313c = this.f287487w0;
        n<Object> nVar = f287477y0[0];
        c47313c.b(this, iVar);
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f287480p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C47313c c47313c = this.f287487w0;
        n<Object> nVar = f287477y0[0];
        com.avito.android.str_calendar.seller.calendar.i iVar = (com.avito.android.str_calendar.seller.calendar.i) c47313c.a();
        final int i12 = 0;
        iVar.f287600e.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.seller.calendar.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrSellerCalendarFragment f287504c;

            {
                this.f287504c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrSellerCalendarFragment strSellerCalendarFragment = this.f287504c;
                switch (i12) {
                    case 0:
                        StrSellerCalendarFragment.a aVar = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.d.f9185a);
                        break;
                    case 1:
                        StrSellerCalendarFragment.a aVar2 = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.C0547a.f9182a);
                        break;
                    default:
                        StrSellerCalendarFragment.a aVar3 = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.b.f9183a);
                        break;
                }
            }
        });
        final int i13 = 1;
        iVar.f287598c.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.seller.calendar.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrSellerCalendarFragment f287504c;

            {
                this.f287504c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrSellerCalendarFragment strSellerCalendarFragment = this.f287504c;
                switch (i13) {
                    case 0:
                        StrSellerCalendarFragment.a aVar = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.d.f9185a);
                        break;
                    case 1:
                        StrSellerCalendarFragment.a aVar2 = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.C0547a.f9182a);
                        break;
                    default:
                        StrSellerCalendarFragment.a aVar3 = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.b.f9183a);
                        break;
                }
            }
        });
        final int i14 = 2;
        iVar.f287599d.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.seller.calendar.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrSellerCalendarFragment f287504c;

            {
                this.f287504c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrSellerCalendarFragment strSellerCalendarFragment = this.f287504c;
                switch (i14) {
                    case 0:
                        StrSellerCalendarFragment.a aVar = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.d.f9185a);
                        break;
                    case 1:
                        StrSellerCalendarFragment.a aVar2 = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.C0547a.f9182a);
                        break;
                    default:
                        StrSellerCalendarFragment.a aVar3 = StrSellerCalendarFragment.f287476x0;
                        strSellerCalendarFragment.q5().accept(InterfaceC14261a.b.f9183a);
                        break;
                }
            }
        });
        iVar.f287597b.f231600j = new com.avito.android.str_calendar.seller.calendar.d(this);
        com.avito.konveyor.adapter.d dVar = this.f287483s0;
        if (dVar == null) {
            dVar = null;
        }
        RecyclerView recyclerView = iVar.f287596a;
        recyclerView.setAdapter(dVar);
        RecyclerView.t recycledViewPool = recyclerView.getRecycledViewPool();
        com.avito.konveyor.a aVar = this.f287482r0;
        if (aVar == null) {
            aVar = null;
        }
        recycledViewPool.e(aVar.Y(com.avito.android.str_calendar.seller.calendar.konveyor.items.month.b.class), recyclerView.getResources().getInteger(R.integer.max_recycled_views_count_month_item_mvi));
        RecyclerView.t recycledViewPool2 = recyclerView.getRecycledViewPool();
        com.avito.konveyor.a aVar2 = this.f287482r0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        recycledViewPool2.e(aVar2.Y(com.avito.android.str_calendar.seller.calendar.konveyor.items.day.b.class), recyclerView.getResources().getInteger(R.integer.max_recycled_views_count_day_item_mvi));
        RecyclerView.t recycledViewPool3 = recyclerView.getRecycledViewPool();
        com.avito.konveyor.a aVar3 = this.f287482r0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        recycledViewPool3.e(aVar3.Y(com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.b.class), recyclerView.getResources().getInteger(R.integer.max_recycled_views_count_empty_item_mvi));
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(7);
        com.avito.android.str_calendar.seller.calendar.konveyor.g gVar = this.f287484t0;
        if (gVar == null) {
            gVar = null;
        }
        gridLayoutManager.f53667M = gVar;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        com.avito.android.str_calendar.seller.calendar.konveyor.g gVar2 = this.f287484t0;
        recyclerView.l(new com.avito.android.str_calendar.seller.calendar.a(new com.avito.android.str_calendar.seller.calendar.e(2, gVar2 != null ? gVar2 : null, com.avito.android.str_calendar.seller.calendar.konveyor.g.class, "getSpanIndex", "getSpanIndex(II)I", 0), recyclerView.getResources().getDimensionPixelSize(R.dimen.calendar_recycler_view_horizontal_padding), recyclerView.getResources().getDimensionPixelSize(R.dimen.calendar_recycler_view_day_horizontal_padding), recyclerView.getResources().getDimensionPixelSize(R.dimen.calendar_recycler_view_day_vertical_margin)), -1);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        String string = bundleRequireArguments.getString("advert_id");
        if (string == null) {
            throw new IllegalStateException("advertId not set");
        }
        com.avito.android.str_calendar.seller.calendar.di.a.a().a((com.avito.android.str_calendar.seller.calendar.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.calendar.di.c.class), cv.c.b(this), (com.avito.android.str_calendar.seller.core.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.core.di.c.class), new e(), new C28478k(StrCalendarScreen.f90510d, s.c(this), null, 4, null), string, bundleRequireArguments.getString("first_selected_date"), bundleRequireArguments.getString("last_selected_date"), bundleRequireArguments.getBoolean("should_close_flow_after_apply")).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f287480p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.str_calendar.seller.calendar.j q5() {
        return (com.avito.android.str_calendar.seller.calendar.j) this.f287479o0.getValue();
    }
}
