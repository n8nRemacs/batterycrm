package com.avito.android.lib.design.description_list.parameter_line.item;

import LV.c;
import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionParameterItemStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/item/b;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f179093j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f179094a;

    /* renamed from: b, reason: collision with root package name */
    public final float f179095b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C5267b f179096c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final n f179097d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final n f179098e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C35763c0 f179099f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C35763c0 f179100g;

    /* renamed from: h, reason: collision with root package name */
    public final int f179101h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final C35763c0 f179102i;

    /* compiled from: DescriptionParameterItemStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/item/b$a;", "LLV/c;", "Lcom/avito/android/lib/design/description_list/parameter_line/item/b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c<b> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static b b(@k TypedArray typedArray, @k Context context) {
            n nVarD = typedArray.hasValue(0) ? AK.c.d(typedArray, 0, 0, d.f180938a, context) : null;
            ColorStateList colorStateListA = x.a(typedArray, context, 7);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 14);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            float f12 = typedArray.getFloat(12, 0.0f);
            float f13 = typedArray.getFloat(15, 0.0f);
            n nVarD2 = nVarD == null ? AK.c.d(typedArray, 6, 0, d.f180938a, context) : nVarD;
            n nVarA = n.a(nVarD2, null, c35763c0B == null ? nVarD2.f12988b : c35763c0B, null, null, null, null, null, null, null, 8189);
            if (nVarD == null) {
                nVarD = AK.c.d(typedArray, 13, 0, d.f180938a, context);
            }
            n nVar = nVarD;
            n nVarA2 = n.a(nVar, null, c35763c0B2 == null ? nVar.f12988b : c35763c0B2, null, null, null, null, null, null, null, 8189);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(10, 0);
            ColorStateList colorStateListA3 = x.a(typedArray, context, 9);
            C35763c0 c35763c0B3 = colorStateListA3 != null ? C35771d0.b(colorStateListA3) : null;
            ColorStateList colorStateListA4 = x.a(typedArray, context, 1);
            return new b(f12, f13, new C5267b(colorStateListA4 != null ? C35771d0.b(colorStateListA4) : null, typedArray.getDimension(2, 1.0f), typedArray.getDimension(3, 2.0f), typedArray.getDimension(5, 2.0f), typedArray.getDimension(4, 0.0f)), nVarA, nVarA2, c35763c0B, c35763c0B2, dimensionPixelSize, c35763c0B3);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178996u);
            b bVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return bVarB;
        }

        public a() {
        }
    }

    public b() {
        this(0.0f, 0.0f, null, null, null, null, null, 0, null, 511, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f179094a, bVar.f179094a) == 0 && Float.compare(this.f179095b, bVar.f179095b) == 0 && L.f(this.f179096c, bVar.f179096c) && L.f(this.f179097d, bVar.f179097d) && L.f(this.f179098e, bVar.f179098e) && L.f(this.f179099f, bVar.f179099f) && L.f(this.f179100g, bVar.f179100g) && this.f179101h == bVar.f179101h && L.f(this.f179102i, bVar.f179102i);
    }

    public final int hashCode() {
        int iD2 = r.d(this.f179095b, Float.hashCode(this.f179094a) * 31, 31);
        C5267b c5267b = this.f179096c;
        int iHashCode = (iD2 + (c5267b == null ? 0 : c5267b.hashCode())) * 31;
        n nVar = this.f179097d;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.f179098e;
        int iHashCode3 = (iHashCode2 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        C35763c0 c35763c0 = this.f179099f;
        int iHashCode4 = (iHashCode3 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f179100g;
        int iE2 = r.e(this.f179101h, (iHashCode4 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31);
        C35763c0 c35763c03 = this.f179102i;
        return iE2 + (c35763c03 != null ? c35763c03.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DescriptionParameterItemStyle(leftWeight=" + this.f179094a + ", rightWeight=" + this.f179095b + ", dotsStyle=" + this.f179096c + ", leftTextStyle=" + this.f179097d + ", rightTextStyle=" + this.f179098e + ", leftTextColor=" + this.f179099f + ", rightTextColor=" + this.f179100g + ", iconLeftPadding=" + this.f179101h + ", iconColor=" + this.f179102i + ')';
    }

    public b(float f12, float f13, @l C5267b c5267b, @l n nVar, @l n nVar2, @l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @l C35763c0 c35763c03) {
        this.f179094a = f12;
        this.f179095b = f13;
        this.f179096c = c5267b;
        this.f179097d = nVar;
        this.f179098e = nVar2;
        this.f179099f = c35763c0;
        this.f179100g = c35763c02;
        this.f179101h = i12;
        this.f179102i = c35763c03;
    }

    /* compiled from: DescriptionParameterItemStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/item/b$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.description_list.parameter_line.item.b$b, reason: collision with other inner class name */
    public static final /* data */ class C5267b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C35763c0 f179103a;

        /* renamed from: b, reason: collision with root package name */
        public final float f179104b;

        /* renamed from: c, reason: collision with root package name */
        public final float f179105c;

        /* renamed from: d, reason: collision with root package name */
        public final float f179106d;

        /* renamed from: e, reason: collision with root package name */
        public final float f179107e;

        public C5267b(@l C35763c0 c35763c0, float f12, float f13, float f14, float f15) {
            this.f179103a = c35763c0;
            this.f179104b = f12;
            this.f179105c = f13;
            this.f179106d = f14;
            this.f179107e = f15;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5267b)) {
                return false;
            }
            C5267b c5267b = (C5267b) obj;
            return L.f(this.f179103a, c5267b.f179103a) && Float.compare(this.f179104b, c5267b.f179104b) == 0 && Float.compare(this.f179105c, c5267b.f179105c) == 0 && Float.compare(this.f179106d, c5267b.f179106d) == 0 && Float.compare(this.f179107e, c5267b.f179107e) == 0;
        }

        public final int hashCode() {
            C35763c0 c35763c0 = this.f179103a;
            return Float.hashCode(this.f179107e) + r.d(this.f179106d, r.d(this.f179105c, r.d(this.f179104b, (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31, 31), 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DotsStyle(color=");
            sb2.append(this.f179103a);
            sb2.append(", width=");
            sb2.append(this.f179104b);
            sb2.append(", interval=");
            sb2.append(this.f179105c);
            sb2.append(", strokeWidth=");
            sb2.append(this.f179106d);
            sb2.append(", offset=");
            return r.k(')', this.f179107e, sb2);
        }

        public /* synthetic */ C5267b(C35763c0 c35763c0, float f12, float f13, float f14, float f15, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : c35763c0, (i12 & 2) != 0 ? 0.0f : f12, (i12 & 4) != 0 ? 0.0f : f13, f14, (i12 & 16) != 0 ? 0.0f : f15);
        }
    }

    public /* synthetic */ b(float f12, float f13, C5267b c5267b, n nVar, n nVar2, C35763c0 c35763c0, C35763c0 c35763c02, int i12, C35763c0 c35763c03, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0.0f : f12, (i13 & 2) == 0 ? f13 : 0.0f, (i13 & 4) != 0 ? null : c5267b, (i13 & 8) != 0 ? null : nVar, (i13 & 16) != 0 ? null : nVar2, (i13 & 32) != 0 ? null : c35763c0, (i13 & 64) != 0 ? null : c35763c02, (i13 & 128) != 0 ? 0 : i12, (i13 & 256) == 0 ? c35763c03 : null);
    }
}
