package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.collection.C20204c0;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.C27306j;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.airbnb.lottie.value.j;
import j.InterfaceC42167x;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* loaded from: classes10.dex */
public class c extends b {

    /* renamed from: E, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.a<Float, Float> f59839E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f59840F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f59841G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f59842H;

    /* renamed from: I, reason: collision with root package name */
    public final RectF f59843I;

    /* renamed from: J, reason: collision with root package name */
    public final OffscreenLayer f59844J;

    /* renamed from: K, reason: collision with root package name */
    public final OffscreenLayer.a f59845K;

    /* renamed from: L, reason: collision with root package name */
    public float f59846L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f59847M;

    /* renamed from: N, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.c f59848N;

    /* compiled from: CompositionLayer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59849a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f59849a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59849a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(B b12, Layer layer, List<Layer> list, C27291k c27291k) {
        int i12;
        b bVar;
        b cVar;
        super(b12, layer);
        this.f59840F = new ArrayList();
        this.f59841G = new RectF();
        this.f59842H = new RectF();
        this.f59843I = new RectF();
        this.f59844J = new OffscreenLayer();
        this.f59845K = new OffscreenLayer.a();
        this.f59847M = true;
        com.airbnb.lottie.model.animatable.b bVar2 = layer.f59792s;
        if (bVar2 != null) {
            com.airbnb.lottie.animation.keyframe.d dVarC = bVar2.c();
            this.f59839E = dVarC;
            f(dVarC);
            this.f59839E.a(this);
        } else {
            this.f59839E = null;
        }
        C20204c0 c20204c0 = new C20204c0(c27291k.f59591j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            int iOrdinal = layer2.f59778e.ordinal();
            if (iOrdinal == 0) {
                cVar = new c(b12, layer2, (List) c27291k.f59584c.get(layer2.f59780g), c27291k);
            } else if (iOrdinal == 1) {
                cVar = new g(b12, layer2);
            } else if (iOrdinal == 2) {
                cVar = new d(b12, layer2);
            } else if (iOrdinal == 3) {
                cVar = new e(b12, layer2);
            } else if (iOrdinal == 4) {
                cVar = new f(b12, layer2, this, c27291k);
            } else if (iOrdinal != 5) {
                com.airbnb.lottie.utils.e.b("Unknown layer type " + layer2.f59778e);
                cVar = null;
            } else {
                cVar = new h(b12, layer2);
            }
            if (cVar != null) {
                c20204c0.l(cVar.f59827q.f59777d, cVar);
                if (bVar3 != null) {
                    bVar3.f59830t = cVar;
                    bVar3 = null;
                } else {
                    this.f59840F.add(0, cVar);
                    int iOrdinal2 = layer2.f59794u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        bVar3 = cVar;
                    }
                }
            }
            size--;
        }
        for (i12 = 0; i12 < c20204c0.n(); i12++) {
            b bVar4 = (b) c20204c0.f(c20204c0.k(i12));
            if (bVar4 != null && (bVar = (b) c20204c0.f(bVar4.f59827q.f59779f)) != null) {
                bVar4.f59831u = bVar;
            }
        }
        C27306j c27306j = this.f59827q.f59797x;
        if (c27306j != null) {
            this.f59848N = new com.airbnb.lottie.animation.keyframe.c(this, this, c27306j);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, O2.e
    public final void a(ColorFilter colorFilter, @P j jVar) {
        super.a(colorFilter, jVar);
        if (colorFilter == H.f59107z) {
            q qVar = new q(jVar, null);
            this.f59839E = qVar;
            qVar.a(this);
            f(this.f59839E);
            return;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f59848N;
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
        super.e(rectF, matrix, z12);
        ArrayList arrayList = this.f59840F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f59841G;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).e(rectF2, this.f59825o, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void l(Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        Canvas canvasE;
        if (C27285e.f59567a) {
            C27285e.a("CompositionLayer#draw");
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f59848N;
        boolean z12 = false;
        boolean z13 = (bVar == null && cVar == null) ? false : true;
        B b12 = this.f59826p;
        boolean z14 = b12.f59057x;
        ArrayList arrayList = this.f59840F;
        if ((z14 && arrayList.size() > 1 && i12 != 255) || (z13 && b12.f59058y)) {
            z12 = true;
        }
        int i13 = z12 ? 255 : i12;
        if (cVar != null) {
            bVar = cVar.a(matrix, i13);
        }
        boolean z15 = this.f59847M;
        RectF rectF = this.f59842H;
        Layer layer = this.f59827q;
        if (z15 || !"__container".equals(layer.f59776c)) {
            rectF.set(0.0f, 0.0f, layer.f59788o, layer.f59789p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                RectF rectF2 = this.f59843I;
                bVar2.e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        OffscreenLayer offscreenLayer = this.f59844J;
        if (z12) {
            OffscreenLayer.a aVar = this.f59845K;
            aVar.f60091b = null;
            aVar.f60090a = i12;
            if (bVar != null) {
                if (Color.alpha(bVar.f60098d) > 0) {
                    aVar.f60091b = bVar;
                } else {
                    aVar.f60091b = null;
                }
                bVar = null;
            }
            canvasE = offscreenLayer.e(canvas, rectF, aVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).d(canvasE, matrix, i13, bVar);
            }
        }
        if (z12) {
            offscreenLayer.c();
        }
        canvas.restore();
        if (C27285e.f59567a) {
            C27285e.b("CompositionLayer#draw");
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void q(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f59840F;
            if (i13 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i13)).b(dVar, i12, arrayList, dVar2);
            i13++;
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void r(boolean z12) {
        super.r(z12);
        Iterator it = this.f59840F.iterator();
        while (it.hasNext()) {
            ((b) it.next()).r(z12);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void s(@InterfaceC42167x float f12) {
        if (C27285e.f59567a) {
            C27285e.a("CompositionLayer#setProgress");
        }
        this.f59846L = f12;
        super.s(f12);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f59839E;
        Layer layer = this.f59827q;
        if (aVar != null) {
            C27291k c27291k = this.f59826p.f59035b;
            f12 = ((aVar.f().floatValue() * layer.f59775b.f59595n) - layer.f59775b.f59593l) / ((c27291k.f59594m - c27291k.f59593l) + 0.01f);
        }
        if (this.f59839E == null) {
            C27291k c27291k2 = layer.f59775b;
            f12 -= layer.f59787n / (c27291k2.f59594m - c27291k2.f59593l);
        }
        if (layer.f59786m != 0.0f && !"__container".equals(layer.f59776c)) {
            f12 /= layer.f59786m;
        }
        ArrayList arrayList = this.f59840F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).s(f12);
        }
        if (C27285e.f59567a) {
            C27285e.b("CompositionLayer#setProgress");
        }
    }
}
