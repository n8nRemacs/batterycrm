package ru.cyberity.cbr.camera.photo.presentation.selfie;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.presentation.CBRAnalyticsScreenMapper;
import ru.cyberity.cbr.core.widget.CBRToolbarView;
import ru.cyberity.internal.R;

/* compiled from: CBRSelfieWithDocumentPickerFragment.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u001d\u0010%\u001a\u0004\u0018\u00010!8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u0004\u0018\u00010&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b'\u0010(R\u001d\u0010,\u001a\u0004\u0018\u00010&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010(R\u001d\u0010/\u001a\u0004\u0018\u00010&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b.\u0010(R\u001d\u00101\u001a\u0004\u0018\u00010!8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b0\u0010$R\u001d\u00103\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b2\u0010\u0011R\u001d\u00108\u001a\u0004\u0018\u0001048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010D\u001a\u00020?8\u0016X\u0096D¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\u00020?8\u0016X\u0096D¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\b\u000e\u0010CR\u0014\u0010J\u001a\u00020G8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/selfie/a;", "Lru/cyberity/cbr/camera/b;", "Lru/cyberity/cbr/camera/photo/presentation/selfie/b;", "<init>", "()V", "", "getLayoutId", "()I", "s", "Lkotlin/C;", "D", "()Lru/cyberity/cbr/camera/photo/presentation/selfie/b;", "viewModel", "Landroid/view/View;", "t", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "o", "()Landroid/view/View;", "rootView", "u", "q", "takePictureView", "v", "z", "takeGalleryView", "Lru/cyberity/cbr/core/widget/CBRToolbarView;", "w", "r", "()Lru/cyberity/cbr/core/widget/CBRToolbarView;", "toolbar", "x", "n", "progressBar", "Landroid/view/ViewGroup;", "y", "C", "()Landroid/view/ViewGroup;", "helperView", "Landroid/widget/TextView;", "h", "()Landroid/widget/TextView;", "helperTitle", "A", "e", "helperBrief", "B", "f", "helperDetails", "g", "helperDetailsFrame", "c", "darkOverlay", "Landroidx/camera/view/PreviewView;", "E", "m", "()Landroidx/camera/view/PreviewView;", "previewView", "Lru/cyberity/cbr/core/analytics/Screen;", "F", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "", "G", "Z", "p", "()Z", "shouldShowFlash", "H", "isFrontFacingCamera", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "I", "a", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends ru.cyberity.cbr.camera.b<ru.cyberity.cbr.camera.photo.presentation.selfie.b> {

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: J, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f432412J;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowFlash;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.camera.photo.presentation.selfie.b.class), new c(new b(this)), new d());

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView rootView = i0.a(this, R.id.cbr_progress);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView takePictureView = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView takeGalleryView = i0.a(this, R.id.cbr_gallery);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView toolbar = i0.a(this, R.id.cbr_toolbar);

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView progressBar = i0.a(this, R.id.cbr_progress);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView helperView = i0.a(this, R.id.cbr_helper);

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView helperTitle = i0.a(this, R.id.cbr_helper_title);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView helperBrief = i0.a(this, R.id.cbr_helper_brief);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView helperDetails = i0.a(this, R.id.cbr_helper_details);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView helperDetailsFrame = i0.a(this, R.id.cbr_helper_details_frame);

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView darkOverlay = i0.a(this, R.id.cbr_dark_overlay);

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView previewView = i0.a(this, R.id.cbr_camera_preview);

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    @k
    private final Screen screen = CBRAnalyticsScreenMapper.INSTANCE.getScreenByFragment(this);

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final boolean isFrontFacingCamera = true;

    /* compiled from: CBRSelfieWithDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/selfie/a$a;", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "", AdvertDetailsBlockIdKt.GALLERY_BLOCK, "Lru/cyberity/cbr/camera/photo/presentation/selfie/a;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.photo.presentation.selfie.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a(@k DocumentType type, boolean gallery) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_DOCUMENT_TYPE", type.getValue());
            bundle.putBoolean("EXTRA_GALLERY_AVAILABLE", gallery);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f432429a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f432429a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f432429a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f432430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f432430a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f432430a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRSelfieWithDocumentPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<P0.c> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            return new ru.cyberity.cbr.camera.photo.presentation.selfie.c(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "rootView", "getRootView()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f432412J = new n[]{n0Var.i(h0Var), C0.k(a.class, "takePictureView", "getTakePictureView()Landroid/view/View;", 0, n0Var), C0.k(a.class, "takeGalleryView", "getTakeGalleryView()Landroid/view/View;", 0, n0Var), C0.k(a.class, "toolbar", "getToolbar()Lru/cyberity/cbr/core/widget/CBRToolbarView;", 0, n0Var), C0.k(a.class, "progressBar", "getProgressBar()Landroid/view/View;", 0, n0Var), C0.k(a.class, "helperView", "getHelperView()Landroid/view/ViewGroup;", 0, n0Var), C0.k(a.class, "helperTitle", "getHelperTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "helperBrief", "getHelperBrief()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "helperDetails", "getHelperDetails()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "helperDetailsFrame", "getHelperDetailsFrame()Landroid/view/ViewGroup;", 0, n0Var), C0.k(a.class, "darkOverlay", "getDarkOverlay()Landroid/view/View;", 0, n0Var), C0.k(a.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ViewGroup i() {
        return (ViewGroup) this.helperView.a(this, f432412J[5]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.camera.photo.presentation.selfie.b getViewModel() {
        return (ru.cyberity.cbr.camera.photo.presentation.selfie.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public View c() {
        return this.darkOverlay.a(this, f432412J[10]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public TextView e() {
        return (TextView) this.helperBrief.a(this, f432412J[7]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public TextView f() {
        return (TextView) this.helperDetails.a(this, f432412J[8]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        return getViewModel().getType().getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_document_picker;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public TextView h() {
        return (TextView) this.helperTitle.a(this, f432412J[6]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public PreviewView m() {
        return (PreviewView) this.previewView.a(this, f432412J[11]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public View n() {
        return this.progressBar.a(this, f432412J[4]);
    }

    @Override // ru.cyberity.cbr.camera.a
    /* renamed from: p, reason: from getter */
    public boolean getShouldShowFlash() {
        return this.shouldShowFlash;
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public View q() {
        return this.takePictureView.a(this, f432412J[1]);
    }

    @Override // ru.cyberity.cbr.camera.a
    @l
    public CBRToolbarView r() {
        return (CBRToolbarView) this.toolbar.a(this, f432412J[3]);
    }

    @Override // ru.cyberity.cbr.camera.a
    /* renamed from: t, reason: from getter */
    public boolean getIsFrontFacingCamera() {
        return this.isFrontFacingCamera;
    }

    @Override // ru.cyberity.cbr.camera.b
    @l
    public View z() {
        return this.takeGalleryView.a(this, f432412J[2]);
    }
}
