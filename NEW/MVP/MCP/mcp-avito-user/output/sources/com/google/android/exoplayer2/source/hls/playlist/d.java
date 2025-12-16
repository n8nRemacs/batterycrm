package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.n;
import com.google.android.exoplayer2.upstream.B;
import j.P;
import java.util.List;

/* compiled from: FilteringHlsPlaylistParserFactory.java */
/* loaded from: classes6.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a f346466a;

    /* renamed from: b, reason: collision with root package name */
    public final List<StreamKey> f346467b;

    public d(a aVar, List list) {
        this.f346466a = aVar;
        this.f346467b = list;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public final B.a<h> a(g gVar, @P f fVar) {
        this.f346466a.getClass();
        return new n(new HlsPlaylistParser(gVar, fVar), this.f346467b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public final B.a<h> b() {
        this.f346466a.getClass();
        return new n(new HlsPlaylistParser(), this.f346467b);
    }
}
