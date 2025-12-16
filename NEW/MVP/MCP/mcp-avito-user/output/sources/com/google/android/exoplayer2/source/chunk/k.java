package com.google.android.exoplayer2.source.chunk;

import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* compiled from: DataChunk.java */
/* loaded from: classes6.dex */
public abstract class k extends e {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f346228j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f346229k;

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        this.f346229k = true;
    }

    public abstract void b(int i12, byte[] bArr);

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() {
        try {
            this.f346226i.e(this.f346219b);
            int i12 = 0;
            int i13 = 0;
            while (i12 != -1 && !this.f346229k) {
                byte[] bArr = this.f346228j;
                if (bArr.length < i13 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    this.f346228j = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
                }
                i12 = this.f346226i.read(this.f346228j, i13, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i12 != -1) {
                    i13 += i12;
                }
            }
            if (!this.f346229k) {
                b(i13, this.f346228j);
            }
            com.google.android.exoplayer2.upstream.o.a(this.f346226i);
        } catch (Throwable th2) {
            com.google.android.exoplayer2.upstream.o.a(this.f346226i);
            throw th2;
        }
    }
}
