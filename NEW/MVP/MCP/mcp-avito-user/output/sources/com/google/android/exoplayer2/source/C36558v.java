package com.google.android.exoplayer2.source;

import android.media.MediaParser;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import java.io.IOException;
import java.util.Map;

/* compiled from: MediaParserExtractorAdapter.java */
@j.X
/* renamed from: com.google.android.exoplayer2.source.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36558v implements D {

    /* renamed from: a, reason: collision with root package name */
    public String f346695a;

    @Override // com.google.android.exoplayer2.source.D
    public final void a(long j12, long j13) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.D
    public final void b() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f346695a)) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.source.D
    public final long c() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.D
    public final void d(InterfaceC36583m interfaceC36583m, Uri uri, Map map, long j12, long j13, com.google.android.exoplayer2.extractor.l lVar) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.D
    public final int e(com.google.android.exoplayer2.extractor.w wVar) throws IOException {
        ((MediaParser) null).advance(null);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.D
    public final void release() {
        ((MediaParser) null).release();
    }
}
