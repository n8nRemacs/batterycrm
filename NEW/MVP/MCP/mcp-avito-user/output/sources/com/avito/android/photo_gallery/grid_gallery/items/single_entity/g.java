package com.avito.android.photo_gallery.grid_gallery.items.single_entity;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity;
import com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemsUtils;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: GridGallerySingleEntityView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/single_entity/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery/grid_gallery/items/single_entity/f;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f217289f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f217290b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f217291c;

    /* renamed from: d, reason: collision with root package name */
    public final float f217292d;

    /* renamed from: e, reason: collision with root package name */
    public final int f217293e;

    public g(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f217290b = context;
        this.f217291c = (ImageView) view;
        this.f217292d = y6.b(16);
        this.f217293e = androidx.core.content.d.getColor(context, R.color.grid_gallery_placeholder_background);
    }

    @Override // com.avito.android.photo_gallery.grid_gallery.items.single_entity.f
    public final void TX(@k GridGalleryItemEntity gridGalleryItemEntity, @k Y41.a<G0> aVar) {
        Drawable drawableA;
        i iVar = new i(22, aVar);
        ImageView imageView = this.f217291c;
        imageView.setOnClickListener(iVar);
        if (gridGalleryItemEntity instanceof GridGalleryItemEntity.PhotoPreview) {
            drawableA = null;
        } else {
            if (!(gridGalleryItemEntity instanceof GridGalleryItemEntity.VideoPreview)) {
                throw new NoWhenBranchMatchedException();
            }
            drawableA = C43852a.a(this.f217290b, R.drawable.product_specific_ic_explore_item_play_video_normal);
        }
        imageView.setForeground(drawableA);
        GridGalleryItemsUtils gridGalleryItemsUtils = GridGalleryItemsUtils.f217216a;
        Image f217211b = gridGalleryItemEntity.getF217211b();
        gridGalleryItemsUtils.getClass();
        Size size = (Size) C42745f0.F(f217211b.getVariants().keySet());
        GridGalleryItemsUtils.GridGalleryPreviewOrientation gridGalleryPreviewOrientation = (size != null && ((double) size.getWidth()) / ((double) size.getHeight()) < 1.0d) ? GridGalleryItemsUtils.GridGalleryPreviewOrientation.f217222c : GridGalleryItemsUtils.GridGalleryPreviewOrientation.f217221b;
        GridGalleryItemsUtils.a aVarA = GridGalleryItemsUtils.a(this.f217292d, gridGalleryItemEntity.getF217214e(), null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f217293e);
        float f12 = aVarA.f217225a;
        float f13 = aVarA.f217226b;
        float f14 = aVarA.f217227c;
        float f15 = aVarA.f217228d;
        gradientDrawable.setCornerRadii(new float[]{f12, f12, f13, f13, f14, f14, f15, f15});
        ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(imageView));
        aVar2.d(com.avito.android.image_loader.b.b(gridGalleryItemEntity.getF217211b()));
        ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169472c;
        aVar2.f169492j = gradientDrawable;
        aVar2.f169493k = scaleType;
        GridGalleryItemsUtils.b(aVar2, aVarA, gridGalleryPreviewOrientation);
        aVar2.f169486d = gridGalleryPreviewOrientation == GridGalleryItemsUtils.GridGalleryPreviewOrientation.f217221b;
        aVar2.f169490h = new a(gradientDrawable);
        aVar2.c();
    }

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.image_loader.i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GradientDrawable f217295c;

        public a(GradientDrawable gradientDrawable) {
            this.f217295c = gradientDrawable;
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            g.this.f217291c.setBackground(this.f217295c);
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@l Throwable th2) {
        }
    }
}
