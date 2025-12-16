package com.yandex.runtime.internal;

import java.io.File;

/* loaded from: classes8.dex */
class AvailableSpace {
    public static long getAvailableSpaceOnFilesystem(String str) {
        return new File(str).getUsableSpace();
    }
}
