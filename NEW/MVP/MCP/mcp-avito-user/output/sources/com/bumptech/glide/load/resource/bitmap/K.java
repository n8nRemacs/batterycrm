package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: VideoDecoder.java */
/* loaded from: classes5.dex */
class K extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f339359b;

    public K(ByteBuffer byteBuffer) {
        this.f339359b = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f339359b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j12, byte[] bArr, int i12, int i13) {
        ByteBuffer byteBuffer = this.f339359b;
        if (j12 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j12);
        int iMin = Math.min(i13, byteBuffer.remaining());
        byteBuffer.get(bArr, i12, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
