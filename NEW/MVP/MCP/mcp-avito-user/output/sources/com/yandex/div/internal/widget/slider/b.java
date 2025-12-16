package com.yandex.div.internal.widget.slider;

import Y61.k;
import Y61.l;
import android.graphics.Typeface;
import androidx.appcompat.app.r;
import j.InterfaceC42156l;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SliderTextStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/slider/b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f370338a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Typeface f370339b;

    /* renamed from: c, reason: collision with root package name */
    public final float f370340c;

    /* renamed from: d, reason: collision with root package name */
    public final float f370341d;

    /* renamed from: e, reason: collision with root package name */
    public final int f370342e;

    public b(@U float f12, @k Typeface typeface, @U float f13, @U float f14, @InterfaceC42156l int i12) {
        this.f370338a = f12;
        this.f370339b = typeface;
        this.f370340c = f13;
        this.f370341d = f14;
        this.f370342e = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.valueOf(this.f370338a).equals(Float.valueOf(bVar.f370338a)) && L.f(this.f370339b, bVar.f370339b) && Float.valueOf(this.f370340c).equals(Float.valueOf(bVar.f370340c)) && Float.valueOf(this.f370341d).equals(Float.valueOf(bVar.f370341d)) && this.f370342e == bVar.f370342e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f370342e) + r.d(this.f370341d, r.d(this.f370340c, (this.f370339b.hashCode() + (Float.hashCode(this.f370338a) * 31)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderTextStyle(fontSize=");
        sb2.append(this.f370338a);
        sb2.append(", fontWeight=");
        sb2.append(this.f370339b);
        sb2.append(", offsetX=");
        sb2.append(this.f370340c);
        sb2.append(", offsetY=");
        sb2.append(this.f370341d);
        sb2.append(", textColor=");
        return r.t(sb2, this.f370342e, ')');
    }
}
