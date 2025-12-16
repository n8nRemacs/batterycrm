package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    private final File f386443a;

    /* renamed from: b, reason: collision with root package name */
    private final File f386444b;

    public static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f386445a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f386446b = false;

        public a(File file) {
            this.f386445a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f386446b) {
                return;
            }
            this.f386446b = true;
            this.f386445a.flush();
            try {
                this.f386445a.getFD().sync();
            } catch (IOException e12) {
                ka0.b("AtomicFile", "Failed to sync file descriptor:", e12);
            }
            this.f386445a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f386445a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i12) throws IOException {
            this.f386445a.write(i12);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f386445a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i12, int i13) throws IOException {
            this.f386445a.write(bArr, i12, i13);
        }
    }

    public ic(File file) {
        this.f386443a = file;
        this.f386444b = new File(file.getPath() + ".bak");
    }

    public final void a() {
        this.f386443a.delete();
        this.f386444b.delete();
    }

    public final boolean b() {
        return this.f386443a.exists() || this.f386444b.exists();
    }

    public final FileInputStream c() {
        if (this.f386444b.exists()) {
            this.f386443a.delete();
            this.f386444b.renameTo(this.f386443a);
        }
        return new FileInputStream(this.f386443a);
    }

    public final OutputStream d() throws IOException {
        if (this.f386443a.exists()) {
            if (this.f386444b.exists()) {
                this.f386443a.delete();
            } else if (!this.f386443a.renameTo(this.f386444b)) {
                StringBuilder sbA = Cif.a("Couldn't rename file ");
                sbA.append(this.f386443a);
                sbA.append(" to backup file ");
                sbA.append(this.f386444b);
                ka0.d("AtomicFile", sbA.toString());
            }
        }
        try {
            return new a(this.f386443a);
        } catch (FileNotFoundException e12) {
            File parentFile = this.f386443a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder sbA2 = Cif.a("Couldn't create ");
                sbA2.append(this.f386443a);
                throw new IOException(sbA2.toString(), e12);
            }
            try {
                return new a(this.f386443a);
            } catch (FileNotFoundException e13) {
                StringBuilder sbA3 = Cif.a("Couldn't create ");
                sbA3.append(this.f386443a);
                throw new IOException(sbA3.toString(), e13);
            }
        }
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f386444b.delete();
    }
}
