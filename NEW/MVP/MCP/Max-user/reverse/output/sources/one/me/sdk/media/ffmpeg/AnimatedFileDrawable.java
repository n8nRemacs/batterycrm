package one.me.sdk.media.ffmpeg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import defpackage.aq0;
import defpackage.cf;
import defpackage.cq0;
import defpackage.cy4;
import defpackage.df;
import defpackage.ef;
import defpackage.ie;
import defpackage.l16;
import defpackage.tca;
import defpackage.zp0;
import defpackage.zx4;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public class AnimatedFileDrawable extends BitmapDrawable implements Animatable, aq0, tca {
    public static final float[] G1 = new float[8];
    public static final ScheduledThreadPoolExecutor H1 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final Rect rectTmp = new Rect();
    public File A0;
    public long A1;
    public final String B0;
    public Bitmap B1;
    public boolean C0;
    public long C1;
    public int D1;
    public int E1;
    public boolean F0;
    public boolean H0;
    public long I0;
    public int[] Q0;
    public boolean U0;
    public volatile boolean W0;
    public Bitmap X;
    public volatile boolean X0;
    public int Y;
    public boolean Y0;
    public Bitmap Z;
    public zx4 Z0;
    public long a;
    public float a1;
    public int b;
    public float b1;
    public final int c1;
    public final int d1;
    public final boolean e1;
    public final zp0 f1;
    public boolean ignoreNoParent;
    public boolean isWebmSticker;
    public View j1;
    public boolean m1;
    public volatile long nativePtr;
    public df o;
    public boolean o1;
    public cq0 p1;
    public l16 q1;
    public int repeatCount;
    public int s0;
    public boolean s1;
    public boolean skipFrameUpdate;
    public Bitmap t0;
    public ef t1;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public cf z1;
    public int c = 50;
    public final int[] d = new int[6];
    public volatile long D0 = -1;
    public volatile long E0 = -1;
    public final Object G0 = new Object();
    public final RectF J0 = new RectF();
    public final BitmapShader[] K0 = new BitmapShader[3];
    public final BitmapShader[] L0 = new BitmapShader[3];
    public final BitmapShader[] M0 = new BitmapShader[3];
    public final BitmapShader[] N0 = new BitmapShader[3];
    public final ArrayList O0 = new ArrayList();
    public final int[] P0 = new int[4];
    public final Path[] R0 = new Path[3];
    public float S0 = 1.0f;
    public float T0 = 1.0f;
    public final RectF V0 = new RectF();
    public float g1 = 1.0f;
    public final RectF[] h1 = new RectF[2];
    public final Paint[] i1 = new Paint[2];
    public final ArrayList k1 = new ArrayList();
    public final ArrayList l1 = new ArrayList();
    public boolean n1 = true;
    public final df r1 = new df(this, 0);
    public final df u1 = new df(this, 1);
    public final df v1 = new df(this, 2);
    public int w1 = 0;
    public final df x1 = new df(this, 3);
    public final cf y1 = new cf(this, 1);
    public final Set F1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable);
    }

    public AnimatedFileDrawable(File file, int i, int i2, zp0 zp0Var, String str) {
        setIsWebmSticker(true);
        this.c1 = i2;
        this.d1 = i;
        this.e1 = zp0Var != null && i > 0 && i2 > 0;
        this.f1 = zp0Var;
        this.B0 = str;
        if (file == null) {
            return;
        }
        d(file, zp0Var);
    }

    public static void a(AnimatedFileDrawable animatedFileDrawable) {
        if (animatedFileDrawable.x1 == null && animatedFileDrawable.v0 && animatedFileDrawable.nativePtr != 0 && !animatedFileDrawable.s1) {
            destroyDecoder(animatedFileDrawable.nativePtr);
            animatedFileDrawable.nativePtr = 0L;
        }
        if (animatedFileDrawable.canLoadFrames()) {
            return;
        }
        Bitmap bitmap = animatedFileDrawable.X;
        if (bitmap != null) {
            bitmap.recycle();
            animatedFileDrawable.X = null;
        }
        Bitmap bitmap2 = animatedFileDrawable.t0;
        if (bitmap2 != null) {
            bitmap2.recycle();
            animatedFileDrawable.t0 = null;
        }
        zx4 zx4Var = animatedFileDrawable.Z0;
        if (zx4Var != null) {
            zx4Var.a.getLooper().quit();
            animatedFileDrawable.Z0 = null;
        }
        for (int i = 0; i < animatedFileDrawable.O0.size(); i++) {
            ((Bitmap) animatedFileDrawable.O0.get(i)).recycle();
        }
        animatedFileDrawable.O0.clear();
        animatedFileDrawable.invalidateInternal();
    }

    public static native long createDecoder(String str, int[] iArr);

    public static native void destroyDecoder(long j);

    public static native int getFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr, int i);

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr, int i, boolean z, float f, float f2, boolean z2);

    public static native void prepareToSeek(long j);

    public static native void seekToMs(long j, long j2, int[] iArr, boolean z);

    public static native void stopDecoder(long j);

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.F1.add(onNextFrameRenderedListener);
    }

    public void addParent(ImageReceiver imageReceiver) {
        if (imageReceiver != null && !this.l1.contains(imageReceiver)) {
            this.l1.add(imageReceiver);
            if (this.W0) {
                e();
            }
        }
        checkCacheCancel();
    }

    public void addSecondParentView(View view) {
        if (view != null) {
            ArrayList arrayList = this.k1;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    public final void b(RectF rectF, Paint paint, Canvas canvas, float f, float f2) {
        canvas.translate(rectF.left, rectF.top);
        int i = this.d[2];
        if (i == 90) {
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -rectF.width());
        } else if (i == 180) {
            canvas.rotate(180.0f);
            canvas.translate(-rectF.width(), -rectF.height());
        } else if (i == 270) {
            canvas.rotate(270.0f);
            canvas.translate(-rectF.height(), 0.0f);
        }
        canvas.scale(f, f2);
        canvas.drawBitmap(this.X, 0.0f, 0.0f, paint);
    }

    public final void c() {
        Set set = this.F1;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this);
            it.remove();
        }
    }

    public boolean canLoadFrames() {
        return this.e1 ? this.p1 != null : (this.nativePtr == 0 && this.w0) ? false : true;
    }

    public void checkCacheCancel() {
        cf cfVar;
        if (this.p1 == null) {
            return;
        }
        boolean zIsEmpty = this.l1.isEmpty();
        if (zIsEmpty && this.z1 == null) {
            cf cfVar2 = new cf(this, 2);
            this.z1 = cfVar2;
            ie.e(cfVar2, 600L);
        } else {
            if (zIsEmpty || (cfVar = this.z1) == null) {
                return;
            }
            ie.a.removeCallbacks(cfVar);
            this.z1 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkCacheExist() throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r8.e1
            if (r0 == 0) goto L5f
            cq0 r0 = r8.p1
            if (r0 == 0) goto L5f
            boolean r1 = r0.r
            if (r1 == 0) goto Ld
            goto L5f
        Ld:
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.h     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L58
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L58
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L41
            java.io.File r5 = r0.m     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "r"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L41
            boolean r2 = r4.readBoolean()     // Catch: java.lang.Throwable -> L35
            r0.s = r2     // Catch: java.lang.Throwable -> L35
            int r2 = r4.readInt()     // Catch: java.lang.Throwable -> L35
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L35
            r4.seek(r5)     // Catch: java.lang.Throwable -> L35
            int r2 = r4.readInt()     // Catch: java.lang.Throwable -> L35
            if (r2 > 0) goto L37
            r2 = 0
            r0.s = r2     // Catch: java.lang.Throwable -> L35
            r0.q = r1     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r2 = move-exception
            goto L45
        L37:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            r4.close()     // Catch: java.io.IOException -> L3c
            goto L5d
        L3c:
            r2 = move-exception
            r2.printStackTrace()
            goto L5d
        L41:
            r4 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            throw r2     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
        L47:
            r0 = move-exception
            r2 = r4
            goto L4d
        L4a:
            r2 = r4
            goto L58
        L4c:
            r0 = move-exception
        L4d:
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r1 = move-exception
            r1.printStackTrace()
        L57:
            throw r0
        L58:
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.io.IOException -> L3c
        L5d:
            r0.r = r1
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.checkCacheExist():void");
    }

    public final void d(File file, zp0 zp0Var) {
        this.A0 = file;
        getPaint().setFlags(3);
        if (!this.e1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.d);
            this.Y0 = this.nativePtr == 0 && (!this.isWebmSticker || this.w1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr = this.d;
                if (iArr[0] > 3840 || iArr[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0L;
                }
            }
            g();
            this.w0 = true;
        }
        if (this.e1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.d);
            this.Y0 = this.nativePtr == 0 && (!this.isWebmSticker || this.w1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr2 = this.d;
                if (iArr2[0] > 3840 || iArr2[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0L;
                    return;
                }
            }
            this.p1 = new cq0(file, this, zp0Var, this.d1, this.c1, true ^ this.o1);
        }
    }

    public boolean decoderFailed() {
        return this.w0 && this.Y0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        drawInternal(canvas, false, System.currentTimeMillis(), 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        if (this.nativePtr == 0) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            getNextFrame(true);
        }
        Bitmap backgroundBitmap = getBackgroundBitmap();
        if (backgroundBitmap == null) {
            backgroundBitmap = getNextFrame(true);
        }
        Rect rect = rectTmp;
        rect.set(0, 0, backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
        canvas.drawBitmap(getBackgroundBitmap(), rect, getBounds(), getPaint());
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.h1;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.i1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint();
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, true, 0L, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawInternal(android.graphics.Canvas r11, boolean r12, long r13, int r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.drawInternal(android.graphics.Canvas, boolean, long, int):void");
    }

    public final void e() {
        f(true, false);
    }

    public final void f(boolean z, boolean z2) throws InterruptedException {
        df dfVar;
        df dfVar2;
        if ((this.o == null || z2) && this.Z == null && canLoadFrames() && !this.v0) {
            if (!this.W0) {
                boolean z3 = this.x0;
                if (!z3) {
                    return;
                }
                if (z3 && this.y0) {
                    return;
                }
            }
            if ((this.l1.size() != 0 || this.ignoreNoParent) && !this.s1) {
                long jMin = 0;
                if (z && this.I0 != 0) {
                    long j = this.c;
                    jMin = Math.min(j, Math.max(0L, j - (System.currentTimeMillis() - this.I0)));
                }
                if (!this.m1) {
                    if (this.Z0 == null) {
                        this.Z0 = new zx4("decodeQueue" + this);
                    }
                    if (z2 && (dfVar = this.o) != null) {
                        this.Z0.a(dfVar);
                    }
                    zx4 zx4Var = this.Z0;
                    df dfVar3 = this.x1;
                    this.o = dfVar3;
                    zx4Var.c(dfVar3, jMin);
                    return;
                }
                if (this.o1) {
                    df dfVar4 = this.x1;
                    this.o = dfVar4;
                    cy4.a(dfVar4, false);
                    return;
                }
                if (z2 && (dfVar2 = this.o) != null) {
                    H1.remove(dfVar2);
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = H1;
                df dfVar5 = this.x1;
                this.o = dfVar5;
                scheduledThreadPoolExecutor.schedule(dfVar5, jMin, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.k1.clear();
            recycle();
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (this.isWebmSticker || (i = this.c1) <= 0 || (i2 = this.d1) <= 0 || (i3 = (iArr = this.d)[0]) <= 0 || (i4 = iArr[1]) <= 0) {
            this.g1 = 1.0f;
            return;
        }
        float fMax = Math.max(i2 / i3, i / i4);
        this.g1 = fMax;
        if (fMax <= 0.0f || fMax > 0.7d) {
            this.g1 = 1.0f;
        }
    }

    public Bitmap getAnimatedBitmap() {
        Bitmap bitmap = this.X;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = this.Z;
        if (bitmap2 != null) {
            return bitmap2;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.t0;
    }

    public float getCurrentProgress() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.E0 >= 0) {
            return this.E0 / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public int getCurrentProgressMs() {
        if (this.E0 >= 0) {
            return (int) this.E0;
        }
        int i = this.s0;
        return i != 0 ? i : this.Y;
    }

    public int getDurationMs() {
        return this.d[4];
    }

    public File getFilePath() {
        return this.A0;
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        int i = this.d1;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, this.c1, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        String absolutePath = this.A0.getAbsolutePath();
        int[] iArr = this.d;
        long jCreateDecoder = createDecoder(absolutePath, iArr);
        if (jCreateDecoder == 0) {
            return bitmap;
        }
        if (this.B1 == null) {
            this.B1 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = this.B1;
        getVideoFrame(jCreateDecoder, bitmap2, this.d, bitmap2.getRowBytes(), false, this.a1, this.b1, true);
        destroyDecoder(jCreateDecoder);
        bitmap.eraseColor(0);
        canvas.save();
        float width = i / this.B1.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.B1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return bitmap;
    }

    public int getFps() {
        return this.d[5];
    }

    public Bitmap getFrameAtTime(long j) {
        return getFrameAtTime(j, false);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        if (this.w0) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? ie.a(100.0f) : (int) (i * this.g1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        if (this.w0) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? ie.a(100.0f) : (int) (i * this.g1);
    }

    public long getLastFrameTimestamp() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        int i = 0;
        if (this.w0) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? ie.a(100.0f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        int i = 0;
        if (this.w0) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? ie.a(100.0f) : i;
    }

    public Bitmap getNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return this.t0;
        }
        if (this.t0 == null) {
            if (this.O0.isEmpty()) {
                float f = this.d[0];
                float f2 = this.g1;
                this.t0 = Bitmap.createBitmap((int) (f * f2), (int) (r0[1] * f2), Bitmap.Config.ARGB_8888);
            } else {
                this.t0 = (Bitmap) this.O0.remove(0);
            }
        }
        long j = this.nativePtr;
        Bitmap bitmap = this.t0;
        getVideoFrame(j, bitmap, this.d, bitmap.getRowBytes(), false, this.a1, this.b1, z);
        return this.t0;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.Z;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getOrientation() {
        return this.d[2];
    }

    public int getProgressMs() {
        return this.d[3];
    }

    public Bitmap getRenderingBitmap() {
        return this.X;
    }

    public int getRenderingHeight() {
        return this.c1;
    }

    public int getRenderingWidth() {
        return this.d1;
    }

    public long getStartTime() {
        return (long) (this.a1 * 1000.0f);
    }

    public boolean hasBitmap() {
        if (canLoadFrames()) {
            return (this.X == null && this.Z == null) ? false : true;
        }
        return false;
    }

    public void invalidateInternal() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l1;
            if (i >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i)).invalidate();
            i++;
        }
    }

    public boolean isRecycled() {
        return this.X0 || this.w1 >= 15;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.W0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.U0 = true;
    }

    @Override // defpackage.tca
    public void onFailed(Throwable th) {
        WebmConfig.getLogger().c("Fail load webm by url: " + this.B0, th);
    }

    @Override // defpackage.tca
    public void onFinished(String str, File file, String str2) {
        WebmConfig.getLogger().a("Success load webm by url: " + str);
        d(file, this.f1);
        ie.d(new cf(this, 0));
    }

    @Override // defpackage.aq0
    public void prepareForGenerateCache() {
        this.C1 = createDecoder(this.A0.getAbsolutePath(), this.d);
    }

    public void recycle() {
        if (!this.k1.isEmpty()) {
            this.C0 = true;
            return;
        }
        this.W0 = false;
        this.X0 = true;
        if (this.t1 != null) {
            cq0.c();
            RLottieDrawable.lottieCacheGenerateQueue.a(this.t1);
            this.t1 = null;
        }
        if (this.o == null) {
            if (this.nativePtr != 0) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = 0L;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.X);
            arrayList.add(this.Z);
            arrayList.add(this.t0);
            arrayList.addAll(this.O0);
            this.O0.clear();
            this.X = null;
            this.Z = null;
            this.t0 = null;
            zx4 zx4Var = this.Z0;
            if (zx4Var != null) {
                zx4Var.a.getLooper().quit();
                this.Z0 = null;
            }
            getPaint().setShader(null);
            ie.c(arrayList);
        } else {
            this.v0 = true;
        }
        invalidateInternal();
    }

    @Override // defpackage.aq0
    public void releaseForGenerateCache() {
        long j = this.C1;
        if (j != 0) {
            destroyDecoder(j);
        }
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.F1.remove(onNextFrameRenderedListener);
    }

    public void removeParent(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.l1;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.repeatCount = 0;
        }
        checkCacheCancel();
    }

    public void removeSecondParentView(View view) {
        ArrayList arrayList = this.k1;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            if (this.C0) {
                recycle();
                return;
            }
            int[] iArr = this.Q0;
            if (iArr != null) {
                setRoundRadius(iArr);
            }
        }
    }

    public void replaceAnimatedBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.X;
        ArrayList arrayList = this.O0;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        Bitmap bitmap3 = this.Z;
        if (bitmap3 != null) {
            arrayList.add(bitmap3);
        }
        this.X = bitmap;
        this.Z = null;
    }

    public void resetStream(boolean z) {
        if (this.nativePtr != 0) {
            if (z) {
                stopDecoder(this.nativePtr);
            } else {
                prepareToSeek(this.nativePtr);
            }
        }
    }

    public void seekTo(long j, boolean z) {
        seekTo(j, z, false);
    }

    public void seekToSync(long j) {
        if (this.nativePtr == 0) {
            return;
        }
        seekToMs(this.nativePtr, j, this.d, true);
    }

    public void setActualDrawRect(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.J0;
        if (rectF.left == f && rectF.top == f2 && rectF.right == f6 && rectF.bottom == f5) {
            return;
        }
        rectF.set(f, f2, f6, f5);
        this.n1 = true;
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.x0 = z;
        if (z) {
            e();
        }
    }

    public void setInvalidateParentViewWithSecond(boolean z) {
        this.H0 = z;
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
            this.m1 = true;
        }
    }

    public void setLimitFps(boolean z) {
        this.o1 = z;
    }

    public void setParentView(View view) {
        if (this.j1 != null) {
            return;
        }
        this.j1 = view;
    }

    public void setRoundRadius(int[] iArr) {
        boolean zIsEmpty = this.k1.isEmpty();
        int[] iArr2 = this.P0;
        if (!zIsEmpty) {
            if (this.Q0 == null) {
                this.Q0 = new int[4];
            }
            int[] iArr3 = this.Q0;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.n1 && iArr[i] != iArr2[i]) {
                this.n1 = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public void setStartEndTime(long j, long j2) {
        this.a1 = j / 1000.0f;
        this.b1 = j2 / 1000.0f;
        if (j < 0 || getCurrentProgressMs() >= j) {
            return;
        }
        seekTo(j, true);
    }

    public void setUseSharedQueue(boolean z) {
        if (this.isWebmSticker) {
            return;
        }
        this.m1 = z;
    }

    public void skipNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return;
        }
        getVideoFrame(this.nativePtr, null, this.d, 0, false, this.a1, this.b1, z);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.W0) {
            return;
        }
        if (!this.l1.isEmpty() || this.ignoreNoParent) {
            this.W0 = true;
            e();
            ie.d(this.y1);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.W0 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        if (!this.W0) {
            if (this.W0 || !this.x0 || Math.abs(j - this.a) < this.c || this.Z == null) {
                return;
            }
            this.O0.add(this.X);
            this.X = this.Z;
            this.Y = this.s0;
            for (int i = 0; i < this.N0.length; i++) {
                BitmapShader[] bitmapShaderArr = this.K0;
                BitmapShader[] bitmapShaderArr2 = this.L0;
                bitmapShaderArr[i] = bitmapShaderArr2[i];
                BitmapShader[] bitmapShaderArr3 = this.M0;
                bitmapShaderArr2[i] = bitmapShaderArr3[i];
                bitmapShaderArr3[i] = null;
            }
            this.s0 = 0;
            this.Z = null;
            this.a = j;
            c();
            e();
            return;
        }
        Bitmap bitmap = this.X;
        if (bitmap == null && this.Z == null) {
            e();
            return;
        }
        if (this.Z == null || (bitmap != null && (Math.abs(j - this.a) < this.c || this.skipFrameUpdate || this.E0 >= 0))) {
            invalidateInternal();
            return;
        }
        this.O0.add(this.X);
        this.X = this.Z;
        this.Y = this.s0;
        for (int i2 = 0; i2 < this.N0.length; i2++) {
            BitmapShader[] bitmapShaderArr4 = this.K0;
            BitmapShader[] bitmapShaderArr5 = this.L0;
            bitmapShaderArr4[i2] = bitmapShaderArr5[i2];
            BitmapShader[] bitmapShaderArr6 = this.M0;
            bitmapShaderArr5[i2] = bitmapShaderArr6[i2];
            bitmapShaderArr6[i2] = null;
        }
        this.s0 = 0;
        this.Z = null;
        this.a = j;
        c();
        e();
    }

    public Bitmap getFrameAtTime(long j, boolean z) {
        if (this.w0 && this.nativePtr != 0) {
            if (!z) {
                seekToMs(this.nativePtr, j, this.d, z);
            }
            int[] iArr = this.d;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z ? getFrameAtTime(this.nativePtr, j, bitmapCreateBitmap, this.d, bitmapCreateBitmap.getRowBytes()) : getVideoFrame(this.nativePtr, bitmapCreateBitmap, this.d, bitmapCreateBitmap.getRowBytes(), true, 0.0f, 0.0f, true)) != 0) {
                return bitmapCreateBitmap;
            }
        }
        return null;
    }

    public void seekTo(long j, boolean z, boolean z2) {
        synchronized (this.G0) {
            try {
                this.D0 = j;
                this.E0 = j;
                if (this.nativePtr != 0) {
                    prepareToSeek(this.nativePtr);
                }
                if (z2 && this.x0) {
                    this.y0 = false;
                    if (this.o == null) {
                        f(false, true);
                    } else {
                        this.z0 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.aq0
    public int getNextFrame(Bitmap bitmap) {
        int i;
        if (this.C1 == 0) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.B1;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.B1 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        long j = this.C1;
        Bitmap bitmap3 = this.B1;
        getVideoFrame(j, bitmap3, this.d, bitmap3.getRowBytes(), false, this.a1, this.b1, true);
        long j2 = this.A1;
        if (j2 != 0 && ((i = iArr[3]) == 0 || j2 > i)) {
            return 0;
        }
        int i2 = this.E1;
        int i3 = iArr[3];
        if (i2 == i3) {
            int i4 = this.D1 + 1;
            this.D1 = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.E1 = i3;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.d1 / this.B1.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.B1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.A1 = iArr[3];
        return 1;
    }
}
