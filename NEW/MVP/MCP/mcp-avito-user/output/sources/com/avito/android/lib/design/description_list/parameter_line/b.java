package com.avito.android.lib.design.description_list.parameter_line;

import LV.c;
import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionListParameterLineStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/b;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f179063o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f179064a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C35763c0 f179065b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n f179066c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f179067d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C35763c0 f179068e;

    /* renamed from: f, reason: collision with root package name */
    public final int f179069f;

    /* renamed from: g, reason: collision with root package name */
    public final int f179070g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Float f179071h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Float f179072i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Float f179073j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Float f179074k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final C35763c0 f179075l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final n f179076m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f179077n;

    /* compiled from: DescriptionListParameterLineStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/b$a;", "LLV/c;", "Lcom/avito/android/lib/design/description_list/parameter_line/b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c<b> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static b b(@k TypedArray typedArray, @k Context context) {
            n nVarD = AK.c.d(typedArray, 10, 0, d.f180938a, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 4);
            if (colorStateListA == null) {
                colorStateListA = ColorStateList.valueOf(0);
            }
            C35763c0 c35763c0B = C35771d0.b(colorStateListA);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(5, 0);
            Float fValueOf = Float.valueOf(typedArray.getDimension(2, 0.0f));
            Float fValueOf2 = Float.valueOf(typedArray.getDimension(3, 0.0f));
            Float fValueOf3 = Float.valueOf(typedArray.getDimension(1, 0.0f));
            Float fValueOf4 = Float.valueOf(typedArray.getDimension(5, 0.0f));
            ColorStateList colorStateListA2 = x.a(typedArray, context, 11);
            if (colorStateListA2 == null) {
                colorStateListA2 = ColorStateList.valueOf(C35835l0.d(R.attr.black, context));
            }
            C35763c0 c35763c0B2 = C35771d0.b(colorStateListA2);
            n nVarA = d.a(typedArray.getResourceId(0, 0), context);
            boolean z12 = typedArray.getBoolean(6, false);
            C35763c0 c35763c0 = nVarD.f12988b;
            return new b(nVarD, c35763c0, nVarD, c35763c0, c35763c0B, dimensionPixelSize, dimensionPixelSize2, fValueOf, fValueOf2, fValueOf3, fValueOf4, c35763c0B2, nVarA, z12);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178994t);
            b bVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return bVarB;
        }

        public a() {
        }
    }

    public b(@k n nVar, @l C35763c0 c35763c0, @k n nVar2, @l C35763c0 c35763c02, @k C35763c0 c35763c03, int i12, int i13, @l Float f12, @l Float f13, @l Float f14, @l Float f15, @l C35763c0 c35763c04, @l n nVar3, boolean z12) {
        this.f179064a = nVar;
        this.f179065b = c35763c0;
        this.f179066c = nVar2;
        this.f179067d = c35763c02;
        this.f179068e = c35763c03;
        this.f179069f = i12;
        this.f179070g = i13;
        this.f179071h = f12;
        this.f179072i = f13;
        this.f179073j = f14;
        this.f179074k = f15;
        this.f179075l = c35763c04;
        this.f179076m = nVar3;
        this.f179077n = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f179064a, bVar.f179064a) && L.f(this.f179065b, bVar.f179065b) && L.f(this.f179066c, bVar.f179066c) && L.f(this.f179067d, bVar.f179067d) && L.f(this.f179068e, bVar.f179068e) && this.f179069f == bVar.f179069f && this.f179070g == bVar.f179070g && L.f(this.f179071h, bVar.f179071h) && L.f(this.f179072i, bVar.f179072i) && L.f(this.f179073j, bVar.f179073j) && L.f(this.f179074k, bVar.f179074k) && L.f(this.f179075l, bVar.f179075l) && L.f(this.f179076m, bVar.f179076m) && this.f179077n == bVar.f179077n;
    }

    public final int hashCode() {
        int iHashCode = this.f179064a.hashCode() * 31;
        C35763c0 c35763c0 = this.f179065b;
        int iHashCode2 = (this.f179066c.hashCode() + ((iHashCode + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31)) * 31;
        C35763c0 c35763c02 = this.f179067d;
        int iE2 = r.e(this.f179070g, r.e(this.f179069f, (this.f179068e.hashCode() + ((iHashCode2 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31)) * 31, 31), 31);
        Float f12 = this.f179071h;
        int iHashCode3 = (iE2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f179072i;
        int iHashCode4 = (iHashCode3 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.f179073j;
        int iHashCode5 = (iHashCode4 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f179074k;
        int iHashCode6 = (iHashCode5 + (f15 == null ? 0 : f15.hashCode())) * 31;
        C35763c0 c35763c03 = this.f179075l;
        int iHashCode7 = (iHashCode6 + (c35763c03 == null ? 0 : c35763c03.hashCode())) * 31;
        n nVar = this.f179076m;
        return Boolean.hashCode(this.f179077n) + ((iHashCode7 + (nVar != null ? nVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionListParameterLineStyle(leftTextStyle=");
        sb2.append(this.f179064a);
        sb2.append(", leftTextColor=");
        sb2.append(this.f179065b);
        sb2.append(", rightTextStyle=");
        sb2.append(this.f179066c);
        sb2.append(", rightTextColor=");
        sb2.append(this.f179067d);
        sb2.append(", lineColor=");
        sb2.append(this.f179068e);
        sb2.append(", itemVerticalInset=");
        sb2.append(this.f179069f);
        sb2.append(", iconHorizontalInset=");
        sb2.append(this.f179070g);
        sb2.append(", dotGapSize=");
        sb2.append(this.f179071h);
        sb2.append(", dotSize=");
        sb2.append(this.f179072i);
        sb2.append(", dashLineWidth=");
        sb2.append(this.f179073j);
        sb2.append(", dotsPadding=");
        sb2.append(this.f179074k);
        sb2.append(", iconColor=");
        sb2.append(this.f179075l);
        sb2.append(", lastLineBoldStyle=");
        sb2.append(this.f179076m);
        sb2.append(", isLastLineWithBoldStyle=");
        return r.x(sb2, this.f179077n, ')');
    }

    public /* synthetic */ b(n nVar, C35763c0 c35763c0, n nVar2, C35763c0 c35763c02, C35763c0 c35763c03, int i12, int i13, Float f12, Float f13, Float f14, Float f15, C35763c0 c35763c04, n nVar3, boolean z12, int i14, C42822w c42822w) {
        this(nVar, c35763c0, nVar2, c35763c02, c35763c03, i12, i13, (i14 & 128) != 0 ? null : f12, (i14 & 256) != 0 ? null : f13, (i14 & 512) != 0 ? null : f14, (i14 & 1024) != 0 ? null : f15, c35763c04, (i14 & 4096) != 0 ? null : nVar3, (i14 & 8192) != 0 ? false : z12);
    }
}
