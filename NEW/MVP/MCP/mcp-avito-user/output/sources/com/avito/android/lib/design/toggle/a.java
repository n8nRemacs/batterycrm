package com.avito.android.lib.design.toggle;

import LV.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.M5;
import com.avito.android.util.N5;
import j.InterfaceC42165v;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ToggleStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/toggle/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final C5326a f181173m = new C5326a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f181174a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final M5 f181175b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final M5 f181176c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ColorStateList f181177d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final M5 f181178e;

    /* renamed from: f, reason: collision with root package name */
    public final int f181179f;

    /* renamed from: g, reason: collision with root package name */
    public final int f181180g;

    /* renamed from: h, reason: collision with root package name */
    public final int f181181h;

    /* renamed from: i, reason: collision with root package name */
    public final int f181182i;

    /* renamed from: j, reason: collision with root package name */
    public final int f181183j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f181184k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f181185l;

    /* compiled from: ToggleStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/toggle/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/toggle/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.toggle.a$a, reason: collision with other inner class name */
    public static final class C5326a implements c<a> {
        public /* synthetic */ C5326a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@f0 int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178944R0);
            a aVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarC;
        }

        @k
        public static a c(@k TypedArray typedArray, @k Context context) {
            int resourceId = typedArray.getResourceId(6, 0);
            ColorStateList colorStateListA = x.a(typedArray, context, 7);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(4, 0);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 0);
            ColorStateList colorStateListA3 = x.a(typedArray, context, 1);
            ColorStateList colorStateListA4 = x.a(typedArray, context, 2);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(11, 0);
            boolean z12 = typedArray.getBoolean(9, false);
            boolean z13 = typedArray.getBoolean(10, false);
            C5326a c5326a = a.f181173m;
            int dimensionPixelSize4 = typedArray.hasValue(12) ? typedArray.getDimensionPixelSize(12, 0) : -1;
            int dimensionPixelSize5 = typedArray.hasValue(5) ? typedArray.getDimensionPixelSize(5, 0) : -1;
            return new a(Integer.valueOf(resourceId), colorStateListA != null ? N5.a(colorStateListA) : null, colorStateListA2 != null ? N5.a(colorStateListA2) : null, colorStateListA3, colorStateListA4 != null ? N5.a(colorStateListA4) : null, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize3, z12, z13);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C5326a() {
        }
    }

    public a() {
        this(null, null, null, null, null, 0, 0, 0, 0, 0, false, false, 4095, null);
    }

    public static a a(a aVar, M5 m52, M5 m53, M5 m54, int i12, int i13, int i14, int i15, int i16) {
        Integer num = aVar.f181174a;
        ColorStateList colorStateList = aVar.f181177d;
        boolean z12 = aVar.f181184k;
        boolean z13 = aVar.f181185l;
        aVar.getClass();
        return new a(num, m52, m53, colorStateList, m54, i12, i13, i14, i15, i16, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f181174a, aVar.f181174a) && L.f(this.f181175b, aVar.f181175b) && L.f(this.f181176c, aVar.f181176c) && L.f(this.f181177d, aVar.f181177d) && L.f(this.f181178e, aVar.f181178e) && this.f181179f == aVar.f181179f && this.f181180g == aVar.f181180g && this.f181181h == aVar.f181181h && this.f181182i == aVar.f181182i && this.f181183j == aVar.f181183j && this.f181184k == aVar.f181184k && this.f181185l == aVar.f181185l;
    }

    public final int hashCode() {
        Integer num = this.f181174a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        M5 m52 = this.f181175b;
        int iHashCode2 = (iHashCode + (m52 == null ? 0 : m52.hashCode())) * 31;
        M5 m53 = this.f181176c;
        int iHashCode3 = (iHashCode2 + (m53 == null ? 0 : m53.hashCode())) * 31;
        ColorStateList colorStateList = this.f181177d;
        int iHashCode4 = (iHashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
        M5 m54 = this.f181178e;
        return Boolean.hashCode(this.f181185l) + r.i(r.e(this.f181183j, r.e(this.f181182i, r.e(this.f181181h, r.e(this.f181180g, r.e(this.f181179f, (iHashCode4 + (m54 != null ? m54.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.f181184k);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleStyle(icon=");
        sb2.append(this.f181174a);
        sb2.append(", iconColor=");
        sb2.append(this.f181175b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f181176c);
        sb2.append(", rippleColor=");
        sb2.append(this.f181177d);
        sb2.append(", borderColor=");
        sb2.append(this.f181178e);
        sb2.append(", borderWidth=");
        sb2.append(this.f181179f);
        sb2.append(", cornerRadius=");
        sb2.append(this.f181180g);
        sb2.append(", width=");
        sb2.append(this.f181181h);
        sb2.append(", height=");
        sb2.append(this.f181182i);
        sb2.append(", padding=");
        sb2.append(this.f181183j);
        sb2.append(", isError=");
        sb2.append(this.f181184k);
        sb2.append(", isHaptic=");
        return r.x(sb2, this.f181185l, ')');
    }

    public a(@InterfaceC42165v @l Integer num, @l M5 m52, @l M5 m53, @l ColorStateList colorStateList, @l M5 m54, int i12, int i13, int i14, int i15, int i16, boolean z12, boolean z13) {
        this.f181174a = num;
        this.f181175b = m52;
        this.f181176c = m53;
        this.f181177d = colorStateList;
        this.f181178e = m54;
        this.f181179f = i12;
        this.f181180g = i13;
        this.f181181h = i14;
        this.f181182i = i15;
        this.f181183j = i16;
        this.f181184k = z12;
        this.f181185l = z13;
    }

    public /* synthetic */ a(Integer num, M5 m52, M5 m53, ColorStateList colorStateList, M5 m54, int i12, int i13, int i14, int i15, int i16, boolean z12, boolean z13, int i17, C42822w c42822w) {
        this((i17 & 1) != 0 ? null : num, (i17 & 2) != 0 ? null : m52, (i17 & 4) != 0 ? null : m53, (i17 & 8) != 0 ? null : colorStateList, (i17 & 16) == 0 ? m54 : null, (i17 & 32) != 0 ? 0 : i12, (i17 & 64) != 0 ? 0 : i13, (i17 & 128) != 0 ? 0 : i14, (i17 & 256) != 0 ? -1 : i15, (i17 & 512) == 0 ? i16 : -1, (i17 & 1024) != 0 ? false : z12, (i17 & 2048) == 0 ? z13 : false);
    }
}
