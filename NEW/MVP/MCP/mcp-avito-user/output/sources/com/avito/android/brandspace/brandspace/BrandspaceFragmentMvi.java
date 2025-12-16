package com.avito.android.brandspace.brandspace;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.F;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2Fragment;
import com.avito.android.brandspace.di.q;
import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import com.avito.android.brandspace.perf_const.BrandspaceScreen;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.router.BrandspaceArguments;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.error.z;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ownership.Owners;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.P5;
import com.avito.beduin.v2.render.android_view.M;
import gj.m;
import gj.n;
import gj.o;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import jk.AbstractC42392c;
import jk.InterfaceC42390a;
import jk.InterfaceC42391b;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: BrandspaceFragmentMvi.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/brandspace/brandspace/BrandspaceFragmentMvi;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "a", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class BrandspaceFragmentMvi extends TabBaseFragment implements InterfaceC28477j.b, gj.i {

    /* renamed from: G0, reason: collision with root package name */
    @k
    public static final a f107581G0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f107582A0;

    /* renamed from: B0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f107583B0;

    /* renamed from: C0, reason: collision with root package name */
    public gj.k f107584C0;

    /* renamed from: D0, reason: collision with root package name */
    public Group f107585D0;

    /* renamed from: E0, reason: collision with root package name */
    public View f107586E0;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public Float f107587F0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.brandspace.brandspace.g f107588t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f107589u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public n f107590v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f107591w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f107592x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public com.avito.android.brandspace.view.h f107593y0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public final NavigationState f107594z0;

    /* compiled from: BrandspaceFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/brandspace/brandspace/BrandspaceFragmentMvi$a;", "", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BrandspaceFragmentMvi.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Bundle, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            a aVar = BrandspaceFragmentMvi.f107581G0;
            BrandspaceFragmentMvi brandspaceFragmentMvi = BrandspaceFragmentMvi.this;
            com.avito.android.brandspace.brandspace.e eVarE5 = brandspaceFragmentMvi.E5();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("analytics_interactor_state", eVarE5.f107613N.H());
            bundle2.putBundle("vm_state", bundle3);
            Float f12 = brandspaceFragmentMvi.f107587F0;
            if (f12 != null) {
                bundle2.putFloat("logo_ratio", f12.floatValue());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BrandspaceFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi$onViewCreated$1", f = "BrandspaceFragmentMvi.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107596q;

        /* compiled from: BrandspaceFragmentMvi.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi$onViewCreated$1$1", f = "BrandspaceFragmentMvi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f107598q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BrandspaceFragmentMvi f107599r;

            /* compiled from: BrandspaceFragmentMvi.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi$onViewCreated$1$1$1", f = "BrandspaceFragmentMvi.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi$c$a$a, reason: collision with other inner class name */
            public static final class C3214a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f107600q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BrandspaceFragmentMvi f107601r;

                /* compiled from: BrandspaceFragmentMvi.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3215a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BrandspaceFragmentMvi f107602b;

                    public C3215a(BrandspaceFragmentMvi brandspaceFragmentMvi) {
                        this.f107602b = brandspaceFragmentMvi;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Context context;
                        com.avito.android.brandspace.view.h hVar;
                        RecyclerView recyclerView;
                        InterfaceC42391b interfaceC42391b = (InterfaceC42391b) obj;
                        a aVar = BrandspaceFragmentMvi.f107581G0;
                        BrandspaceFragmentMvi brandspaceFragmentMvi = this.f107602b;
                        if ((interfaceC42391b instanceof InterfaceC42391b.C11578b) && (context = brandspaceFragmentMvi.getContext()) != null && (hVar = brandspaceFragmentMvi.f107593y0) != null && (recyclerView = hVar.f107799h) != null) {
                            InterfaceC42391b.C11578b c11578b = (InterfaceC42391b.C11578b) interfaceC42391b;
                            com.avito.android.component.toast.b.b(recyclerView, c11578b.f405786a.k0(context), 0, null, 0, null, 0, ToastBarPosition.f181046d, c11578b.f405787b, null, 130878);
                        }
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
                        return new C42801a(2, this.f107602b, BrandspaceFragmentMvi.class, "handleEvent", "handleEvent(Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3214a(BrandspaceFragmentMvi brandspaceFragmentMvi, Continuation<? super C3214a> continuation) {
                    super(2, continuation);
                    this.f107601r = brandspaceFragmentMvi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C3214a(this.f107601r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3214a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f107600q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BrandspaceFragmentMvi.f107581G0;
                        BrandspaceFragmentMvi brandspaceFragmentMvi = this.f107601r;
                        InterfaceC43160i<InterfaceC42391b> events = brandspaceFragmentMvi.E5().getEvents();
                        C3215a c3215a = new C3215a(brandspaceFragmentMvi);
                        this.f107600q = 1;
                        if (events.collect(c3215a, this) == coroutine_suspended) {
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

            /* compiled from: BrandspaceFragmentMvi.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi$onViewCreated$1$1$2", f = "BrandspaceFragmentMvi.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f107603q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BrandspaceFragmentMvi f107604r;

                /* compiled from: BrandspaceFragmentMvi.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3216a extends H implements Y41.l<AbstractC42392c, G0> {
                    public final void f(@k AbstractC42392c abstractC42392c) {
                        BrandspaceFragmentMvi brandspaceFragmentMvi = (BrandspaceFragmentMvi) this.receiver;
                        com.avito.android.brandspace.view.h hVar = brandspaceFragmentMvi.f107593y0;
                        if (hVar == null) {
                            return;
                        }
                        boolean z12 = abstractC42392c instanceof AbstractC42392c.d;
                        com.avito.android.progress_overlay.l lVar = hVar.f107801j;
                        if (z12) {
                            lVar.k(null);
                            return;
                        }
                        if (abstractC42392c instanceof AbstractC42392c.a) {
                            lVar.a(z.k(((AbstractC42392c.a) abstractC42392c).f405788b));
                            return;
                        }
                        if (abstractC42392c instanceof AbstractC42392c.C11579c) {
                            AbstractC42392c.C11579c c11579c = (AbstractC42392c.C11579c) abstractC42392c;
                            Brandspace brandspace = c11579c.f405791c;
                            if (brandspace.getBeduinV2() != null) {
                                Group group = brandspaceFragmentMvi.f107585D0;
                                if (group == null) {
                                    group = null;
                                }
                                group.setVisibility(8);
                                View view = brandspaceFragmentMvi.f107586E0;
                                M.a(view != null ? view : null, true);
                                brandspaceFragmentMvi.requireActivity().getSupportFragmentManager().o0(C22777e.b(new Q("key_brandspace_beduin_v2_adjust_params", brandspace.getAdjustParams()), new Q("key_brandspace_beduin_v2_data", brandspace.getBeduinV2())), "key_brandspace_beduin_v2_request");
                                lVar.j();
                                return;
                            }
                            Group group2 = brandspaceFragmentMvi.f107585D0;
                            if (group2 == null) {
                                group2 = null;
                            }
                            M.a(group2, true);
                            View view2 = brandspaceFragmentMvi.f107586E0;
                            (view2 != null ? view2 : null).setVisibility(8);
                            brandspaceFragmentMvi.D5(hVar, c11579c);
                            WeakReference weakReference = new WeakReference(brandspaceFragmentMvi);
                            String logoUrl = brandspace.getLogoUrl();
                            if (logoUrl == null) {
                                logoUrl = "";
                            }
                            if (com.avito.android.lib.util.darkTheme.c.a(brandspaceFragmentMvi.requireContext())) {
                                String logoUrlDark = brandspace.getLogoUrlDark();
                                logoUrl = logoUrlDark != null ? logoUrlDark : "";
                            }
                            hVar.d(logoUrl, brandspaceFragmentMvi.f107587F0, brandspace.getHideDefaultLogo(), new com.avito.android.brandspace.brandspace.b(weakReference));
                            lVar.j();
                        }
                    }

                    @Override // Y41.l
                    public final /* bridge */ /* synthetic */ G0 invoke(AbstractC42392c abstractC42392c) {
                        f(abstractC42392c);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BrandspaceFragmentMvi brandspaceFragmentMvi, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f107604r = brandspaceFragmentMvi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f107604r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f107603q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BrandspaceFragmentMvi.f107581G0;
                        BrandspaceFragmentMvi brandspaceFragmentMvi = this.f107604r;
                        n2<AbstractC42392c> state = brandspaceFragmentMvi.E5().getState();
                        F f428750f = brandspaceFragmentMvi.E5().f107615P.getF428750f();
                        C3216a c3216a = new C3216a(1, brandspaceFragmentMvi, BrandspaceFragmentMvi.class, "render", "render(Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceState;)V", 0);
                        this.f107603q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, f428750f, c3216a, this) == coroutine_suspended) {
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
            public a(BrandspaceFragmentMvi brandspaceFragmentMvi, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107599r = brandspaceFragmentMvi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f107599r, continuation);
                aVar.f107598q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f107598q;
                BrandspaceFragmentMvi brandspaceFragmentMvi = this.f107599r;
                C43259k.d(t12, null, null, new C3214a(brandspaceFragmentMvi, null), 3);
                C43259k.d(t12, null, null, new b(brandspaceFragmentMvi, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return BrandspaceFragmentMvi.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107596q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BrandspaceFragmentMvi brandspaceFragmentMvi = BrandspaceFragmentMvi.this;
                a aVar = new a(brandspaceFragmentMvi, null);
                this.f107596q = 1;
                if (C23056p0.b(brandspaceFragmentMvi, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f107605l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f107605l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f107605l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BrandspaceFragmentMvi.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f107607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f107607l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f107607l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f107608l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f107608l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f107608l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f107609l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f107609l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f107609l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BrandspaceFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/brandspace/brandspace/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/brandspace/brandspace/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.brandspace.brandspace.e> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.brandspace.brandspace.e invoke() {
            com.avito.android.brandspace.brandspace.g gVar = BrandspaceFragmentMvi.this.f107588t0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.brandspace.brandspace.e) gVar.get();
        }
    }

    public BrandspaceFragmentMvi() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f107589u0 = new O0(m0.f406844a.b(com.avito.android.brandspace.brandspace.e.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f107592x0 = new io.reactivex.rxjava3.disposables.c();
        this.f107594z0 = new NavigationState(false, null, 2, null);
    }

    @Override // gj.i
    @l
    public final RecyclerView B0(@k String str) {
        com.avito.android.brandspace.view.h hVar;
        AbstractC42392c value = E5().getState().getValue();
        AbstractC42392c.C11579c c11579c = value instanceof AbstractC42392c.C11579c ? (AbstractC42392c.C11579c) value : null;
        if (c11579c == null) {
            return null;
        }
        if (str.equals(c11579c.f405792d.getF103350r())) {
            com.avito.android.brandspace.view.h hVar2 = this.f107593y0;
            if (hVar2 != null) {
                return hVar2.f107798g;
            }
            return null;
        }
        if (str.equals(c11579c.f405793e.getF103350r())) {
            com.avito.android.brandspace.view.h hVar3 = this.f107593y0;
            if (hVar3 != null) {
                return hVar3.f107799h;
            }
            return null;
        }
        if (!str.equals(c11579c.f405794f.getF103350r()) || (hVar = this.f107593y0) == null) {
            return null;
        }
        return hVar.f107800i;
    }

    public final void D5(com.avito.android.brandspace.view.h hVar, AbstractC42392c.C11579c c11579c) {
        if (hVar.f107799h.getAdapter() != null) {
            return;
        }
        hVar.b(c11579c.f405792d.d(), c11579c.f405793e.d(), c11579c.f405794f.d());
        hVar.a(c11579c.f405798j, c11579c.f405799k, c11579c.f405800l);
        hVar.e(c11579c.f405795g, c11579c.f405796h, c11579c.f405797i);
        hVar.f107801j.f231600j = new com.avito.android.brandspace.brandspace.a(this);
    }

    public final com.avito.android.brandspace.brandspace.e E5() {
        return (com.avito.android.brandspace.brandspace.e) this.f107589u0.getValue();
    }

    @Override // gj.i
    @l
    public final View b3(@k String str) {
        return B0(str);
    }

    @Override // gj.i
    @l
    public final o c1() {
        return null;
    }

    @Override // gj.i
    @k
    public final String m0() {
        String f103350r;
        AbstractC42392c value = E5().getState().getValue();
        AbstractC42392c.C11579c c11579c = value instanceof AbstractC42392c.C11579c ? (AbstractC42392c.C11579c) value : null;
        return (c11579c == null || (f103350r = c11579c.f405793e.getF103350r()) == null) ? "main" : f103350r;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @l
    public final Context m5(@k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        E5().f107615P.e();
        return layoutInflater.inflate(R.layout.brandspace_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f107592x0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        E5().accept(InterfaceC42390a.e.f405784a);
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        E5().accept(InterfaceC42390a.f.f405785a);
        super.onResume();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        n nVar = this.f107590v0;
        if (nVar == null) {
            nVar = null;
        }
        gj.k kVarA = m.a(nVar, this);
        this.f107584C0 = kVarA;
        ((com.avito.android.beduin.view.c) kVarA).l(E5().f107614O);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.brandspace_toolbar);
        toolbar.setTitle("");
        P5.c(toolbar, R.attr.black);
        o5(toolbar);
        toolbar.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 20));
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.brandspace_content_horizontal_padding);
        InterfaceC25659b interfaceC25659b = this.f107591w0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        this.f107582A0 = interfaceC25659b.b(Integer.valueOf(dimensionPixelSize));
        InterfaceC25659b interfaceC25659b2 = this.f107591w0;
        if (interfaceC25659b2 == null) {
            interfaceC25659b2 = null;
        }
        this.f107583B0 = interfaceC25659b2.b(Integer.valueOf(dimensionPixelSize));
        InterfaceC25659b interfaceC25659b3 = this.f107591w0;
        if (interfaceC25659b3 == null) {
            interfaceC25659b3 = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b3.b(Integer.valueOf(dimensionPixelSize));
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f107582A0;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = abstractC25658a == null ? null : abstractC25658a;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f107583B0;
        com.avito.android.brandspace.view.h hVar = new com.avito.android.brandspace.view.h(view, this.f107592x0, abstractC25658a2, abstractC25658a3 == null ? null : abstractC25658a3, aVarB, toolbar);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        AbstractC42392c value = E5().getState().getValue();
        AbstractC42392c.C11579c c11579c = value instanceof AbstractC42392c.C11579c ? (AbstractC42392c.C11579c) value : null;
        if (c11579c != null) {
            D5(hVar, c11579c);
        }
        this.f107593y0 = hVar;
        E5().f107615P.d();
        this.f107585D0 = (Group) view.findViewById(R.id.brandspace_content);
        this.f107586E0 = view.findViewById(R.id.brandspace_beduin_v2_container);
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getChildFragmentManager().e();
            hE2.n(R.id.brandspace_beduin_v2_container, new BrandspaceBeduinV2Fragment(), null);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        BrandspaceArguments brandspaceArguments = arguments != null ? (BrandspaceArguments) arguments.getParcelable("key_brandspace_arguments") : null;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        BrandspaceScreen brandspaceScreen = BrandspaceScreen.f107762d;
        q.a().a(brandspaceArguments.f107764b, brandspaceArguments.f107766d, brandspaceArguments.f107767e, this, this, s.c(this), new C31138n0(K.a(((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed(), ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(brandspaceScreen, s.c(this), null, 4, null)), new ZS.b(brandspaceScreen, Owners.f210488g, (String) null, 4, (C42822w) null), cv.c.d(this), null, null, null, 56)), (com.avito.android.brandspace.di.c) C29972i.a(C29972i.b(this), com.avito.android.brandspace.di.c.class), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), cv.c.b(this)).a(this);
        Bundle bundleT5 = t5(bundle);
        if (bundleT5 != null) {
            this.f107587F0 = bundleT5.containsKey("logo_ratio") ? Float.valueOf(bundleT5.getFloat("logo_ratio")) : null;
            Bundle bundle2 = bundleT5.getBundle("vm_state");
            if (bundle2 != null) {
                com.avito.android.brandspace.brandspace.e eVarE5 = E5();
                BrandspaceAnalyticsInteractor.State state = (BrandspaceAnalyticsInteractor.State) bundle2.getParcelable("analytics_interactor_state");
                if (state != null) {
                    eVarE5.f107613N.c(state);
                }
            }
        }
        E5().f107615P.a(fA2.b());
        E5().f107615P.m(g5(), this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF188607M0() {
        return this.f107594z0;
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
