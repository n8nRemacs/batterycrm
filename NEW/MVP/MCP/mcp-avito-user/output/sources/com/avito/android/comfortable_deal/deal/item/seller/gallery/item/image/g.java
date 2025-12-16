package com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.i;
import com.avito.android.util.D6;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SellerGalleryImageView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/seller/gallery/item/image/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/seller/gallery/item/image/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ShapeableImageView f121509b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f121510c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.seller_item_gallery_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.seller_item_gallery_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.imageview.ShapeableImageView");
        }
        this.f121509b = (ShapeableImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.seller_item_gallery_error_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f121510c = (ImageView) viewFindViewById3;
        int iB2 = kotlin.math.b.b(view.getContext().getResources().getDimension(R.dimen.seller_item_gallery_high));
        frameLayout.getLayoutParams().width = kotlin.math.b.b(iB2 * 1.333f);
        frameLayout.getLayoutParams().height = iB2;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.f
    public final void Tr(float f12, float f13, float f14, float f15) {
        ShapeableImageView shapeableImageView = this.f121509b;
        q.b bVarF = shapeableImageView.getShapeAppearanceModel().f();
        bVarF.k(f12);
        bVarF.e(f13);
        bVarF.n(f14);
        bVarF.h(f15);
        shapeableImageView.setShapeAppearanceModel(bVarF.a());
    }

    @Override // com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.f
    public final void j1(@l Uri uri) {
        ImageView imageView = this.f121510c;
        D6.w(imageView);
        if (uri == null) {
            D6.H(imageView);
            return;
        }
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(this.f121509b));
        aVar.f(uri);
        aVar.f169486d = true;
        aVar.f169490h = new a();
        aVar.c();
    }

    /* compiled from: SellerGalleryImageView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal/deal/item/seller/gallery/item/image/g$a", "Lcom/avito/android/image_loader/i;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements i {
        public a() {
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@l Throwable th2) {
            D6.H(g.this.f121510c);
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
        }
    }
}
