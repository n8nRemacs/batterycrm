package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import androidx.camera.camera2.internal.G;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.barhopper.deeplearning.a;
import com.google.photos.vision.barhopper.C37647a;
import j.N;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public long f355712b;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j12);

    private native long createNativeWithClientOptions(byte[] bArr);

    public static C37647a f(byte[] bArr) {
        try {
            return C37647a.o(bArr, zzdn.zza());
        } catch (zzen e12) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}".concat(e12.toString()));
        }
    }

    private native byte[] recognizeBitmapNative(long j12, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j12, int i12, int i13, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j12, int i12, int i13, byte[] bArr, RecognitionOptions recognitionOptions);

    public final void a(@N a aVar) {
        if (this.f355712b == 0) {
            try {
                byte[] bArr = new byte[aVar.zzE()];
                zzdi zzdiVarZzF = zzdi.zzF(bArr);
                aVar.zzW(zzdiVarZzF);
                zzdiVarZzF.zzG();
                long jCreateNativeWithClientOptions = createNativeWithClientOptions(bArr);
                this.f355712b = jCreateNativeWithClientOptions;
                if (jCreateNativeWithClientOptions == 0) {
                    throw new IllegalArgumentException("Failed to create native context with client options.");
                }
            } catch (IOException e12) {
                String name = aVar.getClass().getName();
                throw new RuntimeException(G.g(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e12);
            }
        }
    }

    @N
    public final C37647a b(int i12, int i13, @N ByteBuffer byteBuffer, @N RecognitionOptions recognitionOptions) {
        long j12 = this.f355712b;
        if (j12 != 0) {
            return f(recognizeBufferNative(j12, i12, i13, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @N
    public final C37647a c(int i12, int i13, @N byte[] bArr, @N RecognitionOptions recognitionOptions) {
        long j12 = this.f355712b;
        if (j12 != 0) {
            return f(recognizeNative(j12, i12, i13, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j12 = this.f355712b;
        if (j12 != 0) {
            closeNative(j12);
            this.f355712b = 0L;
        }
    }

    @N
    public final C37647a d(@N Bitmap bitmap, @N RecognitionOptions recognitionOptions) {
        long j12 = this.f355712b;
        if (j12 != 0) {
            return f(recognizeBitmapNative(j12, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
