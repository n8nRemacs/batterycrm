package com.avito.android.advert.item.developer.trust;

import android.net.Uri;
import android.widget.ImageView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.y6;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DeveloperTrustView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {
    public static final void a(ImageView imageView, Image image) {
        Map<Size, Uri> variants;
        Set<Size> setKeySet;
        Size size;
        if (image == null || (variants = image.getVariants()) == null || (setKeySet = variants.keySet()) == null || (size = (Size) C42745f0.F(setKeySet)) == null) {
            return;
        }
        int width = (int) (32 * (size.getWidth() / size.getHeight()));
        if (width < 48) {
            imageView.getLayoutParams().width = y6.b(width);
            imageView.requestLayout();
        }
    }
}
