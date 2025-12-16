package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TransferParameters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/s;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    public final double f39464a;

    /* renamed from: b, reason: collision with root package name */
    public final double f39465b;

    /* renamed from: c, reason: collision with root package name */
    public final double f39466c;

    /* renamed from: d, reason: collision with root package name */
    public final double f39467d;

    /* renamed from: e, reason: collision with root package name */
    public final double f39468e;

    /* renamed from: f, reason: collision with root package name */
    public final double f39469f;

    /* renamed from: g, reason: collision with root package name */
    public final double f39470g;

    public s(double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f39464a = d12;
        this.f39465b = d13;
        this.f39466c = d14;
        this.f39467d = d15;
        this.f39468e = d16;
        this.f39469f = d17;
        this.f39470g = d18;
        if (Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d18) || Double.isNaN(d12)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 == -2.0d || d12 == -3.0d) {
            return;
        }
        if (d16 < 0.0d || d16 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d16);
        }
        if (d16 == 0.0d && (d13 == 0.0d || d12 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d16 >= 1.0d && d15 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d13 == 0.0d || d12 == 0.0d) && d15 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d15 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d13 < 0.0d || d12 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.f39464a, sVar.f39464a) == 0 && Double.compare(this.f39465b, sVar.f39465b) == 0 && Double.compare(this.f39466c, sVar.f39466c) == 0 && Double.compare(this.f39467d, sVar.f39467d) == 0 && Double.compare(this.f39468e, sVar.f39468e) == 0 && Double.compare(this.f39469f, sVar.f39469f) == 0 && Double.compare(this.f39470g, sVar.f39470g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f39470g) + e.d(e.d(e.d(e.d(e.d(Double.hashCode(this.f39464a) * 31, 31, this.f39465b), 31, this.f39466c), 31, this.f39467d), 31, this.f39468e), 31, this.f39469f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransferParameters(gamma=");
        sb2.append(this.f39464a);
        sb2.append(", a=");
        sb2.append(this.f39465b);
        sb2.append(", b=");
        sb2.append(this.f39466c);
        sb2.append(", c=");
        sb2.append(this.f39467d);
        sb2.append(", d=");
        sb2.append(this.f39468e);
        sb2.append(", e=");
        sb2.append(this.f39469f);
        sb2.append(", f=");
        return e.o(sb2, this.f39470g, ')');
    }

    public /* synthetic */ s(double d12, double d13, double d14, double d15, double d16, double d17, double d18, int i12, C42822w c42822w) {
        this(d12, d13, d14, d15, d16, (i12 & 32) != 0 ? 0.0d : d17, (i12 & 64) != 0 ? 0.0d : d18);
    }
}
