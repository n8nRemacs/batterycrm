package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: UniversalCheckedImage.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"getImageDependsOnTheme", "Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/UniversalCheckedImage;", "isLightTheme", "", "getImageDependsOnThemeOrDefault", "_common_network-design_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalCheckedImageKt {
    @l
    public static final Image getImageDependsOnTheme(@k UniversalCheckedImage universalCheckedImage, boolean z12) {
        return z12 ? universalCheckedImage.getImage() : universalCheckedImage.getImageDark();
    }

    @l
    public static final Image getImageDependsOnThemeOrDefault(@k UniversalCheckedImage universalCheckedImage, boolean z12) {
        Image imageDark;
        return (z12 || (imageDark = universalCheckedImage.getImageDark()) == null) ? universalCheckedImage.getImage() : imageDark;
    }
}
