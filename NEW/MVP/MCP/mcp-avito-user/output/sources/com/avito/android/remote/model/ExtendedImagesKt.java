package com.avito.android.remote.model;

import Y61.l;
import android.net.Uri;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;

/* compiled from: ExtendedImages.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"LARGE_IMAGE_HEIGHT", "", "LARGE_IMAGE_WIDTH", "MEDIUM_IMAGE_HEIGHT", "MEDIUM_IMAGE_WIDTH", "getListSizeIcon", "", "image", "Lcom/avito/android/remote/model/Image;", "densityDpi", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedImagesKt {
    private static final int LARGE_IMAGE_HEIGHT = 180;
    private static final int LARGE_IMAGE_WIDTH = 240;
    private static final int MEDIUM_IMAGE_HEIGHT = 105;
    private static final int MEDIUM_IMAGE_WIDTH = 140;

    @l
    public static final String getListSizeIcon(@l Image image, int i12) {
        if (image == null) {
            return null;
        }
        Uri uriD = (i12 == 120 || i12 == 160) ? C35829k2.b(image, MEDIUM_IMAGE_WIDTH, MEDIUM_IMAGE_HEIGHT, 0.0f, 0, 60).d() : C35829k2.b(image, LARGE_IMAGE_WIDTH, LARGE_IMAGE_HEIGHT, 0.0f, 0, 60).d();
        if (uriD != null) {
            return uriD.toString();
        }
        return null;
    }
}
