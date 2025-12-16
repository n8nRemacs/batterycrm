package com.avito.android.review_gallery.adapter;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.i;
import com.avito.android.lib.design.zoom.ZoomableDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.review_gallery.ReviewGalleryActivity;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.L5;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReviewGalleryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/review_gallery/adapter/ReviewGalleryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/avito/android/review_gallery/adapter/f;", "Lcom/avito/android/image_loader/i;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReviewGalleryFragment extends BaseFragment implements View.OnClickListener, f, i, InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @l
    public ZoomableDraweeView f255457n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public SimpleDraweeView f255458o0;

    /* renamed from: p0, reason: collision with root package name */
    public final com.avito.android.lib.design.zoom.d f255459p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public View f255460q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public ReviewGalleryActivity f255461r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public Image f255462s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f255463t0;

    /* compiled from: ReviewGalleryFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/adapter/ReviewGalleryFragment$a;", "", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    public ReviewGalleryFragment() {
        super(0, 1, null);
        this.f255459p0 = com.avito.android.lib.design.zoom.d.y();
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        ZoomableDraweeView zoomableDraweeView = this.f255457n0;
        if (zoomableDraweeView != null) {
            D6.n(zoomableDraweeView, 250L);
        }
        SimpleDraweeView simpleDraweeView = this.f255458o0;
        if (simpleDraweeView != null) {
            D6.n(simpleDraweeView, 250L);
        }
        View view = this.f255460q0;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
        ZoomableDraweeView zoomableDraweeView = this.f255457n0;
        if (zoomableDraweeView != null) {
            zoomableDraweeView.setVisibility(4);
        }
        SimpleDraweeView simpleDraweeView = this.f255458o0;
        if (simpleDraweeView == null) {
            return;
        }
        simpleDraweeView.setVisibility(4);
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@l Throwable th2) {
        View view = this.f255460q0;
        if (view != null) {
            view.setVisibility(8);
        }
        ReviewGalleryActivity reviewGalleryActivity = this.f255461r0;
        if (reviewGalleryActivity != null) {
            L5.a(reviewGalleryActivity, R.string.review_gallery_error_message, 0);
        }
    }

    @Override // com.avito.android.review_gallery.adapter.f
    public final void l0() {
        this.f255459p0.u();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@l View view) {
        ReviewGalleryActivity reviewGalleryActivity = this.f255461r0;
        if (reviewGalleryActivity != null) {
            if (reviewGalleryActivity.f255448w) {
                Toolbar toolbar = reviewGalleryActivity.f255445t;
                if (toolbar == null) {
                    toolbar = null;
                }
                D6.o(toolbar, 250L);
                ViewGroup viewGroup = reviewGalleryActivity.f255446u;
                D6.o(viewGroup != null ? viewGroup : null, 250L);
                reviewGalleryActivity.f255448w = false;
                return;
            }
            Toolbar toolbar2 = reviewGalleryActivity.f255445t;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            D6.n(toolbar2, 250L);
            ViewGroup viewGroup2 = reviewGalleryActivity.f255446u;
            D6.n(viewGroup2 != null ? viewGroup2 : null, 250L);
            reviewGalleryActivity.f255448w = true;
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f255463t0 = arguments.getFloat("ratio") < ((float) C35835l0.g(requireContext()).x) / ((float) C35835l0.g(requireContext()).y);
        this.f255462s0 = (Image) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("image", Image.class) : arguments.getParcelable("image"));
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.review_gallery_item, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        this.f255457n0 = (ZoomableDraweeView) frameLayout.findViewById(R.id.image);
        this.f255458o0 = (SimpleDraweeView) frameLayout.findViewById(R.id.gallery_background);
        ZoomableDraweeView zoomableDraweeView = this.f255457n0;
        if (zoomableDraweeView != null) {
            zoomableDraweeView.setZoomableController(this.f255459p0);
            zoomableDraweeView.setTapListener(new b((com.avito.android.lib.design.zoom.d) zoomableDraweeView.getZoomableController(), this, zoomableDraweeView));
            zoomableDraweeView.setOnTouchListener(new c(this));
            zoomableDraweeView.setZoomListener(null);
            this.f255460q0 = viewInflate.findViewById(R.id.image_progress);
            ZoomableDraweeView zoomableDraweeView2 = this.f255457n0;
            if (zoomableDraweeView2 != null) {
                zoomableDraweeView2.getHierarchy().n(this.f255463t0 ? s.c.f340137i : s.c.f340133e);
                com.avito.android.advert.item.delivery_suggests.l.w(this.f255462s0, C35949t5.a(zoomableDraweeView2));
            }
            SimpleDraweeView simpleDraweeView = this.f255458o0;
            if (simpleDraweeView != null) {
                ImageRequest.a aVar = new ImageRequest.a(new DM.a(simpleDraweeView));
                aVar.d(com.avito.android.image_loader.b.b(this.f255462s0));
                aVar.f169486d = true;
                aVar.f169496n = 25;
                aVar.f169490h = this;
                aVar.c();
            }
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f255461r0 = null;
    }
}
