package com.avito.android.lib.design.circular_counter;

import LV.c;
import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CircularCounterStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/b;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f178833g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C35763c0 f178834a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C35763c0 f178835b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Float f178836c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f178837d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f178838e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final n f178839f;

    /* compiled from: CircularCounterStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/b$a;", "LLV/c;", "Lcom/avito/android/lib/design/circular_counter/b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c<b> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static b b(@k TypedArray typedArray, @k Context context) {
            Integer numValueOf = typedArray.hasValue(1) ? Integer.valueOf(typedArray.getDimensionPixelSize(1, 0)) : null;
            Float fValueOf = typedArray.hasValue(5) ? Float.valueOf(typedArray.getDimension(5, 0.0f)) : null;
            Integer numValueOf2 = typedArray.hasValue(2) ? Integer.valueOf(typedArray.getDimensionPixelSize(2, 0)) : null;
            ColorStateList colorStateListA = x.a(typedArray, context, 3);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 4);
            return new b(c35763c0B, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, fValueOf, numValueOf2, numValueOf, AK.c.d(typedArray, 0, 0, d.f180938a, context));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178978l);
            b bVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return bVarB;
        }

        public a() {
        }
    }

    public b() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f178834a, bVar.f178834a) && L.f(this.f178835b, bVar.f178835b) && L.f(this.f178836c, bVar.f178836c) && L.f(this.f178837d, bVar.f178837d) && L.f(this.f178838e, bVar.f178838e) && L.f(this.f178839f, bVar.f178839f);
    }

    public final int hashCode() {
        C35763c0 c35763c0 = this.f178834a;
        int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
        C35763c0 c35763c02 = this.f178835b;
        int iHashCode2 = (iHashCode + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31;
        Float f12 = this.f178836c;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num = this.f178837d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f178838e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        n nVar = this.f178839f;
        return iHashCode5 + (nVar != null ? nVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CircularCounterStyle(progressIndicatorColor=" + this.f178834a + ", progressRailColor=" + this.f178835b + ", progressWidth=" + this.f178836c + ", diameter=" + this.f178837d + ", contentIconSize=" + this.f178838e + ", contentAppearance=" + this.f178839f + ')';
    }

    public b(@l C35763c0 c35763c0, @l C35763c0 c35763c02, @l Float f12, @l Integer num, @l Integer num2, @l n nVar) {
        this.f178834a = c35763c0;
        this.f178835b = c35763c02;
        this.f178836c = f12;
        this.f178837d = num;
        this.f178838e = num2;
        this.f178839f = nVar;
    }

    public /* synthetic */ b(C35763c0 c35763c0, C35763c0 c35763c02, Float f12, Integer num, Integer num2, n nVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c35763c0, (i12 & 2) != 0 ? null : c35763c02, (i12 & 4) != 0 ? null : f12, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : num2, (i12 & 32) != 0 ? null : nVar);
    }
}
