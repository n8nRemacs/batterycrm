package com.avito.android.authorization.event;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: AuthWarningPhoneInOtherAccEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/event/AuthWarningPhoneInOtherAccEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Source", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuthWarningPhoneInOtherAccEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Source f93831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f93832c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthWarningPhoneInOtherAccEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/event/AuthWarningPhoneInOtherAccEvent$Source;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Source {

        /* renamed from: c, reason: collision with root package name */
        public static final Source f93833c;

        /* renamed from: d, reason: collision with root package name */
        public static final Source f93834d;

        /* renamed from: e, reason: collision with root package name */
        public static final Source f93835e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Source[] f93836f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f93837g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f93838b;

        static {
            Source source = new Source("REGULAR", 0, "reg");
            f93833c = source;
            Source source2 = new Source("SOCIAL", 1, "soc_auth");
            f93834d = source2;
            Source source3 = new Source("AUTO_RECOVERY", 2, "autorecovery_scenario");
            f93835e = source3;
            Source[] sourceArr = {source, source2, source3};
            f93836f = sourceArr;
            f93837g = c.a(sourceArr);
        }

        public Source(String str, int i12, String str2) {
            this.f93838b = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f93836f.clone();
        }
    }

    public AuthWarningPhoneInOtherAccEvent(@k Source source) {
        this.f93831b = source;
        this.f93832c = new ParametrizedClickStreamEvent(5558, 0, Collections.singletonMap(SearchParamsConverterKt.SOURCE, source.f93838b), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthWarningPhoneInOtherAccEvent) && this.f93831b == ((AuthWarningPhoneInOtherAccEvent) obj).f93831b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f93832c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f93832c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f93832c.f90248c;
    }

    public final int hashCode() {
        return this.f93831b.hashCode();
    }

    @k
    public final String toString() {
        return "AuthWarningPhoneInOtherAccEvent(src=" + this.f93831b + ')';
    }
}
