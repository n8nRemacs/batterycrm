package PK0;

import android.graphics.Typeface;
import com.avito.android.lib.design.icons.TextIconWeight;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextStyleDataProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPK0/n;", "LQK0/a;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n implements QK0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Float f12987a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C35763c0 f12988b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Typeface f12989c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12990d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f12991e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f12992f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Integer f12993g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final C35763c0 f12994h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Typeface f12995i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextIconWeight f12996j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f12997k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Integer f12998l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final b f12999m;

    public n(@Y61.l Float f12, @Y61.l C35763c0 c35763c0, @Y61.l Typeface typeface, int i12, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l C35763c0 c35763c02, @Y61.l Typeface typeface2, @Y61.l TextIconWeight textIconWeight, @Y61.l Integer num4, @Y61.l Integer num5, @Y61.l b bVar) {
        this.f12987a = f12;
        this.f12988b = c35763c0;
        this.f12989c = typeface;
        this.f12990d = i12;
        this.f12991e = num;
        this.f12992f = num2;
        this.f12993g = num3;
        this.f12994h = c35763c02;
        this.f12995i = typeface2;
        this.f12996j = textIconWeight;
        this.f12997k = num4;
        this.f12998l = num5;
        this.f12999m = bVar;
    }

    public static n a(n nVar, Float f12, C35763c0 c35763c0, Typeface typeface, Integer num, Integer num2, C35763c0 c35763c02, Integer num3, Integer num4, b bVar, int i12) {
        Float f13 = (i12 & 1) != 0 ? nVar.f12987a : f12;
        C35763c0 c35763c03 = (i12 & 2) != 0 ? nVar.f12988b : c35763c0;
        Typeface typeface2 = (i12 & 4) != 0 ? nVar.f12989c : typeface;
        int i13 = nVar.f12990d;
        Integer num5 = (i12 & 16) != 0 ? nVar.f12991e : num;
        Integer num6 = nVar.f12992f;
        Integer num7 = (i12 & 64) != 0 ? nVar.f12993g : num2;
        C35763c0 c35763c04 = (i12 & 128) != 0 ? nVar.f12994h : c35763c02;
        Typeface typeface3 = nVar.f12995i;
        TextIconWeight textIconWeight = nVar.f12996j;
        Integer num8 = (i12 & 1024) != 0 ? nVar.f12997k : num3;
        Integer num9 = (i12 & 2048) != 0 ? nVar.f12998l : num4;
        b bVar2 = (i12 & 4096) != 0 ? nVar.f12999m : bVar;
        nVar.getClass();
        return new n(f13, c35763c03, typeface2, i13, num5, num6, num7, c35763c04, typeface3, textIconWeight, num8, num9, bVar2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f12987a, nVar.f12987a) && L.f(this.f12988b, nVar.f12988b) && L.f(this.f12989c, nVar.f12989c) && this.f12990d == nVar.f12990d && L.f(this.f12991e, nVar.f12991e) && L.f(this.f12992f, nVar.f12992f) && L.f(this.f12993g, nVar.f12993g) && L.f(this.f12994h, nVar.f12994h) && L.f(this.f12995i, nVar.f12995i) && this.f12996j == nVar.f12996j && L.f(this.f12997k, nVar.f12997k) && L.f(this.f12998l, nVar.f12998l) && L.f(this.f12999m, nVar.f12999m);
    }

    public final int hashCode() {
        Float f12 = this.f12987a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        C35763c0 c35763c0 = this.f12988b;
        int iHashCode2 = (iHashCode + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        Typeface typeface = this.f12989c;
        int iE2 = androidx.appcompat.app.r.e(this.f12990d, (iHashCode2 + (typeface == null ? 0 : typeface.hashCode())) * 31, 31);
        Integer num = this.f12991e;
        int iHashCode3 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f12992f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f12993g;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C35763c0 c35763c02 = this.f12994h;
        int iHashCode6 = (iHashCode5 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31;
        Typeface typeface2 = this.f12995i;
        int iHashCode7 = (iHashCode6 + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        TextIconWeight textIconWeight = this.f12996j;
        int iHashCode8 = (iHashCode7 + (textIconWeight == null ? 0 : textIconWeight.hashCode())) * 31;
        Integer num4 = this.f12997k;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f12998l;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        b bVar = this.f12999m;
        return iHashCode10 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TextStyleData(textSize=" + this.f12987a + ", textColor=" + this.f12988b + ", font=" + this.f12989c + ", linkStyle=" + this.f12990d + ", lineHeight=" + this.f12991e + ", paragraphSpacing=" + this.f12992f + ", textColorLink=" + this.f12993g + ", textIconColor=" + this.f12994h + ", textIconFont=" + this.f12995i + ", iconWeight=" + this.f12996j + ", firstBaselineToTopHeight=" + this.f12997k + ", lastBaselineToBottomHeight=" + this.f12998l + ", expandableStyle=" + this.f12999m + ')';
    }

    public /* synthetic */ n(Float f12, C35763c0 c35763c0, Typeface typeface, int i12, Integer num, Integer num2, Integer num3, C35763c0 c35763c02, Typeface typeface2, TextIconWeight textIconWeight, Integer num4, Integer num5, b bVar, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : f12, (i13 & 2) != 0 ? null : c35763c0, (i13 & 4) != 0 ? null : typeface, i12, num, num2, num3, (i13 & 128) != 0 ? null : c35763c02, typeface2, (i13 & 512) != 0 ? null : textIconWeight, num4, num5, (i13 & 4096) != 0 ? null : bVar);
    }
}
