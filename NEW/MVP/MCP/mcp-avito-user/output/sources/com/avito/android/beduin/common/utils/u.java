package com.avito.android.beduin.common.utils;

import android.content.Context;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;

/* compiled from: ImageRequests.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u {
    public static final void a(@Y61.k ImageRequest.a aVar, @Y61.l ImageStyle imageStyle, @Y61.k Context context) {
        UniversalColor loadingColor;
        if (imageStyle == null || (loadingColor = imageStyle.getLoadingColor()) == null) {
            aVar.f169492j = null;
            aVar.f169493k = null;
        } else {
            aVar.f169492j = H.a(context, loadingColor);
            aVar.f169493k = null;
        }
    }
}
