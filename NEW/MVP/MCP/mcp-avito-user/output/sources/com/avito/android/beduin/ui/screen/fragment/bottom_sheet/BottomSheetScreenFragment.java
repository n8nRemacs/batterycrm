package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.F0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.AbstractC35201t;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.network.model.screen.BottomSheetScreenModel;
import com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment;
import com.avito.android.gallery.ui.GalleryView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import qi.InterfaceC47401b;
import z1.AbstractC50339a;
import zi.C50569a;

/* compiled from: BottomSheetScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/BottomSheetScreenFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/BeduinBaseScreenFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/n;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomSheetScreenFragment extends BeduinBaseScreenFragment<n> implements InterfaceC28477j.b {

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public static final a f104149R0;

    /* renamed from: S0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f104150S0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104151A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104152B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104153C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104154D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104155E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public Button f104156F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public Button f104157G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104158H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f104159I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104160J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public C50569a f104161K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public AbstractC35201t f104162L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f104163M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f104164N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public Object f104165O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public q f104166P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public final O0 f104167Q0;

    /* compiled from: BottomSheetScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/BottomSheetScreenFragment$a;", "", "<init>", "()V", "", "ARG_THEME", "Ljava/lang/String;", "BOTTOM_SHEET_TAB_FRAGMENT_TAG", "KEY_GALLERY_CURRENT_POSITION", "", "REQ_GALLERY", "I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            BottomSheetScreenFragment bottomSheetScreenFragment = BottomSheetScreenFragment.this;
            com.avito.android.beduin.ui.screen.fragment.o oVar = bottomSheetScreenFragment.f104119n0;
            if (oVar == null) {
                oVar = null;
            }
            return oVar.a(BottomSheetScreenModel.class, bottomSheetScreenFragment.s5());
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BottomSheetScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f104171l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f104171l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104171l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104172l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104172l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104172l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104173l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104173l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104173l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {
        @Override // Y41.a
        public final P0.c invoke() {
            throw null;
        }
    }

    /* compiled from: BottomSheetScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<BeduinComponentTheme> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final BeduinComponentTheme invoke() {
            BeduinComponentTheme beduinComponentTheme = (BeduinComponentTheme) BottomSheetScreenFragment.this.requireArguments().getParcelable("arg_theme");
            return beduinComponentTheme == null ? BeduinComponentTheme.AVITO : beduinComponentTheme;
        }
    }

    static {
        Y y12 = new Y(BottomSheetScreenFragment.class, "galleryView", "getGalleryView()Lcom/avito/android/gallery/ui/GalleryView;", 0);
        n0 n0Var = m0.f406844a;
        f104150S0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetScreenFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetScreenFragment.class, "bottomSheetToolbar", "getBottomSheetToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetScreenFragment.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetScreenFragment.class, "motionLayout", "getMotionLayout()Landroidx/constraintlayout/motion/widget/MotionLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BottomSheetScreenFragment.class, "navigation", "getNavigation()Lcom/avito/android/lib/design/chips/Chips;", 0, n0Var)};
        f104149R0 = new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScreenFragment() {
        int i12 = 1;
        super(0, i12, null);
        this.f104151A0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104152B0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104153C0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104154D0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104155E0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104158H0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104159I0 = new io.reactivex.rxjava3.disposables.c();
        this.f104160J0 = C42727D.c(new i());
        this.f104164N0 = -1;
        this.f104165O0 = C42784z0.f406748b;
        b bVar = new b();
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f104167Q0 = new O0(m0.f406844a.b(com.avito.android.beduin.ui.screen.fragment.k.class), new f(interfaceC42726CB), bVar, new g(interfaceC42726CB));
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        InterfaceC23487e interfaceC23487eH = getChildFragmentManager().H("bottom_sheet_tab_fragment");
        com.avito.android.beduin.ui.screen.fragment.tab.a aVar = interfaceC23487eH instanceof com.avito.android.beduin.ui.screen.fragment.tab.a ? (com.avito.android.beduin.ui.screen.fragment.tab.a) interfaceC23487eH : null;
        if (aVar == null) {
            return null;
        }
        return aVar.B0(str);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, gj.i
    @Y61.k
    public final String m0() {
        InterfaceC23487e interfaceC23487eH = getChildFragmentManager().H("bottom_sheet_tab_fragment");
        com.avito.android.beduin.ui.screen.fragment.tab.a aVar = interfaceC23487eH instanceof com.avito.android.beduin.ui.screen.fragment.tab.a ? (com.avito.android.beduin.ui.screen.fragment.tab.a) interfaceC23487eH : null;
        return aVar == null ? "main" : aVar.m0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1) {
            w5().setCurrentItem(intent != null ? intent.getIntExtra("image_position", 0) : 0);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Window window = requireActivity().getWindow();
        F0.a(window, false);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        AbstractC35201t abstractC35201t = this.f104162L0;
        if (abstractC35201t == null) {
            abstractC35201t = null;
        }
        decorView.setSystemUiVisibility(abstractC35201t.D().invoke().booleanValue() ? 1280 : window.getDecorView().getSystemUiVisibility() | 8192);
        this.f104164N0 = bundle != null ? bundle.getInt("key_gallery_current_position") : -1;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(((BeduinComponentTheme) this.f104160J0.getValue()) == BeduinComponentTheme.AVITO_RE_23 ? R.layout.beduin_bottom_sheet_with_gallery_fragment_redesign : R.layout.beduin_bottom_sheet_with_gallery_fragment, viewGroup, false);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f104159I0.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key_gallery_current_position", w5().getCurrentPosition());
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        GalleryView galleryView = (GalleryView) view.findViewById(R.id.gallery);
        galleryView.setSaveImageScrollState(false);
        C47313c c47313c = this.f104151A0;
        kotlin.reflect.n<Object>[] nVarArr = f104150S0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, galleryView);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c2 = this.f104152B0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, toolbar);
        this.f104156F0 = (Button) view.findViewById(R.id.back_button);
        this.f104157G0 = (Button) view.findViewById(R.id.menu_button);
        Toolbar toolbar2 = (Toolbar) view.findViewById(R.id.tabs_toolbar);
        C47313c c47313c3 = this.f104153C0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, toolbar2);
        TextView textView = (TextView) view.findViewById(R.id.title);
        C47313c c47313c4 = this.f104154D0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, textView);
        MotionLayout motionLayout = (MotionLayout) view.findViewById(R.id.motion_layout);
        motionLayout.setTransitionListener(new c());
        C47313c c47313c5 = this.f104155E0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, motionLayout);
        z5().setBackgroundColor(androidx.core.content.d.getColor(z5().getContext(), R.color.legacy_transparent_black));
        final int i12 = 0;
        v5().setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.beduin.ui.screen.fragment.bottom_sheet.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BottomSheetScreenFragment f104176c;

            {
                this.f104176c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                BottomSheetScreenFragment bottomSheetScreenFragment = this.f104176c;
                switch (i12) {
                    case 0:
                        BottomSheetScreenFragment.a aVar = BottomSheetScreenFragment.f104149R0;
                        break;
                    default:
                        BottomSheetScreenFragment.a aVar2 = BottomSheetScreenFragment.f104149R0;
                        break;
                }
                return bottomSheetScreenFragment.x5().onTouchEvent(motionEvent);
            }
        });
        final int i13 = 1;
        view.findViewById(R.id.top_bar).setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.beduin.ui.screen.fragment.bottom_sheet.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BottomSheetScreenFragment f104176c;

            {
                this.f104176c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                BottomSheetScreenFragment bottomSheetScreenFragment = this.f104176c;
                switch (i13) {
                    case 0:
                        BottomSheetScreenFragment.a aVar = BottomSheetScreenFragment.f104149R0;
                        break;
                    default:
                        BottomSheetScreenFragment.a aVar2 = BottomSheetScreenFragment.f104149R0;
                        break;
                }
                return bottomSheetScreenFragment.x5().onTouchEvent(motionEvent);
            }
        });
        Chips chips = (Chips) view.findViewById(R.id.navigation_chips);
        C47313c c47313c6 = this.f104158H0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[5];
        c47313c6.b(this, chips);
        Guideline guideline = (Guideline) requireView().findViewById(R.id.guideline);
        requireView().findViewById(R.id.container);
        com.avito.android.lib.util.i.h(com.avito.android.lib.util.i.f181373a, requireView(), new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.d(guideline, this), 31);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    @Y61.k
    public final com.avito.android.beduin.ui.screen.fragment.k<InterfaceC47401b, n> q5() {
        return (com.avito.android.beduin.ui.screen.fragment.k) this.f104167Q0.getValue();
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    @Y61.k
    public final Class<? extends InterfaceC47401b> r5() {
        return BottomSheetScreenModel.class;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    public final void t5(@Y61.k com.avito.android.beduin.di.screen.b bVar) {
        bVar.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u5(com.avito.android.beduin.ui.screen.fragment.i r19, com.avito.android.beduin.ui.screen.fragment.i r20) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment.u5(com.avito.android.beduin.ui.screen.fragment.i, com.avito.android.beduin.ui.screen.fragment.i):void");
    }

    public final Toolbar v5() {
        C47313c c47313c = this.f104153C0;
        kotlin.reflect.n<Object> nVar = f104150S0[2];
        return (Toolbar) c47313c.a();
    }

    public final GalleryView w5() {
        C47313c c47313c = this.f104151A0;
        kotlin.reflect.n<Object> nVar = f104150S0[0];
        return (GalleryView) c47313c.a();
    }

    public final MotionLayout x5() {
        C47313c c47313c = this.f104155E0;
        kotlin.reflect.n<Object> nVar = f104150S0[4];
        return (MotionLayout) c47313c.a();
    }

    public final Chips y5() {
        C47313c c47313c = this.f104158H0;
        kotlin.reflect.n<Object> nVar = f104150S0[5];
        return (Chips) c47313c.a();
    }

    public final Toolbar z5() {
        C47313c c47313c = this.f104152B0;
        kotlin.reflect.n<Object> nVar = f104150S0[1];
        return (Toolbar) c47313c.a();
    }

    /* compiled from: BottomSheetScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/ui/screen/fragment/bottom_sheet/BottomSheetScreenFragment$c", "Lcom/avito/android/beduin/ui/util/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements com.avito.android.beduin.ui.util.a {
        public c() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
        public final void a(int i12) {
            a aVar = BottomSheetScreenFragment.f104149R0;
            BottomSheetScreenFragment.this.w5().requestLayout();
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
        public final void b() {
        }
    }
}
