package M00;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalFormAnalyticsEvent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {
    @l
    public static final com.avito.android.analytics.provider.clickstream.b a(@k String str, @k R00.b bVar) {
        switch (str.hashCode()) {
            case -1617835944:
                if (str.equals("landCost")) {
                    return new com.avito.android.analytics.provider.clickstream.b(11087, 0);
                }
                return null;
            case -1412352295:
                if (str.equals("purposeId")) {
                    return new com.avito.android.analytics.provider.clickstream.b(8640, 2);
                }
                return null;
            case -1184259671:
                if (str.equals("income")) {
                    return new com.avito.android.analytics.provider.clickstream.b(8649, 2);
                }
                return null;
            case -865005758:
                if (!str.equals("propertyCost")) {
                    return null;
                }
                P00.a aVar = bVar.f14056b.get("purposeId");
                return L.f(aVar != null ? aVar.getF12770a() : null, "building_house") ? new com.avito.android.analytics.provider.clickstream.b(11086, 0) : new com.avito.android.analytics.provider.clickstream.b(8642, 2);
            case -690339025:
                if (str.equals("regionId")) {
                    return new com.avito.android.analytics.provider.clickstream.b(8641, 2);
                }
                return null;
            case -669807868:
                if (str.equals("downPayment")) {
                    return new com.avito.android.analytics.provider.clickstream.b(8643, 2);
                }
                return null;
            case -564314363:
                if (str.equals("creditTerm")) {
                    return new com.avito.android.analytics.provider.clickstream.b(8644, 2);
                }
                return null;
            case -105166908:
                if (str.equals("proofOfIncome")) {
                    return new com.avito.android.analytics.provider.clickstream.b(10915, 1);
                }
                return null;
            case 96511:
                if (str.equals("age")) {
                    return new com.avito.android.analytics.provider.clickstream.b(10913, 1);
                }
                return null;
            case 859058115:
                if (str.equals("currentExperience")) {
                    return new com.avito.android.analytics.provider.clickstream.b(10914, 1);
                }
                return null;
            case 1615358283:
                if (str.equals("occupation")) {
                    return new com.avito.android.analytics.provider.clickstream.b(8648, 2);
                }
                return null;
            default:
                return null;
        }
    }
}
