package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.collection.C20204c0;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.model.animatable.l;
import com.airbnb.lottie.model.animatable.m;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.value.j;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: TextLayer.java */
/* loaded from: classes10.dex */
public class h extends com.airbnb.lottie.model.layer.b {

    /* renamed from: E, reason: collision with root package name */
    public final StringBuilder f59870E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f59871F;

    /* renamed from: G, reason: collision with root package name */
    public final Matrix f59872G;

    /* renamed from: H, reason: collision with root package name */
    public final Paint f59873H;

    /* renamed from: I, reason: collision with root package name */
    public final Paint f59874I;

    /* renamed from: J, reason: collision with root package name */
    public final HashMap f59875J;

    /* renamed from: K, reason: collision with root package name */
    public final C20204c0<String> f59876K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f59877L;

    /* renamed from: M, reason: collision with root package name */
    public final o f59878M;

    /* renamed from: N, reason: collision with root package name */
    public final B f59879N;

    /* renamed from: O, reason: collision with root package name */
    public final C27291k f59880O;

    /* renamed from: P, reason: collision with root package name */
    public final TextRangeUnits f59881P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.b f59882Q;

    /* renamed from: R, reason: collision with root package name */
    @P
    public q f59883R;

    /* renamed from: S, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.b f59884S;

    /* renamed from: T, reason: collision with root package name */
    @P
    public q f59885T;

    /* renamed from: U, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.d f59886U;

    /* renamed from: V, reason: collision with root package name */
    @P
    public q f59887V;

    /* renamed from: W, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.d f59888W;

    /* renamed from: X, reason: collision with root package name */
    @P
    public q f59889X;

    /* renamed from: Y, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.f f59890Y;

    /* renamed from: Z, reason: collision with root package name */
    @P
    public q f59891Z;

    /* renamed from: a0, reason: collision with root package name */
    @P
    public q f59892a0;

    /* renamed from: b0, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.f f59893b0;

    /* renamed from: c0, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.f f59894c0;

    /* renamed from: d0, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.f f59895d0;

    /* compiled from: TextLayer.java */
    public class a extends Paint {
    }

    /* compiled from: TextLayer.java */
    public class b extends Paint {
    }

