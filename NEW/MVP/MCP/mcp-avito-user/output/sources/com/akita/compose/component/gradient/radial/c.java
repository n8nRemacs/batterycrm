package com.akita.compose.component.gradient.radial;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import kotlin.Metadata;

/* compiled from: GradientRadialStyle.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/gradient/radial/c;", "", "gradient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f61659a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f61660b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f61661c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f61662d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final p f61663e;

    /* renamed from: f, reason: collision with root package name */
    public final float f61664f;

    /* renamed from: g, reason: collision with root package name */
    public final float f61665g;

    /* renamed from: h, reason: collision with root package name */
    public final float f61666h;

    /* renamed from: i, reason: collision with root package name */
    public final float f61667i;

    public c(@k p pVar, @k p pVar2, @k p pVar3, @k p pVar4, @k p pVar5, float f12, float f13, float f14, float f15) {
        this.f61659a = pVar;
        this.f61660b = pVar2;
        this.f61661c = pVar3;
        this.f61662d = pVar4;
        this.f61663e = pVar5;
        this.f61664f = f12;
        this.f61665g = f13;
        this.f61666h = f14;
        this.f61667i = f15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f61659a.equals(cVar.f61659a) && this.f61660b.equals(cVar.f61660b) && this.f61661c.equals(cVar.f61661c) && this.f61662d.equals(cVar.f61662d) && this.f61663e.equals(cVar.f61663e) && Float.compare(this.f61664f, cVar.f61664f) == 0 && Float.compare(this.f61665g, cVar.f61665g) == 0 && Float.compare(this.f61666h, cVar.f61666h) == 0 && Float.compare(this.f61667i, cVar.f61667i) == 0 && Float.compare(0.8f, 0.8f) == 0 && Float.compare(0.6f, 0.6f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.6f) + r.d(0.8f, r.d(this.f61667i, r.d(this.f61666h, r.d(this.f61665g, r.d(this.f61664f, s.b(this.f61663e, s.b(this.f61662d, s.b(this.f61661c, s.b(this.f61660b, this.f61659a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GradientRadialStyle(primaryColorStart=");
        sb2.append(this.f61659a);
        sb2.append(", primaryColorEnd=");
        sb2.append(this.f61660b);
        sb2.append(", secondaryColorStart=");
        sb2.append(this.f61661c);
        sb2.append(", secondaryColorEnd=");
        sb2.append(this.f61662d);
        sb2.append(", backgroundColor=");
        sb2.append(this.f61663e);
        sb2.append(", primaryCenterX=");
        sb2.append(this.f61664f);
        sb2.append(", primaryCenterY=");
        sb2.append(this.f61665g);
        sb2.append(", secondaryCenterX=");
        sb2.append(this.f61666h);
        sb2.append(", secondaryCenterY=");
        return G.d(this.f61667i, ", primaryRadius=0.8, secondaryRadius=0.6)", sb2);
    }
}
