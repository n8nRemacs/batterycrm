package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.infer.annotation.Nullsafe;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: OreoDecoder.java */
@J41.d
@TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
@Nullsafe
/* loaded from: classes13.dex */
public class c extends b {
    @Override // com.facebook.imagepipeline.platform.b
    public final int d(BitmapFactory.Options options, int i12, int i13) {
        ColorSpace colorSpace = options.outColorSpace;
        if (colorSpace != null && colorSpace.isWideGamut() && options.inPreferredConfig != Bitmap.Config.RGBA_F16) {
            return i12 * i13 * 8;
        }
        Bitmap.Config config = options.inPreferredConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return BitmapUtil.getSizeInByteForBitmap(i12, i13, config);
    }
}
