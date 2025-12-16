package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.value.j;
import j.P;

/* compiled from: SolidLayer.java */
/* loaded from: classes10.dex */
public class g extends b {

    /* renamed from: E, reason: collision with root package name */
    public final RectF f59863E;

    /* renamed from: F, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59864F;

    /* renamed from: G, reason: collision with root package name */
    public final float[] f59865G;

    /* renamed from: H, reason: collision with root package name */
    public final Path f59866H;

    /* renamed from: I, reason: collision with root package name */
    public final Layer f59867I;

    /* renamed from: J, reason: collision with root package name */
    @P
    public q f59868J;

    /* renamed from: K, reason: collision with root package name */
    @P
    public q f59869K;

    public g(B b12, Layer layer) {
        super(b12, layer);
        this.f59863E = new RectF();
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        this.f59864F = aVar;
        this.f59865G = new float[8];
        this.f59866H = new Path();
        this.f59867I = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.f59785l);
    }

    @Override // com.airbnb.lottie.model.layer.b, O2.e
    public final void a(ColorFilter colorFilter, @P j jVar) {
        super.a(colorFilter, jVar);
        if (colorFilter == H.f59076F) {
            this.f59868J = new q(jVar, null);
        } else if (colorFilter == 1) {
            this.f59869K = new q(jVar, null);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        super.e(rectF, matrix, z12);
        RectF rectF2 = this.f59863E;
        Layer layer = this.f59867I;
        rectF2.set(0.0f, 0.0f, layer.f59783j, layer.f59784k);
        this.f59825o.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void l(Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        Layer layer = this.f59867I;
        int iAlpha = Color.alpha(layer.f59785l);
        if (iAlpha == 0) {
            return;
        }
        q qVar = this.f59869K;
        Integer num = qVar == null ? null : (Integer) qVar.f();
        com.airbnb.lottie.animation.a aVar = this.f59864F;
        if (num != null) {
            aVar.setColor(num.intValue());
        } else {
            aVar.setColor(layer.f59785l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f59834x.f59366j == null ? 100 : r2.f().intValue())) / 100.0f) * (i12 / 255.0f) * 255.0f);
        aVar.setAlpha(iIntValue);
        if (bVar == null || Color.alpha(bVar.f60098d) <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(bVar.f60095a, Float.MIN_VALUE), bVar.f60096b, bVar.f60097c, bVar.f60098d);
        }
        q qVar2 = this.f59868J;
        if (qVar2 != null) {
            aVar.setColorFilter((ColorFilter) qVar2.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f59865G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f12 = layer.f59783j;
            fArr[2] = f12;
            fArr[3] = 0.0f;
            fArr[4] = f12;
            float f13 = layer.f59784k;
            fArr[5] = f13;
            fArr[6] = 0.0f;
            fArr[7] = f13;
            matrix.mapPoints(fArr);
            Path path = this.f59866H;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }
}
