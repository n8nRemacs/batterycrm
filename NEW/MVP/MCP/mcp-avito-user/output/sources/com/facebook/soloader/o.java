package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: ElfFileChannel.java */
/* loaded from: classes16.dex */
public class o implements n {

    /* renamed from: b, reason: collision with root package name */
    public File f340872b;

    /* renamed from: c, reason: collision with root package name */
    public FileInputStream f340873c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f340874d;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f340873c.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f340874d.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f340874d.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.f340874d.write(byteBuffer);
    }

    @Override // com.facebook.soloader.n
    public final int read(ByteBuffer byteBuffer, long j12) {
        return this.f340874d.read(byteBuffer, j12);
    }
}
