package L6;

import LV.c;
import Y61.k;
import Y61.l;
import Y9.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: SalaryRangeStyle.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LL6/a;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final C0603a f9778s = new C0603a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C35763c0 f9779a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C35763c0 f9780b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C35763c0 f9781c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f9782d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C35763c0 f9783e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C35763c0 f9784f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C35763c0 f9785g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9786h;

    /* renamed from: i, reason: collision with root package name */
    public final float f9787i;

    /* renamed from: j, reason: collision with root package name */
    public final float f9788j;

    /* renamed from: k, reason: collision with root package name */
    public final float f9789k;

    /* renamed from: l, reason: collision with root package name */
    public final float f9790l;

    /* renamed from: m, reason: collision with root package name */
    public final float f9791m;

    /* renamed from: n, reason: collision with root package name */
    public final float f9792n;

    /* renamed from: o, reason: collision with root package name */
    public final float f9793o;

    /* renamed from: p, reason: collision with root package name */
    public final float f9794p;

    /* renamed from: q, reason: collision with root package name */
    public final float f9795q;

    /* renamed from: r, reason: collision with root package name */
    public final float f9796r;

    /* compiled from: SalaryRangeStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LL6/a$a;", "LLV/c;", "LL6/a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: L6.a$a, reason: collision with other inner class name */
    public static final class C0603a implements c<a> {
        public /* synthetic */ C0603a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@k TypedArray typedArray, @k Context context) {
            ColorStateList colorStateListA = x.a(typedArray, context, 0);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 5);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            ColorStateList colorStateListA3 = x.a(typedArray, context, 16);
            C35763c0 c35763c0B3 = colorStateListA3 != null ? C35771d0.b(colorStateListA3) : null;
            ColorStateList colorStateListA4 = x.a(typedArray, context, 1);
            C35763c0 c35763c0B4 = colorStateListA4 != null ? C35771d0.b(colorStateListA4) : null;
            ColorStateList colorStateListA5 = x.a(typedArray, context, 7);
            C35763c0 c35763c0B5 = colorStateListA5 != null ? C35771d0.b(colorStateListA5) : null;
            ColorStateList colorStateListA6 = x.a(typedArray, context, 12);
            C35763c0 c35763c0B6 = colorStateListA6 != null ? C35771d0.b(colorStateListA6) : null;
            ColorStateList colorStateListA7 = x.a(typedArray, context, 9);
            return new a(c35763c0B, c35763c0B2, c35763c0B3, c35763c0B4, c35763c0B5, c35763c0B6, colorStateListA7 != null ? C35771d0.b(colorStateListA7) : null, typedArray.getFloat(6, 0.0f), typedArray.getFloat(3, 0.0f), typedArray.getFloat(4, 0.0f), typedArray.getFloat(8, 0.0f), typedArray.getFloat(17, 0.0f), typedArray.getFloat(2, 0.0f), typedArray.getFloat(10, 0.0f), typedArray.getFloat(11, 0.0f), typedArray.getFloat(14, 0.0f), typedArray.getFloat(13, 0.0f), typedArray.getFloat(15, 0.0f));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, c.l.f19370c);
            try {
                return b(typedArrayObtainStyledAttributes, context);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        public C0603a() {
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9779a, aVar.f9779a) && L.f(this.f9780b, aVar.f9780b) && L.f(this.f9781c, aVar.f9781c) && L.f(this.f9782d, aVar.f9782d) && L.f(this.f9783e, aVar.f9783e) && L.f(this.f9784f, aVar.f9784f) && L.f(this.f9785g, aVar.f9785g) && Float.compare(this.f9786h, aVar.f9786h) == 0 && Float.compare(this.f9787i, aVar.f9787i) == 0 && Float.compare(this.f9788j, aVar.f9788j) == 0 && Float.compare(this.f9789k, aVar.f9789k) == 0 && Float.compare(this.f9790l, aVar.f9790l) == 0 && Float.compare(this.f9791m, aVar.f9791m) == 0 && Float.compare(this.f9792n, aVar.f9792n) == 0 && Float.compare(this.f9793o, aVar.f9793o) == 0 && Float.compare(this.f9794p, aVar.f9794p) == 0 && Float.compare(this.f9795q, aVar.f9795q) == 0 && Float.compare(this.f9796r, aVar.f9796r) == 0;
    }

    public final int hashCode() {
        C35763c0 c35763c0 = this.f9779a;
        int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
        C35763c0 c35763c02 = this.f9780b;
        int iHashCode2 = (iHashCode + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31;
        C35763c0 c35763c03 = this.f9781c;
        int iHashCode3 = (iHashCode2 + (c35763c03 == null ? 0 : c35763c03.hashCode())) * 31;
        C35763c0 c35763c04 = this.f9782d;
        int iHashCode4 = (iHashCode3 + (c35763c04 == null ? 0 : c35763c04.hashCode())) * 31;
        C35763c0 c35763c05 = this.f9783e;
        int iHashCode5 = (iHashCode4 + (c35763c05 == null ? 0 : c35763c05.hashCode())) * 31;
        C35763c0 c35763c06 = this.f9784f;
        int iHashCode6 = (iHashCode5 + (c35763c06 == null ? 0 : c35763c06.hashCode())) * 31;
        C35763c0 c35763c07 = this.f9785g;
        return Float.hashCode(this.f9796r) + r.d(this.f9795q, r.d(this.f9794p, r.d(this.f9793o, r.d(this.f9792n, r.d(this.f9791m, r.d(this.f9790l, r.d(this.f9789k, r.d(this.f9788j, r.d(this.f9787i, r.d(this.f9786h, (iHashCode6 + (c35763c07 != null ? c35763c07.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SalaryRangeStyle(baseLineColor=");
        sb2.append(this.f9779a);
        sb2.append(", middleLineColor=");
        sb2.append(this.f9780b);
        sb2.append(", smallPointColor=");
        sb2.append(this.f9781c);
        sb2.append(", bigPointColor=");
        sb2.append(this.f9782d);
        sb2.append(", pointShadowLayerColor=");
        sb2.append(this.f9783e);
        sb2.append(", salaryBgShadowLayerColor=");
        sb2.append(this.f9784f);
        sb2.append(", salaryBgColor=");
        sb2.append(this.f9785g);
        sb2.append(", middleLineValue=");
        sb2.append(this.f9786h);
        sb2.append(", lineHeight=");
        sb2.append(this.f9787i);
        sb2.append(", lineSideRadius=");
        sb2.append(this.f9788j);
        sb2.append(", pointShadowLayerOffset=");
        sb2.append(this.f9789k);
        sb2.append(", smallPointRadius=");
        sb2.append(this.f9790l);
        sb2.append(", bigPointRadius=");
        sb2.append(this.f9791m);
        sb2.append(", salaryBgPaddingHorizontal=");
        sb2.append(this.f9792n);
        sb2.append(", salaryBgPaddingVertical=");
        sb2.append(this.f9793o);
        sb2.append(", salaryBgSideRadius=");
        sb2.append(this.f9794p);
        sb2.append(", salaryBgShadowLayerOffset=");
        sb2.append(this.f9795q);
        sb2.append(", salaryMargin=");
        return r.k(')', this.f9796r, sb2);
    }

    public a(@l C35763c0 c35763c0, @l C35763c0 c35763c02, @l C35763c0 c35763c03, @l C35763c0 c35763c04, @l C35763c0 c35763c05, @l C35763c0 c35763c06, @l C35763c0 c35763c07, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f23, float f24) {
        this.f9779a = c35763c0;
        this.f9780b = c35763c02;
        this.f9781c = c35763c03;
        this.f9782d = c35763c04;
        this.f9783e = c35763c05;
        this.f9784f = c35763c06;
        this.f9785g = c35763c07;
        this.f9786h = f12;
        this.f9787i = f13;
        this.f9788j = f14;
        this.f9789k = f15;
        this.f9790l = f16;
        this.f9791m = f17;
        this.f9792n = f18;
        this.f9793o = f19;
        this.f9794p = f22;
        this.f9795q = f23;
        this.f9796r = f24;
    }

    public /* synthetic */ a(C35763c0 c35763c0, C35763c0 c35763c02, C35763c0 c35763c03, C35763c0 c35763c04, C35763c0 c35763c05, C35763c0 c35763c06, C35763c0 c35763c07, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f23, float f24, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c35763c0, (i12 & 2) != 0 ? null : c35763c02, (i12 & 4) != 0 ? null : c35763c03, (i12 & 8) != 0 ? null : c35763c04, (i12 & 16) != 0 ? null : c35763c05, (i12 & 32) != 0 ? null : c35763c06, (i12 & 64) == 0 ? c35763c07 : null, (i12 & 128) != 0 ? 0.0f : f12, (i12 & 256) != 0 ? 0.0f : f13, (i12 & 512) != 0 ? 0.0f : f14, (i12 & 1024) != 0 ? 0.0f : f15, (i12 & 2048) != 0 ? 0.0f : f16, (i12 & 4096) != 0 ? 0.0f : f17, (i12 & 8192) != 0 ? 0.0f : f18, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0.0f : f19, (i12 & 32768) != 0 ? 0.0f : f22, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? 0.0f : f23, (i12 & 131072) != 0 ? 0.0f : f24);
    }
}
