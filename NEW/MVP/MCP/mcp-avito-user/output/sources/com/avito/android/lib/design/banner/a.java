package com.avito.android.lib.design.banner;

import LV.c;
import PK0.n;
import VU.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.gradient.b;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.google.android.material.shape.q;
import hw.InterfaceC41176a;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BannerStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/banner/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final C5258a f178448x = new C5258a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f178449a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C35763c0 f178450b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Drawable f178451c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f178452d;

    /* renamed from: e, reason: collision with root package name */
    public final int f178453e;

    /* renamed from: f, reason: collision with root package name */
    public final int f178454f;

    /* renamed from: g, reason: collision with root package name */
    public final int f178455g;

    /* renamed from: h, reason: collision with root package name */
    public final int f178456h;

    /* renamed from: i, reason: collision with root package name */
    public final int f178457i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f178458j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final q.b f178459k;

    /* renamed from: l, reason: collision with root package name */
    public final int f178460l;

    /* renamed from: m, reason: collision with root package name */
    public final int f178461m;

    /* renamed from: n, reason: collision with root package name */
    public final int f178462n;

    /* renamed from: o, reason: collision with root package name */
    public final float f178463o;

    /* renamed from: p, reason: collision with root package name */
    public final int f178464p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f178465q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f178466r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f178467s;

    /* renamed from: t, reason: collision with root package name */
    public final int f178468t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f178469u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final d f178470v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final d f178471w;

    /* compiled from: BannerStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/banner/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/banner/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.banner.a$a, reason: collision with other inner class name */
    public static final class C5258a implements c<a> {
        public /* synthetic */ C5258a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178966f);
            a aVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarC;
        }

        @k
        public static a c(@k TypedArray typedArray, @k Context context) {
            n nVarD = AK.c.d(typedArray, 28, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 6);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 7);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(21, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(18, 0);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(19, 0);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(20, 0);
            int resourceId = typedArray.getResourceId(15, 0);
            boolean z12 = typedArray.getBoolean(16, false);
            q.b bVarA = q.a(context, typedArray.getResourceId(8, 0), 0);
            int dimensionPixelSize5 = typedArray.getDimensionPixelSize(14, 0);
            int dimensionPixelSize6 = typedArray.getDimensionPixelSize(13, 0);
            int dimensionPixelSize7 = typedArray.getDimensionPixelSize(12, 0);
            float dimension = typedArray.getDimension(22, 0.0f);
            int i12 = typedArray.getInt(9, 0);
            boolean z13 = typedArray.getBoolean(29, true);
            boolean z14 = typedArray.getBoolean(29, true);
            boolean z15 = typedArray.getBoolean(23, true);
            int resourceId2 = typedArray.getResourceId(26, 0);
            boolean z16 = typedArray.getBoolean(25, false);
            d.a aVar = VU.d.f17172e;
            int resourceId3 = typedArray.getResourceId(24, 0);
            aVar.getClass();
            return new a(nVarD, c35763c0B, null, c35763c0B2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, resourceId, z12, bVarA, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7, dimension, i12, z13, z14, z15, resourceId2, z16, d.a.b(resourceId3, context), d.a.b(typedArray.getResourceId(11, 0), context), 4, null);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C5258a() {
        }
    }

    public a(@k n nVar, @l C35763c0 c35763c0, @l Drawable drawable, @l C35763c0 c35763c02, @U int i12, @U int i13, @U int i14, @U int i15, @f0 int i16, boolean z12, @k q.b bVar, @U int i17, @U int i18, @U int i19, float f12, int i22, boolean z13, boolean z14, boolean z15, @f0 int i23, boolean z16, @l VU.d dVar, @l VU.d dVar2) {
        this.f178449a = nVar;
        this.f178450b = c35763c0;
        this.f178451c = drawable;
        this.f178452d = c35763c02;
        this.f178453e = i12;
        this.f178454f = i13;
        this.f178455g = i14;
        this.f178456h = i15;
        this.f178457i = i16;
        this.f178458j = z12;
        this.f178459k = bVar;
        this.f178460l = i17;
        this.f178461m = i18;
        this.f178462n = i19;
        this.f178463o = f12;
        this.f178464p = i22;
        this.f178465q = z13;
        this.f178466r = z14;
        this.f178467s = z15;
        this.f178468t = i23;
        this.f178469u = z16;
        this.f178470v = dVar;
        this.f178471w = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.graphics.drawable.Drawable] */
    public static a a(a aVar, n nVar, C35763c0 c35763c0, b bVar, int i12, int i13, int i14, int i15, boolean z12, float f12, boolean z13, boolean z14, int i16) {
        int i17;
        boolean z15;
        n nVar2 = (i16 & 1) != 0 ? aVar.f178449a : nVar;
        C35763c0 c35763c02 = (i16 & 2) != 0 ? aVar.f178450b : c35763c0;
        b bVar2 = (i16 & 4) != 0 ? aVar.f178451c : bVar;
        C35763c0 c35763c03 = aVar.f178452d;
        int i18 = (i16 & 16) != 0 ? aVar.f178453e : i12;
        int i19 = (i16 & 32) != 0 ? aVar.f178454f : i13;
        int i22 = (i16 & 64) != 0 ? aVar.f178455g : i14;
        int i23 = (i16 & 128) != 0 ? aVar.f178456h : i15;
        int i24 = aVar.f178457i;
        boolean z16 = (i16 & 512) != 0 ? aVar.f178458j : z12;
        q.b bVar3 = aVar.f178459k;
        int i25 = aVar.f178460l;
        int i26 = aVar.f178461m;
        int i27 = aVar.f178462n;
        float f13 = (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? aVar.f178463o : f12;
        int i28 = aVar.f178464p;
        if ((i16 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            i17 = i28;
            z15 = aVar.f178465q;
        } else {
            i17 = i28;
            z15 = z13;
        }
        boolean z17 = (131072 & i16) != 0 ? aVar.f178466r : z14;
        boolean z18 = aVar.f178467s;
        int i29 = aVar.f178468t;
        boolean z19 = (i16 & 1048576) != 0 ? aVar.f178469u : false;
        VU.d dVar = aVar.f178470v;
        VU.d dVar2 = aVar.f178471w;
        aVar.getClass();
        return new a(nVar2, c35763c02, bVar2, c35763c03, i18, i19, i22, i23, i24, z16, bVar3, i25, i26, i27, f13, i17, z15, z17, z18, i29, z19, dVar, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f178449a, aVar.f178449a) && L.f(this.f178450b, aVar.f178450b) && L.f(this.f178451c, aVar.f178451c) && L.f(this.f178452d, aVar.f178452d) && this.f178453e == aVar.f178453e && this.f178454f == aVar.f178454f && this.f178455g == aVar.f178455g && this.f178456h == aVar.f178456h && this.f178457i == aVar.f178457i && this.f178458j == aVar.f178458j && L.f(this.f178459k, aVar.f178459k) && this.f178460l == aVar.f178460l && this.f178461m == aVar.f178461m && this.f178462n == aVar.f178462n && Float.compare(this.f178463o, aVar.f178463o) == 0 && this.f178464p == aVar.f178464p && this.f178465q == aVar.f178465q && this.f178466r == aVar.f178466r && this.f178467s == aVar.f178467s && this.f178468t == aVar.f178468t && this.f178469u == aVar.f178469u && L.f(this.f178470v, aVar.f178470v) && L.f(this.f178471w, aVar.f178471w);
    }

    public final int hashCode() {
        int iHashCode = this.f178449a.hashCode() * 31;
        C35763c0 c35763c0 = this.f178450b;
        int iHashCode2 = (iHashCode + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        Drawable drawable = this.f178451c;
        int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        C35763c0 c35763c02 = this.f178452d;
        int i12 = r.i(r.e(this.f178468t, r.i(r.i(r.i(r.e(this.f178464p, r.d(this.f178463o, r.e(this.f178462n, r.e(this.f178461m, r.e(this.f178460l, (this.f178459k.hashCode() + r.i(r.e(this.f178457i, r.e(this.f178456h, r.e(this.f178455g, r.e(this.f178454f, r.e(this.f178453e, (iHashCode3 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.f178458j)) * 31, 31), 31), 31), 31), 31), 31, this.f178465q), 31, this.f178466r), 31, this.f178467s), 31), 31, this.f178469u);
        VU.d dVar = this.f178470v;
        int iHashCode4 = (i12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        VU.d dVar2 = this.f178471w;
        return iHashCode4 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BannerStyle(titleStyle=" + this.f178449a + ", backgroundColor=" + this.f178450b + ", backgroundDrawable=" + this.f178451c + ", backgroundRipple=" + this.f178452d + ", contentPaddingTop=" + this.f178453e + ", contentPaddingBottom=" + this.f178454f + ", contentPaddingLeft=" + this.f178455g + ", contentPaddingRight=" + this.f178456h + ", closeStyle=" + this.f178457i + ", closeable=" + this.f178458j + ", backgroundShape=" + this.f178459k + ", closeMarginTop=" + this.f178460l + ", closeMarginRight=" + this.f178461m + ", closeAndContentSpacing=" + this.f178462n + ", cornerRadius=" + this.f178463o + ", blurRadius=" + this.f178464p + ", topEdgeRounded=" + this.f178465q + ", bottomEdgeRounded=" + this.f178466r + ", roundCorners=" + this.f178467s + ", themeRes=" + this.f178468t + ", shadowEnabled=" + this.f178469u + ", upperShadowParams=" + this.f178470v + ", bottomShadowParams=" + this.f178471w + ')';
    }

    public /* synthetic */ a(n nVar, C35763c0 c35763c0, Drawable drawable, C35763c0 c35763c02, int i12, int i13, int i14, int i15, int i16, boolean z12, q.b bVar, int i17, int i18, int i19, float f12, int i22, boolean z13, boolean z14, boolean z15, int i23, boolean z16, VU.d dVar, VU.d dVar2, int i24, C42822w c42822w) {
        this(nVar, c35763c0, (i24 & 4) != 0 ? null : drawable, c35763c02, i12, i13, i14, i15, i16, z12, bVar, i17, i18, i19, f12, i22, z13, z14, z15, i23, z16, (i24 & 2097152) != 0 ? null : dVar, (i24 & 4194304) != 0 ? null : dVar2);
    }
}
