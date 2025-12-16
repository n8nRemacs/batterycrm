package com.avito.android.ui.fragments;

import Y61.k;
import Y61.l;
import Zj.InterfaceC19568a;
import ak.C19902a;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.j;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import androidx.view.P0;
import com.avito.android.bottom_navigation.A;
import com.avito.android.bottom_navigation.C;
import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import j.I;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import w3.C49433a;

/* compiled from: TabBaseFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/f;", "Landroidx/lifecycle/O;", "LZj/a;", "Lkotlin/G0;", "start", "()V", "resume", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TabBaseFragment extends BaseFragment implements com.avito.android.bottom_navigation.ui.fragment.f, InterfaceC22982O, InterfaceC19568a {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public NavigationState f304614n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public ResultReportData f304615o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public ResultFragmentData f304616p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public f f304617q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public String f304618r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f304619s0;

    /* compiled from: TabBaseFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw3/a;", "invoke", "()Lw3/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<C49433a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C49433a invoke() {
            return ((C49433a.InterfaceC12806a) C29972i.a(C29972i.b(TabBaseFragment.this), C49433a.InterfaceC12806a.class)).Tl();
        }
    }

    public TabBaseFragment() {
        this(0, 1, null);
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_RESUME)
    private final void resume() {
        u5();
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_START)
    private final void start() {
        u5();
    }

    public final void A5(@k Bundle bundle, @k Y41.l<? super Bundle, G0> lVar) {
        if (!((C49433a) this.f304619s0.getValue()).f441242a.a().a()) {
            lVar.invoke(bundle);
            return;
        }
        lVar.invoke(bundle);
        Bundle bundle2 = new Bundle();
        lVar.invoke(bundle2);
        z5(bundle2);
    }

    public final void B5(int i12, @l Intent intent) {
        ResultFragmentData resultFragmentData = this.f304616p0;
        if (resultFragmentData == null) {
            return;
        }
        A aY5 = y5();
        ResultReportData resultReportData = new ResultReportData(resultFragmentData.f304610c, i12, intent);
        C28885g c28885g = ((BottomNavigationFragment) aY5).f162252H0;
        if (c28885g != null) {
            for (com.avito.android.bottom_navigation.ui.fragment.f fVar : c28885g.f107013i) {
                if (resultFragmentData.f304609b.equals(fVar.getF304618r0())) {
                    fVar.F2(resultReportData);
                }
            }
        }
    }

    public final void C5(int i12, @k Intent intent) {
        if (C19902a.a(intent) == null) {
            throw new IllegalArgumentException("Data should be presented!");
        }
        A aY5 = y5();
        ResultFragmentData resultFragmentData = new ResultFragmentData(this.f304618r0, i12);
        C28885g c28885g = ((BottomNavigationFragment) aY5).f162252H0;
        if (c28885g != null) {
            c28885g.f107021q = resultFragmentData;
        }
        requireActivity().startActivity(intent);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.f
    public final void F2(@k ResultReportData resultReportData) {
        this.f304615o0 = resultReportData;
    }

    public boolean V0() {
        return v5();
    }

    public void e4() {
        r5();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.f
    @k
    /* renamed from: getId, reason: from getter */
    public final String getF304618r0() {
        return this.f304618r0;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@l Bundle bundle) {
        A a12;
        this.f304597g0 = true;
        getLifecycle().a(this);
        ActivityC22955m activity = l1();
        if (activity != null && (a12 = C.a(activity)) != null) {
            ((BottomNavigationFragment) a12).f162257M0.add(this);
        }
        if (bundle == null) {
            this.f304618r0 = UUID.randomUUID().toString();
        } else {
            String string = bundle.getString("tab_base_id");
            if (string == null) {
                string = "";
            }
            this.f304618r0 = string;
            this.f304615o0 = (ResultReportData) bundle.getParcelable("tab_base_report_results");
            this.f304616p0 = (ResultFragmentData) bundle.getParcelable("tab_base_report_target");
        }
        super.onCreate(bundle);
        p5(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getLifecycle().c(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("tab_base_report_results", this.f304615o0);
        bundle.putParcelable("tab_base_report_target", this.f304616p0);
        bundle.putString("tab_base_id", this.f304618r0);
    }

    @l
    public final NavigationTabSetItem q5() {
        A a12;
        ActivityC22955m activity = l1();
        if (activity == null || (a12 = C.a(activity)) == null) {
            return null;
        }
        return ((BottomNavigationFragment) a12).r5();
    }

    public final void r5() {
        ((BottomNavigationFragment) y5()).t5();
    }

    @k
    /* renamed from: s5, reason: from getter */
    public NavigationState getF261842N0() {
        return this.f304614n0;
    }

    @l
    public final Bundle t5(@l Bundle bundle) {
        return ((C49433a) this.f304619s0.getValue()).f441242a.a().a() ? w5() : bundle;
    }

    @Override // Zj.InterfaceC19568a
    @k
    public final NavigationState u0() {
        return getF261842N0();
    }

    public final void u5() {
        ResultReportData resultReportData = this.f304615o0;
        if (resultReportData != null) {
            onActivityResult(resultReportData.f304611b, resultReportData.f304612c, resultReportData.f304613d);
            this.f304615o0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.bottom_navigation.space.e] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final boolean v5() {
        ?? parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == 0) {
                j activity = l1();
                if (!(activity instanceof com.avito.android.bottom_navigation.space.e)) {
                    activity = null;
                }
                parentFragment = (com.avito.android.bottom_navigation.space.e) activity;
            } else {
                if (parentFragment instanceof com.avito.android.bottom_navigation.space.e) {
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
            }
        }
        com.avito.android.bottom_navigation.space.e eVar = (com.avito.android.bottom_navigation.space.e) parentFragment;
        return (eVar != null ? eVar.d1() : false) && getF261842N0().f107150c.f107151b;
    }

    @l
    public final Bundle w5() {
        f fVar = this.f304617q0;
        if (fVar == null) {
            fVar = (f) new P0(this).a(f.class);
        }
        this.f304617q0 = fVar;
        return fVar.f304624E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.bottom_navigation.space.e] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @k
    public final BottomNavigationSpace x5() {
        BottomNavigationSpace bottomNavigationSpaceF4;
        ?? parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == 0) {
                j activity = l1();
                if (!(activity instanceof com.avito.android.bottom_navigation.space.e)) {
                    activity = null;
                }
                parentFragment = (com.avito.android.bottom_navigation.space.e) activity;
            } else {
                if (parentFragment instanceof com.avito.android.bottom_navigation.space.e) {
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
            }
        }
        com.avito.android.bottom_navigation.space.e eVar = (com.avito.android.bottom_navigation.space.e) parentFragment;
        if (eVar == null || (bottomNavigationSpaceF4 = eVar.f4()) == null) {
            throw new IllegalStateException("TabBaseFragment must be inside BottomNavigationSpaceFragment!");
        }
        return bottomNavigationSpaceF4;
    }

    public final A y5() {
        ActivityC22955m activity = l1();
        A a12 = activity != null ? C.a(activity) : null;
        if (a12 != null) {
            return a12;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void z5(@k Bundle bundle) {
        f fVar = this.f304617q0;
        if (fVar == null) {
            fVar = (f) new P0(this).a(f.class);
        }
        this.f304617q0 = fVar;
        fVar.f304624E = bundle;
    }

    public /* synthetic */ TabBaseFragment(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabBaseFragment(@I int i12) {
        super(i12);
        this.f304614n0 = new NavigationState(true, null, 2, 0 == true ? 1 : 0);
        this.f304618r0 = UUID.randomUUID().toString();
        this.f304619s0 = C42727D.c(new a());
    }
}
