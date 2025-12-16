package com.avito.android.profile.remove.screen;

import Cd.C13243a;
import M90.b;
import Y41.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.screen.di.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.profile_removal.ButtonTypes;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ProfileRemoveItemsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/screen/ProfileRemoveItemsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileRemoveItemsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f223972w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f223973n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f223974o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f223975p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.remove.screen.f f223976q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ProfileRemoveAnalytics f223977r0;

    /* renamed from: s0, reason: collision with root package name */
    public RecyclerView f223978s0;

    /* renamed from: t0, reason: collision with root package name */
    public LinearLayout f223979t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.remove.screen.d f223980u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f223981v0;

    /* compiled from: ProfileRemoveItemsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/screen/ProfileRemoveItemsFragment$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ProfileRemoveItemsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.remove.screen.ProfileRemoveItemsFragment$a$a, reason: collision with other inner class name */
        public static final class C6783a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f223982l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6783a(String str) {
                super(1);
                this.f223982l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("arg_key", this.f223982l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ProfileRemoveItemsFragment a(@Y61.k String str) {
            ProfileRemoveItemsFragment profileRemoveItemsFragment = new ProfileRemoveItemsFragment();
            C35966w1.a(profileRemoveItemsFragment, -1, new C6783a(str));
            return profileRemoveItemsFragment;
        }

        public a() {
        }
    }

    /* compiled from: ProfileRemoveItemsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223983a;

        static {
            int[] iArr = new int[ButtonTypes.values().length];
            try {
                iArr[ButtonTypes.SUPPORT_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f223983a = iArr;
        }
    }

    /* compiled from: ProfileRemoveItemsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<M90.b, G0> {
        @Override // Y41.l
        public final G0 invoke(M90.b bVar) {
            M90.b bVar2 = bVar;
            ProfileRemoveItemsFragment profileRemoveItemsFragment = (ProfileRemoveItemsFragment) this.receiver;
            a aVar = ProfileRemoveItemsFragment.f223972w0;
            profileRemoveItemsFragment.getClass();
            if (bVar2 instanceof b.a) {
                com.avito.android.profile.remove.screen.f fVar = profileRemoveItemsFragment.f223976q0;
                (fVar != null ? fVar : null).Y1(((b.a) bVar2).f10423a);
            } else if (bVar2 instanceof b.C0661b) {
                com.avito.android.profile.remove.screen.f fVar2 = profileRemoveItemsFragment.f223976q0;
                (fVar2 != null ? fVar2 : null).R1();
            } else if (bVar2 instanceof b.c) {
                com.avito.android.profile.remove.screen.f fVar3 = profileRemoveItemsFragment.f223976q0;
                (fVar3 != null ? fVar3 : null).fe(((b.c) bVar2).f10425a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileRemoveItemsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LM90/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LM90/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<M90.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(M90.c cVar) {
            M90.c cVar2 = cVar;
            ProfileRemoveItemsFragment profileRemoveItemsFragment = ProfileRemoveItemsFragment.this;
            com.avito.konveyor.adapter.d dVar = profileRemoveItemsFragment.f223974o0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(cVar2.f10428b, null);
            LinearLayout linearLayout = profileRemoveItemsFragment.f223979t0;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(profileRemoveItemsFragment.getContext());
            List<L90.a> list = cVar2.f10429c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (L90.a aVar : list) {
                LinearLayout linearLayout2 = profileRemoveItemsFragment.f223979t0;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                Button button = (Button) layoutInflaterFrom.inflate(R.layout.profile_remove_button_item, (ViewGroup) linearLayout2, false);
                button.setText(aVar.f9813a);
                button.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(4, aVar, profileRemoveItemsFragment));
                LinearLayout linearLayout3 = profileRemoveItemsFragment.f223979t0;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                linearLayout3.addView(button);
                arrayList.add(G0.f406611a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileRemoveItemsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LM90/a;", "it", "Lkotlin/G0;", "invoke", "(LM90/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<M90.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(M90.a aVar) {
            a aVar2 = ProfileRemoveItemsFragment.f223972w0;
            ((com.avito.android.profile.remove.screen.c) ProfileRemoveItemsFragment.this.f223981v0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f223986l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f223986l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f223986l);
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
            return ProfileRemoveItemsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f223988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f223988l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f223988l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f223989l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f223989l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f223989l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f223990l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f223990l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f223990l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ProfileRemoveItemsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile/remove/screen/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.profile.remove.screen.c> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.profile.remove.screen.c invoke() {
            com.avito.android.profile.remove.screen.d dVar = ProfileRemoveItemsFragment.this.f223980u0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.profile.remove.screen.c) dVar.get();
        }
    }

    public ProfileRemoveItemsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f223981v0 = new O0(m0.f406844a.b(com.avito.android.profile.remove.screen.c.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f223975p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f223975p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.profile.remove.screen.c) this.f223981v0.getValue(), new c(1, this, ProfileRemoveItemsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsOneTimeEvent;)V", 0), new d());
        return layoutInflater.inflate(R.layout.profile_remove_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f223978s0 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.buttons_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f223979t0 = (LinearLayout) viewFindViewById2;
        RecyclerView recyclerView = this.f223978s0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        com.avito.konveyor.adapter.d dVar = this.f223974o0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f223975p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.profile.remove.screen.di.a.a();
        com.avito.android.profile.remove.screen.di.c cVar = (com.avito.android.profile.remove.screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile.remove.screen.di.c.class);
        r rVarC = s.c(this);
        String string = requireArguments().getString("arg_key");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVarA.a(this, cVar, rVarC, string, new e(), bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f223975p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
