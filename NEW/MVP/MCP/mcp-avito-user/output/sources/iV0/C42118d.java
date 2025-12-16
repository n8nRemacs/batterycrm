package iv0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProjectBuyer.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liv0/d;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iv0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C42118d {

    /* renamed from: a, reason: collision with root package name */
    public final long f405380a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405381b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f405382c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f405383d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Image> f405384e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ArrayList f405385f;

    public C42118d(long j12, @k String str, @l String str2, @k String str3, @k List list, @l ArrayList arrayList) {
        this.f405380a = j12;
        this.f405381b = str;
        this.f405382c = str2;
        this.f405383d = str3;
        this.f405384e = list;
        this.f405385f = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42118d)) {
            return false;
        }
        C42118d c42118d = (C42118d) obj;
        return this.f405380a == c42118d.f405380a && this.f405381b.equals(c42118d.f405381b) && L.f(this.f405382c, c42118d.f405382c) && this.f405383d.equals(c42118d.f405383d) && this.f405384e.equals(c42118d.f405384e) && L.f(this.f405385f, c42118d.f405385f);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f405380a) * 31, 31, this.f405381b);
        String str = this.f405382c;
        int iE2 = H.e(H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f405383d), 31, this.f405384e);
        ArrayList arrayList = this.f405385f;
        return iE2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProjectBuyer(id=");
        sb2.append(this.f405380a);
        sb2.append(", title=");
        sb2.append(this.f405381b);
        sb2.append(", priceText=");
        sb2.append(this.f405382c);
        sb2.append(", description=");
        sb2.append(this.f405383d);
        sb2.append(", images=");
        sb2.append(this.f405384e);
        sb2.append(", actions=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f405385f, ')');
    }
}
