package com.huawei.secure.android.common.util;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
public class d {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
