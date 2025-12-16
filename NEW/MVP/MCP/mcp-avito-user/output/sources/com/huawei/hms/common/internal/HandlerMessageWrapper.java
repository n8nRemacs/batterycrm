package com.huawei.hms.common.internal;

import com.huawei.hms.common.HuaweiApi;

/* loaded from: classes7.dex */
class HandlerMessageWrapper {
    final HuaweiApi<?> mApi;
    final BaseContentWrapper mContentWrapper;

    public HandlerMessageWrapper(BaseContentWrapper baseContentWrapper, int i12, HuaweiApi<?> huaweiApi) {
        this.mContentWrapper = baseContentWrapper;
        this.mApi = huaweiApi;
    }
}
