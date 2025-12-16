package com.avito.android.location_list;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.LocationListScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.location_list.di.b;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationListFragment.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/location_list/LocationListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/location_list/f0;", "Lcom/avito/android/ui/a;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class LocationListFragment extends BaseFragment implements f0, com.avito.android.ui.a, com.avito.android.ui.fragments.c, InterfaceC33034d.b, InterfaceC33034d.c, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f181877n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public G f181878o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public T f181879p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f181880q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f181881r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f181882s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f181883t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f181884u0;

    public LocationListFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.j(requireActivity());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f181882s0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.d(str);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.S();
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        requireActivity().onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f181884u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return (ViewGroup) layoutInflater.inflate(R.layout.region_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC33034d interfaceC33034d = this.f181883t0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e0();
        T t12 = this.f181879p0;
        (t12 != null ? t12 : null).m();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.b();
        T t13 = this.f181879p0;
        (t13 != null ? t13 : null).c(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.a(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        bundle.putParcelable("scroll_state", t12.getState());
        G g12 = this.f181878o0;
        bundle.putParcelable(VoiceInfo.STATE, (g12 != null ? g12 : null).getState());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC33034d interfaceC33034d = this.f181883t0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.f(this, this, this);
        View view = getView();
        if (view != null) {
            InterfaceC33034d interfaceC33034d2 = this.f181883t0;
            if (interfaceC33034d2 == null) {
                interfaceC33034d2 = null;
            }
            interfaceC33034d2.e(view);
        }
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.k(this);
        T t13 = this.f181879p0;
        (t13 != null ? t13 : null).i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33034d interfaceC33034d = this.f181883t0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.a();
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.l();
        T t13 = this.f181879p0;
        (t13 != null ? t13 : null).f();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.konveyor.adapter.a aVar = this.f181880q0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f181881r0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        InterfaceC28373a interfaceC28373a = this.f181877n0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        k0 k0Var = new k0(viewGroup, aVar, aVar2, interfaceC28373a);
        T t12 = this.f181879p0;
        if (t12 == null) {
            t12 = null;
        }
        t12.g(k0Var);
        ScreenPerformanceTracker screenPerformanceTracker = this.f181884u0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        boolean z12 = requireArguments().getBoolean("has_region");
        boolean z13 = requireArguments().getBoolean("show_whole", false);
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        Location location = (Location) (i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("selected_location", Location.class) : bundleRequireArguments.getParcelable("selected_location"));
        Bundle bundleRequireArguments2 = requireArguments();
        Location location2 = (Location) (i12 >= 34 ? (Parcelable) bundleRequireArguments2.getParcelable("parent_location", Location.class) : bundleRequireArguments2.getParcelable("parent_location"));
        Bundle arguments = getArguments();
        boolean z14 = arguments != null ? arguments.getBoolean("has_search_area", false) : false;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("extra_category_id") : null;
        if (string == null) {
            string = "";
        }
        String str = string;
        Bundle arguments3 = getArguments();
        boolean z15 = arguments3 != null ? arguments3.getBoolean("track_location_events", false) : false;
        if (bundle != null) {
            bundle2 = (Bundle) (i12 >= 34 ? (Parcelable) bundle.getParcelable(VoiceInfo.STATE, Bundle.class) : bundle.getParcelable(VoiceInfo.STATE));
        } else {
            bundle2 = null;
        }
        if (bundle != null) {
            bundle3 = (Bundle) (i12 >= 34 ? (Parcelable) bundle.getParcelable("scroll_state", Bundle.class) : bundle.getParcelable("scroll_state"));
        } else {
            bundle3 = null;
        }
        ActivityC22955m activityC22955mL1 = l1();
        LocationListActivity locationListActivity = activityC22955mL1 instanceof LocationListActivity ? (LocationListActivity) activityC22955mL1 : null;
        if (locationListActivity == null) {
            throw new IllegalArgumentException((this + " requires LocationListActivity").toString());
        }
        b.a aVarA = com.avito.android.location_list.di.a.a();
        aVarA.d((com.avito.android.location_list.di.c) C29972i.a(C29972i.b(this), com.avito.android.location_list.di.c.class));
        aVarA.a(new com.avito.android.location_list.di.d(bundle2, locationListActivity, bundle3, getResources().getString(R.string.not_important), this, z12, z13, location, location2, z14, str, z15));
        aVarA.f(this);
        aVarA.b(locationListActivity);
        aVarA.e(this);
        aVarA.c(new C28478k(LocationListScreen.f90394d, com.avito.android.analytics.screens.s.c(this), "locationList"));
        aVarA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f181884u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        Fragment fragmentH = getChildFragmentManager().H("tag_dialog_location");
        LocationConfirmDialog locationConfirmDialog = fragmentH instanceof LocationConfirmDialog ? (LocationConfirmDialog) fragmentH : null;
        if (locationConfirmDialog == null) {
            return;
        }
        T t12 = this.f181879p0;
        locationConfirmDialog.f181875h0 = t12 != null ? t12 : null;
    }
}
