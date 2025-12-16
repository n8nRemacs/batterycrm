package com.avito.android.employee_stub_impl.view;

import Y61.k;
import Y61.l;
import Zj.InterfaceC19568a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.crm_candidates.view.dialogs.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.i;
import com.avito.android.di.C29972i;
import com.avito.android.employee_stub_public.EmployeeStubData;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.google.android.material.appbar.MaterialToolbar;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EmployeeStubFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/employee_stub_impl/view/EmployeeStubFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "LZj/a;", "<init>", "()V", "a", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmployeeStubFragment extends BaseFragment implements InterfaceC28477j.b, InterfaceC19568a {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f147600s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f147601n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f147602o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final Object f147603p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final Object f147604q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d f147605r0;

    /* compiled from: EmployeeStubFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/employee_stub_impl/view/EmployeeStubFragment$a;", "", "<init>", "()V", "", "KEY_BUNDLE_EMPLOYEE_STUB_DATA", "Ljava/lang/String;", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EmployeeStubFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Drawable> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Drawable invoke() {
            return C35835l0.h(R.attr.ic_close24, EmployeeStubFragment.this.requireContext());
        }
    }

    /* compiled from: EmployeeStubFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/employee_stub_public/EmployeeStubData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<EmployeeStubData> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final EmployeeStubData invoke() {
            Bundle bundleRequireArguments = EmployeeStubFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_bundle_for_employee_stub_data", EmployeeStubData.class) : bundleRequireArguments.getParcelable("key_bundle_for_employee_stub_data");
            if (parcelable != null) {
                return (EmployeeStubData) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public EmployeeStubFragment() {
        super(R.layout.employee_stub_layout);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f147603p0 = C42727D.b(lazyThreadSafetyMode, new c());
        this.f147604q0 = C42727D.b(lazyThreadSafetyMode, new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @k
    public final a.g e5() {
        return new com.avito.android.employee_stub_impl.view.a(this, (i) super.e5(), 0);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @k
    public final Context m5(@k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f147602o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f147605r0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(R.id.employee_stub_toolbar);
        TextView textView = (TextView) view.findViewById(R.id.employee_stub_title);
        TextView textView2 = (TextView) view.findViewById(R.id.employee_stub_desc);
        Button button = (Button) view.findViewById(R.id.employee_stub_button);
        this.f147605r0 = new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(button, 8);
        ScreenPerformanceTracker screenPerformanceTracker = this.f147602o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f147602o0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.m(screenPerformanceTracker2.getF305951e());
        EmployeeStubData employeeStubData = (EmployeeStubData) this.f147603p0.getValue();
        if (employeeStubData instanceof EmployeeStubData.Favorites) {
            materialToolbar.setTitle(R.string.employee_stub_favorites_name);
            materialToolbar.setNavigationIcon((Drawable) null);
            textView.setText(R.string.employee_stub_favorites_title);
            textView2.setText(R.string.employee_stub_favorites_desc);
            button.setText(R.string.employee_stub_favorites_button);
            button.setOnClickListener(new com.avito.android.employee_stub_impl.view.b(this, (EmployeeStubData.Favorites) employeeStubData, 0));
        } else if (employeeStubData instanceof EmployeeStubData.Search) {
            materialToolbar.setTitle(R.string.employee_stub_search_name);
            materialToolbar.setNavigationIcon((Drawable) null);
            textView.setText(R.string.employee_stub_search_title);
            textView2.setText(R.string.employee_stub_search_desc);
            button.setText(R.string.employee_stub_search_button);
            button.setOnClickListener(new com.avito.android.employee_stub_impl.view.b(this, (EmployeeStubData.Search) employeeStubData, 1));
        } else if (employeeStubData instanceof EmployeeStubData.FromDeeplink) {
            EmployeeStubData.FromDeeplink fromDeeplink = (EmployeeStubData.FromDeeplink) employeeStubData;
            materialToolbar.setTitle(fromDeeplink.f147617b);
            materialToolbar.setNavigationIcon((Drawable) this.f147604q0.getValue());
            materialToolbar.setNavigationOnClickListener(new com.avito.android.employee_stub_impl.view.b(this));
            I5.a(textView, fromDeeplink.f147618c, false);
            I5.a(textView2, fromDeeplink.f147619d, false);
            com.avito.android.lib.design.button.b.a(button, fromDeeplink.f147620e, false);
            EmployeeStubData.FromDeeplink fromDeeplink2 = (EmployeeStubData.FromDeeplink) employeeStubData;
            button.setOnClickListener(new f(16, this, fromDeeplink2));
            requireActivity().getF21241d().a(getViewLifecycleOwner(), new com.avito.android.employee_stub_impl.view.c(this, fromDeeplink2));
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f147602o0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker3, null, null, null, 7);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.employee_stub_impl.di.a.a().a(s.c(this), cv.c.b(this), (com.avito.android.employee_stub_impl.di.c) C29972i.a(C29972i.b(this), com.avito.android.employee_stub_impl.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f147602o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // Zj.InterfaceC19568a
    @k
    public final NavigationState u0() {
        return new NavigationState(true, null, 2, null);
    }
}
