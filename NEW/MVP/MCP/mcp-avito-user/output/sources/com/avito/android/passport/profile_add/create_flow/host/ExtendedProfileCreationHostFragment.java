package com.avito.android.passport.profile_add.create_flow.host;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.f;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileCreationHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/ExtendedProfileCreationHostFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExtendedProfileCreationHostFragment extends BaseFragment implements InterfaceC28477j.a, com.avito.android.ui.fragments.c {

    /* renamed from: o0, reason: collision with root package name */
    @k
    public static final a f211360o0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final O0 f211361n0;

    /* compiled from: ExtendedProfileCreationHostFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/ExtendedProfileCreationHostFragment$a;", "", "<init>", "()V", "", "FIRST_SCREEN_ARG", "Ljava/lang/String;", "FLOW_ARG", "NAVIGATION_ARG", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ExtendedProfileCreationHostFragment a(@k ProfileCreateExtendedFlow profileCreateExtendedFlow, @k Navigation navigation2, @l AnalyticScreen analyticScreen) {
            ExtendedProfileCreationHostFragment extendedProfileCreationHostFragment = new ExtendedProfileCreationHostFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extended_profile_creation.host_fragment.flow", profileCreateExtendedFlow);
            bundle.putParcelable("extended_profile_creation.host_fragment.navigation", navigation2);
            bundle.putParcelable("extended_profile_creation.host_fragment.first_screen", analyticScreen);
            extendedProfileCreationHostFragment.setArguments(bundle);
            return extendedProfileCreationHostFragment;
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileCreationHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f211362b;

        public b(Y41.l lVar) {
            this.f211362b = lVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f211362b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f211362b;
        }

        public final int hashCode() {
            return this.f211362b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f211362b.invoke(obj);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<S0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ExtendedProfileCreationHostFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC50339a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ExtendedProfileCreationHostFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return ExtendedProfileCreationHostFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public ExtendedProfileCreationHostFragment() {
        super(R.layout.create_extennded_profile_host_fragment);
        this.f211361n0 = new O0(m0.f406844a.b(f.class), new c(), new e(), new d());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        if (getChildFragmentManager().L() <= 1) {
            return false;
        }
        getChildFragmentManager().Y();
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        O0 o02 = this.f211361n0;
        ((f) o02.getValue()).f212373E.observe(getViewLifecycleOwner(), new b(new com.avito.android.passport.profile_add.create_flow.host.a(this)));
        if (getChildFragmentManager().P().isEmpty()) {
            Bundle bundleRequireArguments = requireArguments();
            int i12 = Build.VERSION.SDK_INT;
            AnalyticScreen analyticScreen = (AnalyticScreen) (i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("extended_profile_creation.host_fragment.first_screen", AnalyticScreen.class) : bundleRequireArguments.getParcelable("extended_profile_creation.host_fragment.first_screen"));
            if (analyticScreen != null) {
                ((f) o02.getValue()).f212376L.setValue(analyticScreen);
            }
            Bundle bundleRequireArguments2 = requireArguments();
            ((f) o02.getValue()).f212373E.setValue((Navigation) (i12 >= 34 ? (Parcelable) bundleRequireArguments2.getParcelable("extended_profile_creation.host_fragment.navigation", Navigation.class) : bundleRequireArguments2.getParcelable("extended_profile_creation.host_fragment.navigation")));
        }
    }
}
