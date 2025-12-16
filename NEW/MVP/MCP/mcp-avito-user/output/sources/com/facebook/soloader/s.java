package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* compiled from: FileLocker.java */
/* loaded from: classes16.dex */
public final class s implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final FileOutputStream f340895b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public final FileLock f340896c;

    public s(File file, boolean z12) throws IOException {
        FileLock fileLockTryLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f340895b = fileOutputStream;
        try {
            if (z12) {
                try {
                    fileLockTryLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLockTryLock = null;
                }
            } else {
                fileLockTryLock = fileOutputStream.getChannel().lock();
            }
            if (fileLockTryLock == null) {
            }
            this.f340896c = fileLockTryLock;
        } finally {
            this.f340895b.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            FileLock fileLock = this.f340896c;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f340895b.close();
        }
    }
}
