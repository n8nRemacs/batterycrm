package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.InterfaceC36733z;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@InterfaceC36733z
@Deprecated
/* loaded from: classes6.dex */
public final class q {
    @RX0.a
    public static void a(@I41.h Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
