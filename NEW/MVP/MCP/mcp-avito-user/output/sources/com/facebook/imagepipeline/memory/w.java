package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: MemoryChunk.java */
@Nullsafe
/* loaded from: classes13.dex */
public interface w {
    int a(int i12, int i13, int i14, byte[] bArr);

    void b(w wVar, int i12);

    void close();

    int e(int i12, int i13, int i14, byte[] bArr);

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte l(int i12);
}
