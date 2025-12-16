package com.avito.android.publish.analytics.events;

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

/* compiled from: CommissionInfoSeenEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/analytics/events/CommissionInfoSeenEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Source", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CommissionInfoSeenEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f232220b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommissionInfoSeenEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/events/CommissionInfoSeenEvent$Source;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Source {

        /* renamed from: c, reason: collision with root package name */
        public static final Source f232221c;

        /* renamed from: d, reason: collision with root package name */
        public static final Source f232222d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Source[] f232223e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f232224f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f232225b;

        static {
            Source source = new Source("POSTING", 0, "posting");
            f232221c = source;
            Source source2 = new Source("EDIT", 1, "edit");
            f232222d = source2;
            Source[] sourceArr = {source, source2};
            f232223e = sourceArr;
            f232224f = c.a(sourceArr);
        }

        public Source(String str, int i12, String str2) {
            this.f232225b = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f232223e.clone();
        }
    }

    public CommissionInfoSeenEvent(@l Long l12, @l String str, float f12, @k Source source) {
        this.f232220b = new ParametrizedClickStreamEvent(7087, 3, C35755b0.c(P0.g(new Q("item_id", l12), new Q("esid", str), new Q("cpt_amount", Float.valueOf(f12)), new Q("trx_commission_info_source", source.f232225b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f232220b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f232220b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f232220b.f90248c;
    }
}
