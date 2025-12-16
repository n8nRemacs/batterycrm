package androidx.media3.common.util;

import android.os.Trace;

/* compiled from: TraceUtil.java */
@J
/* loaded from: classes.dex */
public final class H {
    public static void a(String str) {
        if (M.f47887a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (M.f47887a >= 18) {
            Trace.endSection();
        }
    }
}
