package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.upstream.B;
import j.P;

/* compiled from: DefaultHlsPlaylistParserFactory.java */
/* loaded from: classes6.dex */
public final class a implements i {
    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public final B.a<h> a(g gVar, @P f fVar) {
        return new HlsPlaylistParser(gVar, fVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public final B.a<h> b() {
        return new HlsPlaylistParser();
    }
}
