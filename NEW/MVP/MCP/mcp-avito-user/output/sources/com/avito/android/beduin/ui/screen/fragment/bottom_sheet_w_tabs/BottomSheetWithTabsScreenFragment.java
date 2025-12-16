package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.C22823h0;
import androidx.core.view.F0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.network.model.screen.BottomSheetWithTabsScreenModel;
import com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.o;
import com.avito.android.beduin.ui.screen.fragment.tab.b;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import com.avito.android.gallery.ui.GalleryView;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.Image;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import gj.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import pi.C47093d;
import qK0.C47312b;
import qK0.C47313c;
import qi.InterfaceC47401b;
import yi.C50254a;
import z1.AbstractC50339a;

/* compiled from: BottomSheetWithTabsScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/BottomSheetWithTabsScreenFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/BeduinBaseScreenFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomSheetWithTabsScreenFragment extends BeduinBaseScreenFragment<com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.i> implements InterfaceC28477j.b {

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public static final a f104203P0;

    /* renamed from: Q0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f104204Q0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104205A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104206B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104207C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104208D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104209E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104210F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104211G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final C47312b f104212H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final Object f104213I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.beduin.ui.screen.fragment.tab.g f104214J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.component.adapter.a f104215K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final c f104216L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f104217M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.domain.screen.analytics.a f104218N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public final O0 f104219O0;

    /* compiled from: BottomSheetWithTabsScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/BottomSheetWithTabsScreenFragment$a;", "", "<init>", "()V", "", "KEY_GALLERY_CURRENT_POSITION", "Ljava/lang/String;", "", "REQ_GALLERY", "I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetWithTabsScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = BottomSheetWithTabsScreenFragment.this;
            o oVar = bottomSheetWithTabsScreenFragment.f104119n0;
            if (oVar == null) {
                oVar = null;
            }
            return oVar.a(BottomSheetWithTabsScreenModel.class, bottomSheetWithTabsScreenFragment.s5());
        }
    }

    /* compiled from: BottomSheetWithTabsScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/BottomSheetWithTabsScreenFragment$c", "Landroidx/recyclerview/widget/RecyclerView$g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.g {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            a aVar = BottomSheetWithTabsScreenFragment.f104203P0;
            BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = BottomSheetWithTabsScreenFragment.this;
            n<Object> nVar = BottomSheetWithTabsScreenFragment.f104204Q0[7];
            D6.H((RecyclerView) bottomSheetWithTabsScreenFragment.f104212H0.a());
        }
    }

    /* compiled from: BottomSheetWithTabsScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f104223b;

        public e(Y41.l lVar) {
            this.f104223b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f104223b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f104223b;
        }

        public final int hashCode() {
            return this.f104223b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104223b.invoke(obj);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BottomSheetWithTabsScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f104225l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f104225l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104225l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104226l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104226l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104226l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104227l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104227l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104227l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {
        @Override // Y41.a
        public final P0.c invoke() {
            throw null;
        }
    }

    /* compiled from: BottomSheetWithTabsScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tab/b;", "invoke", "()Lcom/avito/android/beduin/ui/screen/fragment/tab/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.beduin.ui.screen.fragment.tab.b> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.beduin.ui.screen.fragment.tab.b invoke() {
            return new com.avito.android.beduin.ui.screen.fragment.tab.b(BottomSheetWithTabsScreenFragment.this.requireContext());
        }
    }

    static {
        Y y12 = new Y(BottomSheetWithTabsScreenFragment.class, "tabLayout", "getTabLayout()Lcom/avito/android/lib/design/tab_layout/AvitoTabLayout;", 0);
        n0 n0Var = m0.f406844a;
        f104204Q0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetWithTabsScreenFragment.class, "viewPager", "getViewPager()Landroidx/viewpager/widget/ViewPager;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetWithTabsScreenFragment.class, "galleryView", "getGalleryView()Lcom/avito/android/gallery/ui/GalleryView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetWithTabsScreenFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetWithTabsScreenFragment.class, "bottomSheetToolbar", "getBottomSheetToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetWithTabsScreenFragment.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetWithTabsScreenFragment.class, "motionLayout", "getMotionLayout()Landroidx/constraintlayout/motion/widget/MotionLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetWithTabsScreenFragment.class, "extraContentRecyclerView", "getExtraContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f104203P0 = new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetWithTabsScreenFragment() {
        super(R.layout.beduin_bottom_sheet_w_tabs_fragment);
        int i12 = 1;
        this.f104205A0 = new C47313c(null, i12, 0 == true ? 1 : 0);
        this.f104206B0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104207C0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104208D0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104209E0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104210F0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104211G0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104212H0 = new C47312b(null, 1, null);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f104213I0 = C42727D.b(lazyThreadSafetyMode, new k());
        this.f104215K0 = new com.avito.android.beduin.common.component.adapter.a(Integer.valueOf(y6.b(24)));
        this.f104216L0 = new c();
        this.f104217M0 = -1;
        b bVar = new b();
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new g(new f()));
        this.f104219O0 = new O0(m0.f406844a.b(com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.j.class), new h(interfaceC42726CB), bVar, new i(interfaceC42726CB));
    }

    public final ViewPager A5() {
        C47313c c47313c = this.f104206B0;
        n<Object> nVar = f104204Q0[1];
        return (ViewPager) c47313c.a();
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        for (InterfaceC23487e interfaceC23487e : getChildFragmentManager().P()) {
            if (interfaceC23487e instanceof gj.i) {
                gj.i iVar = (gj.i) interfaceC23487e;
                if (iVar.B0(str) != null) {
                    return iVar.B0(str);
                }
            }
            if (interfaceC23487e instanceof com.avito.android.beduin.ui.screen.fragment.tab.a) {
                com.avito.android.beduin.ui.screen.fragment.tab.a aVar = (com.avito.android.beduin.ui.screen.fragment.tab.a) interfaceC23487e;
                if (aVar.B0(str) != null) {
                    return aVar.B0(str);
                }
            }
        }
        return null;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, gj.i
    @Y61.k
    public final gj.o c1() {
        MotionLayout motionLayoutX5 = x5();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
        return new gj.o(new o.a(motionLayoutX5, toastBarPosition), new o.a(x5(), toastBarPosition));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1) {
            w5().setCurrentItem(intent != null ? intent.getIntExtra("image_position", 0) : 0);
        }
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f104215K0.registerAdapterDataObserver(this.f104216L0);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Window window = requireActivity().getWindow();
        F0.a(window, false);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        this.f104217M0 = bundle != null ? bundle.getInt("key_gallery_current_position") : -1;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f104215K0.unregisterAdapterDataObserver(this.f104216L0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key_gallery_current_position", w5().getCurrentPosition());
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) view.findViewById(R.id.tab_layout);
        C47313c c47313c = this.f104205A0;
        n<Object>[] nVarArr = f104204Q0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, avitoTabLayout);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        C47313c c47313c2 = this.f104206B0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, viewPager);
        GalleryView galleryView = (GalleryView) view.findViewById(R.id.gallery);
        galleryView.setSaveImageScrollState(false);
        C47313c c47313c3 = this.f104207C0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, galleryView);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c4 = this.f104208D0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, toolbar);
        Toolbar toolbar2 = (Toolbar) view.findViewById(R.id.tabs_toolbar);
        C47313c c47313c5 = this.f104209E0;
        n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, toolbar2);
        TextView textView = (TextView) view.findViewById(R.id.title);
        C47313c c47313c6 = this.f104210F0;
        n<Object> nVar6 = nVarArr[5];
        c47313c6.b(this, textView);
        MotionLayout motionLayout = (MotionLayout) view.findViewById(R.id.motion_layout);
        motionLayout.setTransitionListener(new d());
        C47313c c47313c7 = this.f104211G0;
        n<Object> nVar7 = nVarArr[6];
        c47313c7.b(this, motionLayout);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rating_preview_recycler_view);
        n<Object> nVar8 = nVarArr[7];
        C47312b c47312b = this.f104212H0;
        c47312b.b(this, recyclerView);
        n<Object> nVar9 = nVarArr[7];
        com.avito.android.beduin_shared.model.utils.h.b((RecyclerView) c47312b.a(), this.f104215K0);
        z5().setBackgroundColor(androidx.core.content.d.getColor(z5().getContext(), R.color.legacy_transparent_black));
        n<Object> nVar10 = nVarArr[4];
        final int i12 = 0;
        ((Toolbar) c47313c5.a()).setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BottomSheetWithTabsScreenFragment f104233c;

            {
                this.f104233c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = this.f104233c;
                switch (i12) {
                    case 0:
                        BottomSheetWithTabsScreenFragment.a aVar = BottomSheetWithTabsScreenFragment.f104203P0;
                        break;
                    default:
                        BottomSheetWithTabsScreenFragment.a aVar2 = BottomSheetWithTabsScreenFragment.f104203P0;
                        break;
                }
                return bottomSheetWithTabsScreenFragment.x5().onTouchEvent(motionEvent);
            }
        });
        final int i13 = 1;
        view.findViewById(R.id.top_bar).setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BottomSheetWithTabsScreenFragment f104233c;

            {
                this.f104233c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment = this.f104233c;
                switch (i13) {
                    case 0:
                        BottomSheetWithTabsScreenFragment.a aVar = BottomSheetWithTabsScreenFragment.f104203P0;
                        break;
                    default:
                        BottomSheetWithTabsScreenFragment.a aVar2 = BottomSheetWithTabsScreenFragment.f104203P0;
                        break;
                }
                return bottomSheetWithTabsScreenFragment.x5().onTouchEvent(motionEvent);
            }
        });
        C22823h0.K(z5(), new FX0.b((Guideline) requireView().findViewById(R.id.top_insets_guideline), (Guideline) requireView().findViewById(R.id.guideline), this, 6));
        com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.j jVarQ5 = q5();
        jVarQ5.f104258P.observe(getViewLifecycleOwner(), new e(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.g(1, this, BottomSheetWithTabsScreenFragment.class, "openLocalDeeplink", "openLocalDeeplink(Lcom/avito/android/beduin/common/local_deeplink/BeduinLocalDeeplink;)V", 0)));
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    @Y61.k
    public final Class<? extends InterfaceC47401b> r5() {
        return BottomSheetWithTabsScreenModel.class;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    public final void t5(@Y61.k com.avito.android.beduin.di.screen.b bVar) {
        bVar.a(this);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    public final void u5(com.avito.android.beduin.ui.screen.fragment.i iVar, com.avito.android.beduin.ui.screen.fragment.i iVar2) {
        List<Image> listB;
        BeduinTabLayout beduinTabLayout;
        com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.i iVar3 = (com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.i) iVar;
        com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.i iVar4 = (com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.i) iVar2;
        pi.e eVar = iVar3 != null ? iVar3.f104240a : null;
        pi.e eVar2 = iVar4.f104240a;
        boolean zF2 = L.f(eVar, eVar2);
        C47313c c47313c = this.f104210F0;
        n<Object>[] nVarArr = f104204Q0;
        if (!zF2 && eVar2 != null) {
            com.avito.android.beduin.ui.util.g.b(z5(), eVar2, R.color.legacy_constant_black, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.e(this));
            C47313c c47313c2 = this.f104209E0;
            n<Object> nVar = nVarArr[4];
            com.avito.android.beduin.ui.util.g.b((Toolbar) c47313c2.a(), eVar2, R.color.legacy_black, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.f(this));
            n<Object> nVar2 = nVarArr[4];
            ((Toolbar) c47313c2.a()).setTitle(eVar2.getTitle());
            n<Object> nVar3 = nVarArr[5];
            ((TextView) c47313c.a()).setText(eVar2.getTitle());
        }
        List<C50254a> list = (iVar3 == null || (beduinTabLayout = iVar3.f104242c) == null) ? null : beduinTabLayout.f104411c;
        BeduinTabLayout beduinTabLayout2 = iVar4.f104242c;
        if (!L.f(list, beduinTabLayout2.f104411c)) {
            y5().f180837F.clear();
            this.f104214J0 = new com.avito.android.beduin.ui.screen.fragment.tab.g(this, beduinTabLayout2);
            AvitoTabLayout avitoTabLayoutY5 = y5();
            com.avito.android.beduin.ui.screen.fragment.tab.b bVar = (com.avito.android.beduin.ui.screen.fragment.tab.b) this.f104213I0.getValue();
            bVar.getClass();
            if (b.a.f104298a[beduinTabLayout2.f104410b.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            List<C50254a> list2 = beduinTabLayout2.f104411c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new CommonTab(((C50254a) it.next()).f443470b, null, 2, null));
            }
            com.avito.android.lib.deprecated_design.tab.adapter.k kVar = new com.avito.android.lib.deprecated_design.tab.adapter.k();
            kVar.E5(arrayList);
            com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayoutY5, new com.avito.android.lib.deprecated_design.tab.adapter.c(kVar, bVar.f104297a, R.layout.beduin_tab_big, null, 8, null));
            A5().setAdapter(this.f104214J0);
            y5().a(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.c(this));
            AvitoTabLayout avitoTabLayoutY52 = y5();
            AvitoTabLayout avitoTabLayoutY53 = y5();
            int i12 = beduinTabLayout2.f104409a;
            avitoTabLayoutY52.q(avitoTabLayoutY53.j(i12), true);
            com.avito.android.lib.design.tab_layout.util.b.a(A5(), y5());
            A5().setCurrentItem(i12);
            A5().c(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.d(this, beduinTabLayout2));
        }
        C47093d c47093d = iVar4.f104241b;
        if (iVar3 == null || !L.f(iVar3.f104241b, c47093d)) {
            if (c47093d == null || (listB = c47093d.b()) == null || listB.isEmpty()) {
                x5().setTransition(R.id.expanded_title_transition);
                x5().w(R.id.expanded_with_title);
                x5().m();
                n<Object> nVar4 = nVarArr[5];
                ((TextView) c47313c.a()).setAlpha(1.0f);
            } else {
                x5().E();
                w5().a(getChildFragmentManager(), c47093d.b(), new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.a(this, c47093d, beduinTabLayout2), new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.a(beduinTabLayout2, this, c47093d), this.f104217M0, requireContext().getResources().getConfiguration().orientation != 2 ? 6 : 2);
            }
        }
        com.avito.android.beduin_shared.model.utils.l.a(q5().f104245S, this.f104215K0, this.f104128w0);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    @Y61.k
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public final com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.j q5() {
        return (com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.j) this.f104219O0.getValue();
    }

    public final GalleryView w5() {
        C47313c c47313c = this.f104207C0;
        n<Object> nVar = f104204Q0[2];
        return (GalleryView) c47313c.a();
    }

    public final MotionLayout x5() {
        C47313c c47313c = this.f104211G0;
        n<Object> nVar = f104204Q0[6];
        return (MotionLayout) c47313c.a();
    }

    public final AvitoTabLayout y5() {
        C47313c c47313c = this.f104205A0;
        n<Object> nVar = f104204Q0[0];
        return (AvitoTabLayout) c47313c.a();
    }

    public final Toolbar z5() {
        C47313c c47313c = this.f104208D0;
        n<Object> nVar = f104204Q0[3];
        return (Toolbar) c47313c.a();
    }

    /* compiled from: BottomSheetWithTabsScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/BottomSheetWithTabsScreenFragment$d", "Lcom/avito/android/beduin/ui/util/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements com.avito.android.beduin.ui.util.a {
        public d() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
        public final void a(int i12) {
            a aVar = BottomSheetWithTabsScreenFragment.f104203P0;
            BottomSheetWithTabsScreenFragment.this.w5().requestLayout();
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
        public final void b() {
        }
    }
}
