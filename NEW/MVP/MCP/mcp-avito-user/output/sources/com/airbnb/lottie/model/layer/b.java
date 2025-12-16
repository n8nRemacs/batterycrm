package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.collection.AbstractC20248z;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.M;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.model.animatable.n;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.value.j;
import com.airbnb.lottie.value.k;
import j.InterfaceC42153i;
import j.InterfaceC42167x;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseLayer.java */
/* loaded from: classes10.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, a.b, O2.e {

    /* renamed from: A, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.a f59807A;

    /* renamed from: B, reason: collision with root package name */
    public float f59808B;

    /* renamed from: C, reason: collision with root package name */
    @P
    public BlurMaskFilter f59809C;

    /* renamed from: D, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.a f59810D;

    /* renamed from: a, reason: collision with root package name */
    public final Path f59811a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f59812b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f59813c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59814d = new com.airbnb.lottie.animation.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59815e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59816f;

    /* renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59817g;

    /* renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59818h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f59819i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f59820j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f59821k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f59822l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f59823m;

    /* renamed from: n, reason: collision with root package name */
    public final String f59824n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f59825o;

    /* renamed from: p, reason: collision with root package name */
    public final B f59826p;

    /* renamed from: q, reason: collision with root package name */
    public final Layer f59827q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.h f59828r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.d f59829s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public b f59830t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public b f59831u;

    /* renamed from: v, reason: collision with root package name */
    public List<b> f59832v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f59833w;

    /* renamed from: x, reason: collision with root package name */
    public final p f59834x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f59835y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f59836z;

    /* compiled from: BaseLayer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59837a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f59838b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f59838b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59838b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59838b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59838b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f59837a = iArr2;
            try {
                iArr2[4] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59837a[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59837a[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59837a[2] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59837a[3] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f59837a[5] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f59837a[6] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(B b12, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f59815e = new com.airbnb.lottie.animation.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f59816f = new com.airbnb.lottie.animation.a(mode2);
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f59817g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        com.airbnb.lottie.animation.a aVar2 = new com.airbnb.lottie.animation.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f59818h = aVar2;
        this.f59819i = new RectF();
        this.f59820j = new RectF();
        this.f59821k = new RectF();
        this.f59822l = new RectF();
        this.f59823m = new RectF();
        this.f59825o = new Matrix();
        this.f59833w = new ArrayList();
        this.f59835y = true;
        this.f59808B = 0.0f;
        this.f59826p = b12;
        this.f59827q = layer;
        this.f59824n = layer.f59776c.concat("#draw");
        if (layer.f59794u == Layer.MatteType.f59804c) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        n nVar = layer.f59782i;
        nVar.getClass();
        p pVar = new p(nVar);
        this.f59834x = pVar;
        pVar.b(this);
        List<Mask> list = layer.f59781h;
        if (list != null && !list.isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(list);
            this.f59828r = hVar;
            Iterator it = hVar.f59331a.iterator();
            while (it.hasNext()) {
                ((com.airbnb.lottie.animation.keyframe.a) it.next()).a(this);
            }
            Iterator it2 = this.f59828r.f59332b.iterator();
            while (it2.hasNext()) {
                com.airbnb.lottie.animation.keyframe.a<?, ?> aVar3 = (com.airbnb.lottie.animation.keyframe.a) it2.next();
                f(aVar3);
                aVar3.a(this);
            }
        }
        Layer layer2 = this.f59827q;
        if (layer2.f59793t.isEmpty()) {
            if (true != this.f59835y) {
                this.f59835y = true;
                this.f59826p.invalidateSelf();
                return;
            }
            return;
        }
        com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(layer2.f59793t);
        this.f59829s = dVar;
        dVar.f59308b = true;
        dVar.a(new a.b() { // from class: com.airbnb.lottie.model.layer.a
            @Override // com.airbnb.lottie.animation.keyframe.a.b
            public final void g() {
                b bVar = this.f59806a;
                boolean z12 = bVar.f59829s.m() == 1.0f;
                if (z12 != bVar.f59835y) {
                    bVar.f59835y = z12;
                    bVar.f59826p.invalidateSelf();
                }
            }
        });
        boolean z12 = this.f59829s.f().floatValue() == 1.0f;
        if (z12 != this.f59835y) {
            this.f59835y = z12;
            this.f59826p.invalidateSelf();
        }
        f(this.f59829s);
    }

    @Override // O2.e
    @InterfaceC42153i
    public void a(ColorFilter colorFilter, @P j jVar) {
        this.f59834x.c(colorFilter, jVar);
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        b bVar = this.f59830t;
        Layer layer = this.f59827q;
        if (bVar != null) {
            String str = bVar.f59827q.f59776c;
            O2.d dVar3 = new O2.d(dVar2);
            dVar3.f11942a.add(str);
            if (dVar.a(i12, this.f59830t.f59827q.f59776c)) {
                b bVar2 = this.f59830t;
                O2.d dVar4 = new O2.d(dVar3);
                dVar4.f11943b = bVar2;
                arrayList.add(dVar4);
            }
            if (dVar.c(i12, this.f59830t.f59827q.f59776c) && dVar.d(i12, layer.f59776c)) {
                this.f59830t.q(dVar, dVar.b(i12, this.f59830t.f59827q.f59776c) + i12, arrayList, dVar3);
            }
        }
        if (dVar.c(i12, layer.f59776c)) {
            String str2 = layer.f59776c;
            if (!"__container".equals(str2)) {
                O2.d dVar5 = new O2.d(dVar2);
                dVar5.f11942a.add(str2);
                if (dVar.a(i12, str2)) {
                    O2.d dVar6 = new O2.d(dVar5);
                    dVar6.f11943b = this;
                    arrayList.add(dVar6);
                }
                dVar2 = dVar5;
            }
            if (dVar.d(i12, str2)) {
                q(dVar, dVar.b(i12, str2) + i12, arrayList, dVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc  */
    @Override // com.airbnb.lottie.animation.content.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24, @j.P com.airbnb.lottie.utils.b r25) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.b.d(android.graphics.Canvas, android.graphics.Matrix, int, com.airbnb.lottie.utils.b):void");
    }

    @Override // com.airbnb.lottie.animation.content.e
    @InterfaceC42153i
    public void e(RectF rectF, Matrix matrix, boolean z12) {
        this.f59819i.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        Matrix matrix2 = this.f59825o;
        matrix2.set(matrix);
        if (z12) {
            List<b> list = this.f59832v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.f59832v.get(size).f59834x.e());
                }
            } else {
                b bVar = this.f59831u;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f59834x.e());
                }
            }
        }
        matrix2.preConcat(this.f59834x.e());
    }

    public final void f(@P com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f59833w.add(aVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59826p.invalidateSelf();
    }

    public final void j() {
        if (this.f59832v != null) {
            return;
        }
        if (this.f59831u == null) {
            this.f59832v = Collections.emptyList();
            return;
        }
        this.f59832v = new ArrayList();
        for (b bVar = this.f59831u; bVar != null; bVar = bVar.f59831u) {
            this.f59832v.add(bVar);
        }
    }

    public final void k(Canvas canvas) {
        if (C27285e.f59567a) {
            C27285e.a("Layer#clearLayer");
        }
        RectF rectF = this.f59819i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f59818h);
        if (C27285e.f59567a) {
            C27285e.b("Layer#clearLayer");
        }
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar);

    @P
    public com.airbnb.lottie.model.content.a m() {
        return this.f59827q.f59796w;
    }

    public final boolean n() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.f59828r;
        return (hVar == null || hVar.f59331a.isEmpty()) ? false : true;
    }

    public final void o(float f12) {
        M m12 = this.f59826p.f59035b.f59582a;
        String str = this.f59827q.f59776c;
        if (!m12.f59148a) {
            return;
        }
        HashMap map = m12.f59150c;
        com.airbnb.lottie.utils.i iVar = (com.airbnb.lottie.utils.i) map.get(str);
        if (iVar == null) {
            iVar = new com.airbnb.lottie.utils.i();
            map.put(str, iVar);
        }
        int i12 = iVar.f60121a + 1;
        iVar.f60121a = i12;
        if (i12 == Integer.MAX_VALUE) {
            iVar.f60121a = i12 / 2;
        }
        if (!str.equals("__container")) {
            return;
        }
        Iterator it = m12.f59149b.iterator();
        while (true) {
            AbstractC20248z abstractC20248z = (AbstractC20248z) it;
            if (!abstractC20248z.hasNext()) {
                return;
            } else {
                ((M.b) abstractC20248z.next()).a();
            }
        }
    }

    public final void p(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f59833w.remove(aVar);
    }

    public void r(boolean z12) {
        if (z12 && this.f59807A == null) {
            this.f59807A = new com.airbnb.lottie.animation.a();
        }
        this.f59836z = z12;
    }

    public void s(@InterfaceC42167x float f12) {
        if (C27285e.f59567a) {
            C27285e.a("BaseLayer#setProgress");
            C27285e.a("BaseLayer#setProgress.transform");
        }
        p pVar = this.f59834x;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = pVar.f59366j;
        if (aVar != null) {
            aVar.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = pVar.f59369m;
        if (aVar2 != null) {
            aVar2.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = pVar.f59370n;
        if (aVar3 != null) {
            aVar3.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVar4 = pVar.f59362f;
        if (aVar4 != null) {
            aVar4.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.a<?, PointF> aVar5 = pVar.f59363g;
        if (aVar5 != null) {
            aVar5.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.a<k, k> aVar6 = pVar.f59364h;
        if (aVar6 != null) {
            aVar6.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar7 = pVar.f59365i;
        if (aVar7 != null) {
            aVar7.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.d dVar = pVar.f59367k;
        if (dVar != null) {
            dVar.j(f12);
        }
        com.airbnb.lottie.animation.keyframe.d dVar2 = pVar.f59368l;
        if (dVar2 != null) {
            dVar2.j(f12);
        }
        if (C27285e.f59567a) {
            C27285e.b("BaseLayer#setProgress.transform");
        }
        com.airbnb.lottie.animation.keyframe.h hVar = this.f59828r;
        if (hVar != null) {
            if (C27285e.f59567a) {
                C27285e.a("BaseLayer#setProgress.mask");
            }
            int i12 = 0;
            while (true) {
                ArrayList arrayList = hVar.f59331a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                ((com.airbnb.lottie.animation.keyframe.a) arrayList.get(i12)).j(f12);
                i12++;
            }
            if (C27285e.f59567a) {
                C27285e.b("BaseLayer#setProgress.mask");
            }
        }
        if (this.f59829s != null) {
            if (C27285e.f59567a) {
                C27285e.a("BaseLayer#setProgress.inout");
            }
            this.f59829s.j(f12);
            if (C27285e.f59567a) {
                C27285e.b("BaseLayer#setProgress.inout");
            }
        }
        if (this.f59830t != null) {
            if (C27285e.f59567a) {
                C27285e.a("BaseLayer#setProgress.matte");
            }
            this.f59830t.s(f12);
            if (C27285e.f59567a) {
                C27285e.b("BaseLayer#setProgress.matte");
            }
        }
        boolean z12 = C27285e.f59567a;
        ArrayList arrayList2 = this.f59833w;
        if (z12) {
            C27285e.a("BaseLayer#setProgress.animations." + arrayList2.size());
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((com.airbnb.lottie.animation.keyframe.a) arrayList2.get(i13)).j(f12);
        }
        if (C27285e.f59567a) {
            C27285e.b("BaseLayer#setProgress.animations." + arrayList2.size());
            C27285e.b("BaseLayer#setProgress");
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    public void q(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
    }
}
