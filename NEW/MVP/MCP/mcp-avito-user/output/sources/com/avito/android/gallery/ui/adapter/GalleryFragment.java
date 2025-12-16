package com.avito.android.gallery.ui.adapter;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.zoom.ZoomableDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/gallery/ui/adapter/GalleryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/image_loader/i;", "Lcom/avito/android/gallery/ui/adapter/j;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFragment extends BaseFragment implements com.avito.android.image_loader.i, j, InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @k
    public static final a f159248w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    public com.avito.android.lib.design.zoom.d f159249n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public SimpleDraweeView f159250o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public View f159251p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f159252q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public b f159253r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public Image f159254s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f159255t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public s.a f159256u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.connection_quality.connectivity.a f159257v0;

    /* compiled from: GalleryFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/gallery/ui/adapter/GalleryFragment$a;", "", "<init>", "()V", "", "DOUBLE_TAP_ZOOM_SCALE", "F", "", "KEY_CROP", "Ljava/lang/String;", "KEY_IMAGE", "KEY_SCALE_TYPE", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GalleryFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/ui/adapter/GalleryFragment$b;", "", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a();

        void i();

        void l();
    }

    public GalleryFragment() {
        super(0, 1, null);
        this.f159249n0 = com.avito.android.lib.design.zoom.d.y();
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        this.f159255t0 = true;
        SimpleDraweeView simpleDraweeView = this.f159250o0;
        if (simpleDraweeView != null) {
            D6.H(simpleDraweeView);
        }
        View view = this.f159251p0;
        if (view != null) {
            view.post(new e(this, 0));
        }
        b bVar = this.f159253r0;
        if (bVar != null) {
            bVar.l();
        }
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
        this.f159255t0 = false;
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@l Throwable th2) {
        View view = this.f159251p0;
        if (view != null) {
            view.post(new e(this, 1));
        }
        b bVar = this.f159253r0;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // com.avito.android.gallery.ui.adapter.j
    public final void l0() {
        if (this.f159252q0 || !(this.f159250o0 instanceof ZoomableDraweeView)) {
            return;
        }
        this.f159249n0.u();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f159254s0 = (Image) arguments.getParcelable("image");
        this.f159252q0 = arguments.getBoolean("crop");
        s.c cVar = null;
        Integer numValueOf = arguments.containsKey("scaleType") ? Integer.valueOf(arguments.getInt("scaleType")) : null;
        if (numValueOf != null) {
            switch (numValueOf.intValue()) {
                case 0:
                    cVar = s.c.f340129a;
                    break;
                case 1:
                    cVar = s.c.f340132d;
                    break;
                case 2:
                    cVar = s.c.f340133e;
                    break;
                case 3:
                    cVar = s.c.f340134f;
                    break;
                case 4:
                    cVar = s.c.f340135g;
                    break;
                case 5:
                    cVar = s.c.f340136h;
                    break;
                case 6:
                    cVar = s.c.f340137i;
                    break;
                case 7:
                    cVar = s.c.f340138j;
                    break;
                case 8:
                    cVar = s.c.f340139k;
                    break;
            }
            this.f159256u0 = (s.a) cVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        s.a aVar;
        View viewInflate = layoutInflater.inflate(this.f159252q0 ? R.layout.gallery_item_fragment : R.layout.gallery_item_zoomable_fragment, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        frameLayout.setForegroundGravity(17);
        View viewFindViewById = frameLayout.findViewById(R.id.image_progress);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f159251p0 = viewFindViewById;
        View viewFindViewById2 = frameLayout.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
        this.f159250o0 = simpleDraweeView;
        simpleDraweeView.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 14));
        SimpleDraweeView simpleDraweeView2 = this.f159250o0;
        if (simpleDraweeView2 instanceof ZoomableDraweeView) {
            ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) simpleDraweeView2;
            zoomableDraweeView.setZoomableController(this.f159249n0);
            zoomableDraweeView.setTapListener(new h((com.avito.android.lib.design.zoom.d) zoomableDraweeView.getZoomableController(), this));
            zoomableDraweeView.setZoomListener(null);
        } else if (simpleDraweeView2 != null && (aVar = this.f159256u0) != null) {
            simpleDraweeView2.getHierarchy().n(aVar);
        }
        SimpleDraweeView simpleDraweeView3 = this.f159250o0;
        if (simpleDraweeView3 != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView3);
            aVarA.d(com.avito.android.image_loader.b.b(this.f159254s0));
            aVarA.f169490h = this;
            aVarA.f169497o = new g(this);
            aVarA.c();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SimpleDraweeView simpleDraweeView = this.f159250o0;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(null);
        }
        this.f159250o0 = null;
        this.f159249n0 = null;
        this.f159251p0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.gallery.di.a.a().a((com.avito.android.gallery.di.b) C29972i.a(C29972i.b(this), com.avito.android.gallery.di.b.class)).b(this);
    }
}
