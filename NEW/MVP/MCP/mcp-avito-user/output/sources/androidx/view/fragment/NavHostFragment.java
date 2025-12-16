package androidx.view.fragment;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.Z0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.C23278A0;
import androidx.view.C23299L0;
import androidx.view.C23303N0;
import androidx.view.C23312S0;
import androidx.view.C23404y0;
import androidx.view.InterfaceC23402x0;
import androidx.view.fragment.p;
import com.avito.android.R;
import j.InterfaceC42153i;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NavHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/x0;", "<init>", "()V", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment implements InterfaceC23402x0 {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f53118j0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f53119f0 = C42727D.c(new b());

    /* renamed from: g0, reason: collision with root package name */
    @l
    public View f53120g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f53121h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f53122i0;

    /* compiled from: NavHostFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$a;", "", "<init>", "()V", "", "KEY_DEFAULT_NAV_HOST", "Ljava/lang/String;", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NavHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/y0;", "invoke", "()Landroidx/navigation/y0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<C23404y0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C23404y0 invoke() {
            NavHostFragment navHostFragment = NavHostFragment.this;
            Context context = navHostFragment.getContext();
            if (context == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            }
            C23404y0 c23404y0 = new C23404y0(context);
            c23404y0.C(navHostFragment);
            c23404y0.D(navHostFragment.getF42820b());
            navHostFragment.c5(c23404y0);
            Bundle bundleA = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
            if (bundleA != null) {
                c23404y0.v(bundleA);
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new Z0(c23404y0, 4));
            Bundle bundleA2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
            if (bundleA2 != null) {
                navHostFragment.f53121h0 = bundleA2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new Z0(navHostFragment, 5));
            int i12 = navHostFragment.f53121h0;
            InterfaceC42726C interfaceC42726C = c23404y0.f53202D;
            if (i12 != 0) {
                c23404y0.y(((C23278A0) interfaceC42726C.getValue()).b(i12), null);
            } else {
                Bundle arguments = navHostFragment.getArguments();
                int i13 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                if (i13 != 0) {
                    c23404y0.y(((C23278A0) interfaceC42726C.getValue()).b(i13), bundle);
                }
            }
            return c23404y0;
        }
    }

    @k
    public final C23404y0 b5() {
        return (C23404y0) this.f53119f0.getValue();
    }

    @InterfaceC42153i
    public void c5(@k C23404y0 c23404y0) {
        C23303N0 c23303n0 = c23404y0.f53227w;
        c23303n0.a(new androidx.view.fragment.b(requireContext(), getChildFragmentManager()));
        Context contextRequireContext = requireContext();
        FragmentManager childFragmentManager = getChildFragmentManager();
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        c23303n0.a(new i(contextRequireContext, childFragmentManager, id2));
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        if (this.f53122i0) {
            H hE2 = getParentFragmentManager().e();
            hE2.q(this);
            hE2.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onCreate(@l Bundle bundle) {
        b5();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f53122i0 = true;
            H hE2 = getParentFragmentManager().e();
            hE2.q(this);
            hE2.e();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id2);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f53120g0;
        if (view != null && C23299L0.a(view) == b5()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f53120g0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onInflate(@k Context context, @k AttributeSet attributeSet, @l Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23312S0.c.f52872b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f53121h0 = resourceId;
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p.d.f53163c);
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f53122i0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f53122i0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        C23404y0 c23404y0B5 = b5();
        C23299L0 c23299l0 = C23299L0.f52803a;
        view.setTag(R.id.nav_controller_view_tag, c23404y0B5);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f53120g0 = view2;
            if (view2.getId() == getId()) {
                this.f53120g0.setTag(R.id.nav_controller_view_tag, b5());
            }
        }
    }
}
