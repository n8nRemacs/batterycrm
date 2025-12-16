package com.avito.android.video_requirements.view;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import iN0.InterfaceC41321b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lN0.InterfaceC43660a;
import oN0.C44668a;
import pN0.InterfaceC46980a;
import pN0.InterfaceC46982c;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: VideoRequirementsDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/video_requirements/view/VideoRequirementsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoRequirementsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f326034r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f326035s0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f326036h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.video_requirements.view.d f326037i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final O0 f326038j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final C35968w3 f326039k0;

    /* renamed from: l0, reason: collision with root package name */
    @k
    public final C47313c f326040l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final C47313c f326041m0;

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final C47313c f326042n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final C47313c f326043o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final C47313c f326044p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final C47313c f326045q0;

    /* compiled from: VideoRequirementsDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/video_requirements/view/VideoRequirementsDialog$a;", "", "<init>", "()V", "", "VIDEO_REQUIREMENTS_DIALOG_TAG", "Ljava/lang/String;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VideoRequirementsDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC46982c, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(InterfaceC46982c interfaceC46982c) {
            InterfaceC46982c interfaceC46982c2 = interfaceC46982c;
            VideoRequirementsDialog videoRequirementsDialog = (VideoRequirementsDialog) this.receiver;
            a aVar = VideoRequirementsDialog.f326034r0;
            videoRequirementsDialog.getClass();
            if (interfaceC46982c2 instanceof InterfaceC46982c.b) {
                Fragment parentFragment = videoRequirementsDialog.getParentFragment();
                InterfaceC41321b interfaceC41321b = parentFragment instanceof InterfaceC41321b ? (InterfaceC41321b) parentFragment : null;
                if (interfaceC41321b != null) {
                    Long l12 = ((VideoRequirementsOpenParams) videoRequirementsDialog.f326039k0.getValue(videoRequirementsDialog, VideoRequirementsDialog.f326035s0[0])).f326053b;
                    interfaceC41321b.c2(l12 != null ? Integer.valueOf((int) l12.longValue()) : null);
                }
            } else {
                if (!(interfaceC46982c2 instanceof InterfaceC46982c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Fragment parentFragment2 = videoRequirementsDialog.getParentFragment();
                InterfaceC41321b interfaceC41321b2 = parentFragment2 instanceof InterfaceC41321b ? (InterfaceC41321b) parentFragment2 : null;
                if (interfaceC41321b2 != null) {
                    interfaceC41321b2.W(videoRequirementsDialog.getResources().getString(R.string.video_requirements_error_toast_bar));
                }
                videoRequirementsDialog.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoRequirementsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpN0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LpN0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<pN0.d, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(pN0.d dVar) {
            a aVar = VideoRequirementsDialog.f326034r0;
            VideoRequirementsDialog videoRequirementsDialog = VideoRequirementsDialog.this;
            C44668a c44668a = dVar.f428516a;
            if (c44668a != null) {
                C44668a.C12184a c12184a = c44668a.f419740a;
                C47313c c47313c = videoRequirementsDialog.f326040l0;
                n<Object> nVar = VideoRequirementsDialog.f326035s0[1];
                View viewFindViewById = ((View) c47313c.a()).findViewById(R.id.video_requirements_title);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                String str = c12184a.f419741a;
                if (str != null) {
                    textView.setText(str);
                    D6.H(textView);
                }
                videoRequirementsDialog.f5().removeAllViews();
                for (C44668a.C12184a.C12185a c12185a : c12184a.f419742b) {
                    String str2 = c12185a.f419743a;
                    n<Object> nVar2 = VideoRequirementsDialog.f326035s0[1];
                    com.avito.android.video_requirements.view.b bVar = new com.avito.android.video_requirements.view.b(((View) c47313c.a()).getContext());
                    if (str2 != null) {
                        bVar.setTitle(str2);
                    }
                    String str3 = c12185a.f419744b;
                    if (str3 != null) {
                        bVar.setDescription(str3);
                    }
                    videoRequirementsDialog.f5().addView(bVar);
                }
                D6.H(videoRequirementsDialog.f5());
                C47313c c47313c2 = videoRequirementsDialog.f326042n0;
                n<Object>[] nVarArr = VideoRequirementsDialog.f326035s0;
                n<Object> nVar3 = nVarArr[3];
                D6.H((TextView) c47313c2.a());
                D6.H(videoRequirementsDialog.f5());
                C47313c c47313c3 = videoRequirementsDialog.f326045q0;
                n<Object> nVar4 = nVarArr[6];
                D6.w((LinearLayout) c47313c3.a());
                C47313c c47313c4 = videoRequirementsDialog.f326043o0;
                n<Object> nVar5 = nVarArr[4];
                D6.w((ShimmerLayout) c47313c4.a());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f326047l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f326047l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f326047l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VideoRequirementsDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f326049l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f326049l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f326049l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326050l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326050l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f326050l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326051l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326051l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f326051l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VideoRequirementsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/video_requirements/view/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/video_requirements/view/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.video_requirements.view.c> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.video_requirements.view.c invoke() {
            com.avito.android.video_requirements.view.d dVar = VideoRequirementsDialog.this.f326037i0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.video_requirements.view.c) dVar.get();
        }
    }

    static {
        Y y12 = new Y(VideoRequirementsDialog.class, "openParams", "getOpenParams()Lcom/avito/android/video_requirements/view/VideoRequirementsOpenParams;", 0);
        n0 n0Var = m0.f406844a;
        f326035s0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(VideoRequirementsDialog.class, "rootView", "getRootView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(VideoRequirementsDialog.class, "closeButton", "getCloseButton()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(VideoRequirementsDialog.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(VideoRequirementsDialog.class, "titleSkeleton", "getTitleSkeleton()Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(VideoRequirementsDialog.class, "parametersList", "getParametersList()Landroid/widget/LinearLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(VideoRequirementsDialog.class, "parametersListSkeleton", "getParametersListSkeleton()Landroid/widget/LinearLayout;", 0, n0Var)};
        f326034r0 = new a(null);
    }

    public VideoRequirementsDialog() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f326038j0 = new O0(m0.f406844a.b(com.avito.android.video_requirements.view.c.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f326039k0 = new C35968w3(this);
        this.f326040l0 = new C47313c(null, 1, null);
        this.f326041m0 = new C47313c(null, 1, null);
        this.f326042n0 = new C47313c(null, 1, null);
        this.f326043o0 = new C47313c(null, 1, null);
        this.f326044p0 = new C47313c(null, 1, null);
        this.f326045q0 = new C47313c(null, 1, null);
    }

    public final LinearLayout f5() {
        C47313c c47313c = this.f326044p0;
        n<Object> nVar = f326035s0[5];
        return (LinearLayout) c47313c.a();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        ((InterfaceC43660a.b) C29972i.a(C29972i.b(this), InterfaceC43660a.b.class)).bh().a((VideoRequirementsOpenParams) this.f326039k0.getValue(this, f326035s0[0]), cv.c.d(this)).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(requireContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        j.b(dVar, false, 4);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.T();
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.deeplink_handler.view.d dVar = this.f326036h0;
        if (dVar == null) {
            dVar = null;
        }
        d.a.b(dVar, this, null, 30);
        View viewInflate = layoutInflater.inflate(R.layout.video_requirements_bottom_sheet, viewGroup);
        C47313c c47313c = this.f326040l0;
        n<Object>[] nVarArr = f326035s0;
        n<Object> nVar = nVarArr[1];
        c47313c.b(this, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.video_requirements_close);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        imageView.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 14));
        C47313c c47313c2 = this.f326041m0;
        n<Object> nVar2 = nVarArr[2];
        c47313c2.b(this, imageView);
        View viewFindViewById2 = viewInflate.findViewById(R.id.video_requirements_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c3 = this.f326042n0;
        n<Object> nVar3 = nVarArr[3];
        c47313c3.b(this, (TextView) viewFindViewById2);
        View viewFindViewById3 = viewInflate.findViewById(R.id.video_requirements_title_skeleton);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        C47313c c47313c4 = this.f326043o0;
        n<Object> nVar4 = nVarArr[4];
        c47313c4.b(this, (ShimmerLayout) viewFindViewById3);
        View viewFindViewById4 = viewInflate.findViewById(R.id.video_requirements_parameters);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        C47313c c47313c5 = this.f326044p0;
        n<Object> nVar5 = nVarArr[5];
        c47313c5.b(this, (LinearLayout) viewFindViewById4);
        View viewFindViewById5 = viewInflate.findViewById(R.id.video_requirements_parameters_skeleton);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        C47313c c47313c6 = this.f326045q0;
        n<Object> nVar6 = nVarArr[6];
        c47313c6.b(this, (LinearLayout) viewFindViewById5);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.video_requirements.view.c) this.f326038j0.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new b(1, this, VideoRequirementsDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/video_requirements/mvi/entity/VideoRequirementsOneTimeEvent;)V", 0), new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((com.avito.android.video_requirements.view.c) this.f326038j0.getValue()).accept(new InterfaceC46980a.C12269a((VideoRequirementsOpenParams) this.f326039k0.getValue(this, f326035s0[0])));
    }
}
