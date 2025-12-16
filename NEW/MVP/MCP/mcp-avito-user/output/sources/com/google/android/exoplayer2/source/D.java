package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import java.util.Map;

/* compiled from: ProgressiveMediaExtractor.java */
/* loaded from: classes6.dex */
public interface D {

    /* compiled from: ProgressiveMediaExtractor.java */
    public interface a {
        D a(com.google.android.exoplayer2.analytics.p pVar);
    }

    void a(long j12, long j13);

    void b();

    long c();

    void d(InterfaceC36583m interfaceC36583m, Uri uri, Map map, long j12, long j13, com.google.android.exoplayer2.extractor.l lVar);

    int e(com.google.android.exoplayer2.extractor.w wVar);

    void release();
}
