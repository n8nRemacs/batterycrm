package androidx.preference;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.H;
import androidx.preference.PreferenceFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.view.C;
import androidx.view.I;
import androidx.view.x;
import androidx.view.y;
import com.avito.android.R;
import j.InterfaceC42153i;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: PreferenceHeaderFragmentCompat.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$e;", "<init>", "()V", "a", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.e {

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public x f53393f0;

    /* compiled from: PreferenceHeaderFragmentCompat.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat$a;", "Landroidx/activity/x;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$f;", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a extends x implements SlidingPaneLayout.f {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final PreferenceHeaderFragmentCompat f53394d;

        public a(@Y61.k PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
            super(true);
            this.f53394d = preferenceHeaderFragmentCompat;
            ((SlidingPaneLayout) preferenceHeaderFragmentCompat.requireView()).f54479o.add(this);
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
            ((SlidingPaneLayout) this.f53394d.requireView()).a();
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat = PreferenceHeaderFragmentCompat.this;
            preferenceHeaderFragmentCompat.f53393f0.d(((SlidingPaneLayout) preferenceHeaderFragmentCompat.requireView()).f54470f && ((SlidingPaneLayout) preferenceHeaderFragmentCompat.requireView()).d());
        }
    }

    @Y61.k
    public abstract PreferenceFragmentCompat b5();

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        H hE2 = getParentFragmentManager().e();
        hE2.q(this);
        hE2.e();
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(R.id.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(R.id.preferences_header);
        SlidingPaneLayout.e eVar = new SlidingPaneLayout.e(getResources().getDimensionPixelSize(R.dimen.preferences_header_width));
        eVar.f54497a = getResources().getInteger(R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, eVar);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(R.id.preferences_detail);
        SlidingPaneLayout.e eVar2 = new SlidingPaneLayout.e(getResources().getDimensionPixelSize(R.dimen.preferences_detail_width));
        eVar2.f54497a = getResources().getInteger(R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, eVar2);
        if (getChildFragmentManager().G(R.id.preferences_header) == null) {
            PreferenceFragmentCompat preferenceFragmentCompatB5 = b5();
            H hE2 = getChildFragmentManager().e();
            hE2.f46457p = true;
            hE2.j(R.id.preferences_header, preferenceFragmentCompatB5, null, 1);
            hE2.e();
        }
        slidingPaneLayout.setLockMode(3);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        this.f53393f0 = new a(this);
        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) requireView();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new b());
        } else {
            this.f53393f0.d(((SlidingPaneLayout) requireView()).f54470f && ((SlidingPaneLayout) requireView()).d());
        }
        getChildFragmentManager().b(new q(this, 0));
        C cA2 = I.a(view);
        if (cA2 == null || (f21241d = cA2.getF21241d()) == null) {
            return;
        }
        f21241d.a(getViewLifecycleOwner(), this.f53393f0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(@Y61.l Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            Fragment fragmentG = getChildFragmentManager().G(R.id.preferences_header);
            if (fragmentG == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            }
            ((PreferenceFragmentCompat) fragmentG).f53377g0.getClass();
            throw null;
        }
    }
}
