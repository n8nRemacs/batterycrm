package androidx.security.crypto;

import j.N;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes10.dex */
public final class EncryptedFile {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FileEncryptionScheme {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ FileEncryptionScheme[] f54438b = {new FileEncryptionScheme("AES256_GCM_HKDF_4KB", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        FileEncryptionScheme EF5;

        public FileEncryptionScheme() {
            throw null;
        }

        public static FileEncryptionScheme valueOf(String str) {
            return (FileEncryptionScheme) Enum.valueOf(FileEncryptionScheme.class, str);
        }

        public static FileEncryptionScheme[] values() {
            return (FileEncryptionScheme[]) f54438b.clone();
        }
    }

    public static final class a {
    }

    public static final class b extends FileInputStream {
        @Override // java.io.FileInputStream, java.io.InputStream
        public final int available() {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.FileInputStream
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public final void mark(int i12) {
            throw null;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final long skip(long j12) {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(@N byte[] bArr) {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(@N byte[] bArr, int i12, int i13) {
            throw null;
        }
    }

    public static final class c extends FileOutputStream {
        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.FileOutputStream
        @N
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(@N byte[] bArr) {
            throw null;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(int i12) {
            throw null;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(@N byte[] bArr, int i12, int i13) {
            throw null;
        }
    }
}
