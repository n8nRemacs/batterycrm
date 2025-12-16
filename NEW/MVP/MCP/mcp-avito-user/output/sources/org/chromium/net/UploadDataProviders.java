package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes7.dex */
public final class UploadDataProviders {

    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f420246a;

        public a(File file) {
            this.f420246a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public final FileChannel r() {
            return new FileInputStream(this.f420246a).getChannel();
        }
    }

    public class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f420247a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f420247a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public final FileChannel r() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f420247a;
            if (parcelFileDescriptor.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
            }
            parcelFileDescriptor.close();
            throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
        }
    }

    public static final class c extends UploadDataProvider {

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f420248b;

        public c(ByteBuffer byteBuffer, a aVar) {
            this.f420248b = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return this.f420248b.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.f420248b;
            if (iRemaining >= byteBuffer2.remaining()) {
                byteBuffer.put(byteBuffer2);
            } else {
                int iLimit = byteBuffer2.limit();
                byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
                byteBuffer.put(byteBuffer2);
                byteBuffer2.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) {
            this.f420248b.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }

    public interface d {
        FileChannel r();
    }

    public static final class e extends UploadDataProvider {

        /* renamed from: b, reason: collision with root package name */
        public volatile FileChannel f420249b;

        /* renamed from: c, reason: collision with root package name */
        public final d f420250c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f420251d = new Object();

        public e(d dVar, a aVar) {
            this.f420250c = dVar;
        }

        public final FileChannel a() {
            if (this.f420249b == null) {
                synchronized (this.f420251d) {
                    try {
                        if (this.f420249b == null) {
                            this.f420249b = this.f420250c.r();
                        }
                    } finally {
                    }
                }
            }
            return this.f420249b;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileChannel fileChannel = this.f420249b;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return a().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelA = a();
            int i12 = 0;
            while (i12 == 0) {
                int i13 = fileChannelA.read(byteBuffer);
                if (i13 == -1) {
                    break;
                } else {
                    i12 += i13;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) throws IOException {
            a().position(0L);
            uploadDataSink.onRewindSucceeded();
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i12, int i13) {
        return new c(ByteBuffer.wrap(bArr, i12, i13).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
