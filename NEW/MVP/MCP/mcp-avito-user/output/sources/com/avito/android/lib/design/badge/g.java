package com.avito.android.lib.design.badge;

import PK0.n;
import VU.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/badge/g;", "", "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f178395r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final n f178396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f178398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f178399d;

    /* renamed from: e, reason: collision with root package name */
    public final float f178400e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C35763c0 f178401f;

    /* renamed from: g, reason: collision with root package name */
    public final int f178402g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C35763c0 f178403h;

    /* renamed from: i, reason: collision with root package name */
    public final int f178404i;

    /* renamed from: j, reason: collision with root package name */
    public final int f178405j;

    /* renamed from: k, reason: collision with root package name */
    public final float f178406k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final VU.d f178407l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final VU.d f178408m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final c f178409n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final b f178410o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f178411p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f178412q;

    /* compiled from: BadgeStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/badge/g$a;", "LLV/c;", "Lcom/avito/android/lib/design/badge/g;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<g> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static g b(int i12, @k Context context) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178964e);
            g gVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return gVarC;
        }

        @k
        public static g c(@k TypedArray typedArray, @k Context context) {
            ColorStateList colorStateListA = x.a(typedArray, context, 1);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            c cVar = new c(typedArray.getInteger(42, 0), typedArray.getFloat(43, 0.0f), typedArray.getFloat(44, 0.0f), typedArray.getFloat(38, 0.0f), typedArray.getFloat(40, 0.0f), typedArray.getFloat(39, 0.0f), typedArray.getFloat(41, 0.0f));
            long integer = typedArray.getInteger(28, 0);
            b bVar = new b(integer, typedArray.getInteger(27, 0), typedArray.getInteger(32, 0), typedArray.getFloat(26, 0.0f), typedArray.getFloat(35, 0.0f), typedArray.getFloat(33, 0.0f), typedArray.getFloat(34, 0.0f), typedArray.getFloat(30, 0.0f), typedArray.getFloat(31, 0.0f), typedArray.getFloat(29, 0.0f));
            int resourceId = typedArray.getResourceId(0, 0);
            com.avito.android.lib.design.text_view.d.f180938a.getClass();
            n nVarA = com.avito.android.lib.design.text_view.d.a(resourceId, context);
            if (c35763c0B == null) {
                c35763c0B = nVarA.f12988b;
            }
            n nVarA2 = n.a(nVarA, null, c35763c0B, null, null, null, null, null, null, null, 8189);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
            int integer2 = typedArray.getInteger(6, 0);
            float dimension = typedArray.getDimension(47, 0.0f);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 24);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(46, 0);
            ColorStateList colorStateListA3 = x.a(typedArray, context, 45);
            C35763c0 c35763c0B3 = colorStateListA3 != null ? C35771d0.b(colorStateListA3) : null;
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(4, 0);
            float dimension2 = typedArray.getDimension(25, 0.0f);
            d.a aVar = VU.d.f17172e;
            int resourceId2 = typedArray.getResourceId(37, 0);
            aVar.getClass();
            return new g(nVarA2, dimensionPixelSize, dimensionPixelSize2, integer2, dimension, c35763c0B2, dimensionPixelOffset, c35763c0B3, dimensionPixelSize3, dimensionPixelSize4, dimension2, d.a.b(resourceId2, context), d.a.b(typedArray.getResourceId(36, 0), context), cVar, bVar, integer > 0, resourceId != 0);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    /* compiled from: BadgeStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/badge/g$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f178413a;

        /* renamed from: b, reason: collision with root package name */
        public final long f178414b;

        /* renamed from: c, reason: collision with root package name */
        public final int f178415c;

        /* renamed from: d, reason: collision with root package name */
        public final float f178416d;

        /* renamed from: e, reason: collision with root package name */
        public final float f178417e;

        /* renamed from: f, reason: collision with root package name */
        public final float f178418f;

        /* renamed from: g, reason: collision with root package name */
        public final float f178419g;

        /* renamed from: h, reason: collision with root package name */
        public final float f178420h;

        /* renamed from: i, reason: collision with root package name */
        public final float f178421i;

        /* renamed from: j, reason: collision with root package name */
        public final float f178422j;

        public b() {
            this(0L, 0L, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1023, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f178413a == bVar.f178413a && this.f178414b == bVar.f178414b && this.f178415c == bVar.f178415c && Float.compare(this.f178416d, bVar.f178416d) == 0 && Float.compare(this.f178417e, bVar.f178417e) == 0 && Float.compare(this.f178418f, bVar.f178418f) == 0 && Float.compare(this.f178419g, bVar.f178419g) == 0 && Float.compare(this.f178420h, bVar.f178420h) == 0 && Float.compare(this.f178421i, bVar.f178421i) == 0 && Float.compare(this.f178422j, bVar.f178422j) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f178422j) + r.d(this.f178421i, r.d(this.f178420h, r.d(this.f178419g, r.d(this.f178418f, r.d(this.f178417e, r.d(this.f178416d, r.e(this.f178415c, r.g(Long.hashCode(this.f178413a) * 31, 31, this.f178414b), 31), 31), 31), 31), 31), 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PulsationAnimation(animationDuration=");
            sb2.append(this.f178413a);
            sb2.append(", delay=");
            sb2.append(this.f178414b);
            sb2.append(", repeatCount=");
            sb2.append(this.f178415c);
            sb2.append(", damping=");
            sb2.append(this.f178416d);
            sb2.append(", stiffness=");
            sb2.append(this.f178417e);
            sb2.append(", scaleFromValue=");
            sb2.append(this.f178418f);
            sb2.append(", scaleToValue=");
            sb2.append(this.f178419g);
            sb2.append(", opacityFromValue=");
            sb2.append(this.f178420h);
            sb2.append(", opacityToValue=");
            sb2.append(this.f178421i);
            sb2.append(", expansionFraction=");
            return r.k(')', this.f178422j, sb2);
        }

        public b(long j12, long j13, int i12, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
            this.f178413a = j12;
            this.f178414b = j13;
            this.f178415c = i12;
            this.f178416d = f12;
            this.f178417e = f13;
            this.f178418f = f14;
            this.f178419g = f15;
            this.f178420h = f16;
            this.f178421i = f17;
            this.f178422j = f18;
        }

        public /* synthetic */ b(long j12, long j13, int i12, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 0L : j12, (i13 & 2) == 0 ? j13 : 0L, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? 0.0f : f12, (i13 & 16) != 0 ? 0.0f : f13, (i13 & 32) != 0 ? 0.0f : f14, (i13 & 64) != 0 ? 0.0f : f15, (i13 & 128) != 0 ? 0.0f : f16, (i13 & 256) != 0 ? 0.0f : f17, (i13 & 512) == 0 ? f18 : 0.0f);
        }
    }

    /* compiled from: BadgeStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/badge/g$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f178423a;

        /* renamed from: b, reason: collision with root package name */
        public final float f178424b;

        /* renamed from: c, reason: collision with root package name */
        public final float f178425c;

        /* renamed from: d, reason: collision with root package name */
        public final float f178426d;

        /* renamed from: e, reason: collision with root package name */
        public final float f178427e;

        /* renamed from: f, reason: collision with root package name */
        public final float f178428f;

        /* renamed from: g, reason: collision with root package name */
        public final float f178429g;

        public c() {
            this(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 127, null);
        }

        public static c a(c cVar) {
            float f12 = cVar.f178424b;
            float f13 = cVar.f178425c;
            float f14 = cVar.f178426d;
            float f15 = cVar.f178427e;
            float f16 = cVar.f178428f;
            float f17 = cVar.f178429g;
            cVar.getClass();
            return new c(0L, f12, f13, f14, f15, f16, f17);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f178423a == cVar.f178423a && Float.compare(this.f178424b, cVar.f178424b) == 0 && Float.compare(this.f178425c, cVar.f178425c) == 0 && Float.compare(this.f178426d, cVar.f178426d) == 0 && Float.compare(this.f178427e, cVar.f178427e) == 0 && Float.compare(this.f178428f, cVar.f178428f) == 0 && Float.compare(this.f178429g, cVar.f178429g) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f178429g) + r.d(this.f178428f, r.d(this.f178427e, r.d(this.f178426d, r.d(this.f178425c, r.d(this.f178424b, Long.hashCode(this.f178423a) * 31, 31), 31), 31), 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAnimation(animationDuration=");
            sb2.append(this.f178423a);
            sb2.append(", scaleFromValue=");
            sb2.append(this.f178424b);
            sb2.append(", scaleToValue=");
            sb2.append(this.f178425c);
            sb2.append(", bezierX1=");
            sb2.append(this.f178426d);
            sb2.append(", bezierY1=");
            sb2.append(this.f178427e);
            sb2.append(", bezierX2=");
            sb2.append(this.f178428f);
            sb2.append(", bezierY2=");
            return r.k(')', this.f178429g, sb2);
        }

        public c(long j12, float f12, float f13, float f14, float f15, float f16, float f17) {
            this.f178423a = j12;
            this.f178424b = f12;
            this.f178425c = f13;
            this.f178426d = f14;
            this.f178427e = f15;
            this.f178428f = f16;
            this.f178429g = f17;
        }

        public /* synthetic */ c(long j12, float f12, float f13, float f14, float f15, float f16, float f17, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? 0.0f : f12, (i12 & 4) != 0 ? 0.0f : f13, (i12 & 8) != 0 ? 0.0f : f14, (i12 & 16) != 0 ? 0.0f : f15, (i12 & 32) != 0 ? 0.0f : f16, (i12 & 64) == 0 ? f17 : 0.0f);
        }
    }

    public g(@l n nVar, int i12, int i13, int i14, float f12, @l C35763c0 c35763c0, int i15, @l C35763c0 c35763c02, int i16, int i17, float f13, @l VU.d dVar, @l VU.d dVar2, @k c cVar, @k b bVar, boolean z12, boolean z13) {
        this.f178396a = nVar;
        this.f178397b = i12;
        this.f178398c = i13;
        this.f178399d = i14;
        this.f178400e = f12;
        this.f178401f = c35763c0;
        this.f178402g = i15;
        this.f178403h = c35763c02;
        this.f178404i = i16;
        this.f178405j = i17;
        this.f178406k = f13;
        this.f178407l = dVar;
        this.f178408m = dVar2;
        this.f178409n = cVar;
        this.f178410o = bVar;
        this.f178411p = z12;
        this.f178412q = z13;
    }

    public static g a(g gVar, n nVar, int i12, int i13, C35763c0 c35763c0, int i14, C35763c0 c35763c02, int i15, int i16, float f12, c cVar, int i17) {
        n nVar2 = (i17 & 1) != 0 ? gVar.f178396a : nVar;
        int i18 = (i17 & 2) != 0 ? gVar.f178397b : i12;
        int i19 = (i17 & 4) != 0 ? gVar.f178398c : i13;
        int i22 = gVar.f178399d;
        float f13 = gVar.f178400e;
        C35763c0 c35763c03 = (i17 & 32) != 0 ? gVar.f178401f : c35763c0;
        int i23 = (i17 & 64) != 0 ? gVar.f178402g : i14;
        C35763c0 c35763c04 = (i17 & 128) != 0 ? gVar.f178403h : c35763c02;
        int i24 = (i17 & 256) != 0 ? gVar.f178404i : i15;
        int i25 = (i17 & 512) != 0 ? gVar.f178405j : i16;
        float f14 = (i17 & 1024) != 0 ? gVar.f178406k : f12;
        VU.d dVar = gVar.f178407l;
        VU.d dVar2 = gVar.f178408m;
        c cVar2 = (i17 & 8192) != 0 ? gVar.f178409n : cVar;
        b bVar = gVar.f178410o;
        boolean z12 = gVar.f178411p;
        boolean z13 = gVar.f178412q;
        gVar.getClass();
        return new g(nVar2, i18, i19, i22, f13, c35763c03, i23, c35763c04, i24, i25, f14, dVar, dVar2, cVar2, bVar, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f178396a, gVar.f178396a) && this.f178397b == gVar.f178397b && this.f178398c == gVar.f178398c && this.f178399d == gVar.f178399d && Float.compare(this.f178400e, gVar.f178400e) == 0 && L.f(this.f178401f, gVar.f178401f) && this.f178402g == gVar.f178402g && L.f(this.f178403h, gVar.f178403h) && this.f178404i == gVar.f178404i && this.f178405j == gVar.f178405j && Float.compare(this.f178406k, gVar.f178406k) == 0 && L.f(this.f178407l, gVar.f178407l) && L.f(this.f178408m, gVar.f178408m) && L.f(this.f178409n, gVar.f178409n) && L.f(this.f178410o, gVar.f178410o) && this.f178411p == gVar.f178411p && this.f178412q == gVar.f178412q;
    }

    public final int hashCode() {
        n nVar = this.f178396a;
        int iD2 = r.d(this.f178400e, r.e(this.f178399d, r.e(this.f178398c, r.e(this.f178397b, (nVar == null ? 0 : nVar.hashCode()) * 31, 31), 31), 31), 31);
        C35763c0 c35763c0 = this.f178401f;
        int iE2 = r.e(this.f178402g, (iD2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31, 31);
        C35763c0 c35763c02 = this.f178403h;
        int iD3 = r.d(this.f178406k, r.e(this.f178405j, r.e(this.f178404i, (iE2 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31), 31), 31);
        VU.d dVar = this.f178407l;
        int iHashCode = (iD3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        VU.d dVar2 = this.f178408m;
        return Boolean.hashCode(this.f178412q) + r.i((this.f178410o.hashCode() + ((this.f178409n.hashCode() + ((iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f178411p);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeStyle(titleStyle=");
        sb2.append(this.f178396a);
        sb2.append(", titlePaddingStart=");
        sb2.append(this.f178397b);
        sb2.append(", titlePaddingEnd=");
        sb2.append(this.f178398c);
        sb2.append(", lineCount=");
        sb2.append(this.f178399d);
        sb2.append(", textCompensation=");
        sb2.append(this.f178400e);
        sb2.append(", badgeColor=");
        sb2.append(this.f178401f);
        sb2.append(", strokeWidth=");
        sb2.append(this.f178402g);
        sb2.append(", strokeColor=");
        sb2.append(this.f178403h);
        sb2.append(", minWidth=");
        sb2.append(this.f178404i);
        sb2.append(", minHeight=");
        sb2.append(this.f178405j);
        sb2.append(", cornerSize=");
        sb2.append(this.f178406k);
        sb2.append(", upperShadow=");
        sb2.append(this.f178407l);
        sb2.append(", bottomShadow=");
        sb2.append(this.f178408m);
        sb2.append(", showAnimation=");
        sb2.append(this.f178409n);
        sb2.append(", pulsationAnimation=");
        sb2.append(this.f178410o);
        sb2.append(", pulsationEnabled=");
        sb2.append(this.f178411p);
        sb2.append(", textEnabled=");
        return r.x(sb2, this.f178412q, ')');
    }

    public /* synthetic */ g(n nVar, int i12, int i13, int i14, float f12, C35763c0 c35763c0, int i15, C35763c0 c35763c02, int i16, int i17, float f13, VU.d dVar, VU.d dVar2, c cVar, b bVar, boolean z12, boolean z13, int i18, C42822w c42822w) {
        this((i18 & 1) != 0 ? null : nVar, (i18 & 2) != 0 ? 0 : i12, (i18 & 4) != 0 ? 0 : i13, (i18 & 8) != 0 ? 0 : i14, (i18 & 16) != 0 ? 0.0f : f12, (i18 & 32) != 0 ? null : c35763c0, (i18 & 64) != 0 ? 0 : i15, (i18 & 128) != 0 ? null : c35763c02, (i18 & 256) != 0 ? 0 : i16, (i18 & 512) != 0 ? 0 : i17, (i18 & 1024) != 0 ? 0.0f : f13, (i18 & 2048) != 0 ? null : dVar, (i18 & 4096) != 0 ? null : dVar2, cVar, bVar, z12, z13);
    }
}
