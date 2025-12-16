package qf;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseSelectProductEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqf/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47392a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f429335b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f429336c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f429337d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f429338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429339f;

    public C47392a(@l String str, @l Long l12, @l Long l13, @l Long l14) {
        this.f429335b = l12;
        this.f429336c = l13;
        this.f429337d = l14;
        this.f429338e = str;
        this.f429339f = new ParametrizedClickStreamEvent(17217, 1, C35755b0.c(P0.g(new Q("from_block", l14), new Q("x_autoteka", str), new Q("autoteka_product_id", l12), new Q("autoteka_report_price", l13))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47392a)) {
            return false;
        }
        C47392a c47392a = (C47392a) obj;
        return L.f(this.f429335b, c47392a.f429335b) && L.f(this.f429336c, c47392a.f429336c) && L.f(this.f429337d, c47392a.f429337d) && L.f(this.f429338e, c47392a.f429338e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f429339f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429339f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f429339f.f90248c;
    }

    public final int hashCode() {
        Long l12 = this.f429335b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        Long l13 = this.f429336c;
        int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f429337d;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f429338e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaChoosingPurchaseSelectProductEvent(productId=");
        sb2.append(this.f429335b);
        sb2.append(", priceInCents=");
        sb2.append(this.f429336c);
        sb2.append(", fromBlock=");
        sb2.append(this.f429337d);
        sb2.append(", autotekaX=");
        return C22026a.c(sb2, this.f429338e, ')');
    }
}
