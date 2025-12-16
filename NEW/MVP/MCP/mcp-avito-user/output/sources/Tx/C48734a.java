package tx;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ResidentialComplexArgs.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltx/a;", "", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48734a {

    /* renamed from: a, reason: collision with root package name */
    public final double f439666a;

    /* renamed from: b, reason: collision with root package name */
    public final double f439667b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<SelectParameter.Value> f439668c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f439669d;

    public C48734a(double d12, double d13, @l List<SelectParameter.Value> list, boolean z12) {
        this.f439666a = d12;
        this.f439667b = d13;
        this.f439668c = list;
        this.f439669d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48734a)) {
            return false;
        }
        C48734a c48734a = (C48734a) obj;
        return Double.compare(this.f439666a, c48734a.f439666a) == 0 && Double.compare(this.f439667b, c48734a.f439667b) == 0 && L.f(this.f439668c, c48734a.f439668c) && this.f439669d == c48734a.f439669d;
    }

    public final int hashCode() {
        int iD2 = e.d(Double.hashCode(this.f439666a) * 31, 31, this.f439667b);
        List<SelectParameter.Value> list = this.f439668c;
        return Boolean.hashCode(this.f439669d) + ((iD2 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResidentialComplexArgs(lat=");
        sb2.append(this.f439666a);
        sb2.append(", lng=");
        sb2.append(this.f439667b);
        sb2.append(", values=");
        sb2.append(this.f439668c);
        sb2.append(", useButtonItem=");
        return r.x(sb2, this.f439669d, ')');
    }

    public /* synthetic */ C48734a(double d12, double d13, List list, boolean z12, int i12, C42822w c42822w) {
        this(d12, d13, list, (i12 & 8) != 0 ? true : z12);
    }
}
