package com.avito.android.profile_settings_extended.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileAddCarouselEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileAddCarouselEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "Scenario", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExtendedProfileAddCarouselEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f229972c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f229973b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileAddCarouselEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileAddCarouselEvent$Scenario;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scenario {

        /* renamed from: c, reason: collision with root package name */
        public static final Scenario f229974c;

        /* renamed from: d, reason: collision with root package name */
        public static final Scenario f229975d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Scenario[] f229976e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f229977f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229978b;

        static {
            Scenario scenario = new Scenario("ADD", 0, "add");
            f229974c = scenario;
            Scenario scenario2 = new Scenario("EDIT", 1, "edit");
            f229975d = scenario2;
            Scenario[] scenarioArr = {scenario, scenario2};
            f229976e = scenarioArr;
            f229977f = c.a(scenarioArr);
        }

        public Scenario(String str, int i12, String str2) {
            this.f229978b = str2;
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) f229976e.clone();
        }
    }

    /* compiled from: ExtendedProfileAddCarouselEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileAddCarouselEvent$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ExtendedProfileAddCarouselEvent(Scenario scenario, C42822w c42822w) {
        this.f229973b = new ParametrizedClickStreamEvent(5946, 2, "ext_profile_add_window", Collections.singletonMap("window_scenario", scenario.f229978b));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF100588b() {
        return this.f229973b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f229973b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF100589c() {
        return this.f229973b.f90248c;
    }
}