    /* compiled from: TextLayer.java */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59896a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f59896a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59896a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59896a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(B b12, Layer layer) {
        l lVar;
        l lVar2;
        com.airbnb.lottie.model.animatable.d dVar;
        l lVar3;
        com.airbnb.lottie.model.animatable.d dVar2;
        l lVar4;
        com.airbnb.lottie.model.animatable.d dVar3;
        m mVar;
        com.airbnb.lottie.model.animatable.d dVar4;
        m mVar2;
        com.airbnb.lottie.model.animatable.b bVar;
        m mVar3;
        com.airbnb.lottie.model.animatable.b bVar2;
        m mVar4;
        com.airbnb.lottie.model.animatable.a aVar;
        m mVar5;
        com.airbnb.lottie.model.animatable.a aVar2;
        super(b12, layer);
        this.f59870E = new StringBuilder(2);
        this.f59871F = new RectF();
        this.f59872G = new Matrix();
        a aVar3 = new a(1);
        aVar3.setStyle(Paint.Style.FILL);
        this.f59873H = aVar3;
        b bVar3 = new b(1);
        bVar3.setStyle(Paint.Style.STROKE);
        this.f59874I = bVar3;
        this.f59875J = new HashMap();
        this.f59876K = new C20204c0<>();
        this.f59877L = new ArrayList();
        this.f59881P = TextRangeUnits.f59716c;
        this.f59879N = b12;
        this.f59880O = layer.f59775b;
        o oVarC = layer.f59790q.c();
        this.f59878M = oVarC;
        oVarC.a(this);
        f(oVarC);
        k kVar = layer.f59791r;
        if (kVar != null && (mVar5 = kVar.f59634a) != null && (aVar2 = mVar5.f59640a) != null) {
            com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC = aVar2.c();
            this.f59882Q = (com.airbnb.lottie.animation.keyframe.b) aVarC;
            aVarC.a(this);
            f(aVarC);
        }
        if (kVar != null && (mVar4 = kVar.f59634a) != null && (aVar = mVar4.f59641b) != null) {
            com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC2 = aVar.c();
            this.f59884S = (com.airbnb.lottie.animation.keyframe.b) aVarC2;
            aVarC2.a(this);
            f(aVarC2);
        }
        if (kVar != null && (mVar3 = kVar.f59634a) != null && (bVar2 = mVar3.f59642c) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarC = bVar2.c();
            this.f59886U = dVarC;
            dVarC.a(this);
            f(dVarC);
        }
        if (kVar != null && (mVar2 = kVar.f59634a) != null && (bVar = mVar2.f59643d) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarC2 = bVar.c();
            this.f59888W = dVarC2;
            dVarC2.a(this);
            f(dVarC2);
        }
        if (kVar != null && (mVar = kVar.f59634a) != null && (dVar4 = mVar.f59644e) != null) {
            com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC3 = dVar4.c();
            this.f59890Y = (com.airbnb.lottie.animation.keyframe.f) aVarC3;
            aVarC3.a(this);
            f(aVarC3);
        }
        if (kVar != null && (lVar4 = kVar.f59635b) != null && (dVar3 = lVar4.f59636a) != null) {
            com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC4 = dVar3.c();
            this.f59893b0 = (com.airbnb.lottie.animation.keyframe.f) aVarC4;
            aVarC4.a(this);
            f(aVarC4);
        }
        if (kVar != null && (lVar3 = kVar.f59635b) != null && (dVar2 = lVar3.f59637b) != null) {
            com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC5 = dVar2.c();
            this.f59894c0 = (com.airbnb.lottie.animation.keyframe.f) aVarC5;
            aVarC5.a(this);
            f(aVarC5);
        }
        if (kVar != null && (lVar2 = kVar.f59635b) != null && (dVar = lVar2.f59638c) != null) {
            com.airbnb.lottie.animation.keyframe.a<?, ?> aVarC6 = dVar.c();
            this.f59895d0 = (com.airbnb.lottie.animation.keyframe.f) aVarC6;
            aVarC6.a(this);
            f(aVarC6);
        }
        if (kVar == null || (lVar = kVar.f59635b) == null) {
            return;
        }
        this.f59881P = lVar.f59639d;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.b, O2.e
    public final void a(ColorFilter colorFilter, @P j jVar) {
        super.a(colorFilter, jVar);
        PointF pointF = H.f59082a;
        if (colorFilter == 1) {
            q qVar = this.f59883R;
            if (qVar != null) {
                p(qVar);
            }
            q qVar2 = new q(jVar, null);
            this.f59883R = qVar2;
            qVar2.a(this);
            f(this.f59883R);
            return;
        }
        if (colorFilter == 2) {
            q qVar3 = this.f59885T;
            if (qVar3 != null) {
                p(qVar3);
            }
            q qVar4 = new q(jVar, null);
            this.f59885T = qVar4;
            qVar4.a(this);
            f(this.f59885T);
            return;
        }
        if (colorFilter == H.f59095n) {
            q qVar5 = this.f59887V;
            if (qVar5 != null) {
                p(qVar5);
            }
            q qVar6 = new q(jVar, null);
            this.f59887V = qVar6;
            qVar6.a(this);
            f(this.f59887V);
            return;
        }
        if (colorFilter == H.f59096o) {
            q qVar7 = this.f59889X;
            if (qVar7 != null) {
                p(qVar7);
            }
            q qVar8 = new q(jVar, null);
            this.f59889X = qVar8;
            qVar8.a(this);
            f(this.f59889X);
            return;
        }
        if (colorFilter == H.f59071A) {
            q qVar9 = this.f59891Z;
            if (qVar9 != null) {
                p(qVar9);
            }
            q qVar10 = new q(jVar, null);
            this.f59891Z = qVar10;
            qVar10.a(this);
            f(this.f59891Z);
            return;
        }
        if (colorFilter != H.f59078H) {
            if (colorFilter == H.f59080J) {
                this.f59878M.m(jVar);
                return;
            }
            return;
        }
        q qVar11 = this.f59892a0;
        if (qVar11 != null) {
            p(qVar11);
        }
        q qVar12 = new q(jVar, null);
        this.f59892a0 = qVar12;
        qVar12.a(this);
        f(this.f59892a0);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        super.e(rectF, matrix, z12);
        C27291k c27291k = this.f59880O;
        rectF.set(0.0f, 0.0f, c27291k.f59592k.width(), c27291k.f59592k.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    @Override // com.airbnb.lottie.model.layer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, @j.P com.airbnb.lottie.utils.b r34) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.h.l(android.graphics.Canvas, android.graphics.Matrix, int, com.airbnb.lottie.utils.b):void");
    }

    public final void t(DocumentData documentData, int i12, int i13) {
        q qVar = this.f59883R;
        Paint paint = this.f59873H;
        if (qVar != null) {
            paint.setColor(((Integer) qVar.f()).intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.b bVar = this.f59882Q;
            if (bVar == null || !x(i13)) {
                paint.setColor(documentData.f59623h);
            } else {
                paint.setColor(bVar.f().intValue());
            }
        }
        q qVar2 = this.f59885T;
        Paint paint2 = this.f59874I;
        if (qVar2 != null) {
            paint2.setColor(((Integer) qVar2.f()).intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.b bVar2 = this.f59884S;
            if (bVar2 == null || !x(i13)) {
                paint2.setColor(documentData.f59624i);
            } else {
                paint2.setColor(bVar2.f().intValue());
            }
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.f59834x.f59366j;
        int iIntValue = 100;
        int iIntValue2 = aVar == null ? 100 : aVar.f().intValue();
        com.airbnb.lottie.animation.keyframe.f fVar = this.f59890Y;
        if (fVar != null && x(i13)) {
            iIntValue = fVar.f().intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i12) / 255.0f);
        paint.setAlpha(iRound);
        paint2.setAlpha(iRound);
        q qVar3 = this.f59887V;
        if (qVar3 != null) {
            paint2.setStrokeWidth(((Float) qVar3.f()).floatValue());
            return;
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f59886U;
        if (dVar == null || !x(i13)) {
            paint2.setStrokeWidth(com.airbnb.lottie.utils.k.c() * documentData.f59625j);
        } else {
            paint2.setStrokeWidth(dVar.f().floatValue());
        }
    }

    public final d w(int i12) {
        ArrayList arrayList = this.f59877L;
        for (int size = arrayList.size(); size < i12; size++) {
            arrayList.add(new d(null));
        }
        return (d) arrayList.get(i12 - 1);
    }

    public final boolean x(int i12) {
        com.airbnb.lottie.animation.keyframe.f fVar;
        int length = this.f59878M.f().f59616a.length();
        com.airbnb.lottie.animation.keyframe.f fVar2 = this.f59893b0;
        if (fVar2 == null || (fVar = this.f59894c0) == null) {
            return true;
        }
        int iMin = Math.min(fVar2.f().intValue(), fVar.f().intValue());
        int iMax = Math.max(fVar2.f().intValue(), fVar.f().intValue());
        com.airbnb.lottie.animation.keyframe.f fVar3 = this.f59895d0;
        if (fVar3 != null) {
            int iIntValue = fVar3.f().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f59881P == TextRangeUnits.f59716c) {
            return i12 >= iMin && i12 < iMax;
        }
        float f12 = (i12 / length) * 100.0f;
        return f12 >= ((float) iMin) && f12 < ((float) iMax);
    }

    public final boolean y(Canvas canvas, DocumentData documentData, int i12, float f12) {
        PointF pointF = documentData.f59627l;
        PointF pointF2 = documentData.f59628m;
        float fC2 = com.airbnb.lottie.utils.k.c();
        float f13 = (i12 * documentData.f59621f * fC2) + (pointF == null ? 0.0f : (documentData.f59621f * fC2) + pointF.y);
        if (this.f59879N.f59059z && pointF2 != null && pointF != null && f13 >= pointF.y + pointF2.y + documentData.f59618c) {
            return false;
        }
        float f14 = pointF == null ? 0.0f : pointF.x;
        float f15 = pointF2 != null ? pointF2.x : 0.0f;
        int iOrdinal = documentData.f59619d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f14, f13);
        } else if (iOrdinal == 1) {
            canvas.translate((f14 + f15) - f12, f13);
        } else if (iOrdinal == 2) {
            canvas.translate(((f15 / 2.0f) + f14) - (f12 / 2.0f), f13);
        }
        return true;
    }

    public final List<d> z(String str, float f12, O2.b bVar, float f13, float f14, boolean z12) {
        float fMeasureText;
        int i12 = 0;
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (z12) {
                O2.c cVarF = this.f59880O.f59589h.f(O2.c.a(cCharAt, bVar.f11932a, bVar.f11934c));
                if (cVarF != null) {
                    fMeasureText = (com.airbnb.lottie.utils.k.c() * ((float) cVarF.f11938c) * f13) + f14;
                }
            } else {
                fMeasureText = this.f59873H.measureText(str.substring(i15, i15 + 1)) + f14;
            }
            if (cCharAt == ' ') {
                z13 = true;
                f17 = fMeasureText;
            } else if (z13) {
                z13 = false;
                i14 = i15;
                f16 = fMeasureText;
            } else {
                f16 += fMeasureText;
            }
            f15 += fMeasureText;
            if (f12 > 0.0f && f15 >= f12 && cCharAt != ' ') {
                i12++;
                d dVarW = w(i12);
                if (i14 == i13) {
                    dVarW.f59897a = str.substring(i13, i15).trim();
                    dVarW.f59898b = (f15 - fMeasureText) - ((r10.length() - r8.length()) * f17);
                    i13 = i15;
                    i14 = i13;
                    f15 = fMeasureText;
                    f16 = f15;
                } else {
                    dVarW.f59897a = str.substring(i13, i14 - 1).trim();
                    dVarW.f59898b = ((f15 - f16) - ((r8.length() - r14.length()) * f17)) - f17;
                    f15 = f16;
                    i13 = i14;
                }
            }
        }
        if (f15 > 0.0f) {
            i12++;
            d dVarW2 = w(i12);
            dVarW2.f59897a = str.substring(i13);
            dVarW2.f59898b = f15;
        }
        return this.f59877L.subList(0, i12);
    }

    /* compiled from: TextLayer.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f59897a;

        /* renamed from: b, reason: collision with root package name */
        public float f59898b;

        public d() {
            this.f59897a = "";
            this.f59898b = 0.0f;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
