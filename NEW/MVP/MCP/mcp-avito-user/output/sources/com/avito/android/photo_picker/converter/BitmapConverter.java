package com.avito.android.photo_picker.converter;

import Y61.k;
import Y61.l;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import com.avito.android.photo_storage.i;
import com.avito.android.util.V2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import u80.C48863b;

/* compiled from: BitmapConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_picker/converter/BitmapConverter;", "", "BitmapConversionException", "a", "b", "c", "d", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BitmapConverter {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Uri f219305a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageConvertOptions f219306b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f219307c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ContentResolver f219308d;

    /* compiled from: BitmapConverter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/converter/BitmapConverter$BitmapConversionException;", "Ljava/io/IOException;", "()V", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BitmapConversionException extends IOException {
    }

    /* compiled from: BitmapConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_picker/converter/BitmapConverter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BitmapConverter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_picker/converter/BitmapConverter$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Exception {
    }

    /* compiled from: BitmapConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/converter/BitmapConverter$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends Exception {
    }

    /* compiled from: BitmapConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/converter/BitmapConverter$d;", "", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final float f219309a;

        public d(int i12, int i13, int i14, @k ImageConvertOptions imageConvertOptions) {
            boolean z12 = i12 == 0 || i12 == 180;
            int i15 = z12 ? i13 : i14;
            i13 = z12 ? i14 : i13;
            int i16 = imageConvertOptions.f219311c;
            int i17 = imageConvertOptions.f219310b;
            if (i15 > i17 || i13 > i16) {
                this.f219309a = Math.min(i17 / i15, i16 / i13);
            } else {
                this.f219309a = 0.0f;
            }
        }
    }

    static {
        new a(null);
    }

    public BitmapConverter(@k Context context, @k Uri uri, @k ImageConvertOptions imageConvertOptions, @k i iVar) {
        this.f219305a = uri;
        this.f219306b = imageConvertOptions;
        this.f219307c = iVar;
        this.f219308d = context.getContentResolver();
    }

    @l
    public final com.avito.android.photo_picker.converter.a a() {
        Uri uri = this.f219305a;
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    try {
                        File fileB = this.f219307c.b(null);
                        C48863b.a(this.f219308d, uri, fileB);
                        return c(fileB.getPath());
                    } catch (Exception e12) {
                        c cVar = new c(e12);
                        V2.f318762a.a("BitmapConverter", "Cannot convert photo from: " + uri, cVar);
                        return null;
                    }
                }
            } else if (scheme.equals("file")) {
                return c(uri.getPath());
            }
        }
        throw new BadPhotoSourceException(uri.toString());
    }

    public final com.avito.android.photo_picker.converter.a b(String str) throws BitmapConversionException {
        int iMin;
        Matrix matrix;
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i12 = 0;
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        ImageConvertOptions imageConvertOptions = this.f219306b;
        int i13 = imageConvertOptions.f219310b;
        int i14 = imageConvertOptions.f219311c;
        int iMax = Math.max(i13, i14);
        int i15 = options.outHeight;
        if (i15 > imageConvertOptions.f219310b || options.outWidth > i14) {
            float f12 = iMax;
            iMin = Math.min(Math.round(i15 / f12), Math.round(options.outWidth / f12));
        } else {
            iMin = 1;
        }
        options.inSampleSize = iMin;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        if (bitmapDecodeFile == null) {
            throw new BitmapConversionException();
        }
        int iE2 = new androidx.exifinterface.media.a(str).e(1, "Orientation");
        if (iE2 == 3) {
            i12 = 180;
        } else if (iE2 == 6) {
            i12 = 90;
        } else if (iE2 == 8) {
            i12 = 270;
        }
        try {
            float f13 = new d(i12, bitmapDecodeFile.getHeight(), bitmapDecodeFile.getWidth(), imageConvertOptions).f219309a;
            if (i12 > 0 || f13 > 0.0f) {
                Matrix matrix2 = new Matrix();
                if (i12 > 0) {
                    matrix2.postRotate(i12);
                }
                if (f13 > 0.0f) {
                    matrix2.postScale(f13, f13);
                }
                matrix = matrix2;
            } else {
                matrix = null;
            }
            Bitmap bitmapCreateBitmap = matrix == null ? bitmapDecodeFile : Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            try {
                try {
                    File fileB = this.f219307c.b(null);
                    FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, imageConvertOptions.f219312d, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bitmapDecodeFile.recycle();
                    return new com.avito.android.photo_picker.converter.a(fileB, N70.e.a(aVar));
                } finally {
                    bitmapCreateBitmap.recycle();
                }
            } catch (IOException e12) {
                V2.f318762a.a("BitmapConverter", "Cannot convert photo from file", new c(e12));
                bitmapDecodeFile.recycle();
                return null;
            }
        } catch (Throwable th2) {
            bitmapDecodeFile.recycle();
            throw th2;
        }
    }

    public final com.avito.android.photo_picker.converter.a c(String str) throws b {
        try {
            return b(str);
        } catch (OutOfMemoryError unused) {
            if (Build.VERSION.SDK_INT >= 29) {
                return null;
            }
            File file = new File(str);
            if (file.length() < this.f219306b.f219313e) {
                return new com.avito.android.photo_picker.converter.a(file, N70.e.a(new androidx.exifinterface.media.a(file)));
            }
            throw new b();
        }
    }
}
