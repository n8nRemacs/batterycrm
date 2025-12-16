package com.avito.android.avito_map.yandex;

import Y61.k;
import android.graphics.Bitmap;
import com.yandex.runtime.image.ImageProvider;
import kotlin.Metadata;

/* compiled from: YandexAvitoMapImageProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/avito/android/avito_map/yandex/YandexAvitoMapImageProvider;", "Lcom/yandex/runtime/image/ImageProvider;", "imageBitmap", "Landroid/graphics/Bitmap;", "imageId", "", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getId", "getImage", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexAvitoMapImageProvider extends ImageProvider {

    @k
    private final Bitmap imageBitmap;

    @k
    private final String imageId;

    public YandexAvitoMapImageProvider(@k Bitmap bitmap, @k String str) {
        this.imageBitmap = bitmap;
        this.imageId = str;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    @k
    /* renamed from: getId, reason: from getter */
    public String getImageId() {
        return this.imageId;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    @k
    /* renamed from: getImage, reason: from getter */
    public Bitmap getImageBitmap() {
        return this.imageBitmap;
    }
}
