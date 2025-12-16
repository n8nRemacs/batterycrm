package gm;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.campaigns_sale.network.remote.model.BonusInfo;
import com.avito.android.campaigns_sale.network.remote.model.HeaderTooltip;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SaleBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgm/a;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40704a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HeaderTooltip f396768a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HeaderTooltip f396769b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f396770c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f396771d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BonusInfo f396772e;

    public C40704a(@k HeaderTooltip headerTooltip, @k HeaderTooltip headerTooltip2, boolean z12, boolean z13, @l BonusInfo bonusInfo) {
        this.f396768a = headerTooltip;
        this.f396769b = headerTooltip2;
        this.f396770c = z12;
        this.f396771d = z13;
        this.f396772e = bonusInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40704a)) {
            return false;
        }
        C40704a c40704a = (C40704a) obj;
        return L.f(this.f396768a, c40704a.f396768a) && L.f(this.f396769b, c40704a.f396769b) && this.f396770c == c40704a.f396770c && this.f396771d == c40704a.f396771d && L.f(this.f396772e, c40704a.f396772e);
    }

    public final int hashCode() {
        int i12 = r.i(r.i((this.f396769b.hashCode() + (this.f396768a.hashCode() * 31)) * 31, 31, this.f396770c), 31, this.f396771d);
        BonusInfo bonusInfo = this.f396772e;
        return i12 + (bonusInfo == null ? 0 : bonusInfo.hashCode());
    }

    @k
    public final String toString() {
        return "Info(discountTooltip=" + this.f396768a + ", itemsTooltip=" + this.f396769b + ", isParticipant=" + this.f396770c + ", isTerminated=" + this.f396771d + ", bonusInfo=" + this.f396772e + ')';
    }

    public /* synthetic */ C40704a(HeaderTooltip headerTooltip, HeaderTooltip headerTooltip2, boolean z12, boolean z13, BonusInfo bonusInfo, int i12, C42822w c42822w) {
        this(headerTooltip, headerTooltip2, z12, z13, (i12 & 16) != 0 ? null : bonusInfo);
    }
}
