package com.avito.android.beduin.common.component.imagesRow;

import com.avito.android.beduin.common.action.BeduinOpenGalleryAction;
import com.avito.android.beduin.common.component.image.BeduinImageModel;
import com.avito.android.beduin.common.component.image.ImageStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesRowMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/imagesRow/f;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {
    public static BeduinImageModel a(BeduinImagesRowModel beduinImagesRowModel, int i12, Image image, boolean z12) {
        List listSingletonList;
        ImageStyle lastImageStyle;
        ImageStyle style = image.getStyle();
        if (style == null) {
            style = beduinImagesRowModel.getImageStyle();
        }
        String str = beduinImagesRowModel.getF100947b() + "_image" + i12;
        if (L.f(beduinImagesRowModel.getShouldOpenGallery(), Boolean.TRUE)) {
            List<Image> images = beduinImagesRowModel.getImages();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = images.iterator();
            while (it.hasNext()) {
                com.avito.android.remote.model.Image image2 = ((Image) it.next()).getUniversalImage().getImage();
                if (image2 != null) {
                    arrayList.add(image2);
                }
            }
            listSingletonList = Collections.singletonList(new BeduinOpenGalleryAction(arrayList, Integer.valueOf(i12), null, 4, null));
        } else {
            listSingletonList = null;
        }
        return new BeduinImageModel(str, null, listSingletonList, image.getUniversalImage(), null, null, e.a(image, beduinImagesRowModel.getHeight()), (!z12 || (lastImageStyle = beduinImagesRowModel.getLastImageStyle()) == null) ? style : lastImageStyle, null, null, 512, null);
    }
}
