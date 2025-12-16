package com.avito.android.analytics;

import com.avito.android.validation.m1;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishValidationLogger.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/f0;", "Lcom/avito/android/validation/m1;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f90167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f90168b;

    @Inject
    public f0(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f90167a = interfaceC28373a;
        this.f90168b = c50213a;
    }

    @Override // com.avito.android.validation.m1
    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k LinkedHashMap linkedHashMap) {
        this.f90167a.c(new com.avito.android.analytics.events.l(str, linkedHashMap, this.f90168b, str2));
    }
}
