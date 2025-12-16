package com.avito.android.lib.design.stepper;

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
import com.avito.android.lib.design.spinner.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StepperStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/stepper/i;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class i {

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final a f180624x = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f180625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180627c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n f180628d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n f180629e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.spinner.a f180630f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C35763c0 f180631g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C35763c0 f180632h;

    /* renamed from: i, reason: collision with root package name */
    public final int f180633i;

    /* renamed from: j, reason: collision with root package name */
    public final int f180634j;

    /* renamed from: k, reason: collision with root package name */
    public final int f180635k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final C35763c0 f180636l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final C35763c0 f180637m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final C35763c0 f180638n;

    /* renamed from: o, reason: collision with root package name */
    public final int f180639o;

    /* renamed from: p, reason: collision with root package name */
    public final int f180640p;

    /* renamed from: q, reason: collision with root package name */
    public final int f180641q;

    /* renamed from: r, reason: collision with root package name */
    public final int f180642r;

    /* renamed from: s, reason: collision with root package name */
    public final float f180643s;

    /* renamed from: t, reason: collision with root package name */
    public final int f180644t;

    /* renamed from: u, reason: collision with root package name */
    public final int f180645u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final Drawable f180646v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final Drawable f180647w;

    /* compiled from: StepperStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/stepper/i$a;", "LLV/c;", "Lcom/avito/android/lib/design/stepper/i;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<i> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static i b(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            ColorStateList colorStateListA = x.a(typedArray, context, 10);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            n nVarD = AK.c.d(typedArray, 13, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(2, 0);
            if (c35763c0B == null) {
                c35763c0B = nVarD.f12988b;
            }
            n nVarA = n.a(nVarD, null, c35763c0B, null, null, null, null, null, null, null, 8189);
            a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
            int resourceId = typedArray.getResourceId(29, 0);
            c5301a.getClass();
            com.avito.android.lib.design.spinner.a aVarB = a.C5301a.b(resourceId, context);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 5);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            ColorStateList colorStateListA3 = x.a(typedArray, context, 25);
            C35763c0 c35763c0B3 = colorStateListA3 != null ? C35771d0.b(colorStateListA3) : null;
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(28, 0);
            int dimensionPixelSize5 = typedArray.getDimensionPixelSize(27, 0);
            int dimensionPixelSize6 = typedArray.getDimensionPixelSize(26, 0);
            ColorStateList colorStateListA4 = x.a(typedArray, context, 14);
            C35763c0 c35763c0B4 = colorStateListA4 != null ? C35771d0.b(colorStateListA4) : null;
            ColorStateList colorStateListA5 = x.a(typedArray, context, 15);
            C35763c0 c35763c0B5 = colorStateListA5 != null ? C35771d0.b(colorStateListA5) : null;
            ColorStateList colorStateListA6 = x.a(typedArray, context, 6);
            return new i(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, nVarA, nVarD, aVarB, c35763c0B2, c35763c0B3, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, colorStateListA6 != null ? C35771d0.b(colorStateListA6) : null, c35763c0B4, c35763c0B5, typedArray.getDimensionPixelSize(9, 0), typedArray.getDimensionPixelSize(7, 0), typedArray.getDimensionPixelSize(11, 0), typedArray.getDimensionPixelSize(12, 0), typedArray.getDimension(8, 0.0f), typedArray.getResourceId(22, 0), typedArray.getResourceId(24, 0), x.b(typedArray, context, 21), x.b(typedArray, context, 23));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178922G0);
            i iVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return iVarB;
        }

        public a() {
        }
    }

    public i(int i12, int i13, int i14, @k n nVar, @k n nVar2, @k com.avito.android.lib.design.spinner.a aVar, @l C35763c0 c35763c0, @l C35763c0 c35763c02, int i15, int i16, int i17, @l C35763c0 c35763c03, @l C35763c0 c35763c04, @l C35763c0 c35763c05, int i18, int i19, int i22, int i23, @U float f12, @f0 int i24, @f0 int i25, @l Drawable drawable, @l Drawable drawable2) {
        this.f180625a = i12;
        this.f180626b = i13;
        this.f180627c = i14;
        this.f180628d = nVar;
        this.f180629e = nVar2;
        this.f180630f = aVar;
        this.f180631g = c35763c0;
        this.f180632h = c35763c02;
        this.f180633i = i15;
        this.f180634j = i16;
        this.f180635k = i17;
        this.f180636l = c35763c03;
        this.f180637m = c35763c04;
        this.f180638n = c35763c05;
        this.f180639o = i18;
        this.f180640p = i19;
        this.f180641q = i22;
        this.f180642r = i23;
        this.f180643s = f12;
        this.f180644t = i24;
        this.f180645u = i25;
        this.f180646v = drawable;
        this.f180647w = drawable2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f180625a == iVar.f180625a && this.f180626b == iVar.f180626b && this.f180627c == iVar.f180627c && L.f(this.f180628d, iVar.f180628d) && L.f(this.f180629e, iVar.f180629e) && L.f(this.f180630f, iVar.f180630f) && L.f(this.f180631g, iVar.f180631g) && L.f(this.f180632h, iVar.f180632h) && this.f180633i == iVar.f180633i && this.f180634j == iVar.f180634j && this.f180635k == iVar.f180635k && L.f(this.f180636l, iVar.f180636l) && L.f(this.f180637m, iVar.f180637m) && L.f(this.f180638n, iVar.f180638n) && this.f180639o == iVar.f180639o && this.f180640p == iVar.f180640p && this.f180641q == iVar.f180641q && this.f180642r == iVar.f180642r && Float.compare(this.f180643s, iVar.f180643s) == 0 && this.f180644t == iVar.f180644t && this.f180645u == iVar.f180645u && L.f(this.f180646v, iVar.f180646v) && L.f(this.f180647w, iVar.f180647w);
    }

    public final int hashCode() {
        int iHashCode = (this.f180630f.hashCode() + ((this.f180629e.hashCode() + ((this.f180628d.hashCode() + r.e(this.f180627c, r.e(this.f180626b, Integer.hashCode(this.f180625a) * 31, 31), 31)) * 31)) * 31)) * 31;
        C35763c0 c35763c0 = this.f180631g;
        int iHashCode2 = (iHashCode + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f180632h;
        int iE2 = r.e(this.f180635k, r.e(this.f180634j, r.e(this.f180633i, (iHashCode2 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31), 31), 31);
        C35763c0 c35763c03 = this.f180636l;
        int iHashCode3 = (iE2 + (c35763c03 == null ? 0 : c35763c03.hashCode())) * 31;
        C35763c0 c35763c04 = this.f180637m;
        int iHashCode4 = (iHashCode3 + (c35763c04 == null ? 0 : c35763c04.hashCode())) * 31;
        C35763c0 c35763c05 = this.f180638n;
        int iE3 = r.e(this.f180645u, r.e(this.f180644t, r.d(this.f180643s, r.e(this.f180642r, r.e(this.f180641q, r.e(this.f180640p, r.e(this.f180639o, (iHashCode4 + (c35763c05 == null ? 0 : c35763c05.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        Drawable drawable = this.f180646v;
        int iHashCode5 = (iE3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f180647w;
        return iHashCode5 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StepperStyle(minHeight=" + this.f180625a + ", maxHeight=" + this.f180626b + ", minWidth=" + this.f180627c + ", counterStyle=" + this.f180628d + ", signStyle=" + this.f180629e + ", spinnerStyle=" + this.f180630f + ", backgroundColor=" + this.f180631g + ", separatorColor=" + this.f180632h + ", separatorWidth=" + this.f180633i + ", separatorInsetTop=" + this.f180634j + ", separatorInsetBottom=" + this.f180635k + ", borderColor=" + this.f180636l + ", buttonsRippleColor=" + this.f180637m + ", iconColor=" + this.f180638n + ", cornerRadius=" + this.f180639o + ", errorBorderWidth=" + this.f180640p + ", counterPaddingLeft=" + this.f180641q + ", counterPaddingRight=" + this.f180642r + ", contentOffsetY=" + this.f180643s + ", minusTextIconStyle=" + this.f180644t + ", plusTextIconStyle=" + this.f180645u + ", minusDrawable=" + this.f180646v + ", plusDrawable=" + this.f180647w + ')';
    }

    public /* synthetic */ i(int i12, int i13, int i14, n nVar, n nVar2, com.avito.android.lib.design.spinner.a aVar, C35763c0 c35763c0, C35763c0 c35763c02, int i15, int i16, int i17, C35763c0 c35763c03, C35763c0 c35763c04, C35763c0 c35763c05, int i18, int i19, int i22, int i23, float f12, int i24, int i25, Drawable drawable, Drawable drawable2, int i26, C42822w c42822w) {
        this(i12, i13, i14, nVar, nVar2, aVar, c35763c0, c35763c02, i15, i16, i17, c35763c03, c35763c04, c35763c05, i18, i19, i22, i23, f12, i24, i25, (i26 & 2097152) != 0 ? null : drawable, (i26 & 4194304) != 0 ? null : drawable2);
    }
}
