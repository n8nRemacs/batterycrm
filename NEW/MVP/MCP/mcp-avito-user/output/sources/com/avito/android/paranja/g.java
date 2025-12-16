package com.avito.android.paranja;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.tooltip.ImageGravity;
import com.avito.android.lib.design.tooltip.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParanjaState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paranja/g;", "", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final q f210879a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f210880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final CharSequence f210881c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CharSequence f210882d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final CharSequence f210883e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f210884f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ImageGravity f210885g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Drawable f210886h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f210887i;

    public g() {
        this(null, false, null, null, null, null, null, null, false, 511, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f210879a, gVar.f210879a) && this.f210880b == gVar.f210880b && L.f(this.f210881c, gVar.f210881c) && L.f(this.f210882d, gVar.f210882d) && L.f(this.f210883e, gVar.f210883e) && L.f(this.f210884f, gVar.f210884f) && this.f210885g == gVar.f210885g && L.f(this.f210886h, gVar.f210886h) && this.f210887i == gVar.f210887i;
    }

    public final int hashCode() {
        q qVar = this.f210879a;
        int i12 = r.i((qVar == null ? 0 : qVar.hashCode()) * 31, 31, this.f210880b);
        CharSequence charSequence = this.f210881c;
        int iHashCode = (i12 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f210882d;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f210883e;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Drawable drawable = this.f210884f;
        int iHashCode4 = (iHashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        ImageGravity imageGravity = this.f210885g;
        int iHashCode5 = (iHashCode4 + (imageGravity == null ? 0 : imageGravity.hashCode())) * 31;
        Drawable drawable2 = this.f210886h;
        return Boolean.hashCode(this.f210887i) + ((iHashCode5 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParanjaTooltipState(tooltipPosition=");
        sb2.append(this.f210879a);
        sb2.append(", tailVisible=");
        sb2.append(this.f210880b);
        sb2.append(", title=");
        sb2.append((Object) this.f210881c);
        sb2.append(", body=");
        sb2.append((Object) this.f210882d);
        sb2.append(", buttonText=");
        sb2.append((Object) this.f210883e);
        sb2.append(", image=");
        sb2.append(this.f210884f);
        sb2.append(", imageGravity=");
        sb2.append(this.f210885g);
        sb2.append(", background=");
        sb2.append(this.f210886h);
        sb2.append(", closeButtonVisible=");
        return r.x(sb2, this.f210887i, ')');
    }

    public g(q qVar, boolean z12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Drawable drawable, ImageGravity imageGravity, Drawable drawable2, boolean z13, int i12, C42822w c42822w) {
        qVar = (i12 & 1) != 0 ? null : qVar;
        z12 = (i12 & 2) != 0 ? true : z12;
        charSequence = (i12 & 4) != 0 ? null : charSequence;
        charSequence2 = (i12 & 8) != 0 ? null : charSequence2;
        charSequence3 = (i12 & 16) != 0 ? null : charSequence3;
        drawable = (i12 & 32) != 0 ? null : drawable;
        imageGravity = (i12 & 64) != 0 ? null : imageGravity;
        drawable2 = (i12 & 128) != 0 ? null : drawable2;
        z13 = (i12 & 256) != 0 ? true : z13;
        this.f210879a = qVar;
        this.f210880b = z12;
        this.f210881c = charSequence;
        this.f210882d = charSequence2;
        this.f210883e = charSequence3;
        this.f210884f = drawable;
        this.f210885g = imageGravity;
        this.f210886h = drawable2;
        this.f210887i = z13;
    }
}
