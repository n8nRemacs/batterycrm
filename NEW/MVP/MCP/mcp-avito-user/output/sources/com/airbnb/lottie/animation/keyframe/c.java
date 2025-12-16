package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Matrix;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.parser.C27306j;
import j.P;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f59321a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f59322b;

    /* renamed from: c, reason: collision with root package name */
    public final b f59323c;

    /* renamed from: d, reason: collision with root package name */
    public final d f59324d;

    /* renamed from: e, reason: collision with root package name */
    public final d f59325e;

    /* renamed from: f, reason: collision with root package name */
    public final d f59326f;

    /* renamed from: g, reason: collision with root package name */
    public final d f59327g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Matrix f59328h;

    /* compiled from: DropShadowKeyframeAnimation.java */
    public class a extends com.airbnb.lottie.value.j<Float> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.value.j f59329c;

        public a(com.airbnb.lottie.value.j jVar) {
            this.f59329c = jVar;
        }

        @Override // com.airbnb.lottie.value.j
        @P
        public final Float a(com.airbnb.lottie.value.b<Float> bVar) {
            Float f12 = (Float) this.f59329c.f60158b;
            if (f12 == null) {
                return null;
            }
            return Float.valueOf(f12.floatValue() * 2.55f);
        }
    }

    public c(com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.layer.b bVar2, C27306j c27306j) {
        this.f59322b = bVar;
        this.f59321a = bVar2;
        com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC = c27306j.f59948a.c();
        this.f59323c = (b) aVarC;
        aVarC.a(this);
        bVar2.f(aVarC);
        d dVarC = c27306j.f59949b.c();
        this.f59324d = dVarC;
        dVarC.a(this);
        bVar2.f(dVarC);
        d dVarC2 = c27306j.f59950c.c();
        this.f59325e = dVarC2;
        dVarC2.a(this);
        bVar2.f(dVarC2);
        d dVarC3 = c27306j.f59951d.c();
        this.f59326f = dVarC3;
        dVarC3.a(this);
        bVar2.f(dVarC3);
        d dVarC4 = c27306j.f59952e.c();
        this.f59327g = dVarC4;
        dVarC4.a(this);
        bVar2.f(dVarC4);
    }

    public final com.airbnb.lottie.utils.b a(Matrix matrix, int i12) {
        float fM2 = this.f59325e.m() * 0.017453292f;
        float fFloatValue = this.f59326f.f().floatValue();
        double d12 = fM2;
        float fSin = ((float) Math.sin(d12)) * fFloatValue;
        float fCos = ((float) Math.cos(d12 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f59327g.f().floatValue();
        int iIntValue = this.f59323c.f().intValue();
        int iArgb = Color.argb(Math.round((this.f59324d.f().floatValue() * i12) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        com.airbnb.lottie.utils.b bVar = new com.airbnb.lottie.utils.b();
        bVar.f60095a = fFloatValue2 * 0.33f;
        bVar.f60096b = fSin;
        bVar.f60097c = fCos;
        bVar.f60098d = iArgb;
        bVar.f60099e = null;
        bVar.c(matrix);
        if (this.f59328h == null) {
            this.f59328h = new Matrix();
        }
        this.f59321a.f59834x.e().invert(this.f59328h);
        bVar.c(this.f59328h);
        return bVar;
    }

    public final void b(@P com.airbnb.lottie.value.j<Float> jVar) {
        this.f59324d.k(new a(jVar));
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59322b.g();
    }
}
