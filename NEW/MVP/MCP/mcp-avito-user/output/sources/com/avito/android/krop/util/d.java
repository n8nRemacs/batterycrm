package com.avito.android.krop.util;

import Y41.q;
import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: KRect.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/util/d;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f174852a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f174853b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f174854c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c f174855d;

    /* compiled from: KRect.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/krop/util/c;", "p1", "p2", "p3", "", "invoke", "(Lcom/avito/android/krop/util/c;Lcom/avito/android/krop/util/c;Lcom/avito/android/krop/util/c;)F", "triangleSquare"}, k = 3, mv = {1, 4, 0})
    public static final class a extends N implements q<c, c, c, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f174856l = new a();

        public a() {
            super(3);
        }

        public static float a(@k c cVar, @k c cVar2, @k c cVar3) {
            float f12 = cVar2.f174850a;
            float f13 = cVar.f174850a;
            float f14 = cVar3.f174851b;
            float f15 = cVar.f174851b;
            return Math.abs(((f14 - f15) * (f12 - f13)) - ((cVar2.f174851b - f15) * (cVar3.f174850a - f13))) / 2;
        }

        @Override // Y41.q
        public final /* bridge */ /* synthetic */ Float invoke(c cVar, c cVar2, c cVar3) {
            return Float.valueOf(a(cVar, cVar2, cVar3));
        }
    }

    public d(@k c cVar, @k c cVar2, @k c cVar3, @k c cVar4) {
        this.f174852a = cVar;
        this.f174853b = cVar2;
        this.f174854c = cVar3;
        this.f174855d = cVar4;
    }

    @k
    public final c a() {
        c cVar = this.f174853b;
        float f12 = cVar.f174850a;
        c cVar2 = this.f174855d;
        float f13 = 2;
        return new c((f12 + cVar2.f174850a) / f13, (cVar.f174851b + cVar2.f174851b) / f13);
    }

    @k
    public final List<com.avito.android.krop.util.a> b() {
        c cVar = this.f174852a;
        c cVar2 = this.f174853b;
        com.avito.android.krop.util.a aVar = new com.avito.android.krop.util.a(cVar, cVar2);
        c cVar3 = this.f174854c;
        com.avito.android.krop.util.a aVar2 = new com.avito.android.krop.util.a(cVar2, cVar3);
        c cVar4 = this.f174855d;
        return C42745f0.U(aVar, aVar2, new com.avito.android.krop.util.a(cVar3, cVar4), new com.avito.android.krop.util.a(cVar4, cVar));
    }

    public final boolean c(@k c cVar) {
        a aVar = a.f174856l;
        c cVar2 = this.f174852a;
        c cVar3 = this.f174853b;
        c cVar4 = this.f174855d;
        aVar.getClass();
        float fA2 = a.a(cVar2, cVar3, cVar4) * 2;
        float fA3 = a.a(cVar2, cVar3, cVar) + a.a(cVar2, cVar4, cVar);
        c cVar5 = this.f174854c;
        return Math.abs(fA2 - ((fA3 + a.a(cVar4, cVar5, cVar)) + a.a(cVar3, cVar5, cVar))) < ((float) 10);
    }

    public final boolean d(@k d dVar) {
        return c(dVar.f174852a) && c(dVar.f174853b) && c(dVar.f174855d) && c(dVar.f174854c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f174852a, dVar.f174852a) && L.f(this.f174853b, dVar.f174853b) && L.f(this.f174854c, dVar.f174854c) && L.f(this.f174855d, dVar.f174855d);
    }

    public final int hashCode() {
        c cVar = this.f174852a;
        int iHashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        c cVar2 = this.f174853b;
        int iHashCode2 = (iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        c cVar3 = this.f174854c;
        int iHashCode3 = (iHashCode2 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31;
        c cVar4 = this.f174855d;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "KRect(leftTop=" + this.f174852a + ", rightTop=" + this.f174853b + ", rightBottom=" + this.f174854c + ", leftBottom=" + this.f174855d + ")";
    }
}
