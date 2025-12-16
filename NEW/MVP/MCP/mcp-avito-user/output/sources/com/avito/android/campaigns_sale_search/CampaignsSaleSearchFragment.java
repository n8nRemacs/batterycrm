package com.avito.android.campaigns_sale_search;

import Cd.C13243a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CampaignsSaleSearchScreen;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import com.avito.android.campaigns_sale_search.di.a;
import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import com.avito.android.campaigns_sale_search.mvi.entity.Filter;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import m.C43852a;
import qK0.C47313c;
import um.b;
import um.c;
import z1.AbstractC50339a;

/* compiled from: CampaignsSaleSearchFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/campaigns_sale_search/CampaignsSaleSearchFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CampaignsSaleSearchFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f114473A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f114474B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public q f114475n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f114476o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f114477p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f114478q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f114479r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f114480s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f114481t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f114482u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f114483v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f114484w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f114485x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f114486y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public s f114487z0;

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale_search/CampaignsSaleSearchFragment$a;", "", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/d;", "invoke", "()Lcom/avito/android/campaigns_sale_search/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.campaigns_sale_search.d> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.campaigns_sale_search.d invoke() {
            CampaignsSaleSearchFragment campaignsSaleSearchFragment = CampaignsSaleSearchFragment.this;
            return new com.avito.android.campaigns_sale_search.d(campaignsSaleSearchFragment.requireActivity(), new com.avito.android.campaigns_sale_search.h(1, campaignsSaleSearchFragment.v5(), p.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        }
    }

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment$onViewCreated$10", f = "CampaignsSaleSearchFragment.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114489q;

        /* compiled from: CampaignsSaleSearchFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment$onViewCreated$10$1", f = "CampaignsSaleSearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f114491q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CampaignsSaleSearchFragment f114492r;

            /* compiled from: CampaignsSaleSearchFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment$onViewCreated$10$1$1", f = "CampaignsSaleSearchFragment.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment$c$a$a, reason: collision with other inner class name */
            public static final class C3342a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f114493q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CampaignsSaleSearchFragment f114494r;

                /* compiled from: CampaignsSaleSearchFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lum/d;", "it", "Lkotlin/G0;", "invoke", "(Lum/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C3343a extends N implements Y41.l<um.d, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ CampaignsSaleSearchFragment f114495l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C3343a(CampaignsSaleSearchFragment campaignsSaleSearchFragment) {
                        super(1);
                        this.f114495l = campaignsSaleSearchFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x021d  */
                    @Override // Y41.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final kotlin.G0 invoke(um.d r21) {
                        /*
                            Method dump skipped, instructions count: 806
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment.c.a.C3342a.C3343a.invoke(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3342a(CampaignsSaleSearchFragment campaignsSaleSearchFragment, Continuation<? super C3342a> continuation) {
                    super(2, continuation);
                    this.f114494r = campaignsSaleSearchFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3342a(this.f114494r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3342a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f114493q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CampaignsSaleSearchFragment.f114473A0;
                        CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114494r;
                        n2<um.d> state = campaignsSaleSearchFragment.v5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = campaignsSaleSearchFragment.f114477p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C3343a c3343a = new C3343a(campaignsSaleSearchFragment);
                        this.f114493q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3343a, this) == coroutine_suspended) {
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

            /* compiled from: CampaignsSaleSearchFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment$onViewCreated$10$1$2", f = "CampaignsSaleSearchFragment.kt", i = {}, l = {JfifUtil.MARKER_SOI}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f114496q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CampaignsSaleSearchFragment f114497r;

                /* compiled from: CampaignsSaleSearchFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3344a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CampaignsSaleSearchFragment f114498b;

                    public C3344a(CampaignsSaleSearchFragment campaignsSaleSearchFragment) {
                        this.f114498b = campaignsSaleSearchFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        final um.c cVar = (um.c) obj;
                        a aVar = CampaignsSaleSearchFragment.f114473A0;
                        final CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114498b;
                        if (L.f(cVar, c.b.f440253a)) {
                            ActivityC22955m activityC22955mL1 = campaignsSaleSearchFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.onBackPressed();
                            }
                        } else if (L.f(cVar, c.C12728c.f440254a)) {
                            campaignsSaleSearchFragment.u5().v();
                        } else if (L.f(cVar, c.a.f440252a)) {
                            K2.d(campaignsSaleSearchFragment.u5(), true);
                        } else if (cVar instanceof c.f) {
                            Input.t(campaignsSaleSearchFragment.u5(), ((c.f) cVar).f440259a, false, 4);
                        } else if (cVar instanceof c.e) {
                            View view = campaignsSaleSearchFragment.getView();
                            if (view != null) {
                                Runnable runnable = new Runnable() { // from class: com.avito.android.campaigns_sale_search.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CampaignsSaleSearchFragment.a aVar2 = CampaignsSaleSearchFragment.f114473A0;
                                        View view2 = campaignsSaleSearchFragment.getView();
                                        if (view2 != null) {
                                            com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                                            c.e eVar = (c.e) cVar;
                                            com.avito.android.component.toast.c.b(cVar2, view2, eVar.f440256a, null, null, null, eVar.f440257b, 0, null, null, false, false, null, null, 4078);
                                        }
                                    }
                                };
                                Long l12 = ((c.e) cVar).f440258c;
                                view.postDelayed(runnable, l12 != null ? l12.longValue() : 0L);
                            }
                        } else if (cVar instanceof c.d) {
                            com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, campaignsSaleSearchFragment.requireContext(), new n(campaignsSaleSearchFragment, ((c.d) cVar).f440255a)));
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
                        return new C42801a(2, this.f114498b, CampaignsSaleSearchFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CampaignsSaleSearchFragment campaignsSaleSearchFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f114497r = campaignsSaleSearchFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f114497r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f114496q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CampaignsSaleSearchFragment.f114473A0;
                        CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114497r;
                        InterfaceC43160i<um.c> events = campaignsSaleSearchFragment.v5().getEvents();
                        C3344a c3344a = new C3344a(campaignsSaleSearchFragment);
                        this.f114496q = 1;
                        if (events.collect(c3344a, this) == coroutine_suspended) {
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
            public a(CampaignsSaleSearchFragment campaignsSaleSearchFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f114492r = campaignsSaleSearchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f114492r, continuation);
                aVar.f114491q = obj;
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
                T t12 = (T) this.f114491q;
                CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114492r;
                C43259k.d(t12, null, null, new C3342a(campaignsSaleSearchFragment, null), 3);
                C43259k.d(t12, null, null, new b(campaignsSaleSearchFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CampaignsSaleSearchFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114489q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                CampaignsSaleSearchFragment campaignsSaleSearchFragment = CampaignsSaleSearchFragment.this;
                a aVar = new a(campaignsSaleSearchFragment, null);
                this.f114489q = 1;
                if (C23056p0.b(campaignsSaleSearchFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f114499l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewGroup viewGroup) {
            super(0);
            this.f114499l = viewGroup;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f114499l;
        }
    }

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lum/b;", "it", "Lkotlin/G0;", "invoke", "(Lum/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<um.b, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(um.b bVar) {
            a aVar = CampaignsSaleSearchFragment.f114473A0;
            CampaignsSaleSearchFragment.this.v5().accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f114503l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f114503l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f114503l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CampaignsSaleSearchFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f114505l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f114505l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f114505l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f114506l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f114506l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f114506l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f114507l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f114507l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f114507l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale_search/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/campaigns_sale_search/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<p> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = CampaignsSaleSearchFragment.this.f114475n0;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    static {
        Y y12 = new Y(CampaignsSaleSearchFragment.class, "arrowBackButton", "getArrowBackButton()Landroid/widget/ImageView;", 0);
        n0 n0Var = m0.f406844a;
        f114474B0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CampaignsSaleSearchFragment.class, "cancelButton", "getCancelButton()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CampaignsSaleSearchFragment.class, "chips", "getChips()Lcom/avito/android/lib/design/chips/Chips;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CampaignsSaleSearchFragment.class, "searchInput", "getSearchInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CampaignsSaleSearchFragment.class, "listTitle", "getListTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CampaignsSaleSearchFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CampaignsSaleSearchFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/beduin_shared/model/progress_overlay/BeduinProgressOverlay;", 0, n0Var)};
        f114473A0 = new a(null);
    }

    public CampaignsSaleSearchFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f114476o0 = new O0(m0.f406844a.b(p.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f114479r0 = new C47313c(null, 1, null);
        this.f114480s0 = new C47313c(null, 1, null);
        this.f114481t0 = new C47313c(null, 1, null);
        this.f114482u0 = new C47313c(null, 1, null);
        this.f114483v0 = new C47313c(null, 1, null);
        this.f114484w0 = new C47313c(null, 1, null);
        this.f114485x0 = new C47313c(null, 1, null);
        this.f114486y0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f114477p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.setResult(-1);
        }
        return layoutInflater.inflate(R.layout.campaigns_sale_search_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.arrow_back_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        C47313c c47313c = this.f114479r0;
        kotlin.reflect.n<Object>[] nVarArr = f114474B0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, (ImageView) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.cancel_search);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c2 = this.f114480s0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, (TextView) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.chips_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        C47313c c47313c3 = this.f114481t0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, (Chips) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.query_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        C47313c c47313c4 = this.f114482u0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, (Input) viewFindViewById4);
        View viewFindViewById5 = view.findViewById(R.id.search_list_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c5 = this.f114483v0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, (TextView) viewFindViewById5);
        View viewFindViewById6 = view.findViewById(R.id.overlay_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.content_layout);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById7;
        com.avito.android.beduin_shared.model.progress_overlay.a aVar = new com.avito.android.beduin_shared.model.progress_overlay.a(viewGroup, new d(viewGroup2));
        C47313c c47313c6 = this.f114485x0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[6];
        c47313c6.b(this, aVar);
        final int i12 = 0;
        viewGroup2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.campaigns_sale_search.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CampaignsSaleSearchFragment f114553c;

            {
                this.f114553c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114553c;
                switch (i12) {
                    case 0:
                        CampaignsSaleSearchFragment.a aVar2 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.g.f440238a);
                        break;
                    case 1:
                        CampaignsSaleSearchFragment.a aVar3 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.c.f440234a);
                        break;
                    default:
                        CampaignsSaleSearchFragment.a aVar4 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.e.f440236a);
                        break;
                }
            }
        });
        View viewFindViewById8 = view.findViewById(R.id.search_items_rv);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        C47313c c47313c7 = this.f114484w0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, (RecyclerView) viewFindViewById8);
        RecyclerView recyclerViewT5 = t5();
        getContext();
        recyclerViewT5.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerViewT52 = t5();
        com.avito.konveyor.adapter.d dVar = this.f114478q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerViewT52.setAdapter(dVar);
        t5().setItemAnimator(null);
        t5().n(new e());
        kotlin.reflect.n<Object> nVar8 = nVarArr[0];
        final int i13 = 1;
        ((ImageView) c47313c.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.campaigns_sale_search.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CampaignsSaleSearchFragment f114553c;

            {
                this.f114553c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114553c;
                switch (i13) {
                    case 0:
                        CampaignsSaleSearchFragment.a aVar2 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.g.f440238a);
                        break;
                    case 1:
                        CampaignsSaleSearchFragment.a aVar3 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.c.f440234a);
                        break;
                    default:
                        CampaignsSaleSearchFragment.a aVar4 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.e.f440236a);
                        break;
                }
            }
        });
        final int i14 = 2;
        q5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.campaigns_sale_search.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CampaignsSaleSearchFragment f114553c;

            {
                this.f114553c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CampaignsSaleSearchFragment campaignsSaleSearchFragment = this.f114553c;
                switch (i14) {
                    case 0:
                        CampaignsSaleSearchFragment.a aVar2 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.g.f440238a);
                        break;
                    case 1:
                        CampaignsSaleSearchFragment.a aVar3 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.c.f440234a);
                        break;
                    default:
                        CampaignsSaleSearchFragment.a aVar4 = CampaignsSaleSearchFragment.f114473A0;
                        campaignsSaleSearchFragment.v5().accept(b.e.f440236a);
                        break;
                }
            }
        });
        TextView textViewQ5 = q5();
        ColorStateList colorStateList = androidx.core.content.d.getColorStateList(view.getContext(), R.color.common_gray_12);
        textViewQ5.setBackground(colorStateList != null ? new RippleDrawable(colorStateList, null, C43852a.a(view.getContext(), R.drawable.rect_mask_radius_3)) : null);
        Chips chipsR5 = r5();
        Filter[] filterArrValues = Filter.values();
        ArrayList arrayList = new ArrayList(filterArrValues.length);
        for (Filter filter : filterArrValues) {
            arrayList.add(new r(filter));
        }
        chipsR5.setData(arrayList);
        r5().setChipsSelectedListener(new f());
        u5().setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 4));
        u5().setOnEditorActionListener(new C27140f(this, 3));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f114477p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3345a interfaceC3345aA = com.avito.android.campaigns_sale_search.di.g.a();
        Bundle bundleRequireArguments = requireArguments();
        interfaceC3345aA.a((CampaignsSaleSearchArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("saleSearchData", CampaignsSaleSearchArguments.class) : bundleRequireArguments.getParcelable("saleSearchData")), new C28478k(CampaignsSaleSearchScreen.f90311d, com.avito.android.analytics.screens.s.c(this), null, 4, null), new g(), getResources(), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), cv.c.b(this), (com.avito.android.campaigns_sale_search.di.b) C29972i.a(C29972i.b(this), com.avito.android.campaigns_sale_search.di.b.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f114477p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final TextView q5() {
        C47313c c47313c = this.f114480s0;
        kotlin.reflect.n<Object> nVar = f114474B0[1];
        return (TextView) c47313c.a();
    }

    public final Chips r5() {
        C47313c c47313c = this.f114481t0;
        kotlin.reflect.n<Object> nVar = f114474B0[2];
        return (Chips) c47313c.a();
    }

    public final com.avito.android.beduin_shared.model.progress_overlay.a s5() {
        C47313c c47313c = this.f114485x0;
        kotlin.reflect.n<Object> nVar = f114474B0[6];
        return (com.avito.android.beduin_shared.model.progress_overlay.a) c47313c.a();
    }

    public final RecyclerView t5() {
        C47313c c47313c = this.f114484w0;
        kotlin.reflect.n<Object> nVar = f114474B0[5];
        return (RecyclerView) c47313c.a();
    }

    public final Input u5() {
        C47313c c47313c = this.f114482u0;
        kotlin.reflect.n<Object> nVar = f114474B0[3];
        return (Input) c47313c.a();
    }

    public final p v5() {
        return (p) this.f114476o0.getValue();
    }

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/campaigns_sale_search/CampaignsSaleSearchFragment$e", "Landroidx/recyclerview/widget/RecyclerView$q;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements RecyclerView.q {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean b(@Y61.k RecyclerView recyclerView, @Y61.k MotionEvent motionEvent) {
            a aVar = CampaignsSaleSearchFragment.f114473A0;
            CampaignsSaleSearchFragment.this.v5().accept(b.g.f440238a);
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(boolean z12) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void g2(@Y61.k MotionEvent motionEvent) {
        }
    }

    /* compiled from: CampaignsSaleSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/campaigns_sale_search/CampaignsSaleSearchFragment$f", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements Chips.c {
        public f() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            r rVar = hVar instanceof r ? (r) hVar : null;
            if (rVar == null) {
                return;
            }
            a aVar = CampaignsSaleSearchFragment.f114473A0;
            CampaignsSaleSearchFragment.this.v5().accept(new b.n(rVar.f114847b));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
