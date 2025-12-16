package com.avito.android.krop.util;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: KLine.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/util/a;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f174848a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f174849b;

    public a(@k c cVar, @k c cVar2) {
        this.f174848a = cVar;
        this.f174849b = cVar2;
    }

    @l
    public final c a(@k a aVar) {
        c cVar = this.f174848a;
        float f12 = cVar.f174850a;
        float f13 = cVar.f174851b;
        c cVar2 = this.f174849b;
        float f14 = cVar2.f174850a;
        float f15 = cVar2.f174851b;
        c cVar3 = aVar.f174848a;
        float f16 = cVar3.f174850a;
        float f17 = cVar3.f174851b;
        c cVar4 = aVar.f174849b;
        float f18 = f16 - f12;
        float f19 = f15 - f13;
        float f22 = f14 - f12;
        float f23 = cVar4.f174850a - f16;
        float f24 = ((f17 - f13) - ((f18 * f19) / f22)) / (((f23 * f19) / f22) - (cVar4.f174851b - f17));
        float f25 = 0;
        if (f24 >= f25) {
            float f26 = 1;
            if (f24 <= f26) {
                float f27 = ((f24 * f23) + f18) / f22;
                if (f27 >= f25 && f27 <= f26) {
                    return new c((f22 * f27) + f12, (f27 * f19) + f13);
                }
            }
        }
        return null;
    }

    public final float b() {
        c cVar = this.f174849b;
        float f12 = cVar.f174850a;
        c cVar2 = this.f174848a;
        float f13 = cVar2.f174850a;
        float f14 = (f12 - f13) * (f12 - f13);
        float f15 = cVar.f174851b;
        float f16 = cVar2.f174851b;
        return (float) Math.sqrt(r.c(f15, f16, f15 - f16, f14));
    }

    @k
    public final a c(@k c cVar) {
        c cVar2 = this.f174848a;
        float fB2 = new a(cVar2, cVar).b();
        c cVar3 = this.f174849b;
        float fB3 = new a(cVar3, cVar).b();
        float fB4 = b();
        float f12 = (((fB4 * fB4) + (fB3 * fB3)) - (fB2 * fB2)) / (2 * fB4);
        float f13 = fB4 - f12;
        float f14 = f13 / (f12 + f13);
        float f15 = cVar2.f174850a;
        float fC2 = r.c(cVar3.f174850a, f15, f14, f15);
        float f16 = cVar2.f174851b;
        return new a(cVar, new c(fC2, r.c(cVar3.f174851b, f16, f14, f16)));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f174848a, aVar.f174848a) && L.f(this.f174849b, aVar.f174849b);
    }

    public final int hashCode() {
        c cVar = this.f174848a;
        int iHashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        c cVar2 = this.f174849b;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "KLine(p1=" + this.f174848a + ", p2=" + this.f174849b + ")";
    }
}
