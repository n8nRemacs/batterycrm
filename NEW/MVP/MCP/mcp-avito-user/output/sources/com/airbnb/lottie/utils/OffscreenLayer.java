package com.airbnb.lottie.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.m;
import j.P;

/* loaded from: classes10.dex */
public class OffscreenLayer {

    /* renamed from: B, reason: collision with root package name */
    public static final Matrix f60057B = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    @P
    public b f60058A;

    /* renamed from: a, reason: collision with root package name */
    @P
    public Canvas f60059a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public a f60060b;

    /* renamed from: c, reason: collision with root package name */
    public RenderStrategy f60061c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public RectF f60062d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public RectF f60063e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Rect f60064f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public RectF f60065g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public RectF f60066h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public Rect f60067i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public RectF f60068j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.a f60069k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public Bitmap f60070l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public Canvas f60071m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public Rect f60072n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.a f60073o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public Matrix f60074p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public float[] f60075q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public Bitmap f60076r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public Bitmap f60077s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public Canvas f60078t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public Canvas f60079u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.a f60080v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public BlurMaskFilter f60081w;

    /* renamed from: x, reason: collision with root package name */
    public float f60082x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    @P
    public RenderNode f60083y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public RenderNode f60084z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RenderStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final RenderStrategy f60085b;

        /* renamed from: c, reason: collision with root package name */
        public static final RenderStrategy f60086c;

        /* renamed from: d, reason: collision with root package name */
        public static final RenderStrategy f60087d;

        /* renamed from: e, reason: collision with root package name */
        public static final RenderStrategy f60088e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ RenderStrategy[] f60089f;

        static {
            RenderStrategy renderStrategy = new RenderStrategy("DIRECT", 0);
            f60085b = renderStrategy;
            RenderStrategy renderStrategy2 = new RenderStrategy("SAVE_LAYER", 1);
            f60086c = renderStrategy2;
            RenderStrategy renderStrategy3 = new RenderStrategy("BITMAP", 2);
            f60087d = renderStrategy3;
            RenderStrategy renderStrategy4 = new RenderStrategy("RENDER_NODE", 3);
            f60088e = renderStrategy4;
            f60089f = new RenderStrategy[]{renderStrategy, renderStrategy2, renderStrategy3, renderStrategy4};
        }

        public RenderStrategy() {
            throw null;
        }

        public static RenderStrategy valueOf(String str) {
            return (RenderStrategy) Enum.valueOf(RenderStrategy.class, str);
        }

        public static RenderStrategy[] values() {
            return (RenderStrategy[]) f60089f.clone();
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f60090a = 255;

        /* renamed from: b, reason: collision with root package name */
        @P
        public b f60091b = null;

        public final boolean a() {
            return this.f60091b != null;
        }
    }

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(@P Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, b bVar) {
        if (this.f60063e == null) {
            this.f60063e = new RectF();
        }
        if (this.f60065g == null) {
            this.f60065g = new RectF();
        }
        this.f60063e.set(rectF);
        this.f60063e.offsetTo(rectF.left + bVar.f60096b, rectF.top + bVar.f60097c);
        RectF rectF2 = this.f60063e;
        float f12 = bVar.f60095a;
        rectF2.inset(-f12, -f12);
        this.f60065g.set(rectF);
        this.f60063e.union(this.f60065g);
        return this.f60063e;
    }

