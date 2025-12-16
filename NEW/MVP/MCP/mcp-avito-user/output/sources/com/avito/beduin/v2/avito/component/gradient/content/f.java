package com.avito.beduin.v2.avito.component.gradient.content;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GradientContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/gradient/content/f;", "Lcom/avito/beduin/v2/avito/component/gradient/content/b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f extends b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f334367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f334368b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ET0.a<d> f334369c;

    public f() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, int i12, ET0.a aVar, int i13, C42822w c42822w) {
        super(null);
        str = (i13 & 1) != 0 ? "manual" : str;
        this.f334367a = str;
        this.f334368b = i12;
        this.f334369c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f334367a, fVar.f334367a) && this.f334368b == fVar.f334368b && L.f(this.f334369c, fVar.f334369c);
    }

    public final int hashCode() {
        return this.f334369c.f4014b.hashCode() + r.e(this.f334368b, this.f334367a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "ManualContent(mode=" + this.f334367a + ", angle=" + this.f334368b + ", colors=" + this.f334369c + ')';
    }
}
