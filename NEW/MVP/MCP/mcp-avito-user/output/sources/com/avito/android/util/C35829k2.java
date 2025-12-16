package com.avito.android.util;

import android.net.Uri;
import android.view.View;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Images.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_image-loader_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: com.avito.android.util.k2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35829k2 {
    public static final float a(@Y61.l Image image) {
        Map<Size, Uri> variants;
        Set<Size> setKeySet;
        Size size;
        if (image == null || (variants = image.getVariants()) == null || (setKeySet = variants.keySet()) == null || (size = (Size) C42745f0.F(setKeySet)) == null) {
            return 1.0f;
        }
        return size.getWidth() / size.getHeight();
    }

    public static C35742a2 b(Image image, int i12, int i13, float f12, int i14, int i15) {
        if ((i15 & 8) != 0) {
            f12 = 1.5f;
        }
        float f13 = f12;
        if ((i15 & 16) != 0) {
            i14 = 0;
        }
        return new C35742a2(image != null ? image.getVariants() : null, i12, i13, 0.0f, f13, i14, false);
    }

    public static C35742a2 c(Image image, View view, int i12, int i13) {
        float f12 = (i13 & 2) != 0 ? 0.0f : 1.0f;
        float f13 = (i13 & 4) != 0 ? 1.5f : 2.0f;
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        int i14 = i12;
        return new C35742a2(image != null ? image.getVariants() : null, D6.s(view), D6.r(view), f12, f13, i14, false);
    }
}
