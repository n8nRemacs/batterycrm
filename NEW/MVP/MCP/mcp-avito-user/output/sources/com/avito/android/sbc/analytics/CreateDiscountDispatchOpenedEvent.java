package com.avito.android.sbc.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: CreateDiscountDispatchOpenedEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/analytics/CreateDiscountDispatchOpenedEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "From", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateDiscountDispatchOpenedEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f258809b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateDiscountDispatchOpenedEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/analytics/CreateDiscountDispatchOpenedEvent$From;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class From {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ From[] f258810b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f258811c;

        static {
            From[] fromArr = {new From()};
            f258810b = fromArr;
            f258811c = c.a(fromArr);
        }

        public static From valueOf(String str) {
            return (From) Enum.valueOf(From.class, str);
        }

        public static From[] values() {
            return (From[]) f258810b.clone();
        }
    }

    public CreateDiscountDispatchOpenedEvent(@k String str) {
        From[] fromArr = From.f258810b;
        this.f258809b = new ParametrizedClickStreamEvent(2788, 1, "Открытие попапа продвижения объявления (Performance VAS)", P0.e(new Q("iid", str), new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "fromProfileAdvertisement")));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f258809b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f258809b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f258809b.f90248c;
    }
}
