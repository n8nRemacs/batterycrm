package com.avito.android.image_loader.fresco;

import com.avito.android.image_loader.ImageRequest;
import com.facebook.drawee.drawable.s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FrescoImageLoader.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_image-loader-fresco_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: FrescoImageLoader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ImageRequest.ScaleType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169471b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ImageRequest.ScaleType scaleType2 = ImageRequest.ScaleType.f169471b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ImageRequest.ScaleType scaleType3 = ImageRequest.ScaleType.f169471b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Y61.k
    public static final s.a a(@Y61.k ImageRequest.ScaleType scaleType) {
        s.c cVar;
        int iOrdinal = scaleType.ordinal();
        if (iOrdinal == 0) {
            cVar = s.c.f340129a;
        } else if (iOrdinal == 1) {
            cVar = s.c.f340137i;
        } else if (iOrdinal == 2) {
            cVar = s.c.f340133e;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = s.c.f340135g;
        }
        return (s.a) cVar;
    }
}
