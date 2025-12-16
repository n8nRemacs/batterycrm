package com.avito.android.photo_gallery_carousel.items.native_video;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.StatusIcon;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: GalleryNativeVideoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/native_video/l;", "Lcom/avito/android/photo_gallery_carousel/items/native_video/k;", "Lcom/avito/android/photo_gallery_carousel/items/common/b;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class l extends com.avito.android.photo_gallery_carousel.items.common.b implements k {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f218003f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f218004g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f218005h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f218006i;

    public l(@Y61.k View view, @Y61.k ViewGroup viewGroup) {
        super(view, viewGroup);
        this.f218003f = (FrameLayout) view.findViewById(R.id.native_video_status_container);
        this.f218004g = (ImageView) view.findViewById(R.id.native_video_status_icon);
        this.f218005h = (TextView) view.findViewById(R.id.native_video_status_text);
        this.f218006i = (ImageView) view.findViewById(R.id.native_video_play_image);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.native_video.k
    public final void CR(boolean z12) {
        this.f218003f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.native_video.k
    public final void J8(@Y61.l String str) {
        I5.a(this.f218005h, str, false);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.native_video.k
    public final void dP(@Y61.l StatusIcon statusIcon) {
        ImageView imageView = this.f218004g;
        if (statusIcon == null) {
            D6.w(imageView);
            return;
        }
        D6.H(imageView);
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.f(Uri.parse(statusIcon.getUrl()));
        aVar.c();
        imageView.setColorFilter(C48063a.f437606a.a(imageView.getContext(), statusIcon.getColor()));
    }

    @Override // com.avito.android.photo_gallery_carousel.items.native_video.k
    public final void uW(boolean z12) {
        this.f218006i.setVisibility(z12 ? 0 : 8);
    }
}
