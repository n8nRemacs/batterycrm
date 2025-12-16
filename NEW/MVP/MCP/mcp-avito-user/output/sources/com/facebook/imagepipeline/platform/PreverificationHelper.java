package com.facebook.imagepipeline.platform;

import I41.h;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.InterfaceC36428e;
import com.huawei.hms.adapter.internal.AvailableCode;

@InterfaceC36428e
@Nullsafe
/* loaded from: classes13.dex */
class PreverificationHelper {
    @InterfaceC36428e
    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public boolean shouldUseHardwareBitmapConfig(@h Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
