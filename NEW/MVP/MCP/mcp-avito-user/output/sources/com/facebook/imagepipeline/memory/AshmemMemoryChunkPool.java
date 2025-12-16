package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import com.facebook.infer.annotation.Nullsafe;
import com.huawei.hms.adapter.internal.AvailableCode;

@J41.d
@com.facebook.common.internal.g
@TargetApi(AvailableCode.USER_IGNORE_PREVIOUS_POPUP)
@Nullsafe
/* loaded from: classes13.dex */
public class AshmemMemoryChunkPool extends x {
    @com.facebook.common.internal.g
    public AshmemMemoryChunkPool(wW0.c cVar, G g12, H h12) {
        super(cVar, g12, h12);
    }

    @Override // com.facebook.imagepipeline.memory.x, com.facebook.imagepipeline.memory.BasePool
    public final w d(int i12) {
        return new C36383a(i12);
    }

    @Override // com.facebook.imagepipeline.memory.x
    /* renamed from: r */
    public final w d(int i12) {
        return new C36383a(i12);
    }
}
