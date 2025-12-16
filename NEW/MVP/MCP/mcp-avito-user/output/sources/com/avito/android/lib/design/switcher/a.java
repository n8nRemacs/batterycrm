package com.avito.android.lib.design.switcher;

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
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SwitcherStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/switcher/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C5304a f180669j = new C5304a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f180670a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180671b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180672c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180673d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180674e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final M5 f180675f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final M5 f180676g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final M5 f180677h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f180678i;

    /* compiled from: SwitcherStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/switcher/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/switcher/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.switcher.a$a, reason: collision with other inner class name */
    public static final class C5304a implements c<a> {
        public /* synthetic */ C5304a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@k TypedArray typedArray, @k Context context) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(8, -1);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(9, -1);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(5, -1);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize5 = typedArray.getDimensionPixelSize(7, 0);
            ColorStateList colorStateListA = x.a(typedArray, context, 2);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 6);
            ColorStateList colorStateListA3 = x.a(typedArray, context, 4);
            boolean z12 = typedArray.getBoolean(1, false);
            return new a(dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize5, colorStateListA2 != null ? N5.a(colorStateListA2) : null, colorStateListA != null ? N5.a(colorStateListA) : null, colorStateListA3 != null ? N5.a(colorStateListA3) : null, z12);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178926I0);
            a aVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarB;
        }

        public C5304a() {
        }
    }

    public a() {
        this(0, 0, 0, 0, 0, null, null, null, false, 511, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f180670a == aVar.f180670a && this.f180671b == aVar.f180671b && this.f180672c == aVar.f180672c && this.f180673d == aVar.f180673d && this.f180674e == aVar.f180674e && L.f(this.f180675f, aVar.f180675f) && L.f(this.f180676g, aVar.f180676g) && L.f(this.f180677h, aVar.f180677h) && this.f180678i == aVar.f180678i;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f180674e, r.e(this.f180673d, r.e(this.f180672c, r.e(this.f180671b, Integer.hashCode(this.f180670a) * 31, 31), 31), 31), 31);
        M5 m52 = this.f180675f;
        int iHashCode = (iE2 + (m52 == null ? 0 : m52.hashCode())) * 31;
        M5 m53 = this.f180676g;
        int iHashCode2 = (iHashCode + (m53 == null ? 0 : m53.hashCode())) * 31;
        M5 m54 = this.f180677h;
        return Boolean.hashCode(this.f180678i) + ((iHashCode2 + (m54 != null ? m54.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitcherStyle(thumbSize=");
        sb2.append(this.f180670a);
        sb2.append(", trackWidth=");
        sb2.append(this.f180671b);
        sb2.append(", trackHeight=");
        sb2.append(this.f180672c);
        sb2.append(", borderWidth=");
        sb2.append(this.f180673d);
        sb2.append(", trackCornerRadius=");
        sb2.append(this.f180674e);
        sb2.append(", trackColor=");
        sb2.append(this.f180675f);
        sb2.append(", thumbColor=");
        sb2.append(this.f180676g);
        sb2.append(", borderColor=");
        sb2.append(this.f180677h);
        sb2.append(", isHaptic=");
        return r.x(sb2, this.f180678i, ')');
    }

    public a(int i12, int i13, int i14, int i15, int i16, @l M5 m52, @l M5 m53, @l M5 m54, boolean z12) {
        this.f180670a = i12;
        this.f180671b = i13;
        this.f180672c = i14;
        this.f180673d = i15;
        this.f180674e = i16;
        this.f180675f = m52;
        this.f180676g = m53;
        this.f180677h = m54;
        this.f180678i = z12;
    }

    public /* synthetic */ a(int i12, int i13, int i14, int i15, int i16, M5 m52, M5 m53, M5 m54, boolean z12, int i17, C42822w c42822w) {
        this((i17 & 1) != 0 ? 0 : i12, (i17 & 2) != 0 ? 0 : i13, (i17 & 4) != 0 ? 0 : i14, (i17 & 8) != 0 ? 0 : i15, (i17 & 16) != 0 ? 0 : i16, (i17 & 32) != 0 ? null : m52, (i17 & 64) != 0 ? null : m53, (i17 & 128) == 0 ? m54 : null, (i17 & 256) == 0 ? z12 : false);
    }
}
