package com.avito.android.photo_gallery.grid_gallery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.grid_gallery.GridGallery;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GridGalleryViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/E;", "", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E {

    /* compiled from: GridGalleryViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217315a;

        static {
            int[] iArr = new int[GridGallery.VideoType.values().length];
            try {
                iArr[GridGallery.VideoType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GridGallery.VideoType.NATIVE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f217315a = iArr;
        }
    }

    @Inject
    public E() {
    }

    public static int a(int i12, Integer num, Integer num2, Integer num3, List list) {
        if (num != null && i12 >= num.intValue()) {
            i12++;
        }
        if (num2 != null && i12 >= num2.intValue()) {
            i12++;
        }
        return (num3 == null || i12 < num3.intValue()) ? i12 : i12 + list.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T70.e b(@Y61.k T70.e r34) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.grid_gallery.mvi.E.b(T70.e):T70.e");
    }

    public static GridGalleryItemEntity c(GridGallery.RowItem rowItem, int i12, GridGalleryItemEntity.PositionType positionType, List list, Video video, NativeVideo nativeVideo, List list2, GridGallery.BlockType blockType, T70.b bVar) {
        GridGalleryItemEntity.VideoPreview videoPreview;
        Image previewImage;
        Image thumbnail;
        int iA2;
        int iA3;
        List list3 = list2;
        if (rowItem instanceof GridGallery.RowItem.Photo) {
            GridGallery.BlockType blockType2 = GridGallery.BlockType.REALTY_IMAGES;
            boolean z12 = blockType == blockType2;
            if (z12) {
                Integer num = bVar.f15397f;
                iA2 = num != null ? num.intValue() : 0;
            } else {
                iA2 = a(((GridGallery.RowItem.Photo) rowItem).getPosition(), bVar.f15395d, bVar.f15396e, bVar.f15397f, list3);
            }
            if (z12) {
                Integer num2 = bVar.f15394c;
                iA3 = ((GridGallery.RowItem.Photo) rowItem).getPosition() + (num2 != null ? num2.intValue() : 0);
            } else {
                iA3 = a(((GridGallery.RowItem.Photo) rowItem).getPosition(), bVar.f15392a, bVar.f15393b, bVar.f15394c, list3);
            }
            if (blockType != blockType2) {
                list3 = list;
            }
            Image image = (Image) C42745f0.K(((GridGallery.RowItem.Photo) rowItem).getPosition(), list3);
            if (image == null) {
                return null;
            }
            return new GridGalleryItemEntity.PhotoPreview(image, iA2, iA3, positionType, i12);
        }
        if (!(rowItem instanceof GridGallery.RowItem.Video)) {
            return null;
        }
        GridGallery.VideoType type = ((GridGallery.RowItem.Video) rowItem).getType();
        int i13 = type == null ? -1 : a.f217315a[type.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return null;
            }
            if ((nativeVideo != null ? nativeVideo.getUrl() : null) == null || nativeVideo.getThumbnail() == null || (thumbnail = nativeVideo.getThumbnail()) == null) {
                return null;
            }
            Integer num3 = bVar.f15396e;
            int iIntValue = num3 != null ? num3.intValue() : 0;
            Integer num4 = bVar.f15392a;
            videoPreview = new GridGalleryItemEntity.VideoPreview(thumbnail, iIntValue, num4 != null ? num4.intValue() : 0, positionType, i12);
        } else {
            if (video == null || (previewImage = video.getPreviewImage()) == null) {
                return null;
            }
            Integer num5 = bVar.f15395d;
            int iIntValue2 = num5 != null ? num5.intValue() : 0;
            Integer num6 = bVar.f15392a;
            videoPreview = new GridGalleryItemEntity.VideoPreview(previewImage, iIntValue2, num6 != null ? num6.intValue() : 0, positionType, i12);
        }
        return videoPreview;
    }
}
