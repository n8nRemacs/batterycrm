package com.avito.android.newcars_mark_model_filter.analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import m30.C43872c;

/* compiled from: NewCarsBrandModelTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/analytics/b;", "Lcom/avito/android/newcars_mark_model_filter/analytics/a;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.newcars_mark_model_filter.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f207254a;

    /* compiled from: NewCarsBrandModelTracker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/analytics/b$a;", "", "<init>", "()V", "", "BRAND_MODEL_FROM_SOURCE", "Ljava/lang/String;", "", "cid", "I", "filterBrandId", "filterBrandName", "filterModelId", "filterModelName", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f207254a = interfaceC28373a;
    }

    public final void a(@k List<Long> list, boolean z12) {
        this.f207254a.c(new C43872c(z12 ? 110000 : 110001, z12 ? "Марка" : "Модель", list));
    }
}
