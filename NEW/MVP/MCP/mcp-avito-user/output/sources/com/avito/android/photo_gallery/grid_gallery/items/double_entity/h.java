package com.avito.android.photo_gallery.grid_gallery.items.double_entity;

import Y61.k;
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
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m.C43852a;

/* compiled from: GridGalleryDoubleEntityView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/double_entity/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery/grid_gallery/items/double_entity/g;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f217257g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f217258b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f217259c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f217260d;

    /* renamed from: e, reason: collision with root package name */
    public final float f217261e;

    /* renamed from: f, reason: collision with root package name */
    public final int f217262f;

    public h(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f217258b = context;
        this.f217259c = (ImageView) view.findViewById(R.id.leftPreview);
        this.f217260d = (ImageView) view.findViewById(R.id.rightPreview);
        this.f217261e = y6.b(16);
        this.f217262f = androidx.core.content.d.getColor(context, R.color.grid_gallery_placeholder_background);
    }

    public final void B80(ImageView imageView, GridGalleryItemEntity gridGalleryItemEntity, GridGalleryItemsUtils.GridGalleryDoubleItemInsidePositionType gridGalleryDoubleItemInsidePositionType) {
        Drawable drawableA;
        if (gridGalleryItemEntity instanceof GridGalleryItemEntity.PhotoPreview) {
            drawableA = null;
        } else {
            if (!(gridGalleryItemEntity instanceof GridGalleryItemEntity.VideoPreview)) {
                throw new NoWhenBranchMatchedException();
            }
            drawableA = C43852a.a(this.f217258b, R.drawable.product_specific_ic_explore_item_play_video_normal);
        }
        imageView.setForeground(drawableA);
        GridGalleryItemsUtils gridGalleryItemsUtils = GridGalleryItemsUtils.f217216a;
        GridGalleryItemEntity.PositionType f217214e = gridGalleryItemEntity.getF217214e();
        gridGalleryItemsUtils.getClass();
        GridGalleryItemsUtils.a aVarA = GridGalleryItemsUtils.a(this.f217261e, f217214e, gridGalleryDoubleItemInsidePositionType);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f217262f);
        float f12 = aVarA.f217225a;
        float f13 = aVarA.f217226b;
        float f14 = aVarA.f217227c;
        float f15 = aVarA.f217228d;
        gradientDrawable.setCornerRadii(new float[]{f12, f12, f13, f13, f14, f14, f15, f15});
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.d(com.avito.android.image_loader.b.b(gridGalleryItemEntity.getF217211b()));
        ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169471b;
        aVar.f169492j = gradientDrawable;
        aVar.f169493k = scaleType;
        aVar.f169486d = true;
        GridGalleryItemsUtils.b(aVar, aVarA, GridGalleryItemsUtils.GridGalleryPreviewOrientation.f217221b);
        aVar.c();
    }

    @Override // com.avito.android.photo_gallery.grid_gallery.items.double_entity.g
    public final void XZ(@k GridGalleryItemEntity gridGalleryItemEntity, @k GridGalleryItemEntity gridGalleryItemEntity2, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        i iVar = new i(19, aVar);
        ImageView imageView = this.f217259c;
        imageView.setOnClickListener(iVar);
        i iVar2 = new i(20, aVar2);
        ImageView imageView2 = this.f217260d;
        imageView2.setOnClickListener(iVar2);
        B80(imageView, gridGalleryItemEntity, GridGalleryItemsUtils.GridGalleryDoubleItemInsidePositionType.f217217b);
        B80(imageView2, gridGalleryItemEntity2, GridGalleryItemsUtils.GridGalleryDoubleItemInsidePositionType.f217218c);
    }
}
