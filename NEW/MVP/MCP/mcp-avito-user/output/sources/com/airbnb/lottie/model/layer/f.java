package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.H;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.parser.C27306j;
import com.airbnb.lottie.value.j;
import j.InterfaceC42153i;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeLayer.java */
/* loaded from: classes10.dex */
public class f extends b {

    /* renamed from: E, reason: collision with root package name */
    public final com.airbnb.lottie.animation.content.d f59860E;

    /* renamed from: F, reason: collision with root package name */
    public final c f59861F;

    /* renamed from: G, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.animation.keyframe.c f59862G;

    public f(B b12, Layer layer, c cVar, C27291k c27291k) {
        super(b12, layer);
        this.f59861F = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(b12, this, new l("__container", layer.f59774a, false), c27291k);
        this.f59860E = dVar;
        dVar.c(Collections.emptyList(), Collections.emptyList());
        C27306j c27306j = this.f59827q.f59797x;
        if (c27306j != null) {
            this.f59862G = new com.airbnb.lottie.animation.keyframe.c(this, this, c27306j);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, O2.e
    @InterfaceC42153i
    public final void a(ColorFilter colorFilter, @P j jVar) {
        super.a(colorFilter, jVar);
        PointF pointF = H.f59082a;
        com.airbnb.lottie.animation.keyframe.c cVar = this.f59862G;
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
        this.f59860E.e(rectF, this.f59825o, z12);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void l(@N Canvas canvas, Matrix matrix, int i12, @P com.airbnb.lottie.utils.b bVar) {
        com.airbnb.lottie.animation.keyframe.c cVar = this.f59862G;
        if (cVar != null) {
            bVar = cVar.a(matrix, i12);
        }
        this.f59860E.d(canvas, matrix, i12, bVar);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @P
    public final com.airbnb.lottie.model.content.a m() {
        com.airbnb.lottie.model.content.a aVar = this.f59827q.f59796w;
        return aVar != null ? aVar : this.f59861F.f59827q.f59796w;
    }

    @Override // com.airbnb.lottie.model.layer.b
    public final void q(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        this.f59860E.b(dVar, i12, arrayList, dVar2);
    }
}