    public final void c() {
        float f12;
        com.airbnb.lottie.animation.a aVar;
        if (this.f60059a == null || this.f60060b == null || this.f60075q == null || this.f60062d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f60061c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f60059a.restore();
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (this.f60083y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f60059a.save();
                    Canvas canvas = this.f60059a;
                    float[] fArr = this.f60075q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f60083y.endRecording();
                    if (this.f60060b.a()) {
                        Canvas canvas2 = this.f60059a;
                        b bVar = this.f60060b.f60091b;
                        if (this.f60083y == null || this.f60084z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i12 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f60075q;
                        float f13 = fArr2 != null ? fArr2[0] : 1.0f;
                        f12 = fArr2 != null ? fArr2[4] : 1.0f;
                        b bVar2 = this.f60058A;
                        if (bVar2 == null || bVar.f60095a != bVar2.f60095a || bVar.f60096b != bVar2.f60096b || bVar.f60097c != bVar2.f60097c || bVar.f60098d != bVar2.f60098d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.f60098d, PorterDuff.Mode.SRC_IN));
                            float f14 = bVar.f60095a;
                            if (f14 > 0.0f) {
                                float f15 = ((f13 + f12) * f14) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f15, f15, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f60084z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.f60058A = bVar;
                        }
                        RectF rectFB = b(this.f60062d, bVar);
                        RectF rectF = new RectF(rectFB.left * f13, rectFB.top * f12, rectFB.right * f13, rectFB.bottom * f12);
                        this.f60084z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f60084z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((bVar.f60096b * f13) + (-rectF.left), (bVar.f60097c * f12) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f60083y);
                        this.f60084z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f60084z);
                        canvas2.restore();
                    }
                    this.f60059a.drawRenderNode(this.f60083y);
                    this.f60059a.restore();
                }
            } else {
                if (this.f60070l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f60060b.a()) {
                    Canvas canvas3 = this.f60059a;
                    b bVar3 = this.f60060b.f60091b;
                    RectF rectF2 = this.f60062d;
                    if (rectF2 == null || this.f60070l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, bVar3);
                    if (this.f60064f == null) {
                        this.f60064f = new Rect();
                    }
                    this.f60064f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f60075q;
                    float f16 = fArr3 != null ? fArr3[0] : 1.0f;
                    f12 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f60066h == null) {
                        this.f60066h = new RectF();
                    }
                    this.f60066h.set(rectFB2.left * f16, rectFB2.top * f12, rectFB2.right * f16, rectFB2.bottom * f12);
                    if (this.f60067i == null) {
                        this.f60067i = new Rect();
                    }
                    this.f60067i.set(0, 0, Math.round(this.f60066h.width()), Math.round(this.f60066h.height()));
                    if (d(this.f60076r, this.f60066h)) {
                        Bitmap bitmap = this.f60076r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f60077s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f60076r = a(this.f60066h, Bitmap.Config.ARGB_8888);
                        this.f60077s = a(this.f60066h, Bitmap.Config.ALPHA_8);
                        this.f60078t = new Canvas(this.f60076r);
                        this.f60079u = new Canvas(this.f60077s);
                    } else {
                        Canvas canvas4 = this.f60078t;
                        if (canvas4 == null || this.f60079u == null || (aVar = this.f60073o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.f60067i, aVar);
                        this.f60079u.drawRect(this.f60067i, this.f60073o);
                    }
                    if (this.f60077s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f60080v == null) {
                        this.f60080v = new com.airbnb.lottie.animation.a(1);
                    }
                    RectF rectF3 = this.f60062d;
                    this.f60079u.drawBitmap(this.f60070l, Math.round((rectF3.left - rectFB2.left) * f16), Math.round((rectF3.top - rectFB2.top) * f12), (Paint) null);
                    if (this.f60081w == null || this.f60082x != bVar3.f60095a) {
                        float f17 = ((f16 + f12) * bVar3.f60095a) / 2.0f;
                        if (f17 > 0.0f) {
                            this.f60081w = new BlurMaskFilter(f17, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f60081w = null;
                        }
                        this.f60082x = bVar3.f60095a;
                    }
                    this.f60080v.setColor(bVar3.f60098d);
                    if (bVar3.f60095a > 0.0f) {
                        this.f60080v.setMaskFilter(this.f60081w);
                    } else {
                        this.f60080v.setMaskFilter(null);
                    }
                    this.f60080v.setFilterBitmap(true);
                    this.f60078t.drawBitmap(this.f60077s, Math.round(bVar3.f60096b * f16), Math.round(bVar3.f60097c * f12), this.f60080v);
                    canvas3.drawBitmap(this.f60076r, this.f60067i, this.f60064f, this.f60069k);
                }
                if (this.f60072n == null) {
                    this.f60072n = new Rect();
                }
                this.f60072n.set(0, 0, (int) (this.f60062d.width() * this.f60075q[0]), (int) (this.f60062d.height() * this.f60075q[4]));
                this.f60059a.drawBitmap(this.f60070l, this.f60072n, this.f60062d, this.f60069k);
            }
        }
        this.f60059a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, a aVar) {
        RenderStrategy renderStrategy;
        if (this.f60059a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f60075q == null) {
            this.f60075q = new float[9];
        }
        if (this.f60074p == null) {
            this.f60074p = new Matrix();
        }
        canvas.getMatrix(this.f60074p);
        this.f60074p.getValues(this.f60075q);
        float[] fArr = this.f60075q;
        float f12 = fArr[0];
        float f13 = fArr[4];
        if (this.f60068j == null) {
            this.f60068j = new RectF();
        }
        this.f60068j.set(rectF.left * f12, rectF.top * f13, rectF.right * f12, rectF.bottom * f13);
        this.f60059a = canvas;
        this.f60060b = aVar;
        if (aVar.f60090a >= 255 && !aVar.a()) {
            renderStrategy = RenderStrategy.f60085b;
        } else if (aVar.a()) {
            int i12 = Build.VERSION.SDK_INT;
            renderStrategy = (i12 < 29 || !canvas.isHardwareAccelerated() || i12 <= 31) ? RenderStrategy.f60087d : RenderStrategy.f60088e;
        } else {
            renderStrategy = RenderStrategy.f60086c;
        }
        this.f60061c = renderStrategy;
        if (this.f60062d == null) {
            this.f60062d = new RectF();
        }
        this.f60062d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f60069k == null) {
            this.f60069k = new com.airbnb.lottie.animation.a();
        }
        this.f60069k.reset();
        int iOrdinal = this.f60061c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f60069k.setAlpha(aVar.f60090a);
            this.f60069k.setColorFilter(null);
            k.e(canvas, this.f60069k, rectF);
            return canvas;
        }
        Matrix matrix = f60057B;
        if (iOrdinal == 2) {
            if (this.f60073o == null) {
                com.airbnb.lottie.animation.a aVar2 = new com.airbnb.lottie.animation.a();
                this.f60073o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f60070l, this.f60068j)) {
                Bitmap bitmap = this.f60070l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f60070l = a(this.f60068j, Bitmap.Config.ARGB_8888);
                this.f60071m = new Canvas(this.f60070l);
            } else {
                Canvas canvas2 = this.f60071m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix);
                this.f60071m.drawRect(-1.0f, -1.0f, this.f60068j.width() + 1.0f, this.f60068j.height() + 1.0f, this.f60073o);
            }
            m.a(this.f60069k, null);
            this.f60069k.setColorFilter(null);
            this.f60069k.setAlpha(aVar.f60090a);
            Canvas canvas3 = this.f60071m;
            canvas3.scale(f12, f13);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f60083y == null) {
            this.f60083y = androidx.media3.exoplayer.source.mediaparser.c.i();
        }
        if (aVar.a() && this.f60084z == null) {
            this.f60084z = androidx.media3.exoplayer.source.mediaparser.c.x();
            this.f60058A = null;
        }
        this.f60083y.setAlpha(aVar.f60090a / 255.0f);
        if (aVar.a()) {
            RenderNode renderNode = this.f60084z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(aVar.f60090a / 255.0f);
        }
        this.f60083y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f60083y;
        RectF rectF2 = this.f60068j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f60083y.beginRecording((int) this.f60068j.width(), (int) this.f60068j.height());
        recordingCanvasBeginRecording.setMatrix(matrix);
        recordingCanvasBeginRecording.scale(f12, f13);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
