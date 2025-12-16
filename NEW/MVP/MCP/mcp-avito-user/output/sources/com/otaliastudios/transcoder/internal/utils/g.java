package com.otaliastudios.transcoder.internal.utils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: eos.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/utils/g;", "Lcom/otaliastudios/transcoder/sink/a;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class g implements com.otaliastudios.transcoder.sink.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.sink.b f366218a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f366219b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MediaCodec.BufferInfo f366220c = new MediaCodec.BufferInfo();

    public g(@Y61.k com.otaliastudios.transcoder.sink.b bVar, @Y61.k Y41.a aVar) {
        this.f366218a = bVar;
        this.f366219b = aVar;
    }

    @Override // com.otaliastudios.transcoder.sink.a
    public final void a(@N @Y61.k TrackType trackType, @N @Y61.k MediaFormat mediaFormat) {
        this.f366218a.a(trackType, mediaFormat);
    }

    @Override // com.otaliastudios.transcoder.sink.a
    public final void b(@Y61.k TrackType trackType, @Y61.k ByteBuffer byteBuffer, @Y61.k MediaCodec.BufferInfo bufferInfo) {
        boolean zBooleanValue = this.f366219b.invoke().booleanValue();
        com.otaliastudios.transcoder.sink.b bVar = this.f366218a;
        if (!zBooleanValue) {
            bVar.b(trackType, byteBuffer, bufferInfo);
            return;
        }
        int i12 = bufferInfo.flags & (-5);
        int i13 = bufferInfo.size;
        if (i13 > 0 || i12 != 0) {
            this.f366220c.set(bufferInfo.offset, i13, bufferInfo.presentationTimeUs, i12);
            bVar.b(trackType, byteBuffer, this.f366220c);
        }
    }
}
