package com.avito.android.serp.adapter.constructor;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpDisplayTypeKt;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import javax.inject.Inject;
import kotlin.Metadata;
import vN.C49237a;

/* compiled from: TargetButtonsAnalyticsTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/F;", "Lcom/avito/android/serp/adapter/constructor/E;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f269447a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.statsd.F f269448b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C49237a f269449c;

    @Inject
    public F(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.statsd.F f12, @Y61.k C49237a c49237a) {
        this.f269447a = interfaceC28373a;
        this.f269448b = f12;
        this.f269449c = c49237a;
    }

    @Override // com.avito.android.serp.adapter.constructor.E
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        C49237a c49237a = this.f269449c;
        c49237a.getClass();
        kotlin.reflect.n<Object> nVar = C49237a.f440707l[9];
        if (((Boolean) c49237a.f440717j.a().invoke()).booleanValue()) {
            this.f269447a.c(new y.a(this.f269448b.a("targetButtons", NotificationsSettings.Section.SECTION_DELIVERY, SerpDisplayTypeKt.toParameterValue(serpDisplayType), "show", "{{%app_ver%}}").f91030a, 1L));
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.E
    public final void b(@Y61.k SerpDisplayType serpDisplayType) {
        C49237a c49237a = this.f269449c;
        c49237a.getClass();
        kotlin.reflect.n<Object> nVar = C49237a.f440707l[9];
        if (((Boolean) c49237a.f440717j.a().invoke()).booleanValue()) {
            this.f269447a.c(new y.a(this.f269448b.a("targetButtons", "phone", SerpDisplayTypeKt.toParameterValue(serpDisplayType), "click", "{{%app_ver%}}").f91030a, 1L));
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.E
    public final void c(@Y61.k SerpDisplayType serpDisplayType) {
        C49237a c49237a = this.f269449c;
        c49237a.getClass();
        kotlin.reflect.n<Object> nVar = C49237a.f440707l[9];
        if (((Boolean) c49237a.f440717j.a().invoke()).booleanValue()) {
            this.f269447a.c(new y.a(this.f269448b.a("targetButtons", NotificationsSettings.Section.SECTION_DELIVERY, SerpDisplayTypeKt.toParameterValue(serpDisplayType), "click", "{{%app_ver%}}").f91030a, 1L));
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.E
    public final void d(@Y61.k SerpDisplayType serpDisplayType) {
        C49237a c49237a = this.f269449c;
        c49237a.getClass();
        kotlin.reflect.n<Object> nVar = C49237a.f440707l[9];
        if (((Boolean) c49237a.f440717j.a().invoke()).booleanValue()) {
            this.f269447a.c(new y.a(this.f269448b.a("targetButtons", "phone", SerpDisplayTypeKt.toParameterValue(serpDisplayType), "show", "{{%app_ver%}}").f91030a, 1L));
        }
    }
}
