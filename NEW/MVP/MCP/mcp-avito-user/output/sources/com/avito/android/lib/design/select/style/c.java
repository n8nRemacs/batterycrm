package com.avito.android.lib.design.select.style;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.spinner.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BaseSelectStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/select/style/c;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: A, reason: collision with root package name */
    @k
    public static final b f180287A = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f180288a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n f180289b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ColorStateList f180290c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ColorStateList f180291d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ColorStateList f180292e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ColorStateList f180293f;

    /* renamed from: g, reason: collision with root package name */
    public final int f180294g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ColorStateList f180295h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ColorStateList f180296i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ColorStateList f180297j;

    /* renamed from: k, reason: collision with root package name */
    public final int f180298k;

    /* renamed from: l, reason: collision with root package name */
    public final int f180299l;

    /* renamed from: m, reason: collision with root package name */
    public final int f180300m;

    /* renamed from: n, reason: collision with root package name */
    public final int f180301n;

    /* renamed from: o, reason: collision with root package name */
    public final int f180302o;

    /* renamed from: p, reason: collision with root package name */
    public final int f180303p;

    /* renamed from: q, reason: collision with root package name */
    public final int f180304q;

    /* renamed from: r, reason: collision with root package name */
    public final int f180305r;

    /* renamed from: s, reason: collision with root package name */
    public final int f180306s;

    /* renamed from: t, reason: collision with root package name */
    public final int f180307t;

    /* renamed from: u, reason: collision with root package name */
    public final int f180308u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final Drawable f180309v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.spinner.a f180310w;

    /* renamed from: x, reason: collision with root package name */
    public final int f180311x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final a f180312y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final FormatterType f180313z;

    /* compiled from: BaseSelectStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/select/style/c$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C35763c0 f180314a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C35763c0 f180315b;

        /* renamed from: c, reason: collision with root package name */
        public final int f180316c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C35763c0 f180317d;

        public a() {
            this(null, null, 0, null, 15, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f180314a, aVar.f180314a) && L.f(this.f180315b, aVar.f180315b) && this.f180316c == aVar.f180316c && L.f(this.f180317d, aVar.f180317d);
        }

        public final int hashCode() {
            C35763c0 c35763c0 = this.f180314a;
            int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
            C35763c0 c35763c02 = this.f180315b;
            int iE2 = r.e(this.f180316c, (iHashCode + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31);
            C35763c0 c35763c03 = this.f180317d;
            return iE2 + (c35763c03 != null ? c35763c03.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ClearButtonStyle(buttonTint=" + this.f180314a + ", backgroundColor=" + this.f180315b + ", horizontalOffset=" + this.f180316c + ", rippleColor=" + this.f180317d + ')';
        }

        public a(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @l C35763c0 c35763c03) {
            this.f180314a = c35763c0;
            this.f180315b = c35763c02;
            this.f180316c = i12;
            this.f180317d = c35763c03;
        }

        public /* synthetic */ a(C35763c0 c35763c0, C35763c0 c35763c02, int i12, C35763c0 c35763c03, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? null : c35763c0, (i13 & 2) != 0 ? null : c35763c02, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? null : c35763c03);
        }
    }

    /* compiled from: BaseSelectStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/select/style/c$b;", "LLV/c;", "Lcom/avito/android/lib/design/select/style/c;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements LV.c<c> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            int i13;
            C35763c0 c35763c0B;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178939P);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
            n nVarD = AK.c.d(typedArrayObtainStyledAttributes, 0, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(26, 0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(33, 0);
            int integer = typedArrayObtainStyledAttributes.getInteger(11, Integer.MAX_VALUE);
            ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, context, 1);
            ColorStateList colorStateListA2 = x.a(typedArrayObtainStyledAttributes, context, 2);
            ColorStateList colorStateListA3 = x.a(typedArrayObtainStyledAttributes, context, 23);
            ColorStateList colorStateListA4 = x.a(typedArrayObtainStyledAttributes, context, 25);
            ColorStateList colorStateListA5 = x.a(typedArrayObtainStyledAttributes, context, 39);
            ColorStateList colorStateListA6 = x.a(typedArrayObtainStyledAttributes, context, 44);
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, 0);
            int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            int dimensionPixelSize8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(59, 0);
            int dimensionPixelSize9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(40, 0);
            int dimensionPixelSize10 = typedArrayObtainStyledAttributes.getDimensionPixelSize(41, 0);
            int dimensionPixelSize11 = typedArrayObtainStyledAttributes.getDimensionPixelSize(45, 0);
            int dimensionPixelSize12 = typedArrayObtainStyledAttributes.getDimensionPixelSize(46, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(16);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(28, 0);
            a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
            c5301a.getClass();
            com.avito.android.lib.design.spinner.a aVarB = a.C5301a.b(resourceId2, context);
            int dimensionPixelSize13 = typedArrayObtainStyledAttributes.getDimensionPixelSize(36, 0);
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, d.n.f178941Q);
            ColorStateList colorStateListA7 = x.a(typedArrayObtainStyledAttributes2, context, 3);
            C35763c0 c35763c0B2 = colorStateListA7 != null ? C35771d0.b(colorStateListA7) : null;
            ColorStateList colorStateListA8 = x.a(typedArrayObtainStyledAttributes2, context, 1);
            if (colorStateListA8 != null) {
                c35763c0B = C35771d0.b(colorStateListA8);
                i13 = dimensionPixelSize3;
            } else {
                i13 = dimensionPixelSize3;
                c35763c0B = null;
            }
            int dimensionPixelOffset = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(0, 0);
            ColorStateList colorStateListA9 = x.a(typedArrayObtainStyledAttributes2, context, 2);
            a aVar = new a(c35763c0B2, c35763c0B, dimensionPixelOffset, colorStateListA9 != null ? C35771d0.b(colorStateListA9) : null);
            FormatterType.f179288e.getClass();
            FormatterType formatterTypeA = FormatterType.a.a(typedArrayObtainStyledAttributes.getInt(35, FormatterType.f179289f.f179300b));
            typedArrayObtainStyledAttributes2.recycle();
            c cVar = new c(dimensionPixelSize, nVarD, colorStateListA, colorStateListA2, colorStateListA3, colorStateListA4, dimensionPixelSize2, colorStateListA5, colorStateListA6, null, i13, integer, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize10, dimensionPixelSize11, dimensionPixelSize12, drawable, aVarB, dimensionPixelSize13, aVar, formatterTypeA, 512, null);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public b() {
        }
    }

    public c(int i12, @k n nVar, @l ColorStateList colorStateList, @l ColorStateList colorStateList2, @l ColorStateList colorStateList3, @l ColorStateList colorStateList4, int i13, @l ColorStateList colorStateList5, @l ColorStateList colorStateList6, @l ColorStateList colorStateList7, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25, int i26, @l Drawable drawable, @k com.avito.android.lib.design.spinner.a aVar, int i27, @k a aVar2, @k FormatterType formatterType) {
        this.f180288a = i12;
        this.f180289b = nVar;
        this.f180290c = colorStateList;
        this.f180291d = colorStateList2;
        this.f180292e = colorStateList3;
        this.f180293f = colorStateList4;
        this.f180294g = i13;
        this.f180295h = colorStateList5;
        this.f180296i = colorStateList6;
        this.f180297j = colorStateList7;
        this.f180298k = i14;
        this.f180299l = i15;
        this.f180300m = i16;
        this.f180301n = i17;
        this.f180302o = i18;
        this.f180303p = i19;
        this.f180304q = i22;
        this.f180305r = i23;
        this.f180306s = i24;
        this.f180307t = i25;
        this.f180308u = i26;
        this.f180309v = drawable;
        this.f180310w = aVar;
        this.f180311x = i27;
        this.f180312y = aVar2;
        this.f180313z = formatterType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f180288a == cVar.f180288a && L.f(this.f180289b, cVar.f180289b) && L.f(this.f180290c, cVar.f180290c) && L.f(this.f180291d, cVar.f180291d) && L.f(this.f180292e, cVar.f180292e) && L.f(this.f180293f, cVar.f180293f) && this.f180294g == cVar.f180294g && L.f(this.f180295h, cVar.f180295h) && L.f(this.f180296i, cVar.f180296i) && L.f(this.f180297j, cVar.f180297j) && this.f180298k == cVar.f180298k && this.f180299l == cVar.f180299l && this.f180300m == cVar.f180300m && this.f180301n == cVar.f180301n && this.f180302o == cVar.f180302o && this.f180303p == cVar.f180303p && this.f180304q == cVar.f180304q && this.f180305r == cVar.f180305r && this.f180306s == cVar.f180306s && this.f180307t == cVar.f180307t && this.f180308u == cVar.f180308u && L.f(this.f180309v, cVar.f180309v) && L.f(this.f180310w, cVar.f180310w) && this.f180311x == cVar.f180311x && L.f(this.f180312y, cVar.f180312y) && L.f(this.f180313z, cVar.f180313z);
    }

    public final int hashCode() {
        int iHashCode = (this.f180289b.hashCode() + (Integer.hashCode(this.f180288a) * 31)) * 31;
        ColorStateList colorStateList = this.f180290c;
        int iHashCode2 = (iHashCode + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
        ColorStateList colorStateList2 = this.f180291d;
        int iHashCode3 = (iHashCode2 + (colorStateList2 == null ? 0 : colorStateList2.hashCode())) * 31;
        ColorStateList colorStateList3 = this.f180292e;
        int iHashCode4 = (iHashCode3 + (colorStateList3 == null ? 0 : colorStateList3.hashCode())) * 31;
        ColorStateList colorStateList4 = this.f180293f;
        int iE2 = r.e(this.f180294g, (iHashCode4 + (colorStateList4 == null ? 0 : colorStateList4.hashCode())) * 31, 31);
        ColorStateList colorStateList5 = this.f180295h;
        int iHashCode5 = (iE2 + (colorStateList5 == null ? 0 : colorStateList5.hashCode())) * 31;
        ColorStateList colorStateList6 = this.f180296i;
        int iHashCode6 = (iHashCode5 + (colorStateList6 == null ? 0 : colorStateList6.hashCode())) * 31;
        ColorStateList colorStateList7 = this.f180297j;
        int iE3 = r.e(this.f180308u, r.e(this.f180307t, r.e(this.f180306s, r.e(this.f180305r, r.e(this.f180304q, r.e(this.f180303p, r.e(this.f180302o, r.e(this.f180301n, r.e(this.f180300m, r.e(this.f180299l, r.e(this.f180298k, (iHashCode6 + (colorStateList7 == null ? 0 : colorStateList7.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Drawable drawable = this.f180309v;
        return this.f180313z.hashCode() + ((this.f180312y.hashCode() + r.e(this.f180311x, (this.f180310w.hashCode() + ((iE3 + (drawable != null ? drawable.hashCode() : 0)) * 31)) * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        return "BaseSelectStyle(height=" + this.f180288a + ", textStyle=" + this.f180289b + ", textColor=" + this.f180290c + ", placeholderColor=" + this.f180291d + ", backgroundColor=" + this.f180292e + ", borderColor=" + this.f180293f + ", borderWidth=" + this.f180294g + ", iconStartColor=" + this.f180295h + ", iconEndColor=" + this.f180296i + ", spinnerColor=" + this.f180297j + ", cornerRadius=" + this.f180298k + ", maxLines=" + this.f180299l + ", paddingStart=" + this.f180300m + ", paddingEnd=" + this.f180301n + ", paddingTop=" + this.f180302o + ", paddingBottom=" + this.f180303p + ", textVerticalOffset=" + this.f180304q + ", iconLeftContainerHeight=" + this.f180305r + ", iconLeftContainerWidth=" + this.f180306s + ", iconRightContainerHeight=" + this.f180307t + ", iconRightContainerWidth=" + this.f180308u + ", drawableRight=" + this.f180309v + ", spinnerStyle=" + this.f180310w + ", iconBackgroundSize=" + this.f180311x + ", clearButtonStyle=" + this.f180312y + ", formatterType=" + this.f180313z + ')';
    }

    public /* synthetic */ c(int i12, n nVar, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, ColorStateList colorStateList4, int i13, ColorStateList colorStateList5, ColorStateList colorStateList6, ColorStateList colorStateList7, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25, int i26, Drawable drawable, com.avito.android.lib.design.spinner.a aVar, int i27, a aVar2, FormatterType formatterType, int i28, C42822w c42822w) {
        this((i28 & 1) != 0 ? 0 : i12, nVar, (i28 & 4) != 0 ? null : colorStateList, (i28 & 8) != 0 ? null : colorStateList2, (i28 & 16) != 0 ? null : colorStateList3, (i28 & 32) != 0 ? null : colorStateList4, (i28 & 64) != 0 ? 0 : i13, (i28 & 128) != 0 ? null : colorStateList5, (i28 & 256) != 0 ? null : colorStateList6, (i28 & 512) != 0 ? null : colorStateList7, (i28 & 1024) != 0 ? 0 : i14, (i28 & 2048) != 0 ? Integer.MAX_VALUE : i15, i16, i17, i18, i19, i22, i23, i24, i25, i26, drawable, aVar, i27, aVar2, formatterType);
    }
}
