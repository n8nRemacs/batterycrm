package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.D;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.parser.C27306j;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.airbnb.lottie.utils.k;
import com.airbnb.lottie.value.j;
import j.N;
import j.P;
import java.util.HashMap;

/* compiled from: ImageLayer.java */
/* loaded from: classes10.dex */
public class d extends b {

    /* renamed from: E, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59850E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f59851F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f59852G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f59853H;

    /* renamed from: I, reason: collision with root package name */
    @P
    public final D f59854I;

    /* renamed from: J, reason: collision with root package name */
    @P
    public q f59855J;

    /* renamed from: K, reason: collision with root package name */
    @P
    public q f59856K;

    /* renamed from: L, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.c f59857L;

    /* renamed from: M, reason: collision with root package name */
    @P
    public OffscreenLayer f59858M;

    /* renamed from: N, reason: collision with root package name */
    @P
    public OffscreenLayer.a f59859N;

    public d(B b12, Layer layer) {
        D d12;
        super(b12, layer);
        this.f59850E = new com.airbnb.lottie.animation.a(3);
        this.f59851F = new Rect();
        this.f59852G = new Rect();
        this.f59853H = new RectF();
        C27291k c27291k = b12.f59035b;
        if (c27291k == null) {
            d12 = null;
        } else {
            d12 = (D) ((HashMap) c27291k.c()).get(layer.f59780g);
        }
        this.f59854I = d12;
        C27306j c27306j = this.f59827q.f59797x;
        if (c27306j != null) {
            this.f59857L = new com.airbnb.lottie.animation.keyframe.c(this, this, c27306j);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, O2.e
    public final void a(ColorFilter colorFilter, @P j jVar) {
        super.a(colorFilter, jVar);
        if (colorFilter == H.f59076F) {
            this.f59855J = new q(jVar, null);
            return;
        }
        if (colorFilter == H.f59079I) {
            this.f59856K = new q(jVar, null);
            return;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f59857L;
        if (colorFilter == 5 && cVar != null) {
            cVar.f59323c.k(jVar);
            return;
        }
        if (colorFilter == H.f59072B && cVar != null) {
            cVar.b(jVar);
            return;
        }
        if (colorFilter == H.f59073C && cVar != null) {
            cVar.f59325e.k(jVar);
            return;
        }
        if (colorFilter == H.f59074D && cVar != null) {
            cVar.f59326f.k(jVar);
        } else {
            if (colorFilter != H.f59075E || cVar == null) {
                return;
            }
            cVar.f59327g.k(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        Bitmap bitmapT;
        super.e(rectF, matrix, z12);
        D d12 = this.f59854I;
        if (d12 != null) {
            float fC2 = k.c();
            boolean z13 = this.f59826p.f59051r;
            int i12 = d12.f59066b;
            int i13 = d12.f59065a;
            if (z13 || (bitmapT = t()) == null) {
                rectF.set(0.0f, 0.0f, i13 * fC2, i12 * fC2);
            } else {
                rectF.set(0.0f, 0.0f, bitmapT.getWidth() * fC2, bitmapT.getHeight() * fC2);
            }
            this.f59825o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void l(@N Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        D d12;
        Bitmap bitmapT = t();
        if (bitmapT == null || bitmapT.isRecycled() || (d12 = this.f59854I) == null) {
            return;
        }
        float fC2 = k.c();
        com.airbnb.lottie.animation.a aVar = this.f59850E;
        aVar.setAlpha(i12);
        q qVar = this.f59855J;
        if (qVar != null) {
            aVar.setColorFilter((ColorFilter) qVar.f());
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f59857L;
        if (cVar != null) {
            bVar = cVar.a(matrix, i12);
        }
        int width = bitmapT.getWidth();
        int height = bitmapT.getHeight();
        Rect rect = this.f59851F;
        rect.set(0, 0, width, height);
        boolean z12 = this.f59826p.f59051r;
        Rect rect2 = this.f59852G;
        if (z12) {
            rect2.set(0, 0, (int) (d12.f59065a * fC2), (int) (d12.f59066b * fC2));
        } else {
            rect2.set(0, 0, (int) (bitmapT.getWidth() * fC2), (int) (bitmapT.getHeight() * fC2));
        }
        boolean z13 = bVar != null;
        if (z13) {
            if (this.f59858M == null) {
                this.f59858M = new OffscreenLayer();
            }
            if (this.f59859N == null) {
                this.f59859N = new OffscreenLayer.a();
            }
            OffscreenLayer.a aVar2 = this.f59859N;
            aVar2.f60090a = 255;
            aVar2.f60091b = null;
            bVar.getClass();
            com.airbnb.lottie.utils.b bVar2 = new com.airbnb.lottie.utils.b(bVar);
            aVar2.f60091b = bVar2;
            bVar2.b(i12);
            RectF rectF = this.f59853H;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            matrix.mapRect(rectF);
            canvas = this.f59858M.e(canvas, rectF, this.f59859N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapT, rect, rect2, aVar);
        if (z13) {
            this.f59858M.c();
            if (this.f59858M.f60061c == OffscreenLayer.RenderStrategy.f60088e) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap t() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.d.t():android.graphics.Bitmap");
    }
}
