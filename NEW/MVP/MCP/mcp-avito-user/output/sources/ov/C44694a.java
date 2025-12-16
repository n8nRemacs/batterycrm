package oV;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.alignment.AvitoMapHorizontalAlignment;
import com.avito.android.avito_map.alignment.AvitoMapVerticalAlignment;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MapStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LoV/a;", "", "a", "b", "c", "d", "e", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C44694a {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final b f419779o = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f419780a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f419781b;

    /* renamed from: c, reason: collision with root package name */
    public final float f419782c;

    /* renamed from: d, reason: collision with root package name */
    public final float f419783d;

    /* renamed from: e, reason: collision with root package name */
    public final float f419784e;

    /* renamed from: f, reason: collision with root package name */
    public final int f419785f;

    /* renamed from: g, reason: collision with root package name */
    public final int f419786g;

    /* renamed from: h, reason: collision with root package name */
    public final int f419787h;

    /* renamed from: i, reason: collision with root package name */
    public final int f419788i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final AvitoMap.AnimationLength f419789j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final C12190a f419790k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Drawable f419791l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final e f419792m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final d f419793n;

    /* compiled from: MapStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LoV/a$b;", "LLV/c;", "LoV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oV.a$b */
    public static final class b implements LV.c<C44694a> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @k
        public static C44694a b(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            d.C12191a c12191a;
            Integer numValueOf;
            float f12 = typedArray.getFloat(3, 0.0f);
            float f13 = typedArray.getFloat(4, 0.0f);
            float f14 = typedArray.getFloat(11, 0.0f);
            b bVar = C44694a.f419779o;
            int resourceId = typedArray.getResourceId(2, 0);
            bVar.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId, d.n.f178953X);
            c cVar = new c(AvitoMapHorizontalAlignment.INSTANCE.from(typedArrayObtainStyledAttributes.getInt(0, 1)), AvitoMapVerticalAlignment.INSTANCE.from(typedArrayObtainStyledAttributes.getInt(2, 1)), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            typedArrayObtainStyledAttributes.recycle();
            d.C12191a c12191a2 = new d.C12191a(cVar);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(8, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(7, 0);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(5, 0);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(6, 0);
            AvitoMap.AnimationLength animationLengthFrom = AvitoMap.AnimationLength.INSTANCE.from(typedArray.getInt(0, 1));
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(typedArray.getResourceId(1, 0), d.n.f178976k);
            ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes2, context, 2);
            Integer numValueOf2 = colorStateListA != null ? Integer.valueOf(com.avito.android.lib.design.select.style.b.a(colorStateListA).f180281a) : null;
            ColorStateList colorStateListA2 = x.a(typedArrayObtainStyledAttributes2, context, 0);
            if (colorStateListA2 != null) {
                numValueOf = Integer.valueOf(com.avito.android.lib.design.select.style.b.a(colorStateListA2).f180281a);
                c12191a = c12191a2;
            } else {
                c12191a = c12191a2;
                numValueOf = null;
            }
            C12190a c12190a = new C12190a(numValueOf2, numValueOf, typedArrayObtainStyledAttributes2.getFloat(3, 0.0f), typedArrayObtainStyledAttributes2.getFloat(1, 0.0f));
            typedArrayObtainStyledAttributes2.recycle();
            Drawable drawable = typedArray.getDrawable(9);
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(typedArray.getResourceId(10, 0), d.n.f178987p0);
            ColorStateList colorStateListA3 = x.a(typedArrayObtainStyledAttributes3, context, 0);
            Integer numValueOf3 = colorStateListA3 != null ? Integer.valueOf(com.avito.android.lib.design.select.style.b.a(colorStateListA3).f180281a) : null;
            ColorStateList colorStateListA4 = x.a(typedArrayObtainStyledAttributes3, context, 1);
            e eVar = new e(typedArrayObtainStyledAttributes3.getFloat(2, 0.0f), numValueOf3, colorStateListA4 != null ? Integer.valueOf(com.avito.android.lib.design.select.style.b.a(colorStateListA4).f180281a) : null);
            typedArrayObtainStyledAttributes3.recycle();
            return new C44694a(null, null, f12, f13, f14, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, animationLengthFrom, c12190a, drawable, eVar, c12191a, 3, null);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178954Y);
            C44694a c44694aB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return c44694aB;
        }

        public b() {
        }
    }

    /* compiled from: MapStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoV/a$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oV.a$c */
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvitoMapHorizontalAlignment f419798a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AvitoMapVerticalAlignment f419799b;

        /* renamed from: c, reason: collision with root package name */
        public final int f419800c;

        /* renamed from: d, reason: collision with root package name */
        public final int f419801d;

        public c() {
            this(null, null, 0, 0, 15, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f419798a == cVar.f419798a && this.f419799b == cVar.f419799b && this.f419800c == cVar.f419800c && this.f419801d == cVar.f419801d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f419801d) + r.e(this.f419800c, (this.f419799b.hashCode() + (this.f419798a.hashCode() * 31)) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LogoAlignment(horizontalAlignment=");
            sb2.append(this.f419798a);
            sb2.append(", verticalAlignment=");
            sb2.append(this.f419799b);
            sb2.append(", verticalPadding=");
            sb2.append(this.f419800c);
            sb2.append(", horizontalPadding=");
            return r.t(sb2, this.f419801d, ')');
        }

        public c(@k AvitoMapHorizontalAlignment avitoMapHorizontalAlignment, @k AvitoMapVerticalAlignment avitoMapVerticalAlignment, int i12, int i13) {
            this.f419798a = avitoMapHorizontalAlignment;
            this.f419799b = avitoMapVerticalAlignment;
            this.f419800c = i12;
            this.f419801d = i13;
        }

        public /* synthetic */ c(AvitoMapHorizontalAlignment avitoMapHorizontalAlignment, AvitoMapVerticalAlignment avitoMapVerticalAlignment, int i12, int i13, int i14, C42822w c42822w) {
            this((i14 & 1) != 0 ? AvitoMapHorizontalAlignment.LEFT : avitoMapHorizontalAlignment, (i14 & 2) != 0 ? AvitoMapVerticalAlignment.BOTTOM : avitoMapVerticalAlignment, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        }
    }

    /* compiled from: MapStyle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LoV/a$d;", "", "<init>", "()V", "a", "LoV/a$d$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oV.a$d */
    public static abstract class d {

        /* compiled from: MapStyle.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoV/a$d$a;", "LoV/a$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oV.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C12191a extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final c f419802a;

            /* JADX WARN: Multi-variable type inference failed */
            public C12191a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12191a) && L.f(this.f419802a, ((C12191a) obj).f419802a);
            }

            public final int hashCode() {
                return this.f419802a.hashCode();
            }

            @k
            public final String toString() {
                return "Yandex(logoAlignment=" + this.f419802a + ')';
            }

            public /* synthetic */ C12191a(c cVar, int i12, C42822w c42822w) {
                if ((i12 & 1) != 0) {
                    cVar = new c(null, null, 0, 0, 15, null);
                }
                this(cVar);
            }

            public C12191a(@k c cVar) {
                super(null);
                this.f419802a = cVar;
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    public C44694a() {
        this(null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, null, null, null, null, 16383, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44694a)) {
            return false;
        }
        C44694a c44694a = (C44694a) obj;
        return L.f(this.f419780a, c44694a.f419780a) && L.f(this.f419781b, c44694a.f419781b) && Float.compare(this.f419782c, c44694a.f419782c) == 0 && Float.compare(this.f419783d, c44694a.f419783d) == 0 && Float.compare(this.f419784e, c44694a.f419784e) == 0 && this.f419785f == c44694a.f419785f && this.f419786g == c44694a.f419786g && this.f419787h == c44694a.f419787h && this.f419788i == c44694a.f419788i && this.f419789j == c44694a.f419789j && L.f(this.f419790k, c44694a.f419790k) && L.f(this.f419791l, c44694a.f419791l) && L.f(this.f419792m, c44694a.f419792m) && L.f(this.f419793n, c44694a.f419793n);
    }

    public final int hashCode() {
        Integer num = this.f419780a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f419781b;
        int iHashCode2 = (this.f419789j.hashCode() + r.e(this.f419788i, r.e(this.f419787h, r.e(this.f419786g, r.e(this.f419785f, r.d(this.f419784e, r.d(this.f419783d, r.d(this.f419782c, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31;
        C12190a c12190a = this.f419790k;
        int iHashCode3 = (iHashCode2 + (c12190a == null ? 0 : c12190a.hashCode())) * 31;
        Drawable drawable = this.f419791l;
        int iHashCode4 = (iHashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        e eVar = this.f419792m;
        return this.f419793n.hashCode() + ((iHashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "MapStyle(height=" + this.f419780a + ", width=" + this.f419781b + ", maxZoomLevel=" + this.f419782c + ", minZoomLevel=" + this.f419783d + ", zoomDelta=" + this.f419784e + ", paddingTop=" + this.f419785f + ", paddingRight=" + this.f419786g + ", paddingBottom=" + this.f419787h + ", paddingLeft=" + this.f419788i + ", animationLength=" + this.f419789j + ", circleLocationStyle=" + this.f419790k + ", pointLocationImage=" + this.f419791l + ", polylineStyle=" + this.f419792m + ", mapSpecific=" + this.f419793n + ')';
    }

    public C44694a(@l Integer num, @l Integer num2, float f12, float f13, float f14, int i12, int i13, int i14, int i15, @k AvitoMap.AnimationLength animationLength, @l C12190a c12190a, @l Drawable drawable, @l e eVar, @k d dVar) {
        this.f419780a = num;
        this.f419781b = num2;
        this.f419782c = f12;
        this.f419783d = f13;
        this.f419784e = f14;
        this.f419785f = i12;
        this.f419786g = i13;
        this.f419787h = i14;
        this.f419788i = i15;
        this.f419789j = animationLength;
        this.f419790k = c12190a;
        this.f419791l = drawable;
        this.f419792m = eVar;
        this.f419793n = dVar;
    }

    /* compiled from: MapStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoV/a$e;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oV.a$e */
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f419803a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f419804b;

        /* renamed from: c, reason: collision with root package name */
        public final float f419805c;

        public e(float f12, @l Integer num, @l Integer num2) {
            this.f419803a = num;
            this.f419804b = num2;
            this.f419805c = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f419803a, eVar.f419803a) && L.f(this.f419804b, eVar.f419804b) && Float.compare(this.f419805c, eVar.f419805c) == 0;
        }

        public final int hashCode() {
            Integer num = this.f419803a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f419804b;
            return Float.hashCode(this.f419805c) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PolygonStyle(fillColor=");
            sb2.append(this.f419803a);
            sb2.append(", polylineColor=");
            sb2.append(this.f419804b);
            sb2.append(", polylineWidth=");
            return r.k(')', this.f419805c, sb2);
        }

        public /* synthetic */ e(Integer num, Integer num2, float f12, int i12, C42822w c42822w) {
            this(f12, (i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
        }
    }

    /* compiled from: MapStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoV/a$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oV.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12190a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f419794a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f419795b;

        /* renamed from: c, reason: collision with root package name */
        public final float f419796c;

        /* renamed from: d, reason: collision with root package name */
        public final float f419797d;

        public C12190a(@l Integer num, @l Integer num2, float f12, float f13) {
            this.f419794a = num;
            this.f419795b = num2;
            this.f419796c = f12;
            this.f419797d = f13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12190a)) {
                return false;
            }
            C12190a c12190a = (C12190a) obj;
            return L.f(this.f419794a, c12190a.f419794a) && L.f(this.f419795b, c12190a.f419795b) && Float.compare(this.f419796c, c12190a.f419796c) == 0 && Float.compare(this.f419797d, c12190a.f419797d) == 0;
        }

        public final int hashCode() {
            Integer num = this.f419794a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f419795b;
            return Float.hashCode(this.f419797d) + r.d(this.f419796c, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CircleLocationStyle(strokeColor=");
            sb2.append(this.f419794a);
            sb2.append(", fillColor=");
            sb2.append(this.f419795b);
            sb2.append(", strokeWidth=");
            sb2.append(this.f419796c);
            sb2.append(", radius=");
            return r.k(')', this.f419797d, sb2);
        }

        public /* synthetic */ C12190a(Integer num, Integer num2, float f12, float f13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, f12, f13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C44694a(Integer num, Integer num2, float f12, float f13, float f14, int i12, int i13, int i14, int i15, AvitoMap.AnimationLength animationLength, C12190a c12190a, Drawable drawable, e eVar, d dVar, int i16, C42822w c42822w) {
        d c12191a;
        c cVar = null;
        Object[] objArr = 0;
        Integer num3 = (i16 & 1) != 0 ? null : num;
        Integer num4 = (i16 & 2) != 0 ? null : num2;
        float f15 = (i16 & 4) != 0 ? 0.0f : f12;
        float f16 = (i16 & 8) != 0 ? 0.0f : f13;
        float f17 = (i16 & 16) == 0 ? f14 : 0.0f;
        int i17 = (i16 & 32) != 0 ? 0 : i12;
        int i18 = (i16 & 64) != 0 ? 0 : i13;
        int i19 = (i16 & 128) != 0 ? 0 : i14;
        int i22 = (i16 & 256) == 0 ? i15 : 0;
        AvitoMap.AnimationLength animationLength2 = (i16 & 512) != 0 ? AvitoMap.AnimationLength.DEFAULT : animationLength;
        C12190a c12190a2 = (i16 & 1024) != 0 ? null : c12190a;
        Drawable drawable2 = (i16 & 2048) != 0 ? null : drawable;
        e eVar2 = (i16 & 4096) != 0 ? null : eVar;
        if ((i16 & 8192) != 0) {
            c12191a = new d.C12191a(cVar, 1, objArr == true ? 1 : 0);
        } else {
            c12191a = dVar;
        }
        this(num3, num4, f15, f16, f17, i17, i18, i19, i22, animationLength2, c12190a2, drawable2, eVar2, c12191a);
    }
}
