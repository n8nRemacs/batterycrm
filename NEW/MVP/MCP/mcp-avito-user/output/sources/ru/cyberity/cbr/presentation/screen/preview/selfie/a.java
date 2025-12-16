package ru.cyberity.cbr.presentation.screen.preview.selfie;

import Y61.k;
import Y61.l;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.File;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import n11.RunnableC44167a;
import ru.cyberity.cbr.camera.video.presentation.a;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.presentation.screen.preview.selfie.b;
import ru.cyberity.internal.R;

/* compiled from: CBRPreviewSelfieFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\t\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u0005R!\u0010&\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b%\u0010\u0005\u001a\u0004\b#\u0010$R\u001d\u0010,\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00100\u001a\u0004\u0018\u00010-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b.\u0010/R\u001d\u00104\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b2\u00103R\u001d\u00106\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b5\u00103R\u001d\u00109\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b\t\u00108R\u001d\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b(\u00108R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/a;", "Lru/cyberity/cbr/presentation/screen/preview/a;", "Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "Lru/cyberity/cbr/presentation/screen/preview/selfie/b;", "<init>", "()V", "Ljava/io/File;", "file", "Lkotlin/G0;", "a", "(Ljava/io/File;)V", "i", "", "getLayoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", VoiceInfo.STATE, "(Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "", "hideLogo", "updatePoweredByVisibility", "(Z)V", "onStop", "Lkotlin/C;", "g", "()Lru/cyberity/cbr/presentation/screen/preview/selfie/b;", "getViewModel$annotations", "viewModel", "Landroidx/constraintlayout/widget/Group;", "b", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "c", "()Landroidx/constraintlayout/widget/Group;", "gContent", "Landroid/widget/VideoView;", "d", "()Landroid/widget/VideoView;", "playerView", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "tvTitle", "e", "tvSubtitle", "Landroid/widget/Button;", "()Landroid/widget/Button;", "btnReadableVideo", "btnTakeAnotherVideo", "Landroid/widget/MediaController;", "h", "Landroid/widget/MediaController;", "mediaController", "Ljava/io/File;", "videoFile", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "showControlsCallback", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "k", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends ru.cyberity.cbr.presentation.screen.preview.a<b.d, ru.cyberity.cbr.presentation.screen.preview.selfie.b> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f435332l;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private MediaController mediaController;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private File videoFile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.preview.selfie.b.class), new c(new b(this)), new d());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView gContent = i0.a(this, R.id.cbr_content);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView playerView = i0.a(this, R.id.cbr_player);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnReadableVideo = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnTakeAnotherVideo = i0.a(this, R.id.cbr_secondary_button);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final Runnable showControlsCallback = new RunnableC44167a(this, 8);

    /* compiled from: CBRPreviewSelfieFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\b¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/a$a;", "", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/fragment/app/Fragment;", "a", "", "ARGS_DOCUMENT", "Ljava/lang/String;", "", "MEDIA_CONTROLLER_DELAY", "I", "REQUEST_VIDEO_SELFIE", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.selfie.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment a(@k Document document) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_DOCUMENT", document);
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
        final /* synthetic */ Fragment f435343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f435343a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f435343a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f435344a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f435344a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f435344a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRPreviewSelfieFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<P0.c> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            Bundle arguments = a.this.getArguments();
            Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
            a aVar = a.this;
            return new ru.cyberity.cbr.presentation.screen.preview.selfie.c(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "gContent", "getGContent()Landroidx/constraintlayout/widget/Group;", 0);
        n0 n0Var = m0.f406844a;
        f435332l = new n[]{n0Var.i(h0Var), C0.k(a.class, "playerView", "getPlayerView()Landroid/widget/VideoView;", 0, n0Var), C0.k(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "btnReadableVideo", "getBtnReadableVideo()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "btnTakeAnotherVideo", "getBtnTakeAnotherVideo()Landroid/widget/Button;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final Button b() {
        return (Button) this.btnTakeAnotherVideo.a(this, f435332l[5]);
    }

    private final Group c() {
        return (Group) this.gContent.a(this, f435332l[0]);
    }

    private final VideoView d() {
        return (VideoView) this.playerView.a(this, f435332l[1]);
    }

    private final TextView e() {
        return (TextView) this.tvSubtitle.a(this, f435332l[3]);
    }

    private final TextView f() {
        return (TextView) this.tvTitle.a(this, f435332l[2]);
    }

    private final void i() {
        VideoView videoViewD = d();
        if (videoViewD == null) {
            return;
        }
        if (videoViewD.isPlaying() || this.videoFile != null) {
            ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "stopPlayback", null, 4, null);
            this.videoFile = null;
            videoViewD.stopPlayback();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.preview.selfie.b getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.preview.selfie.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        DocumentType type;
        String strC;
        Bundle arguments = getArguments();
        Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
        Document document2 = document != null ? document : null;
        return (document2 == null || (type = document2.getType()) == null || (strC = type.getValue()) == null) ? "TYPE_UNKNOWN" : strC;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_preview_selfie;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "handleEvent: " + event, null, 4, null);
        super.handleEvent(event);
        if (event instanceof b.C12535b) {
            a.Companion c12428a = ru.cyberity.cbr.camera.video.presentation.a.INSTANCE;
            b.C12535b c12535b = (b.C12535b) event;
            String strC = c12535b.getParams().getIdDocSetType();
            String strD = c12535b.getParams().getType();
            if (strD == null) {
                strD = "";
            }
            navigateTo(c12428a.a(strC, strD).forResult("video_selfie"), ru.cyberity.log.c.a(c12428a));
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getSupportFragmentManager().p0("video_selfie", this, new com.my.target.ads.a(this, 27));
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "onStop", null, 4, null);
        i();
        VideoView videoViewD = d();
        if (videoViewD != null) {
            videoViewD.removeCallbacks(this.showControlsCallback);
        }
        super.onStop();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button buttonA = a();
        if (buttonA != null) {
            final int i12 = 0;
            buttonA.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.selfie.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f435384c;

                {
                    this.f435384c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            a.a(this.f435384c, view2);
                            break;
                        default:
                            a.b(this.f435384c, view2);
                            break;
                    }
                }
            });
        }
        Button buttonB = b();
        if (buttonB != null) {
            final int i13 = 1;
            buttonB.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.selfie.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f435384c;

                {
                    this.f435384c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            a.a(this.f435384c, view2);
                            break;
                        default:
                            a.b(this.f435384c, view2);
                            break;
                    }
                }
            });
        }
        VideoView videoViewD = d();
        if (videoViewD != null) {
            MediaController mediaController = new MediaController(requireContext());
            this.mediaController = mediaController;
            videoViewD.setMediaController(mediaController);
            videoViewD.setOnCompletionListener(new f());
            videoViewD.setOnPreparedListener(new g());
            videoViewD.setOnErrorListener(new h());
            videoViewD.post(this.showControlsCallback);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void updatePoweredByVisibility(boolean hideLogo) {
        View viewFindViewById = requireView().findViewById(R.id.cbr_powered);
        if (viewFindViewById != null) {
            s.a(viewFindViewById, hideLogo);
        }
    }

    private final Button a() {
        return (Button) this.btnReadableVideo.a(this, f435332l[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar) {
        MediaController mediaController = aVar.mediaController;
        if (mediaController != null) {
            mediaController.show(2000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, String str, Bundle bundle) {
        String string = bundle.getString("EXTRA_FILE");
        aVar.getViewModel().a((string == null || string.length() == 0) ? null : new File(string), bundle.getString("EXTRA_PHRASE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.RetakeButton, null, 8, null);
        aVar.i();
        aVar.getViewModel().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.AcceptButton, null, 8, null);
        aVar.i();
        aVar.getViewModel().a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MediaPlayer mediaPlayer) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "player prepared: " + mediaPlayer, null, 4, null);
        mediaPlayer.setLooping(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MediaPlayer mediaPlayer) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "playback completed: " + mediaPlayer, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(MediaPlayer mediaPlayer, int i12, int i13) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "player error: " + mediaPlayer + ", what=" + i12 + ", extra=" + i13, null, 4, null);
        return true;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k b.d state, @l Bundle savedInstanceState) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "handleState: " + state, null, 4, null);
        TextView textViewF = f();
        if (textViewF != null) {
            s.a(textViewF, state.getTitle());
        }
        TextView textViewE = e();
        if (textViewE != null) {
            s.a(textViewE, state.getSubtitle());
        }
        Button buttonA = a();
        if (buttonA != null) {
            s.a(buttonA, state.getButtonPositive());
        }
        Button buttonB = b();
        if (buttonB != null) {
            s.a(buttonB, state.getButtonNegative());
        }
        Group groupC = c();
        if (groupC != null) {
            groupC.setVisibility(state.getShowContent() ? 0 : 8);
        }
        updatePoweredByVisibility(getViewModel().shouldHideLogo());
        if (!state.getShowContent() || state.getVideoFile() == null) {
            i();
        }
        a(state.getVideoFile());
    }

    private final void a(File file) {
        if (file != null) {
            i();
        }
        if (L.f(this.videoFile, file) || file == null) {
            return;
        }
        this.videoFile = file;
        VideoView videoViewD = d();
        if (videoViewD == null) {
            return;
        }
        videoViewD.setVideoPath(file.getAbsolutePath());
        videoViewD.requestFocus();
    }
}
