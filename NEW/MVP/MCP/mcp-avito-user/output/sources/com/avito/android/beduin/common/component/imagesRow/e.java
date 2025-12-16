package com.avito.android.beduin.common.component.imagesRow;

import Y61.k;
import android.net.Uri;
import com.avito.android.beduin.common.component.image.Size;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Images.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {
    @k
    public static final Size a(@k Image image, int i12) {
        Map<com.avito.android.remote.model.Size, Uri> variants;
        Set<com.avito.android.remote.model.Size> setKeySet;
        com.avito.android.remote.model.Image image2 = image.getUniversalImage().getImage();
        com.avito.android.remote.model.Size size = (image2 == null || (variants = image2.getVariants()) == null || (setKeySet = variants.keySet()) == null) ? null : (com.avito.android.remote.model.Size) C42745f0.F(setKeySet);
        return new Size((int) (i12 / ((size != null ? size.getHeight() : 0) / (size != null ? size.getWidth() : 0))), i12);
    }
}
