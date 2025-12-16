package com.avito.android.bottom_navigation.ui.fragment;

import Y41.p;
import Yj.InterfaceC18270b;
import Zj.b;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TabContainerWithStubFragmentImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerWithStubFragmentImpl;", "Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabContainerWithStubFragmentImpl extends TabContainerFragment implements InterfaceC28477j.a {

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f107110l0 = new a(null);

    /* renamed from: g0, reason: collision with root package name */
    public boolean f107112g0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public Fragment f107114i0;

    /* renamed from: j0, reason: collision with root package name */
    public Zj.b f107115j0;

    /* renamed from: k0, reason: collision with root package name */
    public NavigationTabSetItem f107116k0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final Object f107111f0 = C42727D.b(LazyThreadSafetyMode.f406616d, new c());

    /* renamed from: h0, reason: collision with root package name */
    public int f107113h0 = -1;

    /* compiled from: TabContainerWithStubFragmentImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerWithStubFragmentImpl$a;", "", "<init>", "()V", "", "KEY_STUB_FRAGMENT_TAB", "Ljava/lang/String;", "STUB_FRAGMENT_TAG", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static TabContainerWithStubFragmentImpl a(@Y61.k NavigationTabSetItem navigationTabSetItem) {
            TabContainerWithStubFragmentImpl tabContainerWithStubFragmentImpl = new TabContainerWithStubFragmentImpl();
            tabContainerWithStubFragmentImpl.setArguments(C22777e.b(new Q("key_stub_fragment_tab", navigationTabSetItem)));
            return tabContainerWithStubFragmentImpl;
        }

        public a() {
        }
    }

    /* compiled from: TabContainerWithStubFragmentImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bottom_navigation.ui.fragment.TabContainerWithStubFragmentImpl$onCreate$2", f = "TabContainerWithStubFragmentImpl.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107117q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TabContainerWithStubFragmentImpl f107118r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b.a f107119s;

        /* compiled from: TabContainerWithStubFragmentImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.bottom_navigation.ui.fragment.TabContainerWithStubFragmentImpl$onCreate$2$1", f = "TabContainerWithStubFragmentImpl.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f107120q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b.a f107121r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ TabContainerWithStubFragmentImpl f107122s;

            /* compiled from: TabContainerWithStubFragmentImpl.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.bottom_navigation.ui.fragment.TabContainerWithStubFragmentImpl$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C3198a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TabContainerWithStubFragmentImpl f107123b;

                public C3198a(TabContainerWithStubFragmentImpl tabContainerWithStubFragmentImpl) {
                    this.f107123b = tabContainerWithStubFragmentImpl;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    a aVar = TabContainerWithStubFragmentImpl.f107110l0;
                    TabContainerWithStubFragmentImpl tabContainerWithStubFragmentImpl = this.f107123b;
                    if (tabContainerWithStubFragmentImpl.f107112g0 != zBooleanValue) {
                        tabContainerWithStubFragmentImpl.f107112g0 = zBooleanValue;
                        if (tabContainerWithStubFragmentImpl.e5() != null) {
                            if (tabContainerWithStubFragmentImpl.f107112g0) {
                                tabContainerWithStubFragmentImpl.j5();
                            } else {
                                if (tabContainerWithStubFragmentImpl.f107113h0 != -1) {
                                    tabContainerWithStubFragmentImpl.getChildFragmentManager().Z(tabContainerWithStubFragmentImpl.f107113h0, 1, false);
                                    tabContainerWithStubFragmentImpl.f107113h0 = -1;
                                }
                                if (!tabContainerWithStubFragmentImpl.f107112g0) {
                                    tabContainerWithStubFragmentImpl.f107114i0 = null;
                                }
                            }
                        }
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
                    return new C42801a(2, this.f107123b, TabContainerWithStubFragmentImpl.class, "showStubChanged", "showStubChanged(Z)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b.a aVar, TabContainerWithStubFragmentImpl tabContainerWithStubFragmentImpl, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107121r = aVar;
                this.f107122s = tabContainerWithStubFragmentImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f107121r, this.f107122s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f107120q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i<Boolean> interfaceC43160iB = this.f107121r.b();
                    C3198a c3198a = new C3198a(this.f107122s);
                    this.f107120q = 1;
                    if (interfaceC43160iB.collect(c3198a, this) == coroutine_suspended) {
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
        public b(b.a aVar, TabContainerWithStubFragmentImpl tabContainerWithStubFragmentImpl, Continuation continuation) {
            super(2, continuation);
            this.f107118r = tabContainerWithStubFragmentImpl;
            this.f107119s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f107119s, this.f107118r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107117q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                b.a aVar = this.f107119s;
                TabContainerWithStubFragmentImpl tabContainerWithStubFragmentImpl = this.f107118r;
                a aVar2 = new a(aVar, tabContainerWithStubFragmentImpl, null);
                this.f107117q = 1;
                if (C23056p0.b(tabContainerWithStubFragmentImpl, state, aVar2, this) == coroutine_suspended) {
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

    /* compiled from: TabContainerWithStubFragmentImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/d;", "invoke", "()Lcom/avito/android/bottom_navigation/ui/fragment/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<d> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final d invoke() {
            return new d(TabContainerWithStubFragmentImpl.this);
        }
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final void b5(@Y61.k Fragment fragment, @Y61.l Integer num, @Y61.k NavigationScreenAction navigationScreenAction) {
        if (this.f107113h0 != -1) {
            getChildFragmentManager().Z(this.f107113h0, 1, false);
            this.f107113h0 = -1;
        }
        if (!this.f107112g0) {
            this.f107114i0 = null;
        }
        k5().b(fragment, num, this.f107112g0, navigationScreenAction);
        j5();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final boolean d5(boolean z12, boolean z13) {
        if (this.f107112g0) {
            return false;
        }
        return k5().f(z12, z13);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    @Y61.l
    public final Fragment e5() {
        return k5().d();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final void f5(@Y61.k NavigationScreenAction navigationScreenAction) {
        k5().e(navigationScreenAction);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final boolean g5() {
        return k5().g();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final int h5() {
        return k5().c();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    public final boolean i5(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        if (this.f107112g0) {
            return true;
        }
        return k5().a(navigationTabSetItem);
    }

    public final void j5() {
        if (this.f107112g0 && this.f107113h0 == -1) {
            H hE2 = getChildFragmentManager().e();
            Fragment fragmentA = this.f107114i0;
            if (fragmentA == null) {
                Zj.b bVar = this.f107115j0;
                if (bVar == null) {
                    bVar = null;
                }
                NavigationTabSetItem navigationTabSetItem = this.f107116k0;
                if (navigationTabSetItem == null) {
                    navigationTabSetItem = null;
                }
                fragmentA = bVar.a(navigationTabSetItem);
                this.f107114i0 = fragmentA;
            }
            hE2.n(R.id.fragment_container, fragmentA, "bottom_navigation_stub_fragment_tag");
            hE2.f46457p = true;
            hE2.c(null);
            this.f107113h0 = hE2.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final i k5() {
        return (i) this.f107111f0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_stub_fragment_tab", NavigationTabSetItem.class) : bundleRequireArguments.getParcelable("key_stub_fragment_tab");
        if (parcelable == null) {
            throw new IllegalStateException("NavigationTabSetItem arg not provider for stub container");
        }
        this.f107116k0 = (NavigationTabSetItem) parcelable;
        this.f107115j0 = ((InterfaceC18270b) C29972i.a(C29972i.b(this), InterfaceC18270b.class)).ci();
        Fragment fragmentH = getChildFragmentManager().H("bottom_navigation_stub_fragment_tag");
        if (fragmentH == null) {
            this.f107113h0 = -1;
            this.f107112g0 = false;
        } else {
            this.f107114i0 = fragmentH;
            this.f107113h0 = getChildFragmentManager().K(getChildFragmentManager().L() - 1).getId();
            this.f107112g0 = true;
        }
        Zj.b bVar = this.f107115j0;
        if (bVar == null) {
            bVar = null;
        }
        NavigationTabSetItem navigationTabSetItem = this.f107116k0;
        if (navigationTabSetItem == null) {
            navigationTabSetItem = null;
        }
        b.a aVarB = bVar.b(navigationTabSetItem);
        boolean f316915a = aVarB.getF316915a();
        if (this.f107112g0 != f316915a) {
            this.f107112g0 = f316915a;
            if (e5() != null) {
                if (this.f107112g0) {
                    j5();
                } else {
                    if (this.f107113h0 != -1) {
                        getChildFragmentManager().Z(this.f107113h0, 1, false);
                        this.f107113h0 = -1;
                    }
                    if (!this.f107112g0) {
                        this.f107114i0 = null;
                    }
                }
            }
        }
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(aVarB, this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.tab_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f107114i0 = null;
        super.onDestroy();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
    @Y61.l
    public final NavigationState u0() {
        return k5().u0();
    }
}
