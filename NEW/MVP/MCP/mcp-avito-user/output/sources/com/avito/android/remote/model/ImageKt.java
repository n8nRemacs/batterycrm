package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import android.net.Uri;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"toImage", "Lcom/avito/android/remote/model/Image;", "Landroid/net/Uri;", "toSingleImage", "_common_image-loader_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImageKt {
    @k
    public static final Image toImage(@k Uri uri) {
        return new Image(Collections.singletonMap(new Size(640, 480), uri));
    }

    @l
    public static final Image toSingleImage(@l Uri uri) {
        if (uri == null || uri.equals(Uri.EMPTY)) {
            return null;
        }
        return new Image(Collections.singletonMap(new Size(640, 480), uri));
    }
}
