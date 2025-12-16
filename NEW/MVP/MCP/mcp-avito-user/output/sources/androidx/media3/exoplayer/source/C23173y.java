package androidx.media3.exoplayer.source;

import android.media.MediaParser;
import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: MediaParserExtractorAdapter.java */
@androidx.media3.common.util.J
@j.X
/* renamed from: androidx.media3.exoplayer.source.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23173y implements G {

    /* renamed from: a, reason: collision with root package name */
    public String f49858a;

    @Override // androidx.media3.exoplayer.source.G
    public final void a(long j12, long j13) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.G
    public final void b() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f49858a)) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.G
    public final long c() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.G
    public final void d(androidx.media3.datasource.j jVar, Uri uri, Map map, long j12, long j13, androidx.media3.extractor.r rVar) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.G
    public final int e(androidx.media3.extractor.F f12) throws IOException {
        ((MediaParser) null).advance(null);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.G
    public final void release() {
        ((MediaParser) null).release();
    }
}
