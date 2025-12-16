package com.avito.android.cyclic_gallery_widget.image_carousel;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.image_loader.d;
import com.avito.android.lib.util.layout.RatioFrameLayout;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42165v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImageCarouselItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/x;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/v;", "Lcom/avito/android/pinch_to_zoom/e;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x extends com.avito.konveyor.adapter.b implements v, com.avito.android.pinch_to_zoom.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f132155b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.pinch_to_zoom.b f132156c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PinchToZoomSource f132157d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.f f132158e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RatioFrameLayout f132159f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f132160g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f132161h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Drawable f132162i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.image_loader.k f132163j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.facebook.drawee.drawable.r f132164k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Float f132165l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f132166m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f132167n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f132168o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(View view, s.c cVar, Integer num, com.avito.android.pinch_to_zoom.b bVar, PinchToZoomSource pinchToZoomSource, com.avito.android.pinch_to_zoom.f fVar, int i12, C42822w c42822w) {
        super(view);
        bVar = (i12 & 8) != 0 ? null : bVar;
        pinchToZoomSource = (i12 & 16) != 0 ? null : pinchToZoomSource;
        fVar = (i12 & 32) != 0 ? new com.avito.android.pinch_to_zoom.f() : fVar;
        this.f132155b = view;
        this.f132156c = bVar;
        this.f132157d = pinchToZoomSource;
        this.f132158e = fVar;
        this.f132159f = (RatioFrameLayout) view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        this.f132160g = simpleDraweeView;
        View viewFindViewById2 = view.findViewById(R.id.zoom_onboarding);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f132161h = (ViewGroup) viewFindViewById2;
        Drawable drawableU = D6.u(view, R.drawable.gallery_video_overlay);
        s.a aVar = (s.a) s.c.f340135g;
        this.f132164k = new com.facebook.drawee.drawable.r(drawableU, aVar);
        com.facebook.drawee.drawable.r rVar = new com.facebook.drawee.drawable.r(D6.u(view, R.drawable.ic_stub_grey), aVar);
        this.f132168o = new com.avito.android.image_loader.e().a(view.getContext());
        simpleDraweeView.getHierarchy().o(rVar, 5);
        if (cVar != null) {
            simpleDraweeView.getHierarchy().n(cVar);
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.e(0.0f);
            hierarchy.s(roundingParams);
        }
        if (num != null) {
            simpleDraweeView.setBackgroundResource(num.intValue());
        }
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.v
    @Y61.k
    public final z<G0> A() {
        return C37722i.a(this.f132155b);
    }

    public final Drawable B80() {
        ArrayList arrayList = new ArrayList();
        if (this.f132166m) {
            arrayList.add(this.f132164k);
        }
        Drawable drawable = this.f132162i;
        if (drawable != null) {
            arrayList.add(drawable);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (Drawable) arrayList.get(0) : new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.v
    public final void SY(boolean z12) {
        this.f132166m = z12;
        C35949t5.c(this.f132160g, this.f132163j, null, null, B80(), 6);
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final boolean Y00() {
        return this.f132158e.Y00();
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void Zn() {
        this.f132158e.Zn();
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.v
    public final void ad(@InterfaceC42165v int i12) throws Resources.NotFoundException {
        Resources resources = this.f132155b.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        this.f132159f.setForeground(resources.getDrawable(i12, null));
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.v
    public final void c7(@InterfaceC42165v int i12) {
        this.f132159f.setBackgroundResource(i12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.v
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f132167n = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f132158e.b();
        Y41.a<G0> aVar = this.f132167n;
        if (aVar != null) {
            ((s) aVar).invoke();
        }
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void p7(@Y61.k z80.e eVar) {
        throw null;
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.v
    public final void q0(float f12) {
        if (L.d(this.f132165l, f12)) {
            return;
        }
        RatioFrameLayout ratioFrameLayout = this.f132159f;
        ratioFrameLayout.setRatio(f12);
        ratioFrameLayout.requestLayout();
        this.f132165l = Float.valueOf(f12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.v
    @SuppressLint({"ClickableViewAccessibility"})
    public final void tl(@Y61.l com.avito.android.image_loader.k kVar, @Y61.k From from, @Y61.k l lVar, boolean z12, boolean z13, @Y61.l Integer num) throws Resources.NotFoundException {
        Drawable drawableA;
        this.f132163j = kVar;
        View view = this.f132155b;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(lVar.f132032e);
        float dimensionPixelSize2 = view.getResources().getDimensionPixelSize(lVar.f132028a);
        float dimensionPixelSize3 = view.getResources().getDimensionPixelSize(lVar.f132029b);
        float dimensionPixelSize4 = view.getResources().getDimensionPixelSize(lVar.f132031d);
        float dimensionPixelSize5 = view.getResources().getDimensionPixelSize(lVar.f132030c);
        if (z12) {
            drawableA = D6.u(view, lVar.f132034g);
        } else {
            drawableA = d.a.a(this.f132168o, view.getContext(), kVar, from, Integer.valueOf(dimensionPixelSize), 16);
        }
        this.f132162i = drawableA;
        GW0.a hierarchy = this.f132160g.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.d(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5);
        hierarchy.s(roundingParams);
        C35949t5.c(this.f132160g, kVar, null, null, B80(), 6);
        if (!z13 || this.f132156c == null || this.f132157d == null) {
            this.f132158e.b();
            return;
        }
        com.avito.android.lib.util.v.a(this.f132161h, dimensionPixelSize);
        this.f132158e.c(new w(num), this.f132156c, this.f132157d, this.f132155b, this.f132160g, this.f132161h);
    }
}
