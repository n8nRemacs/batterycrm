package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.z;

/* compiled from: TrackSelectionUtil.java */
/* loaded from: classes6.dex */
public final class s {

    /* compiled from: TrackSelectionUtil.java */
    public interface a {
    }

    public static z.a a(k kVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = kVar.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (kVar.p(i13, jElapsedRealtime)) {
                i12++;
            }
        }
        return new z.a(length, i12);
    }
}
