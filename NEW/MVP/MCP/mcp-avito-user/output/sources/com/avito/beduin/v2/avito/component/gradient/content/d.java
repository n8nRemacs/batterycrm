package com.avito.beduin.v2.avito.component.gradient.content;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GradientContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/gradient/content/d;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r f334364a;

    /* renamed from: b, reason: collision with root package name */
    public final float f334365b;

    public d(float f12, @k r rVar) {
        this.f334364a = rVar;
        this.f334365b = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f334364a, dVar.f334364a) && Float.compare(this.f334365b, dVar.f334365b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f334365b) + (this.f334364a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LinearGradientColor(color=");
        sb2.append(this.f334364a);
        sb2.append(", position=");
        return androidx.appcompat.app.r.k(')', this.f334365b, sb2);
    }
}
