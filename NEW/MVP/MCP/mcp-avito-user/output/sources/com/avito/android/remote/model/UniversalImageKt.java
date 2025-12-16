package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: UniversalImage.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"universalImageOf", "Lcom/avito/android/remote/model/UniversalImage;", "value", "Lcom/avito/android/remote/model/Image;", "valueDark", "getImageDependsOnTheme", "isLightTheme", "", "getImageDependsOnThemeOrDefault", "_common_network-design_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalImageKt {
    @l
    public static final Image getImageDependsOnTheme(@k UniversalImage universalImage, boolean z12) {
        return z12 ? universalImage.getImage() : universalImage.getImageDark();
    }

    @l
    public static final Image getImageDependsOnThemeOrDefault(@k UniversalImage universalImage, boolean z12) {
        Image imageDark;
        return (z12 || (imageDark = universalImage.getImageDark()) == null) ? universalImage.getImage() : imageDark;
    }

    @k
    public static final UniversalImage universalImageOf(@l Image image, @l Image image2) {
        return new UniversalImage(image, image2);
    }

    public static /* synthetic */ UniversalImage universalImageOf$default(Image image, Image image2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = null;
        }
        if ((i12 & 2) != 0) {
            image2 = null;
        }
        return universalImageOf(image, image2);
    }
}
