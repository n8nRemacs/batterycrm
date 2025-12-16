package com.google.firebase.installations;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* compiled from: CrossProcessLock.java */
/* loaded from: classes6.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f361632a;

    /* renamed from: b, reason: collision with root package name */
    public final FileLock f361633b;

    public d(FileChannel fileChannel, FileLock fileLock) {
        this.f361632a = fileChannel;
        this.f361633b = fileLock;
    }

    public static d a(Context context) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new d(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    public final void b() throws IOException {
        try {
            this.f361633b.release();
            this.f361632a.close();
        } catch (IOException unused) {
        }
    }
}
