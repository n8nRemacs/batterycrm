package com.otaliastudios.transcoder.internal.data;

import Y61.k;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.k;
import com.otaliastudios.transcoder.internal.pipeline.l;
import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Writer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/transcoder/internal/data/g;", "Lcom/otaliastudios/transcoder/internal/pipeline/l;", "Lcom/otaliastudios/transcoder/internal/data/i;", "Lcom/otaliastudios/transcoder/internal/data/h;", "Lkotlin/G0;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g implements l<i, h, G0, com.otaliastudios.transcoder.internal.pipeline.b>, h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.otaliastudios.transcoder.sink.a f366109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrackType f366110c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f366111d = this;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final MediaCodec.BufferInfo f366112e = new MediaCodec.BufferInfo();

    public g(@k com.otaliastudios.transcoder.sink.a aVar, @k TrackType trackType) {
        this.f366109b = aVar;
        this.f366110c = trackType;
    }

    @Override // com.otaliastudios.transcoder.internal.data.h
    public final void d(@k MediaFormat mediaFormat) {
        mediaFormat.toString();
        this.f366109b.a(this.f366110c, mediaFormat);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366111d;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @k
    public final com.otaliastudios.transcoder.internal.pipeline.k<G0> s(@k k.b<i> bVar, boolean z12) {
        i iVar = bVar.f366179a;
        ByteBuffer byteBuffer = iVar.f366113a;
        boolean z13 = bVar instanceof k.a;
        int iPosition = byteBuffer.position();
        int iRemaining = byteBuffer.remaining();
        int i12 = iVar.f366115c;
        if (z13) {
            i12 &= 4;
        }
        this.f366112e.set(iPosition, iRemaining, iVar.f366114b, i12);
        this.f366109b.b(this.f366110c, byteBuffer, this.f366112e);
        iVar.f366116d.invoke();
        return z13 ? new k.a(G0.f406611a) : new k.b(G0.f406611a);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void release() {
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void t(@Y61.k com.otaliastudios.transcoder.internal.pipeline.b bVar) {
    }
}
