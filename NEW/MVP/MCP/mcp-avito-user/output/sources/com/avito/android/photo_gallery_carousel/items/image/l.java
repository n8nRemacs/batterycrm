package com.avito.android.photo_gallery_carousel.items.image;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryImageItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/image/l;", "Lcom/avito/android/photo_gallery_carousel/items/image/k;", "Lcom/avito/android/photo_gallery_carousel/items/common/b;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class l extends com.avito.android.photo_gallery_carousel.items.common.b implements k {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f217967f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f217968g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.f f217969h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Integer f217970i;

    /* compiled from: GalleryImageItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.this.f217970i;
        }
    }

    public l(@Y61.k View view, @Y61.k ViewGroup viewGroup, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        super(view, viewGroup);
        this.f217967f = view;
        this.f217968g = bVar;
        this.f217969h = new com.avito.android.pinch_to_zoom.f();
    }

    @Override // com.avito.android.photo_gallery_carousel.items.image.k
    public final void H7(@Y61.k PinchToZoomSource pinchToZoomSource) {
        ViewGroup viewGroup = (ViewGroup) this.f217967f.findViewById(R.id.zoom_onboarding);
        a aVar = new a();
        com.avito.android.pinch_to_zoom.b bVar = this.f217968g;
        SimpleDraweeView simpleDraweeView = this.f217910c;
        this.f217969h.c(aVar, bVar, pinchToZoomSource, simpleDraweeView, simpleDraweeView, viewGroup);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.image.k
    public final void Ob() {
        this.f217969h.b();
    }

    @Override // com.avito.android.photo_gallery_carousel.items.image.k
    public final void T8(@Y61.l Integer num) {
        this.f217970i = num;
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final boolean Y00() {
        return this.f217969h.Y00();
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void Zn() {
        this.f217969h.Zn();
    }

    @Override // com.avito.android.photo_gallery_carousel.items.common.b, TV0.e
    public final void j5() {
        throw null;
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void p7(@Y61.k z80.e eVar) {
        this.f217969h.f220009d = eVar;
    }
}
