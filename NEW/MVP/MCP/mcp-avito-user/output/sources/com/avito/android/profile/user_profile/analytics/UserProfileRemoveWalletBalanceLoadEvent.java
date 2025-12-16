package com.avito.android.profile.user_profile.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.enums.c;

/* compiled from: UserProfileRemoveWalletBalanceLoadEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/analytics/UserProfileRemoveWalletBalanceLoadEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FlowType", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UserProfileRemoveWalletBalanceLoadEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f224284b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfileRemoveWalletBalanceLoadEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/analytics/UserProfileRemoveWalletBalanceLoadEvent$FlowType;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FlowType {

        /* renamed from: c, reason: collision with root package name */
        public static final FlowType f224285c;

        /* renamed from: d, reason: collision with root package name */
        public static final FlowType f224286d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ FlowType[] f224287e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f224288f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f224289b;

        static {
            FlowType flowType = new FlowType("NEW_WALLET", 0, "new_wallet");
            f224285c = flowType;
            FlowType flowType2 = new FlowType("NEW_AND_OLD_WALLET", 1, "new_and_old_wallet");
            f224286d = flowType2;
            FlowType[] flowTypeArr = {flowType, flowType2};
            f224287e = flowTypeArr;
            f224288f = c.a(flowTypeArr);
        }

        public FlowType(String str, int i12, String str2) {
            this.f224289b = str2;
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) f224287e.clone();
        }
    }

    public UserProfileRemoveWalletBalanceLoadEvent(@k FlowType flowType, @l Integer num) {
        d dVar = new d();
        dVar.put("wallet_flow_type", flowType.f224289b);
        if (num != null) {
            dVar.put("wallet_withdrawal_amount", Integer.valueOf(num.intValue()));
        }
        G0 g02 = G0.f406611a;
        this.f224284b = new ParametrizedClickStreamEvent(15194, 0, dVar.b(), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f224284b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f224284b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f224284b.f90248c;
    }
}
