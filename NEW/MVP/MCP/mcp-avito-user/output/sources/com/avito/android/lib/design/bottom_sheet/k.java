package com.avito.android.lib.design.bottom_sheet;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/k;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f178541a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final CharSequence f178542b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f178543c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CharSequence f178544d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f178545e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final CharSequence f178546f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f178547g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final CharSequence f178548h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f178549i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f178550j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Drawable f178551k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Drawable f178552l;

    public k() {
        throw null;
    }

    public k(String str, CharSequence charSequence, ColorStateList colorStateList, CharSequence charSequence2, ColorStateList colorStateList2, CharSequence charSequence3, ColorStateList colorStateList3, CharSequence charSequence4, ColorStateList colorStateList4, Y41.a aVar, Drawable drawable, Drawable drawable2, int i12, C42822w c42822w) {
        charSequence = (i12 & 2) != 0 ? null : charSequence;
        colorStateList = (i12 & 4) != 0 ? null : colorStateList;
        charSequence2 = (i12 & 8) != 0 ? null : charSequence2;
        colorStateList2 = (i12 & 16) != 0 ? null : colorStateList2;
        charSequence3 = (i12 & 32) != 0 ? null : charSequence3;
        colorStateList3 = (i12 & 64) != 0 ? null : colorStateList3;
        charSequence4 = (i12 & 128) != 0 ? null : charSequence4;
        colorStateList4 = (i12 & 256) != 0 ? null : colorStateList4;
        aVar = (i12 & 512) != 0 ? null : aVar;
        drawable = (i12 & 1024) != 0 ? null : drawable;
        drawable2 = (i12 & 2048) != 0 ? null : drawable2;
        this.f178541a = str;
        this.f178542b = charSequence;
        this.f178543c = colorStateList;
        this.f178544d = charSequence2;
        this.f178545e = colorStateList2;
        this.f178546f = charSequence3;
        this.f178547g = colorStateList3;
        this.f178548h = charSequence4;
        this.f178549i = colorStateList4;
        this.f178550j = aVar;
        this.f178551k = drawable;
        this.f178552l = drawable2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f178541a, kVar.f178541a) && L.f(this.f178542b, kVar.f178542b) && L.f(this.f178543c, kVar.f178543c) && L.f(this.f178544d, kVar.f178544d) && L.f(this.f178545e, kVar.f178545e) && L.f(this.f178546f, kVar.f178546f) && L.f(this.f178547g, kVar.f178547g) && L.f(this.f178548h, kVar.f178548h) && L.f(this.f178549i, kVar.f178549i) && L.f(this.f178550j, kVar.f178550j) && L.f(this.f178551k, kVar.f178551k) && L.f(this.f178552l, kVar.f178552l);
    }

    public final int hashCode() {
        int iHashCode = this.f178541a.hashCode() * 31;
        CharSequence charSequence = this.f178542b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ColorStateList colorStateList = this.f178543c;
        int iHashCode3 = (iHashCode2 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
        CharSequence charSequence2 = this.f178544d;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        ColorStateList colorStateList2 = this.f178545e;
        int iHashCode5 = (iHashCode4 + (colorStateList2 == null ? 0 : colorStateList2.hashCode())) * 31;
        CharSequence charSequence3 = this.f178546f;
        int iHashCode6 = (iHashCode5 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        ColorStateList colorStateList3 = this.f178547g;
        int iHashCode7 = (iHashCode6 + (colorStateList3 == null ? 0 : colorStateList3.hashCode())) * 31;
        CharSequence charSequence4 = this.f178548h;
        int iHashCode8 = (iHashCode7 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        ColorStateList colorStateList4 = this.f178549i;
        int iHashCode9 = (iHashCode8 + (colorStateList4 == null ? 0 : colorStateList4.hashCode())) * 31;
        Y41.a<G0> aVar = this.f178550j;
        int iHashCode10 = (iHashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Drawable drawable = this.f178551k;
        int iHashCode11 = (iHashCode10 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f178552l;
        return iHashCode11 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BottomSheetListItem(id=" + this.f178541a + ", title=" + ((Object) this.f178542b) + ", titleColor=" + this.f178543c + ", subtitle=" + ((Object) this.f178544d) + ", subtitleColor=" + this.f178545e + ", message=" + ((Object) this.f178546f) + ", messageColor=" + this.f178547g + ", link=" + ((Object) this.f178548h) + ", linkColor=" + this.f178549i + ", onLinkTap=" + this.f178550j + ", leftIcon=" + this.f178551k + ", rightIcon=" + this.f178552l + ')';
    }
}
