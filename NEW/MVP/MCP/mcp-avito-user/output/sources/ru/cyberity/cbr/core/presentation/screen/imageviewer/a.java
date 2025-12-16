package ru.cyberity.cbr.core.presentation.screen.imageviewer;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.File;
import kotlin.G0;
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
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.screen.imageviewer.b;
import ru.cyberity.cbr.core.widget.CBRRotationZoomableImageView;
import ru.cyberity.internal.R;

/* compiled from: CBRImageViewerFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\t\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0005R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001f\u0010!R\u001b\u0010'\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00106\u001a\u0002038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/imageviewer/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/core/presentation/screen/imageviewer/b$b;", "Lru/cyberity/cbr/core/presentation/screen/imageviewer/b;", "<init>", "()V", "", "rotation", "Lkotlin/G0;", "a", "(Ljava/lang/Integer;)V", "getLayoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", VoiceInfo.STATE, "(Lru/cyberity/cbr/core/presentation/screen/imageviewer/b$b;Landroid/os/Bundle;)V", "onDestroyView", "Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "()Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;", "imageView", "Landroid/widget/ImageButton;", "b", "c", "()Landroid/widget/ImageButton;", "rotateCw", "rotateCcw", "d", "Lkotlin/C;", "()Lru/cyberity/cbr/core/presentation/screen/imageviewer/b;", "viewModel", "Lru/cyberity/cbr/core/analytics/Screen;", "e", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "f", "I", "navigationBarColor", "g", "statusBarColor", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "h", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<b.C12487b, ru.cyberity.cbr.core.presentation.screen.imageviewer.b> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434010i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView imageView = i0.a(this, R.id.image_view);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView rotateCw = i0.a(this, R.id.cbr_rotate_cw);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView rotateCcw = i0.a(this, R.id.cbr_rotate_ccw);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.core.presentation.screen.imageviewer.b.class), new c(new b(this)), new d());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final Screen screen = Screen.ImageViewer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int navigationBarColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int statusBarColor;

    /* compiled from: CBRImageViewerFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/imageviewer/a$a;", "", "Ljava/io/File;", "file", "", "rotation", "", "idDocSetType", "Lru/cyberity/cbr/core/presentation/screen/imageviewer/a;", "a", "ARG_IDDOCSETTYPE", "Ljava/lang/String;", "ARG_NAV_BAR_COLOR", "ARG_RESULT_ROTATION", "ARG_STATUS_BAR_COLOR", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.screen.imageviewer.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a(@k File file, int rotation, @k String idDocSetType) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("file", file);
            bundle.putInt("rotation", rotation);
            bundle.putString("arg_iddocsettype", idDocSetType);
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
        final /* synthetic */ Fragment f434018a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f434018a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434018a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434019a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f434019a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434019a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRImageViewerFragment.kt */
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
            return new ru.cyberity.cbr.core.presentation.screen.imageviewer.c(aVar, aVar.getArguments(), a.this.getServiceLocator());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "imageView", "getImageView()Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;", 0);
        n0 n0Var = m0.f406844a;
        f434010i = new n[]{n0Var.i(h0Var), C0.k(a.class, "rotateCw", "getRotateCw()Landroid/widget/ImageButton;", 0, n0Var), C0.k(a.class, "rotateCcw", "getRotateCcw()Landroid/widget/ImageButton;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final ImageButton b() {
        return (ImageButton) this.rotateCcw.a(this, f434010i[2]);
    }

    private final ImageButton c() {
        return (ImageButton) this.rotateCw.a(this, f434010i[1]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.core.presentation.screen.imageviewer.b getViewModel() {
        return (ru.cyberity.cbr.core.presentation.screen.imageviewer.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg_iddocsettype") : null;
        return string == null ? "TYPE_UNKNOWN" : string;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_layout_image_viewer;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@l Bundle savedInstanceState) {
        Window window;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.navigationBarColor = savedInstanceState.getInt("nav_bar_color");
            this.statusBarColor = savedInstanceState.getInt("status_bar_color");
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || (window = activityC22955mL1.getWindow()) == null) {
            return;
        }
        this.statusBarColor = window.getStatusBarColor();
        this.navigationBarColor = window.getNavigationBarColor();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        super.onDestroyView();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || (window = activityC22955mL1.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(this.statusBarColor);
        window.setNavigationBarColor(this.navigationBarColor);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@k Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("nav_bar_color", this.navigationBarColor);
        outState.putInt("status_bar_color", this.statusBarColor);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setBackgroundColor(this.statusBarColor);
        ImageButton imageButtonC = c();
        if (imageButtonC != null) {
            final int i12 = 0;
            imageButtonC.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.core.presentation.screen.imageviewer.d

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f434043c;

                {
                    this.f434043c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            a.a(this.f434043c, view2);
                            break;
                        default:
                            a.b(this.f434043c, view2);
                            break;
                    }
                }
            });
        }
        ImageButton imageButtonB = b();
        if (imageButtonB != null) {
            final int i13 = 1;
            imageButtonB.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.core.presentation.screen.imageviewer.d

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f434043c;

                {
                    this.f434043c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            a.a(this.f434043c, view2);
                            break;
                        default:
                            a.b(this.f434043c, view2);
                            break;
                    }
                }
            });
        }
        Bundle arguments = getArguments();
        a(arguments != null ? Integer.valueOf(arguments.getInt("rotation")) : null);
    }

    private final CBRRotationZoomableImageView a() {
        return (CBRRotationZoomableImageView) this.imageView.a(this, f434010i[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        CBRRotationZoomableImageView cBRRotationZoomableImageViewA = aVar.a();
        if (cBRRotationZoomableImageViewA != null) {
            cBRRotationZoomableImageViewA.rotateCCW();
        }
        CBRRotationZoomableImageView cBRRotationZoomableImageViewA2 = aVar.a();
        aVar.a(cBRRotationZoomableImageViewA2 != null ? Integer.valueOf(cBRRotationZoomableImageViewA2.getRotation()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        CBRRotationZoomableImageView cBRRotationZoomableImageViewA = aVar.a();
        if (cBRRotationZoomableImageViewA != null) {
            cBRRotationZoomableImageViewA.rotateCW();
        }
        CBRRotationZoomableImageView cBRRotationZoomableImageViewA2 = aVar.a();
        aVar.a(cBRRotationZoomableImageViewA2 != null ? Integer.valueOf(cBRRotationZoomableImageViewA2.getRotation()) : null);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k b.C12487b state, @l Bundle savedInstanceState) {
        CBRRotationZoomableImageView cBRRotationZoomableImageViewA = a();
        if (cBRRotationZoomableImageViewA != null) {
            cBRRotationZoomableImageViewA.setImageBitmapWithRotation(state.getBitmap(), state.getRotation());
        }
    }

    private final void a(Integer rotation) {
        if (rotation != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("rotation", rotation.intValue());
            G0 g02 = G0.f406611a;
            BaseFragment.setResult$default(this, 0, bundle, 1, null);
        }
    }
}
