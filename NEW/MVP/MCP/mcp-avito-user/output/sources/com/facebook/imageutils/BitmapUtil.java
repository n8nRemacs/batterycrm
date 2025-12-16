package com.facebook.imageutils;

import I41.h;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Pair;
import androidx.core.util.y;
import com.facebook.infer.annotation.Nullsafe;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okhttp3.internal.http2.Http2;

@Nullsafe
/* loaded from: classes15.dex */
public final class BitmapUtil {
    public static final int ALPHA_8_BYTES_PER_PIXEL = 1;
    public static final int ARGB_4444_BYTES_PER_PIXEL = 2;
    public static final int ARGB_8888_BYTES_PER_PIXEL = 4;
    public static final float MAX_BITMAP_SIZE = 2048.0f;
    public static final int RGBA_F16_BYTES_PER_PIXEL = 8;
    public static final int RGB_565_BYTES_PER_PIXEL = 2;

    /* renamed from: a, reason: collision with root package name */
    public static final y.c<ByteBuffer> f340817a = new y.c<>(12);

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f340818a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f340818a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340818a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340818a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340818a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340818a[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340818a[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @h
    public static Pair<Integer, Integer> decodeDimensions(byte[] bArr) {
        return decodeDimensions(new ByteArrayInputStream(bArr));
    }

    public static ImageMetaData decodeDimensionsAndColorSpace(InputStream inputStream) {
        inputStream.getClass();
        y.c<ByteBuffer> cVar = f340817a;
        ByteBuffer byteBufferB = cVar.b();
        if (byteBufferB == null) {
            byteBufferB = ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferB.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new ImageMetaData(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            cVar.a(byteBufferB);
        }
    }

    public static int getPixelSizeForBitmapConfig(Bitmap.Config config) {
        switch (a.f340818a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static int getSizeInByteForBitmap(int i12, int i13, Bitmap.Config config) {
        return getPixelSizeForBitmapConfig(config) * i12 * i13;
    }

    @SuppressLint({"NewApi"})
    public static int getSizeInBytes(@h Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    @h
    public static Pair<Integer, Integer> decodeDimensions(Uri uri) {
        uri.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    @h
    public static Pair<Integer, Integer> decodeDimensions(InputStream inputStream) {
        inputStream.getClass();
        y.c<ByteBuffer> cVar = f340817a;
        ByteBuffer byteBufferB = cVar.b();
        if (byteBufferB == null) {
            byteBufferB = ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferB.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            cVar.a(byteBufferB);
        }
    }
}
