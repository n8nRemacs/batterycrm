package com.avito.android.photo_gallery_carousel.items.common;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BaseGalleryImageLoadableViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/common/b;", "Lcom/avito/android/photo_gallery_carousel/items/common/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b implements com.avito.android.photo_gallery_carousel.items.common.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f217909b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f217910c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public N f217911d;

    /* renamed from: e, reason: collision with root package name */
    public final int f217912e;

    /* compiled from: BaseGalleryImageLoadableViewImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final Boolean invoke() {
            ?? r02 = b.this.f217911d;
            return Boolean.valueOf(r02 != 0 ? ((Boolean) r02.invoke()).booleanValue() : true);
        }
    }

    public b(@k View view, @k ViewGroup viewGroup) {
        this.f217909b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        this.f217910c = simpleDraweeView;
        this.f217912e = D6.r(viewGroup);
        simpleDraweeView.setMaxWidth(D6.s(viewGroup) - ((D6.t(view, R.dimen.carousel_photo_gallery_horizontal_padding) + (D6.t(view, R.dimen.carousel_photo_gallery_between_offset) / 2)) * 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.photo_gallery_carousel.items.common.a
    public final void Fg(@k Y41.a<Boolean> aVar) {
        this.f217911d = (N) aVar;
    }

    @Override // com.avito.android.photo_gallery_carousel.items.common.a
    public final void a(@k Y41.a<G0> aVar) {
        this.f217910c.setOnClickListener(new C(21, aVar));
    }

    @Override // com.avito.android.photo_gallery_carousel.items.common.a
    public final void uz(@l Image image, @l String str, @k SizableGalleryItem.Type type, @l CarouselGalleryGroup carouselGalleryGroup) {
        int iA2;
        SizableGalleryItem.Type type2 = SizableGalleryItem.Type.f217904b;
        SimpleDraweeView simpleDraweeView = this.f217910c;
        if (type != type2) {
            iA2 = (int) (C35829k2.a(image) * this.f217912e);
            int minimumWidth = this.f217909b.getMinimumWidth();
            if (iA2 < minimumWidth) {
                iA2 = minimumWidth;
            }
            int maxWidth = simpleDraweeView.getMaxWidth();
            if (iA2 > maxWidth) {
                iA2 = maxWidth;
            }
        } else {
            iA2 = -1;
        }
        boolean z12 = iA2 == -1 || iA2 == simpleDraweeView.getMaxWidth();
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = iA2;
        simpleDraweeView.setLayoutParams(layoutParams);
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        s.c cVar = (carouselGalleryGroup == CarouselGalleryGroup.NO_CROP_4_3 || carouselGalleryGroup == CarouselGalleryGroup.NO_CROP_9_7) ? s.c.f340133e : (carouselGalleryGroup == CarouselGalleryGroup.CROP_4_3 && z12) ? s.c.f340137i : (carouselGalleryGroup == CarouselGalleryGroup.CROP_9_7 && z12) ? s.c.f340137i : s.c.f340133e;
        hierarchy.n(cVar);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(image));
        aVarA.f169491i = true;
        aVarA.f169494l = false;
        aVarA.f169495m = ImageRequest.SourcePlace.f169478c;
        aVarA.f169498p = str;
        aVarA.f169497o = new a();
        aVarA.c();
    }

    @Override // TV0.e
    public void j5() {
    }
}
