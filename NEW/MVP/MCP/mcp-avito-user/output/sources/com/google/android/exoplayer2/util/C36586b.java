package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: AtomicFile.java */
/* renamed from: com.google.android.exoplayer2.util.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36586b {

    /* renamed from: a, reason: collision with root package name */
    public final File f348119a;

    /* renamed from: b, reason: collision with root package name */
    public final File f348120b;

    /* compiled from: AtomicFile.java */
    /* renamed from: com.google.android.exoplayer2.util.b$a */
    public static final class a extends OutputStream {

        /* renamed from: b, reason: collision with root package name */
        public final FileOutputStream f348121b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f348122c = false;

        public a(File file) {
            this.f348121b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileOutputStream fileOutputStream = this.f348121b;
            if (this.f348122c) {
                return;
            }
            this.f348122c = true;
            flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e12) {
                C36605v.a("Failed to sync file descriptor:", e12);
            }
            fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f348121b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i12) throws IOException {
            this.f348121b.write(i12);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f348121b.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i12, int i13) throws IOException {
            this.f348121b.write(bArr, i12, i13);
        }
    }

    public C36586b(File file) {
        this.f348119a = file;
        this.f348120b = new File(file.getPath() + ".bak");
    }

    public final OutputStream a() throws IOException {
        File file = this.f348119a;
        if (file.exists()) {
            File file2 = this.f348120b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                Objects.toString(file);
                Objects.toString(file2);
            }
        }
        try {
            return new a(file);
        } catch (FileNotFoundException e12) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e12);
            }
            try {
                return new a(file);
            } catch (FileNotFoundException e13) {
                throw new IOException("Couldn't create " + file, e13);
            }
        }
    }
}
