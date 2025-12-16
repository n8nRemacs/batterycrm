package com.avito.android.photo_gallery;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.From;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.zoom.ZoomableDraweeView;
import com.avito.android.photo_gallery.di.C33181a;
import com.avito.android.photo_gallery.ui.FixedRatioImageView;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideoStatus;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.GalleryTeaserType;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\n\u000bB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/photo_gallery/GalleryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lgj/i;", "Landroid/view/View$OnClickListener;", "Lcom/avito/android/photo_gallery/T;", "Lcom/avito/android/image_loader/i;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/pinch_to_zoom/e;", "<init>", "()V", "a", "b", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GalleryFragment extends BaseFragment implements gj.i, View.OnClickListener, T, com.avito.android.image_loader.i, InterfaceC28477j.b, com.avito.android.pinch_to_zoom.e {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.photo_gallery.autoteka_teaser.b f216481A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public AutotekaTeaserResult f216482B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public BeduinItemTeaser f216483C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public Q70.b f216484D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public NativeVideoStatus f216485E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f216486F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.f f216487G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public Y41.a<Integer> f216488H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public ComposeView f216489I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public Image f216490J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.photo_gallery.adapter.b f216491K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f216492L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public W70.c f216493M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public com.avito.android.connection_quality.connectivity.a f216494N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public InterfaceC40691b f216495O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public gj.n f216496P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f216497Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public InterfaceC39737b f216498R0;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f216499S0;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f216500T0;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public com.avito.android.pinch_to_zoom.b f216501U0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public SimpleDraweeView f216502n0;

    /* renamed from: o0, reason: collision with root package name */
    public com.avito.android.lib.design.zoom.d f216503o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public View f216504p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f216505q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f216506r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public GalleryFragmentType f216507s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public b f216508t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public Image f216509u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public Float f216510v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f216511w0;

    /* renamed from: x0, reason: collision with root package name */
    public String f216512x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public String f216513y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.photo_gallery.autoteka_teaser.v f216514z0;

    /* compiled from: GalleryFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/GalleryFragment$a;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: GalleryFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/GalleryFragment$b;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a();

        void i();

        void l();
    }

    /* compiled from: GalleryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f216515a;

        static {
            int[] iArr = new int[GalleryTeaserType.values().length];
            try {
                iArr[GalleryTeaserType.SINGLE_INSIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f216515a = iArr;
        }
    }

    /* compiled from: GalleryFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            Y41.a<Integer> aVar = GalleryFragment.this.f216488H0;
            if (aVar != null) {
                return aVar.invoke();
            }
            return null;
        }
    }

    public GalleryFragment() {
        super(0, 1, null);
        this.f216503o0 = com.avito.android.lib.design.zoom.d.y();
        this.f216507s0 = GalleryFragmentType.f216520e;
        this.f216487G0 = new com.avito.android.pinch_to_zoom.f();
    }

    public static void r5(GalleryFragment galleryFragment) {
        SimpleDraweeView simpleDraweeView = galleryFragment.f216502n0;
        if (simpleDraweeView == null) {
            galleryFragment.getClass();
            return;
        }
        W70.c cVar = galleryFragment.f216493M0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.c();
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(galleryFragment.f216509u0));
        aVarA.f169490h = galleryFragment;
        boolean z12 = galleryFragment.f216506r0;
        aVarA.f169491i = z12;
        aVarA.f169494l = z12;
        aVarA.f169501s = d.a.a(new com.avito.android.image_loader.e().a(galleryFragment.requireContext()), galleryFragment.requireContext(), null, From.f169442b, null, 24);
        aVarA.f169495m = galleryFragment.l1() instanceof LegacyPhotoGalleryActivity ? ImageRequest.SourcePlace.f169479d : ImageRequest.SourcePlace.f169478c;
        String str = galleryFragment.f216512x0;
        aVarA.f169498p = str != null ? str : null;
        aVarA.f169497o = new C33186f(galleryFragment);
        aVarA.c();
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        Q70.b bVar;
        BeduinItemTeaser beduinItemTeaser = this.f216483C0;
        if (beduinItemTeaser == null || (bVar = this.f216484D0) == null) {
            return null;
        }
        if (str.equals(beduinItemTeaser.getTopFormId())) {
            return bVar.f13538j;
        }
        if (str.equals(beduinItemTeaser.getMainFormId())) {
            return bVar.f13539k;
        }
        if (str.equals(beduinItemTeaser.getBottomFormId())) {
            return bVar.f13540l;
        }
        return null;
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        View view;
        W70.c cVar = this.f216493M0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.f();
        W70.c cVar2 = this.f216493M0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.g();
        this.f216511w0 = true;
        SimpleDraweeView simpleDraweeView = this.f216502n0;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(0);
        }
        if (!this.f216506r0 && (view = this.f216504p0) != null) {
            view.setVisibility(8);
        }
        b bVar = this.f216508t0;
        if (bVar != null) {
            bVar.l();
        }
        W70.c cVar3 = this.f216493M0;
        (cVar3 != null ? cVar3 : null).b();
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
        View view;
        this.f216511w0 = false;
        if (!this.f216506r0 || (view = this.f216504p0) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final boolean Y00() {
        return this.f216487G0.Y00();
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void Zn() {
        this.f216487G0.Zn();
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@Y61.l Throwable th2) {
        View view;
        if (!this.f216506r0 && (view = this.f216504p0) != null) {
            view.setVisibility(8);
        }
        b bVar = this.f216508t0;
        if (bVar != null) {
            bVar.i();
        }
        if (th2 != null) {
            W70.c cVar = this.f216493M0;
            if (cVar == null) {
                cVar = null;
            }
            cVar.i(th2);
            W70.c cVar2 = this.f216493M0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            cVar2.g();
            W70.c cVar3 = this.f216493M0;
            (cVar3 != null ? cVar3 : null).j(th2);
        }
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.l
    public final gj.o c1() {
        return null;
    }

    @Override // com.avito.android.photo_gallery.T
    public final void l0() {
        if (this.f216505q0 || this.f216507s0 == GalleryFragmentType.f216522g || !(this.f216502n0 instanceof ZoomableDraweeView)) {
            return;
        }
        this.f216503o0.u();
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Y61.l View view) {
        b bVar;
        if (view == null || view.getId() != R.id.image || (bVar = this.f216508t0) == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        W70.c cVar = this.f216493M0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.e();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f216509u0 = (Image) arguments.getParcelable("image");
        this.f216490J0 = (Image) arguments.getParcelable("divide_image");
        this.f216505q0 = arguments.getBoolean("crop");
        this.f216507s0 = (GalleryFragmentType) arguments.getSerializable("type");
        this.f216506r0 = arguments.getBoolean("fastOpen");
        String string = arguments.getString("advertId");
        if (string == null) {
            string = "";
        }
        this.f216512x0 = string;
        this.f216513y0 = arguments.getString("search_context");
        this.f216510v0 = arguments.containsKey("ratio") ? Float.valueOf(arguments.getFloat("ratio")) : null;
        GalleryFragmentType galleryFragmentType = this.f216507s0;
        if (galleryFragmentType == GalleryFragmentType.f216517b || galleryFragmentType == GalleryFragmentType.f216518c) {
            this.f216482B0 = (AutotekaTeaserResult) arguments.getParcelable("teaser");
        }
        if (this.f216507s0 == GalleryFragmentType.f216519d) {
            this.f216483C0 = (BeduinItemTeaser) arguments.getParcelable("beduin_teaser");
        }
        if (this.f216507s0 == GalleryFragmentType.f216522g) {
            this.f216485E0 = (NativeVideoStatus) arguments.getParcelable("native_video_status");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    @Override // androidx.fragment.app.Fragment
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r5, @Y61.l android.view.ViewGroup r6, @Y61.l android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.GalleryFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC40691b interfaceC40691b = this.f216495O0;
        if (interfaceC40691b == null) {
            interfaceC40691b = null;
        }
        interfaceC40691b.onCleared();
        this.f216487G0.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SimpleDraweeView simpleDraweeView = this.f216502n0;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(null);
        }
        this.f216502n0 = null;
        this.f216503o0 = null;
        this.f216504p0 = null;
        Q70.b bVar = this.f216484D0;
        if (bVar != null) {
            bVar.f13534f.dispose();
            bVar.f13538j.setAdapter(null);
            bVar.f13539k.setAdapter(null);
            bVar.f13540l.setAdapter(null);
        }
        this.f216484D0 = null;
        this.f216514z0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Screen screen;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments == null || (screen = (Screen) arguments.getParcelable("screen")) == null) {
            throw new IllegalArgumentException();
        }
        Bundle arguments2 = getArguments();
        boolean z12 = arguments2 != null ? arguments2.getBoolean("should_track_metrics", true) : true;
        Bundle arguments3 = getArguments();
        C33181a.a().a((com.avito.android.photo_gallery.di.e) C29972i.a(C29972i.b(this), com.avito.android.photo_gallery.di.e.class), (kj.c) C29972i.a(C29972i.b(this), kj.c.class), cv.c.b(this), new C28478k(screen, new com.avito.android.analytics.screens.r(this, Long.valueOf(this.f304596f0), arguments3 != null ? arguments3.getString("screen_tracker_id") : null), "gallery-element"), z12, this).a(this);
        W70.c cVar = this.f216493M0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.a(fA2.b());
        W70.c cVar2 = this.f216493M0;
        (cVar2 != null ? cVar2 : null).h(g5(), this);
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void p7(@Y61.k z80.e eVar) {
        throw null;
    }

    public final void q5(FrameLayout frameLayout, boolean z12) {
        String string;
        View view;
        Context context;
        frameLayout.setForegroundGravity(17);
        if (z12 && (context = getContext()) != null) {
            frameLayout.setBackground(new ColorDrawable(C35835l0.d(R.attr.constantWhite, context)));
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) frameLayout.findViewById(R.id.image);
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(this);
        }
        this.f216502n0 = simpleDraweeView;
        if (simpleDraweeView instanceof ZoomableDraweeView) {
            ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) simpleDraweeView;
            zoomableDraweeView.setZoomableController(this.f216503o0);
            zoomableDraweeView.setTapListener(new C33187g((com.avito.android.lib.design.zoom.d) zoomableDraweeView.getZoomableController(), this, zoomableDraweeView));
            zoomableDraweeView.setOnTouchListener(new ViewOnTouchListenerC33195h(this));
            zoomableDraweeView.setZoomListener(null);
            if (this.f216490J0 != null) {
                ComposeView composeView = (ComposeView) frameLayout.findViewById(R.id.compose_view);
                this.f216489I0 = composeView;
                if (composeView != null) {
                    composeView.setContent(new C22096n(1713245589, new C33185e(this, frameLayout), true));
                }
            }
        } else if (simpleDraweeView instanceof FixedRatioImageView) {
            Float f12 = this.f216510v0;
            if (f12 != null) {
                ((FixedRatioImageView) simpleDraweeView).setRatio(f12.floatValue());
            }
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("pinch_to_zoom_source")) != null) {
                PinchToZoomSource pinchToZoomSourceValueOf = PinchToZoomSource.valueOf(string);
                com.avito.android.pinch_to_zoom.b bVar = this.f216501U0;
                this.f216487G0.c(new d(), bVar != null ? bVar : null, pinchToZoomSourceValueOf, simpleDraweeView, simpleDraweeView, (ViewGroup) frameLayout.findViewById(R.id.zoom_onboarding));
            }
        }
        this.f216504p0 = frameLayout.findViewById(R.id.image_progress);
        r5(this);
        if (!this.f216506r0 || (view = this.f216504p0) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // gj.i
    public final void t0() {
        requireActivity().finish();
    }
}
