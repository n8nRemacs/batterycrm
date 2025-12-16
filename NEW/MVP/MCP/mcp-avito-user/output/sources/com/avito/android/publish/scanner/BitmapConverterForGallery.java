package com.avito.android.publish.scanner;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.photo_picker.converter.BadPhotoSourceException;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import com.avito.android.util.EntityTooLargeException;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import u80.C48863b;

/* compiled from: BitmapConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/scanner/BitmapConverterForGallery;", "Lcom/avito/android/publish/scanner/i;", "BitmapConversionException", "a", "b", "c", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BitmapConverterForGallery implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f239111d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImageConvertOptions f239112a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final File f239113b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f239114c;

    /* compiled from: BitmapConverter.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/scanner/BitmapConverterForGallery$BitmapConversionException;", "Ljava/io/IOException;", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BitmapConversionException extends IOException {
    }

    /* compiled from: BitmapConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/scanner/BitmapConverterForGallery$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BitmapConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/scanner/BitmapConverterForGallery$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Exception {
    }

    /* compiled from: BitmapConverter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner/BitmapConverterForGallery$c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f239115a;

        public c(int i12, int i13, int i14, @Y61.k ImageConvertOptions imageConvertOptions) {
            boolean z12 = i12 == 0 || i12 == 180;
            int i15 = z12 ? i13 : i14;
            i13 = z12 ? i14 : i13;
            int i16 = imageConvertOptions.f219311c;
            int i17 = imageConvertOptions.f219310b;
            if (i15 > i17 || i13 > i16) {
                this.f239115a = Math.min(i17 / i15, i16 / i13);
            } else {
                this.f239115a = 0.0f;
            }
        }
    }

    static {
        new a(null);
    }

    public BitmapConverterForGallery(@Y61.k Context context, @Y61.k ImageConvertOptions imageConvertOptions) {
        this.f239112a = imageConvertOptions;
        this.f239113b = context.getCacheDir();
        this.f239114c = context.getContentResolver();
    }

    @Override // com.avito.android.publish.scanner.i
    @Y61.k
    public final C a(@Y61.k Uri uri) {
        return new C(new com.avito.android.gig_shift_action.ui.a(3, this, uri));
    }

    @Y61.l
    public final File b(@Y61.k Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    try {
                        File fileCreateTempFile = File.createTempFile("image", ".jpg", this.f239113b);
                        C48863b.a(this.f239114c, uri, fileCreateTempFile);
                        return d(fileCreateTempFile.getPath());
                    } catch (Exception e12) {
                        b bVar = new b(e12);
                        V2.f318762a.a("BitmapConverter", "Cannot convert photo from: " + uri, bVar);
                        return null;
                    }
                }
            } else if (scheme.equals("file")) {
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                return new File(path);
            }
        }
        throw new BadPhotoSourceException(uri.toString());
    }

    public final File c(String str) throws BitmapConversionException {
        int iMin;
        Matrix matrix;
        File fileCreateTempFile;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i12 = 0;
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        ImageConvertOptions imageConvertOptions = this.f239112a;
        int i13 = imageConvertOptions.f219310b;
        int i14 = imageConvertOptions.f219311c;
        int iMax = Math.max(i13, i14);
        int i15 = options.outHeight;
        if (i15 > i13 || options.outWidth > i14) {
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
        int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i12 = 180;
        } else if (attributeInt == 6) {
            i12 = 90;
        } else if (attributeInt == 8) {
            i12 = 270;
        }
        try {
            float f13 = new c(i12, bitmapDecodeFile.getHeight(), bitmapDecodeFile.getWidth(), imageConvertOptions).f239115a;
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
                if (bitmapCreateBitmap == bitmapDecodeFile) {
                    fileCreateTempFile = new File(str);
                } else {
                    fileCreateTempFile = File.createTempFile("image", ".jpg", this.f239113b);
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, imageConvertOptions.f219312d, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                bitmapDecodeFile.recycle();
                return fileCreateTempFile;
            } catch (IOException e12) {
                V2.f318762a.a("BitmapConverter", "Cannot convert photo from file", new b(e12));
                bitmapDecodeFile.recycle();
                return null;
            } finally {
                bitmapCreateBitmap.recycle();
            }
        } catch (Throwable th2) {
            bitmapDecodeFile.recycle();
            throw th2;
        }
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final File d(String str) throws EntityTooLargeException {
        long jFreeMemory = Runtime.getRuntime().freeMemory();
        try {
            return c(str);
        } catch (OutOfMemoryError e12) {
            long jFreeMemory2 = Runtime.getRuntime().freeMemory();
            StringBuilder sbQ = H.q(jFreeMemory, "Bitmap conversion OutOfMemoryError Memory before ", "  Memory after OOM: ");
            sbQ.append(jFreeMemory2);
            V2.f318762a.a("DEFAULT_TAG", "BitmapConverter", new RuntimeException(sbQ.toString(), e12));
            File file = new File(str);
            if (file.length() < this.f239112a.f219313e) {
                return file;
            }
            throw new EntityTooLargeException(null, 1, null);
        }
    }
}
