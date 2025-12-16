package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Map;

/* compiled from: ProgressiveMediaExtractor.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface G {

    /* compiled from: ProgressiveMediaExtractor.java */
    public interface a {
        G a(androidx.media3.exoplayer.analytics.w wVar);
    }

    void a(long j12, long j13);

    void b();

    long c();

    void d(androidx.media3.datasource.j jVar, Uri uri, Map map, long j12, long j13, androidx.media3.extractor.r rVar);

    int e(androidx.media3.extractor.F f12);

    void release();
}
