package com.avito.android.extended_profile_tabs;

import Cd.C13243a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile.ExtendedProfileArguments;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import com.avito.android.extended_profile_serp.InterfaceC30543f;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsFragment;
import com.avito.android.extended_profile_tabs.mvi.entity.a;
import com.avito.android.extended_profile_ui_components.RoundedShadowFrameLayout;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.beduin.v2.render.android_view.M;
import dB.InterfaceC39552a;
import dB.InterfaceC39553b;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileTabsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileTabsFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public static final a f153141Q0;

    /* renamed from: R0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f153142R0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153143A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153144B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153145C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153146D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153147E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public ExtendedProfileTabsArguments.ExtendedProfileTab f153148F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153149G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153150H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153151I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153152J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153153K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153154L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final C47313c f153155M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public Fragment f153156N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f153157O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public Boolean f153158P0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public q f153159t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f153160u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f153161v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.b f153162w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC30543f f153163x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f153164y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f153165z0;

    /* compiled from: ExtendedProfileTabsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ExtendedProfileTabsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.extended_profile_tabs.ExtendedProfileTabsFragment$a$a, reason: collision with other inner class name */
        public static final class C4468a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileTabsArguments f153166l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4468a(ExtendedProfileTabsArguments extendedProfileTabsArguments) {
                super(1);
                this.f153166l = extendedProfileTabsArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f153166l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ExtendedProfileTabsFragment a(@Y61.k ExtendedProfileTabsArguments extendedProfileTabsArguments) {
            ExtendedProfileTabsFragment extendedProfileTabsFragment = new ExtendedProfileTabsFragment();
            C35966w1.a(extendedProfileTabsFragment, -1, new C4468a(extendedProfileTabsArguments));
            return extendedProfileTabsFragment;
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileTabsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_tabs/ExtendedProfileTabsArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ExtendedProfileTabsArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileTabsArguments invoke() {
            return (ExtendedProfileTabsArguments) ExtendedProfileTabsFragment.this.requireArguments().getParcelable("arguments");
        }
    }

    /* compiled from: ExtendedProfileTabsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC39553b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC39553b interfaceC39553b) {
            ExtendedProfileTabsFragment extendedProfileTabsFragment = (ExtendedProfileTabsFragment) this.receiver;
            a aVar = ExtendedProfileTabsFragment.f153141Q0;
            extendedProfileTabsFragment.getClass();
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileTabsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<com.avito.android.extended_profile_tabs.mvi.entity.a, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.extended_profile_tabs.mvi.entity.a aVar) throws Resources.NotFoundException {
            com.avito.android.extended_profile_tabs.mvi.entity.a aVar2 = aVar;
            ExtendedProfileTabsFragment extendedProfileTabsFragment = (ExtendedProfileTabsFragment) this.receiver;
            a aVar3 = ExtendedProfileTabsFragment.f153141Q0;
            extendedProfileTabsFragment.E5().d();
            kotlin.reflect.n<Object>[] nVarArr = ExtendedProfileTabsFragment.f153142R0;
            Throwable th2 = aVar2.f153241d;
            C47313c c47313c = extendedProfileTabsFragment.f153155M0;
            C47313c c47313c2 = extendedProfileTabsFragment.f153153K0;
            C47313c c47313c3 = extendedProfileTabsFragment.f153151I0;
            a.b bVar = aVar2.f153239b;
            if (th2 != null) {
                com.avito.android.extended_profile_ui_components.l lVarE5 = extendedProfileTabsFragment.E5();
                ScreenPerformanceTracker screenPerformanceTracker = extendedProfileTabsFragment.f153161v0;
                lVarE5.c(th2, screenPerformanceTracker != null ? screenPerformanceTracker : null);
            } else if (aVar2.f153240c) {
                extendedProfileTabsFragment.E5().d();
            } else {
                boolean z12 = bVar instanceof a.b.C4473a;
                ExtendedProfileTabsArguments.ExtendedProfileTab extendedProfileTab = extendedProfileTabsFragment.f153148F0;
                a.C4472a c4472a = aVar2.f153243f;
                if (!L.f(extendedProfileTab, c4472a.f153244a)) {
                    androidx.fragment.app.H hE2 = extendedProfileTabsFragment.getChildFragmentManager().e();
                    FragmentManager childFragmentManager = extendedProfileTabsFragment.getChildFragmentManager();
                    ExtendedProfileTabsArguments.ExtendedProfileTab extendedProfileTab2 = c4472a.f153244a;
                    Fragment fragmentH = childFragmentManager.H(extendedProfileTab2.getClass().toString());
                    if (fragmentH == null) {
                        fragmentH = extendedProfileTabsFragment.D5(extendedProfileTab2, z12);
                        hE2.j(R.id.extended_profile_tab_content_container, fragmentH, extendedProfileTab2.getClass().toString(), 1);
                    } else if (c4472a.f153245b) {
                        hE2.m(fragmentH);
                        fragmentH = extendedProfileTabsFragment.D5(extendedProfileTab2, z12);
                        hE2.j(R.id.extended_profile_tab_content_container, fragmentH, extendedProfileTab2.getClass().toString(), 1);
                    } else {
                        hE2.r(fragmentH);
                    }
                    Fragment fragment = extendedProfileTabsFragment.f153156N0;
                    if (fragment != null) {
                        hE2.k(fragment);
                    }
                    hE2.g();
                    extendedProfileTabsFragment.f153156N0 = fragmentH;
                    extendedProfileTabsFragment.f153148F0 = extendedProfileTab2;
                    Resources resources = extendedProfileTabsFragment.getResources();
                    ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
                    int color = resources.getColor(R.color.black, null);
                    int color2 = extendedProfileTabsFragment.getResources().getColor(R.color.gray54, null);
                    ColorStateList colorStateList = androidx.core.content.d.getColorStateList(extendedProfileTabsFragment.requireContext(), R.color.black);
                    ColorStateList colorStateList2 = androidx.core.content.d.getColorStateList(extendedProfileTabsFragment.requireContext(), R.color.gray54);
                    C47313c c47313c4 = extendedProfileTabsFragment.f153150H0;
                    kotlin.reflect.n<Object> nVar = nVarArr[6];
                    boolean z13 = extendedProfileTab2 instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Profile;
                    M.a((ImageView) c47313c4.a(), z13);
                    kotlin.reflect.n<Object> nVar2 = nVarArr[7];
                    ((TextView) c47313c3.a()).setTextColor(z13 ? color : color2);
                    C47313c c47313c5 = extendedProfileTabsFragment.f153152J0;
                    kotlin.reflect.n<Object> nVar3 = nVarArr[8];
                    boolean z14 = extendedProfileTab2 instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Search;
                    ((ImageView) c47313c5.a()).setImageTintList(z14 ? colorStateList : colorStateList2);
                    kotlin.reflect.n<Object> nVar4 = nVarArr[9];
                    ((TextView) c47313c2.a()).setTextColor(z14 ? color : color2);
                    C47313c c47313c6 = extendedProfileTabsFragment.f153154L0;
                    kotlin.reflect.n<Object> nVar5 = nVarArr[10];
                    ImageView imageView = (ImageView) c47313c6.a();
                    boolean z15 = extendedProfileTab2 instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Rating;
                    if (!z15) {
                        colorStateList = colorStateList2;
                    }
                    imageView.setImageTintList(colorStateList);
                    kotlin.reflect.n<Object> nVar6 = nVarArr[11];
                    TextView textView = (TextView) c47313c.a();
                    if (!z15) {
                        color = color2;
                    }
                    textView.setTextColor(color);
                    Boolean bool = (Boolean) extendedProfileTabsFragment.f153157O0.get(extendedProfileTab2.getClass().toString());
                    extendedProfileTabsFragment.G5(bool != null ? bool.booleanValue() : false);
                }
                extendedProfileTabsFragment.E5().a();
                C47313c c47313c7 = extendedProfileTabsFragment.f153149G0;
                kotlin.reflect.n<Object> nVar7 = nVarArr[5];
                C35949t5.c((SimpleDraweeView) c47313c7.a(), com.avito.android.image_loader.b.b(aVar2.f153242e), null, null, null, 14);
            }
            C47313c c47313c8 = extendedProfileTabsFragment.f153145C0;
            kotlin.reflect.n<Object> nVar8 = nVarArr[2];
            boolean z16 = bVar instanceof a.b.C4473a;
            D6.G((ViewGroup) c47313c8.a(), z16);
            if (z16) {
                kotlin.reflect.n<Object> nVar9 = nVarArr[7];
                a.b.C4473a c4473a = (a.b.C4473a) bVar;
                I5.a((TextView) c47313c3.a(), c4473a.f153249d, false);
                kotlin.reflect.n<Object> nVar10 = nVarArr[9];
                I5.a((TextView) c47313c2.a(), c4473a.f153250e, false);
                kotlin.reflect.n<Object> nVar11 = nVarArr[11];
                I5.a((TextView) c47313c.a(), c4473a.f153251f, false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileTabsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ExtendedProfileTabsFragment.f153141Q0;
            ExtendedProfileTabsFragment.this.F5().accept(InterfaceC39552a.e.f393732a);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileTabsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LdB/a;", "it", "Lkotlin/G0;", "invoke", "(LdB/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC39552a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC39552a interfaceC39552a) {
            a aVar = ExtendedProfileTabsFragment.f153141Q0;
            ExtendedProfileTabsFragment.this.F5().accept(interfaceC39552a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f153170l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f153170l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f153170l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileTabsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f153172l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f153172l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f153172l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153173l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153173l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f153173l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153174l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153174l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f153174l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileTabsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_tabs/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_tabs/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<p> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = ExtendedProfileTabsFragment.this.f153159t0;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    static {
        Y y12 = new Y(ExtendedProfileTabsFragment.class, "tabContentContainer", "getTabContentContainer()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f153142R0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "roundedShadowView", "getRoundedShadowView()Lcom/avito/android/extended_profile_ui_components/RoundedShadowFrameLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "tabsContainerView", "getTabsContainerView()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "tabsTopSpaceWithFloatingButtons", "getTabsTopSpaceWithFloatingButtons()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "errorAndProgressView", "getErrorAndProgressView()Lcom/avito/android/extended_profile_ui_components/ErrorAndProgressViewRedesign;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "brandTabLogoView", "getBrandTabLogoView()Lcom/avito/android/fresco/SimpleDraweeView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "brandTabLogoBackgroundView", "getBrandTabLogoBackgroundView()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "brandTabTextView", "getBrandTabTextView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "searchTabLogoView", "getSearchTabLogoView()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "searchTabTextView", "getSearchTabTextView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "ratingTabLogoView", "getRatingTabLogoView()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileTabsFragment.class, "ratingTabTextView", "getRatingTabTextView()Landroid/widget/TextView;", 0, n0Var)};
        f153141Q0 = new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileTabsFragment() {
        int i12 = 1;
        super(0, i12, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f153160u0 = new O0(m0.f406844a.b(p.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f153164y0 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null));
        this.f153165z0 = C42727D.c(new b());
        this.f153143A0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153144B0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153145C0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153146D0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153147E0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153149G0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153150H0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153151I0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153152J0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153153K0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153154L0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153155M0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f153157O0 = new LinkedHashMap();
    }

    public final Fragment D5(ExtendedProfileTabsArguments.ExtendedProfileTab extendedProfileTab, boolean z12) {
        if (extendedProfileTab instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Profile) {
            ExtendedProfileFragment.a aVar = ExtendedProfileFragment.f149283Y0;
            ExtendedProfileTabsArguments.ExtendedProfileTab.Profile profile = (ExtendedProfileTabsArguments.ExtendedProfileTab.Profile) extendedProfileTab;
            ExtendedProfileArguments extendedProfileArguments = new ExtendedProfileArguments(profile.f153130e, profile.f153129d, profile.f153127b, profile.f153128c, z12);
            aVar.getClass();
            return ExtendedProfileFragment.a.a(extendedProfileArguments);
        }
        if (extendedProfileTab instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Rating) {
            com.avito.android.rating.b bVar = this.f153162w0;
            ExtendedProfileTabsArguments.ExtendedProfileTab.Rating rating = (ExtendedProfileTabsArguments.ExtendedProfileTab.Rating) extendedProfileTab;
            return (bVar != null ? bVar : null).a(rating.f153131b, rating.f153132c, ReviewsOpenPageFrom.PublicProfileTabs.f91261d, rating.f153133d, rating.f153134e);
        }
        if (!(extendedProfileTab instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Search)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC30543f interfaceC30543f = this.f153163x0;
        ExtendedProfileTabsArguments.ExtendedProfileTab.Search search = (ExtendedProfileTabsArguments.ExtendedProfileTab.Search) extendedProfileTab;
        return (interfaceC30543f != null ? interfaceC30543f : null).a(search.f153135b, search.f153136c, search.f153137d, search.f153138e, search.f153139f, search.f153140g);
    }

    public final com.avito.android.extended_profile_ui_components.l E5() {
        C47313c c47313c = this.f153147E0;
        kotlin.reflect.n<Object> nVar = f153142R0[4];
        return (com.avito.android.extended_profile_ui_components.l) c47313c.a();
    }

    public final p F5() {
        return (p) this.f153160u0.getValue();
    }

    public final void G5(boolean z12) {
        boolean z13 = F5().getState().getValue().f153239b instanceof a.b.C4474b;
        C47313c c47313c = this.f153146D0;
        kotlin.reflect.n<Object>[] nVarArr = f153142R0;
        C47313c c47313c2 = this.f153144B0;
        if (z13) {
            this.f153158P0 = null;
            kotlin.reflect.n<Object> nVar = nVarArr[1];
            D6.w((RoundedShadowFrameLayout) c47313c2.a());
            kotlin.reflect.n<Object> nVar2 = nVarArr[3];
            D6.w((View) c47313c.a());
            return;
        }
        if (L.f(this.f153158P0, Boolean.valueOf(z12))) {
            return;
        }
        if (z12) {
            kotlin.reflect.n<Object> nVar3 = nVarArr[1];
            D6.w((RoundedShadowFrameLayout) c47313c2.a());
            kotlin.reflect.n<Object> nVar4 = nVarArr[3];
            D6.H((View) c47313c.a());
        } else {
            kotlin.reflect.n<Object> nVar5 = nVarArr[1];
            D6.H((RoundedShadowFrameLayout) c47313c2.a());
            kotlin.reflect.n<Object> nVar6 = nVarArr[3];
            D6.w((View) c47313c.a());
        }
        ExtendedProfileTabsArguments.ExtendedProfileTab extendedProfileTab = this.f153148F0;
        if (extendedProfileTab != null) {
        }
        this.f153158P0 = Boolean.valueOf(z12);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f153161v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.extended_profile_tabs_fragment, viewGroup, false);
        com.avito.android.arch.mvi.android.f.a(F5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, ExtendedProfileTabsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsOneTimeEvent;)V", 0), new d(1, this, ExtendedProfileTabsFragment.class, "render", "render(Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsState;)V", 0));
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.extended_profile_tab_content_container);
        C47313c c47313c = this.f153143A0;
        kotlin.reflect.n<Object>[] nVarArr = f153142R0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById);
        RoundedShadowFrameLayout roundedShadowFrameLayout = (RoundedShadowFrameLayout) view.findViewById(R.id.extended_profile_rounded_shadow);
        C47313c c47313c2 = this.f153144B0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, roundedShadowFrameLayout);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.extended_profile_tabs_container);
        C47313c c47313c3 = this.f153145C0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, viewGroup);
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_tabs_with_floating_buttons_top_space);
        C47313c c47313c4 = this.f153146D0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, viewFindViewById2);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.extended_profile_tabs_brand_tab_logo);
        C47313c c47313c5 = this.f153149G0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[5];
        c47313c5.b(this, simpleDraweeView);
        TextView textView = (TextView) view.findViewById(R.id.extended_profile_tabs_brand_tab_text);
        C47313c c47313c6 = this.f153151I0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[7];
        c47313c6.b(this, textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.extended_profile_tabs_brand_tab_logo_boarder);
        C47313c c47313c7 = this.f153150H0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[6];
        c47313c7.b(this, imageView);
        final int i12 = 0;
        view.findViewById(R.id.extended_profile_tabs_brand_tab_clickable_area).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_tabs.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileTabsFragment f153181c;

            {
                this.f153181c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileTabsFragment extendedProfileTabsFragment = this.f153181c;
                switch (i12) {
                    case 0:
                        ExtendedProfileTabsFragment.a aVar = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.b.f393729a);
                        break;
                    case 1:
                        ExtendedProfileTabsFragment.a aVar2 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.d.f393731a);
                        break;
                    default:
                        ExtendedProfileTabsFragment.a aVar3 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.c.f393730a);
                        break;
                }
            }
        });
        ImageView imageView2 = (ImageView) view.findViewById(R.id.extended_profile_tabs_search_tab_logo);
        C47313c c47313c8 = this.f153152J0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[8];
        c47313c8.b(this, imageView2);
        TextView textView2 = (TextView) view.findViewById(R.id.extended_profile_tabs_search_tab_text);
        C47313c c47313c9 = this.f153153K0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[9];
        c47313c9.b(this, textView2);
        final int i13 = 1;
        view.findViewById(R.id.extended_profile_tabs_search_tab_clickable_area).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_tabs.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileTabsFragment f153181c;

            {
                this.f153181c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileTabsFragment extendedProfileTabsFragment = this.f153181c;
                switch (i13) {
                    case 0:
                        ExtendedProfileTabsFragment.a aVar = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.b.f393729a);
                        break;
                    case 1:
                        ExtendedProfileTabsFragment.a aVar2 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.d.f393731a);
                        break;
                    default:
                        ExtendedProfileTabsFragment.a aVar3 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.c.f393730a);
                        break;
                }
            }
        });
        ImageView imageView3 = (ImageView) view.findViewById(R.id.extended_profile_tabs_ratings_tab_logo);
        C47313c c47313c10 = this.f153154L0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[10];
        c47313c10.b(this, imageView3);
        TextView textView3 = (TextView) view.findViewById(R.id.extended_profile_tabs_ratings_tab_text);
        C47313c c47313c11 = this.f153155M0;
        kotlin.reflect.n<Object> nVar11 = nVarArr[11];
        c47313c11.b(this, textView3);
        final int i14 = 2;
        view.findViewById(R.id.extended_profile_tabs_ratings_tab_clickable_area).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_tabs.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileTabsFragment f153181c;

            {
                this.f153181c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileTabsFragment extendedProfileTabsFragment = this.f153181c;
                switch (i14) {
                    case 0:
                        ExtendedProfileTabsFragment.a aVar = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.b.f393729a);
                        break;
                    case 1:
                        ExtendedProfileTabsFragment.a aVar2 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.d.f393731a);
                        break;
                    default:
                        ExtendedProfileTabsFragment.a aVar3 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.F5().accept(InterfaceC39552a.c.f393730a);
                        break;
                }
            }
        });
        com.avito.android.extended_profile_ui_components.l lVar = new com.avito.android.extended_profile_ui_components.l(new e(), view);
        C47313c c47313c12 = this.f153147E0;
        kotlin.reflect.n<Object> nVar12 = nVarArr[4];
        c47313c12.b(this, lVar);
        final int i15 = 0;
        getChildFragmentManager().p0("extended_profile_tab_result", this, new C(this) { // from class: com.avito.android.extended_profile_tabs.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileTabsFragment f153183c;

            {
                this.f153183c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                ExtendedProfileTabsFragment extendedProfileTabsFragment = this.f153183c;
                switch (i15) {
                    case 0:
                        ExtendedProfileTabsFragment.a aVar = ExtendedProfileTabsFragment.f153141Q0;
                        DeepLink deepLink = (DeepLink) bundle2.getParcelable("extended_profile_tabs_result_bundle_navigation_deeplink");
                        if (deepLink != null) {
                            extendedProfileTabsFragment.F5().accept(new InterfaceC39552a.C11014a(deepLink));
                            break;
                        }
                        break;
                    default:
                        ExtendedProfileTabsFragment.a aVar2 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.G5(bundle2.getBoolean("extended_profile_tabs_result_bundle_floating_buttons", false));
                        break;
                }
            }
        });
        final int i16 = 1;
        getChildFragmentManager().p0("extended_profile_tab_floating_buttons_result", this, new C(this) { // from class: com.avito.android.extended_profile_tabs.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileTabsFragment f153183c;

            {
                this.f153183c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                ExtendedProfileTabsFragment extendedProfileTabsFragment = this.f153183c;
                switch (i16) {
                    case 0:
                        ExtendedProfileTabsFragment.a aVar = ExtendedProfileTabsFragment.f153141Q0;
                        DeepLink deepLink = (DeepLink) bundle2.getParcelable("extended_profile_tabs_result_bundle_navigation_deeplink");
                        if (deepLink != null) {
                            extendedProfileTabsFragment.F5().accept(new InterfaceC39552a.C11014a(deepLink));
                            break;
                        }
                        break;
                    default:
                        ExtendedProfileTabsFragment.a aVar2 = ExtendedProfileTabsFragment.f153141Q0;
                        extendedProfileTabsFragment.G5(bundle2.getBoolean("extended_profile_tabs_result_bundle_floating_buttons", false));
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker = this.f153161v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.extended_profile_tabs.di.a.a().a((ExtendedProfileTabsArguments) this.f153165z0.getValue(), new f(), new C28478k(ExtendedProfileTabsScreen.f153179d, s.c(this), null, 4, null), (com.avito.android.extended_profile_tabs.di.f) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_tabs.di.f.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f153161v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF128746G0() {
        return this.f153164y0;
    }
}
