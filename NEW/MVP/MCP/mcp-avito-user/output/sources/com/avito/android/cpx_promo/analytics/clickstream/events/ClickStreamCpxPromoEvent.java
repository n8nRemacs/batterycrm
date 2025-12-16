package com.avito.android.cpx_promo.analytics.clickstream.events;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClickStreamCpxPromoEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/analytics/clickstream/events/ClickStreamCpxPromoEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "CpxPromoBidType", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClickStreamCpxPromoEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f126799b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClickStreamCpxPromoEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/analytics/clickstream/events/ClickStreamCpxPromoEvent$CpxPromoBidType;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CpxPromoBidType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ CpxPromoBidType[] f126800b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f126801c;

        static {
            CpxPromoBidType[] cpxPromoBidTypeArr = {new CpxPromoBidType("AUTO", 0), new CpxPromoBidType("MANUAL", 1)};
            f126800b = cpxPromoBidTypeArr;
            f126801c = c.a(cpxPromoBidTypeArr);
        }

        public static CpxPromoBidType valueOf(String str) {
            return (CpxPromoBidType) Enum.valueOf(CpxPromoBidType.class, str);
        }

        public static CpxPromoBidType[] values() {
            return (CpxPromoBidType[]) f126800b.clone();
        }
    }

    public ClickStreamCpxPromoEvent(int i12, int i13, @k String str, @l Boolean bool, @k Map<String, ? extends Object> map) {
        String str2;
        Q q12 = new Q("iid", str);
        if (L.f(bool, Boolean.TRUE)) {
            CpxPromoBidType[] cpxPromoBidTypeArr = CpxPromoBidType.f126800b;
            str2 = "auto";
        } else if (L.f(bool, Boolean.FALSE)) {
            CpxPromoBidType[] cpxPromoBidTypeArr2 = CpxPromoBidType.f126800b;
            str2 = "manual";
        } else {
            str2 = null;
        }
        this.f126799b = new ParametrizedClickStreamEvent(i12, i13, P0.k(map, C35755b0.c(P0.g(q12, new Q("bid_type", str2)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f126799b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f126799b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f126799b.f90248c;
    }

    public /* synthetic */ ClickStreamCpxPromoEvent(int i12, int i13, String str, Boolean bool, Map map, int i14, C42822w c42822w) {
        this(i12, i13, str, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? P0.c() : map);
    }
}
