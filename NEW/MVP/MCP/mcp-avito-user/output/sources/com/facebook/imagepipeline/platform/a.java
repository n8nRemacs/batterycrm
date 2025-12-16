package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ArtDecoder.java */
@J41.d
@TargetApi(21)
@Nullsafe
/* loaded from: classes13.dex */
public class a extends b {
    @Override // com.facebook.imagepipeline.platform.b
    public final int d(BitmapFactory.Options options, int i12, int i13) {
        Bitmap.Config config = options.inPreferredConfig;
        config.getClass();
        return BitmapUtil.getSizeInByteForBitmap(i12, i13, config);
    }
}
