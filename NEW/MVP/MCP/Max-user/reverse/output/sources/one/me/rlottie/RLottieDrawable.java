package one.me.rlottie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArraySet;
import android.view.View;
import com.google.gson.Gson;
import defpackage.a99;
import defpackage.aq0;
import defpackage.by4;
import defpackage.cq0;
import defpackage.cy4;
import defpackage.d8c;
import defpackage.g30;
import defpackage.ie;
import defpackage.kya;
import defpackage.pea;
import defpackage.q6d;
import defpackage.r6d;
import defpackage.s6d;
import defpackage.sxi;
import defpackage.t6d;
import defpackage.tca;
import defpackage.zp0;
import defpackage.zx4;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class RLottieDrawable extends BitmapDrawable implements Animatable, aq0, tca {
    public static final Handler G1 = new Handler(Looper.getMainLooper());
    public static final ThreadLocal H1 = new ThreadLocal();
    public static final ThreadLocal I1 = new ThreadLocal();
    public static final by4 J1 = new by4();
    public static final Rect K1 = new Rect();
    public static Gson gson;
    public static zx4 lottieCacheGenerateQueue;
    public int A0;
    public volatile boolean A1;
    public int B0;
    public volatile Throwable B1;
    public int C0;
    public String C1;
    public long D0;
    public final Set D1;
    public volatile boolean E0;
    public final Set E1;
    public Runnable F0;
    public final Set F1;
    public s6d G0;
    public volatile Bitmap H0;
    public volatile Bitmap I0;
    public volatile Bitmap J0;
    public boolean K0;
    public CountDownLatch L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public float T0;
    public float U0;
    public boolean V0;
    public boolean W0;
    public boolean X;
    public final RectF X0;
    public int[] Y;
    public final RectF[] Y0;
    public int[] Z;
    public final Paint[] Z0;
    public final int a;
    public volatile boolean a1;
    public final int b;
    public volatile boolean b1;
    public final int[] c;
    public volatile long c1;
    public int d;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public File g1;
    public boolean h1;
    public Runnable i1;
    public Runnable j1;
    public View k1;
    public pea l1;
    public final s6d m1;
    public final s6d n1;
    public int o;
    public boolean o1;
    public final s6d p1;
    public final s6d q1;
    public cq0 r1;
    public final HashMap s0;
    public int s1;
    public boolean scaleByCanvas;
    public boolean skipFrameUpdate;
    public Rect srcRect;
    public volatile HashMap t0;
    public boolean t1;
    public HashMap u0;
    public boolean u1;
    public boolean v0;
    public final s6d v1;
    public boolean w0;
    public long w1;
    public Runnable whenCacheDone;
    public WeakReference x0;
    public int x1;
    public View y0;
    public Bitmap y1;
    public final ArraySet z0;
    public String z1;

    public interface DrawableLoadListener {
        default void onError(Throwable th) {
        }

        default void onLoaded(RLottieDrawable rLottieDrawable) {
        }
    }

    public interface OnAllFramesRenderedListener {
        void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z);
    }

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i);
    }

    public RLottieDrawable(File file, int i, int i2, zp0 zp0Var, boolean z) {
        this(file, i, i2, zp0Var, z, null, 0);
    }

    public static /* synthetic */ void a(long j) {
        if (j != 0) {
            destroy(j);
        }
    }

    public static /* synthetic */ void b(long j) {
        if (j != 0) {
            destroy(j);
        }
    }

    public static void c(RLottieDrawable rLottieDrawable) {
        Runnable runnable = rLottieDrawable.i1;
        if (runnable != null) {
            runnable.run();
            rLottieDrawable.i1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3);

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new zx4("rlottie-generator-queue");
    }

    private static native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroy(long j);

    public static native int foo();

    public static native double getDuration(String str, String str2);

    public static native int getFrame(long j, int i, Bitmap bitmap, int i2, int i3, int i4, boolean z);

    public static native long getFramesCount(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void replaceColors(long j, int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void setLayerColor(long j, String str, int i);

    public void addDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.D1.add(drawableLoadListener);
        if (this.A1) {
            drawableLoadListener.onLoaded(this);
        } else if (this.B1 != null) {
            drawableLoadListener.onError(this.B1);
        }
    }

    public void addOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.F1.add(onAllFramesRenderedListener);
    }

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.E1.add(onNextFrameRenderedListener);
    }

    public void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.z0.add(imageReceiver);
    }

    public void beginApplyLayerColors() {
        this.Q0 = true;
    }

    public void cacheFrame(int i) {
        if (this.x1 != i || this.y1 == null) {
            if (this.y1 == null) {
                this.y1 = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            }
            long j = this.c1;
            this.x1 = i;
            Bitmap bitmap = this.y1;
            getFrame(j, i, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        }
    }

    public boolean canLoadFrames() {
        return this.h1 ? this.r1 != null : this.c1 != 0;
    }

    public void checkCache(Runnable runnable) {
        if (this.r1 == null) {
            ie.d(runnable);
            return;
        }
        this.o1 = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.F0 == null) {
            cq0.B++;
            zx4 zx4Var = lottieCacheGenerateQueue;
            r6d r6dVar = new r6d(this, runnable, 0);
            this.F0 = r6dVar;
            zx4Var.b(r6dVar);
        }
    }

    public void checkCacheCancel() {
        if (this.r1 == null || lottieCacheGenerateQueue == null || this.F0 == null || !this.z0.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.k1;
        if (view == null || !view.isAttachedToWindow()) {
            Runnable runnable = this.F0;
            if (runnable != null) {
                lottieCacheGenerateQueue.a(runnable);
                cq0.c();
                this.F0 = null;
            }
            this.o1 = false;
            this.t1 = false;
        }
    }

    public void commitApplyLayerColors() {
        if (this.Q0) {
            this.Q0 = false;
            if (!this.a1 && this.N0) {
                if (this.R0 <= 2) {
                    this.R0 = 0;
                }
                this.E0 = false;
                this.O0 = false;
                if (!o()) {
                    this.P0 = true;
                }
            }
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        drawInternal(canvas, getPaint(), false, 0L, 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.y1 != null) {
            int i2 = this.a;
            int i3 = this.b;
            Rect rect = K1;
            rect.set(0, 0, i2, i3);
            canvas.drawBitmap(this.y1, rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.Y0;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.Z0;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint(1);
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, null, true, 0L, i2);
    }

    public void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float f;
        float f2;
        if (!canLoadFrames() || this.M0) {
            return;
        }
        boolean z2 = true;
        if (!z) {
            z = !Looper.getMainLooper().isCurrentThread();
        }
        if (!z) {
            updateCurrentFrame(j, false);
        }
        RectF rectF = z ? this.Y0[i] : this.X0;
        if (rectF == null) {
            rectF = this.X0;
        }
        if (paint == null) {
            paint = z ? this.Z0[i] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.e1 || this.H0 == null) {
            return;
        }
        if (z) {
            float fWidth = rectF.width() / this.a;
            float fHeight = rectF.height() / this.b;
            if (Math.abs(rectF.width() - this.a) < ie.a(1.0f) && Math.abs(rectF.height() - this.b) < ie.a(1.0f)) {
                z2 = false;
            }
            f = fWidth;
            f2 = fHeight;
        } else {
            rectF.set(getBounds());
            if (this.V0) {
                this.T0 = rectF.width() / this.a;
                this.U0 = rectF.height() / this.b;
                this.V0 = false;
                if (Math.abs(rectF.width() - this.a) < ie.a(1.0f) && Math.abs(rectF.height() - this.b) < ie.a(1.0f)) {
                    z2 = false;
                }
                this.W0 = z2;
            }
            f = this.T0;
            f2 = this.U0;
            z2 = this.W0;
        }
        try {
            if (!z2) {
                canvas.drawBitmap(this.H0, rectF.left, rectF.top, paint);
            } else if (this.scaleByCanvas) {
                this.srcRect.set(0, 0, this.H0.getWidth(), this.H0.getHeight());
                canvas.drawBitmap(this.H0, this.srcRect, rectF, paint);
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(f, f2);
                canvas.drawBitmap(this.H0, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        } catch (Exception e) {
            RLottie.getLogger().d(e);
        }
        if (!this.a1 || z) {
            return;
        }
        invalidateInternal();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RLottieDrawable)) {
            return false;
        }
        RLottieDrawable rLottieDrawable = (RLottieDrawable) obj;
        if (this.a == rLottieDrawable.a && this.b == rLottieDrawable.b && this.A0 == rLottieDrawable.A0) {
            return Objects.equals(this.C1, rLottieDrawable.C1);
        }
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    public Bitmap getAnimatedBitmap() {
        if (this.H0 != null) {
            return this.H0;
        }
        if (this.I0 != null) {
            return this.I0;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.J0;
    }

    public int getCurrentFrame() {
        return this.R0;
    }

    public String getCurrentUrl() {
        return this.z1;
    }

    public int getCustomEndFrame() {
        return this.o;
    }

    public long getDuration() {
        int[] iArr = this.c;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        String string = ((File) this.l1.d).toString();
        pea peaVar = this.l1;
        peaVar.getClass();
        int[] iArr = (int[]) peaVar.c;
        int i = peaVar.a;
        long jCreate = create(string, null, this.a, this.b, new int[3], false, iArr, false, i);
        if (jCreate == 0) {
            return bitmap;
        }
        getFrame(jCreate, 0, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        destroy(jCreate);
        return bitmap;
    }

    public int getFramesCount() {
        return this.c[0];
    }

    public float getGeneratingCacheProgress() {
        cq0 cq0Var = this.r1;
        if (cq0Var != null) {
            if (this.F0 != null) {
                float framesCount = cq0Var.d.get() / getFramesCount();
                if (!Float.isNaN(framesCount)) {
                    if (!Float.isInfinite(framesCount)) {
                        return Math.max(Math.min(framesCount, 1.0f), 0.0f);
                    }
                }
                return 0.0f;
            }
            if (!cq0Var.q) {
                return -2.0f;
            }
            if (this.r1.g()) {
                return 0.0f;
            }
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a;
    }

    public long getLastFrameTime() {
        return this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.a;
    }

    @Override // defpackage.aq0
    public int getNextFrame(Bitmap bitmap) throws InterruptedException {
        long j = this.w1;
        if (j == 0) {
            return -1;
        }
        int i = this.S0 ? 2 : 1;
        if (getFrame(j, this.s1, bitmap, this.a, this.b, bitmap.getRowBytes(), true) != -5) {
            int i2 = this.s1 + i;
            this.s1 = i2;
            return i2 > this.c[0] ? 0 : 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getNextFrame(bitmap);
    }

    public Bitmap getNextRenderingBitmap() {
        return this.I0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public Bitmap getRenderingBitmap() {
        return this.H0;
    }

    public float getScaleX() {
        return this.T0;
    }

    public float getScaleY() {
        return this.U0;
    }

    public int getTimeBetweenFrames() {
        return this.d;
    }

    public final void h() {
        Runnable runnable = this.F0;
        if (runnable != null) {
            lottieCacheGenerateQueue.a(runnable);
            cq0.c();
            this.F0 = null;
        }
        if (hasParent() || this.I0 == null || this.G0 == null) {
            return;
        }
        this.G0 = null;
        this.I0 = null;
    }

    public boolean hasBitmap() {
        if (this.b1) {
            return false;
        }
        return ((this.H0 == null && this.I0 == null) || this.e1) ? false : true;
    }

    public boolean hasParent() {
        return (this.z0.isEmpty() && this.k1 == null && getCallback() == null) ? false : true;
    }

    public boolean hasParentViews() {
        return !this.z0.isEmpty();
    }

    public boolean hasVibrationPattern() {
        return this.u0 != null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.C1;
        return Integer.hashCode(this.A0) + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void i() {
        if (this.M0) {
            h();
            if (this.G0 == null && this.F0 == null && this.c1 != 0) {
                l(true);
            }
        }
        if (this.c1 == 0 && this.r1 == null) {
            m();
            return;
        }
        this.K0 = true;
        if (!hasParent()) {
            RLottie.getLogger().a("RLottieDrawable. Call stop because !hasParentView() " + this.z1);
            stop();
        }
        if (this.a1) {
            o();
        }
    }

    public void invalidateInternal() {
        if (this.b1) {
            return;
        }
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
        View view = this.k1;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public boolean isApplyTransformation() {
        return this.V0;
    }

    public boolean isCacheFallbacked() {
        return false;
    }

    public boolean isForceFrameRedraw() {
        return this.P0;
    }

    public boolean isGeneratingCache() {
        return this.F0 != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public boolean isLastFrame() {
        return this.R0 == getFramesCount() - 1;
    }

    public boolean isLoadingFailed() {
        return (this.A1 || this.B1 == null) ? false : true;
    }

    public boolean isNeedScale() {
        return this.W0;
    }

    public boolean isRecycled() {
        return this.b1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.a1;
    }

    public boolean isWaitingForNextTask() {
        return this.K0;
    }

    public final void j() {
        this.A1 = true;
        this.B1 = null;
        if (!ie.b()) {
            ie.d(new q6d(this, 1));
            return;
        }
        Iterator it = new ArrayList(this.D1).iterator();
        while (it.hasNext()) {
            ((DrawableLoadListener) it.next()).onLoaded(this);
        }
    }

    public final void k(File file, int[] iArr) throws IOException {
        if (gson == null) {
            gson = new Gson();
        }
        try {
            FileReader fileReader = new FileReader(file.getAbsolutePath());
            if (gson.fromJson(fileReader, t6d.class) != null) {
                throw new ClassCastException();
            }
            try {
                fileReader.close();
            } catch (Exception unused) {
            }
            throw null;
        } catch (Exception e) {
            RLottie.getLogger().d(e);
            String absolutePath = file.getAbsolutePath();
            pea peaVar = this.l1;
            long jCreate = create(absolutePath, null, this.a, this.b, iArr, false, (int[]) peaVar.c, this.S0, peaVar.a);
            if (jCreate != 0) {
                destroy(jCreate);
            }
        }
    }

    public final void l(boolean z) {
        long j = this.c1;
        this.c1 = 0L;
        if (j == 0) {
            return;
        }
        if (z) {
            cy4.a(new a99(j, 1), false);
            return;
        }
        kya kyaVar = sxi.a.f;
        ((ScheduledExecutorService) kyaVar.a.getValue()).execute(new a99(j, 2));
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.H0);
        arrayList.add(this.J0);
        arrayList.add(this.I0);
        this.I0 = null;
        this.H0 = null;
        this.J0 = null;
        ie.c(arrayList);
        if (this.i1 != null) {
            this.i1 = null;
        }
    }

    public void multiplySpeed(float f) {
        this.d *= (int) (1.0f / f);
    }

    public final void n() {
        if (!this.Q0 && !this.a1 && this.N0) {
            if (this.R0 <= 2) {
                this.R0 = 0;
            }
            this.E0 = false;
            this.O0 = false;
            if (!o()) {
                this.P0 = true;
            }
        }
        invalidateInternal();
    }

    public final boolean o() {
        if (this.G0 == null && this.I0 == null) {
            if (!canLoadFrames() || this.M0 || (!this.a1 && (!this.N0 || this.O0))) {
                RLottie.getLogger().a("RLottieDrawable. Can't schedule next frame invalid state");
            } else if (!this.o1 || this.u1) {
                if (!this.s0.isEmpty()) {
                    this.t0.putAll(this.s0);
                    this.s0.clear();
                }
                int[] iArr = this.Y;
                if (iArr != null) {
                    this.Z = iArr;
                    this.Y = null;
                }
                this.G0 = this.v1;
                if (this.S0 && ie.b()) {
                    cy4.a(this.G0, this.L0 != null);
                    return true;
                }
                J1.b(this.G0);
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.V0 = true;
    }

    @Override // defpackage.tca
    public void onFailed(Throwable th) {
        RLottie.getLogger().d(th);
        this.A1 = false;
        this.B1 = th;
        ie.d(new d8c(this, 11, th));
    }

    @Override // defpackage.tca
    public void onFinished(String str, File file, String str2) {
        getPaint().setFlags(2);
        this.C1 = file.getAbsolutePath();
        this.g1 = file;
        if (this.h1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.h1) {
            this.r1 = new cq0(file, this, new zp0(), this.a, this.b, !this.S0);
            pea peaVar = new pea(this);
            this.l1 = peaVar;
            peaVar.d = file.getAbsoluteFile();
            this.l1.getClass();
            this.c1 = create(file.getAbsolutePath(), null, this.a, this.b, this.c, this.h1, null, this.S0, 0);
            destroy(this.c1);
            this.c1 = 0L;
        } else {
            this.c1 = create(file.getAbsolutePath(), null, this.a, this.b, this.c, this.h1, null, this.S0, 0);
            if (this.c1 == 0) {
                file.delete();
            }
        }
        if (this.S0 && this.c[1] < 60) {
            this.S0 = false;
        }
        this.d = Math.max(this.S0 ? 33 : 16, (int) (1000.0f / this.c[1]));
        j();
        ie.d(new q6d(this, 0));
    }

    public final void p(long j, long j2, boolean z, long j3) {
        int i;
        this.J0 = this.H0;
        this.H0 = this.I0;
        this.I0 = null;
        if (this.H0 == null) {
            RLottie.getLogger().a("rendering bitmap is null");
        }
        if (this.E0 || (this.B0 == 0 && this.A0 == 1)) {
            stop();
        }
        this.G0 = null;
        if (this.f1) {
            this.f1 = false;
        } else if (this.e1) {
            this.e1 = false;
        }
        this.O0 = true;
        this.K0 = false;
        if (RLottie.config.screenRefreshRate <= 60.0f) {
            this.D0 = j;
        } else {
            this.D0 = j - Math.min(16L, j2 - j3);
        }
        if (z && this.P0) {
            this.O0 = false;
            this.P0 = false;
        }
        Set set = this.E1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this, this.R0);
                it.remove();
            }
        }
        if (isLastFrame() && ((i = this.A0) == 2 || i == 1 || i == 3 || this.E0)) {
            for (OnAllFramesRenderedListener onAllFramesRenderedListener : this.F1) {
                int i2 = this.A0;
                onAllFramesRenderedListener.onAllFramesRendered(this, i2 == 2 || i2 == 1 || i2 == 3);
            }
        }
        o();
    }

    public void post(Runnable runnable) {
        if (this.S0 && ie.b()) {
            cy4.a(new g30(runnable, 4), this.L0 != null);
        } else {
            J1.b(new g30(runnable, 5));
        }
    }

    @Override // defpackage.aq0
    public void prepareForGenerateCache() {
        File file;
        String string = ((File) this.l1.d).toString();
        pea peaVar = this.l1;
        peaVar.getClass();
        long jCreate = create(string, null, this.a, this.b, new int[3], false, (int[]) peaVar.c, false, peaVar.a);
        this.w1 = jCreate;
        if (jCreate != 0 || (file = this.g1) == null) {
            return;
        }
        file.delete();
    }

    public void recycle(boolean z) throws IOException {
        this.a1 = false;
        this.b1 = true;
        h();
        if (this.G0 != null || this.F0 != null || this.o1) {
            this.M0 = true;
            return;
        }
        l(z);
        cq0 cq0Var = this.r1;
        if (cq0Var != null) {
            RandomAccessFile randomAccessFile = cq0Var.u;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                cq0Var.u = null;
            }
            cq0Var.t = true;
            this.r1 = null;
        }
        m();
    }

    @Override // defpackage.aq0
    public void releaseForGenerateCache() {
        long j = this.w1;
        if (j != 0) {
            destroy(j);
            this.w1 = 0L;
        }
    }

    public void removeDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.D1.remove(drawableLoadListener);
    }

    public void removeOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.F1.remove(onAllFramesRenderedListener);
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.E1.remove(onNextFrameRenderedListener);
    }

    public void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.z0.remove(imageReceiver);
        checkCacheCancel();
    }

    public void replaceColors(int[] iArr) {
        this.Y = iArr;
        n();
    }

    public void resetVibrationAfterRestart(boolean z) {
        this.v0 = z;
    }

    public boolean restart() {
        return restart(false);
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.N0 = z;
        if (z) {
            o();
        }
    }

    public void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.u1 = z;
    }

    public void setAllowVibration(boolean z) {
        this.w0 = z;
    }

    public void setAutoRepeat(int i) {
        if (this.A0 == 2 && i == 3 && this.R0 != 0) {
            return;
        }
        this.A0 = i;
    }

    public void setAutoRepeatCount(int i) {
        this.B0 = i;
    }

    public void setAutoRepeatTimeout(long j) {
    }

    public void setCurrentFrame(int i) throws InterruptedException {
        setCurrentFrame(i, true);
    }

    public void setCurrentParentView(View view) {
        this.y0 = view;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.o == i || i > this.c[0]) {
            return false;
        }
        this.o = i;
        return true;
    }

    public void setGeneratingFrame(int i) {
        this.s1 = i;
    }

    public void setInvalidateOnProgressSet(boolean z) {
        this.d1 = z;
    }

    public void setLayerColor(String str, int i) {
        this.s0.put(str, Integer.valueOf(i));
        n();
    }

    public void setMasterParent(View view) {
        this.k1 = view;
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.i1 = runnable;
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.x0 = new WeakReference(runnable);
        } else if (this.x0 != null) {
            this.x0 = null;
        }
    }

    public void setOnFrameReadyRunnable(Runnable runnable) {
        this.j1 = runnable;
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.X = z;
    }

    public void setProgress(float f) throws InterruptedException {
        setProgress(f, true);
    }

    public void setProgressMs(long j) throws InterruptedException {
        setCurrentFrame((int) ((Math.max(0L, j) / this.d) % this.c[0]), true, true);
    }

    public void setVibrationPattern(HashMap<Integer, Integer> map) {
        this.u0 = map;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (!RLottie.config.isEnabled || this.a1) {
            return;
        }
        if ((this.A0 < 2 || this.C0 == 0) && this.o != this.R0) {
            this.a1 = true;
            if (this.d1) {
                this.e1 = true;
                if (this.G0 != null) {
                    this.f1 = true;
                }
            }
            o();
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.a1 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        int i;
        Integer num;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        long j3 = j2 - this.D0;
        if (!z || this.S0) {
            float f = RLottie.config.screenRefreshRate;
            i = (f <= 60.0f || (z && f <= 80.0f)) ? this.d - 6 : this.d;
        } else {
            i = this.d - 16;
        }
        if (!this.a1) {
            if ((this.P0 || (this.N0 && j3 >= i)) && this.I0 != null) {
                p(j2, j3, true, i);
                return;
            }
            return;
        }
        if (this.H0 == null && this.I0 == null) {
            o();
            return;
        }
        if (this.I0 != null) {
            if (this.H0 == null || (j3 >= i && !this.skipFrameUpdate)) {
                HashMap map = this.u0;
                if (map != null && this.y0 != null && this.w0 && (num = (Integer) map.get(Integer.valueOf(this.R0 - 1))) != null) {
                    this.y0.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                }
                p(j2, j3, false, i);
            }
        }
    }

    public RLottieDrawable(File file, int i, int i2, zp0 zp0Var, boolean z, int[] iArr, int i3) throws IOException {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.o = -1;
        this.s0 = new HashMap();
        this.t0 = new HashMap();
        this.v0 = false;
        this.w0 = true;
        this.z0 = new ArraySet();
        this.A0 = 1;
        this.B0 = -1;
        this.T0 = 1.0f;
        this.U0 = 1.0f;
        this.X0 = new RectF();
        this.Y0 = new RectF[2];
        this.Z0 = new Paint[2];
        this.m1 = new s6d(this, 0);
        this.n1 = new s6d(this, 1);
        this.p1 = new s6d(this, 2);
        this.q1 = new s6d(this, 3);
        this.v1 = new s6d(this, 4);
        this.srcRect = new Rect();
        this.x1 = -1;
        this.z1 = null;
        this.A1 = false;
        this.B1 = null;
        this.D1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.F1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.S0 = z;
        this.C1 = file.getAbsolutePath();
        this.h1 = zp0Var != null;
        getPaint().setFlags(2);
        this.g1 = file;
        if (this.h1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.h1) {
            pea peaVar = new pea(this);
            this.l1 = peaVar;
            peaVar.d = file.getAbsoluteFile();
            pea peaVar2 = this.l1;
            peaVar2.getClass();
            peaVar2.c = iArr;
            peaVar2.a = i3;
            k(file, iArr2);
            if (this.S0 && iArr2[1] < 60) {
                this.S0 = false;
            }
            this.r1 = new cq0(file, this, zp0Var, i, i2, !z);
        } else {
            this.c1 = create(file.getAbsolutePath(), null, i, i2, iArr2, this.h1, iArr, this.S0, i3);
            if (this.c1 == 0) {
                RLottie.getLogger().a("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.S0 && iArr2[1] < 60) {
                this.S0 = false;
            }
        }
        this.d = Math.max(this.S0 ? 33 : 16, (int) (1000.0f / iArr2[1]));
        j();
    }

    public void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0L, 0);
    }

    public boolean restart(boolean z) {
        if (!z && ((this.A0 < 2 || this.C0 == 0) && this.B0 < 0)) {
            return false;
        }
        this.C0 = 0;
        this.A0 = 2;
        start();
        return true;
    }

    public void setCurrentFrame(int i, boolean z) throws InterruptedException {
        setCurrentFrame(i, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r3, boolean r4) throws java.lang.InterruptedException {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            int[] r0 = r2.c
            r1 = 0
            r0 = r0[r1]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            r2.setCurrentFrame(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.setProgress(float, boolean):void");
    }

    public void setCurrentFrame(int i, boolean z, boolean z2) throws InterruptedException {
        if (i < 0 || i > this.c[0]) {
            return;
        }
        if (this.R0 != i || z2) {
            this.R0 = i;
            this.E0 = false;
            this.O0 = false;
            if (this.d1) {
                this.e1 = true;
                if (this.G0 != null) {
                    this.f1 = true;
                }
            }
            if ((!z || z2) && this.K0 && this.I0 != null) {
                this.J0 = this.I0;
                this.I0 = null;
                this.G0 = null;
                this.K0 = false;
            }
            if (!z && this.G0 == null) {
                this.L0 = new CountDownLatch(1);
            }
            if (z2 && !this.a1) {
                this.a1 = true;
            }
            if (!o()) {
                this.P0 = true;
            } else if (!z) {
                try {
                    this.L0.await();
                } catch (Exception e) {
                    RLottie.getLogger().d(e);
                }
                this.L0 = null;
            }
            invalidateSelf();
        }
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, (int[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RLottieDrawable(int r10, java.lang.String r11, int r12, int r13, boolean r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.<init>(int, java.lang.String, int, int, boolean, int[]):void");
    }

    public RLottieDrawable(String str, String str2, int i, int i2, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.o = -1;
        this.s0 = new HashMap();
        this.t0 = new HashMap();
        this.v0 = false;
        this.w0 = true;
        this.z0 = new ArraySet();
        this.A0 = 1;
        this.B0 = -1;
        this.T0 = 1.0f;
        this.U0 = 1.0f;
        this.X0 = new RectF();
        this.Y0 = new RectF[2];
        this.Z0 = new Paint[2];
        this.m1 = new s6d(this, 0);
        this.n1 = new s6d(this, 1);
        this.p1 = new s6d(this, 2);
        this.q1 = new s6d(this, 3);
        this.v1 = new s6d(this, 4);
        this.srcRect = new Rect();
        this.x1 = -1;
        this.z1 = null;
        this.A1 = false;
        this.B1 = null;
        this.D1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.F1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.C1 = str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getPaint().setFlags(2);
        this.c1 = createWithJson(str, str2, iArr2, iArr);
        this.d = Math.max(16, (int) (1000.0f / iArr2[1]));
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
        j();
    }
}
