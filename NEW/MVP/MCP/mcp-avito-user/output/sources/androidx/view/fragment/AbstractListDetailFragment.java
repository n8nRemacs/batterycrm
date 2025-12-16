package androidx.view.fragment;

import AK.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.H;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.view.C23312S0;
import androidx.view.x;
import com.avito.android.R;
import j.InterfaceC42153i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AbstractListDetailFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractListDetailFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    @l
    public x f53113f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f53114g0;

    /* compiled from: AbstractListDetailFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment$a;", "Landroidx/activity/x;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$f;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends x implements SlidingPaneLayout.f {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final SlidingPaneLayout f53115d;

        public a(@k SlidingPaneLayout slidingPaneLayout) {
            super(true);
            this.f53115d = slidingPaneLayout;
            slidingPaneLayout.f54479o.add(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public final void a() {
            d(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public final void b() {
            d(false);
        }

        @Override // androidx.view.x
        public final void c() {
            this.f53115d.a();
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SlidingPaneLayout f53117c;

        public b(SlidingPaneLayout slidingPaneLayout) {
            this.f53117c = slidingPaneLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            x xVar = AbstractListDetailFragment.this.f53113f0;
            SlidingPaneLayout slidingPaneLayout = this.f53117c;
            xVar.d(slidingPaneLayout.f54470f && slidingPaneLayout.d());
        }
    }

    @k
    public abstract View b5();

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        NavHostFragment navHostFragment;
        if (bundle != null) {
            this.f53114g0 = bundle.getInt("android-support-nav:fragment:graphId");
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(R.id.sliding_pane_layout);
        View viewB5 = b5();
        if (!L.f(viewB5, slidingPaneLayout) && !L.f(viewB5.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewB5);
        }
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(R.id.sliding_pane_detail_container);
        SlidingPaneLayout.e eVar = new SlidingPaneLayout.e(layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.sliding_pane_detail_pane_width));
        eVar.f54497a = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, eVar);
        Fragment fragmentG = getChildFragmentManager().G(R.id.sliding_pane_detail_container);
        if (fragmentG != null) {
        } else {
            int i12 = this.f53114g0;
            if (i12 != 0) {
                NavHostFragment.f53118j0.getClass();
                Bundle bundleE = i12 != 0 ? c.e(i12, "android-support-nav:fragment:graphId") : null;
                navHostFragment = new NavHostFragment();
                if (bundleE != null) {
                    navHostFragment.setArguments(bundleE);
                }
            } else {
                navHostFragment = new NavHostFragment();
            }
            H hE2 = getChildFragmentManager().e();
            hE2.f46457p = true;
            hE2.j(R.id.sliding_pane_detail_container, navHostFragment, null, 1);
            hE2.e();
        }
        this.f53113f0 = new a(slidingPaneLayout);
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new b(slidingPaneLayout));
        } else {
            this.f53113f0.d(slidingPaneLayout.f54470f && slidingPaneLayout.d());
        }
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f53113f0);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onInflate(@k Context context, @k AttributeSet attributeSet, @l Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23312S0.c.f52872b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f53114g0 = resourceId;
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i12 = this.f53114g0;
        if (i12 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((SlidingPaneLayout) requireView()).getChildAt(0);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onViewStateRestored(@l Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.f53113f0.d(((SlidingPaneLayout) requireView()).f54470f && ((SlidingPaneLayout) requireView()).d());
    }
}
