package com.yandex.runtime.internal;

import com.yandex.runtime.Error;
import com.yandex.runtime.NativeObject;

/* loaded from: classes8.dex */
public class ErrorBinding implements Error {
    private final NativeObject nativeObject;

    public ErrorBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.Error
    public native boolean isValid();
}
