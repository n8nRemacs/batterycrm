package com.avito.android.success_screen_after_apply.ui;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.r;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.success_screen_after_apply.mvi.a;
import com.avito.android.success_screen_after_apply.mvi.j;
import com.avito.android.success_screen_after_apply.mvi.m;
import com.avito.android.success_screen_after_apply.mvi.o;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyDialogFragment;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: SuccessScreenAfterApplyDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuccessScreenAfterApplyDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.analytics.provider.a f291752h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public o f291753i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final O0 f291754j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final C35968w3 f291755k0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public Button f291756l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public TextView f291757m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public TextView f291758n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public ImageLoadableView f291759o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public View f291760p0;

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f291751r0 = {m0.f406844a.e(new Y(SuccessScreenAfterApplyDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyOpenParams;", 0))};

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f291750q0 = new a(null);

    /* compiled from: SuccessScreenAfterApplyDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyDialogFragment$a;", "", "<init>", "()V", "", "SUCCESS_SCREEN_BOTTOM_SHEET_REQUEST_KEY", "Ljava/lang/String;", "SUCCESS_SCREEN_BOTTOM_SHEET_RESULT_KEY", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuccessScreenAfterApplyDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/success_screen_after_apply/ui/SuccessScreenAfterApplyDialogFragment$b", "Landroidx/activity/x;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = SuccessScreenAfterApplyDialogFragment.f291750q0;
            ((com.avito.android.success_screen_after_apply.mvi.n) SuccessScreenAfterApplyDialogFragment.this.f291754j0.getValue()).accept(a.b.f291724a);
        }
    }

    /* compiled from: SuccessScreenAfterApplyDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<com.avito.android.success_screen_after_apply.mvi.j, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.success_screen_after_apply.mvi.j jVar) {
            com.avito.android.success_screen_after_apply.mvi.j jVar2 = jVar;
            SuccessScreenAfterApplyDialogFragment successScreenAfterApplyDialogFragment = (SuccessScreenAfterApplyDialogFragment) this.receiver;
            a aVar = SuccessScreenAfterApplyDialogFragment.f291750q0;
            successScreenAfterApplyDialogFragment.getClass();
            if (jVar2 instanceof j.a) {
                successScreenAfterApplyDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("SUCCESS_SCREEN_BOTTOM_SHEET_RESULT_KEY", ((j.a) jVar2).f291742a)), "SUCCESS_SCREEN_BOTTOM_SHEET_REQUEST_KEY");
                successScreenAfterApplyDialogFragment.dismiss();
            } else if (jVar2 instanceof j.b) {
                successScreenAfterApplyDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("SUCCESS_SCREEN_BOTTOM_SHEET_RESULT_KEY", ((j.b) jVar2).f291743a)), "SUCCESS_SCREEN_BOTTOM_SHEET_REQUEST_KEY");
                successScreenAfterApplyDialogFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuccessScreenAfterApplyDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<m, G0> {
        @Override // Y41.l
        public final G0 invoke(m mVar) {
            ImageLoadableView imageLoadableView;
            m mVar2 = mVar;
            SuccessScreenAfterApplyDialogFragment successScreenAfterApplyDialogFragment = (SuccessScreenAfterApplyDialogFragment) this.receiver;
            TextView textView = successScreenAfterApplyDialogFragment.f291757m0;
            if (textView != null) {
                I5.a(textView, mVar2.f291745b, false);
            }
            Button button = successScreenAfterApplyDialogFragment.f291756l0;
            if (button != null) {
                com.avito.android.lib.design.button.b.a(button, mVar2.f291747d, false);
            }
            TextView textView2 = successScreenAfterApplyDialogFragment.f291758n0;
            if (textView2 != null) {
                I5.a(textView2, mVar2.f291746c, false);
            }
            UniversalImage universalImage = mVar2.f291748e;
            Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(successScreenAfterApplyDialogFragment.requireContext())) : null;
            if (imageDependsOnThemeOrDefault != null && (imageLoadableView = successScreenAfterApplyDialogFragment.f291759o0) != null) {
                s.a(imageLoadableView, imageDependsOnThemeOrDefault, true, true, new com.avito.android.success_screen_after_apply.ui.b(imageLoadableView), new com.avito.android.success_screen_after_apply.ui.c(imageLoadableView));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f291762l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f291762l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f291762l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SuccessScreenAfterApplyDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f291764l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f291764l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f291764l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291765l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291765l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f291765l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291766l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291766l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f291766l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SuccessScreenAfterApplyDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/success_screen_after_apply/mvi/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.success_screen_after_apply.mvi.n> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.success_screen_after_apply.mvi.n invoke() {
            o oVar = SuccessScreenAfterApplyDialogFragment.this.f291753i0;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.success_screen_after_apply.mvi.n) oVar.get();
        }
    }

    public SuccessScreenAfterApplyDialogFragment() {
        super(R.layout.success_screen_after_apply_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f291754j0 = new O0(m0.f406844a.b(com.avito.android.success_screen_after_apply.mvi.n.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f291755k0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.success_screen_after_apply.di.a.a().a((SuccessScreenAfterApplyOpenParams) this.f291755k0.getValue(this, f291751r0[0]), (com.avito.android.success_screen_after_apply.di.c) C29972i.a(C29972i.b(this), com.avito.android.success_screen_after_apply.di.c.class), cv.c.b(this)).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        r rVar = new r(requireContext(), R.style.Re23_BottomSheet_Default);
        Window window = rVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(C35835l0.d(R.attr.bg_elevation1, rVar.getContext())));
        }
        rVar.f21241d.b(new b());
        return rVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f291756l0 = null;
        this.f291757m0 = null;
        this.f291758n0 = null;
        this.f291760p0 = null;
        this.f291759o0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.lib.util.i.j(com.avito.android.lib.util.i.f181373a, view);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.success_screen_after_apply.mvi.n) this.f291754j0.getValue(), this, Lifecycle.State.f46682e, new c(1, this, SuccessScreenAfterApplyDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/success_screen_after_apply/mvi/SuccessScreenAfterApplyOneTimeEvent;)V", 0), new d(1, this, SuccessScreenAfterApplyDialogFragment.class, "renderState", "renderState(Lcom/avito/android/success_screen_after_apply/mvi/SuccessScreenAfterApplyState;)V", 0));
        View viewFindViewById = view.findViewById(R.id.success_screen_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f291757m0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.success_screen_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f291758n0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.success_screen_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f291756l0 = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.success_screen_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView");
        }
        this.f291759o0 = (ImageLoadableView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.success_screen_close);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f291760p0 = viewFindViewById5;
        Button button = this.f291756l0;
        if (button != null) {
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.success_screen_after_apply.ui.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ SuccessScreenAfterApplyDialogFragment f291778c;

                {
                    this.f291778c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SuccessScreenAfterApplyDialogFragment successScreenAfterApplyDialogFragment = this.f291778c;
                    switch (i12) {
                        case 0:
                            SuccessScreenAfterApplyDialogFragment.a aVar = SuccessScreenAfterApplyDialogFragment.f291750q0;
                            ((com.avito.android.success_screen_after_apply.mvi.n) successScreenAfterApplyDialogFragment.f291754j0.getValue()).accept(a.C8834a.f291723a);
                            break;
                        default:
                            SuccessScreenAfterApplyDialogFragment.a aVar2 = SuccessScreenAfterApplyDialogFragment.f291750q0;
                            ((com.avito.android.success_screen_after_apply.mvi.n) successScreenAfterApplyDialogFragment.f291754j0.getValue()).accept(a.b.f291724a);
                            break;
                    }
                }
            });
        }
        View view2 = this.f291760p0;
        if (view2 != null) {
            final int i13 = 1;
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.success_screen_after_apply.ui.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ SuccessScreenAfterApplyDialogFragment f291778c;

                {
                    this.f291778c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    SuccessScreenAfterApplyDialogFragment successScreenAfterApplyDialogFragment = this.f291778c;
                    switch (i13) {
                        case 0:
                            SuccessScreenAfterApplyDialogFragment.a aVar = SuccessScreenAfterApplyDialogFragment.f291750q0;
                            ((com.avito.android.success_screen_after_apply.mvi.n) successScreenAfterApplyDialogFragment.f291754j0.getValue()).accept(a.C8834a.f291723a);
                            break;
                        default:
                            SuccessScreenAfterApplyDialogFragment.a aVar2 = SuccessScreenAfterApplyDialogFragment.f291750q0;
                            ((com.avito.android.success_screen_after_apply.mvi.n) successScreenAfterApplyDialogFragment.f291754j0.getValue()).accept(a.b.f291724a);
                            break;
                    }
                }
            });
        }
    }
}
