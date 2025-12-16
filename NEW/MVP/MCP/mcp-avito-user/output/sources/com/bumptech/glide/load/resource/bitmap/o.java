package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import j.P;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import shark.AndroidResourceIdNames;

/* compiled from: Downsampler.java */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<DecodeFormat> f339375f = com.bumptech.glide.load.j.a(DecodeFormat.f338835d, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<PreferredColorSpace> f339376g = com.bumptech.glide.load.j.a(PreferredColorSpace.f338842b, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<Boolean> f339377h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<Boolean> f339378i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<String> f339379j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f339380k;

    /* renamed from: l, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f339381l;

    /* renamed from: m, reason: collision with root package name */
    public static final ArrayDeque f339382m;

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339383a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f339384b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339385c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f339386d;

    /* renamed from: e, reason: collision with root package name */
    public final u f339387e = u.a();

    /* compiled from: Downsampler.java */
    public interface b {
        void a(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.e eVar);

        void b();
    }

    static {
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.f339332a;
        Boolean bool = Boolean.FALSE;
        f339377h = com.bumptech.glide.load.j.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f339378i = com.bumptech.glide.load.j.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f339379j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f339380k = new a();
        f339381l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = com.bumptech.glide.util.m.f339649a;
        f339382m = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f339386d = arrayList;
        com.bumptech.glide.util.k.c(displayMetrics, "Argument must not be null");
        this.f339384b = displayMetrics;
        com.bumptech.glide.util.k.c(eVar, "Argument must not be null");
        this.f339383a = eVar;
        com.bumptech.glide.util.k.c(jVar, "Argument must not be null");
        this.f339385c = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(com.bumptech.glide.load.resource.bitmap.v r8, android.graphics.BitmapFactory.Options r9, com.bumptech.glide.load.resource.bitmap.o.b r10, com.bumptech.glide.load.engine.bitmap_recycle.e r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.b()
            r8.a()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.G.f339349d
            r3.lock()
            android.graphics.Bitmap r8 = r8.b(r9)     // Catch: java.lang.Throwable -> L1d java.lang.IllegalArgumentException -> L1f
            r3.unlock()
            return r8
        L1d:
            r8 = move-exception
            goto L60
        L1f:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = androidx.appcompat.app.r.y(r0, r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L1d
            r0.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "Downsampler"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L5f
            r11.b(r0)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            r0 = 0
            r9.inBitmap = r0     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            android.graphics.Bitmap r8 = c(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.resource.bitmap.G.f339349d
            r9.unlock()
            return r8
        L5e:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L5f:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L60:
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.resource.bitmap.G.f339349d
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.o.c(com.bumptech.glide.load.resource.bitmap.v, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.o$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    @P
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C36363g a(v vVar, int i12, int i13, com.bumptech.glide.load.k kVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f339385c.d(byte[].class, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        synchronized (o.class) {
            arrayDeque = f339382m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) kVar.c(f339375f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) kVar.c(f339376g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) kVar.c(DownsampleStrategy.f339337f);
        boolean zBooleanValue = ((Boolean) kVar.c(f339377h)).booleanValue();
        com.bumptech.glide.load.j<Boolean> jVar = f339378i;
        try {
            C36363g c36363gD = C36363g.d(b(vVar, options2, downsampleStrategy, decodeFormat, preferredColorSpace, kVar.c(jVar) != null && ((Boolean) kVar.c(jVar)).booleanValue(), i12, i13, zBooleanValue, bVar), this.f339383a);
            e(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f339385c.i(bArr);
            return c36363gD;
        } catch (Throwable th2) {
            e(options2);
            ArrayDeque arrayDeque2 = f339382m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f339385c.i(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(com.bumptech.glide.load.resource.bitmap.v r26, android.graphics.BitmapFactory.Options r27, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r28, com.bumptech.glide.load.DecodeFormat r29, com.bumptech.glide.load.PreferredColorSpace r30, boolean r31, int r32, int r33, boolean r34, com.bumptech.glide.load.resource.bitmap.o.b r35) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.o.b(com.bumptech.glide.load.resource.bitmap.v, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.o$b):android.graphics.Bitmap");
    }

    /* compiled from: Downsampler.java */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public final void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public final void a(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        }
    }
}
