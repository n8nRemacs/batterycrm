package com.google.android.exoplayer2.util;

import android.os.Trace;

/* compiled from: TraceUtil.java */
/* loaded from: classes6.dex */
public final class P {
    public static void a(String str) {
        if (U.f348106a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (U.f348106a >= 18) {
            Trace.endSection();
        }
    }
}
