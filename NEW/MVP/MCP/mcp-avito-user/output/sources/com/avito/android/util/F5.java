package com.avito.android.util;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextAppearanceParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/F5;", "", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class F5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Typeface f318604a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f318605b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f318606c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Float f318607d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f318608e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f318609f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Typeface f318610g;

    public F5() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F5)) {
            return false;
        }
        F5 f52 = (F5) obj;
        return kotlin.jvm.internal.L.f(this.f318604a, f52.f318604a) && kotlin.jvm.internal.L.f(this.f318605b, f52.f318605b) && kotlin.jvm.internal.L.f(this.f318606c, f52.f318606c) && kotlin.jvm.internal.L.f(this.f318607d, f52.f318607d) && kotlin.jvm.internal.L.f(this.f318608e, f52.f318608e) && kotlin.jvm.internal.L.f(this.f318609f, f52.f318609f) && kotlin.jvm.internal.L.f(this.f318610g, f52.f318610g);
    }

    public final int hashCode() {
        Typeface typeface = this.f318604a;
        int iHashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        ColorStateList colorStateList = this.f318605b;
        int iHashCode2 = (iHashCode + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
        ColorStateList colorStateList2 = this.f318606c;
        int iHashCode3 = (iHashCode2 + (colorStateList2 == null ? 0 : colorStateList2.hashCode())) * 31;
        Float f12 = this.f318607d;
        int iHashCode4 = (iHashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num = this.f318608e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f318609f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Typeface typeface2 = this.f318610g;
        return iHashCode6 + (typeface2 != null ? typeface2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TextAppearanceParams(typeface=" + this.f318604a + ", textColor=" + this.f318605b + ", textColorLink=" + this.f318606c + ", textSize=" + this.f318607d + ", lineHeight=" + this.f318608e + ", paragraphSpacing=" + this.f318609f + ", iconFont=" + this.f318610g + ')';
    }

    public F5(@Y61.l Typeface typeface, @Y61.l ColorStateList colorStateList, @Y61.l ColorStateList colorStateList2, @j.U @Y61.l Float f12, @j.U @Y61.l Integer num, @j.U @Y61.l Integer num2, @Y61.l Typeface typeface2) {
        this.f318604a = typeface;
        this.f318605b = colorStateList;
        this.f318606c = colorStateList2;
        this.f318607d = f12;
        this.f318608e = num;
        this.f318609f = num2;
        this.f318610g = typeface2;
    }

    public /* synthetic */ F5(Typeface typeface, ColorStateList colorStateList, ColorStateList colorStateList2, Float f12, Integer num, Integer num2, Typeface typeface2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : typeface, (i12 & 2) != 0 ? null : colorStateList, (i12 & 4) != 0 ? null : colorStateList2, (i12 & 8) != 0 ? null : f12, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : num2, (i12 & 64) != 0 ? null : typeface2);
    }
}
