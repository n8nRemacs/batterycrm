package com.avito.android.photo_gallery_carousel.items.gallery_teaser;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: GalleryTeaserItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/f;", "Lcom/avito/android/photo_gallery_carousel/items/common/c;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f, com.avito.android.photo_gallery_carousel.items.common.c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f217928i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f217929b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.pinch_to_zoom.b f217930c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f217931d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f217932e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f217933f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.pinch_to_zoom.f f217934g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Integer f217935h;

    /* compiled from: GalleryTeaserItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return g.this.f217935h;
        }
    }

    public g(@k View view, @k ViewGroup viewGroup, @k com.avito.android.pinch_to_zoom.b bVar) {
        super(view);
        this.f217929b = view;
        this.f217930c = bVar;
        new com.avito.android.photo_gallery_carousel.items.image.f(view, viewGroup, bVar);
        this.f217931d = (ImageView) view.findViewById(R.id.image);
        this.f217932e = (TextView) view.findViewById(R.id.teaser_text);
        this.f217933f = (Button) view.findViewById(R.id.teaser_button);
        this.f217934g = new com.avito.android.pinch_to_zoom.f();
    }

    @Override // com.avito.android.photo_gallery_carousel.items.gallery_teaser.f
    public final void Ap(@k String str, @k String str2) {
        TextView textView = this.f217932e;
        textView.setText(C43066x.A0(textView.getContext().getString(R.string.carousel_photo_gallery_gallery_teaser_text, str, str2)).toString());
    }

    @Override // com.avito.android.photo_gallery_carousel.items.gallery_teaser.f
    public final void H7(@k PinchToZoomSource pinchToZoomSource) {
        ViewGroup viewGroup = (ViewGroup) this.f217929b.findViewById(R.id.zoom_onboarding);
        a aVar = new a();
        com.avito.android.pinch_to_zoom.f fVar = this.f217934g;
        com.avito.android.pinch_to_zoom.b bVar = this.f217930c;
        ImageView imageView = this.f217931d;
        fVar.c(aVar, bVar, pinchToZoomSource, imageView, imageView, viewGroup);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.gallery_teaser.f
    public final void Ob() {
        this.f217934g.b();
    }

    @Override // com.avito.android.photo_gallery_carousel.items.gallery_teaser.f
    public final void T8(@l Integer num) {
        this.f217935h = num;
    }

    @Override // com.avito.android.photo_gallery_carousel.items.gallery_teaser.f
    public final void Y(@k Y41.a<G0> aVar) {
        this.f217933f.setOnClickListener(new i(27, aVar));
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final boolean Y00() {
        return this.f217934g.Y00();
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void Zn() {
        this.f217934g.Zn();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Ob();
    }

    @Override // com.avito.android.pinch_to_zoom.e
    public final void p7(@k z80.e eVar) {
        this.f217934g.f220009d = eVar;
    }

    @Override // com.avito.android.photo_gallery_carousel.items.gallery_teaser.f
    public final void w2(@k String str) {
        this.f217933f.setText(str);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.gallery_teaser.f
    public final void z2(@l Image image) {
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(this.f217931d));
        aVar.d(n.a(image));
        aVar.c();
    }
}
